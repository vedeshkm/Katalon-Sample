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
    
    WebUI.callTestCase(findTestCase('02_Search Test Cases/01_Page_MyDesk_SearchByName'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('05_Opportunity Activities Repo/Page_TakeCall_/Take Call_Button'))

    WebUI.delay(1)

    WebUI.waitForElementNotPresent(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), 2)

    WebUI.verifyElementPresent(findTestObject('05_Opportunity Activities Repo/Page_TakeCall_/Call From_Label'), 0)

    WebUI.verifyElementPresent(findTestObject('05_Opportunity Activities Repo/Page_TakeCall_/i_Call From_pinned_Label'), 0)

    WebUI.verifyElementPresent(findTestObject('05_Opportunity Activities Repo/Page_TakeCall_/PhoneCall_Icon'), 0)

    WebUI.selectOptionByLabel(findTestObject('05_Opportunity Activities Repo/Page_TakeCall_/Topic_DropDown'), 'Academic', false)

    WebUI.selectOptionByLabel(findTestObject('05_Opportunity Activities Repo/Page_TakeCall_/Sub-Topic_DropDown'), 'Grade Dispute', false)

    WebUI.setText(findTestObject('05_Opportunity Activities Repo/Page_TakeCall_/Subject_TextField'), 'test')

    WebUI.setText(findTestObject('05_Opportunity Activities Repo/Page_TakeCall_/Description_TextField'), 'Automation')

    WebUI.click(findTestObject('05_Opportunity Activities Repo/Page_TakeCall_/Save_Button'))

    WebUI.delay(1)

    WebUI.waitForElementNotPresent(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), 2)

    WebUI.click(findTestObject('Page_My Desk/My Desk_Button'))

    WebUI.delay(20)

    WebUI.click(findTestObject('Page_My Desk/My Desk_Button'))
}
catch (Exception e) {
    e.printStackTrace()

    WebUI.closeBrowser()

    GlobalVariable.previousTestFailed = true
} 

