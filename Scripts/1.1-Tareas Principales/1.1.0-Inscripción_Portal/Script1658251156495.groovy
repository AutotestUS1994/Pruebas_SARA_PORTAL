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

String correo = ((WebUI.callTestCase(findTestCase('0-Login/0.5-Yopmail/Crear_Yopmail'), [:], FailureHandling.STOP_ON_FAILURE)) as String)

WebUI.openBrowser('http://192.168.2.19:8480/PortalSara/sitio/portalEmpleados/acceso')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/input_Identificacin'), idenficacion())

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/input_Correo'), correo)

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/a_Registrate'))

WebUI.openBrowser('https://yopmail.com/es/')

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/input_correo electrnico temporal_login'), correo)

WebUI.sendKeys(findTestObject('MÓDULOS/InscripcionPortal/input_correo electrnico temporal_login'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/a_Clic aqui'))

WebUI.maximizeWindow()

WebUI.switchToWindowTitle('Portal SARA')

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/input_contrasea'), 'saraadmin1')

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/input_Confirmar clave'), 'saraadmin1')

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/a_Espaol Tipo Hoja Empleado'))

WebUI.scrollToElement(findTestObject('MÓDULOS/InscripcionPortal/a_Aceptar'), 0)

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/a_Aceptar'))

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/input_Nombres'), 'Prueba inscripcion')

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/input_Primer apellido'), 'katalon')

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/input_fecha de Nacimiento'), '08/10/1990')

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/Span_tipo documento'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/a_Cedula ciudadania (Colombia)'))

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/input_fecha expedicion'), '08/10/2008')

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/input_celular'), '319' + idenficacion())

WebUI.selectOptionByIndex(findTestObject('MÓDULOS/InscripcionPortal/select_Grupo_sanguineo'), 8)

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/Span_ciudad de residencia'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/input_ciudad'), 'Bogotá')

WebUI.sendKeys(findTestObject('MÓDULOS/InscripcionPortal/input_ciudad'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/Span_11001BOGOTA'))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/Span_nacionalidad'))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/a_COLOMBIANA'))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/a_Continuar'))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/a_Nuevo'))

WebUI.selectOptionByIndex(findTestObject('MÓDULOS/InscripcionPortal/Select_Modalidad de grado'), 5)

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/Span_institucion'))

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/Input_institucion'), 'UNAD')

WebUI.sendKeys(findTestObject('MÓDULOS/InscripcionPortal/Input_institucion'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/Span_UNAD UNIVERSIDAD NACIONAL ABIERTA Y A DISTACIA'))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/Span_ubicacion fisica'))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/Span_Ubicacion fisica (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/Span_Ubicacion fisica (1)'), 'Bogotá')

WebUI.sendKeys(findTestObject('MÓDULOS/InscripcionPortal/Span_Ubicacion fisica (1)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/Span_BOGOTA'))

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/Input_numero semestre'), '10')

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/Input_Nombre de los estudios titulo obtenido'), 'katalon')

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/Span_profesion'))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/a_ADMINISTRATIVA'))

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/Input_semestre Aprobado'), '10')

WebUI.setText(findTestObject('MÓDULOS/InscripcionPortal/Input_Fecha inicio'), fecha())

WebUI.sendKeys(findTestObject('MÓDULOS/InscripcionPortal/Input_Fecha inicio'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/a_Guardar'))

WebUI.click(findTestObject('MÓDULOS/InscripcionPortal/a_Aceptar - Copy'))

String result = WebUI.getText(findTestObject('MÓDULOS/InscripcionPortal/a_Katalon'))



if (result == 'KATALON') {
	String Result = 'Prueba ok'
	return correo
}
else {
	WebUI.acceptAlert()
}



def idenficacion() {
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

    if (Dia <= 10) {
        String fecha = (((('0' + Dia) + '/') + Mes) + '/') + Año
    } else if (Mes <= 10) {
        String fecha = ((((Dia + '/') + '0') + Mes) + '/') + Año
    } else {
        String fecha = (((Dia + '/') + Mes) + '/') + Año
    }
}

