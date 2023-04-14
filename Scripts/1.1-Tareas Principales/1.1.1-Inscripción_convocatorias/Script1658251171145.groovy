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
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

String correo = WebUI.callTestCase(findTestCase('1.1-Tareas Principales/1.1.0-Inscripción_Portal'), [:], FailureHandling.STOP_ON_FAILURE)

println(correo)

String Documento = WebUI.getText(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_documento'))

WebUI.refresh()

WebUI.comment('apartir  de aqui se agrega el cambio de estado a aspirante')

WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/Span_RRHH'))

WebUI.doubleClick(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Convocatorias vigentes'))

WebUI.switchToWindowIndex(3)

String text = WebUI.getText(findTestObject('MÓDULOS/DiligenciarHV/a_fila0'))

String text1 = WebUI.getText(findTestObject('MÓDULOS/DiligenciarHV/a_fila1'))

String text2 = WebUI.getText(findTestObject('MÓDULOS/DiligenciarHV/a_fila2'))

String text3 = WebUI.getText(findTestObject('MÓDULOS/DiligenciarHV/a_fila3'))

if (text == 'Asistente') {
    WebUI.click(findTestObject('MÓDULOS/DiligenciarHV/a_fila0'))
} else if (text1 == 'Asistente') {
    WebUI.click(findTestObject('MÓDULOS/DiligenciarHV/a_fila1'))
} else if (text2 == 'Asistente') {
    WebUI.click(findTestObject('MÓDULOS/DiligenciarHV/a_fila2'))
} else if (text3 == 'Asistente') {
    WebUI.click(findTestObject('MÓDULOS/DiligenciarHV/a_fila3'))
} else {
    WebUI.acceptAlert()
}

WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/input_identificacion'), Documento)

WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/Input_Fecha'), fecha())

WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/Input_Nombre Completo'), 'test katalon inscripcion convocatorias')

WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/Input_Celular'), '319' + identificacion())

WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/Input_Correo Electronico'), correo)

WebUI.selectOptionByIndex(findTestObject('MÓDULOS/Inscripcion_convocatorias/Select_Lorem ipsum dolor sit amter'), 3)

WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Inscribirse'))

String Result0 = WebUI.getText(findTestObject('MÓDULOS/Inscripcion_convocatorias/result0'))

if (Result0 == 'Se ha inscrito correctamente.') {
    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/Span_RRHH'))

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Convocatorias vigentes'))

    WebUI.switchToWindowIndex(3)

    String text4 = WebUI.getText(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_fila4'))

    String text5 = WebUI.getText(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_fila5'))

    String text6 = WebUI.getText(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_fila6'))

    if (text4 == 'Dir. Corp. Senior Digital') {
        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Convocatorias vigentes'))
    } else if (text5 == 'Dir. Corp. Senior Digital') {
        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_fila5'))
    } else if (text6 == 'Dir. Corp. Senior Digital') {
        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_fila6'))
    } else {
        WebUI.acceptAlert()
    }
    
    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Inscribirse2'))

    WebUI.openBrowser('http://192.168.2.19:8380/saraweb/')

    WebUI.maximizeWindow()

    WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/input_Olvide Mi Clave_loginusuario'), 'saraadmin')

    WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/input_Olvide Mi Clave_loginpassword'), 'saraadmin1')

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Ingresar'))

    //WebUI.doubleClick(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Ir'))
    WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/input_Empresa 1_form_templatej_idt24_input'), 'proceso de seleccion (tal)')

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/li_Proceso de Seleccion (tal)'))

    WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/input_Nmero_filtro_procesoseleccionj_idt73'), '14')

    WebUI.sendKeys(findTestObject('MÓDULOS/Inscripcion_convocatorias/input_Nmero_filtro_procesoseleccionj_idt73'), Keys.chord(
            Keys.ENTER))

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/td_14'))

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/div_Citacion'))

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Registro Citacin'))

    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/Inscripcion_convocatorias/span_Katalon  Prueba Inscripcion'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/span_Katalon  Prueba Inscripcion'))

        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Eliminar'))

        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/span_Si'))
    }
    
    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/div_Candidato'))

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Registro Candidato'))

    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/Inscripcion_convocatorias/td_Katalon  Prueba Inscripcion'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/td_Katalon  Prueba Inscripcion'))

        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Eliminar'))

        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/span_Si'))
    }
    
    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Regresar'))

    WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/input_Nmero_filtro_procesoseleccionj_idt73'), '63')

    WebUI.sendKeys(findTestObject('MÓDULOS/Inscripcion_convocatorias/input_Nmero_filtro_procesoseleccionj_idt73'), Keys.chord(
            Keys.ENTER))

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/td_63'))

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/div_Citacion'))

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Registro Citacin'))

    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/Inscripcion_convocatorias/span_Katalon  Prueba Inscripcion'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/span_Katalon  Prueba Inscripcion'))

        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Eliminar'))

        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/span_Si'))
    }
    
    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/div_Candidato'))

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Registro Candidato'))

    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/Inscripcion_convocatorias/td_Katalon  Prueba Inscripcion'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/td_Katalon  Prueba Inscripcion'))

        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Eliminar'))

        WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/span_Si'))
    }
    
    WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
}

