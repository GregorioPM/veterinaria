# Aplicativo de escritorio veterinaria

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


