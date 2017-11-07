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
 * Less than
 */
public class ValidateEqual extends ValidateNotEmpty {
    private double valToEquate;

    public ValidateEqual(EditText view, String errorMessage, int valToEquate) {
        super(view, errorMessage);
        this.valToEquate = (double) valToEquate;
    }

    ValidateEqual(Spinner view, String errorMessage, int valToEquate) {
        super(view, errorMessage);
        this.valToEquate = (double) valToEquate;
    }

    public ValidateEqual(EditText view, String errorMessage, double valToEquate) {
        super(view, errorMessage);
        this.valToEquate = (double) valToEquate;
    }

    ValidateEqual(Spinner view, String errorMessage, double valToEquate) {
        super(view, errorMessage);
        this.valToEquate = (double) valToEquate;
    }

    @Override
    public boolean run() {
        errorMessage = errorMessage + " " + valToEquate;
        if (!super.run()) {
            return false;
        }
        if ((getView().getText() + "").trim().isEmpty()) {
            return true;
        }
        try {
            Double value = Double.valueOf(getView().getText() + "");

            if (value == valToEquate) {
                errorMessage = errorMessage + " " + valToEquate;
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
