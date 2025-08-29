# Laboratorio-3-DOSW-02

## Integrantes:
- Maria Belen
- Juan Pablo Contreras
- Nikolas Martinez

## Evidencias:
Aquí se irán agregando las evidencias pedidas durante el laboratorio.

# Solucion preguntas

### ¿Cuál es la diferencia principal entre una prueba unitaria y una prueba de integración E2E?
Una `prueba unitaria` valida el funcionamiento de partes mas "Atomicas" (un método, clase o función) de forma aislada, mientras 
que las `pruebas de integracion E2E` valida que todo el flujo completo del sistema funcione correctamente ya sea desde la interfaz de usuario
a por ejemplo la base de datos externos.

### En Scrum ¿Cuál es el propósito de la Sprint Retrospective y por qué es crucial para la mejora continua del equipo?
El proposito de el `Sprint retrospective` es como su nombre lo indica, hacer una retrospectiva de un sprint, para saber que se alcanzo que hizo falta, que se puede
mejorar, y precisamente es importante reconocer como el equipo maneja el flujo de trabajo con el fin de mejorar y que todos los miembros del equipo esten al tanto con el 
progreso de sus companeros en un proyecto.

### Explique la diferencia entre una Épica, una Feature y una historia de Usuario. Proporcione un ejemplo de cada una si tenemos un sistema de streaming de video como lo es Netflix.
Para empezar, la `epica` y una `feature` se diferencian entre su alcance, en el caso de las `epicas`, son grandes iniciativas que abarcan varios sprints mientras que las 
`features` son funcionalidades mas concretas que precisamente componen la epica, ahora por el lado de las `historias de usuario` suelen ser pequenas
y detalladas perspectivas del usuario para implementacion de funcionalidades en la aplicacion.

*Ejemplos*:

- Ofrecer contenido personalizado a cada usuario.
- Implementar sistema de recomendaciones basado en historial de visualización
- Como usuario quiero recibir recomendaciones de películas similares a las que ya vi para descubrir nuevo contenido

### ¿Qué es una cobertura de Código (code coverage) y por qué una cobertura del 100% no garantiza necesariamente que el software esté libre de errores?
Mide el porcentaje de código ejecutado durante las pruebas automatizadas, precisamente por eso es que una cobertura al 100 no
garantiza la ausencia de errores por que precisamente no se pueden cubrir todos los escenarios logicos posibles.

### Describa qué es un Diagrama de Casos de Uso y qué elementos lo componen. ¿Para qué sirve en la fase de análisis de requerimientos?
Es una representación visual de cómo interactúan los actores (usuarios o sistemas externos) con el sistema a través de casos de uso, es util por que 
en un analisis de requerimientos nos ayuda a entender de forma clara que espera el usuario del sistema y delimitar el alcance funcional.Al diagrama de casos
lo componen `Actores`, `casos de uso` y `relaciones`(asociación, inclusión, extensión)

### ¿Cuál es la diferencia entre el uso de JUnit y JaCoCo en un proyecto, y cómo complementa SonarQube este proceso en términos de calidad de software?
`JUnit` es un framework de pruebas unitarias en Java, que permite escribir y ejecutar pruebas para verificar que las clases y métodos funcionen correctamente de manera aislada.

`JaCoCo` es una herramienta que mide la cobertura de código, es decir, qué porcentaje del código fue ejecutado por las pruebas hechas con JUnit (o cualquier otro framework de pruebas).

`SonarQube` complementa este proceso porque realiza un análisis estático de calidad del software: detecta bugs, vulnerabilidades, code smells y muestra métricas, incluyendo la cobertura que reporta JaCoCo.

### ¿Qué ventajas tiene el uso de Planning Poker frente a otros métodos de estimación tradicional y cómo ayuda a mejorar la transparencia y compromiso del equipo?

- Evita la imposición individual: ninguna persona puede imponer su estimación, ya que todos revelan sus cartas al mismo tiempo.

- Fomenta participación y transparencia: todos deben justificar sus estimaciones y se genera discusión saludable.

- Mejora el compromiso del equipo: al llegar a un consenso colectivo, el equipo se siente dueño de la estimación.

### Menciona los valores de Scrum y explica cuál consideras más difícil de aplicar en un equipo.
- `Compromiso`
- `Coraje`
- `Enfoque`
- `Apertura`
- `Respeto`

Consideramos que el mas dificil es el de coraje por que imponerse a alguien dentro de un equipo para argumentar algo 
con lo que no se esta deacuerdo puede sentirse conflictivo, y es algo que se evita muchisimo normalmente.
