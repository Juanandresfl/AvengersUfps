package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ubicacion database table.
 * 
 */
@Entity
@NamedQuery(name="Ubicacion.findAll", query="SELECT u FROM Ubicacion u")
public class Ubicacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UbicacionPK id;

	public Ubicacion() {
	}

	public UbicacionPK getId() {
		return this.id;
	}

	public void setId(UbicacionPK id) {
		this.id = id;
	}

}