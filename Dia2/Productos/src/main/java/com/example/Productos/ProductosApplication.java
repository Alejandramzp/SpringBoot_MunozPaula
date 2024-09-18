package com.example.Productos;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductosApplication implements CommandLineRunner {
    
    private final Servicio servicio;
    
    @Autowired
    public ProductosApplication(Servicio servicio) {
        this.servicio = servicio;
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ProductosApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n---------------------------------");
            System.out.println("'     Gestión de Productos      '");
            System.out.println("'                               '");
            System.out.println("'    1. Añadir Productos        '");
            System.out.println("'    2. Mostar Productos        '");
            System.out.println("'    3. Mostar Productos por ID '");
            System.out.println("'    4. Salir                   '");
            System.out.println("---------------------------------");
            
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            switch (option) {
                case 1:
                    System.out.println("Ingrese el ID del producto: ");
                    Long id = scanner.nextLong();
                    scanner.nextLine();
                    
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    
                    System.out.println("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    
                    Producto newProducto = new Producto(id, nombre, precio);
                    servicio.guardar(newProducto);
                    System.out.println("Producto añadido: " + newProducto);
                    break;
                    
                case 2:
                    System.out.println("\n--------------------------------");
                    System.out.println("       Lista de productos:      ");
                    System.out.println("--------------------------------");
                    servicio.mostrarTodo().forEach(producto -> System.out.println("-> " + producto));
                    break;    
                    
                case 3:
                    System.out.println("Ingrese el ID del producto: ");
                    Long id2 = scanner.nextLong();
                    Producto producto = servicio.mostrarPorId(id2);
                    
                    if (producto != null) {
                        System.out.println("Producto encontrado: " + producto);
                    } else {
                        System.out.println("Producto no encontado.");
                    }   
                    break;  
                
                case 4:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

}
