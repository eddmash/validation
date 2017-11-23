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
     * @return true if validation was a success else return false.
     */
    public abstract boolean run();


    /**
     * The error message to use for the failed validations.
     *
     * @return
     */
    public abstract String getErrorMsg();


    /**
     * Gets the view we are working on.This can be anything that is a child of TextView
     * e.g. EditText, CompoundButton like Checkboxes
     * <p>
     * Incase of a spinner you return the selected view like so.
     * <p>
     * <code>
     * (TextView) spinner.getSelectedView();
     * </code>
     *
     * @return the View from which to get value to validate and also on which to set error by
     * invoking <strong>view.setError()</strong>
     */
    protected TextView getView(){
        return null;
    }

    /**
     * Gets the value to be validated.
     *
     * @return
     */
    protected String getValue() {
        if (getView() == null) {
            return null;
        }
        return (String) getView().getText();
    }


    /**
     * Set the error message on the View being validated.
     *
     * This will invoked when the validation starts, To clear out any previous errors displayed
     * on the View. This is done by passing null as the error message
     *
     * Its again invoked incase validation fails and error message need to be added to the View.
     *
     * @param error the error message that needs to be set on the View being validated
     */
    public void setError(String error) {
        if (getView() != null) {

            getView().setError(error);
        }
    }
}
