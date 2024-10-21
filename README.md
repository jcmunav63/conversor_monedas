# Proyecto - Conversor de Monedas (Java)

Este proyecto es parte del desafío final de la formación **Oracle One - Java Orientado a Objetos**, ofrecida por la plataforma educativa **Alura Latam**.
Es una aplicación de consola que sirve como Conversor de Monedas. La aplicación permite al usuario realizar conversiones entre catorce divisas populares, americanas e internacionales, seleccionadas a partir de las monedas utilizadas en la API externa **ExchangeRate-API**.
Al final de las operaciones, la aplicación guarda los resultados en archivos locales con formato JSON.

## Funcionalidades
Se permite convertir, entre pares de monedas, a partir de la siguiente lista de catorce monedas:

-  **USD** - Dólar de Estados Unidos
-  **GBP** - Libra Esterlina de United Kingdom
-  **CAD** - Dólar Canadiense
-  **AUD** - Dólar Australiano
-  **EUR** - Euro de la Unión Europea
-  **JPY** - Yen Japonés
-  **BRL** - Real Brasileño
-  **COP** - Peso Colombiano
-  **MXN** - Peso Mexicano
-  **ARS** - Peso Argentino
-  **PEN** - Sol Peruano
-  **VES** - Bolívar Soberano Venezolano
-  **CRC** - Colón de Costa Rica
-  **CLP** - Peso Chileno

Por cada conversión de monedas se guarda un archivo JSON con la operación realizada.

## Requisitos
- Java SDK (Software Development Kit) version 17 o superior instalado y configurado localmente.
- IDE o Entorno de Desarrollo Integrado para proyectos Java (por ejemplo: IntelliJ Idea, Eclipse, Netbeans).
- Registrarse en la API web de ExchangeRate; obtener la propia API key.
- Bibliotecas Java HttpRequest, HttpResponse, FileWriter.
- Instalar biblioteca externa gson de Google (manejo de formato JSON).

## Obtener código del siguiente enlace
- https://github.com/jcmunav63/conversor_monedas.git

## Estructura del Proyecto
En la clase Principal se muestran las opciones que el usuario puede elegir en consola para convertir sus monedas.
La clase Principal está enlazada con la clase ConsultaApiMonedas, además de conectarse con las clases listaMonedas y GeneracionArchivo.
La clase ConsultaApiMonedas sirve para obtener datos actualizados desde la API externa ExchangeRate-API. Utiliza los siguientes parámetros: moneda base, moneda objetivo y monto a convertir. Devuelve un objeto con el resultado de la conversión, en formato JSON.
En todas las clases se busca manejar posibles errores de entrada-salida o de ejecución, que permitan al usuario tener una mejor experiencia de uso.
La clase GeneracionArchivo se emplea para guardar los datos de cada operación de conversión en un directorio local, en formato JSON.

## Imágenes de la aplicación
A continuación se presentan algunos ejemplos de operaciones de conversión entre pares de monedas, incluyendo el menú principal de la aplicación, los resultados exitosos, y el manejo de algunos mensajes de error.

- Menú principal 'Conversor de Monedas'
<div>
  <img src="images/menu_USD-EUR-1200.PNG" alt="menu USD-EUR" width="500"  height="auto" />
  <br/>
</div>

- Resultado de convertir 1200 USD a EUR
<div>
  <img src="images/resultado_USD-EUR-1200.PNG" alt="resultado USD-EUR" width="400"  height="auto" />
  <br/>
</div>

- Ingresando moneda base inválida 
<div>
  <img src="images/ingresando_moneda_base_invalida.PNG" alt="moneda base invalida" width="400"  height="auto" />
  <img src="images/ingresa_moneda_base_de_nuevo.PNG" alt="error moneda base" width="400"  height="auto" />
  <br/>
</div>

- Ingresando moneda objetivo inválida 
<div>
  <img src="images/ingresando_moneda_objetivo_invalida.PNG" alt="moneda base invalida" width="400"  height="auto" />
  <img src="images/ingresa_moneda_objetivo_de_nuevo.PNG" alt="error moneda objetivo" width="400"  height="auto" />
  <br/>
</div>

- Ingresando monto a convertir inválido 
<div>
  <img src="images/ingresando_monto_a_convertir_invalido.PNG" alt="moneda base invalida" width="400"  height="auto" />
  <br/>
</div>

👥 Authors
👤 Juan Carlos Muñoz

GitHub: @jcmunav63
Twitter: @jcmunav63
LinkedIn: @juan-carlos-muñoz
