<h1 align="center" color="#DA70D6"> Conversor de Monedas </h1>
<p align="Center">
   <img style="text-align:center;" height="300px"  width="600px" src="https://www.pexels.com/es-es/foto/libros-en-maleta-1253522/">
</p>

## Introducción

Literalura es una aplicación de Consola que permite consultar/registrar libros 
y autores de los mismos. Para el registro de libros/autores se hace uso 
de la API Gutendex para obtener la información y posterior almacenarla
en la base de datos de la propia aplicación. Para el tema de 
consultas libros/autores, toda la información se provee
desde la base de datos propia de la aplicación. 

## Paquetes de la aplicación

- **Principal (principal)**
> Este paquete almacena la clase principal del programa, que es la encargada de mostrar
información al usuario, el menú de opciones y de realizar los métodos necesarios para
> el registro y consulta de datos. 
> 
- **Modelo (modelo)**
> Este paquete almacena el modelado de las clases Libro y Autor.
Así como los Record para interpretar las respuestas Json.

- **Repository (repository)**
> Este paquete almacena las interfaces de Libro y Autor, con el fin de generar los 
> datos de respuesta para cada petición de información por parte del usuario.

- **Servicio (servicio)**
>Este paquete almacena 2 clase y 1 Interfaz, los cuáles se encargan de realizar las peticiones 
> http para obtener los datos desde la API Gutendex y posterior transformar esra respuesta a 
> datos del tipo objetos java, con el fin de que se pueda manipular esa información.



