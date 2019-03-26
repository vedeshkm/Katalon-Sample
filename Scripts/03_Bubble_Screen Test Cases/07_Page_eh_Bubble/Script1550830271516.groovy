import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

try {
    if (GlobalVariable.previousTestFailed) {
        WebUI.callTestCase(findTestCase('01_Common Test Cases/01_Page_Login'), [('password') : '', ('username') : ''], FailureHandling.STOP_ON_FAILURE)

        GlobalVariable.previousTestFailed = false
    }
    
    WebUI.delay(3)

    WebUI.waitForElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/01_Page_University Program_Bubble/span_University Program'), 5)

    WebUI.click(findTestObject('Object Repository/Page_Opportunity Details  Unified A/span_Value Props'))

    WebUI.waitForElementVisible(findTestObject('Page_Opportunity Details  Unified A/span_Value Props'), 5)

    WebUI.waitForElementClickable(findTestObject('null'), 
        3)

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('Page_My Desk/My Desk_Button'))
}
catch (Exception e) {
    e.printStackTrace()

    WebUI.closeBrowser()

    GlobalVariable.previousTestFailed = true
} 

