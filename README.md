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

**Generalmente utilizado para:**

### **Proxy**

Añade una interfaz para controlar las restricciones de acceso a un objeto.

**Los beneficios son:**

**Generalmente utilizado para:**

## **Patrones de diseño de COMPORTAMIENTO**

### **Interpreter**

**Los beneficios son:**

**Generalmente utilizado para:**

### **Iterator**

**Los beneficios son:**

**Generalmente utilizado para:**

### **Observer**

**Los beneficios son:**

**Generalmente utilizado para:**

### **Visitor**

**Los beneficios son:**

**Generalmente utilizado para:**
