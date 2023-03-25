
# WebBrowser Automation 

A brief description of what this project does and who it's for

WebBrowser Automation Framework developed using Selenium with TestNG, Extent Reports.

Can work on multiple browsers like chrome, firefox, edge etc

How to use this framework?

Clone the repository to your workspace.

Open the testdata.xlsx under the src/test/resources folder
In the RunManager sheet -->Choose the test cases you want to run by choosing yes
In the testdata sheet --->Choose the test data you want to pass to the testcase from excel sheet.
The data from the excel sheet will be passed to the test method as a hashtable.
Run the testng.xml file. You can even run as mvn test which will trigger the testng.xml

How the framework works?

AnnotationTransformer class which implements IAnnotationTransformer is reponsible for reading the data from RunManager sheet in testdata.xlsx It sets the annotation of the test methods like description,enabled, priority, dataprovider values read from the excel.

Things to note : Test name in the first column of the excel sheet should match with atleast an @Test available in test classes mentioned in the testng.xml


All the tests will have the same dataprovider in the TestUtils class. For example the loginTest in RunManager sheet of testdata.xlsx will take the data from TestData sheet which have row where the testname is loginTest. If there are multiple rows with loginTest as test name , framework will consider it as this as multiple iterations for a test case.

Other tips:
TestCase description given in the excel sheet will be displayed in the extent reports.
Reusable methods are placed in BasePage.java and can be utilised in your tests.
Data from excel sheet will be available as Hashtable parameter to your tests. You can fetch the value using data.get("columnnameinexcel") Refer the already existing tests for more details.
make sure testdata.xlsx file is closed , before starting execution.