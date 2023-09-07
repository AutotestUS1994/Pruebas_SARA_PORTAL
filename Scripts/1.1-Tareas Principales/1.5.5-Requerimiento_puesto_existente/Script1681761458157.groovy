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

WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/a_RRHH'))

WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/img'))

String campo1

String campo2

String campo3

String campo4

if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo1'), 1) & (WebUI.getText(
    findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo1')) == 'Abogado Junior')) {
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag'))
} else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo2'), 1) & 
(WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo2')) == 'Abogado Junior')) {
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag1'))
} else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo3'), 1) & 
(WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo3')) == 'Abogado Junior')) {
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag2'))
} else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo4'), 1) & 
(WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo4')) == 'Abogado Junior')) {
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag3'))
} else {
    WebUI.acceptAlert()
}

if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/td_REQUERIMIENTO PUESTO PPORTAL'), 
    1)) {
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/td_REQUERIMIENTO PUESTO PPORTAL'))

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_menu Requerimiento'), 
        1)
} else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_menu Requerimiento'), 
    1)) {
    eliminarR()
}

formularios()

def funcionesE() {
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar5'))

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo'))

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_MACROPROCESO'), 'macroproceso katalon')

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Guardar'))

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'))

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'))
}

def entretenimiento() {
    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo'))

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/select_Curso1'), 3)

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Dias1'), '1')

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Requerido1'), '1')

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Guardar'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar4'), 0)

    WebUI.doubleClick(findTestObject('MÓDULOS/RequerimientoPuestoExistente/iframe_coponent_A_2'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar4'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar4'), FailureHandling.STOP_ON_FAILURE)
}

def tituloACP() {
    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo'))

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/select_Capacitacion'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/select_Capacitacion'), 1)

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Magbitud interna'), 'magnitud interna')

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Guardar'))

    if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'))
    } else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar3'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar3'))
    }
}

def conocimientosE() {
    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo - Copy'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo - Copy'))

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Conocimientos'), 'Conocimientos katalon')

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Guardar'))

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'))

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'))
}

def solucionDP() {
    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo'))

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Grado'), 'grado katalon')

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Guardar'))

    WebUI.scrollToElement(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'), 0)

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar4'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar4'))
}

def TituloCCP() {
    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo'))

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/select_curso'), 3)

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_cantidad requerida'), '1')

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Area'), 'area katalon')

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_ROL'), 'Rol katalon')

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_PROPOSITO'), 'Proposito katalon')

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Dias'), '1')

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Guardar'))

    if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'))
    } else {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar3'))
    }
}

def descripcionGeneral() {
    WebUI.scrollToPosition(300, 500)

    while (WebUI.waitForElementPresent(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar1'), 
        1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Centro Costo')) == 'Centro Costo')) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar1'))

        break
    }
    
    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Detalle del Cargo'), 'cargo Katalon')

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_MISION'), 'Mision Pruebas katalon')

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Autoridad'), 'autoridad pruebas katalon')

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Rendicion de Cuentas'), 'RC pruebas katalon')

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'))
}

def competencias() {
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Nuevo'))

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/select_COMPETENCIAS'), 7)

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/select_NIVEL'), 5)

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_MAXIMO'), '25')

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_ESPERADO'), '20')

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/a_Guardar'))

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'), 0)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar2'))
}

def candidato() {
    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/icon_equis'), 1)) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/icon_equis'))

        break
    }
    
    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Nombres'), 0)

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Nombres'), 'Candidato katalon')

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/icon_mas'))

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar'))
}

def Requerimiento() {
    if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Cantidad'), 1)) {
        WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Cantidad'), '1')
    }
    
    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Sueldo Autorizado'), '1500000')

    println(fecha())

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_fecha esperada'), fecha())

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/select_tipo de cargo'), '2')

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/select_duracion del contrato'), 
        '6')

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_perfil'), 'PERFIL PRUEBAS KATALON ')

    WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/input_Horario'), '8')

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/select_Justificacion'), 4)

    WebUI.selectOptionByIndex(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/select_Convocatoria'), 3)

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/span_Continuar'))
}

def formularios() {
    Requerimiento()

    candidato()

    descripcionGeneral()

    competencias()

    TituloCCP()

    solucionDP()

    conocimientosE()

    tituloACP()

    entretenimiento()

    funcionesE()

    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/li_alert'), 0)

    if (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/Formularios/li_alert')) == 'Ha finalizado el proceso.') {
        WebUI.closeBrowser()
    }
}

