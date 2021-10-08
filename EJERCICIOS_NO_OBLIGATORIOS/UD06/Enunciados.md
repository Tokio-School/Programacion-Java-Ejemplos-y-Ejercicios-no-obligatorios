**EJERCICIO TALLER**
El propietario de un taller te ha encargado que desarrolles una aplicación para la gestión de su trabajo. Te encuentras en el paso en
que debes diseñar e implementar las clases necesarias para desarrollar dicha aplicación. En el taller arreglan Coches y Motos y
trabajan varios mecánicos. De los coches quieren almacenar el número de bastidor, la matrı́cula, modelo, color, kilometraje y la
capacidad del maletero. De las motos quieren guardar también número de bastidor, matrı́cula, modelo, color y kilometraje, y además
quieren saber si una moto tiene o no carenado y el peso de la misma. En ambos casos, para motos y coches se querrá almacenar si
están o no reparados. Además, de los mecánicos quieren almacenar el nombre, apellidos, email, especialidad (Coche o Moto) y el
número de reparaciones que han hecho desde que trabajan alli. Además, siempre se guardará el vehı́culo en el que está trabajando
cada mecánico. En cuanto a las operaciones de los coches, se esperan las siguientes:
- Una operación que permita añadir kilometros al coche
- Una operación para pintar el coche de otro color
De las motos se necesitarán estas operaciones:
- Una operación para eliminar el carenado de la moto (hay que tener en cuenta que el peso disminuirá en 2 kg)
- Una operación para pintar la moto de otro color
Para el caso de los mecánicos, las operaciones serán las siguientes:
- Una operación que permita reparar cualquier vehı́culo, que marcará el vehı́culo como reparado
- Una operación que permita marcar que un vehı́culo entra al taller, marcándolo como sin reparar, para que quede constancia que hay que trabajar en
él
-De alguna forma tendremos que poder asignar un vehı́culo al mecánico, de forma que cuando éste lo repare deje de estarlo
Implementar las clases necesarias con sus atributos, los constructores, getters y setters, y las operaciones indicadas.


**EJERCICIO CIVILIZATION**
Se quieren diseñar ahora las clases para un videojuego de estrategia al estilo Civilization. En él los usuarios podrán crear sus propios
personajes y construir una ciudad que irá evolucionando para ganar a las de los demás jugadores. De cada jugador se quiere
almacenar su nick, nombre, apellidos, email y tiempo de juego (en segundos). De cada personaje se quiere almacenar su nombre, la
época a la que pertenece, el nivel y el dinero conseguido hasta el momento. Tener en cuenta que cada usuario puede tener un personaje y debe quedar registrado cuál es.
Como cada personaje puede crear una ciudad (y debe quedar asi registrado) se guardará, de cada una, el nombre, el nivel, número de habitantes y el tipo de
ciudad (aldea, pueblo o ciudad). Se espera que los jugadores puedan realizar las siguientes operaciones:
- Una operación para añadir tiempo de juego (Se ejecutará cada vez que termine una partida para incrementar el tiempo empleado)
De los personaje se espera que puedan realizar las siguientes operacones:
- Una operación que permita crear una ciudad indicando el nombre de ésta. El nivel y número de habitantes inicial será 0, y el tipo de ciudad será
aldea. La ciudad deberá de quedar vinculada al personaje.
Para las ciudades se necesitarán las siguientes operaciones:
- Una operación que permita incrementar el nivel de la ciudad. En esta operación habrá que tener en cuenta que cuando el nivel supere el valor 10 la
ciudad pasará a tipo pueblo y cuando supere el valor 20 pasará a tipo ciudad.
Para todos los casos, implementar las clases, atributos, constructores necesarios y las operaciones solicitadas


**EJERCICIO ITUNES**
Ahora te piden diseñar el sistema de clases para una biblioteca. Sólo se necesita almacenar la información relativa a Socios, Libros y
CDs de música.
- Puede haber varios tipos de libros (novelas y tebeos) o cds. De todos ellos se quiere almacenar el isbn, titulo, autor y el año de edición. Es posible
que en el momento de dar de alta cualquier elemento no se disponga de la información del autor (habrá que tenerlo en cuenta).
- De las novelas además se guardará un resumen del argumento de unas 100 palabras y, en ocasiones, el número de páginas
- De los cds de música se querrá almacenar también el número de canciones y la discográfica que lo comercializó.
- De los tebeos se quiere guardar un resumen y el personaje principal.
- De los socios guardaremos el número de socio, nombre, apellidos y un email. No siempre se podrá disponer del email por lo que será un dato
opcional. Además se quiere guardar en todo momento que libro ha pedido prestado cada usuario, teniendo en cuenta que sólo puede coger un libro
al mismo tiempo.
- Hay que tener en cuenta que también existe un tipo especial de socio (VIP) que podrá alquilar libros durante más tiempo previo pago con tarjeta de
crédito, por lo que guardaremos el número de la misma.
Se te piden realizar lo siguiente:
- Implementar las clases necesarias para la aplicación
- Implementar los constructores que permitan trabajar con las clases de la forma que se indica
- Implementar operaciones para que los socios puedan alquilar y devolver. Habrá que controlar que no puedan alquilar nada si todavı́a no han
devuelto lo que tenı́an alquilado. También hay que tener en cuenta que sólo permitimos el alquiler de cds de música si el socio ha facilitado su
dirección de correo electrónico


**EJERCICIO TOKIO CALENDAR**
Diseña las clases de una aplicación que sirva como calendario, donde los diferentes usuarios de la misma puedan gestionar su
tiempo utilizándola. La idea es que la aplicación tenga su propio sistemas de usuarios, de los que se almacenará el nombre de
usuario, la contraseña, su email, su teléfono móvil, su dirección y el tipo de usuario (que podrá ser administrador, usuario o invitado).
- La idea principal de la aplicación es poder anotar tareas o eventos pendientes para que queden registrados y poder ser consultados
posteriormente. Además, la aplicación avisará (si asi lo indica el usuario) cuando se acerque, por ejemplo, la fecha de un evento determinado.
- Se distingue entre tareas y eventos:
- Una tarea es algo que un usuario tiene que hacer. No tiene fecha asignada, simplemente un nombre y una descripción
- Un evento es algo que ocurrirá en una fecha determinada. Para cada uno almacenaremos el nombre, la descripción y el lugar. Se
podrá configurar para que la aplicación avise al usuario de diferentes formas (por pantalla, mediante SMS o mediante correo
electrónico) y con la antelación que el usuario indique.
- Además, los usuarios podrá tener registrados a sus contactos (con nombre, apellidos, email y teléfono) que podrán o no ser usuarios de la
aplicación, de forma que podrán compartir con ellos tareas y/o eventos. Asi, resultará interesante saber qué contactos hay vinculados a un
determinado evento y/o tarea porque también serán notificados cuando lo sea el usuario


**EJERCICIO TOKIO CALENDAR AMPLIADO**
Sobre el ejercicio Tokio Calendar descrito anteriormente, se pide:
Implementar también una pequeña aplicación por consola para probar, en la medida de lo posible, el funcionamiento de la aplicación
diseñada en el primer punto:
- Puedes, por ejemplo, simular el inicio de la aplicación (login usuario/contraseña)
- Añadir tareas / eventos
- Consultar tareas / eventos
- Modificar tareas / eventos
- Eliminar tareas / eventos
