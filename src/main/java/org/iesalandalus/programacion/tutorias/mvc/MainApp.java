package org.iesalandalus.programacion.tutorias.mvc;

import org.iesalandalus.programacion.tutorias.mvc.controlador.Controlador;
import org.iesalandalus.programacion.tutorias.mvc.modelo.Modelo;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.FactoriaFuenteDatos;
import org.iesalandalus.programacion.tutorias.mvc.vista.Vista;

public class MainApp {

	public static void main(String[] args) {
		Modelo modelo = new Modelo(FactoriaFuenteDatos.MEMORIA.crear());
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo, vista);
		controlador.comenzar();
	}

}
