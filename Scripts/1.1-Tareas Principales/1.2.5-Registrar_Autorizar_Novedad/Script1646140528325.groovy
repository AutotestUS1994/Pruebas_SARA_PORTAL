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

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/a'))

String nov = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/a_Novedad'))

if (nov == 'Novedad') {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/a_Nuevo'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/td_Horas Extras'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/button_ui-button'), 
        '01/03/2022')

    WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/button_ui-button'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/span_Hasta_ui-button-icon-left ui-icon ui-i_791b9d'), 
        '01/03/2022')

    WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/span_Hasta_ui-button-icon-left ui-icon ui-i_791b9d'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/input_Base_form_novedadesEmpleadotabsNoveda_ff9ec9'), 
        '8000')

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/input_Cantidad_form_novedadesEmpleadotabsNo_24814a'), 
        '2')

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/textarea_Observacin_form_novedadesEmpleadot_c247eb'), 
        'Prueba Katalon')

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/a_Guardar'))

    String confir = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/span_Registro guardado'))

    if (confir == 'Registro guardado') {
        WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/a_1 (1)'))

        String aproNov = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/td_novedad 1552 Mendoza 1502 Empleado'))

        String aproNov1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/td_Novedad'))

        if ((aproNov == 'novedad 1552 Mendoza 1502 Empleado') && (aproNov1 == 'Novedad')) {
            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/td_Novedad'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/a_Autorizar'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/span_Si'))

            String fin = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisNovedades/RegistrarAutorizarNovedad/span_La respuesta se ha guardado correctame_13122f'))

            if (fin == 'La respuesta se ha guardado correctamente. Autorizar.') {
                WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Limpiar Datos Aplicacion Novedad Sara'), [:], FailureHandling.STOP_ON_FAILURE)

                WebUI.closeBrowser()
            }
        }
    }
}

