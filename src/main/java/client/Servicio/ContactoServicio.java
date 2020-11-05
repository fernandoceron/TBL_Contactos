package client.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import client.Modelo.Contactos;
import client.Repositorio.ContactosRepositorio;
import client.Utilitario.ContactosMessages;
import client.Utilitario.ContactosResponsiveDTO;

@Service
public class ContactoServicio {

	@Autowired
	ContactosRepositorio Repositoriobd;
	
	public ContactosResponsiveDTO findALL() {
		
		ContactosResponsiveDTO RES = new ContactosResponsiveDTO();
		try {
			
			RES.setRespuestas(Repositoriobd.findAll());
			
		}catch(Exception e) {
			
			RES.setCodigos(ContactosMessages.CODE_FATAL_ERROR);
			RES.setMensajes(ContactosMessages.MSG_FATAL_ERROR);
			e.printStackTrace();
			
		}
		
		return RES;
		
	}
	
		public ContactosResponsiveDTO Crear(Contactos Contactos) {
			
			ContactosResponsiveDTO RES = new ContactosResponsiveDTO();
			try {
				
				RES.setRespuestas(Repositoriobd.save(Contactos));
				
			}catch(Exception e) {
				
				RES.setCodigos(ContactosMessages.CODE_FATAL_ERROR);
				RES.setMensajes(ContactosMessages.MSG_FATAL_ERROR);
				e.printStackTrace();
				
			}
			
			return RES;
			
		}
		
		public ContactosResponsiveDTO Actualizar(Contactos Contactos) {
			
			ContactosResponsiveDTO RES = new ContactosResponsiveDTO();
try {
				
		if(Repositoriobd.existsById(Contactos.getIDCONTACTO())) {
			
			RES.setRespuestas(Repositoriobd.save(Contactos));
			RES.setCodigos(ContactosMessages.CODE_UPDATE_SUCCESS);
			RES.setMensajes(ContactosMessages.MSG_UPDATE_OK);
			
		}else {
			
			RES.setCodigos(ContactosMessages.CODE_ITEM_NOT_FOUND);
			RES.setMensajes(ContactosMessages.MSG_ITEM_NOT_FOUND);
			
		}		
			}catch(Exception e) {
				
				RES.setCodigos(ContactosMessages.CODE_FATAL_ERROR);
				RES.setMensajes(ContactosMessages.MSG_FATAL_ERROR);
				e.printStackTrace();
				
			}

		return RES;

		}
		
		public ContactosResponsiveDTO Borrar(Long id) {
			ContactosResponsiveDTO RES = new ContactosResponsiveDTO();
			try {
				
				if(Repositoriobd.findById(id)!=null) {
					
					Repositoriobd.deleteById(id);
					RES.setCodigos(ContactosMessages.CODE_DELETE_SUCCESS);
					RES.setMensajes(ContactosMessages.MSG_DELETE_OK);
					
				}else {
					
					RES.setCodigos(ContactosMessages.CODE_ITEM_NOT_FOUND);
					RES.setMensajes(ContactosMessages.MSG_ITEM_NOT_FOUND);
					
				}
				
			}catch(Exception e) {
				
				RES.setCodigos(ContactosMessages.CODE_FATAL_ERROR);
				RES.setMensajes(ContactosMessages.MSG_FATAL_ERROR);
				e.printStackTrace();
					
		}
			
			return RES;
			
	}
}
