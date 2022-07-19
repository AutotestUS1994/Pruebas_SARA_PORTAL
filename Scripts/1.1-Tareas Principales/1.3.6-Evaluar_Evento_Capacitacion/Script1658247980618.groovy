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

WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/a_RRHH'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/img_Evaluaciones_img-responsive'))

WebUI.switchToWindowIndex(1)

String registro = WebUI.getText(findTestObject('MÓDULOS/EvaluarEventoCapacitacion/td_No se encontr registros'))

if (registro == 'No se encontró registros') {
    WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Modificar Inscripcion Evaluacion Capacitacion'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/a_RRHH'))
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/img_Evaluaciones_img-responsive'))
	
	WebUI.switchToWindowIndex(1)
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/td_Evaluacin Capacitacin'))
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/select_--Seleccione--SINO'),
			'S                   ', true)
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/label_3'))
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/select_--Seleccione--SINO_1'),
			'S                   ', true)
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/a_Guardar'))
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/span_Si'))
	
	String guardo = WebUI.getText(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/span_EVALUACION GUARDADA CORRECTAMENTE'))
	
	if (guardo == 'EVALUACION GUARDADA CORRECTAMENTE') {
		WebUI.closeBrowser()
	}
} else {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/td_Evaluacin Capacitacin'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/select_--Seleccione--SINO'), 
        'S                   ', true)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/label_3'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/select_--Seleccione--SINO_1'), 
        'S                   ', true)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/a_Guardar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/span_Si'))

    String guardo = WebUI.getText(findTestObject('Object Repository/MÓDULOS/EvaluarEventoCapacitacion/span_EVALUACION GUARDADA CORRECTAMENTE'))

    if (guardo == 'EVALUACION GUARDADA CORRECTAMENTE') {
        WebUI.closeBrowser()
    }
}

