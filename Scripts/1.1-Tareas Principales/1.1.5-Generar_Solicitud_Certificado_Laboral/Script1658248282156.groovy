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

WebUI.click(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboral/a'))

WebUI.click(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboral/span_CERTIFICADO PERSONAL PLANTA'))

WebUI.waitForElementVisible(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboral/a_Acta De Grado   Diploma_form_solicitudesE_bf87f8'), 
    0)

WebUI.click(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboral/a_Acta De Grado   Diploma_form_solicitudesE_bf87f8'))

String P = WebUI.getText(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboral/input_Seleccionar Archivo_popupDocumentoNov_909a6f'))

String RTA = ''

System(RTA)

println(System(RTA))

String ruta = System(RTA) + 'ActaBachiller.pdf'

WebUI.uploadFile(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboral/input_Seleccionar Archivo_popupDocumentoNov_909a6f'), 
    ruta)

WebUI.setText(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboral/input_Vigencia_popupDocumentoNovedad_formvi_b61a2e'), 
    '02/03/2022')



WebUI.setText(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboral/textarea_Observacin_popupDocumentoNovedad_f_a49cf7'), 
    'PruebaPortal2/22/2022')

WebUI.click(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboral/a_Guardar'))

WebUI.click(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboral/a_Guardar_1'))

String confirmaGuardar = WebUI.getText(findTestObject('MÓDULOS/ServicioMisCertificados/GenerarSolicitudCertificadoLaboral/span_Se actualizo el registro satisfactoriamente'))

if ((confirmaGuardar == 'Registro guardado') | (confirmaGuardar == 'SE PROCESARÁ SU SOLICITUD')) {
    WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
}

def System(def RTA) {
    String RutaA = System.getProperty('os.name')

    if (RutaA == 'Windows 10') {
        def rutaW = RunConfiguration.getProjectDir() + '/1.requerimiento/DocumentosPruebas/'

        rutaW = rutaW.replace('/', '\\')

        println('Esta es la ruta:' + rutaW)

        RTA = rutaW
    } else if (RutaA == 'Linux') {
        def rutaW = RunConfiguration.getProjectDir() + '/1.Requerimiento/DocumentosPruebas/'

        println('Esta es la ruta' + rutaW)

        RTA = rutaW
    } else {
        RTA = 'ERROR'

        WebUI.acceptAlert()
    }
}

