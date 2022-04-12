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

WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Nuevo'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_3'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/span_Horas Extras'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Filtro Empleado_form_popupEmpleadoj_idt4438'), 
    '80769954')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Filtro Empleado_form_popupEmpleadoj_idt4438'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/td_1552'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Vigencia_aplicaNovedadProcesofechaVig_d35d75'), 
    '02/03/2022')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Vigencia_aplicaNovedadProcesofechaVig_d35d75'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Hasta_aplicaNovedadProcesohastaVariab_be8481'), 
    '02/03/2022')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Hasta_aplicaNovedadProcesohastaVariab_be8481'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Base_aplicaNovedadProcesovalorcambioV_9f0762'), 
    '7000')

WebUI.setText(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Cantidad_aplicaNovedadProcesocantidad_9777ce'), 
    '2')

WebUI.setText(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/textarea_Observacin_aplicaNovedadProcesoobs_ad7c07'), 
    'Prueba Portal K')

WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Guardar'))

String guardado = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/span_Registro guardado'))

if (guardado == 'Registro guardado') {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Novedad'))

    /*WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/span_Tipo Novedad_ui-icon ui-icon-plusthick'))*/
    WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Nombre Funcionario_aplicaNovedadProcesoj_idt127'))

    WebUI.click(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/td'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/td_1552'))

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/td_80769954'), 
        1)

    /*WebUI.setText(findTestObject('null'), 
	    '80769954')
	
	WebUI.sendKeys(findTestObject('null'), 
	    Keys.chord(Keys.ENTER))*/
    WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/td_80769954'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Autorizar'))

    String novAuto = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/span_se autorizo la novedad'))

    if (novAuto == 'se autorizo la novedad') {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Novedad_1'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/span_Tipo Novedad_ui-icon ui-icon-plusthick'))

        WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Nombre Funcionario_aplicaNovedadProcesoj_idt127'), 
            0)

        WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Nombre Funcionario_aplicaNovedadProcesoj_idt127'))

        /*WebUI.setText(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Filtro Empleado_form_popupEmpleadoj_idt4438'), 
		    '80769954')
		
		WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Filtro Empleado_form_popupEmpleadoj_idt4438'), 
		    Keys.chord(Keys.ENTER))*/
        WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/td_1552'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/td_80769954'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_No Legalizar'))

        String fin = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/span_Se ha realizado el proceso'))

        if (fin == 'Se ha realizado el proceso') {
            WebUI.callTestCase(findTestCase('0-Login/0.4-LoginModificado/LoginFunSara'), [:], FailureHandling.STOP_ON_FAILURE)

            String solicitud1 = WebUI.getText(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/div_Solicitud'))

            if (solicitud1 == 'Solicitud') {
                WebUI.click(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Novedad - Copy'))

                WebUI.waitForElementVisible(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/td_No se encontr registros'), 
                    0)

                WebUI.click(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Nombre Funcionario_aplicaNovedadProcesoj_idt167'))

                WebUI.click(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Filtro Empleado_form_popupEmpleadoj_idt4291'))

                WebUI.setText(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
                    '80769954')

                WebUI.sendKeys(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
                    Keys.chord(Keys.ENTER))

                WebUI.click(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/td_Mendoza 1502 Empleado'))

                String cadena = WebUI.getText(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/td_No se encontr registros'))

                while (cadena != 'No se encontró registros') {
                    String contr = WebUI.getText(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/span_1552'))

                    if (contr == '1552') {
                        WebUI.click(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/span_1552'))

                        WebUI.click(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Eliminar'))

                        String eli = WebUI.getText(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/label_Desea eliminar el registro'))

                        if (eli == 'Desea eliminar el registro') {
                            WebUI.click(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/a_Aceptar'))
                        }
                    }
                    
                    String rep = WebUI.getText(findTestObject('MÓDULOS/RegistrarAutorizarLegalizarAplicacionNovedad_ServicioSolicitudPuntajeDocente/td_No se encontr registros'))

                    cadena = rep
                }
            }
            
            WebUI.closeBrowser()
        }
    }
}

