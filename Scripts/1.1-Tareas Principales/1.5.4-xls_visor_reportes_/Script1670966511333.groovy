import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import java.io.File as File
import com.kms.katalon.entity.testsuite.RunConfigurationDescription as RunConfigurationDescription
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('0-Login/0.1-LoginFun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MÓDULOS/ConsultarDescripcionCargoSubalterno/a'))

WebUI.click(findTestObject('MÓDULOS/sinNombre/a_Ejecutar'))

WebUI.setText(findTestObject('MÓDULOS/sinNombre/input_reporteExternoFormj_idt22'), 'EMPLEADOS ACTIVOS')

WebUI.sendKeys(findTestObject('MÓDULOS/sinNombre/input_reporteExternoFormj_idt22'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('MÓDULOS/sinNombre/td_EMPLEADOS ACTIVOS'))

WebUI.selectOptionByIndex(findTestObject('MÓDULOS/sinNombre/select_empresa'), 1)

WebUI.click(findTestObject('MÓDULOS/sinNombre/span_tabla_ui-radiobutton-icon'))

WebUI.click(findTestObject('MÓDULOS/sinNombre/a_Generar'))

WebUI.click(findTestObject('MÓDULOS/sinNombre/span_Cerrar'))

zoom()

WebUI.scrollToElement(findTestObject('MÓDULOS/sinNombre/img_xls'), 0)

WebUI.click(findTestObject('MÓDULOS/sinNombre/img_xls'))

String RutaA = System()



//---------------------

if (RutaA == 'Windows 10') {
	def rutaW = System.getProperty('user.home') + '/Downloads/'

	rutaW = rutaW.replace('/', '\\')

	println('ESTAES LA RUTA ' + rutaW)

	RutaA = rutaW
	println(RutaA)
} else if (RutaA == 'Linux') {
	def rutaW = System.getProperty('user.home') + '/Descargas/'

	println('ESTA ES LA RUTA' + rutaW)

	RutaA = rutaW
	
	println(RutaA)
} else {
	RutaA = 'Error'
	
	println(RutaA)
}

//----------------------
String rutaA = RutaA

println(rutaA)

String Archivo = 'MIC.xls'

String Archivo1 = 'MIC.xls.crdownload'
String peso = ''

Assert.assertTrue(archivoDescargado(rutaA, Archivo,Archivo1, peso)) 
//--------------------------------------------------------------------------------------------------


boolean archivoDescargado(def rutaA, def Archivo,def Archivo1, def peso) {
    
	println(rutaA)
	println(Archivo)
	println(peso)
	
	File dir = new File(rutaA)

    File[] dirContenidos = dir.listFiles()
	
	println(dirContenidos)
    for (int i = 0; i < dirContenidos.length; i++)  {
		
        if ((dirContenidos[i]).getName().equals(Archivo)||(dirContenidos[i]).getName().equals(Archivo1)) {
            peso = (dirContenidos[i]).length()

            (dirContenidos[i]).delete()

            System.out.println(peso)

			if(peso != '0' ) {
				WebUI.closeBrowser()
				return true
			}else {WebUI.acceptAlert()}
			
			
        }
    }
    
   
}

def System() {
    String RutaA = System.getProperty('os.name')
}

def zoom() {
    Robot robot = new Robot()

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_SUBTRACT)

    robot.keyPress(KeyEvent.VK_CONTROL)

    robot.keyPress(KeyEvent.VK_SUBTRACT)
}

