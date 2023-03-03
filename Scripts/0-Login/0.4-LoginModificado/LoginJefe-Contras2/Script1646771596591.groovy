import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.xml.internal.ws.api.pipe.NextAction as NextAction
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

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

    a( //    break
        //} else {
        //    println('No conecta a: ' + i)
        //aqui coloca el wait y el clic a l modulo Actos
        //TODO: revisar y quitar esto
        )
}

def a() {
    WebUI.setText(findTestObject('Login/input_Usuario Portal_loginusuario'), GlobalVariable.G_UsuarioJefe)

    WebUI.setEncryptedText(findTestObject('Login/input_Clave_loginpassword'), 'SlAwMcyRKqrwbnzhAs8HhdIg46CWr/2Q')

    WebUI.waitForElementClickable(findTestObject('Login/a_Ingresar'), 0)

    WebUI.click(findTestObject('Login/a_Ingresar'))

    WebUI.callTestCase(findTestCase('Elegir Empresa/Elegir_Empresa'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.navigateToUrl('http://192.168.2.19:8480/PortalSara/sitio/portalEmpleados/cambiarClave')

    WebUI.navigateToUrl('http://192.168.2.19:8480/PortalSara/sitio/portalEmpleados/cambiarClave')
}

