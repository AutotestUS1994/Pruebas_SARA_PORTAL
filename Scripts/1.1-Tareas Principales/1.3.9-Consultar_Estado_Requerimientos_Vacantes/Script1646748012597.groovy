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

WebUI.comment('Ejecutar despues de 1.4.1 y 1.4.2')

WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarEstadoRequerimientosVacantes/a_RRHH'))

WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarEstadoRequerimientosVacantes/img_Proceso de seleccin_img-responsive'))

WebUI.switchToWindowIndex(1)

String regBorrar = WebUI.getText(findTestObject('MÓDULOS/ConsultarEstadoRequerimientosVacantes/span_Desarrollador Java Junior _Delete'))

while ((regBorrar == 'Desarrollador react') || (regBorrar == 'Desarrollador Java Junior')) {
    WebUI.click(findTestObject('MÓDULOS/ConsultarEstadoRequerimientosVacantes/span_Desarrollador Java Junior _Delete'))

    WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarEstadoRequerimientosVacantes/a_Eliminar'))

    String confDel = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ConsultarEstadoRequerimientosVacantes/label_Desea eliminar el requerimiento'))

    if (confDel == 'Desea eliminar el requerimiento') {
        WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarEstadoRequerimientosVacantes/a_Aceptar'))

        String terDel = WebUI.getText(findTestObject('Object Repository/MÓDULOS/ConsultarEstadoRequerimientosVacantes/span_Se elimino el registro correctamente'))

        if (terDel == 'Se elimino el registro correctamente.') {
            WebUI.closeBrowser()
        }
    }
    
    String regBorrar2 = WebUI.getText(findTestObject('MÓDULOS/ConsultarEstadoRequerimientosVacantes/span_Desarrollador Java Junior _Delete'))

    regBorrar = regBorrar2
}

WebUI.click(findTestObject('Object Repository/MÓDULOS/ConsultarEstadoRequerimientosVacantes/span_Desarrollador Java Junior'))

WebUI.verifyElementVisible(findTestObject('Object Repository/MÓDULOS/ConsultarEstadoRequerimientosVacantes/span_Estado'))

WebUI.closeBrowser()

