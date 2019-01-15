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

Mobile.tap(findTestObject('android.widget.ImageView7'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - instant_meINSTANT ME'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - instantme-icon'), 0)

Mobile.tap(findTestObject('android.widget.Button3'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton0 (4)'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton1'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton1'), 0)

Mobile.closeApplication()

