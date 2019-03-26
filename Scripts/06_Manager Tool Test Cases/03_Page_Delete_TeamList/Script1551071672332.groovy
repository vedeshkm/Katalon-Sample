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

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools/Team List_Button'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_TeamList/Page_TeamList/Team List Search Text Box'), 
        GlobalVariable.TeamListName)

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_TeamList/Page_Delete_TeamList/span_Automation Testing'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.scrollToPosition(0, 0)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_TeamList/Page_Delete_TeamList/button_Delete'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_TeamList/Page_Delete_TeamList/div_Do you really want to dele'), 
        GlobalVariable.MAX_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_TeamList/Page_Delete_TeamList/Label_Confirmation'), 
        GlobalVariable.MAX_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_TeamList/Page_Delete_TeamList/div_Do you really want to dele'), 
        GlobalVariable.MAX_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_TeamList/Page_Delete_TeamList/Pop Up Close button(Cross Button)'), 
        0)

    WebUI.click(findTestObject('06_Manager Tool Test Cases Repo/Page_Manager Tools_TeamList/Page_Delete_TeamList/PopUp_Yes_Button'))

    WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'com.ap.reusablemethods.Search.clickmyDesk'(findTestObject('Page_My Desk/My Desk_Button'))
}
catch (Exception e) {
    e.printStackTrace()

    WebUI.closeBrowser()

    GlobalVariable.previousTestFailed = true
} 

