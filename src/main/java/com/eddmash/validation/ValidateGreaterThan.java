package com.eddmash.validation;
/*
* This file is part of the com.eddmash.validation package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

import android.util.Log;
import android.widget.EditText;
import android.widget.Spinner;

import com.eddmash.validation.checks.ValidateNotEmpty;

public class ValidateGreaterThan extends ValidateNotEmpty {
    protected int max;

    public ValidateGreaterThan(EditText view, String errorMessage, int max) {
        super(view, errorMessage);
        this.max = max;
    }

    ValidateGreaterThan(Spinner view, String errorMessage, int max) {
        super(view, errorMessage);
        this.max = max;
    }

    @Override
    public boolean run() {
        errorMessage = errorMessage + " " + max;
        if (!super.run()) {
            return false;
        }
        if ((view.getText() + "").trim().isEmpty()) {
            return true;
        }
        Log.e("VALA", view.getText() + "");
        try {
            Integer value = Integer.valueOf(view.getText() + "");

            if (value <= max) {
                errorMessage = errorMessage + " " + max;
                return false;
            }
        } catch (Exception e) {
            Log.e(getClass().getName(), "ERROR :: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }


    @Override
    public String getErrorMsg() {
        return errorMessage;
    }
}
