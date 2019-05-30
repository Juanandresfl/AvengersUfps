package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the participacion database table.
 * 
 */
@Embeddable
public class ParticipacionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idheroe;

	@Column(insertable=false, updatable=false)
	private int idpelicula;

	public ParticipacionPK() {
	}
	public int getIdheroe() {
		return this.idheroe;
	}
	public void setIdheroe(int idheroe) {
		this.idheroe = idheroe;
	}
	public int getIdpelicula() {
		return this.idpelicula;
	}
	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ParticipacionPK)) {
			return false;
		}
		ParticipacionPK castOther = (ParticipacionPK)other;
		return 
			(this.idheroe == castOther.idheroe)
			&& (this.idpelicula == castOther.idpelicula);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idheroe;
		hash = hash * prime + this.idpelicula;
		
		return hash;
	}
}