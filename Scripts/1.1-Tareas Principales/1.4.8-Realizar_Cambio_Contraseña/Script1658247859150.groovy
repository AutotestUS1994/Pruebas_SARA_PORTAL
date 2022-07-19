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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('0-Login/0.4-LoginModificado/LoginJefeCambioContraseña'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MÓDULOS/RealizarCambioContraseña/input_Nueva Clave_form_cambioContraseniapas_322e59'), 'saraadmin2')

WebUI.setEncryptedText(findTestObject('MÓDULOS/RealizarCambioContraseña/input_Confirmar Clave_form_cambioContraseni_852154'), 
    'MkG4/TYiCFBY97LGcUg2WA==')

WebUI.click(findTestObject('MÓDULOS/RealizarCambioContraseña/a_Actualizar'))

WebUI.callTestCase(findTestCase('0-Login/0.4-LoginModificado/LoginJefe-Contras2'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementNotVisible(findTestObject('MÓDULOS/RealizarCambioContraseña/iframe_Recuperar Clave Preguntas_7F07D45170_d61892'), 
    1)) {
    WebUI.navigateToUrl('http://192.168.2.19:8480/PortalSara/sitio/portalEmpleados/cambiarClave')

    WebUI.setText(findTestObject('MÓDULOS/RealizarCambioContraseña/input_Nueva Clave_form_cambioContraseniapas_322e59'), 
        'saraadmin1')
} else {
    WebUI.setText(findTestObject('MÓDULOS/RealizarCambioContraseña/input_Nueva Clave_form_cambioContraseniapas_322e59'), 
        'saraadmin1')
}

WebUI.setEncryptedText(findTestObject('MÓDULOS/RealizarCambioContraseña/input_Confirmar Clave_form_cambioContraseni_852154'), 
    'MkG4/TYiCFC3cb2driP7+Q==')

WebUI.click(findTestObject('MÓDULOS/RealizarCambioContraseña/a_Actualizar'))

WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

