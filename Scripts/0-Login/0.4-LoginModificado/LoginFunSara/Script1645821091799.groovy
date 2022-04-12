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

WebUI.openBrowser('')

WebUI.maximizeWindow()

String i = GlobalVariable.G_LoginSara

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
        ) //aqui coloca el wait y el clic a l modulo Actos
    //TODO: revisar y quitar esto
}

def a() {
    WebUI.setText(findTestObject('Login/LoginModificado/LoginSara/input_Clave_loginusuario'), GlobalVariable.G_UsuarioFun)

    WebUI.setEncryptedText(findTestObject('Login/LoginModificado/LoginSara/input_Clave_loginpassword'), 'MkG4/TYiCFC3cb2driP7+Q==')

    WebUI.waitForElementClickable(findTestObject('Login/LoginModificado/LoginSara/a_Ingresar'), 0)

    WebUI.click(findTestObject('Login/LoginModificado/LoginSara/a_Ingresar'))

    WebUI.click(findTestObject('Login/LoginModificado/LoginSara/a_Ir'))

    WebUI.setText(findTestObject('Object Repository/Login/LoginModificado/LoginSara/input_Empresa 1_form_templatej_idt24_input'), 
        'Aplicacion Nov. Empleado')

    WebUI.click(findTestObject('Object Repository/Login/LoginModificado/LoginSara/span_Aplicacion Nov. Empleado'))
}

