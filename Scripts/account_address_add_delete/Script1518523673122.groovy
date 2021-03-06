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

'Ensure account only has 1 address; must be different from test input'
WebUI.callTestCase(findTestCase('login_email_successful'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('logIn/span_ns-close Notification'), 0)

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.waitForElementVisible(findTestObject('accountSettings/div_signed header-btn user Hover On'), 0)

WebUI.mouseOver(findTestObject('accountSettings/div_signed header-btn user Hover On'))

WebUI.waitForElementVisible(findTestObject('accountSettings/li Personal Info'), 0)

WebUI.click(findTestObject('accountSettings/li Personal Info'))

'Add address'
WebUI.waitForElementClickable(findTestObject('accountSettings/i_fa fa-plus add-new-address'), 0)

WebUI.click(findTestObject('accountSettings/i_fa fa-plus add-new-address'))

WebUI.waitForElementClickable(findTestObject('accountSettings/input_addressOne'), 0)

WebUI.setText(findTestObject('accountSettings/input_addressOne'), '195 Pearl Hill\'s Terrace')

WebUI.setText(findTestObject('accountSettings/input_addressTwo'), '#03-05')

WebUI.setText(findTestObject('accountSettings/input_addressPostal'), '168976')

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('accountSettings/button_Save Address Window'), 0)

WebUI.waitForElementClickable(findTestObject('accountSettings/button_Save Address Window'), 0)

WebUI.click(findTestObject('accountSettings/button_Save Address Window'))

WebUI.waitForElementClickable(findTestObject('logIn/span_ns-close Notification'), 0)

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.verifyElementText(findTestObject('accountSettings/td_Address 2'), '195 Pearl Hill\'s Terrace #03-05 Singapore 168976')

WebUI.waitForElementVisible(findTestObject('accountSettings/a_Delete Address 2'), 0)

'Delete Address'
WebUI.click(findTestObject('accountSettings/a_Delete Address 2'))

WebUI.acceptAlert()

WebUI.verifyElementNotPresent(findTestObject('accountSettings/td_Address 2'), 0)

