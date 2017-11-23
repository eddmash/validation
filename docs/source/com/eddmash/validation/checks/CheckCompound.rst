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

.. java:field:: protected List<ValidationCheck> checkList
   :outertype: CheckCompound

Constructors
------------

.. java:constructor:: public CheckCompound(String errorMessage)
   :outertype: CheckCompound

Methods
-------

.. java:method:: public void addCheck(ValidationCheck validationCheck)
   :outertype: CheckCompound

.. java:method:: public void addChecks(List<ValidationCheck> validationChecks)
   :outertype: CheckCompound

.. java:method:: @Override public String getErrorMsg()
   :outertype: CheckCompound

.. java:method:: @Override public boolean run()
   :outertype: CheckCompound

.. java:method:: @Override public void setError(String error)
   :outertype: CheckCompound

.. java:method:: protected abstract boolean validate()
   :outertype: CheckCompound

