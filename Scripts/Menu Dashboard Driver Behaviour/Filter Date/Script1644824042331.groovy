import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Repository Menu Dashboard Behaviour/Field Date Start'))

String DateStart = CustomKeywords.'SetDate.addBeforeToday'('')

WebUI.setText(findTestObject('Repository Menu Dashboard Behaviour/Field Date Start'), DateStart)

WebUI.click(findTestObject('Repository Menu Dashboard Behaviour/Field Date End'))

WebUI.click(findTestObject('Repository Menu Dashboard Behaviour/Combobox Section'))

WebUI.setText(findTestObject('Repository Menu Dashboard Behaviour/text Section Filter'), 'BMO - FUEL TRUCK')

WebUI.sendKeys(findTestObject('Repository Menu Dashboard Behaviour/text Section Filter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Repository Menu Dashboard Behaviour/Combobox Deviasi'))

WebUI.setText(findTestObject('Repository Menu Dashboard Behaviour/Text Deviasi Filter'), 'Driver Fatigue')

WebUI.sendKeys(findTestObject('Repository Menu Dashboard Behaviour/Text Deviasi Filter'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Repository Menu Dashboard Behaviour/Button Filter'))

if (WebUI.verifyElementPresent(findTestObject('Repository Menu Dashboard Behaviour/Graph Top 5 UnsafeAct'), 5) == true) {
    println('OK')
} else {
    println('Fail')
}

WebUI.scrollToPosition(0, 300)

WebUI.delay(5)

WebUI.scrollToPosition(0, 600)

WebUI.delay(5)

WebUI.scrollToPosition(0, 0)