def eliminarR() {
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Funciones Especificas'))

    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_macroproceso katalon'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_macroproceso katalon'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_eliminar1'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Si'))

        if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Aceptar'), 
            1)) {
            WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Aceptar'))
        }
    }
    
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Entrenamiento'))

    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Curso de Excel'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Curso de Excel'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_eliminar2'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Si'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Aceptar'))
    }
    
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a _Titulo Adicional Campo perfil'))

    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_magnitud interna'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_magnitud interna'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_eliminar2'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Si'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Aceptar'))
    }
    
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Conocimientos Especificos'))

    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Conocimientos katalon'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Conocimientos katalon'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_eliminar2'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Si'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Aceptar'))
    }
    
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Solucion de problemas'))

    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_grado katalon'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_grado katalon'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_eliminar2'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Si'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Aceptar'))
    }
    
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Titulo carpeta campo perfil'))

    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Proposito katalon'), 
        2)) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Proposito katalon'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_eliminar2'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Si'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Aceptar'))
    }
    
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_competencias'))

    while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Solución de problemas'), 
        1)) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Solución de problemas'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_eliminar2'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Si'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Aceptar'))
    }
    
    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_eliminar'))

    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Aceptar'))

    if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/label_advertencia'), 
        1)) {
        if (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/label_advertencia')) == 'No es posible efectuar elimninacion, proceso seleccion relacionados') {
            WebUI.callTestCase(findTestCase('0-Login/0.4-LoginModificado/LoginFunSara'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.setText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/input_Empresa 1_form_templatej_idt24_input'), 
                'Proceso de Seleccion (tal)')

            WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/li_Proceso de Seleccion (tal)'))

            while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/td_20117    - Abogado Junior'), 
                1)) {
                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/td_20117    - Abogado Junior'))

                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/a_Medio'))

                while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/td_No genera Evaluaciones'), 
                    1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/td_No genera Evaluaciones')) != 
                'No se encontró registros')) {
                    WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/td_No genera Evaluaciones'))

                    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/td_No genera Evaluaciones'))

                    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/a_Eliminar'))

                    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/span_Si'))
                }
                
                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/a_Etapa'))

                while (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/td_Etapa Inscripcion Convocatoria Btn'), 
                    1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/td_Etapa Inscripcion Convocatoria Btn')) != 
                'No se encontró registros')) {
                    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/td_Etapa Inscripcion Convocatoria Btn'))

                    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/a_Eliminar - Copy'))

                    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/span_Si'))
                }
                
                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/a_Registro Proceso'))

                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/a_EliminarG'))

                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatosSara/span_Si'))
            }
            
            WebUI.callTestCase(findTestCase('0-Login/0.2-LoginJefe'), [:], FailureHandling.STOP_ON_FAILURE)

            WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/a_RRHH'))

            WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/img'))

            String campo1

            String campo2

            String campo3

            String campo4

            if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo1'), 
                1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo1')) == 'Abogado Junior')) {
                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag'))
            } else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo2'), 
                1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo2')) == 'Abogado Junior')) {
                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag1'))
            } else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo3'), 
                1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo3')) == 'Abogado Junior')) {
                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag2'))
            } else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo4'), 
                1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo4')) == 'Abogado Junior')) {
                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag3'))
            } else {
                WebUI.acceptAlert()
            }
            
            if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/td_REQUERIMIENTO PUESTO PPORTAL'), 
                1)) {
                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/td_REQUERIMIENTO PUESTO PPORTAL'))

                WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_menu Requerimiento'), 
                    1)
            } else {
                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_eliminar'))

                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_Aceptar'))

                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/a_RRHH'))

                WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/img'))

                String campo01

                String campo02

                String campo03

                String campo04

                if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo1'), 
                    1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo1')) == 'Abogado Junior')) {
                    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag'))
                } else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo2'), 
                    1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo2')) == 'Abogado Junior')) {
                    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag1'))
                } else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo3'), 
                    1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo3')) == 'Abogado Junior')) {
                    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag2'))
                } else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo4'), 
                    1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo4')) == 'Abogado Junior')) {
                    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag3'))
                } else {
                    WebUI.acceptAlert()
                }
                
                if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/td_REQUERIMIENTO PUESTO PPORTAL'), 
                    1)) {
                    WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/td_REQUERIMIENTO PUESTO PPORTAL'))

                    WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_menu Requerimiento'), 
                        1)
                }
            }
        }
    } else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/li_se elimino el registro correctamente'), 
        1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/li_se elimino el registro correctamente')) == 
    'Se elimino el registro correctamente')) {
        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/a_RRHH'))

        WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/img'))

        String campo1

        String campo2

        String campo3

        String campo4

        if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo1'), 1) & 
        (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo1')) == 'Abogado Junior')) {
            WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag'))
        } else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo2'), 
            1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo2')) == 'Abogado Junior')) {
            WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag1'))
        } else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo3'), 
            1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo3')) == 'Abogado Junior')) {
            WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag2'))
        } else if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo4'), 
            1) & (WebUI.getText(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_campo4')) == 'Abogado Junior')) {
            WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/usuario/span_btn-hoja us-icon-card-imag3'))
        } else {
            WebUI.acceptAlert()
        }
        
        if (WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/td_REQUERIMIENTO PUESTO PPORTAL'), 
            1)) {
            WebUI.click(findTestObject('MÓDULOS/RequerimientoPuestoExistente/td_REQUERIMIENTO PUESTO PPORTAL'))

            WebUI.waitForElementVisible(findTestObject('MÓDULOS/RequerimientoPuestoExistente/EliminarDatos/a_menu Requerimiento'), 
                1)
        }
        
        formularios()
    }
}

def fecha() {
    Date date = new Date()

    SimpleDateFormat myDateFormat = new SimpleDateFormat(', dd MM yyyy')

    String dateText = myDateFormat.format(date)
}

