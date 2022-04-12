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

WebUI.setText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/input_Empresa 1_form_templatej_idt24_input'), 
    'listado he')

WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/span_Listado He'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/label_Filtrar Herramientas de gestion'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/select_--- Seleccione Herramienta ---ENCUES_211812'), 
    6, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/input_Identificacion Evaluado_listadoHerram_058119'), 
    '90798514')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/input_Identificacion Evaluado_listadoHerram_058119'), 
    Keys.chord(Keys.ENTER))

String estadoProc = WebUI.getText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/td_Proceso'))

if (estadoProc == 'proceso') {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/td_Proceso'))

    if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/span_Aplicada'), 
        1) && (WebUI.getText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/td_No se encontr registros')) != 
    'No se encontró registros')) {
        borrarEvaluacion()
		programar()
    } else if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/td_No se encontr registros'), 
        1) && (WebUI.getText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/td_No se encontr registros')) == 
    'No se encontró registros')) {
        programar()
    }
}

def borrarEvaluacion() {
    WebUI.getText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/span_Aplicada'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/span_Aplicada'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/span_Eliminar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/a_Aceptar'))
}

def programar() {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/td_No se encontr registros'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/span_Programar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/input_Fecha Limite Evaluacin_programar_eva__9e96ae'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/select_201220132014201520162017201820192020_402356'), 
        '20/03/2030', FailureHandling.STOP_ON_FAILURE)

    WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/select_201220132014201520162017201820192020_402356'), 
        Keys.chord(Keys.TAB), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/a_Evaluadores'))

    WebUI.getText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/td_Autoevaluacion'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/div_Subalterno_ui-chkbox-box ui-widget ui-c_f32b2c'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/a_Programar'))

    String fin = WebUI.getText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/BorrarAutoevaluacionProgramarAutoevaluacion/p_Se ha ejecutado el proceso correctamente'))

    if (fin == 'Se ha ejecutado el proceso correctamente') {
        WebUI.closeBrowser()
    }
}

