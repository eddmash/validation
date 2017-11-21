.. java:import:: android.view View

.. java:import:: android.widget EditText

.. java:import:: android.widget Spinner

.. java:import:: com.eddmash.validation.checks ValidationCheck

.. java:import:: com.google.common.collect Range

.. java:import:: java.util List

.. java:import:: java.util Map

ValidatorInterface
==================

.. java:package:: com.eddmash.validation
   :noindex:

.. java:type:: public interface ValidatorInterface

   Class that is responsible for going through validation checks and determine if they are valid.

Methods
-------
addCheck
^^^^^^^^

.. java:method::  void addCheck(ValidationCheck validationCheck)
   :outertype: ValidatorInterface

   Adds validation checks to be enforced by a validator

   :param validationCheck:

addValidator
^^^^^^^^^^^^

.. java:method::  void addValidator(ValidatorInterface validatorInterface)
   :outertype: ValidatorInterface

   Add a validatorInterface object.

   :param validatorInterface:

clearErrors
^^^^^^^^^^^

.. java:method::  void clearErrors()
   :outertype: ValidatorInterface

   Clear all the errors from the validator. maybe use when you have already run the validation onces and want to run the validation again using the same ValidatorInterface instance

disableCheck
^^^^^^^^^^^^

.. java:method::  void disableCheck(ValidationCheck validationCheck)
   :outertype: ValidatorInterface

   disable validation check

   :param validationCheck: the validation check to disable.

disableSpinnerValidation
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method::  void disableSpinnerValidation(View view)
   :outertype: ValidatorInterface

   Remove view from being validated.

   :param view:

disableSpinnerValidation
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method::  void disableSpinnerValidation(int id)
   :outertype: ValidatorInterface

   Remove view from being validated.

   :param id:

disableValidation
^^^^^^^^^^^^^^^^^

.. java:method::  void disableValidation(int id)
   :outertype: ValidatorInterface

   Remove view from being validated.

   :param id:

disableValidation
^^^^^^^^^^^^^^^^^

.. java:method::  void disableValidation(View view)
   :outertype: ValidatorInterface

   Remove view from being validated.

   :param view:

getErrors
^^^^^^^^^

.. java:method::  Map<String, List> getErrors()
   :outertype: ValidatorInterface

   Returns all error that the validator found as a HashMap. with the key being tags if your passed in any when creating the validator otherwise all errors are returned under the tag NON_SPECIFIC

   the value of the HashMap consists an ArrayList of errors that relate to each tag

   :return: Map

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method::  void setSpinnerValidation(int form_province, String pattern, int form_err_blank)
   :outertype: ValidatorInterface

   Validates Spinners

   :param form_province:
   :param pattern:
   :param form_err_blank:

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method::  void setSpinnerValidation(int form_province, String pattern, String form_err_blank)
   :outertype: ValidatorInterface

   Validates Spinners

   :param form_province:
   :param pattern:
   :param form_err_blank:

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method::  void setSpinnerValidation(Spinner spinner, String pattern, int form_err_blank)
   :outertype: ValidatorInterface

   Validates Spinners

   :param spinner:
   :param pattern:
   :param form_err_blank:

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method::  void setSpinnerValidation(Spinner spinner, String pattern, String form_err_blank)
   :outertype: ValidatorInterface

setValidation
^^^^^^^^^^^^^

.. java:method::  void setValidation(EditText view, String pattern, String errorMsg)
   :outertype: ValidatorInterface

   Validates and edit box.

   :param view: the view to validate
   :param pattern: the condition to validate on the view
   :param errorMsg: the error message to produce on validation fail

setValidation
^^^^^^^^^^^^^

.. java:method::  void setValidation(int view, String pattern, String errorMsg)
   :outertype: ValidatorInterface

   Validates and edit box.

   :param view: the view to validate
   :param pattern: the condition to validate on the view
   :param errorMsg: the error message to produce on validation fail

setValidation
^^^^^^^^^^^^^

.. java:method::  void setValidation(int view, String pattern, int errorMsg)
   :outertype: ValidatorInterface

   Validates a view againsts the given context

   :param view:
   :param pattern:
   :param errorMsg:

setValidation
^^^^^^^^^^^^^

.. java:method::  void setValidation(EditText view, Range pattern, String errorMsg, boolean strict)
   :outertype: ValidatorInterface

setValidation
^^^^^^^^^^^^^

.. java:method::  void setValidation(int view, Range pattern, String errorMsg, boolean strict)
   :outertype: ValidatorInterface

validate
^^^^^^^^

.. java:method::  boolean validate()
   :outertype: ValidatorInterface

   Does the actual validation.

   :return: boolean true of valid

