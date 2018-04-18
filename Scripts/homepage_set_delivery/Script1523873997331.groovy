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

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('homePage/a_Pickup'), 0)

WebUiBuiltInKeywords.click(findTestObject('homePage/a_Pickup'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('homePage/a_Delivery'), 0)

WebUiBuiltInKeywords.click(findTestObject('homePage/a_Delivery'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('homePage/div_Delivery Address'), 0)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('homePage/div_Delivery Address'), 0)

WebUiBuiltInKeywords.click(findTestObject('homePage/div_Delivery Address'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('logIn/button_signin-flow-Save'), 0)

WebUiBuiltInKeywords.click(findTestObject('logIn/button_signin-flow-Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUiBuiltInKeywords.waitForElementClickable(findTestObject('homePage/span_Continue Shopping'), 0)

WebUiBuiltInKeywords.click(findTestObject('homePage/span_Continue Shopping'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('homePage/a_Change dates and time Delivery'), 0)

WebUiBuiltInKeywords.click(findTestObject('homePage/a_Change dates and time Delivery'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('homePage/span_Continue Shopping'), 0)

WebUiBuiltInKeywords.click(findTestObject('homePage/span_Continue Shopping'), FailureHandling.STOP_ON_FAILURE)

