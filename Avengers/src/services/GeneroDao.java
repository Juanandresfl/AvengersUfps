package services;


import entities.Genero;
import util.Conexion;

public class GeneroDao extends Conexion<Genero> implements GenericDao<Genero> {
	
public GeneroDao(){
		super(Genero.class);
	}

}
