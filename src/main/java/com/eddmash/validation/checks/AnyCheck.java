package com.eddmash.validation.checks;
/*
* This file is part of the Ziamismalawi package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

import android.widget.TextView;

/**
 * Checks if at least one of the checks passed validation.
 *
 * NOTE:: if the no checks are provided i.e. checkList is empty, validation will always be failed.
 *
 */
public class AnyCheck extends CheckCompound {

    public AnyCheck(String errorMessage) {
        super(errorMessage);
    }

    @Override
    protected boolean validate() {
        boolean status = false;

        for (ValidationCheck check : checkList) {

            if (check.run()) {
                status = true;
                break;
            }
        }
        return status;
    }
}
