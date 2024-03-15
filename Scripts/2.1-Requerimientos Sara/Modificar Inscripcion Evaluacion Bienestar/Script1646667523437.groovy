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

WebUI.callTestCase(findTestCase('0-Login/0.4-LoginModificado/LoginFunSara'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/MÓDULOS/ModificarInscripcionEvaluacionBienestar/input_Empresa 1_form_templatej_idt24_input'), 
    'evento (bie)')

WebUI.click(findTestObject('Object Repository/MÓDULOS/ModificarInscripcionEvaluacionBienestar/li_evento (bie)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/ModificarInscripcionEvaluacionBienestar/select_-- Seleccione --Evento grupo Bienest_b4b5f4'), 
    '6ff382e60f8a4341b94ad9be3d7d64ee', true)

WebUI.click(findTestObject('Object Repository/MÓDULOS/ModificarInscripcionEvaluacionBienestar/td_Promocion y prevencion de la salud portal'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ModificarInscripcionEvaluacionBienestar/div_Evaluacin'))

WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/ModificarInscripcionEvaluacionBienestar/a_Evento'), 
    1)

WebUI.click(findTestObject('Object Repository/MÓDULOS/ModificarInscripcionEvaluacionBienestar/a_Evento'))

String hecho = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ModificarInscripcionEvaluacionBienestar/div_No Diligenciada'))

if (hecho == 'No Diligenciada') {
    WebUI.closeBrowser()
} else {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/ModificarInscripcionEvaluacionBienestar/span_Aplicada_ui-icon ui-icon-pencil'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/ModificarInscripcionEvaluacionBienestar/select_Diligenciada ParcialmenteNo Diligenciada'), 
        'P', true)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ModificarInscripcionEvaluacionBienestar/span_Aplicada_ui-icon ui-icon-check ui-c'))

    WebUI.closeBrowser()
}

