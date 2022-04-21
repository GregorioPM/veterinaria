# Aplicativo de escritorio - veterinaria

[![Whats-App-Image-2022-04-20-at-11-01-09-PM.jpg](https://i.postimg.cc/022LhRyp/Whats-App-Image-2022-04-20-at-11-01-09-PM.jpg)](https://postimg.cc/BtkY1zD6)

- La Aplicación para veterinario facilita el trabajo veterinario en la clínica: nos permite contactar con los clientes de forma efectiva y permite supervisar a los veterinarios, nos dan acceso a herramientas y formación que nos pueden resultar muy útiles.

## Proposito

- El presente Readme presenta la arquitectura de software que se utilizó en el proyecto de escritorio Veterinaria, proporciona la descripción general de la arquitectura que pretende brindar al lector una visión global y comprensible del diseño general del software que se está adaptando.

## Arquitectura del sistema

- Sobre la base arquitectónica presentada, se describe a continuación la arquitectura del sistema realizado como prototipo de prueba de concepto. Dicho sistema puede verse como una realización particular de un proyecto que se toma y se adaptó una pequeña gama de funcionalidades. La descripción se organiza repasando las vistas presentadas anteriormente, detallando en cada una de ellas como se resolvió la realización de los componentes definidos, que componentes de infraestructura, tecnologías, herramientas y lenguajes se utilizaron.

## Vista Logica
- Se presenta una vista global de los subsistemas del proyecto y las herramientas externas que se utilizaron para lograr cumplir los cometidos definidos para cada subsistema.

[![Captura-de-Pantalla-2022-04-20-a-la-s-8-21-50-p-m.png](https://i.postimg.cc/NjgH7FN6/Captura-de-Pantalla-2022-04-20-a-la-s-8-21-50-p-m.png)](https://postimg.cc/xc489fV8)

## Vista de componentes
- La Vista de componentes representa los elementos más dependientes del software y las dependencias entre ellos, siendo un componente un módulo de software que puede ser código fuente, código binario, un ejecutable, o una librería con una interfaz definida. Una interfaz establece las operaciones externas de un componente, las cuales determinan una parte del comportamiento del mismo. Además se representan las dependencias entre componentes o entre un componente y la interfaz de otro, es decir uno de ellos usa los servicios o facilidades del otro.

## Diagrama de componentes
[![Captura-de-Pantalla-2022-04-20-a-la-s-8-30-36-p-m.png](https://i.postimg.cc/cHjzwV03/Captura-de-Pantalla-2022-04-20-a-la-s-8-30-36-p-m.png)](https://postimg.cc/34X9Hfyr)

1. **Cuenta usuario:** representa al usuario que haya realizado inicio de sesión en el sistema
2. **Gestionar y editar el estado de las mascotas:** representa la funcionalidad que tiene el usuario para editar el estado de las mascotas registradas
3. **Registrar nueva mascota:** representa la funcionalidad que tiene el usuario para registrar una nueva mascota en la base de datos.

## Vista de despliegue
- Está sección describe una o más configuraciones físicas sobre las cuales se realiza el deploy del software y es ejecutado, así como la infraestructura necesaria para su instalación. Para el caso del proyecto se describe el escenario general de distribución esperado para los componentes de software antes descritos, las características de los nodos presentados y la comunicación entre los mismos.

## Diagrama de despliegue
[![Captura-de-Pantalla-2022-04-20-a-la-s-8-37-51-p-m.png](https://i.postimg.cc/0j496tHX/Captura-de-Pantalla-2022-04-20-a-la-s-8-37-51-p-m.png)](https://postimg.cc/kRW0zyCW)

1. **Navegador web:** representa el medio por el cual el usuario ingresa al aplicativo
2. **Spring Framework:** es un framework para el desarrollo de aplicaciones y contenedor de inversión de control, de código abierto para la plataforma Java.
3. **Servidor web:** es un programa informático que procesa una aplicación del lado del servidor, realizando conexiones bidireccionales o unidireccionales y síncronas o asíncronas con el cliente y generando o cediendo una respuesta en cualquier lenguaje o aplicación del lado del cliente.

## Vista de datos
- Está sección describe cómo está desarrollado el modelo de datos y determina la estructura lógica de la base de datos y de manera fundamental del modo en que se almacena, organiza y se manipula los datos.

## Diagrama de datos
[![Captura-de-Pantalla-2022-04-20-a-la-s-10-56-24-p-m.png](https://i.postimg.cc/9QDYq1L3/Captura-de-Pantalla-2022-04-20-a-la-s-10-56-24-p-m.png)](https://postimg.cc/QFrT2gLS)

# RECOMENDACIONES 
1. ***Tratar de manejar mejores practicas a la hora de programar, como por ejemplo (manejo de clases, sintaxis, etc)***
2. ***ellos estan manejando jdbc y seria recomendable que fueran tomado jpa ya que es mas agil***

# CAMBIOS REALIZADOS
1. ***El requisito de buscar veterinaria por nombre no se esncontraba disponible solo estaba el front, se decidio añadir la funcionalidad desde el backend***

[![Whats-App-Image-2022-04-20-at-10-59-05-PM.jpg](https://i.postimg.cc/KY6by9Hm/Whats-App-Image-2022-04-20-at-10-59-05-PM.jpg)](https://postimg.cc/kVvzQyCH)
[![Whats-App-Image-2022-04-20-at-11-04-40-PM.jpg](https://i.postimg.cc/rpWb5qfL/Whats-App-Image-2022-04-20-at-11-04-40-PM.jpg)](https://postimg.cc/Z9bVSzkf)



