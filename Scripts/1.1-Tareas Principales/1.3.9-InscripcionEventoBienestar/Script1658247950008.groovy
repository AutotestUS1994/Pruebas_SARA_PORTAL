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

WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Borrar Inscripcion Evento Bienestar'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/InscripcionEventoBienestar/a_RRHH'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/InscripcionEventoBienestar/font_nete a nuestras experiencias inolvidables'))

WebUI.switchToWindowIndex(1)

String evento = WebUI.getText(findTestObject('Object Repository/MÓDULOS/InscripcionEventoBienestar/span_Inscripcin Promocin y prevencin de la salud portal'))

if (evento == 'Inscripción Promoción y prevención de la salud portal') {
    WebUI.scrollToElement(findTestObject('MÓDULOS/InscripcionEventoBienestar/iframe_Mis eventos_7F07D451F09D4B35813735F5_55247e'), 
        1)

    WebUI.doubleClick(findTestObject('Object Repository/MÓDULOS/InscripcionEventoBienestar/a_Inscripcin'))

    WebUI.comment('Se cambia el ID del objeto que sigue: Antes: //select[@id=\'formListadoEventos:pariente\']')

    if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/InscripcionEventoBienestar/select_-- Seleccione --SolicitanteMarta Por_bc0c62'), 
        1, FailureHandling.STOP_ON_FAILURE)) {
        WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/InscripcionEventoBienestar/select_-- Seleccione --SolicitanteMarta Por_bc0c62'), 
            1, FailureHandling.STOP_ON_FAILURE)
    } else if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/InscripcionEventoBienestar/select_-- Seleccione --SolicitanteMartaPariente'), 
        1, FailureHandling.STOP_ON_FAILURE)) {
		WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/InscripcionEventoBienestar/select_-- Seleccione --SolicitanteMartaPariente'),
			2, FailureHandling.STOP_ON_FAILURE)
	}
    WebUI.click(findTestObject('Object Repository/MÓDULOS/InscripcionEventoBienestar/a_Guardar'))

    String inscrito = WebUI.getText(findTestObject('Object Repository/MÓDULOS/InscripcionEventoBienestar/span_Se ha registrado en el evento'))

    if (inscrito == 'Se ha registrado en el evento.') {
        WebUI.closeBrowser()
    }
}

