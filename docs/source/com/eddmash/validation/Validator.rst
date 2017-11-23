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

.. java:constructor:: public Validator(Activity context)
   :outertype: Validator

.. java:constructor:: public Validator(String tag, Activity context)
   :outertype: Validator

Methods
-------

.. java:method:: @Override public void addCheck(ValidationCheck validationCheck)
   :outertype: Validator

.. java:method:: @Override public void addValidator(ValidatorInterface validator)
   :outertype: Validator

.. java:method:: @Override public void clearErrors()
   :outertype: Validator

.. java:method:: @Override public void disableCheck(ValidationCheck validationCheck)
   :outertype: Validator

   \ :java:ref:`see <ValidatorInterface.addCheck(ValidationCheck)>`\

.. java:method:: @Override public void disableValidator(ValidatorInterface validatorInterface)
   :outertype: Validator

.. java:method:: @Override public Map<String, List> getErrors()
   :outertype: Validator

.. java:method:: @Override public List getErrorsByTag(String tag)
   :outertype: Validator

.. java:method:: @Override public String toString()
   :outertype: Validator

.. java:method:: @Override public boolean validate()
   :outertype: Validator

.. java:method:: @Override public void validate(ValidationListener validationListener)
   :outertype: Validator

