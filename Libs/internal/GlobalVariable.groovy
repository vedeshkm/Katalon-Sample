package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object MAX_Delay
     
    /**
     * <p></p>
     */
    public static Object MIN_Delay
     
    /**
     * <p></p>
     */
    public static Object previousTestFailed
     
    /**
     * <p></p>
     */
    public static Object usn
     
    /**
     * <p></p>
     */
    public static Object pwd
     
    /**
     * <p></p>
     */
    public static Object TeamListName
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['URL' : 'http://uadqa.academicpartnerships.com/user/login', 'MAX_Delay' : 40, 'MIN_Delay' : 1, 'previousTestFailed' : false, 'usn' : 'shivananda.ms@best.local', 'pwd' : 'HyK3jqptw5Wyv0GsVRLcxg==', 'TeamListName' : 'Automation Testing'])
        allVariables.put('DEV_Environment', allVariables['default'] + ['URL' : 'http://uaddev.academicpartnerships.com/user/login'])
        allVariables.put('QA_Environment', allVariables['default'] + ['URL' : 'http://uadqa.academicpartnerships.com/user/login'])
        allVariables.put('UAT_Environment', allVariables['default'] + ['URL' : 'http://uaduat.academicpartnerships.com/user/login'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        URL = selectedVariables["URL"]
        MAX_Delay = selectedVariables["MAX_Delay"]
        MIN_Delay = selectedVariables["MIN_Delay"]
        previousTestFailed = selectedVariables["previousTestFailed"]
        usn = selectedVariables["usn"]
        pwd = selectedVariables["pwd"]
        TeamListName = selectedVariables["TeamListName"]
        
    }
}
