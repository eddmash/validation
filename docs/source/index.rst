Android validation library documentation!
#########################################

A simple, minimal and elegant validation library. it uses simple, straightforward validation methods
with a focus on readable and concise syntax.

Installation
************

using Maven.

::

    <dependency>
      <groupId>com.eddmash</groupId>
      <artifactId>validation</artifactId>
      <version>1.0.13</version>
      <type>pom</type>
    </dependency>

using Gradle.

::

    compile 'com.eddmash:validation:1.0.13'

Usage
*****

- Create a validator object

.. code-block:: java

    // validator takes Context(Activity) object as argument
    Validator validator = new Validator(this);

- add validation checks to the validator

.. code-block:: java

    // the view objects to validate
    EditText nameEditText = (EditText) view.findViewById(R.id.name);
    Spinner ageSpinner = (Spinner) view.findViewById(R.id.spinner);

    // ... using check objects
    validator.addCheck(new NotEmptyCheck(nameEditText, "name cannot be blank");
    validator.addCheck(new NotEmptyCheck(ageSpinner, "age cannot be blank");

:doc:`Learn more about available checks <com/eddmash/validation/checks/package-index>`

Validate and Handle the errors
******************************

.. code-block:: java

     errorSpace = (LinearLayout) findViewById(R.id.error_base);
     errorSpace.removeAllViews();// clear space first

     if (validator.validate()) {
         // .. code to perform if validation passes
     } else {

         // show the errors if validation failed

         errorRenderer = new ErrorRenderer(this, validator);
         errorRenderer.render(errorSpace);
         toggleShowErrors.setVisibility(View.VISIBLE);
     }
