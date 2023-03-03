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

inscribir()

def inscribir() {
    WebUI.callTestCase(findTestCase('0-Login/0.3-LoginEmpleado'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/InscribirseConvocatoriaProcesoSeleccion/a_RRHH'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/InscribirseConvocatoriaProcesoSeleccion/img_Vacantes solicitadas_img-responsive'))

    WebUI.switchToWindowIndex(1)

    WebUI.getText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/InscribirseConvocatoriaProcesoSeleccion/span_Convocatoria Proceso Seleccin NOBorrar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/InscribirseConvocatoriaProcesoSeleccion/span_Convocatoria Proceso Seleccin NOBorrar'))

    if (WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/InscribirseConvocatoriaProcesoSeleccion/span_Inscribirse'), 
        1)) {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/InscribirseConvocatoriaProcesoSeleccion/span_Inscribirse'))

        String termin = WebUI.getText(findTestObject('MÓDULOS/Proceso Seleccion/InscribirseConvocatoriaProcesoSeleccion/span_Este candidato se encuentra registrado_c88b3c'))

        if (termin == 'Se ha inscrito correctamente.') {
            WebUI.closeBrowser()
        }
		else {WebUI.acceptAlert()}
    } else {
        b()
    }
}

def b() {
    if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/InscribirseConvocatoriaProcesoSeleccion/span_Regresar'), 
        1)) {
        String yaInscrito = WebUI.getText(findTestObject('Object Repository/MÓDULOS/Proceso Seleccion/InscribirseConvocatoriaProcesoSeleccion/span_Regresar'))

        if (yaInscrito == 'Regresar') {
            WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Borrar Citacion Evaluacion Y Candidato Proceso Seleccion'), 
                [:], FailureHandling.STOP_ON_FAILURE)

            inscribir()
        }
    } else {
        WebUI.closeBrowser()
    }
}

