# 10 · Colecciones y genéricos

1. Set es una colección que no puede contener valores duplicados.

2. Un ArrayList es una lista de objetos que permite elementos duplicados y mantiene el orden de insercción. No almacena tipos primitivos directamente, Java aplica autoboxing en ellos.

3. Tanto Array como ArrayList permiten valores duplicados, pero un array de tipos primitivos no pueden almacenar nulos.

4. Dictionary es una clase abstracta antigua. Fue reemplazada completamente por la interfaz Map.

5. Si dos objetos son iguales según el método equals(), ambos deben producir el mismo código hash numérico al invocar el método hashCode().