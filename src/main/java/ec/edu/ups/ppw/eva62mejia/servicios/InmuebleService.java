package ec.edu.ups.ppw.eva62mejia.servicios;

import java.util.List;

import ec.edu.ups.ppw.eva62mejia.modelo.Inmueble;
import ec.edu.ups.ppw.eva62mejia.negocio.GestionInmueble;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("inmueble")
public class InmuebleService {
	
	@Inject
	private GestionInmueble gInmueble;
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response guardarInmueble(Inmueble inmueble) {
		try {
			gInmueble.guardarInmueble(inmueble);
			return Response.status(Response.Status.OK).entity(inmueble).build();
					
		} catch (Exception e) {
			// TODO: handle exception
			Error error = new Error();
			error.setCodigo(99);
			error.setMensaje("Error al guardar:" + e.getMessage());
			return Response.status(Response.Status.OK).entity(error).build();
		}	
	}
	
	@GET
	@Path("/listarInmueble")
	@Produces("application/json")
	public List<Inmueble> getAll(){
		
		return gInmueble.getAll();
	}
	
}
