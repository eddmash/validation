package com.eddmash.validation;
/*
* This file is part of the com.eddmash.validation package.
* 
* (c) Eddilbert Macharia (http://eddmash.com)<edd.cowan@gmail.com>
*
* For the full copyright and license information, please view the LICENSE
* file that was distributed with this source code.
*/

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import com.eddmash.validation.checks.ValidationCallback;
import com.google.common.collect.Range;

/**
 * Enables validation of views in fragment find managed at the activity level
 *
 * see FarmerActivity and it fragments.
 */
public interface ValidationListener {

    /**
     * Validates and edit box.
     *
     * @param view     the view to validate
     * @param pattern  the condition to validate on the view
     * @param errorMsg the error message to produce on validation fail
     */
    void setValidation(EditText view, String pattern, String errorMsg);
    /**
     * Validates and edit box.
     *
     * @param view     the view to validate
     * @param pattern  the condition to validate on the view
     * @param errorMsg the error message to produce on validation fail
     */
    void setValidation(int view, String pattern, String errorMsg);

    /**
     * Validates a view againsts the given context
     *
     * @param view
     * @param pattern
     * @param errorMsg
     */
    void setValidation(int view, String pattern, int errorMsg);

    /**
     * Does the actual validation.
     *
     * @return boolean true of valid
     */
    boolean validate();

    /**
     * Validates Spinners
     * @param form_province
     * @param pattern
     * @param form_err_blank
     */
    void setSpinnerValidation(int form_province, String pattern, int form_err_blank);
    /**
     * Validates Spinners
     * @param form_province
     * @param pattern
     * @param form_err_blank
     */
    void setSpinnerValidation(int form_province, String pattern, String form_err_blank);
    /**
     * Validates Spinners
     * @param spinner
     * @param pattern
     * @param form_err_blank
     */
    void setSpinnerValidation(Spinner spinner, String pattern, int form_err_blank);
    void setSpinnerValidation(Spinner spinner, String pattern, String form_err_blank);

    /**
     * Remove view from being validated.
     *
     * @param id
     */
    void disableValidation(int id);
    /**
     * Remove view from being validated.
     *
     * @param view
     */
    void disableValidation(View view);
    /**
     * Remove view from being validated.
     *
     * @param view
     */
    void disableSpinnerValidation(View view);
    /**
     * Remove view from being validated.
     *
     * @param id
     */
    void disableSpinnerValidation(int id);

    /**
     * Add a validationListener object.
     *
     * @param validationListener
     */
    void addValidator(ValidationListener validationListener);



    void setValidation(EditText view, Range pattern, String errorMsg, boolean strict);


    void setValidation(int view, Range pattern, String errorMsg, boolean strict);

    /**
     * @param editText
     * @param validationCallback
     */
    void setValidation(EditText editText, ValidationCallback validationCallback);
    /**
     * @param spinner
     * @param validationCallback
     */
    void setValidation(Spinner spinner, ValidationCallback validationCallback);

}
