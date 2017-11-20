package com.eddmash.validation.checks;
/*
* This file is part of the Ziamismalawi package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

import android.widget.CompoundButton;
import android.widget.TextView;

public class IsCheckedCheck extends ValidationCheck {

    private CompoundButton compoundButton;
    private String errorMessage;

    public IsCheckedCheck(CompoundButton compoundButton, String errorMessage) {
        this.compoundButton = compoundButton;
        this.errorMessage = errorMessage;
    }
    public IsCheckedCheck(CompoundButton compoundButton) {
        this(compoundButton, null);
    }

    @Override
    public boolean run() {
        setError(null);
        if (!compoundButton.isChecked()) {
            setError(errorMessage);
            return false;
        }
        return true;
    }

    @Override
    public String getErrorMsg() {
        return errorMessage;
    }

    @Override
    protected TextView getView() {
        return compoundButton;
    }

    @Override
    protected String getValue() {
        return null;
    }
}
