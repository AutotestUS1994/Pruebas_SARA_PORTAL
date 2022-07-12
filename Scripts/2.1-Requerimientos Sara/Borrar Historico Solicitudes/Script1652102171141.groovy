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

WebUI.comment('Solicitud Novedad')

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/a_Novedad'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/a_Nombre Funcionario_aplicaNovedadProcesoj_idt167'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/input_Filtro Empleado_form_popupEmpleadoj_idt4337'), 
    '80769954')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/input_Filtro Empleado_form_popupEmpleadoj_idt4337'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/td_Mendoza 1502 Empleado Pprueba'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/td_No se encontr registros'))

WebUI.comment('Solicitud Ausentismo')

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/a_Ausentismo'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/a_Tipo Novedad_aplicaNovedadProcesopanelFil_da42f1'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/a_Nombre Funcionario_aplicaNovedadProcesoj_idt167'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/body_Empresa 1Aplicar Novedad EmpleadojQuer_249773'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/input_Filtro Empleado_form_popupEmpleadoj_idt4337'), 
    '80769954')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/input_Filtro Empleado_form_popupEmpleadoj_idt4337'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/span_Mendoza 1502 Empleado Pprueba'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/span_80769954'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/a_Eliminar Directo'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/label_Desea eliminar el registro'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/a_Aceptar'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/BorrarHistoricoSolicitudes/td_No se encontr registros'))

