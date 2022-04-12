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

WebUI.callTestCase(findTestCase('0-Login/0.4-LoginModificado/Login_Servicio_Hoja_vida'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MÓDULOS/ServicioHojaVida/GenerarImprimirHojaVida/a_Generar'))

WebUI.click(findTestObject('MÓDULOS/ServicioHojaVida/GenerarImprimirHojaVida/td_formatoImpresionEspaol'))

WebUI.click(findTestObject('MÓDULOS/ServicioHojaVida/GenerarImprimirHojaVida/a_Descargar'))



WebUI.switchToWindowTitle('Portal SARA')

WebUI.click(findTestObject('MÓDULOS/ServicioHojaVida/GenerarImprimirHojaVida/span_CerrarPopupGenerar'))

WebUI.click(findTestObject('MÓDULOS/ServicioHojaVida/GenerarImprimirHojaVida/a_Imprimir'))

String confirmarImpresion = WebUI.getText(findTestObject('MÓDULOS/ServicioHojaVida/GenerarImprimirHojaVida/label_DeseaDescargarText'))

if (confirmarImpresion == 'Desea Descargar el formato unico de hoja de vida') {
    WebUI.click(findTestObject('MÓDULOS/ServicioHojaVida/GenerarImprimirHojaVida/a_Si'))

    

    WebUI.switchToWindowTitle('Portal SARA')

    WebUI.click(findTestObject('MÓDULOS/ServicioHojaVida/GenerarImprimirHojaVida/span_CerrarPopupImprimir'))

    
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

