.. java:import:: android.widget CompoundButton

.. java:import:: android.widget EditText

.. java:import:: android.widget Spinner

.. java:import:: android.widget TextView

NotEmptyCheck
=============

.. java:package:: com.eddmash.validation.checks
   :noindex:

.. java:type:: public class NotEmptyCheck extends ValidationCheck

   Not empty

Fields
------

.. java:field:: protected String errorMessage
   :outertype: NotEmptyCheck

Constructors
------------

.. java:constructor:: public NotEmptyCheck(EditText view, String errorMessage)
   :outertype: NotEmptyCheck

.. java:constructor:: public NotEmptyCheck(Spinner spinner, String errorMessage)
   :outertype: NotEmptyCheck

Methods
-------

.. java:method:: @Override public String getErrorMsg()
   :outertype: NotEmptyCheck

.. java:method:: @Override public String getValue()
   :outertype: NotEmptyCheck

.. java:method:: @Override protected TextView getView()
   :outertype: NotEmptyCheck

   Gets the view we are working on.

.. java:method:: @Override public boolean run()
   :outertype: NotEmptyCheck

