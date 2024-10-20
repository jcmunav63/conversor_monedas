Proyecto Conversor de Monedas

Este proyecto se desarrolló como parte del desafío de Oracle One Java Orientado a Objetos. Consiste en un conversor de monedas que permite realizar conversiones entre varias divisas populares, a través de una aplicación de consola, empleando una API externa y guardando los resultados en archivos JSON.

* Funcionalidades
Se permite convertir entre las siguiente lista de 14 monedas:

USD - Dólar de Estados Unidos
GBP - Libra Esterlina de United Kingdom
CAD - Dólar Canadiense
AUD - Dólar Australiano
EUR - Euro de la Unión Europea
JPY - Yen Japonés
BRL - Real Brasileño
COP - Peso Colombiano
MXN - Peso Mexicano
ARS - Peso Argentino
PEN - Sol Peruano
VES - Bolívar Soberano Venezolano
CRC - Colón de Costa Rica
CLP - Peso Chileno

Por cada conversión se guarda un archivo JSON con la operación realizada.

* Requisitos
- Java version 17 o superior.
- Registrarse en la API web de ExchangeRate; obtener API key.
- Dependencias externas para realizar consultas HTTP.
- Gson v.2.11.0 para serializar y deserializae los datos en formato JSON.

* Estructura del Proyecto
Principal (Main) En esta clase se muestran las opciones que el usuario puede elegir para convertir su moneda. Esta clase está enlazada con la clase ConsultaApi para obtener datos actualizados desde la API.
ConsultaApi Esta clase maneja la conexión a una API externa de conversión de monedas. Recibe como parámetros la moneda base y la moneda objetivo, y devuelve un objeto ResultadoDelCambio con los detalles de la conversión. Además, se encarga de manejar posibles errores en la conexión y respuestas inesperadas de la API.
GeneradorDeArchivos En esta clase se implementa la lógica para guardar los datos de las conversiones en formato JSON. Permite tanto guardar nuevos resultados como cargar el historial de conversiones previas. Se proporciona funcionalidad para verificar si el archivo ya existe y, en caso afirmativo, agregar datos sin sobrescribir el historial anterior.