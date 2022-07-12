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

WebUI.callTestCase(findTestCase('0-Login/0.1-LoginFun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Cargue Masivo'))

WebUI.comment('Cargue Actualizar Jefe Proceso Base De Datos')

WebUI.setText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/input_Fuente_formFuentesj_idt4419'), 'Actualizar Jefe Proceso Base De Datos')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/input_Fuente_formFuentesj_idt4419'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_Actualizar Jefe Proceso Base De Datos'))

/*WebUI.click(findTestObject('MÓDULOS/CargueMasivoAplicarNovEmp/span_Cargar'))
*/
/*WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/span_Cargar'))
*/
String ruta = GlobalVariable.g_rutaarchivos + 'ActualizacionJefe.txt'

WebUI.uploadFile(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/span_Cargar'), ruta)

WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Importar'))

String cargo = WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/div_Se cargo el archivo'))

if(cargo == 'Se cargo el archivo') {
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Continuar'))
	
	if(WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_354968431354101546370')).equals('354968431354 101546370')) {
		
		WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Ejecutar'))
		
		String t1 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/div_Ejecutando los Servicios'))
		
		String t2 = WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/div_Se ejecuto'))
		
		if(t1=='Ejecutando los Servicios' || t2 == 'Se ejecuto') {
			
			WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Continuar'))
			
			if(WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/span_1')).equals('1')) {
							
				WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Regresar'))
			
				WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Regresar'))
			}
		}
	}
} else {
	WebUI.closeBrowser()
}

WebUI.comment('Cargue Actualizar Jefe Proceso Aplicacion')

WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Cargue Masivo'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/input_Fuente_formFuentesj_idt4419'), 'Actualizar Jefe Proceso Aplicacion')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/input_Fuente_formFuentesj_idt4419'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_Actualizar Jefe Proceso Aplicacion'))

WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/span_Cargar'),1)

WebUI.uploadFile(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/span_Cargar'), ruta)

WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Importar'))

String a = WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/div_Se cargo el archivo'))

if(a.equals('Se cargo el archivo') || a.equals('procesando el archivo')) {
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Continuar'))
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Ver_formImportarFuentelistagrupo0j_idt4168'))
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_1_1'))
	
	if(WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_354968431354'), 1) && WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_354968431354')).equals('354968431354')) {
		
		WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Servicio'))
		
		WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_No se encontr registros_btn_popupInformacion'))
		
		if(WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_parametroscontrato'),
				1) && WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_parametroscontrato')).equals('parametros:contrato')) {
			
			WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Ejecutar'))
			
			String b = WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/div_Se Ejecuto el proceso correctamente Lin_c8377c'))
			
			if(b.equals('Ejecutando los Servicios') || b.equals('Se Ejecuto el proceso correctamente: Lineas Cargadas: 1 Lineas con Errores: 0')) {
				
				WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Continuar'))
				
				WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Ver_formImportarFuentelistagrupo0j_idt4168'))
				
				WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Lnea'))
				
				WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_1_1'))
				
				WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Lnea'))
				
				if(WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_354968431354'), 1) && WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_354968431354')).equals('354968431354')) {
					
					WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Servicio'))
					
					WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_No se encontr registros_btn_popupInformacion'))
					
					if(WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_parametroscontrato'),
							1) && WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/td_parametroscontrato')).equals('parametros:contrato')) {
												
						WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Regresar'))
						
						WebUI.click(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/a_Regresar'))
						
						if(WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/div_Registrar Novedades'),
							1) && WebUI.getText(findTestObject('Object Repository/MÓDULOS/CargueMasivoAplicarNovEmp/div_Registrar Novedades')).equals('Registrar Novedades')) {
							WebUI.closeBrowser()
						}
												
					}
					
				}
				
			}
						
		}
		
	}
	
}



