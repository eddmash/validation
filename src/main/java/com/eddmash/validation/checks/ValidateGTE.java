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
 * Greater than
 */
public class ValidateGTE extends ValidateNotEmpty {
    private double max;

    public ValidateGTE(EditText view, String errorMessage, int max) {
        super(view, errorMessage);
        this.max = (double) max;
    }

    ValidateGTE(Spinner view, String errorMessage, int max) {
        super(view, errorMessage);
        this.max = (double) max;
    }

    public ValidateGTE(EditText view, String errorMessage, double max) {
        super(view, errorMessage);
        this.max = (double) max;
    }

    ValidateGTE(Spinner view, String errorMessage, double max) {
        super(view, errorMessage);
        this.max = (double) max;
    }

    @Override
    public boolean run() {
        errorMessage = errorMessage + " " + max;
        if (!super.run()) {
            return false;
        }
        if ((getView().getText() + "").trim().isEmpty()) {
            return true;
        }

        try {
            Double value = Double.valueOf(getView().getText() + "");

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
}