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

WebUI.setText(findTestObject('Object Repository/MÓDULOS/BorrarLicenciaHistorico/input_Empresa 1_form_templatej_idt24_input'), 
    'listado de Empleado')

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarLicenciaHistorico/span_Listado de Empleado'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/BorrarLicenciaHistorico/input_Identificacin_listadoEmpleadoIdentifi_d1d6ab'), 
    '80769954')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/BorrarLicenciaHistorico/input_Identificacin_listadoEmpleadoIdentifi_d1d6ab'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarLicenciaHistorico/span_80769954'))

WebUI.click(findTestObject('MÓDULOS/BorrarLicenciaHistorico/a_Licencia'))

String sol = WebUI.getText(findTestObject('MÓDULOS/BorrarLicenciaHistorico/legend_Solicitudes'))

if(sol == 'Solicitudes' && WebUI.waitForElementVisible(findTestObject('MÓDULOS/BorrarLicenciaHistorico/span_Licencia Remunerada'), 1)) {
	
	WebUI.click(findTestObject('MÓDULOS/BorrarLicenciaHistorico/span_Licencia Remunerada'))
	
	WebUI.click(findTestObject('MÓDULOS/BorrarLicenciaHistorico/a_Eliminar Directo'))
	
	WebUI.click(findTestObject('MÓDULOS/BorrarLicenciaHistorico/a_Aceptar'))
}

WebUI.click(findTestObject('MÓDULOS/BorrarLicenciaHistorico/a_Histrico'))

if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/BorrarLicenciaHistorico/span_Licencia Remunerada'), 
    1)) {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarLicenciaHistorico/span_Licencia Remunerada'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarLicenciaHistorico/a_Eliminar'))

    WebUI.getText(findTestObject('Object Repository/MÓDULOS/BorrarLicenciaHistorico/label_Desea eliminar el registro'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarLicenciaHistorico/a_Aceptar'))
} else {
    WebUI.click(findTestObject('MÓDULOS/BorrarLicenciaHistorico/a_Vacacin'))

    String sol1 = WebUI.getText(findTestObject('MÓDULOS/BorrarLicenciaHistorico/legend_SolicitudesVac'))

    
    if(sol1=='Solicitudes' && WebUI.waitForElementVisible(findTestObject('MÓDULOS/BorrarLicenciaHistorico/td_11032022'), 1)) {

	    WebUI.click(findTestObject('MÓDULOS/BorrarLicenciaHistorico/td_11032022'))
	
	    WebUI.click(findTestObject('MÓDULOS/BorrarLicenciaHistorico/a_Eliminar Directo_1'))
	
	    WebUI.click(findTestObject('MÓDULOS/BorrarLicenciaHistorico/a_Aceptar'))
		
    } else {
		WebUI.closeBrowser()
    }
}

