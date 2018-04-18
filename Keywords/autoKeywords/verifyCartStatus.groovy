package autoKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class verifyCartStatus {

	//check that cart is empty
	@Keyword
	def isEmpty() {
		String cartText = new String();
		cartText = WebUI.getText(findTestObject('homePage/div_CartStatusCheck'));
		WebUI.verifyMatch(cartText, "No item has been added.", false);
	}
	
	//check that cart is not empty
	@Keyword
	def isNotEmpty() {
		String cartText = new String();
		cartText = WebUI.getText(findTestObject('homePage/div_CartStatusCheck'));
		WebUI.verifyNotMatch(cartText, "No item has been added.", false);
	}
}
