#language: es
#encoding: utf-8

Característica: Autenticacion pagina web libreria nacional
  Yo como usuario de la libreria nacional
  Quiero autenticarme en la pagina web con usuario y clave
  Para disfrutar de mis beneficios con libreria nacional

  @PruebaExitosa
  Esquema del escenario: Ingreso exitoso a la aplicacion web de libreria nacional
    Dado que Juan se encuentra en la pagina de libreria nacional
    Cuando ella se loguea en la Pagina de Libreria Nacional
      | emailaddress   | password   |
      | <emailaddress> | <password> |
    Entonces ella puede ver el mensaje Hola, Juan!

    Ejemplos:
      | emailaddress         | password   |
      | jfmedellin@gmail.com | 153426Juan |

    @PruebaExitosa1
    Esquema del escenario: Busqueda exitosa a la aplicacion web de libreria nacional
      Dado que Juan se encuentra en la pagina de libreria nacional
      Cuando ella se loguea en la Pagina de Libreria Nacional
        | emailaddress   | password   |
        | <emailaddress> | <password> |
      Y realiza busqueda por proyectos
      Entonces el puede ver "Proyectos"

      Ejemplos:
        | emailaddress         | password   |
        | jfmedellin@gmail.com | 153426Juan |