def identificacion() {
    double random_double = (Math.random() * 9999) + 999

    random_double = Math.round(random_double * 1000)

    String idenficacion = random_double.toString().replace('.0', '')
}

def fecha() {
    Date today = new Date()

    Number Dia = ((today.format('dd')) as Integer)

    Number Mes = ((today.format('MM')) as Integer)

    Number Año = ((today.format('yyyy')) as Integer)

    Number sumaA = Año - 7

    Año = sumaA

    if ((Dia < 10) && (Mes > 10)) {
        String fecha = (((('0' + Dia) + '/') + Mes) + '/') + Año
    } else if ((Dia < 10) && (Mes < 10)) {
        String fecha = ((((('0' + Dia) + '/') + '0') + Mes) + '/') + Año
    } else if (Mes <= 10) {
        String fecha = ((((Dia + '/') + '0') + Mes) + '/') + Año
    } else {
        String fecha = (((Dia + '/') + Mes) + '/') + Año
    }
}

def cambioAspirante() {
    Robot robot = new Robot()

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_T)
	
	robot.keyRelease(KeyEvent.VK_CONTROL)
	
	robot.keyRelease(KeyEvent.VK_T)
	

    WebUI.switchToWindowIndex(2, FailureHandling.STOP_ON_FAILURE)

    WebUI.navigateToUrl(GlobalVariable.G_LoginSara)

    WebUI.setText(findTestObject('Login/LoginModificado/LoginSara/input_Clave_loginusuario'), GlobalVariable.G_UsuarioFun)

    WebUI.setEncryptedText(findTestObject('Login/LoginModificado/LoginSara/input_Clave_loginpassword'), 'SlAwMcyRKqrwbnzhAs8HhdIg46CWr/2Q')

    WebUI.waitForElementClickable(findTestObject('Login/LoginModificado/LoginSara/a_Ingresar'), 0)

    WebUI.click(findTestObject('Login/LoginModificado/LoginSara/a_Ingresar'))

    WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/input_Empresa 1_form_templatej'), 'Listado Hojas de Vida (hoj)')

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/Inscripcion_convocatorias/li_Listado Hojas de Vida (hoj)'), 0)

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/li_Listado Hojas de Vida (hoj)'))

    WebUI.switchToWindowIndex(1, FailureHandling.STOP_ON_FAILURE)

    String Documento = WebUI.getText(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_documento'))

    WebUI.switchToWindowIndex(2, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('MÓDULOS/Inscripcion_convocatorias/input_Identificacin_listado_hojaVidaj_idt68'), Documento)

    WebUI.sendKeys(findTestObject('MÓDULOS/Inscripcion_convocatorias/input_Identificacin_listado_hojaVidaj_idt68'), Keys.chord(
            Keys.ENTER))

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/Inscripcion_convocatorias/span_Katalon  Prueba Inscripcionsara'), 
        0)

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/span_Katalon  Prueba Inscripcionsara'))

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/span_CambiarTipo Hoja'))

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/Inscripcion_convocatorias/select_-- Seleccione --.ASPIRANTEAspirante NPxEspaol Tipo Hoja EmpleadoIngles Tipo Hoja AspirantepruebaTcnico'), 
        2)

    WebUI.click(findTestObject('MÓDULOS/Inscripcion_convocatorias/a_Aplicar'))

    WebUI.switchToWindowIndex(1, FailureHandling.STOP_ON_FAILURE)
}

