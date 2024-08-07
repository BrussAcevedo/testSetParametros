package testSetEntradaParam.enums;

public enum EstadoDAO {
	DATOS_ENCONTRADOS ("Estado DAO: Datos Encontrados Correctamente"),
	DATOS_NO_ENCONTRADOS ("Estado DAO: No existen los datos en la BBDD");
	
	
	private String mensaje;
	
	
	EstadoDAO (String mensaje){
		this.mensaje= mensaje;
	}
	
	
	public String getMensaje() {
		return mensaje;
		
	}
	
	
	
}
