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

WebUI.setText(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/input_Empresa 1_form_templatej_idt24_input'), 
    'evento capacitacion')

WebUI.click(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/li_Control Evento Capacitacion (cap)'))

String capa = WebUI.getText(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/td_Curso de Ingles Bsico Para Portal'))

if (capa == 'Curso de Ingles Básico Para Portal') {
    WebUI.click(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/td_Curso de Ingles Bsico Para Portal'))

    WebUI.click(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/div_Evaluacin'))

    WebUI.waitForElementClickable(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/a_Evento'), 0)

    WebUI.click(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/a_Evento'))

    String apli = 'No leyo el estado'
	if(WebUI.waitForElementVisible(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/div_Aplicada'), 
        1)) {
		apli = WebUI.getText(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/div_Aplicada'))
	} else {
		System.out.println("No hay registros de programación")
	}
    /*GETS: Se cambia para validar que el usuario 90798514 tenga programada una evalación, la prueba 1.3.6, espera el formulario de Evaluación Capacitación*/
    if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/div_Aplicada - Usuario90798514'), 
        1)) {
        String evaluador = WebUI.getText(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/div_Aplicada - Usuario90798514'))

        if (evaluador == '90798514') {
            System.out.println('El usuario de Portal 90798514 tiene una evaluación programada')
			
			apli = WebUI.getText(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/div_Aplicada'))
			
            if (apli == 'Aplicada') {
                WebUI.click(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/span_Aplicada_ui-icon ui-icon-pencil'))

                WebUI.selectOptionByValue(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/select_Diligenciada ParcialmenteNo Diligenciada'), 
                    'P', true)

                WebUI.click(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/span_Aplicada_ui-icon ui-icon-check ui-c'))

                String noDili = WebUI.getText(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/div_No Diligenciada'))

                if (noDili == 'No Diligenciada') {
                    WebUI.closeBrowser()
                }
            } else {
                WebUI.closeBrowser()
            }
        }
    }
	else {
		System.out.println('El usuario de Portal 90798514 NO tiene una evaluación programada')

		WebUI.click(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/a_Programar'))

		WebUI.click(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/a_check_SeleccionEmpleado'))

		WebUI.setText(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/input_FechaProgramacion'),
			'31/12/2025')

		WebUI.click(findTestObject('MÓDULOS/ModificarInscripcionEvaluacionCapacitacion/a_Aplicar'))
		
		WebUI.closeBrowser()
	}
}

