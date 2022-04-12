<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_NUEVO CARGORequerimiento Personal Elim_957973</name>
   <tag></tag>
   <elementGuidId>ed1a88f8-6cfd-4a06-99b9-9935f726b3c6</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>marginwidth</name>
      <type>Main</type>
      <value>5</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>marginheight</name>
      <type>Main</type>
      <value>5</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
	

		
			NUEVO CARGO
			


































Requerimiento Personal



										 Eliminar 















RequerimientoCandidatoDescosteoDescripción GeneralCompetenciasTitulo Carpeta Campo PerfilSolucion De ProblemasConocimientos EspecificosInduccionTitulo Adicional Campo PerfilEntrenamientoPerfil Del Cargo Campo PerfilFunciones Especificas









Empresa
Calidad


Unidad Organizacional Padre
 - 


Unidad Organizacional
TEC          - Tecnologia


Estado
Elaboración


Motivo Vacante
Cargo Nuevo







					
					





REQUERIMIENTO












Descripción Centro











Zona Económica *












Descripción Cargo *




Fecha Solicitud




Ubicación Física












Ultimo Ocupo




Vinculación Laboral *
	-- Seleccione --
	.
	APRENDIZ ETAPA LECTIVA
	APRENDIZ ETAPA PRODUCTIVA
	ASISTENTE DE INVESTIGACION
	CONTRATISTA DOCENTE HORA CATEDRA
	ESTUDIANTE EN PRACTICA
	FIJO SALARIO INTEGRAL
	INDEFINIDO
	INDEFINIDO SALARIO INTEGRAL
	PENSIONADO
	PENSIONADO ST
	PROVISIONAL
	TERMINO FIJO




Cantidad 

















REQUERIMIENTOSueldo Autorizado*Fecha esperada para el cubrimiento de la vacante*Turno_Silvia*	
	2:120 HORAS
	1:240 HORAS
	0:NO DEFINIDO
	61:Pensión: Convencional
	62:Pensión: Convencional para compartir 
	56:Pensión: Invalidez riesgo común
	57:Pensión: Invalidez riesgo profesional
	58:Pensión: Jubilación
	59:Pensión: Jubilación compartida
	60:Pensión: Sanción
	54:Pensión: Sobre vivencia temporal por riesgo profes
	52:Pensión: Sobre vivencia temporal riesgo común
	51:Pensión: Sobre vivencia vitalicia riesgo común
	53:Pensión: Sobrev.temp riesgo común cónyuge/compañer
	55:Pensión: Sobreviv temp riesgo profes, cóny/compañe
	50:Pensión: Vejez
RECUERDEasaotro pagosTipo de cargo*	
	Técnico 
	Administrativo
	Operativo
Duraciòn del Contrato*	
	1 mes
	2 meses
	3 meses
	6 meses
	No aplica
	Otro
CúalHorario*Justificación*	
	1. volumenes de venta
	2. Carga en volumenes de operación
	3. Nueva cargo para el proceso
	4. Remplazo
	5. Contratación
	6. Cargo Nuevo 
	7. No aplica
	8-COMPENSATORIO CARGO EX
ObservacionesConvocatoria*	
	Interna Abierta
	Interna Cerrada
	Externa
	Interna y Externa


















Regresar
Continuar























Motivo






Motivo












No Autorizar







Perfil


Descripción
	











Cancelar







Aplicar Cargo


Cargo
	--Seleccione--







Aplicar
Cancelar






























































  
						
			
		
	

	
		component = new SuperComponent(
				'us-interfaz-zacr',
				'{ &quot;titulo&quot;: &quot;NUEVO CARGO&quot;, &quot;customStyle&quot;: &quot; &quot;  }');
		component.inicializar();

		jsf.ajax.addOnEvent(function(data) {
			var ajaxstatus = data.status;
			console.warn('FCO : addOnEvent');
			switch (ajaxstatus) {
			case &quot;success&quot;:
				if (debugEnable) {
					console.log(&quot;US_RESPONSE: &quot; + ajaxstatus);
					console.log(&quot;US_FRAME: &quot; + window.frameElement.name);
				}
				parent.resizeIframe(window.frameElement);
				component.reload();
				break;
			}
		});
	
PreviousNextJanFebMarAprMayJunJulAugSepOctNovDec201220132014201520162017201820192020202120222023202420252026202720282029203020312032SMTW TF S  12345678910111213141516171819202122232425262728293031  id(&quot;requerimientoPersonalPM_form:j_idt706:0:tablaCamHijo:1:fecha_input&quot;)NoSi</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/MÓDULOS/RequerimientoCargo/RequerimientoCargoNuevo/iframe_Nuevo cargo_7F07D451F09D4B35813735F5_66e4dc</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;
	

		
			NUEVO CARGO
			


































