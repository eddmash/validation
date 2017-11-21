.. java:import:: android.widget TextView

AnyCheck
========

.. java:package:: com.eddmash.validation.checks
   :noindex:

.. java:type:: public class AnyCheck extends CheckCompound

   Checks if at least one of the checks passed validation. NOTE:: if the no checks are provided i.e. checkList is empty, validation will always be failed.

Constructors
------------
AnyCheck
^^^^^^^^

.. java:constructor:: public AnyCheck(String errorMessage)
   :outertype: AnyCheck

Methods
-------
validate
^^^^^^^^

.. java:method:: @Override protected boolean validate()
   :outertype: AnyCheck

