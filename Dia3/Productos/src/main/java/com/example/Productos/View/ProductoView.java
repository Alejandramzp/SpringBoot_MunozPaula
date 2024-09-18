
package com.example.Productos.View;

import com.example.Productos.Controller.ProductoController;
import com.example.Productos.Model.Producto;
import java.util.Scanner;
import org.springframework.stereotype.Component;


@Component
public class ProductoView {
    private final ProductoController controller;
    private final Scanner scanner;

    public ProductoView(ProductoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
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
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    Long id = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();

                    controller.agregarProducto(id, nombre, precio);
                    break;

                case 2:
                     System.out.println("\n--------------------------------");
                    System.out.println("       Lista de productos:      ");
                    System.out.println("--------------------------------");
                    controller.mostrarProductos().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Ingrese el ID del producto: ");
                    Long id2 = scanner.nextLong();
                    Producto producto = controller.mostrarProductoPorId(id2);
                    if (producto != null) {
                        System.out.println("Producto encontrado: " + producto);
                    } else {
                        System.out.println("Producto no encontrado.");
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
