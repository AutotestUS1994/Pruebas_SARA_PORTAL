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

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/a'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/td_CESANTIAS PARCIALES'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/select_SeleccioneADQUISICION DE VIVIENDA - _25ba8f'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/input__form_solicitudesEmpleadoj_idt1520tab_89c254'), 
    '28/03/2022')

WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/input__form_solicitudesEmpleadoj_idt1520tab_2c5832'), 
    '14/04/2022')

WebUI.setText(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/input__form_solicitudesEmpleadoj_idt1520tab_c1746f'), 
    '500000')

WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/a_Guardar BPM'))

String confi = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/span_SE PROCESAR SU SOLICITUD'))

if (confi == 'SE PROCESARÁ SU SOLICITUD') {
    WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/a_1'))

    String soli = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/td_Solicitudes'))

    String sol = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/td_solicitud  1552 EMPLEADO'))

    if ((soli == 'Solicitudes') && (sol == 'solicitud 1552 EMPLEADO PPRUEBA')) {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/td_solicitud  1552 EMPLEADO'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/a_Autorizar'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/span_Si'))

        String end = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ServicioMisCensantias/SolicitarAutorizarCesantiasBPM/span_La respuesta se ha guardado correctame_13122f'))

        if (end == 'La respuesta se ha guardado correctamente. Autorizar.') {
            WebUI.closeBrowser()
        }
    }
}

