package com.eddmash.validation;
/*
* This file is part of the com.eddmash.validation package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.eddmash.validation.checks.ValidationCheck;
import com.eddmash.validation.utils.NumericRange;
import com.google.common.collect.Range;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Performs view validation.
 */
public class Validator implements ValidationListener {
    public static final String NOT_EMPTY = "(?m)^\\s*\\S+[\\s\\S]*$";
    public static final String TELEPHONE = "(^\\+\\d+)?[0-9\\s()-]*";
    private String _tag = "NON_SPECIFIC";
    List<ValidationListener> _validators = new ArrayList<>();
    List<Map> spinnerValidationList = new ArrayList<>();
    List<Map> edittextValidationList = new ArrayList<>();
    Activity context;

    private HashMap<String, List> errors;
    private Map<String, List> errorsCustomErrorsMsg = new HashMap<>();
    private List<ValidationCheck> checkList;

    public Validator(Activity context) {
        this.context = context;
        errors = new HashMap<>();
        checkList = new ArrayList<>();
    }

    public Validator(String tag, Activity context) {
        this(context);
        this._tag = tag;
    }

    /**
     * Returns all error that the validator found as a HashMap.
     * with the key being tags if your passed in any when creating the validator otherwise all
     * errors are returned under the tag NON_SPECIFIC
     * <p>
     * the value of the HashMap consists an ArrayList of errors that relate to each tag
     *
     * @return
     */
    public HashMap<String, List> getErrors() {
        for (Object key : errorsCustomErrorsMsg.keySet()) {
            if (errors.containsKey(key)) {
                List values = errors.get(key);
                values.addAll(errorsCustomErrorsMsg.get(key));
                errors.put(key + "", values);
            } else {
                errors.put(key + "", errorsCustomErrorsMsg.get(key));
            }
        }
        return errors;
    }

    /**
     * Gets a list of errors for a specific tag.
     *
     * @param tag
     * @return
     */
    public List getErrorsByTag(String tag) {
        if (getErrors().containsKey(tag)) {
            return getErrors().get(tag);
        }
        return new ArrayList();
    }


    @Override
    public void addValidator(ValidationListener validator) {
        _validators.add(validator);
    }


    @Override
    public void addCheck(ValidationCheck validationCheck) {
        checkList.add(validationCheck);
    }

    public void setValidation(EditText view, Range pattern, String errorMsg, boolean strict) {
        Map validate = new HashMap();
        validate.put("view", view);
        validate.put("pattern", new NumericRange(pattern));
        validate.put("error", errorMsg);
        validate.put("strict", strict);
        edittextValidationList.add(validate);
    }


    public void setValidation(int view, Range pattern, String errorMsg, boolean strict) {
        Map validate = new HashMap();
        validate.put("view", view);
        validate.put("pattern", new NumericRange(pattern));
        validate.put("error", errorMsg);
        validate.put("strict", strict);
        edittextValidationList.add(validate);
    }

    public void setValidation(EditText view, String pattern, String errorMsg) {
        Map validate = new HashMap<>();
        validate.put("view", view);
        validate.put("pattern", Pattern.compile(pattern));
        validate.put("error", errorMsg);
        edittextValidationList.add(validate);
    }

    public void setValidation(int view, String pattern, String errorMsg) {
        Map<String, Object> validate = new HashMap<>();
        validate.put("view", view);
        validate.put("pattern", Pattern.compile(pattern));
        validate.put("error", errorMsg);
        edittextValidationList.add(validate);
    }

    private boolean checkRangeField(NumericRange numericRange, String value, boolean strict) {

        boolean valid;

        if (!strict && value.trim().isEmpty()) {
            return true;
        }
        try {
            valid = numericRange.isValid(value);
        } catch (NumberFormatException var5) {
            valid = false;
        }

        if (!valid) {
            Matcher var4 = Pattern.compile("±*").matcher(value);
            return false;
        } else {
            return true;
        }
    }

    public void setValidation(int view, String pattern, int errorMsg) {
        Map validate = new HashMap<>();
        validate.put("view", view);
        validate.put("pattern", Pattern.compile(pattern));
        validate.put("error", errorMsg);
        edittextValidationList.add(validate);
    }

