package com.version1.proyecto.presentacion.principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Esta clase lleva el flujo de control de la ventana principal
 * 
 * @author RP
 *
 */
@Component
public class ControlPrincipal {

	@Autowired
	private ventaInicial ventana;
	
	/**
	 * Inicia el flujo de control de la ventana principal
	 * 
	 */

