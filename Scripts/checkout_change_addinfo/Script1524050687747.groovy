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

WebUI.callTestCase(findTestCase('homepage_set_delivery'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

CustomKeywords.'autoKeywords.verifyCartStatus.isEmpty'()

'item 4 to be simple item'
WebUiBuiltInKeywords.waitForElementVisible(findTestObject('menuItem/button_Add Item 4'), 0)

'item 4 to be simple item'
WebUiBuiltInKeywords.click(findTestObject('menuItem/button_Add Item 4'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

CustomKeywords.'autoKeywords.verifyCartStatus.isNotEmpty'()

WebUI.waitForElementVisible(findTestObject('homePage/span_Checkout'), 0)

WebUI.click(findTestObject('homePage/span_Checkout'))

WebUI.waitForElementVisible(findTestObject('homePage/span_Proceed to checkout'), 0)

WebUI.click(findTestObject('homePage/span_Proceed to checkout'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('checkout/div_Checkout'))

WebUI.waitForElementVisible(findTestObject('checkout/button_Next-My Details'), 0)

WebUI.click(findTestObject('checkout/button_Next-My Details'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('checkout/button_Next-Delivery Info'), 0)

WebUI.click(findTestObject('checkout/button_Next-Delivery Info'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('checkout/label_Billing address is the s'), 0)

WebUI.waitForElementVisible(findTestObject('checkout/button_Next-Billing Address'), 0)

WebUI.click(findTestObject('checkout/button_Next-Billing Address'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('checkout/textarea_additionalInformation'), 0)

WebUI.setText(findTestObject('checkout/textarea_additionalInformation'), 'Test Additional Info')

WebUI.waitForElementVisible(findTestObject('checkout/button_Next-Add Info'), 0)

WebUI.click(findTestObject('checkout/button_Next-Add Info'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('checkout/label_I accept the terms and cond'), 0)

WebUI.click(findTestObject('checkout/label_I accept the terms and cond'))

WebUI.waitForElementVisible(findTestObject('checkout/button_Submit Order'), 0)

WebUI.click(findTestObject('checkout/button_Submit Order'))

WebUiBuiltInKeywords.delay(3)

WebUI.verifyElementPresent(findTestObject('checkout/h1_Thank You'), 0)

WebUI.waitForElementVisible(findTestObject('checkout/button_Return to Store'), 0)

WebUI.click(findTestObject('checkout/button_Return to Store'))

WebUiBuiltInKeywords.delay(3)

CustomKeywords.'autoKeywords.verifyCartStatus.isEmpty'()