    @Override
    public boolean validate() {
        clearErrors();
        Log.e(getClass().getName(), "VALIDATING =  " + this.hashCode());
        List viewErros = validateSpinners();
        viewErros.addAll(validateEditView());
        viewErros.addAll(validateChecks());
        viewErros = new ArrayList(new HashSet(viewErros));
        Log.e("ERRORs", viewErros + "");
        Collections.sort(viewErros);
        errors.put(_tag, viewErros);

        boolean validators = validateValidators();

        return validators && viewErros.size() == 0 && errorsCustomErrorsMsg.size() == 0;
    }

    private String getTag() {
        return _tag;
    }

    public void setSpinnerValidation(int form_province, String pattern, int form_err_blank) {
        Map validate = new HashMap<>();
        validate.put("view", form_province);
        validate.put("pattern", Pattern.compile(pattern));
        validate.put("error", form_err_blank);
        spinnerValidationList.add(validate);
    }

    public void setSpinnerValidation(int form_province, String pattern, String form_err_blank) {
        Map validate = new HashMap<>();
        validate.put("view", form_province);
        validate.put("pattern", Pattern.compile(pattern));
        validate.put("error", form_err_blank);
        spinnerValidationList.add(validate);
    }

    public void setSpinnerValidation(Spinner spinner, String pattern, int form_err_blank) {
        Map validate = new HashMap<>();
        validate.put("view", spinner);
        validate.put("pattern", Pattern.compile(pattern));
        validate.put("error", form_err_blank);
        spinnerValidationList.add(validate);
    }

    public void setSpinnerValidation(Spinner spinner, String pattern, String form_err_blank) {
        Map validate = new HashMap<>();
        validate.put("view", spinner);
        validate.put("pattern", Pattern.compile(pattern));
        validate.put("error", form_err_blank);
        spinnerValidationList.add(validate);
    }

    public void disableValidation(int id) {
        removeValidationItem(id);
    }

    public void disableValidation(View view) {
        removeValidationItem(view);
    }

    public void disableSpinnerValidation(View view) {
        removeValidationSpinnerItem(view);
    }

    public void disableSpinnerValidation(int id) {
        removeValidationSpinnerItem(id);
    }

    public void disableCheck(ValidationCheck validationCheck){
        removeCheck(validationCheck);
    }

    private void removeValidationSpinnerItem(int id) {
        int viewId;
        // we copy here to avoid ConcurrentModificationException issues
        List<Map> spinnerItems = new ArrayList<>(spinnerValidationList);

        for (Map validate : spinnerItems) {
            if (validate.get("view") instanceof Spinner) {
                viewId = ((Spinner) validate.get("view")).getId();
            } else {
                viewId = Integer.valueOf(validate.get("view").toString());
            }
            if (id == viewId) {
                spinnerValidationList.remove(validate);
            }
        }

    }

    private void removeValidationSpinnerItem(View removeView) {
        Spinner view;
        // we copy here to avoid ConcurrentModificationException issues
        List<Map> spinnerItems = new ArrayList<>(spinnerValidationList);

        for (Map validate : spinnerItems) {
            if (validate.get("view") instanceof Spinner) {
                view = ((Spinner) validate.get("view"));
            } else {
                view = (Spinner) context.findViewById(Integer.valueOf(validate.get("view").toString()));
            }
            if (removeView == view) {
                TextView errorText = (TextView) view.getSelectedView();
                errorText.setError(null);
                spinnerValidationList.remove(validate);
            }
        }

    }

    private void removeValidationItem(int id) {

        EditText view;
        List<Map> edittextITems = new ArrayList<>(edittextValidationList);

        for (Map validate : edittextITems) {
            if (validate.get("view") instanceof View) {
                view = ((EditText) validate.get("view"));
            } else {
                view = (EditText) context.findViewById(Integer.valueOf(validate.get("view").toString()));
            }
            view.setError(null);

            if (id == view.getId()) {
                edittextValidationList.remove(validate);
            }
        }

    }

    private void removeValidationItem(View removeView) {
        EditText view;
        List<Map> edittextITems = new ArrayList<>(edittextValidationList);

        for (Map validate : edittextITems) {
            if (validate.get("view") instanceof View) {
                view = ((EditText) validate.get("view"));
            } else {
                view = (EditText) context.findViewById(Integer.valueOf(validate.get("view").toString()));
            }
            view.setError(null);

            if (removeView == view) {
                edittextValidationList.remove(validate);
            }
        }

    }

    private void removeCheck(ValidationCheck validationCheck) {

        if (checkList.contains(validationCheck)) {
            checkList.remove(validationCheck);
        }
    }

