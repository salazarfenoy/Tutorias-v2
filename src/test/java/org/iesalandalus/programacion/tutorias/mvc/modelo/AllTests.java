package org.iesalandalus.programacion.tutorias.mvc.modelo;

import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.AlumnoTest;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.CitaTest;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.ProfesorTest;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.SesionTest;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.TutoriaTest;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.ModeloMemoriaTest;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.memoria.AlumnosTest;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.memoria.CitasTest;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.memoria.ProfesoresTest;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.memoria.SesionesTest;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.memoria.TutoriasTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AlumnoTest.class, CitaTest.class, ProfesorTest.class, SesionTest.class, TutoriaTest.class,
	AlumnosTest.class, CitasTest.class, ProfesoresTest.class, SesionesTest.class, TutoriasTest.class,
	ModeloMemoriaTest.class })
public class AllTests {

}
