package ec.edu.ups.ppw.eva62mejia.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Inmueble {
	
	@Id
	@GeneratedValue
	@Column(name="inm_codigo")
	private int idInmueble;
	
	@Column(name="inm_tipo")
	private String tipoInmueble;
	
	@Column(name="inm_direccion")
	private String direccionInmueble;
	
	@Column(name="inm_propietario")
	private String propietarioInmueble;
	
	@Column(name="inm_precio")
	private double precioInmueble;

	public int getIdInmueble() {
		return idInmueble;
	}

	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}

	public String getTipoInmueble() {
		return tipoInmueble;
	}

	public void setTipoInmueble(String tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}

	public String getDireccionInmueble() {
		return direccionInmueble;
	}

	public void setDireccionInmueble(String direccionInmueble) {
		this.direccionInmueble = direccionInmueble;
	}

	public String getPropietarioInmueble() {
		return propietarioInmueble;
	}

	public void setPropietarioInmueble(String propietarioInmueble) {
		this.propietarioInmueble = propietarioInmueble;
	}

	public double getPrecioInmueble() {
		return precioInmueble;
	}

	public void setPrecioInmueble(double precioInmueble) {
		this.precioInmueble = precioInmueble;
	}

	@Override
	public String toString() {
		return "Inmueble [idInmueble=" + idInmueble + ", tipoInmueble=" + tipoInmueble + ", direccionInmueble="
				+ direccionInmueble + ", propietarioInmueble=" + propietarioInmueble + ", precioInmueble="
				+ precioInmueble + "]";
	}
	
}
