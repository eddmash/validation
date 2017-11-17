package com.eddmash.validation.checks;
/*
* This file is part of the com.eddmash.validation package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Use this when you want to perform lazy execution of validations.
 */
public abstract class ValidationCheck {

    /**
     *
     * @return true if validation was a success else return false.
     */
    public abstract boolean run();

    /**
     * The error message to use for the failed validations.
     * @return
     */
    public abstract String getErrorMsg();

    /**
     * Invoked with the error message, use this method to set the error message on you view.
     * @param error
     */
    public void setError(String error){
        getView().setError(error);
    }

    /**
     * Gets the view we are working on.
     * @return
     */
    protected abstract TextView getView();

    /**
     * Gets the value for the view being validated
     * @return
     */
    protected abstract String getValue();
}
