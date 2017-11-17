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

/**
 * Equal to
 */
public class EqualCheck extends NotEmptyCheck {
    private double valToEquate;

    public EqualCheck(EditText view, String errorMessage, int valToEquate) {
        super(view, errorMessage);
        this.valToEquate = (double) valToEquate;
    }

    public EqualCheck(EditText view, String errorMessage, double valToEquate) {
        super(view, errorMessage);
        this.valToEquate = valToEquate;
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
