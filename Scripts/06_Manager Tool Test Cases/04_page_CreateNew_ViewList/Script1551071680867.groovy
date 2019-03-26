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

    WebUI.waitForElementVisible(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools/View List_Button'), 
        GlobalVariable.MAX_Delay)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools/View List_Button'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/Label_View Details'), 
        0)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_ViewList/button_Add New'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/01_View Definition Field/Label_View Definition'), 
        GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/02_Columns Field/Label_Columns'), 
        GlobalVariable.MAX_Delay)

    WebUI.setText(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/01_View Definition Field/View Name_TextField'), 
        'Automation Testing')

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/01_View Definition Field/View Name_Description'), 
        'Creating for Automation Testing Purpose')

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/02_Columns Field/Add Columns_Button'))

    WebUI.selectOptionByLabel(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/02_Columns Field/select_Select Column_DropDown'), 
        'Name', true)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/02_Columns Field/select_Select Sort Order_DropDown'), 
        'Ascending (A-Z)', false)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/02_Columns Field/SaveColumns_Button'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/04_Team_Field/Teams_TextField'), 
        GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/03_Filters Field/Label_Filters'), 
        GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/04_Team_Field/LabelTeams'), 
        GlobalVariable.MAX_Delay)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/03_Filters Field/Add Filters_Button'))

    WebUI.selectOptionByLabel(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/03_Filters Field/Select FilterField _DropDown'), 
        'University', false)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/03_Filters Field/SelectFilterOperators_DropDown'), 
        'Any', false)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/03_Filters Field/Save_Filter_Button'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/04_Team_Field/Teams_TextField'), 
        'Final test')

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/Save_New_ViewList_Button'), 
        GlobalVariable.MAX_Delay)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/Save_New_ViewList_Button'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/NewViewListCreatedSuccessfully_Messagediv_Success'), 
        GlobalVariable.MAX_Delay)

    WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.waitForElementNotVisible(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_ViewList/Page_CreateNew_ViewList/NewViewListCreatedSuccessfully_Messagediv_Success'), 
        GlobalVariable.MAX_Delay)

    CustomKeywords.'com.ap.reusablemethods.Search.clickmyDesk'(findTestObject('Page_My Desk/My Desk_Button'))
}
catch (Exception e) {
    GlobalVariable.previousTestFailed = true

    throw e
    
    WebUI.closeBrowser()
} 

