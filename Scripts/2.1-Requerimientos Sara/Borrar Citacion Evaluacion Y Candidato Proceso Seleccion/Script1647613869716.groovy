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

WebUI.setText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/input_Empresa 1_form_templatej_idt24_input'), 
    'proceso de seleccion')

WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/span_Proceso de Seleccion'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/input_Nmero_filtro_procesoseleccionj_idt73'), 
    '63')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/input_Nmero_filtro_procesoseleccionj_idt73'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/td_109      - Dir. Corp. Senior Digital'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/div_Citacion'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/a_Registro Citacin'))

if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/p_La citacin ha sido eliminada correctamente'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)) {
    String noCitacion = WebUI.getText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/p_La citacin ha sido eliminada correctamente'), 
        FailureHandling.CONTINUE_ON_FAILURE)

    if (noCitacion == 'No existen citaciones asociadas al proceso') {
        continuar()
    }
} else {
    WebUI.click(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/td_80769954 - reg'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/a_Eliminar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/span_Si'))

    String citacionElim = WebUI.getText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/p_La citacin ha sido eliminada correctamente'))

    if(WebUI.waitForElementClickable(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/td_80769954 - reg'), 
        1)) {

	    WebUI.click(findTestObject('MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/td_80769954 - reg'))
	
	    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/a_Eliminar'))
	
	    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/span_Si'))
	}
	
    String citacionElim1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/p_La citacin ha sido eliminada correctamente'))

    citacionElim = citacionElim1

    if (citacionElim == 'El candidato fue eliminado correctamente') {
        continuar()
    } else {
        continuar()
    }
}

def continuar() {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/div_Candidato'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/a_Registro Candidato'))

    String noCandidato = WebUI.getText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/td_80769954'))

    if (noCandidato == 'No se encontró registros') {
        WebUI.closeBrowser()
    } else {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/td_80769954'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/a_Eliminar_1'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/span_Si'))

        String candidato = WebUI.getText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/RealizarEvaluacionProcesoSeleccion/BorrarCitacionEvaluacionAndCandidatoProcesoS/p_El candidato fue eliminado correctamente'))

        if (candidato == 'El candidato fue eliminado correctamente') {
            WebUI.closeBrowser()
        }
    }
}

