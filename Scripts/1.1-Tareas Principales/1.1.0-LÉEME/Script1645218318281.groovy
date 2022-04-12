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

WebUI.comment('Agregar test generales a esta carpeta (1.1 Tareas Principales)')

WebUI.comment('ordenar como el ejemplo(1.1.1-nombre del test)')

WebUI.comment('cuando se llegue al test 9 seguir como en el ejemplo (1.1.9-test, 1.2.1-test)')

WebUI.comment('si se necesita módulos crear carpetas con numeración : 2.1-ejemplo, 3.1 ejemplo   ')

WebUI.comment('Nombre de pruebas sin espacio y con ralla baja si necesita espacio (1.1.1-ejemplo_prueba)')

WebUI.comment('crea carpetas del modulo y nombre igual al del test en Object Repository para guardar los xpath')

WebUI.comment('')

