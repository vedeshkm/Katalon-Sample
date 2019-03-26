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
import io.cucumber.tagexpressions.TagExpressionParser.True as True
import org.openqa.selenium.Keys as Keys

try {
    if (GlobalVariable.previousTestFailed) {
        WebUI.callTestCase(findTestCase('01_Common Test Cases/01_Page_Login'), [('password') : '', ('username') : ''], FailureHandling.STOP_ON_FAILURE)

        GlobalVariable.previousTestFailed = false
    }
    
    println('******3' + GlobalVariable.previousTestFailed)

    WebUI.waitForElementNotVisible(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), GlobalVariable.MAX_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.clearText(findTestObject('Page_My Desk/Search_TextField'))

    WebUI.setText(findTestObject('Page_My Desk/Search_TextField'), '2441')

    WebUI.click(findTestObject('Page_My Desk/Search'))

    WebUI.waitForElementNotVisible(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), GlobalVariable.MAX_Delay, FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('02_Search Test Cases Repo/Page_Search Results/span_HEH ID'), GlobalVariable.MAX_Delay)

    WebUI.click(findTestObject('02_Search Test Cases Repo/Page_Search Results/span_HEH ID'))

    WebUI.waitForElementVisible(findTestObject('03_Bubble_Screen Test Cases Repo/01_Page_University Program_Bubble/span_University Program'), GlobalVariable.MAX_Delay)

    CustomKeywords.'com.ap.reusablemethods.Search.clickmyDesk'(findTestObject('Page_My Desk/My Desk_Button'))
}
catch (Exception e) {
    GlobalVariable.previousTestFailed = true

    throw e
    
    WebUI.closeBrowser()
} 

