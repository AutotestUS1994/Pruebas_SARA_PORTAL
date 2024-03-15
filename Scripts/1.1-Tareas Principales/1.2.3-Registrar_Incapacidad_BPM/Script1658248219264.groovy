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

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a'))

String RTA = ''

System(RTA)

println(System(RTA))

String ruta = System(RTA) + 'DocumentoLicencia.pdf'

String textIncapacidad = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/div_Incapacidad'))

String textSolicitud = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/legend_Solicitudes'))

if ((textIncapacidad == 'Incapacidad') && (textSolicitud == 'Solicitudes')) {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Nuevo'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/span_MATERNIDADPATERNIDAD'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/label_NO'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/input_Fecha Salida_form_incapacidadesEmplea_4ee979'), 
        '01/04/2022')


    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/textarea_Observacin_form_incapacidadesEmple_360c6a'), 
        'PruebaIncapacidadKatalon')

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/input__form_incapacidadesEmpleadotabsIncapa_3b2b3f'), 
        '30')

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a__form_incapacidadesEmpleadotabsIncapacida_fe9be6'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/td_Lorem ipsum dolor sit amet'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Documento Anexo_form_incapacidadesEmplead_88b28d'))

    /*WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/span_Seleccionar Archivo'))
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/div_Seleccionar Archivo'))
	
	String verify = WebUI.getText(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/div_Seleccionar Archivo'))
	*/
    WebUI.uploadFile(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/div_Seleccionar Archivo'), 
        ruta)

    WebUI.setText(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/input_Vigencia_popupDocumentoNovedad_formvi_b61a2e'), 
        '02/04/2022')


    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/textarea_Observacin_popupDocumentoNovedad_f_a49cf7'), 
        'PruebaArchivoKatalon')

    /*
	WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Guardar'))
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/input_Adjuntar Archivo_popupDocumentoNoveda_f1c808'))
	*/
    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Guardar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Guardar_1'))

    if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/label_Advertencia'), 
        1)) {
        WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/label_Advertencia'))

        WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Limpiar Datos Aplicacion Novedad Sara'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Borrar Licencia Historico'), [:], FailureHandling.STOP_ON_FAILURE)
		
        WebUI.callTestCase(findTestCase('0-Login/0.3-LoginEmpleado'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a'))

        String textIncapacidad1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/div_Incapacidad'))

        String textSolicitud1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/legend_Solicitudes'))

        if ((textIncapacidad1 == 'Incapacidad') && (textSolicitud1 == 'Solicitudes')) {
            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Nuevo'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/span_MATERNIDADPATERNIDAD'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/label_NO'))

            WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/input_Fecha Salida_form_incapacidadesEmplea_4ee979'), 
                '01/04/2022')


            WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/textarea_Observacin_form_incapacidadesEmple_360c6a'), 
                'PruebaIncapacidadKatalon')

            WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/input__form_incapacidadesEmpleadotabsIncapa_3b2b3f'), 
                '30')

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a__form_incapacidadesEmpleadotabsIncapacida_fe9be6'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/td_Lorem ipsum dolor sit amet'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Documento Anexo_form_incapacidadesEmplead_88b28d'))

            /*WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/span_Seleccionar Archivo'))
			
			WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/div_Seleccionar Archivo'))
			
			String verify = WebUI.getText(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/div_Seleccionar Archivo'))
			*/
            WebUI.uploadFile(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/div_Seleccionar Archivo'), 
                ruta)

            WebUI.setText(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/input_Vigencia_popupDocumentoNovedad_formvi_b61a2e'), 
                '02/04/2022')


            WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/textarea_Observacin_popupDocumentoNovedad_f_a49cf7'), 
                'PruebaArchivoKatalon')

            /*
			WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Guardar'))
			
			WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/input_Adjuntar Archivo_popupDocumentoNoveda_f1c808'))
			*/
            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Guardar'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Guardar_1'))

            WebUI.delay(5)

            WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_1'))

            WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/select_-- Seleccione --Incapacidad'), 
                'I', true)

            String incapa = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/td_Incapacidad'))

            String fech1 = WebUI.getText(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/td_Incapacidad de MENDOZA 1502 EMPLEADO'))

            if ((incapa == 'Incapacidad') && (fech1.contains('Incapacidad de '))) {
                WebUI.click(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/td_Incapacidad de MENDOZA 1502 EMPLEADO'))

                WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Autorizar'))

                WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/span_Si'))

                String verif = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/span_La respuesta se ha guardado correctame_13122f'))

                if (verif == 'La respuesta se ha guardado correctamente. Autorizar.') {
                    WebUI.closeBrowser()
                }
            }
        }
    } else {
        WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_1'))

        String respuesta = WebUI.getText(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/td_No se encontro registros'))

        if (respuesta == 'No se encontró registros') {
            WebUI.click(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Actividades Historicas'))
        }
        
        WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/select_-- Seleccione --Incapacidad'))

        WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/select_-- Seleccione --Incapacidad'), 
            'I', true)

        String incapa = ''

        String fech1 = ''

        if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/td_Incapacidad'), 
            1)) {
            incapa = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/td_Incapacidad'))
        }
        
        if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/td_Incapacidad de MENDOZA 1502 EMPLEADO'), 
            1)) {
            fech1 = WebUI.getText(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/td_Incapacidad de MENDOZA 1502 EMPLEADO'))
        }
        
        if ((incapa == 'Incapacidad') && (fech1.contains('1502'))) {
            WebUI.click(findTestObject('MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/td_Incapacidad de MENDOZA 1502 EMPLEADO'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/a_Autorizar'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/span_Si'))

            String verif = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisIncapacidades/RegistrarIncapacidadBPM/span_La respuesta se ha guardado correctame_13122f'))

            if (verif == 'La respuesta se ha guardado correctamente. Autorizar.') {
                WebUI.closeBrowser()
            }
        }
    }
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

