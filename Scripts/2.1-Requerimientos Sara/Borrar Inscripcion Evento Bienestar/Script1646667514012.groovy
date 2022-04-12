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

WebUI.setText(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/input_Empresa 1_form_templatej_idt24_input'), 'event')

WebUI.click(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/li_evento (bie)'))

WebUI.selectOptionByValue(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/select_-- Seleccione --Evento grupo Bienest_b4b5f4'), 
    '6ff382e60f8a4341b94ad9be3d7d64ee', true)

String evento = WebUI.getText(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/td_Promocion y prevencion de la salud portal'))

if (evento == 'Promocion y prevencion de la salud portal') {
    WebUI.click(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/td_Promocion y prevencion de la salud portal'))

    WebUI.click(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/div_Participante'))

    WebUI.click(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/a_Individual'))

    String noRegistro = WebUI.getText(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/td_No se encontr registros'))

    if (noRegistro == 'No se encontró registros') {
        WebUI.closeBrowser()
    } else {
        WebUI.waitForElementClickable(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/td_90798514'), 0)

        WebUI.click(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/td_90798514'))

        WebUI.click(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/a_Cambiar Datos'))

        WebUI.click(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/a_Eliminar'))

        WebUI.click(findTestObject('MÓDULOS/BorrarInscripcionEventoBienestar/span_Si'))

        WebUI.closeBrowser()
    }
}

