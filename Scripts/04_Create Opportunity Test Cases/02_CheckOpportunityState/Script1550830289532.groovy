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
    
    CustomKeywords.'com.ap.reusablemethods.Search.search'('tricia kelly')

    WebUI.waitForPageLoad(GlobalVariable.MAX_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementNotVisible(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), 50, FailureHandling.STOP_ON_FAILURE)

    WebUI.check(findTestObject('04_Create Opportunity Test Cases Repo/Page_Opportunity_State_Change/Current State_slider_Button'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(50)

    WebUI.verifyElementPresent(findTestObject('04_Create Opportunity Test Cases Repo/Page_Opportunity_State_Change/Page_Opportunity_Closed_PopUP/Reason for closing_PopUP_Title'), 
        0)

    WebUI.verifyElementPresent(findTestObject('04_Create Opportunity Test Cases Repo/Page_Opportunity_State_Change/Page_Opportunity_Closed_PopUP/Reason for closing_PopUP_Status_Label'), 
        0)

    WebUI.selectOptionByLabel(findTestObject('04_Create Opportunity Test Cases Repo/Page_Opportunity_State_Change/Page_Opportunity_Closed_PopUP/Select_DropDown_Reason for closing'), 
        'Personal - Family issues', false)

    WebUI.click(findTestObject('04_Create Opportunity Test Cases Repo/Page_Opportunity_State_Change/Page_Opportunity_Closed_PopUP/Reason for closing_PopUP_Confirm_button'))

    WebUI.verifyElementPresent(findTestObject('04_Create Opportunity Test Cases Repo/Page_Opportunity_State_Change/Page_Opportunity_Closed_PopUP/Opportunity closed succes_Message'), 
        0)

    WebUI.delay(5)

    WebUI.click(findTestObject('04_Create Opportunity Test Cases Repo/Page_Opportunity_State_Change/Current State_slider_Button'))

    WebUI.verifyElementPresent(findTestObject('04_Create Opportunity Test Cases Repo/Page_Opportunity_State_Change/Page_OpportunityReopenPopUP/Reopen Opportunity_Title'), 
        0)

    WebUI.verifyElementPresent(findTestObject('04_Create Opportunity Test Cases Repo/Page_Opportunity_State_Change/Page_OpportunityReopenPopUP/Are you sure you want to reopen_Message_Label'), 
        0)

    WebUI.click(findTestObject('04_Create Opportunity Test Cases Repo/Page_Opportunity_State_Change/Page_OpportunityReopenPopUP/Reopen Opportunity_Pop_Up_Yes_Button'))

    WebUI.click(findTestObject('Page_My Desk/My Desk_Button'))
}
catch (Exception e) {
    e.printStackTrace()

    WebUI.closeBrowser()

    GlobalVariable.previousTestFailed = true
} 

