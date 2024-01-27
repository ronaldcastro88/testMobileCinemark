# test-mobile-Cinemark

## Descripción y contexto

---  
Automatización de pruebas de la aplicación móvil de Cinemark creada con el patrón Screenplay usando el
framework [Serenity BDD](https://serenity-bdd.github.io/docs/guide/user_guide_intro) y usando tecnologías java y
Selenium.
### librerías

---  

Requisito para ejecutar **[JDK 11.0.11](https://www.oracle.com/co/java/technologies/javase-jdk11-downloads.html)**
y  **[gradle 5.2.1](https://gradle.org/install/)** o superior.

Versiones de las librerías con las que es estable la automatización:

+ serenity 2.1.4
+ CucumberVersion 1.9.51
+ hamcrest-core 1.3

## Ejecución de pruebas

---  
Para ejecutar la batería completa de pruebas se puede utilizar el siguiente comando en consola:
``` gradlew test ```

Se ha dispuesto una tarea de gradle para ejecutar diferentes runner haciendo uso del comando:
```   gradlew clean test -Prunner=MiRunner  ```

o también puede ser usado para ejecutar diferentes runners separándolos por coma
```   gradlew clean test -Prunner=PrimerRunner,SegundoRunner  ```

Para especificar el archivo de propiedades a usar según el dispositivo móvil en que se quiera realizar la ejecución se
debe usar:
```   gradlew clean test -Dproperties=ruta/en/tu/proyecto/archivo.properties   ```

Para Generar la evidencia de pruebas:
```  gradlew aggregate  ```

Para eliminar archivos que no corresponden a la ejecución que se está realizando:
```   gradlew clean  ```

Tenemos la tarea personalizada para indicar los runner a ser ejecutados, tener en cuenta que el listado de runner que
indiquemos ejecutar deberá corresponder exactamente con el nombre del runner en el paquete
de [runners](./src/test/java/cinemark/runners) y se separará la lista usando comas así:
```   gradlew test -Prunner="AutenticacionRunner,RegistrarUsuariosRunner"  ```

Para generar información en consola de la ejecución de pruebas y tener una previa del resultado usamos la propiedad
´--info´, así:
```   gradlew test -Prunner="AutenticacionRunner,RegistrarUsuariosRunner"  --info```

#### Ejemplo comando de ejecución:

Para ejecutar un runner específico:
```   gradlew clean test -Prunner="AutenticacionRunner" aggregate --info ```

Para ejecutar toda la batería de pruebas:
```   gradlew clean test  aggregate  ```