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

CustomKeywords.'autoKeywords.verifyCartStatus.isEmpty'()

'item 4 to be simple item'
WebUiBuiltInKeywords.waitForElementVisible(findTestObject('menuItem/button_Add Item 4'), 0)

'item 4 to be simple item'
WebUiBuiltInKeywords.click(findTestObject('menuItem/button_Add Item 4'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

CustomKeywords.'autoKeywords.verifyCartStatus.isNotEmpty'()

WebUI.waitForElementVisible(findTestObject('homePage/span_Checkout'), 0)

WebUI.click(findTestObject('homePage/span_Checkout'))

WebUI.waitForElementVisible(findTestObject('checkout/input_promo-code-textbox'), 0)

'ensure promocode is available'
WebUI.setText(findTestObject('checkout/input_promo-code-textbox'), GlobalVariable.promocode)

WebUI.waitForElementVisible(findTestObject('checkout/button_Apply Code'), 0)

WebUI.click(findTestObject('checkout/button_Apply Code'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('checkout/label_1 Off Promo Code'), 0)

WebUI.waitForElementVisible(findTestObject('homePage/span_Next After Promo Selected'), 0)

WebUI.click(findTestObject('homePage/span_Next After Promo Selected'))

WebUI.waitForElementVisible(findTestObject('homePage/span_Proceed to checkout'), 0)

WebUI.click(findTestObject('homePage/span_Proceed to checkout'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('checkout/div_Checkout'))

