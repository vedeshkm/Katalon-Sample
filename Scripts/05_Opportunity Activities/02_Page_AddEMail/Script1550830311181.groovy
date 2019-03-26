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
    
    CustomKeywords.'com.ap.reusablemethods.Search.search'('2441')

    WebUI.waitForPageLoad(GlobalVariable.MAX_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('03_Bubble_Screen Test Cases Repo/02_Page_StudentContact_Bubble/Student Contact_Bubble'), GlobalVariable.MAX_Delay)

    WebUI.waitForElementNotVisible(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), GlobalVariable.MAX_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('05_Opportunity Activities Repo/Page_Send EMail/Send Email_Button'))

    WebUI.waitForElementNotPresent(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), GlobalVariable.MAX_Delay)

    WebUI.setText(findTestObject('05_Opportunity Activities Repo/Page_Send EMail/Subject_TextField'), 'test')

    WebUI.delay(GlobalVariable.MIN_Delay)

    WebUI.selectOptionByIndex(findTestObject('05_Opportunity Activities Repo/Page_Send EMail/SelectTo_DropDown'), 1, FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(GlobalVariable.MIN_Delay)

    WebUI.click(findTestObject('05_Opportunity Activities Repo/Page_Send EMail/Send_Button'))

    WebUI.delay(GlobalVariable.MIN_Delay)

    WebUI.waitForElementPresent(findTestObject('05_Opportunity Activities Repo/Page_Send EMail/Email activity created Success_Message'), GlobalVariable.MAX_Delay)

    WebUI.waitForElementNotPresent(findTestObject('05_Opportunity Activities Repo/Page_Send EMail/Email activity created Success_Message'), GlobalVariable.MAX_Delay)

    CustomKeywords.'com.ap.reusablemethods.Search.clickmyDesk'(findTestObject('Page_My Desk/My Desk_Button'))
}
catch (Exception e) {
    e.printStackTrace()

    WebUI.closeBrowser()

    GlobalVariable.previousTestFailed = true
} 

