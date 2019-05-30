package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the participacion database table.
 * 
 */
@Entity
@NamedQuery(name="Participacion.findAll", query="SELECT p FROM Participacion p")
public class Participacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ParticipacionPK id;

	public Participacion() {
	}

	public ParticipacionPK getId() {
		return this.id;
	}

	public void setId(ParticipacionPK id) {
		this.id = id;
	}

}