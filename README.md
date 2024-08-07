		/*README
		 * 
		 * En resumen, la idea es demostrar que los datos son inicializados en este caso en el main
		 * para luego mandar estos parámetros como parámetros de entrada a los diferentes métodos.
		 * Hice un ejemplo considerando una lista y un objeto, que son las cosas que más usamos en
		 * los trabajos. Si bien es un poco más engorroso usarlo así, la ventaja la intenté demostrar
		 * usando enums para el control de errores y condiciones. Entonces lo envío para saber si está
		 * bien trabajarlo así o no.
		 * 
		 * Nota: Como detalle, las condiciones para que esto funcione son:
		 * Objeto:
		 * 	1 - Debe estar inicializado sí o sí, aunque sea con constructor vacío, como el ejemplo que di más arriba.
		 * 	2 - Los datos deben ser seteados uno por uno, como se ve en ServicioDao Find by id.
		 * 
		 * Lista:
		 * 	1 - Debe ser inicializada también antes de enviarla por parámetro (al igual que el objeto).
		 * 
		 *  2 - Dentro del método UsuarioDao findAll se debe crear una lista temporal que inicialmente
		 * obtendrá los datos, para luego pasarlos mediante el addAll collections a la lista que está
		 * en los parámetros de entrada. Esto está así porque en el trabajo que realicé (el de proveedores),
		 * si ponía la lista de entrada dentro de algún iterador como el ciclo while para rescatar los datos,
		 * no me agregaba los datos. Entonces asumí que si metes la lista de entrada dentro de un iterador
		 * no funciona, por eso la lista temp y después el addAll.
		 * 
		 * */
