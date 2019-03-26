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

    WebUI.waitForElementClickable(findTestObject('03_Bubble_Screen Test Cases Repo/04_Page_Opportunity Grant_Bubble/Opportunity Grant_Bubble'), 
        GlobalVariable.MAX_Delay)

    WebUI.click(findTestObject('03_Bubble_Screen Test Cases Repo/00_Page_BubbleScreen/div_Opportunity Grant'))

    WebUI.waitForElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/04_Page_Opportunity Grant_Bubble/Available Promotions_Label'), 
        GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/04_Page_Opportunity Grant_Bubble/Available Promotions_Label'), 
        GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/04_Page_Opportunity Grant_Bubble/My Promotions_Label'), 
        GlobalVariable.MAX_Delay)

    WebUI.verifyElementPresent(findTestObject('03_Bubble_Screen Test Cases Repo/04_Page_Opportunity Grant_Bubble/Ineligible Promotions_Label'), 
        GlobalVariable.MAX_Delay)

    WebUI.click(findTestObject('03_Bubble_Screen Test Cases Repo/04_Page_Opportunity Grant_Bubble/Completed Programs_Button'))

    CustomKeywords.'com.ap.reusablemethods.Search.clickmyDesk'(findTestObject('Page_My Desk/My Desk_Button'))
}
catch (Exception e) {
    e.printStackTrace()

    throw e
    
    WebUI.closeBrowser()

    GlobalVariable.previousTestFailed = true
} 

