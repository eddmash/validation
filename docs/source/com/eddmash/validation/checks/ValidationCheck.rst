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
getErrorMsg
^^^^^^^^^^^

.. java:method:: public abstract String getErrorMsg()
   :outertype: ValidationCheck

   The error message to use for the failed validations.

getValue
^^^^^^^^

.. java:method:: protected abstract String getValue()
   :outertype: ValidationCheck

   Gets the value for the view being validated

getView
^^^^^^^

.. java:method:: protected abstract TextView getView()
   :outertype: ValidationCheck

   Gets the view we are working on.

run
^^^

.. java:method:: public abstract boolean run()
   :outertype: ValidationCheck

   :return: true if validation was a success else return false.

setError
^^^^^^^^

.. java:method:: public void setError(String error)
   :outertype: ValidationCheck

   Invoked with the error message, use this method to set the error message on you view.

   :param error:

