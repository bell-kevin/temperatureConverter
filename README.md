# TemperatureConverterProject
SDEV 1060 Project.

To concentrate on the unit testing, here is the pseudocode for the project:

      Display "Temperature Converter by Student Name"
      Declare variables:
            string answer = "y"
            string tempType = "f"
            double userTemp = 0.0
            double result = 0.0
      while (answer equals "y")
            display "\nWhat is the temperature to convert? "
            userTemp = input parsed to a double
            display "Is this Celsius (C) or Fahrenheit (F): "
            tempType = input converted to lowercase
            if (tempType equals "c")
                  result = CtoF(userTemp);
                  display "Fahrhenheit temp is " + result;
            else if (tempType equals "f")
                  result = FtoC(userTemp);
                  display "Celsius temp is " + result;
            else
                  display "Error, use C or F for temperature type"
      display "Do you have another temperature to convert? ";
      answer = input converted to lowercase;


The code for methods CtoF() and FtoC() is the same in Java and C#.

Temp Converter methods

Create this project, type in this code, and make sure it runs and produces results like the example above.

When converting temperatures, there are 3 well-known test cases -- freezing point, boiling point, and normal human body temperature. The freezing point is 32 degrees Fahrenheit and 0 degrees Celsius. The boiling point is 212 degrees Fahrenheit, 100 degrees Celsius. The normal human body temperature is 98.6 degrees Fahrenheit, 37.0 degrees Celsius.

Create the unit tests for the methods FtoC( ) and CtoF( ). Note that these methods are static helper methods. (Refer to the previous assignment if necessary about how to reference a static helper method rather than a method in a separate class.) Each test case should include all 3 of the well-known test cases -- freezing temperature, boiling temperature, body temperature.

Note that when testing doubles in an assert statement, there is an additional parameter. The assert statement is:
(Java)    assertEquals(expected result, actual result, delta);
(C#)     Assert.AreEqual(expected result, actual result, delta);

The "delta" is the amount of tolerance or precision allowed for doubles. Doubles have some small value way out to the right in the decimal places, so it is nearly impossible that you could compare 1.0 and 1.0 and get a perfect match. Instead, compare them up to a certain number of decimal places; the delta shows how many places to compare and how much variance is acceptable. If the first 4 decimal places must match exactly, you would use 0.0000 for the delta. If the first 2 decimal places must match exactly and the third one can be off by 1, the delta would be 0.001. With that delta, if the expected value is 1.234, the numbers of 1.235 and 1.233 would match, but 1.24 or 1.236 would not.

In this project, use a delta of 0.00, checking that the first 2 decimal places match exactly, in the unit tests.

Include all 3 assertions in each test.

Take a screenshot of the output showing the tests passed. Take screenshots of the code for the project and for the unit tests.

Submission: screenshot of passing unit tests, screenshots of code, root folder for the project

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
