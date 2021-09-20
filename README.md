wappitestJikkosoft
Un proyecto donde se ejemplifica el uso del patrón PageObjec usando serenity  BDD con cucumber y gradle.

Las pruebas de este ejemplo se corren contra la página web https://automation-wappi.vercel.app/.

Por defecto, los tests corren en Chrome, así que es necesario tener instalada la última versión del chrome driver y tenerla agregada como una variable en el path del sistema.

La estructura completa del proyecto es la siguiente:

+ model
    Clases que usan el patrón object builder o relcionadas con el modelo de dominio
+ stepsDefinitions
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interacion ()
    Clases que representan las interacciones directas con la interfaz de usuario
+ user_interface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ features
    Archivp de cucumber con la definición de los casos de prueba de la aplicación Wappi
    
Requerimientos
Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 4.7.

Para correr el proyecto
clean test aggregate es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity/

## Get the code

Git:
    https://github.com/jmbr2004/wappitestJikkosoft
   



## Use Maven

Open a command window and run:

    mvn clean verify

## Use Gradle

Open a command window and run:

    gradlew test 


## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

