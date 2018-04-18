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

WebUiBuiltInKeywords.delay(1)

WebUI.mouseOver(findTestObject('menuItem/div_cart-check-detail-btn-cont Hover On'))

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('menuItem/i_item 1 image'), 0)

WebUiBuiltInKeywords.click(findTestObject('menuItem/i_item 1 image'))

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('menuItem/a_Close Window'), 0)

WebUiBuiltInKeywords.click(findTestObject('menuItem/a_Close Window'))

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('menuItem/div_item 1 name'), 0)

WebUiBuiltInKeywords.click(findTestObject('menuItem/div_item 1 name'))

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('menuItem/a_Close Window'), 0)

WebUiBuiltInKeywords.click(findTestObject('menuItem/a_Close Window'))

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('menuItem/div_item 1 description'), 0)

WebUiBuiltInKeywords.click(findTestObject('menuItem/div_item 1 description'))

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('menuItem/a_Close Window'), 0)

WebUiBuiltInKeywords.click(findTestObject('menuItem/a_Close Window'))

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('menuItem/button_Add Item 1'), 0)

WebUiBuiltInKeywords.click(findTestObject('menuItem/button_Add Item 1'))

WebUiBuiltInKeywords.delay(1)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('menuItem/a_Close Window'), 0)

WebUiBuiltInKeywords.click(findTestObject('menuItem/a_Close Window'))

