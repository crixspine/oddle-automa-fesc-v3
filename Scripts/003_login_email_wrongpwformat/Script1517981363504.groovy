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

WebUI.verifyElementVisible(findTestObject('logIn/div_grid-parent signin window'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('logIn/input_email'), GlobalVariable.email)

WebUI.setText(findTestObject('logIn/input_password'), 'wrongft')

WebUI.click(findTestObject('logIn/button_signin-flow-Sign In'))

WebUI.verifyElementVisible(findTestObject('logIn/div_grid-parent signin window'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('logIn/a_ close signin window'), 0)

WebUI.click(findTestObject('logIn/a_ close signin window'))

CustomKeywords.'autoKeywords.verifyLoginStatus.verifyLoggedOut'()

