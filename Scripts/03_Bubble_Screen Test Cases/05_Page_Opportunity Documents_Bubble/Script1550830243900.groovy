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
    
    CustomKeywords.'com.ap.reusablemethods.Search.search'('tricia Kelly')

    WebUI.waitForElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/Opportunity Documents_Bubble'), 
        GlobalVariable.MAX_Delay)

    WebUI.click(findTestObject('03_Bubble_Screen Test Cases Repo/00_Page_BubbleScreen/div_Opportunity Documents'))

    WebUI.waitForElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/a_Decision Ready Documents'), 
        GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/a_File Complete Documents'), 
        GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/a_Not Required'), 
        GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/a_Decision Ready Documents'), 
        GlobalVariable.MAX_Delay)

    WebUI.click(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/a_Decision Ready Documents'))

    WebUI.verifyElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/div_Opportunity Documents  Dec'), 
        GlobalVariable.MAX_Delay)

    WebUI.delay(GlobalVariable.MIN_Delay)

    WebUI.click(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/a_File Complete Documents'))

    WebUI.verifyElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/div_Opportunity Documents  Fil'), 
        GlobalVariable.MAX_Delay)

    WebUI.delay(GlobalVariable.MIN_Delay)

    WebUI.click(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/a_Not Required'))

    WebUI.verifyElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/div_Opportunity Documents  Not'), 
        GlobalVariable.MAX_Delay)

    WebUI.delay(GlobalVariable.MIN_Delay)

    WebUI.click(findTestObject('03_Bubble_Screen Test Cases Repo/05_Page_Opportunity Documents_Bubble/button_Completed Programs_btn'))

    CustomKeywords.'com.ap.reusablemethods.Search.clickmyDesk'(findTestObject('Page_My Desk/My Desk_Button'))
}
catch (Exception e) {
    e.printStackTrace()

    throw e
    
    WebUI.closeBrowser()

    GlobalVariable.previousTestFailed = true
} 

