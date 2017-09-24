package com.eddmash.validation;
/*
* This file is part of the com.eddmash.validation package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

public interface FormSaveListener {

    /**
     * Save the data saved by the user. this values are cleared once a save to the database is made
     * otherwise this are saved for use on restore.
     *
     */
    void save();

    ValidationListener getValidator();
}
