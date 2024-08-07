package testSetEntradaParam.Servicio;

import java.util.ArrayList;
import java.util.List;

import testSetEntradaParam.DAO.UsuarioDAO;
import testSetEntradaParam.DTO.UsuarioDTO;
import testSetEntradaParam.enums.EstadoDAO;
import testSetEntradaParam.enums.EstadoSvUsDao;

public class ServicioDAO {
	
		private UsuarioDAO usuarioDao= new  UsuarioDAO();
		
		
		
		public EstadoSvUsDao findById(UsuarioDTO usuarioEncontrado, Integer buscarID) {
			List<UsuarioDTO>listaUsuarios = new ArrayList<>();
			EstadoDAO estadoDao= usuarioDao.findAll(listaUsuarios);
			
			if (estadoDao == EstadoDAO.DATOS_ENCONTRADOS) {
				for (UsuarioDTO usuario : listaUsuarios) {
					if(usuario.getId().equals(buscarID)) {
						usuarioEncontrado.setNombre(usuario.getNombre());
						usuarioEncontrado.setApellido(usuario.getApellido());
						usuarioEncontrado.setEdad(usuario.getEdad());
						usuarioEncontrado.setRut(usuario.getRut());
						usuarioEncontrado.setId(usuario.getId());
						return EstadoSvUsDao.USUARIO_ENCONTRADO;
					}
				}
			}
			
			return EstadoSvUsDao.USUARIO_NO_ENCONTRADO;
		}
	
}
