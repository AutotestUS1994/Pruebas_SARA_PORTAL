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

WebUI.callTestCase(findTestCase('0-Login/0.1-LoginFun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarReporteAsociadoEjecucionReporte/a'))

WebUI.getText(findTestObject('Object Repository/MÓDULOS/ConsultarReporteAsociadoEjecucionReporte/td_REPORTE DE NOMINA'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarReporteAsociadoEjecucionReporte/td_REPORTE DE NOMINA'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarReporteAsociadoEjecucionReporte/span_Generar_ui-radiobutton-icon ui-icon ui_74dbad'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarReporteAsociadoEjecucionReporte/span_Que desea hacer_ui-radiobutton-icon ui_07c771'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarReporteAsociadoEjecucionReporte/a_Generar'))

String conf = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ConsultarReporteAsociadoEjecucionReporte/div_El proceso fue ejecutado correctamente'))

if (conf == 'Generando archivo....') {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarReporteAsociadoEjecucionReporte/a_Continuar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarReporteAsociadoEjecucionReporte/a_Descargar'))

    WebUI.closeBrowser()
}

