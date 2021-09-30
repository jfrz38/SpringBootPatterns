# SpringBootPatterns

Los difernetes patrones existentes se pueden dividir en:

## **Patrones de diseño de CREACIÓN**

### **Factoría abstraca**

Permite la creación de objetos sin especificar el tipo concreto.

Se define una interfaz o clase abstracta para crear objetos dependientes relacionados sin especificar la subclase en concreto. Por lo que, la factoría abstracta devuelve una factoría de clases.

En la factoría abstracta, una interfaz es responsable de crear una factoría de objetos relacionados sin especificar sus clases.

**Los beneficios son:**

- Aporta poco acoplamiento entre las familias de componentes.
- Aporta mayor consistencia al construir objetos a través de las aplicaciones.

**Generalmente utilizado para:**  
Al crear una factoría, a veces se pueden querer crear un conjunto de objetos relacionados. Se puede solucionar construyendo otra factoría dentro de la factoría.

Se puede utilizar cuando quieres personalizar la lógica inicial de objetos relacionados.

### **Builder**

Utilizado para crear objetos complejos paso a paso y devolver el objeto completo.  

Utilizado cuando existen muchos constructores sobrecargados.  
Una opción es crear un único constructor y llamar a los _setters_ necesarios. Otra usar el patrón Builder.

**Los beneficios son:**

- Proporciona aislamiento entre la construcción y la representación del objeto.
- Permite construir el objeto en múltiples fases, teniendo así más control sobre la construcción.
- Proporciona flexibilidad para variar la representación interna de un objeto.

**Generalmente utilizado para:**  
Es una buena elección cuando una clase tiene un método o una factoría estática con demasiados parámetros y sea difícil de manejar.

### **Factoría**

Permite crear objetos sin especificar la clase.

Define una interfaz para crear un objeto, pero deja a la subclase decidir qué clase inicializar.

**Los beneficios son:**

- Proporciona bajo acoplamiento entre componentes os clases que se relacionan haciendo use de interfaces.

**Generalmente utilizado para:**  
Normalmente cuando se necesitan muchos constructores con los mismos parámetros pero diferente comportamiento.  
Cuando quieres  reutilizar funcionalidad común con diferentes componentes.

Se utiliza cuando:

1. Un objeto no sabe exáctamente qué subclases tiene que crear.

### **Prototype**

Crea nuevos objetos de otros existentes usando _clone_.

**Los beneficios son:**

- Reduce el tiempo de crear los objetos.
- Añade y elimina objetos en tiempo de ejecución.
- Simplifica y puede optimizar los casos de uso donde múltiples objetos del mismo tipo tengan los mismos datos.

**Generalmente utilizado para:**  
Para eliminar código repetitivo cuando la configuración requerida para un objeto es pesada.

### **Singleton**

Asegura que se crea únicamente una instance de un objeto.

Existen varias maneras de implementar Singleton:

1. Método tradicional.
2. Método sincronizado.
3. Variable estática final.
4. Mediante clase inner.
5. Mediante _enum_.

**Los beneficios son:**

- Proporciona control de acceso a objetos que pueden ser pesados (como conexiones a BDs).
- Ahorra heaps de memoria.
- Es un diseño muy eficiente para entornos multihilo.

**Generalmente utilizado para:**  
Casos en los que quieras inicar un objeto una única vez. Normalmente para las creaciones de BDs.

## **Patrones de diseño de ESTRUCTURA**

### **Adapter**

Permite que dos clases incompatibles trabajen bajo una misma interfaz, conviertiendo la interfaz de una clase en otra interfaz que otra clase espera.

**Los beneficios son:**

- Permite comunicar e interactuar con dos o más objetos incompatibles.
- Permite la reusabilidad de antiguas funcionalidades existentes en el sistema.

**Generalmente utilizado para:**  
Cuando se trabaja con interfaces distintas pero con similar comportamiento.

### **Bridge**

Desacopla una abstracción de su implementación, por lo que dos clases pueden ser independientes.

**Los beneficios son:**

- Permite separar la implementación de la abstracción.
- Proporciona la flexibilidad necesaria para cambiar entre dos tipos de clases sin efectos secundarios.
- Permite esconder los detalles de implementación utilizando abstracción entre ellos.

**Generalmente utilizado para:**  
Cuando se quiere cambiar el siguiente comportamiento:

```bash
        A
     /     \
    Aa      Ab
   / \     /  \
 Aa1 Aa2  Ab1 Ab2
```

Refactorizarlo a:

