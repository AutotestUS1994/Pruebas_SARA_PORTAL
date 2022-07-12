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

WebUI.callTestCase(findTestCase('0-Login/0.4-LoginModificado/Login_Servicio_Hoja_vida'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MÓDULOS/ServicioHojaVida/DiligenciarHojaVida/input__hojaVidanombresTexto'), 'EMPLEADO PPrueba')

WebUI.click(findTestObject('MÓDULOS/DiligenciarHV/a__hojaVidaseccionj_idt11910j_idt159'))

WebUI.setText(findTestObject('MÓDULOS/DiligenciarHV/input_Ubicacin Geogrfica_formPopUpUbicacion_29375f'), 'Bogo')

WebUI.sendKeys(findTestObject('MÓDULOS/DiligenciarHV/input_Ubicacin Geogrfica_formPopUpUbicacion_29375f'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/DiligenciarHV/td_COLO      COLOMBIA'))

WebUI.click(findTestObject('MÓDULOS/DiligenciarHV/a__hojaVidaseccionj_idt11911j_idt159'))

WebUI.setText(findTestObject('MÓDULOS/DiligenciarHV/input_Nacionalidad_j_idt744j_idt749'), 'Colombiana')

WebUI.sendKeys(findTestObject('MÓDULOS/DiligenciarHV/input_Nacionalidad_j_idt744j_idt749'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/DiligenciarHV/span_Colombiana'))

WebUI.click(findTestObject('MÓDULOS/ServicioHojaVida/DiligenciarHojaVida/a_Guardar'))

String avisoExitoso = WebUI.getText(findTestObject('MÓDULOS/ServicioHojaVida/DiligenciarHojaVida/label_confirmacion'))

if (avisoExitoso == 'Sus datos han sido Actualizados correctamente') {
    WebUI.click(findTestObject('MÓDULOS/ServicioHojaVida/DiligenciarHojaVida/a_Aceptar'))

    WebUI.closeBrowser()
}

