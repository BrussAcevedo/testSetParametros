package testSetEntradaParam.DTO;

public class UsuarioDTO {

		private String nombre;
		private String apellido;
		private Integer id;
		private Integer edad;
		private String rut;
		
		
		public UsuarioDTO() {
			
		}
		
		
		public UsuarioDTO(String nombre, String apellido, Integer id, Integer edad, String rut) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.id = id;
			this.edad = edad;
			this.rut = rut;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getEdad() {
			return edad;
		}

		public void setEdad(Integer edad) {
			this.edad = edad;
		}

		public String getRut() {
			return rut;
		}

		public void setRut(String rut) {
			this.rut = rut;
		}

		@Override
		public String toString() {
			return "UsuarioDTO [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", edad=" + edad
					+ ", rut=" + rut + "]";
		}
		
		
	
}
