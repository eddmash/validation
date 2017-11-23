.. java:import:: android.widget CompoundButton

.. java:import:: android.widget EditText

.. java:import:: android.widget Spinner

.. java:import:: android.widget TextView

ValidationCheck
===============

.. java:package:: com.eddmash.validation.checks
   :noindex:

.. java:type:: public abstract class ValidationCheck

   Use this when you want to perform lazy execution of validations.

Methods
-------

.. java:method:: public abstract String getErrorMsg()
   :outertype: ValidationCheck

   The error message to use for the failed validations.

.. java:method:: protected String getValue()
   :outertype: ValidationCheck

   Gets the value to be validated.

.. java:method:: protected TextView getView()
   :outertype: ValidationCheck

   Gets the view we are working on.This can be anything that is a child of TextView e.g. EditText, CompoundButton like Checkboxes

   Incase of a spinner you return the selected view like so.

   (TextView) spinner.getSelectedView();

   :return: the View from which to get value to validate and also on which to set error by invoking \ **view.setError()**\

.. java:method:: public abstract boolean run()
   :outertype: ValidationCheck

   :return: true if validation was a success else return false.

.. java:method:: public void setError(String error)
   :outertype: ValidationCheck

   Set the error message on the View being validated. This will invoked when the validation starts, To clear out any previous errors displayed on the View. This is done by passing null as the error message Its again invoked incase validation fails and error message need to be added to the View.

   :param error: the error message that needs to be set on the View being validated

