import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\netzon.rhobert\\Desktop\\Gycom\\psapp-debug.apk', true)

Mobile.tap(findTestObject('android.widget.Button0 - next (3)'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Psoriasis (2)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Whats your name (2)'), 'Glimmer', 0)

Mobile.tap(findTestObject('android.widget.EditText1 - When is your birth date (1)'), 0)

Mobile.tap(findTestObject('android.widget.RadioButton1 - female (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button2 - next (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button2 - No thank you not right now (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - next (4)'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - No (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - No (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - No (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - No (1)'), 0)

Mobile.closeApplication()

