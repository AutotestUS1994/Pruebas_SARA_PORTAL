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

WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoExiste/a_RRHH'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoExiste/img'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoExiste/select_SeleccionarTecnologia'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoExiste/select_SeleccionarTecnologia'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoExiste/select_Seleccionar40 Mil Staff (20145)Aboga_2f7a39'), 
    98, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoExiste/select_SeleccionarPlanta Dinamica          _bb6977'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoExiste/select_Seleccionar11111CARGO EXISTECOMPENSA_ce44eb'), 
    2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoExiste/a_Continuar'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoExiste/a_Continuar_1'))

String ver1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoExiste/span_Se han guardado los datos satisfactoriamente'))

String ver2 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoExiste/span_Ha finalizado el proceso'))
if(ver1 == 'Se han guardado los datos satisfactoriamente.' && ver2 == 'Ha finalizado el proceso.') {
	WebUI.closeBrowser()
}

