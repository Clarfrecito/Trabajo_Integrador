package sistemagestionbiblioteca;//Esto es un paquete en el cual esta todo nuestro proyecto, lo usamos para que las clases puedan comunicarse

import java.util.Scanner;//Se importa la clase Scanner

public class Profesor extends Usuario implements Prestamo{//Se crea una clase publica llamada Profesor que hereda de Usuario e implementa la interfaz Prestamo

    public Profesor(String nombre, int edad) {//Se crea un constructor publico que recibe un String nombre, un entero edad y un entero idProfesor
    
        super(nombre, edad);//Se manda a llamar al constructor de la clase madre con los parametros nombre y edad

    }//Fin del constructor

    @Override//Indica que el metodo se sobreescribe de la interfaz
    
    public void consultarMaterial(Libro[] libros, Revista[] revistas, Tesis[] tesis, int idmaterial) {//Se crea un metodo publico llamado consultarMaterial que recibe un arreglo de Libros, un arreglo de Revistas y un arreglo de Tesis
    
        if (idmaterial == 1) {//Si idmaterial es igual a 1 se ejecutara el siguiente bloque de codigo
    
            System.out.println("Libros :");//Se imprime un mensaje
    
            for (int i = 0; i < libros.length; i++) {//Ciclo for que se ejecutara mientras i sea menor al tamaño del arreglo libros
    
                System.out.println((i + 1) + ". " + libros[i].obtenerInformacion());//Se imprime el numero de libro y la informacion del libro
    
            }//Fin del ciclo
    
        }//Fin del if
    
        if (idmaterial == 2) {//Si idmaterial es igual a 2 se ejecutara el siguiente bloque de codigo
    
            System.out.println("Revistas :");//Se imprime un mensaje
    
            for (int i = 0; i < revistas.length; i++) {//Ciclo for que se ejecutara mientras i sea menor al tamaño del arreglo revistas
    
                System.out.println((i + 1) + ". " + revistas[i].obtenerInformacion());//Se imprime el numero de revista y la informacion de la revista
    
            }//Fin del ciclo
    
        }//Fin del if

        if (idmaterial == 3) {//Si idmaterial es igual a 3 se ejecutara el siguiente bloque de codigo

            System.out.println("Tesis :");//Se imprime un mensaje

            for (int i = 0; i < tesis.length; i++) {//Ciclo for que se ejecutara mientras i sea menor al tamaño del arreglo tesis

                System.out.println((i + 1) + ". " + tesis[i].obtenerInformacion());//Se imprime el numero de tesis y la informacion de la tesis

            }//Fin del ciclo

        }//Fin del if

    }//Fin del metodo

    @Override//Indica que el metodo se sobreescribe de la interfaz