    public List<String> validateChecks() {

        String errMsg;
        List<String> serrors = new ArrayList<>();
        for (ValidationCheck validationCheck : checkList) {

            if (!validationCheck.run()) {
                errMsg = validationCheck.getErrorMsg();
                validationCheck.setError(errMsg);
                serrors.add(errMsg);
            }
        }
        return serrors;
    }

    /**
     * VAlidates Spinners
     *
     * @return
     */
    public List<String> validateSpinners() {
        Pattern pattern;
        Matcher m;
        List<String> serrors = new ArrayList<>();
        Spinner view;
        Log.e(getClass().getName(), "VALIDATING SPINERS");
        if (spinnerValidationList.size() == 0) {
            return serrors;
        }
        String errMsg = "";

        for (Map validate : spinnerValidationList) {

            if (validate.get("view") instanceof Spinner) {
                view = (Spinner) validate.get("view");
            } else {
                int viewId = Integer.valueOf(validate.get("view") + "");
                view = (Spinner) context.findViewById(viewId);
            }

            if (validate.containsKey("error")) {
                if (validate.get("error") instanceof String) {
                    errMsg = validate.get("error").toString();
                } else {
                    errMsg = context.getString(Integer.valueOf(validate.get("error") + ""));
                }
            }
            String value = view.getSelectedItem() + "";

            if (validate.get("pattern") instanceof Pattern) {
                pattern = (Pattern) validate.get("pattern");
                m = pattern.matcher(value);
                if (!m.matches()) {
                    TextView errorText = (TextView) view.getSelectedView();
                    errorText.setError(errMsg);
                    serrors.add(errMsg);
                }
            }

            if (validate.get("pattern") instanceof NumericRange) {
                NumericRange numericRange = (NumericRange) validate.get("pattern");
                boolean strict = (boolean) validate.get("strict");
                if (!checkRangeField(numericRange, value, strict)) {
                    TextView errorText = (TextView) view.getSelectedView();
                    errorText.setError(errMsg);
                    serrors.add(errMsg);
                }
            }
        }

        return serrors;
    }

    /**
     * VAlidates Views
     *
     * @return
     */
    public List validateEditView() {
        Pattern pattern;
        List<String> serrors = new ArrayList<>();
        Matcher m;
        EditText view;
        String message = "";
        String label = "";

        if (edittextValidationList.size() == 0) {
            return serrors;
        }
        for (Map validate : edittextValidationList) {
            message = "";
            if (validate.get("view") instanceof View) {
                view = (EditText) validate.get("view");
            } else {

                view = (EditText) context.findViewById(
                        Integer.valueOf(validate.get("view").toString()));

            }

            if (validate.containsKey("error")) {
                if (validate.get("error") instanceof String) {
                    message = validate.get("error").toString();
                } else {
                    message = context.getString(Integer.valueOf(validate.get("error") + ""));
                }
            }

            if (validate.get("pattern") instanceof Pattern) {
                pattern = (Pattern) validate.get("pattern");
                m = pattern.matcher(view.getText());
                if (!m.matches()) {
                    view.setError(message);
                    serrors.add(message);
                }
            }

            if (validate.get("pattern") instanceof NumericRange) {

                boolean strict = (boolean) validate.get("strict");
                NumericRange numericRange = (NumericRange) validate.get("pattern");
                if (!checkRangeField(numericRange, view.getText() + "", strict)) {
                    serrors.add(message);
                    view.setError(message);
                }
            }
        }

        return serrors;
    }


    private boolean validateValidators() {
        boolean status = true;
        boolean validatorStatus;
        Validator validator;

        for (ValidationListener v : _validators) {
            validator = (Validator) v;
            validatorStatus = v.validate();
            if (!validatorStatus) {
                errors.putAll(validator.getErrors());
                status = false;
            }
        }
        return status;
    }

    public void addCustomErrorsMsg(String string, List errorMessages) {
        if (errorsCustomErrorsMsg.containsKey(string)) {
            this.errorsCustomErrorsMsg.get(string).addAll(errorMessages);
        } else {
            this.errorsCustomErrorsMsg.put(string, errorMessages);
        }
    }

    public void clearErrors() {
        errorsCustomErrorsMsg.clear();
        errors.clear();
    }

    @Override
    public String toString() {
        return "{ " + _tag + " = [" + spinnerValidationList + ", "
                + edittextValidationList + ", " + errorsCustomErrorsMsg + "] }";
    }

}
