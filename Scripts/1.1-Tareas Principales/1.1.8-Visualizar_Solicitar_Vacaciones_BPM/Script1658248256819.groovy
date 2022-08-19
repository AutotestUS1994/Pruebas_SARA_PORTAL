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

WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a'))

String pasivo = WebUI.getText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/td_Programacion De Vacaciones'))

if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/td_Programacion De Vacaciones'), 
    1)) {
    WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a_Nueva Solicitud'))

    WebUI.setText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/input_Salida Nomina_form_vacacionesEmpleado_2729a1'), 
        '5/03/2022')

    WebUI.sendKeys(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/input_Salida Nomina_form_vacacionesEmpleado_2729a1'), 
        Keys.chord(Keys.ESCAPE))

    /*WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/td_7'))*/
    WebUI.setText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/input_Disfrute_form_vacacionesEmpleadotabsV_1e3fdd'), 
        '5')

    WebUI.setText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/textarea_Observacin_form_vacacionesEmpleado_8b7595'), 
        'Pruebaautok')

    WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a_Verificar'))

    if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/label_Advertencia'), 
        1)) {
        String verTexto = WebUI.getText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/label_Advertencia'))

        WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Limpiar Datos Aplicacion Novedad Sara'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('0-Login/0.3-LoginEmpleado'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a'))

        String pasivo1 = WebUI.getText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/td_Programacion De Vacaciones'))

        if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/td_Programacion De Vacaciones'), 
            1)) {
            WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a_Nueva Solicitud'))

            WebUI.setText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/input_Salida Nomina_form_vacacionesEmpleado_2729a1'), 
                '5/03/2022')

            WebUI.sendKeys(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/input_Salida Nomina_form_vacacionesEmpleado_2729a1'), 
                Keys.chord(Keys.ESCAPE))

            /*WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/td_7'))*/
            WebUI.setText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/input_Disfrute_form_vacacionesEmpleadotabsV_1e3fdd'), 
                '5')

            WebUI.setText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/textarea_Observacin_form_vacacionesEmpleado_8b7595'), 
                'Pruebaautok')

            WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a_Verificar'))

            String verificarVacaciones = WebUI.getText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/span_Se verifico exitosamente'))

            if (verificarVacaciones == 'Se verifico exitosamente.') {
                WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a_Guardar'))

                WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

                WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a_1'))

                String soliVacaciones = WebUI.getText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/td_Vacaciones 1552 MENDOZA 1502 EMPLEADO'))

                if (soliVacaciones == 'Vacaciones 1552 HOJAVIDA. 1502 EMPLEADO PPRUEBA') {
                    WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/td_Vacaciones 1552 MENDOZA 1502 EMPLEADO'))

                    WebUI.selectOptionByValue(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/select_SeleccionarSiNo'), 
                        '8cbf75f91c3d429bab76534e871cd120', true)

                    WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a_Enviar'))

                    String finalizar = WebUI.getText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/span_Gracias'))

                    if (finalizar == 'Gracias') {
                        WebUI.closeBrowser()
                    }
                }
            }
        }
    } else {
        String verificarVacaciones = WebUI.getText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/span_Se verifico exitosamente'))

        if (verificarVacaciones == 'Se verifico exitosamente.') {
            WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a_Guardar'))

            WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a_1'))

            String soliVacaciones = WebUI.getText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/td_Vacaciones 1552 MENDOZA 1502 EMPLEADO'))

            if (soliVacaciones == 'Vacaciones 1552 HOJAVIDA. 1502 EMPLEADO PPRUEBA') {
                WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/td_Vacaciones 1552 MENDOZA 1502 EMPLEADO'))

                WebUI.waitForElementVisible(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/select_SeleccionarSiNo'), 
                    1, FailureHandling.STOP_ON_FAILURE)

                WebUI.selectOptionByIndex(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/select_SeleccionarSiNo'), 
                    1, FailureHandling.STOP_ON_FAILURE)

                WebUI.click(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/a_Enviar'))

                String finalizar = WebUI.getText(findTestObject('MÓDULOS/ServicioMisVacaciones/VisualizarSolicitarVacacionesBPM/span_Gracias'))

                if (finalizar == 'Gracias') {
                    WebUI.closeBrowser()
                }
            }
        }
    }
}

