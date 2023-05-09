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

WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Borrar Citacion Evaluacion Y Candidato Proceso Seleccion'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.2.9-Inscribirse_Convocatoria_Proceso_Seleccion'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/a_RRHH'))

WebUI.click(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/img_Convocatorias vigentes_img-responsive'))

WebUI.switchToWindowIndex(1)

String noEvaluacion = WebUI.getText(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/td_No se encontr registros'))

if (noEvaluacion == 'No se encontró registros') {
    WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Programar Evaluacion Proceso Seleccion'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/a_RRHH'))

    WebUI.click(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/img_Convocatorias vigentes_img-responsive'))

    WebUI.switchToWindowIndex(1)

    realizar()
} else {
    realizar()
}

def realizar() {
    if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/td_80769954 - Mendoza 1502 Empleado'), 
        1)) {
        WebUI.getText(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/td_80769954 - Mendoza 1502 Empleado'))
    }
    
    WebUI.click(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/td_80769954 - Mendoza 1502 Empleado'))

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/select_--Seleccione--NoSi'), 
        1, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/select_--Seleccione--TecnologoProfesionalTe_0303a8'), 
        4, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/select_--Seleccione--SolteroCasadoViudoDivo_5768fc'), 
        2, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/textarea__form_evaluacion_proceso_seleccion_009171'), 
        'Chapinero')

    WebUI.sendKeys(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/textarea__form_evaluacion_proceso_seleccion_009171'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.setText(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/textarea_Observaciones_form_evaluacion_proc_54d5ca'), 
        'Prueba Portal Evaluacion PS')

    WebUI.sendKeys(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/textarea_Observaciones_form_evaluacion_proc_54d5ca'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.click(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/a_Guardar'))

    WebUI.click(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/span_Si'))

    WebUI.scrollToElement(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/a_Regresar'), 
        0)

    String termino = WebUI.getText(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/RealizarEvaluacionPS/a_Regresar'))

    if (termino == 'Regresar') {
        WebUI.closeBrowser()
    }
}