Requerimiento Personal



										 Eliminar 















RequerimientoCandidatoDescosteoDescripción GeneralCompetenciasTitulo Carpeta Campo PerfilSolucion De ProblemasConocimientos EspecificosInduccionTitulo Adicional Campo PerfilEntrenamientoPerfil Del Cargo Campo PerfilFunciones Especificas









Empresa
Calidad


Unidad Organizacional Padre
 - 


Unidad Organizacional
TEC          - Tecnologia


Estado
Elaboración


Motivo Vacante
Cargo Nuevo







					
					





REQUERIMIENTO












Descripción Centro











Zona Económica *












Descripción Cargo *




Fecha Solicitud




Ubicación Física












Ultimo Ocupo




Vinculación Laboral *
	-- Seleccione --
	.
	APRENDIZ ETAPA LECTIVA
	APRENDIZ ETAPA PRODUCTIVA
	ASISTENTE DE INVESTIGACION
	CONTRATISTA DOCENTE HORA CATEDRA
	ESTUDIANTE EN PRACTICA
	FIJO SALARIO INTEGRAL
	INDEFINIDO
	INDEFINIDO SALARIO INTEGRAL
	PENSIONADO
	PENSIONADO ST
	PROVISIONAL
	TERMINO FIJO




Cantidad 

















REQUERIMIENTOSueldo Autorizado*Fecha esperada para el cubrimiento de la vacante*Turno_Silvia*	
	2:120 HORAS
	1:240 HORAS
	0:NO DEFINIDO
	61:Pensión: Convencional
	62:Pensión: Convencional para compartir 
	56:Pensión: Invalidez riesgo común
	57:Pensión: Invalidez riesgo profesional
	58:Pensión: Jubilación
	59:Pensión: Jubilación compartida
	60:Pensión: Sanción
	54:Pensión: Sobre vivencia temporal por riesgo profes
	52:Pensión: Sobre vivencia temporal riesgo común
	51:Pensión: Sobre vivencia vitalicia riesgo común
	53:Pensión: Sobrev.temp riesgo común cónyuge/compañer
	55:Pensión: Sobreviv temp riesgo profes, cóny/compañe
	50:Pensión: Vejez
RECUERDEasaotro pagosTipo de cargo*	
	Técnico 
	Administrativo
	Operativo
Duraciòn del Contrato*	
	1 mes
	2 meses
	3 meses
	6 meses
	No aplica
	Otro
CúalHorario*Justificación*	
	1. volumenes de venta
	2. Carga en volumenes de operación
	3. Nueva cargo para el proceso
	4. Remplazo
	5. Contratación
	6. Cargo Nuevo 
	7. No aplica
	8-COMPENSATORIO CARGO EX
ObservacionesConvocatoria*	
	Interna Abierta
	Interna Cerrada
	Externa
	Interna y Externa


















Regresar
Continuar























Motivo






Motivo












No Autorizar







Perfil


Descripción
	











Cancelar







Aplicar Cargo


Cargo
	--Seleccione--







Aplicar
Cancelar






























































  
						
			
		
	

	
		component = new SuperComponent(
				&quot; , &quot;'&quot; , &quot;us-interfaz-zacr&quot; , &quot;'&quot; , &quot;,
				&quot; , &quot;'&quot; , &quot;{ &quot;titulo&quot;: &quot;NUEVO CARGO&quot;, &quot;customStyle&quot;: &quot; &quot;  }&quot; , &quot;'&quot; , &quot;);
		component.inicializar();

		jsf.ajax.addOnEvent(function(data) {
			var ajaxstatus = data.status;
			console.warn(&quot; , &quot;'&quot; , &quot;FCO : addOnEvent&quot; , &quot;'&quot; , &quot;);
			switch (ajaxstatus) {
			case &quot;success&quot;:
				if (debugEnable) {
					console.log(&quot;US_RESPONSE: &quot; + ajaxstatus);
					console.log(&quot;US_FRAME: &quot; + window.frameElement.name);
				}
				parent.resizeIframe(window.frameElement);
				component.reload();
				break;
			}
		});
	