```bash
     A         N
  /     \     / \
Aa(N) Ab(N)  1   2
```

### **Composite**

Permite crear estructuras complejas compuestas de otras más pequeñas creando un único objeto de un grupo de objetos.

**Los beneficios son:**

- Define jerarquías de clases que contienen objetos primitivos y complejos.
- Hace fácil añadir nuevos tipos de componentes.
- Proporciona flexibilidad.

**Generalmente utilizado para:**  
Útil cuando se necesita tratar selectivamente un grupo de objetos que forman parte de una jerarquía como "iguales" cuando en realidad son distintos.

### **Decorator**

Añade funcionalidad dinámicamente a un objeto.

**Los beneficios son:**

- Permite extender la funcionalidad dinámicamente y estáticamente sin alterar la estructura del objeto existente.
- Se puede añadir una nueva responsabilidad a un objeto dinámicamente.
- Utiliza la composición para la relación de objetos para mantener los principios SOLID.
- Simplifica la codificación al escribir nuevas clases para cada nueva funcionalidad específica en vez de cambiar el código existente.

**Generalmente utilizado para:**  
Extender las funcionalidades de un objeto existente.

### **Proxy**

Añade una interfaz para controlar las restricciones de acceso a un objeto.  

**Los beneficios son:**

- Se oculta el objeto del resto del mundo.
- Puede mejorar el rendimiento porque se crean objetos bajo demanda.

**Generalmente utilizado para:**  
Cuando se tienen acciones con un coste de ejecución elevado y no se quieren realizar las acciones asociadas al objeto.

Por ejemplo, un programa que muestra al usuario las fotos que existen en un directorio. Con el patrón proxy se crea el objeto `Imagen` pero no se cargan de memoria, sino que se carga únicamente la deseada.

```java
// Suponiendo que un usuario selecciona 3 imágenes de una carpeta, se crean
// 3 objetos Image
Image highResolutionImage1 = new ImageProxy("sample/veryHighResPhoto1.jpeg");
Image highResolutionImage2 = new ImageProxy("sample/veryHighResPhoto2.jpeg");
Image highResolutionImage3 = new ImageProxy("sample/veryHighResPhoto3.jpeg");

// Para cargar una única imagen en memoria se carga el objeto a través
// de un proxy y se llama al método del objeto que se desea.
// De esta manera se ha cargado únicamente una única imagen en memoria
// en lugar de las 3.
highResolutionImage1.showImage();
```

### **Facade**

Proporciona una interfaz unificada a un conjunto de interfaces en un subsistema. Facade define una interfaz de alto nivel que hace el subsistema más fácil de utilizar.

Facade no es más que una interfaz de interfaces para simplificar las interacciones entre el cliente y las demás clases.

Facade oculta la complejidad del sistema y proporciona una interfaz al cliente desde la que el propio cliente puede acceder al sistema.

**Los beneficios son:**

- Reduce la complejidad del cliente para interaccionar con los subsistemas.
- Agrupa todos los servicios en interfaces para hacerlos más entendibles.

**Generalmente utilizado para:**  
Cuando una clase contiene múltiples subclases. Normalmente, cuando se realizan múltiples llamadas a distintos métodos con una misma funcionalidad, se pueden guardar todos ellos tras una "fachada". Por ejemplo, si para una acción como "encender coche" y "apagar coche" requiere hacer:

```java
// Encender
deposito.comprobarFuel();
bateria.comprobarBatería();
coche.comprobarContacto();
motor.on();
aireAcondicionado.comprobarEstado();

// Apagar
motor.off();
aireAcondicionado.off();
sistemaElectrico.off();
```

Se puede simplificar con un objeto `Facade` que sea:

```java
facade.encender();
facade.apagar();
```

## **Patrones de diseño de COMPORTAMIENTO**

### **Interpreter**

**Los beneficios son:**

**Generalmente utilizado para:**  

### **Iterator**

Proporciona una forma de acceder a un conjunto de elementos secuencialmente sin exponer la capa de representación.

**Los beneficios son:**

- Facilidad para acceder a los objetos de una colección.
- Proporciona una interfaz uniforme a través de diferentes estructuras en una colección.

**Generalmente utilizado para:**  
Cuando la colección de objetos tiene una estructura de datos compleja pero se quiere ocultar esta complejidad al cliente.

### **Observer**

**Los beneficios son:**

**Generalmente utilizado para:**  

### **Visitor**

**Los beneficios son:**

**Generalmente utilizado para:**  
