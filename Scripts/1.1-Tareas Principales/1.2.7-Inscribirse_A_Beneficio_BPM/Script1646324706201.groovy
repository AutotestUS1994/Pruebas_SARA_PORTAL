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

WebUI.callTestCase(findTestCase('0-Login/0.3-LoginEmpleado'), [:], FailureHandling.STOP_ON_FAILURE)
	
WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/a_RRHH'))
	
WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/font_Ver ms'))
	
WebUI.switchToWindowIndex(1)
	
String ven = WebUI.getText(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/label_Convocatoria Beneficio'))
	
String Ben = WebUI.getText(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/span_Beneficio Prueba Portal'))
	
if ((ven == 'Convocatoria Beneficio') && (Ben == 'Beneficio Prueba Portal')) {
	WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/a_Solicitar'))
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/select_-- Seleccione --SolicitanteMartina M_00defa'), 
	        '.', true)
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/a_Guardar'))
	
	String insc = WebUI.getText(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/span_Se Guard el registro correctamente'))
	
	if (insc == 'Se Guardó el registro correctamente') {
	    a()
	} else {
	    WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Borrar Registro Inscripcion Beneficio BPM'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.callTestCase(findTestCase('0-Login/0.3-LoginEmpleado'), [:], FailureHandling.STOP_ON_FAILURE)
		
		WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/a_RRHH'))
		
		WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/font_Ver ms'))
		
		WebUI.switchToWindowIndex(1)
		
		String ven1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/label_Convocatoria Beneficio'))
		
		String Ben1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/span_Beneficio Prueba Portal'))
		
		if ((ven1 == 'Convocatoria Beneficio') && (Ben1 == 'Beneficio Prueba Portal')) {
			WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/a_Solicitar'))
		
			WebUI.selectOptionByValue(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/select_-- Seleccione --SolicitanteMartina M_00defa'),
				'.', true)
		
			WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/a_Guardar'))
		
			String insc1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/span_Se Guard el registro correctamente'))
		
			if (insc1 == 'Se Guardó el registro correctamente') {
				a()
			}
		}
	}
}

	
def a() {
	WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/a'))
	
	String desc = WebUI.getText(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/td_Beneficio 1552 Beneficio Prueba Portal'))
	
	String soli = WebUI.getText(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/td_Beneficio 1552 Mendoza 1502 Empleado Port'))
	
	if ((desc == 'Beneficio 1552 Beneficio Prueba Portal') && (soli == 'Beneficio 1552 Mendoza 1502 Empleado')) {
		WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/td_Beneficio 1552 Mendoza 1502 Empleado Port'))
	
		WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/a_Autorizar'))
	
		WebUI.click(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/span_Si'))
	
		String fin = WebUI.getText(findTestObject('Object Repository/MÓDULOS/InscribirseABeneficioBPM/span_La respuesta se ha guardado correctame_13122f'))
	
		if (fin == 'La respuesta se ha guardado correctamente. Autorizar.') {
			WebUI.closeBrowser()
		}
	}
}

