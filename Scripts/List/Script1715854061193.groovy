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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://trensentimen.my.id/login.html')

WebUI.setText(findTestObject('Object Repository/Page_Form Login/input_Login_email'), 'dimas@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Form Login/input_Login_password'), 'RigbBhfdqOBDK95asqKeHw==')

WebUI.click(findTestObject('Object Repository/Page_Form Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Daftar Sentimen'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Batal_showModalButton'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Logout_closeModalButton'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_PRESIDEN JANGAN DIPILIH OLEH RAKYAT    _3f7b2b'))

WebUI.closeBrowser()

