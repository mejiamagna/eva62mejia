package ec.edu.ups.ppw.eva62mejia.negocio;

import java.util.List;

import ec.edu.ups.ppw.eva62mejia.dao.InmuebleDAO;
import ec.edu.ups.ppw.eva62mejia.modelo.Inmueble;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionInmueble {

	@Inject
	private InmuebleDAO daoInmueble;
	
	public void guardarInmueble(Inmueble inmueble) throws Exception {
		
		
		if(daoInmueble.read(inmueble.getIdInmueble()) == null) {
			try {
				daoInmueble.insert(inmueble);
			}catch(Exception e) {
				e.printStackTrace();
				throw new Exception("Error al insertar: " + e.getMessage());
			}
		}else {
			try {
				daoInmueble.update(inmueble);
			}catch(Exception e) {
				e.printStackTrace();
				throw new Exception("Error al actualizar: " + e.getMessage());
			}
		}
		
	}
	
	public List<Inmueble> getAll(){
		return daoInmueble.getAll();
	}
	
}
