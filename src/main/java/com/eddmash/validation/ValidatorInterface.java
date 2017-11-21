package com.eddmash.validation;
/*
* This file is part of the com.eddmash.validation package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import com.eddmash.validation.checks.ValidationCheck;
import com.google.common.collect.Range;

import java.util.List;
import java.util.Map;

/**
 * Class that is responsible for going through validation checks and determine if they are valid.
 */
public interface ValidatorInterface {

    /**
     * Validates and edit box.
     *
     * @param view     the view to validate
     * @param pattern  the condition to validate on the view
     * @param errorMsg the error message to produce on validation fail
     */
    void setValidation(EditText view, String pattern, String errorMsg);
    /**
     * Validates and edit box.
     *
     * @param view     the view to validate
     * @param pattern  the condition to validate on the view
     * @param errorMsg the error message to produce on validation fail
     */
    void setValidation(int view, String pattern, String errorMsg);

    /**
     * Validates a view againsts the given context
     *
     * @param view
     * @param pattern
     * @param errorMsg
     */
    void setValidation(int view, String pattern, int errorMsg);

    /**
     * Does the actual validation.
     *
     * @return boolean true of valid
     */
    boolean validate();

    /**
     * Validates Spinners
     * @param form_province
     * @param pattern
     * @param form_err_blank
     */
    void setSpinnerValidation(int form_province, String pattern, int form_err_blank);
    /**
     * Validates Spinners
     * @param form_province
     * @param pattern
     * @param form_err_blank
     */
    void setSpinnerValidation(int form_province, String pattern, String form_err_blank);
    /**
     * Validates Spinners
     * @param spinner
     * @param pattern
     * @param form_err_blank
     */
    void setSpinnerValidation(Spinner spinner, String pattern, int form_err_blank);
    void setSpinnerValidation(Spinner spinner, String pattern, String form_err_blank);

    /**
     * Remove view from being validated.
     *
     * @param id
     */
    void disableValidation(int id);
    /**
     * Remove view from being validated.
     *
     * @param view
     */
    void disableValidation(View view);
    /**
     * Remove view from being validated.
     *
     * @param view
     */
    void disableSpinnerValidation(View view);
    /**
     * Remove view from being validated.
     *
     * @param id
     */
    void disableSpinnerValidation(int id);

    /**
     * Add a validatorInterface object.
     *
     * @param validatorInterface
     */
    void addValidator(ValidatorInterface validatorInterface);



    void setValidation(EditText view, Range pattern, String errorMsg, boolean strict);


    void setValidation(int view, Range pattern, String errorMsg, boolean strict);

    /**
     * Adds validation checks to be enforced by a validator
     * @param validationCheck
     */
    void addCheck(ValidationCheck validationCheck);

    /**
     * disable validation check
     *
     * @param validationCheck the validation check to disable.
     */
    void disableCheck(ValidationCheck validationCheck);

    /**
     * Returns all error that the validator found as a HashMap.
     * with the key being tags if your passed in any when creating the validator otherwise all
     * errors are returned under the tag NON_SPECIFIC
     * <p>
     * the value of the HashMap consists an ArrayList of errors that relate to each tag
     *
     * @return Map
     */
    Map<String, List> getErrors();

    /**
     * Clear all the errors from the validator.
     *
     * maybe use when you have already run the validation onces and want to
     * run the validation again using the same ValidatorInterface instance
     */
    void clearErrors();
}
