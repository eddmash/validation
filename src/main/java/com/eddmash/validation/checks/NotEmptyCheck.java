package com.eddmash.validation.checks;
/*
 * This file is part of the androidcomponents package.
 *
 * (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
 *
 * For the full copyright and license information, please editText the LICENSE
 * file that was distributed with this source code.
 */

import android.util.Log;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Ensure the view if not blank.
 * <p>
 * NOTE:: This will only check if the value is an empty string "", it will pass if the value is
 * "0" you can use {@link GTCheck} or "false"
 *
 * .
 */
public class NotEmptyCheck extends CheckSingle {

    protected EditText editText;
    protected Spinner spinner;
    protected CompoundButton compoundButton;

    protected String errorMessage;

    public NotEmptyCheck(EditText editText, String errorMessage) {
        this.editText = editText;
        this.errorMessage = errorMessage;
    }

    public NotEmptyCheck(Spinner spinner, String errorMessage) {
        this.spinner = spinner;
        this.errorMessage = errorMessage;
    }

    public NotEmptyCheck(CompoundButton compoundButton, String errorMessage) {
        this.compoundButton = compoundButton;
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean run() {
        return !getValue().trim().isEmpty();
    }

    /**
     * Gets the editText we are working on.
     *
     * @return
     */
    @Override
    protected TextView getView() {
        TextView v = editText;
        if (spinner != null) {
            Log.e(getClass().getSimpleName(), " SELECTED " + spinner.getSelectedView());
            v = (TextView) spinner.getSelectedView();
        }

        if (compoundButton != null) {
            v = compoundButton;
        }
        return v;
    }

    @Override
    public String getValue() {
        String value = "";

        if (spinner != null) {
            int selectedItemOfMySpinner = spinner.getSelectedItemPosition();
            if (spinner.getItemAtPosition(selectedItemOfMySpinner) == null) {
                value = "";
            } else {
                value = String.valueOf(spinner.getItemAtPosition(selectedItemOfMySpinner));
            }
        } else if (compoundButton != null) {
            if (compoundButton.isChecked()) {
                return "true";
            }
            return "";
        } else {
            value = String.valueOf(editText.getText());
        }
        return value;
    }

    @Override
    public String getErrorMsg() {
        return errorMessage;
    }

}
