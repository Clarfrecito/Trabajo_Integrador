package sistemagestionbiblioteca;//Esto es un paquete en el cual esta todo nuestro proyecto, lo usamos para que las clases puedan comunicarse

import java.util.Scanner;//Se importa la clase Scanner

public class Estudiante extends Usuario implements Prestamo {//Se crea una clase publica llamada Estudiante que hereda de Usuario e implementa la interfaz Prestamo

    public Estudiante(String nombre, int edad) {//Se crea un constructor publico que recibe un String nombre, un entero edad y un entero idEstudiante

        super(nombre, edad);//Se manda a llamar al constructor de la clase madre con los parametros nombre y edad

    }//Fin del constructor

    @Override//Se sobreescribe el metodo prestarMaterial de la interfaz Prestamo

    public void consultarMaterial(Libro[] libros, Revista[] revistas, Tesis[] tesis, int idmaterial) {//Se crea un metodo publico llamado consultarMaterial que recibe un arreglo de libros, revistas y tesis

        if (idmaterial == 1) {//Si idmaterial es igual a 1

            System.out.println("Libros: ");//Se imprime en consola un mensaje

            for (int i = 0; i < libros.length; i++) {//Ciclo que se repite la cantidad de veces que tiene el arreglo libros

                System.out.println((i + 1) + ". " + libros[i].obtenerInformacion());//Se imprime en consola el valor de i + 1 y el valor del arreglo en la posicion i

            }//Fin del ciclo

        }//Fin del if

        if (idmaterial == 2) {//Si idmaterial es igual a 2

            System.out.println("Revistas: ");//Se imprime en consola un mensaje

            for (int i = 0; i < revistas.length; i++) {//Ciclo que se repite la cantidad de veces que tiene el arreglo revistas

                System.out.println((i + 1) + ". " + revistas[i].obtenerInformacion());//Se imprime en consola el valor de i + 1 y el valor del arreglo en la posicion i

            }//Fin del ciclo

        }//Fin del if

        if (idmaterial == 3) {//Si idmaterial es igual a 3

            System.out.println("Tesis: ");//Se imprime en consola un mensaje

            for (int i = 0; i < tesis.length; i++) {//Ciclo que se repite la cantidad de veces que tiene el arreglo tesis

                System.out.println((i + 1) + ". " + tesis[i].obtenerInformacion());//Se imprime en consola el valor de i + 1 y el valor del arreglo en la posicion i

            }//Fin del ciclo

        }//Fin del if

    }//Fin del metodo

    @Override//Se sobreescribe el metodo prestarMaterial de la interfaz Prestamo

