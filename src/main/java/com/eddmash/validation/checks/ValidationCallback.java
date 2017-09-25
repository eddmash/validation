package com.eddmash.validation.checks;
/*
* This file is part of the com.eddmash.validation package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

/**
 * Use this when you want to perform lazy execution of validations.
 */
public abstract class ValidationCallback {

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
}
