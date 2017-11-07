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
import android.widget.TextView;

public class ValidateNotEmpty extends ValidationCheck {

    private EditText view;
    private Spinner spinner;
    protected String errorMessage;

    public ValidateNotEmpty(EditText view, String errorMessage) {
        this.view = view;
        this.errorMessage = errorMessage;
    }

    public ValidateNotEmpty(Spinner spinner, String errorMessage) {
        this.spinner = spinner;
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean run() {

        String value = getView().getText() + "";
        getView().setError(null);
        if (value.isEmpty()) {
            getView().setError(errorMessage);
            return false;
        }
        return true;
    }

    /**
     * Gets the view we are working on.
     * @return
     */
    protected TextView getView() {

        if (spinner != null) {
            this.view = (EditText) spinner.getSelectedView();
        }
        return this.view;
    }

    @Override
    public String getErrorMsg() {
        return errorMessage;
    }
}
