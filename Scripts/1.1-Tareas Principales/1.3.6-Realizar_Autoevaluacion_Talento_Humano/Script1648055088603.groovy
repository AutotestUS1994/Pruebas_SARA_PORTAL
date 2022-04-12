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

a()

if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/td_No se encontr registros'), 
    0) && WebUI.getText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/td_No se encontr registros'))
=='No se encontró registros') {
    WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Borrar Autoevaluacion Programar Autoevaluacion'), [:], FailureHandling.STOP_ON_FAILURE)

    a()

    b()
} else {
    b()
}

def a() {
    WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/a_RRHH'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/img_Mis evaluaciones_img-responsive'))

    WebUI.switchToWindowIndex(1)
}

def b() {
    String eva = WebUI.getText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/span_Evaluacion Objetivos Pru2022'))

    if (eva == 'evaluacion objetivos pru2022') {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/span_Evaluacion Objetivos Pru2022'))

        WebUI.setText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/textarea__faseGestionHojaj_idt7730j_idt7800tema'), 
            'Prueba automatica')

        WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/textarea__faseGestionHojaj_idt7730j_idt7800tema'), 
            Keys.chord(Keys.ESCAPE))

        WebUI.setText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/textarea__faseGestionHojaj_idt7730j_idt7801_ce34af'), 
            'PRUEBA AUTOMATICA')

        WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/textarea__faseGestionHojaj_idt7730j_idt7801_ce34af'), 
            Keys.chord(Keys.ESCAPE))

        WebUI.setText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/textarea__faseGestionHojaj_idt7730j_idt7802_be2455'), 
            'PRUEBA AUTOMATICA')

        WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/textarea__faseGestionHojaj_idt7730j_idt7802_be2455'), 
            Keys.chord(Keys.ESCAPE))

        WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/select_-- Seleccione --ANUALMENSUALSEMESTRA_703db4'), 
            2, FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/textarea__faseGestionHojaj_idt7730j_idt7804medida'), 
            '1')

        WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/textarea__faseGestionHojaj_idt7730j_idt7804medida'), 
            Keys.chord(Keys.ESCAPE))

        WebUI.setText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/input_Peso_faseGestionHojaj_idt7730j_idt780_dec830'), 
            '80')

        WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/input_Peso_faseGestionHojaj_idt7730j_idt780_dec830'), 
            Keys.chord(Keys.ESCAPE))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/a_Aplicar'))

        String termino = WebUI.getText(findTestObject('Object Repository/MÓDULOS/AutoevaluacionTalentoHumano/RealizarAutoevaluacionTalentoHumano/span_Es importante la definicin y seguimien_f92c85'))

        if (termino == 'Es importante la definición y seguimiento de los objetivos, es así como garantizamos el excelente desempeño de cada uno de nuestros colaboradores.') {
        	WebUI.closeBrowser()
		}
    }
}

