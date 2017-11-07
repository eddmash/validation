package com.eddmash.validation.checks;
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

/**
 * Less than or equal to
 */
public class ValidateLTE extends ValidateNotEmpty {
    private double min;

    public ValidateLTE(EditText view, String errorMessage, int min) {
        super(view, errorMessage);
        this.min = (double) min;
    }

    ValidateLTE(Spinner view, String errorMessage, int min) {
        super(view, errorMessage);
        this.min = (double) min;
    }

    public ValidateLTE(EditText view, String errorMessage, double min) {
        super(view, errorMessage);
        this.min = (double) min;
    }

    ValidateLTE(Spinner view, String errorMessage, double min) {
        super(view, errorMessage);
        this.min = (double) min;
    }

    @Override
    public boolean run() {
        errorMessage = errorMessage + " " + min;
        if (!super.run()) {
            return false;
        }
        if ((getView().getText() + "").trim().isEmpty()) {
            return true;
        }

        try {
            Integer value = Integer.valueOf(getView().getText() + "");

            if (value >= min) {
                errorMessage = errorMessage + " " + min;
                return false;
            }
        } catch (Exception e) {
            Log.e(getClass().getName(), "ERROR :: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
