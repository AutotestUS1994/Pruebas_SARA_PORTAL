<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_if(window.PrimeFaces)PrimeFaces.settin_52c178</name>
   <tag></tag>
   <elementGuidId>d2838f8b-a8bd-4457-88b2-6ac9896261b8</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>html</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//html</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
      <webElementGuid>d885c586-cdb3-425e-bf4d-c291cb711247</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xmlns</name>
      <type>Main</type>
      <value>http://www.w3.org/1999/xhtml</value>
      <webElementGuid>aa9e0cda-6373-4848-8965-ceb59374de78</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>if(window.PrimeFaces){PrimeFaces.settings.locale='es';PrimeFaces.settings.viewId='/webcommonAutoServicio/funcionalidades/login.xhtml';PrimeFaces.settings.contextPath='/PortalSara';PrimeFaces.settings.cookiesSecure=false;}
	
	#us-interfaz-tl7d { margin-top:30px; }#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}
	

		
			Acceso usuarios
			


Usuario PortalClaveIngresarOlvide Mi Clave
						
							function obtenerUrlPadre() {
								document.getElementById(&quot;login:sitio&quot;).value = parent
										.obtenerUrlSitio();
								console.log(document
										.getElementById(&quot;login:sitio&quot;).value);
							}
						
			
				cambiarInputSecret();
			











































  
						
			
		
	

	
		component = new SuperComponent(
				'us-interfaz-tl7d',
				'{ &quot;titulo&quot;: &quot;Acceso usuarios&quot;, &quot;customStyle&quot;: &quot;#us-interfaz-tl7d { margin-top:30px; }&quot;  }');
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
	
NoSi/html[1]</value>
      <webElementGuid>6baf522f-b5c5-432a-a83a-6dc87fa25277</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]</value>
      <webElementGuid>c49d8673-2726-4f54-a839-6b5a924e7326</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/MÓDULOS/VisorGeneralReporteEntrada/iframe_Ver ms_7xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</value>
      <webElementGuid>003ede9a-7166-4f00-b463-0301246e6af6</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//html</value>
      <webElementGuid>9cb801f0-860e-49a3-a781-90334c56d277</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//html[(text() = concat(&quot;if(window.PrimeFaces){PrimeFaces.settings.locale=&quot; , &quot;'&quot; , &quot;es&quot; , &quot;'&quot; , &quot;;PrimeFaces.settings.viewId=&quot; , &quot;'&quot; , &quot;/webcommonAutoServicio/funcionalidades/login.xhtml&quot; , &quot;'&quot; , &quot;;PrimeFaces.settings.contextPath=&quot; , &quot;'&quot; , &quot;/PortalSara&quot; , &quot;'&quot; , &quot;;PrimeFaces.settings.cookiesSecure=false;}
	
	#us-interfaz-tl7d { margin-top:30px; }#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}
	

		
			Acceso usuarios
			


Usuario PortalClaveIngresarOlvide Mi Clave
						
							function obtenerUrlPadre() {
								document.getElementById(&quot;login:sitio&quot;).value = parent
										.obtenerUrlSitio();
								console.log(document
										.getElementById(&quot;login:sitio&quot;).value);
							}
						
			
				cambiarInputSecret();
			











































  
						
			
		
	

	
		component = new SuperComponent(
				&quot; , &quot;'&quot; , &quot;us-interfaz-tl7d&quot; , &quot;'&quot; , &quot;,
				&quot; , &quot;'&quot; , &quot;{ &quot;titulo&quot;: &quot;Acceso usuarios&quot;, &quot;customStyle&quot;: &quot;#us-interfaz-tl7d { margin-top:30px; }&quot;  }&quot; , &quot;'&quot; , &quot;);
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
	
NoSi/html[1]&quot;) or . = concat(&quot;if(window.PrimeFaces){PrimeFaces.settings.locale=&quot; , &quot;'&quot; , &quot;es&quot; , &quot;'&quot; , &quot;;PrimeFaces.settings.viewId=&quot; , &quot;'&quot; , &quot;/webcommonAutoServicio/funcionalidades/login.xhtml&quot; , &quot;'&quot; , &quot;;PrimeFaces.settings.contextPath=&quot; , &quot;'&quot; , &quot;/PortalSara&quot; , &quot;'&quot; , &quot;;PrimeFaces.settings.cookiesSecure=false;}
	
	#us-interfaz-tl7d { margin-top:30px; }#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}
	

		
			Acceso usuarios
			


Usuario PortalClaveIngresarOlvide Mi Clave
						
							function obtenerUrlPadre() {
								document.getElementById(&quot;login:sitio&quot;).value = parent
										.obtenerUrlSitio();
								console.log(document
										.getElementById(&quot;login:sitio&quot;).value);
							}
						
			
				cambiarInputSecret();
			











































  
						
			
		
	

	
		component = new SuperComponent(
				&quot; , &quot;'&quot; , &quot;us-interfaz-tl7d&quot; , &quot;'&quot; , &quot;,
				&quot; , &quot;'&quot; , &quot;{ &quot;titulo&quot;: &quot;Acceso usuarios&quot;, &quot;customStyle&quot;: &quot;#us-interfaz-tl7d { margin-top:30px; }&quot;  }&quot; , &quot;'&quot; , &quot;);
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
	
NoSi/html[1]&quot;))]</value>
      <webElementGuid>9dbbdc65-6158-42d2-8e62-7665509161b2</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
