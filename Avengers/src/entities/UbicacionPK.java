package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ubicacion database table.
 * 
 */
@Embeddable
public class UbicacionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idpelicula;

	@Column(insertable=false, updatable=false)
	private int idplaneta;

	public UbicacionPK() {
	}
	public int getIdpelicula() {
		return this.idpelicula;
	}
	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}
	public int getIdplaneta() {
		return this.idplaneta;
	}
	public void setIdplaneta(int idplaneta) {
		this.idplaneta = idplaneta;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UbicacionPK)) {
			return false;
		}
		UbicacionPK castOther = (UbicacionPK)other;
		return 
			(this.idpelicula == castOther.idpelicula)
			&& (this.idplaneta == castOther.idplaneta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idpelicula;
		hash = hash * prime + this.idplaneta;
		
		return hash;
	}
}