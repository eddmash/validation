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

import com.eddmash.validation.ValidatorInterface;

import java.util.ArrayList;
import java.util.List;

abstract public class CheckCompound extends CheckSingle {

    private ViewGroup viewGroup;
    private String errorMessage;
    protected List<CheckInterface> checkList = new ArrayList<>();


    public CheckCompound(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void addCheck(CheckInterface checkInterface) {
        checkList.add(checkInterface);
    }

    public void addChecks(List<CheckInterface> validationChecks) {
        checkList.addAll(validationChecks);
    }

    @Override
    public String getErrorMsg() {
        return errorMessage;
    }

    @Override
    public void setError(String error) {
        for (CheckInterface check : checkList) {
            check.setError(error);
        }
    }

    @Override
    public void clearError() {
        for (CheckInterface check : checkList) {
            check.clearError();
        }
    }
}
