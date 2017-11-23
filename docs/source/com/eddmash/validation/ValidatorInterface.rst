.. java:import:: com.eddmash.validation.checks ValidationCheck

.. java:import:: java.util List

.. java:import:: java.util Map

ValidatorInterface
==================

.. java:package:: com.eddmash.validation
   :noindex:

.. java:type:: public interface ValidatorInterface

Methods
-------

.. java:method::  void addCheck(ValidationCheck validationCheck)
   :outertype: ValidatorInterface

   Adds validation checks to be enforced by a validator

   :param validationCheck:

.. java:method::  void addValidator(ValidatorInterface validatorInterface)
   :outertype: ValidatorInterface

   Add another validator to validated at the time this one is being validated.

   :param validatorInterface: the validatorInterface object

.. java:method::  void clearErrors()
   :outertype: ValidatorInterface

   Clear all the errors from the validator. maybe use when you have already run the validation onces and want to run the validation again using the same ValidatorInterface instance

.. java:method::  void disableCheck(ValidationCheck validationCheck)
   :outertype: ValidatorInterface

   disable validation check

   :param validationCheck: the validation check to disable.

.. java:method::  void disableValidator(ValidatorInterface validatorInterface)
   :outertype: ValidatorInterface

   Disable the validator from being validated any more.

   :param validatorInterface: validatorInterface object

.. java:method::  Map<String, List> getErrors()
   :outertype: ValidatorInterface

   Returns all error that the validator found as a HashMap. with the key being tags if your passed in any when creating the validator otherwise all errors afre returned under the tag NON_SPECIFIC

   the value of the HashMap consists an ArrayList of errors that relate to each tag

   :return: Map

.. java:method::  List getErrorsByTag(String tag)
   :outertype: ValidatorInterface

   Gets a list of errors for a specific tag.

   :param tag:

.. java:method::  boolean validate()
   :outertype: ValidatorInterface

   Does the actual validation.

   :return: boolean true of valid

.. java:method::  void validate(ValidationListener validationListener)
   :outertype: ValidatorInterface

   Does the actual validation.

   :param validationListener: listener that is

