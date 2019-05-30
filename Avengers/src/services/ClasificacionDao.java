package services;


import entities.Clasificacion;
import util.Conexion;

public class ClasificacionDao extends Conexion<Clasificacion> implements GenericDao<Clasificacion> {
	
public ClasificacionDao(){
		super(Clasificacion.class);
	}

}