    public void prestarMaterial(Libro[] libros, Revista[] revistas, Tesis[] tesis) {//Se crea un metodo publico llamado prestarMaterial que recibe un arreglo de Libros, un arreglo de Revistas y un arreglo de Tesis

        Scanner scan = new Scanner(System.in);//Se crea un objeto de la clase Scanner llamado scan

        int idmaterial;//Se crea una variable de tipo entero llamada idmaterial

        System.out.println("Que tipo de material quieres sacar, ingresa el numero correcto: 1-Libro");//Se imprime un mensaje

        System.out.println("                                                                2-Revista");//Se imprime un mensaje

        System.out.println("                                                                3-Tesis");//Se imprime un mensaje

        idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor que se ingrese por teclado

        while (idmaterial != 1 && idmaterial != 2 && idmaterial != 3) {//Mientras idmaterial sea diferente de 1 y 2 y 3 se ejecutara el ciclo

            System.out.println("La opcion no es valida volvela a ingresar");//Se imprime un mensaje

            idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor que se ingrese por teclado

        }//Fin del ciclo

        if (idmaterial == 1) {//Si idmaterial es igual a 1 se ejecutara el siguiente bloque de codigo

            boolean hayDisponibles = false;//Se crea una variable de tipo booleano llamada hayDisponibles y se inicializa en false

            System.out.println("Libros para llevarse:");//Se imprime un mensaje

            for (int i = 0; i < libros.length; i++) {//Ciclo for que se ejecutara mientras i sea menor al tamaño del arreglo libros

                if (libros[i].isDisponible()) {//Si el libro en la posicion i esta disponible se ejecutara el siguiente bloque de codigo

                    System.out.println((i + 1) + ". " + libros[i].obtenerInformacion());//Se imprime el numero de libro y la informacion del libro

                    hayDisponibles = true;//Se cambia el valor de la variable hayDisponibles a true

                }//Fin del if

            }//Fin del ciclo

            if (!hayDisponibles) {//Si no hay disponibles se ejecutara el siguiente bloque de codigo

                System.out.println("No hay libros disponibles para llevarse.");//Se imprime un mensaje

                return;//Se termina el metodo

            }//Fin del if

            System.out.println("Selecciona el número del libro que deseas:");//Se imprime un mensaje

            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor que se ingrese por teclado

            if (seleccion > 0 && seleccion <= libros.length && libros[seleccion - 1].isDisponible()) {//Si la seleccion es mayor a 0 y menor o igual al tamaño del arreglo libros y el libro en la posicion seleccion - 1 esta disponible se ejecutara el siguiente bloque de codigo

                libros[seleccion - 1].setDisponible(false);//Se cambia el valor del libro en la posicion seleccion - 1 a no disponible

                System.out.println("Has seleccionado: " + libros[seleccion - 1].obtenerInformacion());//Se imprime un mensaje con la informacion del libro seleccionado

            } else {//Si no se cumple la condicion anterior se ejecutara el siguiente bloque de codigo

                System.out.println("Selección inválida.");//Se imprime un mensaje

            }//Fin del if

        } else if (idmaterial == 2) {//Si idmaterial es igual a 2 se ejecutara el siguiente bloque de codigo

            boolean hayDisponibles = false;//Se crea una variable de tipo booleano llamada hayDisponibles y se inicializa en false

            System.out.println("Revistas para llevarse:");//Se imprime un mensaje

            for (int i = 0; i < revistas.length; i++) {//Ciclo for que se ejecutara mientras i sea menor al tamaño del arreglo revistas

                if (revistas[i].isDisponible()) {//Si la revista en la posicion i esta disponible se ejecutara el siguiente bloque de codigo

                    System.out.println((i + 1) + ". " + revistas[i].obtenerInformacion());//Se imprime el numero de revista y la informacion de la revista

                    hayDisponibles = true;//Se cambia el valor de la variable hayDisponibles a true

                }//Fin del if

            }//Fin del ciclo

            if (!hayDisponibles) {//Si no hay disponibles se ejecutara el siguiente bloque de codigo

                System.out.println("No hay revistas disponibles para llevarse.");//Se imprime un mensaje

                return;//Se termina el metodo

            }//Fin del if

            System.out.println("Selecciona el número de la revista que deseas:");//Se imprime un mensaje

            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor que se ingrese por teclado

            if (seleccion > 0 && seleccion <= revistas.length && revistas[seleccion - 1].isDisponible()) {//Si la seleccion es mayor a 0 y menor o igual al tamaño del arreglo revistas y la revista en la posicion seleccion - 1 esta disponible se ejecutara el siguiente bloque de codigo

                revistas[seleccion - 1].setDisponible(false);//Se cambia el valor de la revista en la posicion seleccion - 1 a no disponible

                System.out.println("Has seleccionado: " + revistas[seleccion - 1].obtenerInformacion());//Se imprime un mensaje con la informacion de la revista seleccionada

            } else {//Si no se cumple la condicion anterior se ejecutara el siguiente bloque de codigo

                System.out.println("Selección inválida.");//Se imprime un mensaje

            }//Fin del if

        } else if (idmaterial == 3) {// Si idmaterial es igual a 3 se ejecutara el siguiente bloque de codigo

            boolean hayDisponibles = false;//Se crea una variable de tipo booleano llamada hayDisponibles y se inicializa en false

            System.out.println("Tesis para llevarse:");//Se imprime un mensaje

            for (int i = 0; i < tesis.length; i++) {//Ciclo for que se ejecutara mientras i sea menor al tamaño del arreglo tesis

                if (tesis[i].isDisponible()) {//Si la tesis en la posicion i esta disponible se ejecutara el siguiente bloque de codigo

                    System.out.println((i + 1) + ". " + tesis[i].obtenerInformacion());//Se imprime el numero de tesis y la informacion de la tesis

                    hayDisponibles = true;//Se cambia el valor de la variable hayDisponibles a true

                }//Fin del if

            }//Fin del ciclo

            if (!hayDisponibles) {//Si no hay disponibles se ejecutara el siguiente bloque de codigo

                System.out.println("No hay tesis disponibles para llevarse.");//Se imprime un mensaje

                return;//Se termina el metodo

            }//Fin del if

            System.out.println("Selecciona el número de la tesis que deseas:");//Se imprime un mensaje

            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor que se ingrese por teclado

            if (seleccion > 0 && seleccion <= tesis.length && tesis[seleccion - 1].isDisponible()) {//Si la seleccion es mayor a 0 y menor o igual al tamaño del arreglo tesis y la tesis en la posicion seleccion - 1 esta disponible se ejecutara el siguiente bloque de codigo

                tesis[seleccion - 1].setDisponible(false);//Se cambia el valor de la tesis en la posicion seleccion - 1 a no disponible

                System.out.println("Has seleccionado: " + tesis[seleccion - 1].obtenerInformacion());//Se imprime un mensaje con la informacion de la tesis seleccionada

            } else {//Si no se cumple la condicion anterior se ejecutara el siguiente bloque de codigo

                System.out.println("Selección inválida.");//Se imprime un mensaje

            }//Fin del if

        }//Fin del if

    }//Fin del metodo

