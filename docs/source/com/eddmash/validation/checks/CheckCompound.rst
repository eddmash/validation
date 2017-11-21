.. java:import:: android.view ViewGroup

.. java:import:: android.widget TextView

.. java:import:: java.util ArrayList

.. java:import:: java.util List

CheckCompound
=============

.. java:package:: com.eddmash.validation.checks
   :noindex:

.. java:type:: public abstract class CheckCompound extends ValidationCheck

Fields
------
checkList
^^^^^^^^^

.. java:field:: protected List<ValidationCheck> checkList
   :outertype: CheckCompound

Constructors
------------
CheckCompound
^^^^^^^^^^^^^

.. java:constructor:: public CheckCompound(String errorMessage)
   :outertype: CheckCompound

Methods
-------
addCheck
^^^^^^^^

.. java:method:: public void addCheck(ValidationCheck validationCheck)
   :outertype: CheckCompound

addChecks
^^^^^^^^^

.. java:method:: public void addChecks(List<ValidationCheck> validationChecks)
   :outertype: CheckCompound

getErrorMsg
^^^^^^^^^^^

.. java:method:: @Override public String getErrorMsg()
   :outertype: CheckCompound

getValue
^^^^^^^^

.. java:method:: @Override protected String getValue()
   :outertype: CheckCompound

getView
^^^^^^^

.. java:method:: @Override protected TextView getView()
   :outertype: CheckCompound

run
^^^

.. java:method:: @Override public boolean run()
   :outertype: CheckCompound

setError
^^^^^^^^

.. java:method:: @Override public void setError(String error)
   :outertype: CheckCompound

validate
^^^^^^^^

.. java:method:: protected abstract boolean validate()
   :outertype: CheckCompound

