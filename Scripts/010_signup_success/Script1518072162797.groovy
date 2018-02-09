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

CustomKeywords.'autoKeywords.goToHomepageMax.goToHomepage'()

WebUI.click(findTestObject('logIn/span_Sign In'))

WebUI.waitForElementVisible(findTestObject('signUp/span_Sign up-XPATH'), 0)

WebUI.click(findTestObject('signUp/span_Sign up-XPATH'))

str1 = CustomKeywords.'autoKeywords.RandomStrGen.randomStr'('abcdefghijklmnopqrstuvwxyz1234567890', 10)

str2 = CustomKeywords.'autoKeywords.RandomStrGen.randomStr'('abcdefghijklmnopqrstuvwxyz1234567890', 10)

WebUI.waitForElementVisible(findTestObject('signUp/input_Email-XPATH'), 0)

WebUI.setText(findTestObject('signUp/input_Email-XPATH'), ((str1 + '@') + str2) + '.com')

WebUI.setText(findTestObject('signUp/input_fName-XPATH'), GlobalVariable.fname)

WebUI.setText(findTestObject('signUp/input_lName-XPATH'), GlobalVariable.lname)

WebUI.setText(findTestObject('signUp/input_Password-XPATH'), GlobalVariable.password)

WebUI.click(findTestObject('signUp/button_signin-flow-signup-butt'))

WebUI.click(findTestObject('logIn/a_ close signin window'))

CustomKeywords.'autoKeywords.verifyLoginStatus.verifyLoggedIn'()

'logout and re-login with new account'
WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.mouseOver(findTestObject('accountSettings/div_signed header-btn user Hover On'))

WebUI.waitForElementVisible(findTestObject('accountSettings/li_Sign Out'), 0)

WebUI.click(findTestObject('accountSettings/li_Sign Out'))

WebUI.delay(1)

CustomKeywords.'autoKeywords.verifyLoginStatus.verifyLoggedOut'()

WebUI.click(findTestObject('logIn/span_ns-close Notification'))

WebUI.click(findTestObject('logIn/span_Sign In'))

WebUI.waitForElementVisible(findTestObject('logIn/input_email'), 0)

WebUI.setText(findTestObject('logIn/input_email'), ((str1 + '@') + str2) + '.com')

WebUI.setText(findTestObject('logIn/input_password'), GlobalVariable.password)

WebUI.click(findTestObject('logIn/button_signin-flow-Sign In'))

WebUI.click(findTestObject('logIn/a_ close signin window'))

CustomKeywords.'autoKeywords.verifyLoginStatus.verifyLoggedIn'()

