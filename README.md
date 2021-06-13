# RetoScreenplay
Se crea features con CP de login y CP de busqueda y cierre de sesión.
Se crea Runner y se ejecuta para obtener los steps, seguido se crea la clase stepdefinition y se agregan los steps.
Se crea una carpeta para almacenar el driver de chrome, seguido se crea en el paquete de utils con la clase MidriverDeChrome con las intrucciones para manejar el navegador y la clase concstantes para al,acenar la URL
Se crea el paquete userinterfaces para realizar los mapeos de cada una de las ventanas a revisar.
Se crea el paquete interactions con la clase CerrarAlerta inicial para continuar, tambien se crea la clase Mi cuenta.
Se crea el paquete models donde se crea la clase DatosLogin, donde se gestionan los datos requeridos para iniciar sesión.
Se crea el paquete task, el cual se crea la clase iniciar sesion, en esta clase se da click en el boton de ingresar datos y se realiza login.
En este mismo paquete se crea la clase RealizarBusqueda la cual se utilizara para gestionar la barra de busqueda, tambien se crea la tarea CerrarSesion para finalizar el proceso
Se crea el paquete questions donde se crean dos clases para realizar las verificaciones de cada uno de los casos , se obtenddran los mensajes de resultados y se verifican que coincidan los resultados y el login
Por ultimo se invocan todas las clases creadas desde el stepdefinition inicando con la creacion del actor, seguido se levanta el navegador, luego se reaalizara el login , continuamos con la busqueda y verificaciones y se finaliza cerrando sesión
