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

WebUI.callTestCase(findTestCase('0-Login/0.4-LoginModificado/LoginFunSara'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/input_Empresa 1_form_templatej_idt24_input'), 
    'proceso de ')

WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/li_Proceso de Seleccion (tal)'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/input_Nmero_filtro_procesoseleccionj_idt73'), 
    '63')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/input_Nmero_filtro_procesoseleccionj_idt73'), 
    Keys.chord(Keys.ENTER))

String consecutivo = WebUI.getText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/td_BOG-2022-0001'), 
    FailureHandling.STOP_ON_FAILURE)

if (consecutivo == 'BOG-2022-0001') {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/td_BOG-2022-0001'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/div_Candidato'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/a_Registro Candidato'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/td_80769954'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/a_Cambiar estado'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/td_Entrevista de Seleccin'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/div_Citacion'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/a_Programar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/td_Contacto Gestin Humana'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/a_17'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/tbody_Ver CalendarioFechaHora--010203040506_e3a44f'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/input_Fecha_popupCitacion_formfecha_inicial_input'), 
        '30/03/2030')

    WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/input_Fecha_popupCitacion_formfecha_inicial_input'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/select_--010203040506070809101112'), 
        3, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/select_--00153045'), 
        4, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/select_--AMPM'), 
        2, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/a_Responsable_popupCitacion_formj_idt1947'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/input_Filtro Hoja de Vida_formPopupHojaVida_176d40'), 
        '90798514')

    WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/input_Filtro Hoja de Vida_formPopupHojaVida_176d40'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/td_90798514'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/textarea_Observacin_popupCitacion_formobservacion'), 
        'Prueba Proceso Seleccion')

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/td_Observacin'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/textarea_Observacin_popupCitacion_formobservacion'), 
        'Evaluacion Proceso Seleccion Portal')

    WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/textarea_Observacin_popupCitacion_formobservacion'), 
        Keys.chord(Keys.ESCAPE))

    String entrevTel = WebUI.getText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/span_Entrevista Telefnica'))

    if (entrevTel == 'ENTREVISTA TELEFÓNICA') {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/div_Entrevista Telefnica_ui-chkbox-box ui-w_166644'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/a_Continuar'))

        WebUI.setText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/input_Notificar Citacin_popupCitacion_formj_d4bc1e'), 
            'Realizar Evaluacion Proceso Seleccion Portal')

        WebUI.check(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/a_check'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/a_Generar'))

        String confirm = WebUI.getText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/ProgramarEvaluacionProcesoSeleccion/p_Las citaciones han sido generadas correctamente'))

        if (confirm == 'Las citaciones han sido generadas correctamente') {
            WebUI.closeBrowser()
        } else {
            WebUI.acceptAlert()
        }
    }
} else {
    WebUI.acceptAlert()
}

