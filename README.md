# Vector Dinámico en Java

Este proyecto es una implementación de un **vector dinámico** en Java que permite agregar, eliminar y gestionar objetos de manera eficiente. El vector ajusta automáticamente su capacidad cuando es necesario, simulando el comportamiento de un `ArrayList`.

## Características

- **Agregar elementos**: Permite agregar elementos al final o en posiciones específicas.
- **Eliminar elementos**: Elimina un elemento en la posición dada.
- **Capacidad dinámica**: Ajuste automático de la capacidad del vector.
- **Consulta de elementos**: Acceso rápido a los elementos por índice.

## Uso

```java
Vector vector = new Vector();
vector.add(new Student("John Doe"));
vector.add(0, new Student("Jane Doe"));

Student student = vector.get(0);
vector.remove(1);
