package com.eddmash.validation.checks;
/*
* This file is part of the Ziamismalawi package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

abstract public class CheckCompound extends ValidationCheck {

    private ViewGroup viewGroup;
    private String errorMessage;
    private TextView errorView;
    protected List<ValidationCheck> checkList = new ArrayList<>();


    public CheckCompound(TextView errorView, String errorMessage) {
        this.errorMessage = errorMessage;
        this.errorView = errorView;
    }

    @Override
    public boolean run() {
        boolean status = validate();
        getView().setError(null);
        if (!status) {
            getView().setText(getErrorMsg());
        }
        return status;
    }

    protected abstract boolean validate();

    public void addCheck(ValidationCheck validationCheck) {
        checkList.add(validationCheck);
    }

    public void addChecks(List<ValidationCheck> validationChecks) {
        checkList.addAll(validationChecks);
    }
    @Override
    public String getErrorMsg() {
        return errorMessage;
    }

    @Override
    protected TextView getView() {
        return errorView;
    }

    @Override
    protected String getValue() {
        return null;
    }
}
