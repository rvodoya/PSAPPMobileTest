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

Mobile.startApplication('C:\\Users\\netzon.rhobert\\Desktop\\Gycom\\psapp-debug.apk', false)

Mobile.tap(findTestObject('android.widget.ImageView11 (1)'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton0 (7)'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton6'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton1 (6)'), 0)

Mobile.tap(findTestObject('android.widget.TextView1 - Face'), 0)

Mobile.tap(findTestObject('android.widget.TextView7 - Trunk (front)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Enter comment'), 'Lorem ipsum dolor sit amet.', 0)

Mobile.tap(findTestObject('android.widget.ImageButton1 (7)'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton2'), 0)

Mobile.closeApplication()

