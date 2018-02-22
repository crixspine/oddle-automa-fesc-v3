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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.waitForElementVisible(findTestObject('externalSites/fb_input_email'), 0)

WebUI.setText(findTestObject('externalSites/fb_input_email'), GlobalVariable.email_fb)

WebUI.setText(findTestObject('externalSites/fb_input_pass'), GlobalVariable.password_fb)

WebUI.click(findTestObject('externalSites/fb_input_login'))

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementVisible(findTestObject('logIn/span_Sign In'), 0)

WebUI.click(findTestObject('logIn/span_Sign In'))

WebUI.waitForElementClickable(findTestObject('logIn/button_Facebook Connect'), 0)

WebUI.click(findTestObject('logIn/button_Facebook Connect'))

CustomKeywords.'autoKeywords.verifyLoginStatus.verifyLoggedIn'()

