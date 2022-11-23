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

WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/a_RRHH'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/font_Ver ms'))

WebUI.switchToWindowIndex(1)

String registros = WebUI.getText(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/td_No se encontr registros'))

if (registros == 'No se encontró registros') {
    WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Modificar Inscripcion Evaluacion Bienestar'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/a_RRHH'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/font_Ver ms'))

    WebUI.switchToWindowIndex(1)

    if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/td_Promocion y prevencion de la salud portal'), 
        1)) {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/td_Promocion y prevencion de la salud portal'))
    } else {
        WebUI.click(findTestObject('MÓDULOS/EvaluarEventoBienestar/a_check_Activo'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/td_Promocion y prevencion de la salud portal'))
    }
    
    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/label_8'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/select_--Seleccione--SINO'), 
        'S                   ', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/select_--Seleccione--SINO_1'), 
        'S                   ', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/select_--Seleccione--SINO_1_2'), 
        'S                   ', true)

    WebUI.click(findTestObject('MÓDULOS/EvaluarEventoBienestar/label_9'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/a_Guardar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/span_Si'))

    String reg = WebUI.getText(findTestObject('MÓDULOS/EvaluarEventoBienestar/a_Regresar'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/a_Regresar'))) {
        WebUI.closeBrowser()
    }
} else {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/td_Promocion y prevencion de la salud portal'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/label_8'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/select_--Seleccione--SINO'), 
        'S                   ', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/select_--Seleccione--SINO_1'), 
        'S                   ', true)

    WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/select_--Seleccione--SINO_1_2'), 
        'S                   ', true)

    WebUI.click(findTestObject('MÓDULOS/EvaluarEventoBienestar/label_9'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/a_Guardar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/span_Si'))

    String reg = WebUI.getText(findTestObject('MÓDULOS/EvaluarEventoBienestar/a_Regresar'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/MÓDULOS/EvaluarEventoBienestar/a_Regresar'))) {
        WebUI.closeBrowser()
    }
}

