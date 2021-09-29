# SpringBootPatterns

Los difernetes patrones existentes se pueden dividir en:

## Patrones de diseño de CREACIÓN

### **Factoría abstraca**

Permite la creación de objetos sin especificar el tipo concreto.

### **Builder**

Utilizado para crear objetos complejos.  

Utilizado cuando existen muchos constructores sobrecargados.  
Una opción es crear un único constructor y llamar a los _setters_ necesarios. Otra usar el patrón Builder.

Ejemplo disponible en [Builder](./demo/src/java/com/patterns/demo/builder)

### **Factoría**

Permite crear objetos sin especificar la clase.

### **Prototype**

Crea nuevos objetos de otros existentes usando _clone_.

### **Singleton**

Asegura que se crea únicamente una instance de un objeto.

## Patrones de diseño de ESTRUCTURA

### **Adaptador**

Permite que dos clases imcompatibles trabajen bajo una misma interfaz.

### **Bridge**

Desacopla una abstracción de su implementación, por lo que dos clases pueden ser independientes.

### **Composite**

Permite crear estructuras complejas compuestas de otras más pequeñas creando un único objeto de un grupo de objetos.

### **Decorator**

Añade funcionalidad dinámicamente a un objeto.

### **Proxy**

Añade una interfaz para controlar las restricciones de acceso a un objeto.
