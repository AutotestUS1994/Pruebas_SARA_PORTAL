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

WebUI.setText(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/input_Empresa 1_form_templatej_idt24_input'), 
    'asignaci')

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/span_Asignaci'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/a_Tipo Beneficio_form_listadoBeneficioj_idt69'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/input_Tipo Beneficio_form_listadoBeneficiofiltro'), 
    'Convocatoria Beneficio Prueba Portal')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/input_Tipo Beneficio_form_listadoBeneficiofiltro'), 
    Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/span_Convocatoria Beneficio Prueba Portal'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/a_Filtrar'))

String conv = WebUI.getText(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/td_Convocatoria Beneficio Prueba Portal'))

if (conv == 'CONVOCATORIA BENEFICIO PRUEBA PORTAL') {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/td_Convocatoria Beneficio Prueba Portal'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/a_Beneficiarios'))

    if(WebUI.waitForElementClickable(findTestObject('MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/span_Mendoza 1502 Empleado Port'), 
        1)) {

	    String emp = WebUI.getText(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/span_Mendoza 1502 Empleado Port'))
	
	    if (emp.contains('1502 EMPLEADO PPRUEBA')) {
	        WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/span_Mendoza 1502 Empleado Port'))
	
	        //WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/a_Cambiar Datos'))
	
	        WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/a_Eliminar'))
	
	        String borrar = WebUI.getText(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/label_Desea eliminar el registro'))
	
	        if (borrar == 'DESEA CONFIRMAR') {
				//Se cambio texto Aceptar por Si
	            WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarRegistroInscripcionBeneficioBPM/a_Aceptar'))
	
	            WebUI.closeBrowser()
	        }
	    }
	} else {
		WebUI.closeBrowser()
	}
	
}

