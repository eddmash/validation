Android validation library documentation!
#########################################

A lightweight and extensible android validation library.

It uses simple, straightforward validation methods with a focus on readable and concise syntax.

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

To run the validations invole the validators
:java:ref:`validate() <ValidatorInterface.validate()>` method.

This method returns ``true`` if the validation passed or ``false`` if the validations failed.

Incase of validation failure, the validation errors can be accessed via the
:java:ref:`getErrors() <ValidatorInterface.getErrors()>` method.

This library comes with a convenience :java:ref:`ErrorRenderer <ErrorRenderer>`, which can be used
to easily display the validation errors.

.. code-block:: java

     // the layout where we display any validation errors
     LinearLayout errorSpace = (LinearLayout) findViewById(R.id.error_base);
     errorSpace.removeAllViews();// clear space first

     if (validator.validate()) {
         // .. code to perform if validation passes
     } else {

         // show the errors if validation failed
         // we use the renderer class to handle the display
         ErrorRenderer errorRenderer = new ErrorRenderer(this, validator);
         errorRenderer.render(errorSpace);
     }

.. toctree::
    :titlesonly:
    :maxdepth: 1

    Usage <self>
    checks
    renderer
    example/fragments

