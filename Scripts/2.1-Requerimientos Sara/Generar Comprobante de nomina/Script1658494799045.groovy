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

WebUI.setText(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/input_Empresa 1_form_templatej_idt24_input'), 
    'liquidacion nom')

WebUI.click(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/span_Liquidacion Nom'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/a_Periodo Nomina_LiquidacionNominaj_idt68'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/select_--  Seleccione  --Periodo CerradoPer_92e928'), 
    2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/span_PM202106'))

WebUI.setText(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/input_Contrato_LiquidacionNominaj_idt128'), 
    '1552')

WebUI.sendKeys(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/input_Contrato_LiquidacionNominaj_idt128'), 
    Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/div_Estado_ui-chkbox-box ui-widget ui-corne_beb1cb'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/a_Generar Comprobante'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/label_Publicar'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/select_-- Seleccione --Comprobante de Nomina'), 
    1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/a_Publicar'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/GenerarComprobanteNomina/a_Continuar'))

WebUI.closeBrowser()

