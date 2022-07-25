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

WebUI.callTestCase(findTestCase('0-Login/0.3-LoginEmpleado'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MÓDULOS/ServicioMiComprobantePago/VisualizarComprobanteNomina/a'))

String P = WebUI.getText(findTestObject('MÓDULOS/ServicioMiComprobantePago/VisualizarComprobanteNomina/td_2021  Comprobante de nmina'), 
    FailureHandling.CONTINUE_ON_FAILURE)

if (P == '2021 COMPROBANTE DE NÓMINA') {
    WebUI.click(findTestObject('MÓDULOS/ServicioMiComprobantePago/VisualizarComprobanteNomina/td_Periodo Nomina PM202106-P. MensualJunio2021'))

    WebUI.click(findTestObject('MÓDULOS/ServicioMiComprobantePago/VisualizarComprobanteNomina/span_Periodo Nomina PM202106-P. MensualJunio2021'))

    WebUI.closeBrowser()
} else {
    WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Generar Comprobante de nomina'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('0-Login/0.3-LoginEmpleado'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('MÓDULOS/ServicioMiComprobantePago/VisualizarComprobanteNomina/a'))
	
	String P1 = WebUI.getText(findTestObject('MÓDULOS/ServicioMiComprobantePago/VisualizarComprobanteNomina/td_2021  Comprobante de nmina'),
		FailureHandling.CONTINUE_ON_FAILURE)
	
	if (P1 == '2021 COMPROBANTE DE NÓMINA') {
		WebUI.click(findTestObject('MÓDULOS/ServicioMiComprobantePago/VisualizarComprobanteNomina/td_Periodo Nomina PM202106-P. MensualJunio2021'))
	
		WebUI.click(findTestObject('MÓDULOS/ServicioMiComprobantePago/VisualizarComprobanteNomina/span_Periodo Nomina PM202106-P. MensualJunio2021'))
	
		WebUI.closeBrowser()
	}
}

