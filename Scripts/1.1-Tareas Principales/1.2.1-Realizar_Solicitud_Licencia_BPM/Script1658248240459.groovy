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

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/a'))

String licencia = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/div_Licencia'))

String solicitud = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/legend_Solicitudes'))

if ((licencia == 'Licencia') && (solicitud == 'Solicitudes')) {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/a_Nuevo'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/span_LICENCIA REMUNERADA'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input_Fecha Salida_form_licenciaEmpleadotab_bcf304'), 
        '28/03/2022')

    WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input_Fecha Salida_form_licenciaEmpleadotab_bcf304'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input__form_licenciaEmpleadotabsLicenciaspa_c41560'), 
        '1')

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/textarea_Area_form_licenciaEmpleadotabsLice_1483d3'), 
        'PruebaAutoK')

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input_Fecha 1_form_licenciaEmpleadotabsLice_f3aa7f'), 
        '28/03/2022')

    WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input_Fecha 1_form_licenciaEmpleadotabsLice_f3aa7f'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input_Horas adicionales_form_licenciaEmplea_d3d67d'), 
        '03:00')

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/a_Guardar'))

    if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/label_Advertencia'), 
        1)) {
        WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/label_Advertencia'))

        String verText = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/label_Advertencia'))

        WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Limpiar Datos Aplicacion Novedad Sara'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Borrar Licencia Historico'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.callTestCase(findTestCase('0-Login/0.3-LoginEmpleado'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/a'))

        String licencia1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/div_Licencia'))

        String solicitud1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/legend_Solicitudes'))

        if ((licencia1 == 'Licencia') && (solicitud1 == 'Solicitudes')) {
            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/a_Nuevo'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/span_LICENCIA REMUNERADA'))

            WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input_Fecha Salida_form_licenciaEmpleadotab_bcf304'), 
                '28/03/2022')

            WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input_Fecha Salida_form_licenciaEmpleadotab_bcf304'), 
                Keys.chord(Keys.ESCAPE))

            WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input__form_licenciaEmpleadotabsLicenciaspa_c41560'), 
                '1')

            WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/textarea_Area_form_licenciaEmpleadotabsLice_1483d3'), 
                'PruebaAutoK')

            WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input_Fecha 1_form_licenciaEmpleadotabsLice_f3aa7f'), 
                '28/03/2022')

            WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input_Fecha 1_form_licenciaEmpleadotabsLice_f3aa7f'), 
                Keys.chord(Keys.ESCAPE))

            WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/input_Horas adicionales_form_licenciaEmplea_d3d67d'), 
                '03:00')

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/a_Guardar'))

            String conf1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/span_Se modifico exitosamente su solicitud'))

            if (conf1 == 'Se modifico exitosamente su solicitud') {
                WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

                WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/a_1'))

                String conf2 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/td_Licencia'))

                String conf3 = WebUI.getText(findTestObject('MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/td_LICENCIAS 1552  Licencia Remunerada'))

                if ((conf2 == 'Licencia') && (conf3 == 'LICENCIAS 1552 Licencia Remunerada')) {
                    WebUI.click(findTestObject('MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/td_LICENCIAS 1552  Licencia Remunerada'))

                    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/a_Autorizar'))

                    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/span_Si'))

                    String terminado = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/span_La respuesta se ha guardado correctame_13122f'))

                    if (terminado == 'La respuesta se ha guardado correctamente. Autorizar.') {
                        WebUI.closeBrowser()
                    }
                }
            }
        }
    } else {
        String conf1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/span_Se modifico exitosamente su solicitud'))

        if (conf1 == 'Se modifico exitosamente su solicitud') {
            WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/a_1'))

            String conf2 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/td_Licencia'))

            String conf3 = WebUI.getText(findTestObject('MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/td_LICENCIAS 1552  Licencia Remunerada'))

            if ((conf2 == 'Licencia') && (conf3 == 'LICENCIAS 1552 Licencia Remunerada')) {
                WebUI.click(findTestObject('MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/td_LICENCIAS 1552  Licencia Remunerada'))

                WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/a_Autorizar'))

                WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/span_Si'))

                String terminado = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisLicencias/RealizarSolicitudLicenciaBPM/span_La respuesta se ha guardado correctame_13122f'))

                if (terminado == 'La respuesta se ha guardado correctamente. Autorizar.') {
                    WebUI.closeBrowser()
                }
            }
        }
    }
}

