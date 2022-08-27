This projects includes the automation test for the following scenario:
Access http://automationpractice.com/index.php,
Hover over a product from the home page and add it to the basket,
then check it out as both a registered and a guest user

**Installing Java 11
Make sure that java is installed in your system
--Open command prompt and type java -version
If java has not been installed, then visit https://oracle.com and download JDK
you can go to the following link for how to download and install JDK in your system
https://www.youtube.com/watch?v=kFARYsqwlJI

**Installing Selenium
--Go to https://www.selenium.dev/downloads and download selenium for java
-- you can follow the instructions in the following video link and install selenium into your system
https://www.youtube.com/watch?v=PXZShFu5WLQ

**Adding cucumber & Gherkin plugin to your IDE

Go to your IDE settings and click on plugin section. Search for cucumber for java. Install the plugin. You will be automatically recommended downloading
Gherkin. Download gherkin plugin. You will see a cucumber icon next to each feature file.

After following the steps above, you should be able to execute the tests. There are basically two ways to run the tests.

-You can run the Runner class under runners directory. This class is designed to run the feature file with the tag which is specified in the class.
-You can run the feature file under features directory.

**Reports
In order to generate a report, you have to run a runner class. The report is generated under target directory after the test is executed.


