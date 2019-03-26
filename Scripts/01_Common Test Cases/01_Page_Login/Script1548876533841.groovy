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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.waitForPageLoad(GlobalVariable.MAX_Delay)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('01_Common Test Cases Repo/Page_Login/AP_Logo'), GlobalVariable.MIN_Delay)

WebUI.verifyElementPresent(findTestObject('01_Common Test Cases Repo/Page_Login/STEP_Label'), GlobalVariable.MIN_Delay)

WebUI.verifyElementPresent(findTestObject('01_Common Test Cases Repo/Page_Login/Welcome Back_Label'), GlobalVariable.MIN_Delay)

WebUI.verifyElementPresent(findTestObject('01_Common Test Cases Repo/Page_Login/Sign in to continue_Label'), GlobalVariable.MIN_Delay)

WebUI.verifyElementPresent(findTestObject('01_Common Test Cases Repo/Page_Login/Username_Label'), GlobalVariable.MIN_Delay)

WebUI.verifyElementPresent(findTestObject('01_Common Test Cases Repo/Page_Login/Password_Label'), GlobalVariable.MIN_Delay)

WebUI.verifyElementPresent(findTestObject('01_Common Test Cases Repo/Page_Login/Remember Me_Label'), GlobalVariable.MIN_Delay)

WebUI.setText(findTestObject('01_Common Test Cases Repo/Page_Login/username_Textfield'), GlobalVariable.usn)

WebUI.setEncryptedText(findTestObject('01_Common Test Cases Repo/Page_Login/password_Texfield'), GlobalVariable.pwd)

WebUI.click(findTestObject('01_Common Test Cases Repo/Page_Login/login_Button'))

WebUI.waitForElementNotVisible(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), GlobalVariable.MAX_Delay, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Page_My Desk/My Desk_Button'), GlobalVariable.MAX_Delay)

