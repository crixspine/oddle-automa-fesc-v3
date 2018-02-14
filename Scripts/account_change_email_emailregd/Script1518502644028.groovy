import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('login_email_successful'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.mouseOver(findTestObject('accountSettings/div_signed header-btn user Hover On'))

WebUI.click(findTestObject('accountSettings/li Personal Info'))

WebUI.verifyElementText(findTestObject('accountSettings/span_Email-XPATH'), GlobalVariable.email)

WebUI.click(findTestObject('accountSettings/i_fa fa Edit Personal Settings'))

WebUI.waitForElementClickable(findTestObject('accountSettings/input_Email'), 0)

WebUI.setText(findTestObject('accountSettings/input_Email'), GlobalVariable.email_regd)

WebUI.waitForElementVisible(findTestObject('accountSettings/button_Save Edit Window'), 0)

WebUI.click(findTestObject('accountSettings/button_Save Edit Window'))

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.verifyElementText(findTestObject('accountSettings/span_Email-XPATH'), GlobalVariable.email)

WebUI.waitForElementVisible(findTestObject('accountSettings/span_Continue Shopping'), 0)

WebUI.click(findTestObject('accountSettings/span_Continue Shopping'))

WebUI.mouseOver(findTestObject('accountSettings/div_signed header-btn user Hover On'))

WebUI.waitForElementVisible(findTestObject('accountSettings/li_Sign Out'), 0)

WebUI.click(findTestObject('accountSettings/li_Sign Out'))

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.callTestCase(findTestCase('login_email_successful'), [:], FailureHandling.STOP_ON_FAILURE)

