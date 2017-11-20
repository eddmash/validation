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
public class LTCheck extends NotEmptyCheck {
    private double min;

    public LTCheck(EditText view, String errorMessage, int min) {
        super(view, errorMessage);
        this.min = (double) min;
    }

    public LTCheck(Spinner view, String errorMessage, int min) {
        super(view, errorMessage);
        this.min = (double) min;
    }

    public LTCheck(EditText view, String errorMessage, double min) {
        super(view, errorMessage);
        this.min =  min;
    }

    public LTCheck(Spinner view, String errorMessage, double min) {
        super(view, errorMessage);
        this.min = min;
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
            Double value = Double.valueOf(getView().getText() + "");

            if (value > min) {
                errorMessage = errorMessage + " " + min;
                setError(errorMessage);
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
