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

public class ValidateNotEmpty extends ValidationCallback {

    protected EditText view;
    protected String errorMessage;

    public ValidateNotEmpty(EditText view, String errorMessage) {
        this.view = view;
        this.errorMessage = errorMessage;
    }

    public ValidateNotEmpty(Spinner view, String errorMessage) {
        this.view = (EditText)view.getSelectedView();
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean run() {
        String value = view.getText()+"";
        view.setError(null);
        if (value.isEmpty()){
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
