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

WebUI.waitForElementVisible(findTestObject('signUp/input_Email-XPATH'), 0)

WebUI.setText(findTestObject('signUp/input_Email-XPATH'), GlobalVariable.email)

WebUI.setText(findTestObject('signUp/input_fName-XPATH'), GlobalVariable.fname)

WebUI.setText(findTestObject('signUp/input_lName-XPATH'), GlobalVariable.lname)

WebUI.setText(findTestObject('signUp/input_Password-XPATH'), GlobalVariable.password)

WebUI.click(findTestObject('signUp/button_signin-flow-signup-butt'))

WebUI.waitForElementVisible(findTestObject('logIn/a_ close signin window'), 0)

WebUI.click(findTestObject('logIn/a_ close signin window'))

CustomKeywords.'autoKeywords.verifyLoginStatus.verifyLoggedOut'()

