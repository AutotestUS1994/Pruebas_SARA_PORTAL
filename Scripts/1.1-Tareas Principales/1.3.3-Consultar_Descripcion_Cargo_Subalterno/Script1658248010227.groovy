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

WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a'))

String sec = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/label_Descripcin Cargo Sub Alterno'))

if (sec == 'Descripción Cargo Sub Alterno') {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/span_Aprendiz Sena Productiva_btn-hoja us-i_82001a'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Guardar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Conocimientos Especificos'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Solucion De Problemas'))

    WebUI.scrollToElement(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/div_Calidad7 training    Capacitacion24    _4c9da5'), 
        0)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Competencias'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Relacionamiento Del Cargo'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Elementos De Proteccin Personal'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Titulo Carpeta Campo Perfil'))

    WebUI.scrollToElement(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/div_Calidad7 training    Capacitacion24    _4c9da5'), 
        0)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Titulo Adicional Campo Perfil'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Induccion'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Entrenamiento'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Dotacin'))

    WebUI.scrollToElement(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/div_Calidad7 training    Capacitacion24    _4c9da5'), 
        0)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Perfil Del Cargo Campo Perfil'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Funciones Especificas'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Contratos'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarDescripcionCargoSubalterno/a_Plan De Sucesion'))

    WebUI.closeBrowser()
}

