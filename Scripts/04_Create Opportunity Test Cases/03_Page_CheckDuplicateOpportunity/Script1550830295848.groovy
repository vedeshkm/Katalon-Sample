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
import java.util.concurrent.ThreadLocalRandom as ThreadLocalRandom

try {
    if (GlobalVariable.previousTestFailed) {
        WebUI.callTestCase(findTestCase('01_Common Test Cases/01_Page_Login'), [('password') : '', ('username') : ''], FailureHandling.STOP_ON_FAILURE)

        GlobalVariable.previousTestFailed = false
    }
    
    WebUI.waitForElementClickable(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/button_Notification_add-oprtnt'), GlobalVariable.MAX_Delay)

    WebUI.click(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/button_Notification_add-oprtnt'))

    WebUI.setText(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/FirstName_TextField'), 'Automation')

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/LastName_TextField'), 'Testing')

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/EmailAddress_TextField'), 'Automation@gmail.com')

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/MobilePhone_TextField'), '8971384078')

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/Home Phone_TextField'), '1(877)364-6208')

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/State'), 'AL', false)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/University_DropDownField'), 'Baylor', false)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/Vertical_DropDownField'), 'Business', false)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/Program_DropDownField'), 'Master of Business Administration', 
        false)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/Source_DropDownField'), 'Google', false)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/Campaign_DropDownField'), 'ACE_SAS', false)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/Notes_TextField'), 'Created For Automation Testing')

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/Create_Button'))

    WebUI.waitForElementVisible(findTestObject('04_Create Opportunity Test Cases Repo/Page_OpportunityDuplicateCheck/SendToDialer_Button'), GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('04_Create Opportunity Test Cases Repo/Page_OpportunityDuplicateCheck/SendToDialer_Button'), GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('04_Create Opportunity Test Cases Repo/Page_OpportunityDuplicateCheck/UseButton'), GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('04_Create Opportunity Test Cases Repo/Page_OpportunityDuplicateCheck/ViewInCRM'), GlobalVariable.MAX_Delay)

    WebUI.click(findTestObject('04_Create Opportunity Test Cases Repo/Page_Create New Lead/Cancel_Button'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.ap.reusablemethods.Search.clickmyDesk'(findTestObject('Page_My Desk/My Desk_Button'))
}
catch (Exception e) {
    e.printStackTrace()

    WebUI.closeBrowser()

    GlobalVariable.previousTestFailed = true
} 

