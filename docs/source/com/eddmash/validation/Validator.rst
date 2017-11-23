.. java:import:: android.app Activity

.. java:import:: android.util Log

.. java:import:: com.eddmash.validation.checks ValidationCheck

.. java:import:: java.util ArrayList

.. java:import:: java.util Collections

.. java:import:: java.util HashMap

.. java:import:: java.util HashSet

.. java:import:: java.util List

.. java:import:: java.util Map

Validator
=========

.. java:package:: com.eddmash.validation
   :noindex:

.. java:type:: public class Validator implements ValidatorInterface

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

disableValidator
^^^^^^^^^^^^^^^^

.. java:method:: @Override public void disableValidator(ValidatorInterface validatorInterface)
   :outertype: Validator

getErrors
^^^^^^^^^

.. java:method:: @Override public Map<String, List> getErrors()
   :outertype: Validator

getErrorsByTag
^^^^^^^^^^^^^^

.. java:method:: @Override public List getErrorsByTag(String tag)
   :outertype: Validator

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: Validator

validate
^^^^^^^^

.. java:method:: @Override public boolean validate()
   :outertype: Validator

validate
^^^^^^^^

.. java:method:: @Override public void validate(ValidationListener validationListener)
   :outertype: Validator