PreviousNextJanFebMarAprMayJunJulAugSepOctNovDec201220132014201520162017201820192020202120222023202420252026202720282029203020312032SMTW TF S  12345678910111213141516171819202122232425262728293031  id(&quot;requerimientoPersonalPM_form:j_idt706:0:tablaCamHijo:1:fecha_input&quot;)NoSi&quot;) or . = concat(&quot;
	

		
			NUEVO CARGO
			


































Requerimiento Personal



										 Eliminar 















RequerimientoCandidatoDescosteoDescripción GeneralCompetenciasTitulo Carpeta Campo PerfilSolucion De ProblemasConocimientos EspecificosInduccionTitulo Adicional Campo PerfilEntrenamientoPerfil Del Cargo Campo PerfilFunciones Especificas









Empresa
Calidad


Unidad Organizacional Padre
 - 


Unidad Organizacional
TEC          - Tecnologia


Estado
Elaboración


Motivo Vacante
Cargo Nuevo







					
					





REQUERIMIENTO












Descripción Centro











Zona Económica *












Descripción Cargo *




Fecha Solicitud




Ubicación Física












Ultimo Ocupo




Vinculación Laboral *
	-- Seleccione --
	.
	APRENDIZ ETAPA LECTIVA
	APRENDIZ ETAPA PRODUCTIVA
	ASISTENTE DE INVESTIGACION
	CONTRATISTA DOCENTE HORA CATEDRA
	ESTUDIANTE EN PRACTICA
	FIJO SALARIO INTEGRAL
	INDEFINIDO
	INDEFINIDO SALARIO INTEGRAL
	PENSIONADO
	PENSIONADO ST
	PROVISIONAL
	TERMINO FIJO




Cantidad 

















REQUERIMIENTOSueldo Autorizado*Fecha esperada para el cubrimiento de la vacante*Turno_Silvia*	
	2:120 HORAS
	1:240 HORAS
	0:NO DEFINIDO
	61:Pensión: Convencional
	62:Pensión: Convencional para compartir 
	56:Pensión: Invalidez riesgo común
	57:Pensión: Invalidez riesgo profesional
	58:Pensión: Jubilación
	59:Pensión: Jubilación compartida
	60:Pensión: Sanción
	54:Pensión: Sobre vivencia temporal por riesgo profes
	52:Pensión: Sobre vivencia temporal riesgo común
	51:Pensión: Sobre vivencia vitalicia riesgo común
	53:Pensión: Sobrev.temp riesgo común cónyuge/compañer
	55:Pensión: Sobreviv temp riesgo profes, cóny/compañe
	50:Pensión: Vejez
RECUERDEasaotro pagosTipo de cargo*	
	Técnico 
	Administrativo
	Operativo
Duraciòn del Contrato*	
	1 mes
	2 meses
	3 meses
	6 meses
	No aplica
	Otro
CúalHorario*Justificación*	
	1. volumenes de venta
	2. Carga en volumenes de operación
	3. Nueva cargo para el proceso
	4. Remplazo
	5. Contratación
	6. Cargo Nuevo 
	7. No aplica
	8-COMPENSATORIO CARGO EX
ObservacionesConvocatoria*	
	Interna Abierta
	Interna Cerrada
	Externa
	Interna y Externa


















Regresar
Continuar























Motivo






Motivo












No Autorizar







Perfil


Descripción
	











Cancelar







Aplicar Cargo


Cargo
	--Seleccione--







Aplicar
Cancelar






























































  
						
			
		
	

	
		component = new SuperComponent(
				&quot; , &quot;'&quot; , &quot;us-interfaz-zacr&quot; , &quot;'&quot; , &quot;,
				&quot; , &quot;'&quot; , &quot;{ &quot;titulo&quot;: &quot;NUEVO CARGO&quot;, &quot;customStyle&quot;: &quot; &quot;  }&quot; , &quot;'&quot; , &quot;);
		component.inicializar();

		jsf.ajax.addOnEvent(function(data) {
			var ajaxstatus = data.status;
			console.warn(&quot; , &quot;'&quot; , &quot;FCO : addOnEvent&quot; , &quot;'&quot; , &quot;);
			switch (ajaxstatus) {
			case &quot;success&quot;:
				if (debugEnable) {
					console.log(&quot;US_RESPONSE: &quot; + ajaxstatus);
					console.log(&quot;US_FRAME: &quot; + window.frameElement.name);
				}
				parent.resizeIframe(window.frameElement);
				component.reload();
				break;
			}
		});
	
PreviousNextJanFebMarAprMayJunJulAugSepOctNovDec201220132014201520162017201820192020202120222023202420252026202720282029203020312032SMTW TF S  12345678910111213141516171819202122232425262728293031  id(&quot;requerimientoPersonalPM_form:j_idt706:0:tablaCamHijo:1:fecha_input&quot;)NoSi&quot;))]</value>
   </webElementXpaths>
</WebElementEntity>
