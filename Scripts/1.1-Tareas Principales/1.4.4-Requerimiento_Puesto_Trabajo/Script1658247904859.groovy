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

WebUI.comment('SE OMITE POR QUE NO SE PUEDE MOFICAR REQUERIMIENTOS')

WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/a_RRHH'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/img'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Desarrollador Java Junior_btn-hoja us-icon-card-img'))

if (WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/td_REQUERIMIENTO PUESTO PPORTAL'), 
    0)) {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/td_REQUERIMIENTO PUESTO PPORTAL'))

    crearRequerimiento( /*WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/a_RRHH'))
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/img'))
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Desarrollador Java Junior_btn-hoja us-icon-card-img'))
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/td_REQUERIMIENTO PUESTO PPORTAL'))*/ /*
	WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/a_RRHH'))
	
	WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/img'))
	*/ /*WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Desarrollador Java Junior_btn-hoja us-icon-card-img'))
	*/ )
} else {
    borrarRequerimiento()

    WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/a_RRHH'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/img'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Desarrollador Java Junior_btn-hoja us-icon-card-img'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/td_REQUERIMIENTO PUESTO PPORTAL'))

    crearRequerimiento()
}

def crearRequerimiento() {
    if (WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/input_Cantidad_requerimientoPersonalPM_form_8bc9ff'), 
        1)) {
        WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/input_Cantidad_requerimientoPersonalPM_form_8bc9ff'), 
            '1')
    }
    
    if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/tr_Sueldo Autorizado'), 
        1)) {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/tr_Sueldo Autorizado'))

        WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/input_Sueldo Autorizado_requerimientoPerson_802f39'), 
            '1800000')

        WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/input_Sueldo Autorizado_requerimientoPerson_802f39'), 
            Keys.chord(Keys.ESCAPE))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/select_Tcnico AdministrativoOperativo'), 
        1)) {
        WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/select_Tcnico AdministrativoOperativo'), 
            3, FailureHandling.STOP_ON_FAILURE)
    }
    
    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/select_1 mes2 meses3 meses6 mesesNo aplicaOtro'), 
        5, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/textarea_Perfil_requerimientoPersonalPM_for_d762d8'), 
        'Desarrollador Java')

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/textarea_Perfil_requerimientoPersonalPM_for_d762d8'), 
        'Desarrollador Java')

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/input_Horario_requerimientoPersonalPM_formj_7556b0'), 
        '7am')

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/select_1. volumenes de venta2. Carga en vol_3f903a'), 
        7, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/select_Interna AbiertaInterna CerradaExtern_507970'), 
        4, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Continuar'))

    String guardar = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Se han guardado los datos satisfactoriamente'))

    if (guardar == 'Se han guardado los datos satisfactoriamente.') {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Continuar'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Continuar'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Continuar'))

        WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Continuar'))

        String finalizo = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Ha finalizado el proceso'))

        if (finalizo == 'Ha finalizado el proceso.') {
            WebUI.closeBrowser()
        }
    }
}

def borrarRequerimiento() {
    String cargo = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_1552     - Desarrollador Java Junior'))

    if (cargo == '1552 - Desarrollador Java Junior') {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/a_Eliminar'))

        String conf = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/label_Desea eliminar el requerimiento'))

        if (conf == 'Desea eliminar el requerimiento') {
            WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/a_Aceptar'))

            String fin = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoPuesto/span_Se elimino el registro correctamente'))

            if (fin == 'Se elimino el registro correctamente') {
                WebUI.closeBrowser()
            }
        }
    }
}

