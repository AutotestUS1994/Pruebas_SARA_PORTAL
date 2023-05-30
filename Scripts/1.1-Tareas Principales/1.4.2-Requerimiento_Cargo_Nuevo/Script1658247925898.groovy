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

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/a_RRHH'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/img'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/select_SeleccionarPlanta Dinamica                (1)Planta Fija                    (B1)'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/select_Seleccionar11111Cargo NuevoCompensat_55921b'), 
    2, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/select_SeleccionarTodos'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/a_Continuar'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/a_Zona Econmica_requerimientoPersonalPM_for_474806'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_QUINCENAL'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/input_Descripcin Cargo_requerimientoPersona_080510'), 
    'Desarrollador react')

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Ubicacin Fsica_btn_popupInformacion'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/input_Ubicacin Fsica_j_idt1010parametroBusq_6a6790'), 
    'Bog')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/input_Ubicacin Fsica_j_idt1010parametroBusq_6a6790'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/td_BOGOT'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/select_-- Seleccione --.APRENDIZ ETAPA LECT_67422e'), 
    8, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/input_Cantidad'), '1')

WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/input_Sueldo Autorizado_requerimientoPerson_739563'), 
    '1500000')

WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/input_Fecha esperada para el cubrimiento de_4c2800'), 
    '30/04/2024')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/input_Fecha esperada para el cubrimiento de_4c2800'), 
    Keys.chord(Keys.TAB))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/select_2120 HORAS1240 HORAS0NO DEFINIDO61Pe_b7a507'), 
    2, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/select_Tcnico AdministrativoOperativo'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/select_1 mes2 meses3 meses6 mesesNo aplicaOtro'), 
    5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/textarea_Perfil_requerimientoPersonalPM_for_0f1a6b'), 
    'Desarrollador React')

WebUI.sendKeys(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/textarea_Perfil_requerimientoPersonalPM_for_0f1a6b'), 
    Keys.chord(Keys.ESCAPE))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/input_Horario_requerimientoPersonalPM_formj_5c0f96'), 
    '7am a 5pm')

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/select_1. volumenes de venta2. Carga en vol_3f903a'), 
    6, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/select_Interna AbiertaInterna CerradaExtern_507970'), 
    4, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/a_Continuar -1'))

String continuar = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Se han guardado los datos satisfactoriamente'))

if (continuar == 'Se han guardado los datos satisfactoriamente.') {
    WebUI.setText(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/input_nombres'), 'katalon cargo nuevo')

    WebUI.click(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/icon_ mas'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar'))

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/textarea_Detalle del Cargo_requerimientoPer_a5c26f'), 
        'Desarrollador con manejo de lenguaje React')

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/textarea_MISION_requerimientoPersonalPM_for_5423ca'), 
        'Desarrollar aplicativos de calidad según requerimientos de los clientes')

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/textarea_Autoridad_requerimientoPersonalPM__208a4a'), 
        'NA')

    WebUI.setText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/textarea_Rendicin de Cuentas_requerimientoP_9ead4f'), 
        'Al Jefe')

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar'))

    WebUI.click(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/a_Continuar_1 - Copy'))

    WebUI.click(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/a_Continuar_2'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/a_Continuar_1'), 
        0)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/a_Continuar_1'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/a_Continuar_1'))

    WebUI.waitForElementClickable(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar - Copy (2)'), 
        0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar - Copy (2)'))

    WebUI.waitForElementClickable(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar - Copy (1)'), 
        0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar - Copy (1)'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar'), 
        0)

    WebUI.click(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar'))

    WebUI.waitForElementClickable(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar - Copy'), 
        1)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar - Copy'))

    WebUI.waitForElementClickable(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar - Copy (3)'), 
        0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar - Copy (3)'))

    WebUI.click(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Continuar - Copy (3)'))

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Ha finalizado el proceso'), 
        0)

    String creado = WebUI.getText(findTestObject('Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/span_Ha finalizado el proceso'))

    if (creado == 'Ha finalizado el proceso.') {
        WebUI.closeBrowser()
    }
}

WebUI.closeBrowser()

