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

WebUI.setText(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/input_Empresa 1_form_templatej_idt24_input'), 
    'listado de viaticos')

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/li_Listado de Viaticos (act)'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/a_Solicitado_form_listadoviaticosj_idt67'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/input_Filtro Hoja de Vida_formPopupHojaVida_be4f32'), 
    '80769954')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/input_Filtro Hoja de Vida_formPopupHojaVida_be4f32'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/input_Filtro Hoja de Vida_formPopupHojaVida_be4f32'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/td_Mendoza 1502 Empleado'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/tr_Ao'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/input_Ao_form_listadoviaticosanio'), '')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/input_Ao_form_listadoviaticosanio'), Keys.chord(
        Keys.ENTER))

/*Ingresar No. documento al filtro*/
WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/tr_Doc'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/tr_Doc'), '2549')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/tr_Doc'), Keys.chord(Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/td_No se encontr registros'), 
    1) && WebUI.getText(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/td_No se encontr registros')).equals(
    'No se encontró registros')) {
    WebUI.closeBrowser()
} else {
    String emp = WebUI.getText(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/span_Mendoza 1502 Empleado'))

    if ((emp == 'Mendoza 1502 Empleado') || (emp == 'Hojavida. 1502 Empleado Prueba')) {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/span_Mendoza 1502 Empleado'))

        if (WebUI.getText(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/a_Costos')).equals('Costos')) {
            WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/a_Costos'))

            if (WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/td_SEGURO'), 
                1)) {
                WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/td_SEGURO'))

                WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/a_Eliminar'))
            }
        }
        
        if (WebUI.getText(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/a_Programacin')).equals('Programación')) {
            WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/a_Programacin'))

            if (WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/td_MENDOZA 1502 EMPLEADO (1)'), 
                1)) {
                WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/td_MENDOZA 1502 EMPLEADO (1)'))

                WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/a_Eliminar_1'))

                WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/span_Si'))
            }
        }
        
        if (WebUI.getText(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/a_Registro')).equals('Registro')) {
            WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/a_Registro'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/a_Eliminar_1_2'))

            WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/span_Si'))

            if (WebUI.getText(findTestObject('Object Repository/MÓDULOS/BorrarSolicitudViatico/p_El registro ha sido eliminado correctamente')).equals(
                'El registro ha sido eliminado correctamente')) {
                WebUI.closeBrowser()
            }
        }
    }
}

