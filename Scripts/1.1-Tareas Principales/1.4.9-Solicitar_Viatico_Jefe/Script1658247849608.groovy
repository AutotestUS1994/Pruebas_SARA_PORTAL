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

WebUI.callTestCase(findTestCase('2.1-Requerimientos Sara/Borrar Solicitud Viatico'), [:], FailureHandling.STOP_ON_FAILURE)

iniciar()

if(WebUI.waitForElementVisible(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/label_Solicitud Viaticos'), 1))
{
WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/label_Solicitud Viaticos'))
}
WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/a_Nuevo'))

if (WebUI.getText(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/label_BRASIL')).equals('BRASIL')) {
    WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/label_BRASIL'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/a_Continuar'), 1)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/a_Continuar'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/input_Numero_form_detalleSolicitudViaticota_54fae5'), 
        '2549')

    WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/a_Ciudad Origen_form_detalleSolicitudViatic_0b2cab'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/input_Ubicacin Geogrfica_formPopUpUbicacion_7ff27d'), 
        'bog')

    WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/input_Ubicacin Geogrfica_formPopUpUbicacion_7ff27d'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/td_25000     CUNDINAMARCA'))

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/select_-- Seleccione Tipo Comisin --ADMINIS_d91b8e'), 
        1, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/select_--- Seleccione Ambito --EXTERIOR 1EX_e17976'), 
        1, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/input_Fecha prevista_form_detalleSolicitudV_f1589c'), 
        '30/03/2030')

    WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/a_Centro de Costos_form_detalleSolicitudVia_8759c7'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/span_B3'))

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/select_-- Seleccione --BUITRAGO BUITRAGO AN_0be681'), 
        3, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('MÓDULOS/SolicitarViatico/a_popupFuncionario'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/input_Filtro Empleado_form_popupEmpleadoj_idt972'), 
        '80769954')

    WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/input_Filtro Empleado_form_popupEmpleadoj_idt972'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/span_Mendoza 1502 Empleado'))

    WebUI.setText(findTestObject('MÓDULOS/SolicitarViatico/input_FechaSalida'), '30/03/2030')

    /*Cambio de hora*/
    WebUI.setText(findTestObject('MÓDULOS/SolicitarViatico/input_HoraSalida'), '05:00')

    WebUI.sendKeys(findTestObject('MÓDULOS/SolicitarViatico/input_HoraSalida'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('MÓDULOS/SolicitarViatico/input_FechaRegreso'), '15/04/2030')

    /*Cambio de hora*/
    WebUI.setText(findTestObject('MÓDULOS/SolicitarViatico/input_HoraRegreso'), '06:00')

    WebUI.sendKeys(findTestObject('MÓDULOS/SolicitarViatico/input_HoraRegreso'), Keys.chord(Keys.ENTER))

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/select_--- Seleccione Ambito --EXTERIOR 1EX_e17976_1'), 
        1, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/select_--- Seleccione Ambito --EXTERIOR 1EX_e17976_1_2'), 
        1, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/select_--- Seleccione Destino --AMERICAAnti_38c56c'), 
        4, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/select_-- Seleccione Tipo Comisin --ADMINIS_d91b8e_1'), 
        1, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/a__form_detalleSolicitudViaticotablaProduct_50f147'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/a_No se encontraron registros_form_detalleS_3de8da'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/td_Mendoza 1502 Empleado'))

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/select_--- Seleccione Tipo Costo --SEGUROVi_d83b16'), 
        1, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/select_--- Seleccione Aerolnea --AVIANCALAT_7b4f0e'), 
        1, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/input_Entidad_form_detalleSolicitudViaticot_eca72f'), 
        'ViajeSeguro')

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/input_Valor Seguro_form_detalleSolicitudVia_a254cf'), 
        '55000')

    WebUI.click(findTestObject('MÓDULOS/SolicitarViatico/a_agregarRegistroCostos'), FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/a_Guardar'))

    if (WebUI.getText(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/span_Se ha enviado la solicitud de viatico _60d6d0')).equals(
        'Se ha enviado la solicitud de viatico correctamente')) {
        WebUI.closeBrowser() //	WebUI.navigateToUrl('http://192.168.2.19:8580/PortalSara/sitio/portalEmpleados/solicitudViatico')
    } else if (WebUI.getText(findTestObject('Object Repository/MÓDULOS/SolicitarViatico/span_Se ha enviado la solicitud de viatico _60d6d0')).equals(
        'Registro guardado')) {
        WebUI.acceptAlert()
    }
}

def iniciar() {
    WebUI.openBrowser('')

    WebUI.maximizeWindow()

    String i = GlobalVariable.G_Login

    URL url = new URL(i)

    println('URL: ' + url.toString())

    HttpURLConnection connection = ((url.openConnection()) as HttpURLConnection)

    connection.setRequestMethod('GET')

    connection.setReadTimeout(2 * 1000)

    try {
        connection.connect()
    }
    catch (Exception ex) {
        println('No se pudo conectar a la URL' + i)
    } 
    
    boolean flag = connection.connected

    println('Valor_ori: ' + flag)

    if (flag) {
        WebUI.navigateToUrl(i)

        a()
    }
}

def a() {
    WebUI.setText(findTestObject('Login/input_Usuario Portal_loginusuario'), GlobalVariable.G_UsuarioJefe)

    WebUI.setEncryptedText(findTestObject('Login/input_Clave_loginpassword'), 'SlAwMcyRKqrwbnzhAs8HhdIg46CWr/2Q')

    WebUI.waitForElementClickable(findTestObject('Login/a_Ingresar'), 0)

    WebUI.click(findTestObject('Login/a_Ingresar'))

    WebUI.callTestCase(findTestCase('Elegir Empresa/Elegir_Empresa'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.navigateToUrl('http://192.168.2.19:8480/PortalSara/sitio/portalEmpleados/solicitudViatico')
}

