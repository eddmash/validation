.. java:import:: android.app Activity

.. java:import:: android.util Log

.. java:import:: android.view View

.. java:import:: android.widget EditText

.. java:import:: android.widget Spinner

.. java:import:: android.widget TextView

.. java:import:: com.eddmash.validation.checks ValidationCheck

.. java:import:: com.eddmash.validation.utils NumericRange

.. java:import:: com.google.common.collect Range

.. java:import:: java.util ArrayList

.. java:import:: java.util Collections

.. java:import:: java.util HashMap

.. java:import:: java.util HashSet

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: java.util.regex Matcher

.. java:import:: java.util.regex Pattern

Validator
=========

.. java:package:: com.eddmash.validation
   :noindex:

.. java:type:: public class Validator implements ValidatorInterface

   Performs view validation.

Constructors
------------
Validator
^^^^^^^^^

.. java:constructor:: public Validator(Activity context)
   :outertype: Validator

Validator
^^^^^^^^^

.. java:constructor:: public Validator(String tag, Activity context)
   :outertype: Validator

Methods
-------
addCheck
^^^^^^^^

.. java:method:: @Override public void addCheck(ValidationCheck validationCheck)
   :outertype: Validator

addValidator
^^^^^^^^^^^^

.. java:method:: @Override public void addValidator(ValidatorInterface validator)
   :outertype: Validator

clearErrors
^^^^^^^^^^^

.. java:method:: @Override public void clearErrors()
   :outertype: Validator

disableCheck
^^^^^^^^^^^^

.. java:method:: @Override public void disableCheck(ValidationCheck validationCheck)
   :outertype: Validator

   \ :java:ref:`see <ValidatorInterface.addCheck(ValidationCheck)>`\

disableSpinnerValidation
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void disableSpinnerValidation(View view)
   :outertype: Validator

disableSpinnerValidation
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void disableSpinnerValidation(int id)
   :outertype: Validator

disableValidation
^^^^^^^^^^^^^^^^^

.. java:method:: public void disableValidation(int id)
   :outertype: Validator

disableValidation
^^^^^^^^^^^^^^^^^

.. java:method:: public void disableValidation(View view)
   :outertype: Validator

getErrors
^^^^^^^^^

.. java:method:: @Override public Map<String, List> getErrors()
   :outertype: Validator

getErrorsByTag
^^^^^^^^^^^^^^

.. java:method:: public List getErrorsByTag(String tag)
   :outertype: Validator

   Gets a list of errors for a specific tag.

   :param tag:

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setSpinnerValidation(int form_province, String pattern, int form_err_blank)
   :outertype: Validator

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setSpinnerValidation(int form_province, String pattern, String form_err_blank)
   :outertype: Validator

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setSpinnerValidation(Spinner spinner, String pattern, int form_err_blank)
   :outertype: Validator

setSpinnerValidation
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setSpinnerValidation(Spinner spinner, String pattern, String form_err_blank)
   :outertype: Validator

setValidation
^^^^^^^^^^^^^

.. java:method:: public void setValidation(EditText view, Range pattern, String errorMsg, boolean strict)
   :outertype: Validator

setValidation
^^^^^^^^^^^^^

.. java:method:: public void setValidation(int view, Range pattern, String errorMsg, boolean strict)
   :outertype: Validator

setValidation
^^^^^^^^^^^^^

.. java:method:: public void setValidation(EditText view, String pattern, String errorMsg)
   :outertype: Validator

setValidation
^^^^^^^^^^^^^

.. java:method:: public void setValidation(int view, String pattern, String errorMsg)
   :outertype: Validator

setValidation
^^^^^^^^^^^^^

.. java:method:: public void setValidation(int view, String pattern, int errorMsg)
   :outertype: Validator

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: Validator

validate
^^^^^^^^

.. java:method:: @Override public boolean validate()
   :outertype: Validator

