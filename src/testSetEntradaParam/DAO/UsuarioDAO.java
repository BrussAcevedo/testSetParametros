package testSetEntradaParam.DAO;

import java.util.ArrayList;
import java.util.List;

import testSetEntradaParam.DTO.UsuarioDTO;
import testSetEntradaParam.enums.EstadoDAO;

public class UsuarioDAO {

	
	
	public EstadoDAO findAll (List<UsuarioDTO> listaEntrada){
			
		List<UsuarioDTO> listaTemp = new ArrayList<>();
		listaTemp.clear();
		
		UsuarioDTO usuario1 = new UsuarioDTO("Juan", "Soto", 1, 23, "11.111.111-1");
		UsuarioDTO usuario2 = new UsuarioDTO("María", "Pérez", 2, 30, "12.222.222-2");
		UsuarioDTO usuario3 = new UsuarioDTO("Carlos", "González", 3, 28, "13.333.333-3");
		UsuarioDTO usuario4 = new UsuarioDTO("Ana", "Martínez", 4, 35, "14.444.444-4");
		UsuarioDTO usuario5 = new UsuarioDTO("Luis", "López", 5, 27, "15.555.555-5");
		UsuarioDTO usuario6 = new UsuarioDTO("Elena", "Fernández", 6, 29, "16.666.666-6");
		UsuarioDTO usuario7 = new UsuarioDTO("Miguel", "Torres", 7, 32, "17.777.777-7");
		UsuarioDTO usuario8 = new UsuarioDTO("Laura", "Ramírez", 8, 26, "18.888.888-8");
		UsuarioDTO usuario9 = new UsuarioDTO("Pedro", "Díaz", 9, 31, "19.999.999-9");
		UsuarioDTO usuario10 = new UsuarioDTO("Sara", "Vásquez", 10, 24, "20.000.000-0");
		
		listaTemp.add(usuario1);
		listaTemp.add(usuario2);
		listaTemp.add(usuario3);
		listaTemp.add(usuario4);
		listaTemp.add(usuario5);
		listaTemp.add(usuario6);
		listaTemp.add(usuario7);
		listaTemp.add(usuario8);
		listaTemp.add(usuario9);
		listaTemp.add(usuario10);
		
		listaEntrada.addAll(listaTemp);
		
		
		if (!listaTemp.isEmpty()) {
			return EstadoDAO.DATOS_ENCONTRADOS;
		}
		
				
		return EstadoDAO.DATOS_NO_ENCONTRADOS;
	}
	
	
	
	
}
