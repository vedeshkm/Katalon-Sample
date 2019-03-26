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
    
    WebUI.callTestCase(findTestCase('01_Common Test Cases/02_Page_DolaView'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools/View List_Button'), GlobalVariable.MAX_Delay)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools/Mass Transfer_Button'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_MassTransfer/01_Page_MassTransfer/Add Filters_Button'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_MassTransfer/01_Page_MassTransfer/Filters_Label'), 
        0)

    WebUI.verifyElementPresent(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_MassTransfer/01_Page_MassTransfer/Opportunity Mass Transfer_Label'), 
        0)

    WebUI.selectOptionByLabel(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_MassTransfer/02_Page_AddFilter/Select Field_DropDown'), 
        'University', false)

    WebUI.selectOptionByLabel(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_MassTransfer/02_Page_AddFilter/Select Operators_DropDown'), 
        'Equals', false)

    WebUI.selectOptionByLabel(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_MassTransfer/02_Page_AddFilter/select_Select Value'), 
        'Baylor', false)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_MassTransfer/02_Page_AddFilter/Save Filter_Button'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_MassTransfer/01_Page_MassTransfer/Next_Button'))

    WebUI.waitForElementNotVisible(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), GlobalVariable.MAX_Delay, 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_MassTransfer/03_Page_FilterResult/button_View Details'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.check(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_MassTransfer/03_Page_FilterResult/div_1'))

    WebUI.delay(10)

    CustomKeywords.'com.ap.reusablemethods.Search.clickmyDesk'(findTestObject('Page_My Desk/My Desk_Button'))
}
catch (Exception e) {
    GlobalVariable.previousTestFailed = true

    throw e
    
    WebUI.closeBrowser()
} 

