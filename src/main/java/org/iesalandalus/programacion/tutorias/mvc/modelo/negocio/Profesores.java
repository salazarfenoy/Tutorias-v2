package org.iesalandalus.programacion.tutorias.mvc.modelo.negocio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.Profesor;

public class Profesores {

	private List<Profesor> coleccionProfesores;

	public Profesores() {

		coleccionProfesores = new ArrayList<>();

	}

	public int getTamano() {
		return coleccionProfesores.size();
	}

	private List<Profesor> copiaProfundaProfesores() {
		List<Profesor> copiaProfesores = new ArrayList<>();
		for (Profesor profesor : coleccionProfesores) {
			copiaProfesores.add(new Profesor(profesor));
		}
		return copiaProfesores;

	}

	public void insertar(Profesor profesor) throws OperationNotSupportedException {
		if (profesor == null) {
			throw new NullPointerException("ERROR: No se puede insertar un profesor nulo.");
		}

		int indice = coleccionProfesores.indexOf(profesor);

		if (indice == -1) {
			coleccionProfesores.add(new Profesor(profesor));
		} else {
			throw new OperationNotSupportedException("ERROR: Ya existe un profesor con ese DNI.");
		}

	}

	public Profesor buscar(Profesor profesor) {
		if (profesor == null) {
			throw new IllegalArgumentException("ERROR: No se puede buscar un profesor nulo.");
		}
		int indice = coleccionProfesores.indexOf(profesor);

		if (indice == -1) {
			return null;
		} else {
			return new Profesor(coleccionProfesores.get(indice));
		}

	}

	public void borrar(Profesor profesor) throws OperationNotSupportedException {
		if (profesor == null) {
			throw new IllegalArgumentException("ERROR: No se puede borrar un profesor nulo.");
		}
		int indice = coleccionProfesores.indexOf(profesor);

		if (indice == -1) {
			throw new OperationNotSupportedException("ERROR: No existe ningún profesor con ese DNI.");
		} else {
			coleccionProfesores.remove(indice);
		}
	}

	public List<Profesor> get() {
		List<Profesor> profesoresOrdenados = copiaProfundaProfesores();
		profesoresOrdenados.sort(Comparator.comparing(Profesor::getDni));
		return profesoresOrdenados;
	}
}
