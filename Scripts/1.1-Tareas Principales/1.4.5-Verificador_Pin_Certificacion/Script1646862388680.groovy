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

WebUI.openBrowser('')
if(GlobalVariable.G_UsuarioFun.equals("weblogic")) {
	
	WebUI.navigateToUrl('http://192.168.2.11:7001/PortalSara/sitio/portalEmpleados/acceso')

	WebUI.setText(findTestObject('MÓDULOS/VerificadorPinCertificacion/input_Identificacin_from_validarcertificaci_a5efec'),
		'90798514')
	WebUI.setText(findTestObject('MÓDULOS/VerificadorPinCertificacion/input_Pin_from_validarcertificaciconpin'), '24-220210307')
	
	WebUI.click(findTestObject('MÓDULOS/VerificadorPinCertificacion/a_Enviar'))
	
	a()
	
} else
{
	WebUI.navigateToUrl('http://192.168.2.19:8480/PortalSara/sitio/portalEmpleados/acceso')
	
	/*WebUI.navigateToUrl('http://192.168.2.19:8580/PortalSara/sitio/portalEmpleados/acceso')*/
	
	WebUI.setText(findTestObject('MÓDULOS/VerificadorPinCertificacion/input_Identificacin_from_validarcertificaci_a5efec'),
		'90798514')
	WebUI.setText(findTestObject('MÓDULOS/VerificadorPinCertificacion/input_Pin_from_validarcertificaciconpin'), '24-220210307')
	
	WebUI.click(findTestObject('MÓDULOS/VerificadorPinCertificacion/a_Enviar'))
	
	a()
}




def a() {
	if(WebUI.waitForElementVisible(findTestObject('MÓDULOS/VerificadorPinCertificacion/span_Error No existe la certificacin'),1)) {
		if(WebUI.getText(findTestObject('MÓDULOS/VerificadorPinCertificacion/span_Error No existe la certificacin'))
			.equals('Error: No existe la certificación')) {
			WebUI.acceptAlert();
		}else {
			WebUI.closeBrowser()
		}
	} else {
		WebUI.closeBrowser()
	}
}



