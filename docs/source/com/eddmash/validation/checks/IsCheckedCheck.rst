.. java:import:: android.widget CompoundButton

.. java:import:: android.widget TextView

IsCheckedCheck
==============

.. java:package:: com.eddmash.validation.checks
   :noindex:

.. java:type:: public class IsCheckedCheck extends ValidationCheck

Constructors
------------
IsCheckedCheck
^^^^^^^^^^^^^^

.. java:constructor:: public IsCheckedCheck(CompoundButton compoundButton, String errorMessage)
   :outertype: IsCheckedCheck

IsCheckedCheck
^^^^^^^^^^^^^^

.. java:constructor:: public IsCheckedCheck(CompoundButton compoundButton)
   :outertype: IsCheckedCheck

Methods
-------
getErrorMsg
^^^^^^^^^^^

.. java:method:: @Override public String getErrorMsg()
   :outertype: IsCheckedCheck

getValue
^^^^^^^^

.. java:method:: @Override protected String getValue()
   :outertype: IsCheckedCheck

getView
^^^^^^^

.. java:method:: @Override protected TextView getView()
   :outertype: IsCheckedCheck

run
^^^

.. java:method:: @Override public boolean run()
   :outertype: IsCheckedCheck

