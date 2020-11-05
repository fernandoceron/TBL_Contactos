package client.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CONTACTOS")

public class Contactos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Contacto")
	private Long IDCONTACTO;
	
	@Column(name="Nombres")
	private String NOMBRESCONTACTOS;
	
	@Column(name="Apellidos")
	private String APELLIDOSCONTACTOS;
	
	@Column(name="Num_Telefono")
	private int NUMTELEFONO;
	
	@Column(name="Email")
	private String EMAIL;
	
	@Column(name="Dirección")
	private String DIRECCIÓN;
	
	public Contactos() {
		
	}
	
	public Contactos(Long IDCONTACTO, String NOMBRESCONTACTOS, String APELLIDOSCONTACTOS, int NUMTELEFONO, String EMAIL, String DIRECCIÓN) {
		 this.IDCONTACTO = IDCONTACTO;
	     this.NOMBRESCONTACTOS = NOMBRESCONTACTOS;
	     this.APELLIDOSCONTACTOS = APELLIDOSCONTACTOS;
	     this.NUMTELEFONO = NUMTELEFONO;
	     this.EMAIL = EMAIL;
	     this.DIRECCIÓN = DIRECCIÓN;
	}

	public Long getIDCONTACTO() {
		return IDCONTACTO;
	}

	public void setIDCONTACTO(Long iDCONTACTO) {
		IDCONTACTO = iDCONTACTO;
	}

	public String getNOMBRESCONTACTOS() {
		return NOMBRESCONTACTOS;
	}

	public void setNOMBRESCONTACTOS(String nOMBRESCONTACTOS) {
		NOMBRESCONTACTOS = nOMBRESCONTACTOS;
	}

	public String getAPELLIDOSCONTACTOS() {
		return APELLIDOSCONTACTOS;
	}

	public void setAPELLIDOSCONTACTOS(String aPELLIDOSCONTACTOS) {
		APELLIDOSCONTACTOS = aPELLIDOSCONTACTOS;
	}

	public int getNUMTELEFONO() {
		return NUMTELEFONO;
	}

	public void setNUMTELEFONO(int nUMTELEFONO) {
		NUMTELEFONO = nUMTELEFONO;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getDIRECCIÓN() {
		return DIRECCIÓN;
	}

	public void setDIRECCIÓN(String dIRECCIÓN) {
		DIRECCIÓN = dIRECCIÓN;
	}
	
	
	
}
