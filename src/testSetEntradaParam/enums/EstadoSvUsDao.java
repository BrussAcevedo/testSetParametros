package testSetEntradaParam.enums;

public enum EstadoSvUsDao {

	USUARIO_ENCONTRADO("EstadoServDAO: Usuario Se encuentra en la lista"),
	USUARIO_NO_ENCONTRADO("EstadoServDAO: el usuario es null o no se encuentra en la lista");
	
	
	private String mensaje;
	
	
	EstadoSvUsDao(String mensaje) {
		this.mensaje= mensaje;
	}
	
	
	public String getMensaje () {
		return mensaje;
	}
	
}
