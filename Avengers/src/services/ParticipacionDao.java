package services;


import entities.Participacion;
import util.Conexion;

public class ParticipacionDao extends Conexion<Participacion> implements GenericDao<Participacion> {
	
public ParticipacionDao(){
		super(Participacion.class);
	}

}
