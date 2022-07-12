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

WebUI.comment('ESTA PRUEBA DEBERIA EJECUTARSE ANTES DE EMPEZAR LAS PRUEBAS, SOLO ES NECESARIO HACERLO EMPEZANDO UNA VEZ. Aplicacion novedad empleado, seccion Por Autorizar, Por legalizar ')

WebUI.callTestCase(findTestCase('0-Login/0.4-LoginModificado/LoginFunSara'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Login/LoginModificado/LoginSara/input_Empresa 1_form_templatej_idt24_input'),
	'Aplicacion Nov. Empleado')

WebUI.click(findTestObject('Object Repository/Login/LoginModificado/LoginSara/span_Aplicacion Nov. Empleado'))

WebUI.comment('Por Autorizar Novedad')

WebUI.click(findTestObject('Object Repository/MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Novedad'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Nombre Funcionario_aplicaNovedadProcesoj_idt167'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    '80769954')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954'))

String conf = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

while (conf != 'No se encontró registros') {
    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954_reg'))

    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Eliminar'))

    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Aceptar'))

    String conf1 = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

    conf = conf1
}

WebUI.comment('Por Autorizar Ausentismo')

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Ausentismo'))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/span_Tipo Novedad_ui-icon ui-icon-plusthick'))

WebUI.waitForElementClickable(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Nombre Funcionario_aplicaNovedadProcesoj_idt167'), 
    0)

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Nombre Funcionario_aplicaNovedadProcesoj_idt167'))

WebUI.setText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    '80769954')

WebUI.sendKeys(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954'))

String confa = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

while (confa != 'No se encontró registros') {
    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954_reg'))

    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Eliminar Directo'))

    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Aceptar'))

    String confa1 = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

    confa = confa1
}

WebUI.comment('Por Autorizar Solicitud')

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Solicitud'))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/span_Tipo Novedad_ui-icon ui-icon-plusthick'))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Nombre Funcionario_aplicaNovedadProcesoj_idt167'))

WebUI.setText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    '80769954')

WebUI.sendKeys(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954'))

String sol = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

while (sol != 'No se encontró registros') {
    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954_reg'))

    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_EliminarSol'))

    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/span_Si'))

    String sol1 = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

    sol = sol1
}

WebUI.comment('Por Legalizar Novedad')

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_NovedadLeg'))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/span_Tipo Novedad_ui-icon ui-icon-plusthick'))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Nombre Funcionario_aplicaNovedadProcesoj_idt167'))

WebUI.setText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    '80769954')

WebUI.sendKeys(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954'))

String novLeg = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

while (novLeg != 'No se encontró registros') {
    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954_reg'))
	//Antes era Eliminar el xpath, se cambio a "No Legalizar"
    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Eliminar'))

    //Antes era Aceptar el xpath, se cambio a "Cancelar"
	WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Aceptar'))

    String novLeg1 = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

    novLeg = novLeg1
}

WebUI.comment('Por Legalizar Ausentismo')

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_AusentismoLeg'))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/span_Tipo Novedad_ui-icon ui-icon-plusthick'))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Nombre Funcionario_aplicaNovedadProcesoj_idt167'))

WebUI.setText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    '80769954')

WebUI.sendKeys(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954'))

String legAus = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

while (legAus != 'No se encontró registros') {
    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954_reg'))

    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Eliminar Directo'))

    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Aceptar'))

    String legAus1 = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

    legAus = legAus1
}

WebUI.comment('Por Legalizar Solicitud')

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_SolicitudLeg'))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/span_Tipo Novedad_ui-icon ui-icon-plusthick'))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_Nombre Funcionario_aplicaNovedadProcesoj_idt167'))

WebUI.setText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    '80769954')

WebUI.sendKeys(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/input_Filtro Empleado_form_popupEmpleadoj_idt4291'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954'))

String legSol = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

while (legSol != 'No se encontró registros') {
    WebUI.waitForElementVisible(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954_reg'), 0)

    WebUI.doubleClick(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_80769954_reg'))

    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/a_EliminarSol'))

    WebUI.click(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/span_Si'))

    String legSol1 = WebUI.getText(findTestObject('MÓDULOS/LimpiaDatosAplicacionNovedadSara/td_No se encontr registros'))

    legSol = legSol1
}

WebUI.closeBrowser()