    public void prestarMaterial(Libro[] libros, Revista[] revistas, Tesis[] tesis) {//Se crea un metodo publico llamado prestarMaterial que recibe un arreglo de libros, revistas y tesis

        Scanner scan = new Scanner(System.in);//Se crea un objeto de la clase Scanner llamado scan

        int idmaterial;//Se crea una variable de tipo entero llamada idmaterial

        System.out.println("Que tipo de material quieres sacar, ingresa el numero correcto: 1-Libro");//Se imprime en consola un mensaje

        System.out.println("                                                                2-Revista");//Se imprime en consola un mensaje

        System.out.println("                                                                3-Tesis");//Se imprime en consola un mensaje

        idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor ingresado por el usuario

        while (idmaterial != 1 && idmaterial != 2 && idmaterial != 3) {//Mientras idmaterial sea diferente de 1 y 2 y 3

            System.out.println("La opcion no es valida volvela a ingresar");//Se imprime en consola un mensaje

            idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor ingresado por el usuario

        }//Fin del ciclo

        if (idmaterial == 1) {//Si idmaterial es igual a 1

            boolean hayDisponibles = false;//Se crea una variable de tipo boolean llamada hayDisponibles y se inicializa en false

            System.out.println("Libros para llevarse: ");//Se imprime en consola un mensaje

            for (int i = 0; i < libros.length; i++) {//Ciclo que se repite la cantidad de veces que tiene el arreglo libros

                if (libros[i].isDisponible()) {//Si el libro en la posicion i esta disponible

                    System.out.println((i + 1) + ". " + libros[i].obtenerInformacion());//Se imprime en consola el valor de i + 1 y el valor del arreglo en la posicion i

                    hayDisponibles = true;//Se cambia el valor de la variable hayDisponibles a true

                }//Fin del if

            }//Fin del ciclo

            if (!hayDisponibles) {//Si no hayDisponibles es falso

                System.out.println("No hay libros disponibles para llevarse.");//Se imprime en consola un mensaje

                return;//Se termina el metodo

            }//Fin del if

            System.out.println("Selecciona el número del libro que deseas:");//Se imprime en consola un mensaje

            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor ingresado por el usuario

            if (seleccion > 0 && seleccion <= libros.length && libros[seleccion - 1].isDisponible()) {//Si seleccion es mayor a 0 y seleccion es menor o igual a la longitud del arreglo libros y el libro en la posicion seleccion - 1 esta disponible

                libros[seleccion - 1].setDisponible(false);//Se cambia el valor de disponible del libro en la posicion seleccion - 1 a false

                System.out.println("Has seleccionado: " + libros[seleccion - 1].obtenerInformacion());//Se imprime en consola un mensaje

            } else {//Si no se cumple la condicion anterior

                System.out.println("Selección inválida.");//Se imprime en consola un mensaje

            }//Fin del if

        } else if (idmaterial == 2) {//Si idmaterial es igual a 2

            boolean hayDisponibles = false;//Se crea una variable de tipo boolean llamada hayDisponibles y se inicializa en false

            System.out.println("Revistas para llevarse:");//Se imprime en consola un mensaje

            for (int i = 0; i < revistas.length; i++) {//Ciclo que se repite la cantidad de veces que tiene el arreglo revistas

                if (revistas[i].isDisponible()) {//Si la revista en la posicion i esta disponible

                    System.out.println((i + 1) + ". " + revistas[i].obtenerInformacion());//Se imprime en consola el valor de i + 1 y el valor del arreglo en la posicion i
                
                    hayDisponibles = true;//Se cambia el valor de la variable hayDisponibles a true
                
                }//Fin del if
            
            }//Fin del ciclo

            if (!hayDisponibles) {//Si no hayDisponibles es falso
            
                System.out.println("No hay revistas disponibles para llevarse.");//Se imprime en consola un mensaje
            
                return;//Se termina
            
            }//Fin del if
            
            System.out.println("Selecciona el número de la revista que deseas:");//Se imprime en consola un mensaje
            
            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor ingresado por el usuario
            
            if (seleccion > 0 && seleccion <= revistas.length && revistas[seleccion - 1].isDisponible()) {//Si seleccion es mayor a 0 y seleccion es menor o igual a la longitud del arreglo revistas y la revista en la posicion seleccion - 1 esta disponible
            
                revistas[seleccion - 1].setDisponible(false);//Se cambia el valor de disponible de la revista en la posicion seleccion - 1 a false
            
                System.out.println("Has seleccionado: " + revistas[seleccion - 1].obtenerInformacion());//Se imprime en consola un mensaje
            
            } else {//Si no se cumple la condicion anterior
            
                System.out.println("Selección inválida.");//Se imprime en consola un mensaje
            
            }//Fin del if
        
        } else if (idmaterial == 3) {//Si idmaterial es igual a 3
        
            boolean hayDisponibles = false;//Se crea una variable de tipo boolean llamada hayDisponibles y se inicializa en false
        
            System.out.println("Tesis para llevarse:");//Se imprime en consola un mensaje
        
            for (int i = 0; i < tesis.length; i++) {//Ciclo que se repite la cantidad de veces que tiene el arreglo tesis
        
                if (tesis[i].isDisponible()) {//Si la tesis en la posicion i esta disponible
        
                    System.out.println((i + 1) + ". " + tesis[i].obtenerInformacion());//Se imprime en consola el valor de i + 1 y el valor del arreglo en la posicion i
        
                    hayDisponibles = true;//Se cambia el valor de la variable hayDisponibles a true
                
                }//Fin del if
            
            }//Fin del ciclo
            
            if (!hayDisponibles) {//Si no hayDisponibles es falso
            
                System.out.println("No hay tesis disponibles para llevarse.");//Se imprime en consola un mensaje
            
                return;//Se termina
            
            }//Fin del if
            
            System.out.println("Selecciona el número de la tesis que deseas:");//Se imprime en consola un mensaje
            
            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor ingresado por el usuario
            
            if (seleccion > 0 && seleccion <= tesis.length && tesis[seleccion - 1].isDisponible()) {//Si seleccion es mayor a 0 y seleccion es menor o igual a la longitud del arreglo tesis y la tesis en la posicion seleccion - 1 esta disponible
            
                tesis[seleccion - 1].setDisponible(false);//Se cambia el valor de disponible de la tesis en la posicion seleccion - 1 a false
            
                System.out.println("Has seleccionado: " + tesis[seleccion - 1].obtenerInformacion());//Se imprime en consola un mensaje
            
            } else {//Si no se cumple la condicion anterior
            
                System.out.println("Selección inválida.");//Se imprime en consola un mensaje
            
            }//Fin del if
        
        }//Fin del if
    
    }//Fin del metodo

