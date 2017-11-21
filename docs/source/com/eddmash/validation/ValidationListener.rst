.. java:import:: android.view View

.. java:import:: android.widget EditText

.. java:import:: android.widget Spinner

.. java:import:: com.eddmash.validation.checks ValidationCheck

.. java:import:: com.google.common.collect Range

ValidationListener
==================

.. java:package:: com.eddmash.validation
   :noindex:

.. java:type:: public interface ValidationListener

   Enables validation of views in fragment find managed at the activity level see FarmerActivity and it fragments.

Methods
-------
addCheck
^^^^^^^^

.. java:method::  void addCheck(ValidationCheck validationCheck)
   :outertype: ValidationListener

   Adds validation checks to be enforced by a validator

   :param validationCheck:

addValidator
^^^^^^^^^^^^

.. java:method::  void addValidator(ValidationListener validationListener)
   :outertype: ValidationListener

   Add a validationListener object.

   :param validationListener:

disableCheck
^^^^^^^^^^^^

.. java:method::  void disableCheck(ValidationCheck validationCheck)
   :outertype: ValidationListener

   disable validation check

   :param validationCheck: the validation check to disable.

disableSpinnerValidation
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method::  void disableSpinnerValidation(View view)
   :outertype: ValidationListener

   Remove view from being validated.

   :param view:

disableSpinnerValidation
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method::  void disableSpinnerValidation(int id)
   :outertype: ValidationListener

   Remove view from being validated.

   :param id:

disableValidation
^^^^^^^^^^^^^^^^^

.. java:method::  void disableValidation(int id)
   :outertype: ValidationListener

   Remove view from being validated.

   :param id:

disableValidation
^^^^^^^^^^^^^^^^^

.. java:method::  void disableValidation(View view)
   :outertype: ValidationListener

   Remove view from being validated.

   :param view:

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method::  void setSpinnerValidation(int form_province, String pattern, int form_err_blank)
   :outertype: ValidationListener

   Validates Spinners

   :param form_province:
   :param pattern:
   :param form_err_blank:

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method::  void setSpinnerValidation(int form_province, String pattern, String form_err_blank)
   :outertype: ValidationListener

   Validates Spinners

   :param form_province:
   :param pattern:
   :param form_err_blank:

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method::  void setSpinnerValidation(Spinner spinner, String pattern, int form_err_blank)
   :outertype: ValidationListener

   Validates Spinners

   :param spinner:
   :param pattern:
   :param form_err_blank:

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method::  void setSpinnerValidation(Spinner spinner, String pattern, String form_err_blank)
   :outertype: ValidationListener

setValidation
^^^^^^^^^^^^^

.. java:method::  void setValidation(EditText view, String pattern, String errorMsg)
   :outertype: ValidationListener

   Validates and edit box.

   :param view: the view to validate
   :param pattern: the condition to validate on the view
   :param errorMsg: the error message to produce on validation fail

setValidation
^^^^^^^^^^^^^

.. java:method::  void setValidation(int view, String pattern, String errorMsg)
   :outertype: ValidationListener

   Validates and edit box.

   :param view: the view to validate
   :param pattern: the condition to validate on the view
   :param errorMsg: the error message to produce on validation fail

setValidation
^^^^^^^^^^^^^

.. java:method::  void setValidation(int view, String pattern, int errorMsg)
   :outertype: ValidationListener

   Validates a view againsts the given context

   :param view:
   :param pattern:
   :param errorMsg:

setValidation
^^^^^^^^^^^^^

.. java:method::  void setValidation(EditText view, Range pattern, String errorMsg, boolean strict)
   :outertype: ValidationListener

setValidation
^^^^^^^^^^^^^

.. java:method::  void setValidation(int view, Range pattern, String errorMsg, boolean strict)
   :outertype: ValidationListener

validate
^^^^^^^^

.. java:method::  boolean validate()
   :outertype: ValidationListener

   Does the actual validation.

   :return: boolean true of valid

