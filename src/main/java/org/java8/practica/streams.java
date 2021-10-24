package org.java8.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class streams {
public static void main(String[] args) {
	
Producto product1 = new Producto(1, "Bandeja paisa", 30.0);
Producto product2 = new Producto(2, "Bandeja paisa", 30.0);
Producto product3 = new Producto(3, "Empanadas", 20.0);

	
//List<Producto> producto=Arrays.asList(product1, product2, product3);

// forma vieja de añadir un elemento a una lista
List<Producto> producto= new ArrayList();
producto.add(product1);
producto.add(product2);
producto.add(product3);

//forEach
//producto.forEach(p -> System.out.println(p.getNombre())	);
//producto.forEach(System.out::println);
//producto::getNombre;

// Map
List <String> rt = producto.stream().map(p -> p.getNombre().toUpperCase()).collect(Collectors.toList());
rt.forEach(System.out::println);

// filter
List<Producto>rt2 = producto.stream().filter( p-> p.getPrecio()>25.0).collect(Collectors.toList());
rt2.forEach(System.out::println);

}
	
	
}

