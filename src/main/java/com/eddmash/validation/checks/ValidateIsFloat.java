package com.eddmash.validation.checks;
/*
* This file is part of the com.eddmash.validation package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

import android.widget.EditText;
import android.widget.Spinner;

/**
 * Checks if the value is a float value
 */
public class ValidateIsFloat extends ValidationCallback {

    protected EditText view;
    protected String errorMessage;

    public ValidateIsFloat(EditText view, String errorMessage) {
        this.view = view;
        this.errorMessage = errorMessage;
    }

    ValidateIsFloat(Spinner view, String errorMessage) {
        this.view = (EditText) view.getSelectedView();
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean run() {
        String value = view.getText() + "";
        view.setError(null);
        try {
            Float.parseFloat(value);
        } catch (Exception e) {
            view.setError(errorMessage);
            return false;
        }
        return true;
    }


    @Override
    public String getErrorMsg() {
        return errorMessage;
    }
}
