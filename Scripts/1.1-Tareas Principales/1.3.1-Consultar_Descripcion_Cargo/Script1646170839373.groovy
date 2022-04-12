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

WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_1'))

String sec = WebUI.getText(findTestObject('MÓDULOS/consultarDescripcionCargo/label_Descripcion del Cargo'))

if (sec == 'Descripcion del Cargo') {
    WebUI.verifyElementVisible(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Guardar'))

    WebUI.scrollToElement(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Guardar'), 0)

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Conocimientos Especificos'))

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Solucion De Problemas'))

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Competencias'))

    WebUI.scrollToElement(findTestObject('MÓDULOS/consultarDescripcionCargo/label_Descripcion del Cargo'), 0)

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Relacionamiento Del Cargo'))

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Elementos De Proteccin Personal'))

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Titulo Carpeta Campo Perfil'))

    WebUI.scrollToElement(findTestObject('MÓDULOS/consultarDescripcionCargo/label_Descripcion del Cargo'), 0)

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Titulo Adicional Campo Perfil'))

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Induccion'))

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Entrenamiento'))

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Dotacin'))

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Perfil Del Cargo Campo Perfil'))

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Funciones Especificas'))

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/td_Contratos'))

    WebUI.click(findTestObject('MÓDULOS/consultarDescripcionCargo/a_Plan De Sucesion'))

    WebUI.closeBrowser()
}