    @Override//Indica que el metodo se sobreescribe de la interfaz

    public void devolverMaterial(Libro[] libros, Revista[] revistas, Tesis[] tesis) {//Se crea un metodo publico llamado devolverMaterial que recibe un arreglo de Libros, un arreglo de Revistas y un arreglo de Tesis

        Scanner scan = new Scanner(System.in);//Se crea un objeto de la clase Scanner llamado scan

        int idmaterial;//Se crea una variable de tipo entero llamada idmaterial

        System.out.println("Que tipo de material quieres devolver, ingresa el numero correcto: 1-Libro");//Se imprime un mensaje

        System.out.println("                                                                   2-Revista");//Se imprime un mensaje

        System.out.println("                                                                   3-Tesis");//Se imprime un mensaje

        idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor que se ingrese por teclado
        
        while (idmaterial != 1 && idmaterial != 2 && idmaterial != 3) {//Mientras idmaterial sea diferente de 1 y 2 y 3 se ejecutara el ciclo
        
            System.out.println("La opcion no es valida volvela a ingresar");//Se imprime un mensaje
        
            idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor que se ingrese por teclado
        
        }//Fin del ciclo

        if (idmaterial == 1) {//Si idmaterial es igual a 1 se ejecutara el siguiente bloque de codigo
        
            boolean hayNoDisponibles = false;//Se crea una variable de tipo booleano llamada hayNoDisponibles y se inicializa en false
        
            System.out.println("Libros para devolver:");//Se imprime un mensaje
        
            for (int i = 0; i < libros.length; i++) {//Ciclo for que se ejecutara mientras i sea menor al tamaño del arreglo libros
        
                if (libros[i].isNotDisponible()) {//Si el libro en la posicion i no esta disponible se ejecutara el siguiente bloque de codigo
        
                    System.out.println((i + 1) + ". " + libros[i].obtenerInformacion());//Se imprime el numero de libro y la informacion del libro
        
                    hayNoDisponibles = true;//Se cambia el valor de la variable hayNoDisponibles a true
        
                }//Fin del if
        
            }//Fin del ciclo
        
            if (!hayNoDisponibles) {//Si no hay no disponibles se ejecutara el siguiente bloque de codigo
        
                System.out.println("No hay libros para devolver.");//Se imprime un mensaje
        
                return;//Se termina el metodo
        
            }//Fin del if
        
            System.out.println("Selecciona el número del libro que deseas devolver:");//Se imprime un mensaje
        
            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor que se ingrese por teclado
        
            if (seleccion > 0 && seleccion <= libros.length && libros[seleccion - 1].isNotDisponible()) {//Si la seleccion es mayor a 0 y menor o igual al tamaño del arreglo libros y el libro en la posicion seleccion - 1 no esta disponible se ejecutara el siguiente bloque de codigo
        
                libros[seleccion - 1].setDisponible(true);//Se cambia el valor del libro en la posicion seleccion - 1 a disponible
        
                System.out.println("Has devuelto: " + libros[seleccion - 1].obtenerInformacion());//Se imprime un mensaje con la informacion del libro devuelto
        
            } else {//Si no se cumple la condicion anterior se ejecutara el siguiente bloque de codigo
        
                System.out.println("Selección inválida.");//Se imprime un mensaje
        
            }//Fin del if
        
        } else if (idmaterial == 2) {//Si idmaterial es igual a 2 se ejecutara el siguiente bloque de codigo
        
            boolean hayNoDisponibles = false;//Se crea una variable de tipo booleano llamada hayNoDisponibles y se inicializa en false
        
            System.out.println("Revistas para devolver:");//Se imprime un mensaje
        
            for (int i = 0; i < revistas.length; i++) {//Ciclo for que se ejecutara mientras i sea menor al tamaño del arreglo revistas
        
                if (revistas[i].isNotDisponible()) {//Si la revista en la posicion i no esta disponible se ejecutara el siguiente bloque de codigo
        
                    System.out.println((i + 1) + ". " + revistas[i].obtenerInformacion());//Se imprime el numero de revista y la informacion de la revista
        
                    hayNoDisponibles = true;//Se cambia el valor de la variable hayNoDisponibles a true
        
                }//Fin del if
        
            }//Fin del ciclo
        
            if (!hayNoDisponibles) {//Si no hay no disponibles se ejecutara el siguiente bloque de codigo
        
                System.out.println("No hay revistas para devolver.");//Se imprime un mensaje
        
                return;//Se termina
        
            }//Fin del if
        
            System.out.println("Selecciona el número de la revista que deseas devolver:");//Se imprime un mensaje
        
            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor que se ingrese por teclado
        
            if (seleccion > 0 && seleccion <= revistas.length && revistas[seleccion - 1].isNotDisponible()) {//Si la seleccion es mayor a 0 y menor o igual al tamaño del arreglo revistas y la revista en la posicion seleccion - 1 no esta disponible se ejecutara el siguiente bloque de codigo
        
                revistas[seleccion - 1].setDisponible(true);//Se cambia el valor de la revista en la posicion seleccion - 1 a disponible
        
                System.out.println("Has devuelto: " + revistas[seleccion - 1].obtenerInformacion());//Se imprime un mensaje con la informacion de la revista devuelta
        
            } else {//Si no se cumple la condicion anterior se ejecutara el siguiente bloque de codigo
        
                System.out.println("Selección inválida.");//Se imprime un mensaje
        
            }//Fin del if
        
        } else if (idmaterial == 3) {//Si idmaterial es igual a 3 se ejecutara el siguiente bloque de codigo
        
            boolean hayNoDisponibles = false;//Se crea una variable de tipo booleano llamada hayNoDisponibles y se inicializa en false
        
            System.out.println("Tesis para devolver:");//Se imprime un mensaje
        
            for (int i = 0; i < tesis.length; i++) {//Ciclo for que se ejecutara mientras i sea menor al tamaño del arreglo tesis
        
                if (tesis[i].isNotDisponible()) {//Si la tesis en la posicion i no esta disponible se ejecutara el siguiente bloque de codigo
        
                    System.out.println((i + 1) + ". " + tesis[i].obtenerInformacion());//Se imprime el numero de tesis y la informacion de la tesis
        
                    hayNoDisponibles = true;//Se cambia el valor de la variable hayNoDisponibles a true
        
                }//Fin del if
        
            }//Fin del ciclo
        
            if (!hayNoDisponibles) {//Si no hay no disponibles se ejecutara el siguiente bloque de codigo
        
                System.out.println("No hay tesis para devolver.");//Se imprime un mensaje
        
                return;//Se termina
        
            }//Fin del if
        
            System.out.println("Selecciona el número de la tesis que deseas devolver:");//Se imprime un mensaje
        
            int seleccion = scan.nextInt();//Se le asigna a la variable seleccion el valor que se ingrese por teclado
        
            if (seleccion > 0 && seleccion <= tesis.length && tesis[seleccion - 1].isNotDisponible()) {//Si la seleccion es mayor a 0 y menor o igual al tamaño del arreglo tesis y la tesis en la posicion seleccion - 1 no esta disponible se ejecutara el siguiente bloque de codigo
        
                tesis[seleccion - 1].setDisponible(true);//Se cambia el valor de la tesis en la posicion seleccion - 1 a disponible
        
                System.out.println("Has devuelto: " + tesis[seleccion - 1].obtenerInformacion());//Se imprime un mensaje con la informacion de la tesis devuelta
        
            }else {//Si no se cumple la condicion anterior se ejecutara el siguiente bloque de codigo
        
                System.out.println("Selección inválida.");//Se imprime un mensaje
        
            }//Fin del if
        
        }//Fin del if
   
    }//Fin del metodo

}//Fin de la clase