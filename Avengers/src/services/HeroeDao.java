package services;


import entities.Heroe;
import util.Conexion;

public class HeroeDao extends Conexion<Heroe> implements GenericDao<Heroe> {
	
public HeroeDao(){
		super(Heroe.class);
	}

}
