package util;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Estado;
import entities.Genero;
import entities.Heroe;
import services.HeroeDao;






public class Prueba {

	public Prueba() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
		

		Heroe e= new Heroe();
		Genero g=new Genero();
		g.setId("A");
		Estado esta=new Estado();
		esta.setId("D");
		
		e.setNombre("juanito");
		e.setHeroe("juancho");
		e.setFechanacimiento(null);
		e.setFechaaparicion(null);
		e.setGeneroBean(g);
		e.setEstadoBean(esta);
		e.setDescripcion("hola");
		e.setArma("Espada");
		
		HeroeDao hDao= new HeroeDao();
		
		hDao.insert(e);
		
		
}
}

