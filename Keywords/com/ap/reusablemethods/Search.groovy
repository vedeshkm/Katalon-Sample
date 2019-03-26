package com.ap.reusablemethods
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class Search {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	@Keyword
	def search(String name) {
		try {

			WebUI.waitForElementPresent(findTestObject('Page_My Desk/Search_TextField'), 0, FailureHandling.STOP_ON_FAILURE)

			WebUI.setText(findTestObject('Page_My Desk/Search_TextField'), name, FailureHandling.STOP_ON_FAILURE)

			WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

			WebUI.click(findTestObject('Page_My Desk/Search'), FailureHandling.STOP_ON_FAILURE)

			WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

			WebUI.waitForElementNotVisible(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), 30, FailureHandling.STOP_ON_FAILURE)

			WebUI.waitForElementVisible(findTestObject('02_Search Test Cases Repo/Page_Search Results/span_Tricia Kelly'), 6, FailureHandling.STOP_ON_FAILURE)

			WebUI.click(findTestObject('02_Search Test Cases Repo/Page_Search Results/span_Tricia Kelly'), FailureHandling.STOP_ON_FAILURE)

			WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

			WebUI.waitForElementNotVisible(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), 30, FailureHandling.STOP_ON_FAILURE)

			WebUI.refresh()

			WebUI.refresh()

			WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

			WebUI.waitForElementClickable(findTestObject('Page_My Desk/My Desk_Button'), 5)
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickmyDesk(TestObject to) {
		try {
			WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

			WebUI.waitForElementNotVisible(findTestObject('02_Search Test Cases Repo/Page_Search Results/Loading_spinner'), 30, FailureHandling.STOP_ON_FAILURE)

			WebUI.waitForElementClickable(findTestObject('Page_My Desk/My Desk_Button'), 5)

			WebUI.click(findTestObject('Page_My Desk/My Desk_Button'), FailureHandling.STOP_ON_FAILURE)

			WebUI.refresh()

			WebUI.delay(GlobalVariable.MIN_Delay, FailureHandling.STOP_ON_FAILURE)
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	@Keyword
	def killProcess() {
		Runtime.getRuntime().exec('taskkill /f /im chrome.exe')
		Runtime.getRuntime().exec('taskkill /f /im chromedriver.exe')
		Runtime.getRuntime().exec('taskkill /f /im geckodriver.exe')
		Runtime.getRuntime().exec('taskkill /f /im IEDriverServer.exe')
		Runtime.getRuntime().exec('taskkill /f /im firefox.exe')
	}
}