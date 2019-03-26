import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/TestSuite_2')

suiteProperties.put('name', 'TestSuite_2')

suiteProperties.put('description', 'Regression Testing and Automation Testing for MPT and UAD')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Shivananda.MS\\Katalon Studio\\UAD Sanity Test Suite\\Reports\\TestSuite_2\\20190206_075222\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TestSuite_2', suiteProperties, [new TestCaseBinding('Test Cases/01_Page_Login', 'Test Cases/01_Page_Login',  [ 'password' : 'HyK3jqptw5Wyv0GsVRLcxg==' , 'username' : 'shivananda.ms@best.local' ,  ]), new TestCaseBinding('Test Cases/02_Page_MyDesk_SearchByName', 'Test Cases/02_Page_MyDesk_SearchByName',  null), new TestCaseBinding('Test Cases/04_Page_UniversityProgram_Bubble', 'Test Cases/04_Page_UniversityProgram_Bubble',  null), new TestCaseBinding('Test Cases/05_Page_StudentContact_Bubble', 'Test Cases/05_Page_StudentContact_Bubble',  null), new TestCaseBinding('Test Cases/06_Page_AdmissionInformation_Bubble', 'Test Cases/06_Page_AdmissionInformation_Bubble',  null), new TestCaseBinding('Test Cases/07_Page_Opportunity Grant_Bubble', 'Test Cases/07_Page_Opportunity Grant_Bubble',  null), new TestCaseBinding('Test Cases/08_Page_Opportunity Documents_Bubble', 'Test Cases/08_Page_Opportunity Documents_Bubble',  null), new TestCaseBinding('Test Cases/09_Page_Value Props_Bubble', 'Test Cases/09_Page_Value Props_Bubble',  null), new TestCaseBinding('Test Cases/11_Page_CreateNewLead', 'Test Cases/11_Page_CreateNewLead',  null)])
