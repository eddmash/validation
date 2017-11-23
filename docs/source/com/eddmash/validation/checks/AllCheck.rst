.. java:import:: android.widget TextView

AllCheck
========

.. java:package:: com.eddmash.validation.checks
   :noindex:

.. java:type:: public class AllCheck extends CheckCompound

   Ensures all are validation checks are valid. NOTE:: if the no checks are provided i.e. checkList is empty, validation will always be valid.

Constructors
------------
AllCheck
^^^^^^^^

.. java:constructor:: public AllCheck(String errorMessage)
   :outertype: AllCheck

Methods
-------
validate
^^^^^^^^

.. java:method:: @Override protected boolean validate()
   :outertype: AllCheck

