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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('0-Login/0.3-LoginEmpleado'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/a'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/td_CERTIFICADO PERSONAL PLANTA'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/a_Acta De Grado   Diploma_form_solicitudesE_bf87f8'))

String P = WebUI.getText(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/input_Seleccionar Archivo_popupDocumentoNov_909a6f'))

String RTA = ''

def System(def RTA) {
	
	String RutaA = System.getProperty('os.name')
	
	if(RutaA == 'Windows 10') {
		
		def rutaW =  RunConfiguration.getProjectDir() +'/1.requerimiento/DocumentosPruebas/'
		
		rutaW = rutaW.replace('/','\\')
		
		println('Esta es la ruta:' + rutaW)
		
		RTA = rutaW
	}
	else if(RutaA == 'Linux') {
		
		def rutaW = RunConfiguration.getProjectDir() + '/1.Requerimiento/DocumentosPruebas/'
		
		println('Esta es la ruta'+ rutaW)
		
		RTA = rutaW
	}
	else {
		RTA = 'ERROR'
		WebUI.acceptAlert()
	}
}

System(RTA)

println(System(RTA))

String ruta = System(RTA) + 'ActaBachiller.pdf'

WebUI.uploadFile(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/input_Seleccionar Archivo_popupDocumentoNov_909a6f'), 
    ruta)

WebUI.setText(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/input_Vigencia_popupDocumentoNovedad_formvi_b61a2e'), 
    '04/03/2022')

WebUI.sendKeys(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/input_Vigencia_popupDocumentoNovedad_formvi_b61a2e'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/textarea_Observacin_popupDocumentoNovedad_f_a49cf7'), 
    'PruebaAutoK1')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/textarea_Observacin_popupDocumentoNovedad_f_a49cf7'), 
    Keys.chord(Keys.TAB))

WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/a_Guardar'), 
    1)

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/a_Guardar'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/a_Guardar BPM'))

String solicitudCreada = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/span_SE PROCESAR SU SOLICITUD'))

if (solicitudCreada == 'SE PROCESARÁ SU SOLICITUD') {
    WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/a_1'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/div_Inicio Actividad_ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/a_Autoriza'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboralBPM/span_Si'))

WebUI.closeBrowser()

