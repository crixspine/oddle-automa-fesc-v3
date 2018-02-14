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

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.mouseOver(findTestObject('accountSettings/div_signed header-btn user Hover On'))

WebUI.click(findTestObject('accountSettings/li Personal Info'))

WebUI.waitForElementClickable(findTestObject('accountSettings/a_Change your password'), 0)

WebUI.click(findTestObject('accountSettings/a_Change your password'))

WebUI.waitForElementVisible(findTestObject('accountSettings/div_Change Your Password'), 0)

WebUI.verifyElementPresent(findTestObject('accountSettings/div_Change Your Password'), 0)

WebUI.setText(findTestObject('accountSettings/input_Old Password'), 'wrong_pass_word')

WebUI.setText(findTestObject('accountSettings/input_New Password'), GlobalVariable.password_placeholder)

WebUI.setText(findTestObject('accountSettings/input_Confirm Password'), GlobalVariable.password_placeholder)

WebUI.click(findTestObject('accountSettings/button_Save Password Window'))

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.waitForElementVisible(findTestObject('accountSettings/span_Continue Shopping'), 0)

WebUI.click(findTestObject('accountSettings/span_Continue Shopping'))

WebUI.mouseOver(findTestObject('accountSettings/div_signed header-btn user Hover On'))

WebUI.waitForElementVisible(findTestObject('accountSettings/li_Sign Out'), 0)

WebUI.click(findTestObject('accountSettings/li_Sign Out'))

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

'Test login with new password'
WebUI.click(findTestObject('logIn/span_Sign In'))

WebUI.waitForElementClickable(findTestObject('accountSettings/input_Email'), 0)

WebUI.setText(findTestObject('logIn/input_email'), GlobalVariable.email)

WebUI.setText(findTestObject('logIn/input_password'), GlobalVariable.password_placeholder)

WebUI.click(findTestObject('logIn/button_signin-flow-Sign In'))

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.click(findTestObject('logIn/a_ close signin window'))

CustomKeywords.'autoKeywords.verifyLoginStatus.verifyLoggedOut'()

