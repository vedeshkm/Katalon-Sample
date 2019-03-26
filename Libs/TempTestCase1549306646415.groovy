import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\SHIVAN~1.MS\\AppData\\Local\\Temp\\2\\Katalon\\20190204_125726\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.click(findTestObject(\'Page_DOLA View Manager  Unified Age/span_Shivananda MS_caret\'))\n\nWebUI.click(findTestObject(\'Page_DOLA View Manager  Unified Age/a_Manager Tools\'))\n\nWebUI.click(findTestObject(\'Page_DOLA View Manager  Unified Age/span_View List\'))\n\nWebUI.click(findTestObject(\'Page_DOLA View Manager  Unified Age/span_Team List\'))\n\nWebUI.click(findTestObject(\'Page_DOLA View Manager  Unified Age/span_Mass Transfer\'))\n\nWebUI.click(findTestObject(\'Page_DOLA View Manager  Unified Age/span_View List\'))\n\nWebUI.click(findTestObject(\'Page_DOLA View Manager  Unified Age/span_View List\'))\n\nWebUI.click(findTestObject(\'Page_DOLA View Manager  Unified Age/button_Add New\'))\n\nWebUI.setText(findTestObject(\'Page_View Details  Unified Agent De/input_View Definition_form-con\'), \'test shiva\')\n\nWebUI.setText(findTestObject(\'Page_View Details  Unified Agent De/textarea_View Definition_form-\'), \'test\')\n\nWebUI.click(findTestObject(\'Page_View Details  Unified Agent De/button_Add Columns\'))\n\nWebUI.selectOptionByValue(findTestObject(\'Page_View Details  Unified Agent De/select_Select Column          \'), \'19: Object\', \n    true)\n\nWebUI.selectOptionByValue(findTestObject(\'Page_View Details  Unified Agent De/select_Select Sort Order      \'), \'asc\', true)\n\nWebUI.click(findTestObject(\'Page_View Details  Unified Agent De/button_Add\'))\n\nWebUI.scrollToElement(findTestObject(\'Page_View Details  Unified Agent De/span_Add Filters\'), 0)\n\nWebUI.click(findTestObject(\'Page_View Details  Unified Agent De/span_Add Filters\'))\n\nWebUI.selectOptionByValue(findTestObject(\'Page_View Details  Unified Agent De/select_Select Field           \'), \'{\"UADClientCaption\":\"University\",\"SortOrder\":0,\"SortAscending\":0,\"DOLAColumnId\":26,\"EntityName\":\"new_university\",\"CRMFieldName\":\"new_universitycode\",\"LinkExpression\":\"<link-entity name=\\\'new_university\\\' from=\\\'new_universityid\\\' to=\\\'new_universityid\\\' alias=\\\'new_university\\\' {JOIN}>{SORT}<attribute name=\\\'new_name\\\'/>{UniversityAttributes}</link-entity>\",\"AttributeTypeName\":\"String\",\"ConditionGroupId\":0,\"Condition\":0}\', \n    true)\n\nWebUI.selectOptionByValue(findTestObject(\'Page_View Details  Unified Agent De/select_Select Operators       \'), \'{\"OperatorId\":5,\"OperatorName\":\"Any\",\"DOLAColumnId\":26}\', \n    true)\n\nWebUI.click(findTestObject(\'Page_View Details  Unified Agent De/span_Add\'))\n\nWebUI.setText(findTestObject(\'Page_View Details  Unified Agent De/input_Teams_tags\'), \'tes\')\n\nWebUI.click(findTestObject(\'Page_View Details  Unified Agent De/span_Final test\'))\n\nWebUI.click(findTestObject(\'Page_View Details  Unified Agent De/button_Save\'))\n\nWebUI.setText(findTestObject(\'Page_DOLA View Manager  Unified Age/input_Views_teamlist-input ng-\'), \'shiva\')\n\nWebUI.click(findTestObject(\'Page_DOLA View Manager  Unified Age/span_test shiva\'))\n\nWebUI.scrollToElement(findTestObject(\'Page_View Details  Unified Agent De/button_Delete\'), 0)\n\nWebUI.click(findTestObject(\'Page_View Details  Unified Agent De/button_Delete\'))\n\nWebUI.click(findTestObject(\'Page_View Details  Unified Agent De/button_Yes\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

