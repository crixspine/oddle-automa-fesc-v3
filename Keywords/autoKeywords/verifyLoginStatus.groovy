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

public class verifyLoginStatus {
	
	//verify that customer is logged in with valid account
	@Keyword
	def verifyLoggedIn() {
		String hiUser = new String();
		hiUser = WebUI.getText(findTestObject('logIn/span_signin_SignedIn Name'));
		WebUI.verifyMatch(hiUser, GlobalVariable.fname + " " + GlobalVariable.lname, false);
	}
	
	//verify that customer is not logged in
	@Keyword
	def verifyLoggedOut() {
		String logIn = new String();
		logIn = WebUI.getText(findTestObject('logIn/span_Sign In'));
		WebUI.verifyMatch(logIn, "Sign In", false);
	}
}
