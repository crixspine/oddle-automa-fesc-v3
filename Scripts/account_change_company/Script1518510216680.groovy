import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('login_email_successful'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('logIn/span_ns-close Notification'), 0)

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.waitForElementVisible(findTestObject('accountSettings/div_signed header-btn user Hover On'), 0)

WebUI.mouseOver(findTestObject('accountSettings/div_signed header-btn user Hover On'))

WebUI.waitForElementVisible(findTestObject('accountSettings/li Personal Info'), 0)

WebUI.click(findTestObject('accountSettings/li Personal Info'))

WebUI.verifyElementText(findTestObject('accountSettings/span_Company-XPATH'), GlobalVariable.company)

WebUI.waitForElementClickable(findTestObject('accountSettings/i_fa fa Edit Personal Settings'), 0)

WebUI.click(findTestObject('accountSettings/i_fa fa Edit Personal Settings'))

WebUI.waitForElementClickable(findTestObject('accountSettings/input_Company'), 0)

WebUI.setText(findTestObject('accountSettings/input_Company'), '123.co')

WebUI.waitForElementVisible(findTestObject('accountSettings/button_Save Edit Window'), 0)

WebUI.click(findTestObject('accountSettings/button_Save Edit Window'))

WebUI.waitForElementVisible(findTestObject('logIn/span_ns-close Notification'), 0)

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.verifyElementText(findTestObject('accountSettings/span_Company-XPATH'), '123.co')

WebUI.waitForElementVisible(findTestObject('accountSettings/span_Continue Shopping'), 0)

WebUI.click(findTestObject('accountSettings/span_Continue Shopping'))

WebUI.waitForElementVisible(findTestObject('accountSettings/div_signed header-btn user Hover On'), 0)

'Test complete and passed; change back to original company'
WebUI.mouseOver(findTestObject('accountSettings/div_signed header-btn user Hover On'))

WebUI.waitForElementVisible(findTestObject('accountSettings/li Personal Info'), 0)

WebUI.click(findTestObject('accountSettings/li Personal Info'))

WebUI.verifyElementText(findTestObject('accountSettings/span_Company-XPATH'), '123.co')

WebUI.waitForElementClickable(findTestObject('accountSettings/i_fa fa Edit Personal Settings'), 0)

WebUI.click(findTestObject('accountSettings/i_fa fa Edit Personal Settings'))

WebUI.waitForElementClickable(findTestObject('accountSettings/input_Company'), 0)

WebUI.setText(findTestObject('accountSettings/input_Company'), GlobalVariable.company)

WebUI.waitForElementVisible(findTestObject('accountSettings/button_Save Edit Window'), 0)

WebUI.click(findTestObject('accountSettings/button_Save Edit Window'))

WebUI.verifyElementText(findTestObject('accountSettings/span_Company-XPATH'), GlobalVariable.company)

