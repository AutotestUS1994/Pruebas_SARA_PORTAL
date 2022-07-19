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

WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarNecesidadCapacitacion/a_RRHH'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarNecesidadCapacitacion/img_Evaluaciones_img-responsive'))

WebUI.switchToWindowIndex(1)

String comp = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RegistrarNecesidadCapacitacion/label_Listado Necesidad Capacitacin'))

if (comp == 'Listado Necesidad Capacitación') {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarNecesidadCapacitacion/a_Nuevo'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarNecesidadCapacitacion/span_Terapia de manos - individual'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RegistrarNecesidadCapacitacion/a_Guardar'))

    String fin = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RegistrarNecesidadCapacitacion/span_Registro guardado'))

    if ((fin == 'Registro guardado') && WebUI.verifyElementVisible(findTestObject('Object Repository/MÓDULOS/RegistrarNecesidadCapacitacion/a_Autorizar'))) {
        WebUI.closeBrowser()
    }
}

