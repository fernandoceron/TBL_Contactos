package client.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import client.Modelo.Contactos;
import client.Servicio.ContactoServicio;
import client.Utilitario.ContactosResponsiveDTO;

@RestController
@RequestMapping("/Contactos")
public class ContactosControlador {	
	
	@Autowired
	ContactoServicio Servicio;
	
	@GetMapping
	public ContactosResponsiveDTO Listar() {
		
		return Servicio.findALL();
		
	}
	
	@PostMapping
	public ContactosResponsiveDTO Insertar(@RequestBody Contactos Contactos) {
		
		return Servicio.Crear(Contactos);
				
	}
	
	@PutMapping
	public ContactosResponsiveDTO Actualizar(@RequestBody Contactos Contactos) {
		
		return Servicio.Actualizar(Contactos);
		
	}
	
	@DeleteMapping("/{id}")
	public ContactosResponsiveDTO Eliminar(@PathVariable Long id) {
		
		return Servicio.Borrar(id);
		
	}
	
}
