ValidationListener
==================

.. java:package:: com.eddmash.validation
   :noindex:

.. java:type::  interface ValidationListener

   Interface definition for callbacks to be invoked when the validation state has changed.

Methods
-------
onValidationFailed
^^^^^^^^^^^^^^^^^^

.. java:method::  void onValidationFailed()
   :outertype: ValidationListener

   Invoked when validation failed

onValidationSuccess
^^^^^^^^^^^^^^^^^^^

.. java:method::  void onValidationSuccess()
   :outertype: ValidationListener

   Invoked when the validation passed successfully.