    @Override//Se sobreescribe el metodo devolverMaterial de la interfaz Prestamo
    
    public void devolverMaterial(Libro[] libros, Revista[] revistas, Tesis[] tesis) {//Se crea un metodo publico llamado devolverMaterial que recibe un arreglo de libros, revistas y tesis
    
        Scanner scan = new Scanner(System.in);//Se crea un objeto de la clase Scanner llamado scan
    
        int idmaterial;//Se crea una variable de tipo entero llamada idmaterial
    
        System.out.println("Que tipo de material quieres devolver, ingresa el numero correcto: 1-Libro");//Se imprime en consola un mensaje
    
        System.out.println("                                                                   2-Revista");//Se imprime en consola un mensaje
    
        System.out.println("                                                                   3-Tesis");//Se imprime en consola un mensaje
    
        idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor ingresado por el usuario
    
        while (idmaterial != 1 && idmaterial != 2 && idmaterial != 3) {//Mientras idmaterial sea diferente de 1 y 2 y 3
    
            System.out.println("La opcion no es valida volvela a ingresar");//Se imprime en consola un mensaje
    
            idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor ingresado por el usuario
    
        }//Fin del ciclo

        if (idmaterial == 1) {//Si idmaterial es igual a 1
    
            boolean hayNoDisponibles = false;//Se crea una variable de tipo boolean llamada hayNoDisponibles y se inicializa en false
    
            System.out.println("Libros para devolver: ");//Se imprime en consola un mensaje
    
            for (int i = 0; i < libros.length; i++) {//Ciclo que se repite la cantidad de veces que tiene el arreglo libros
    
                if (libros[i].isNotDisponible()) {//Si el libro en la posicion i no esta disponible
    
                    System.out.println((i + 1) + ". " + libros[i].obtenerInformacion());//Se imprime en consola el valor de i + 1 y el valor del arreglo en la posicion i
    
                    hayNoDisponibles = true;//Se cambia el valor de la variable hayNoDisponibles a true
                
                }//Fin del if
    
            }//Fin del ciclo
    
            if (!hayNoDisponibles) {//Si no hayNoDisponibles es falso
    
                System.out.println("No hay libros para devolver.");//Se imprime en consola un mensaje
    
                return;//Se termina
    
            }//Fin del if
    
            System.out.println("Selecciona el número del libro que deseas devolver:");//Se imprime en consola un mensaje
    
            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor ingresado por el usuario
    
            if (seleccion > 0 && seleccion <= libros.length && libros[seleccion - 1].isNotDisponible()) {//Si seleccion es mayor a 0 y seleccion es menor o igual a la longitud del arreglo libros y el libro en la posicion seleccion - 1 no esta disponible
    
                libros[seleccion - 1].setDisponible(true);//Se cambia el valor de disponible del libro en la posicion seleccion - 1 a true
    
                System.out.println("Has devuelto: " + libros[seleccion - 1].obtenerInformacion());//Se imprime en consola un mensaje
    
            } else {//Si no se cumple la condicion anterior
    
                System.out.println("Selección inválida.");//Se imprime en consola un mensaje
    
            }//Fin del if
    
        } else if (idmaterial == 2) {//Si idmaterial es igual a 2
    
            boolean hayNoDisponibles = false;//Se crea una variable de tipo boolean llamada hayNoDisponibles y se inicializa en false
    
            System.out.println("Revistas para devolver:");//Se imprime en consola un mensaje
    
            for (int i = 0; i < revistas.length; i++) {//Ciclo que se repite la cantidad de veces que tiene el arreglo revistas
    
                if (revistas[i].isNotDisponible()) {//Si la revista en la posicion i no esta disponible
    
                    System.out.println((i + 1) + ". " + revistas[i].obtenerInformacion());//Se imprime en consola el valor de i + 1 y el valor del arreglo en la posicion i
    
                    hayNoDisponibles = true;//Se cambia el valor de la variable hayNoDisponibles a true
    
                }//Fin del if
    
            }//Fin del ciclo
    
            if (!hayNoDisponibles) {//Si no hayNoDisponibles es falso
    
                System.out.println("No hay revistas para devolver.");//Se imprime en consola un mensaje
    
                return;//Se termina
    
            }//Fin del if
    
            System.out.println("Selecciona el número de la revista que deseas devolver:");//Se imprime en consola un mensaje
    
            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor ingresado por el usuario
    
            if (seleccion > 0 && seleccion <= revistas.length && revistas[seleccion - 1].isNotDisponible()) {//Si seleccion es mayor a 0 y seleccion es menor o igual a la longitud del arreglo revistas y la revista en la posicion seleccion - 1 no esta disponible
    
                revistas[seleccion - 1].setDisponible(true);//Se cambia el valor de disponible de la revista en la posicion seleccion - 1 a true
    
                System.out.println("Has devuelto: " + revistas[seleccion - 1].obtenerInformacion());//Se imprime en consola un mensaje
    
            } else {//Si no se cumple la condicion anterior
    
                System.out.println("Selección inválida.");//Se imprime en consola un mensaje
    
            }//Fin del if
    
        } else if (idmaterial == 3) {//Si idmaterial es igual a 3
    
            boolean hayNoDisponibles = false;//Se crea una variable de tipo boolean llamada hayNoDisponibles y se inicializa en false
    
            System.out.println("Tesis para devolver:");//Se imprime en consola un mensaje
    
            for (int i = 0; i < tesis.length; i++) {//Ciclo que se repite la cantidad de veces que tiene el arreglo tesis
    
                if (tesis[i].isNotDisponible()) {//Si la tesis en la posicion i no esta disponible
    
                    System.out.println((i + 1) + ". " + tesis[i].obtenerInformacion());//Se imprime en consola el valor de i + 1 y el valor del arreglo en la posicion i
    
                    hayNoDisponibles = true;//Se cambia el valor de la variable hayNoDisponibles a true
    
                }//Fin del if
    
            }//Fin del ciclo
    
            if (!hayNoDisponibles) {//Si no hayNoDisponibles es falso
    
                System.out.println("No hay tesis para devolver.");//Se imprime en consola un mensaje
    
                return;//Se termina
    
            }//Fin del if
    
            System.out.println("Selecciona el número de la tesis que deseas devolver:");//Se imprime en consola un mensaje
    
            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor ingresado por el usuario
    
            if (seleccion > 0 && seleccion <= tesis.length && tesis[seleccion - 1].isNotDisponible()) {//Si seleccion es mayor a 0 y seleccion es menor o igual a la longitud del arreglo tesis y la tesis en la posicion seleccion - 1 no esta disponible
    
                tesis[seleccion - 1].setDisponible(true);//Se cambia el valor de disponible de la tesis en la posicion seleccion - 1 a true
    
                System.out.println("Has devuelto: " + tesis[seleccion - 1].obtenerInformacion());//Se imprime en consola un mensaje
    
            }else {//Si no se cumple la condicion anterior
    
                System.out.println("Selección inválida.");//Se imprime en consola un mensaje
    
            }//Fin del if
    
        }//Fin del if
    
    }//Fin del metodo

}//Fin de la clase