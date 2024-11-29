package sistemagestionbiblioteca;//Esto es un paquete en el cual esta todo nuestro proyecto, lo usamos para que las clases puedan comunicarse

import java.util.Scanner;//Se importa la clase Scanner

public class Main {//Se crea una clase publica llamada Main
    public static void main(String[] args) {//Se crea un metodo publico estatico llamado main que recibe un arreglo de cadenas de texto
        
        Scanner scan = new Scanner(System.in);//Se crea un objeto de la clase Scanner
        
        int op = 0, edad = 0;//Se crean tres variables de tipo entero y se inicializan en 0
        
        String nombre;//Se crea una variable de tipo String
        
        Libro[] libros = new Libro[3];//Se crea un arreglo de libros con un tamaño de 3
        
        libros[0] = new Libro("El Principito", "Antoine de Saint-Exupéry", true, 1);//Se inicializa la posicion 0 del arreglo con un nuevo objeto de la clase Libro
        
        libros[1] = new Libro("It", "Stephen King", true, 2);//Se inicializa la posicion 1 del arreglo con un nuevo objeto de la clase Libro
        
        libros[2] = new Libro("El Perro", "Alberto Vazquez Figueroa", true, 3);//Se inicializa la posicion 2 del arreglo con un nuevo objeto de la clase Libro
        
        Revista[] revistas = new Revista[3];//Se crea un arreglo de revistas con un tamaño de 3
        
        revistas[0] = new Revista("Infobae", "Daniel Hadad", true, 1);//Se inicializa la posicion 0 del arreglo con un nuevo objeto de la clase Revista
        
        revistas[1] = new Revista("Playboy", "Hugh Hefner", true, 2);//Se inicializa la posicion 1 del arreglo con un nuevo objeto de la clase Revista
        
        revistas[2] = new Revista("Gente", "Jorge de Luján Gutiérrez", true, 3);//Se inicializa la posicion 2 del arreglo con un nuevo objeto de la clase Revista
        
        Tesis[] tesis = new Tesis[3];//Se crea un arreglo de tesis con un tamaño de 3
        
        tesis[0] = new Tesis("Tesis de la Relatividad", "Albert Einstein", true, 1);//Se inicializa la posicion 0 del arreglo con un nuevo objeto de la clase Tesis
        
        tesis[1] = new Tesis("Tesis de Agujeros de Gusano", "Carlos Soler Vicente", true, 2);//Se inicializa la posicion 1 del arreglo con un nuevo objeto de la clase Tesis
        
        tesis[2] = new Tesis("Tesis de los Universos en Expansión", "Stephen Hawking", true, 3);//Se inicializa la posicion 2 del arreglo con un nuevo objeto de la clase Tesis
        
        while (true) {//Se crea un ciclo while que se ejecutara siempre
            
            System.out.println("¿Sos un profesor o un estudiante? Ingresa 1 para profesor y 2 para estudiante:");//Se imprime un mensaje
            
            try {//Se utiliza un bloque try-catch para manejar una excepcion
            
                op = scan.nextInt();//Se le asigna a la variable op el valor ingresado por el usuario
            
                if (op == 1 || op == 2) {//Se crea una condicion que se ejecutara si el valor de op es 1 o 2
        
                    break;//Se rompe el ciclo
        
                }else{//Se crea un bloque else que se ejecutara si la condicion no se cumple
                    
                    System.out.println("El número ingresado no es correcto. Vuelve a intentarlo.");//Se imprime un mensaje
                
                }//Fin del bloque else
        
            } catch (Exception e) {//Se crea un bloque catch que se ejecutara si se lanza una excepcion
            
                System.out.println("Entrada inválida. Por favor ingresa un número.");//Se imprime un mensaje
            
                scan.next();//Se limpia el buffer del scanner
            
            }//Fin del bloque catch
        
        }//Fin del ciclo while
        
        scan.nextLine();//Se limpia el buffer del scanner
        
        System.out.println("Ingresa tu nombre:");//Se imprime un mensaje
        
        nombre = scan.nextLine();//Se le asigna a la variable nombre el valor ingresado por el usuario
        
        while (true) {//Se crea un ciclo while que se ejecutara siempre
        
            System.out.println("Ingresa tu edad:");//Se imprime un mensaje
        
            try {//Se utiliza un bloque try-catch para manejar una excepcion
        
                edad = scan.nextInt();//Se le asigna a la variable edad el valor ingresado por el usuario
        
                if (edad > 0) {//Se crea una condicion que se ejecutara si el valor de edad es mayor a 0
        
                    break;//Se rompe el ciclo
        
                } else {//Se crea un bloque else que se ejecutara si la condicion no se cumple
        
                    System.out.println("Por favor, ingresa una edad válida.");//Se imprime un mensaje
        
                }//Fin del bloque else
        
            } catch (Exception e) {//Se crea un bloque catch que se ejecutara si se lanza una excepcion
        
                System.out.println("Entrada inválida. Por favor ingresa un número entero.");//Se imprime un mensaje
        
                scan.next();//Se limpia el buffer del scanner
        
            }//Fin del bloque catch
        
        }//Fin del ciclo while
        
        if (op == 1) {//Se crea una condicion que se ejecutara si el valor de op es 1
        
            Profesor profesor = new Profesor(nombre, edad);//Se crea un objeto de la clase Profesor
        
            System.out.println("Bienvenido, Profesor " + nombre + ".");//Se imprime un mensaje
        
            System.out.println("¿Que desea hacer, ingrese el numero de la opcion correcta?");//Se imprime un mensaje
        
            System.out.println("1. Consultar material bibliografico.");//Se imprime un mensaje
        
            System.out.println("2. Pedir material bibliografico.");//Se imprime un mensaje
        
            System.out.println("3. Devolver material bibliografico.");//Se imprime un mensaje
        
            System.out.println("4. Salir.");//Se imprime un mensaje
        
            op = scan.nextInt();//Se le asigna a la variable op el valor ingresado por el usuario
        
            while (op < 0 && op > 4) {//Se crea una condicion que se ejecutara si el valor de op es menor a 0 y mayor a 4
        
                System.out.println("La opcion no es valida volvela a ingresar");//Se imprime un mensaje
        
                op = scan.nextInt();//Se le asigna a la variable op el valor ingresado por el usuario
        
            }//Fin de la condicion
        
            while (op != 4) {//Se crea una condicion que se ejecutara si el valor de op es diferente de 4
        
                switch (op) {//Se inicia un bloque switch que evaluara la variable op
        
                    case 1://Caso 1
        
                        int idmaterial;//Se crea una variable de tipo entero llamada idmaterial
    
                        System.out.println("Que tipo de material quieres investigar, ingresa el numero correcto: 1-Libro");//Se imprime un mensaje
    
                        System.out.println("                                                                     2-Revista");//Se imprime un mensaje
    
                        System.out.println("                                                                     3-Tesis");//Se imprime un mensaje
    
                        idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor que se ingrese por teclado
                        
                        while (idmaterial != 1 && idmaterial != 2 && idmaterial != 3) {//Mientras idmaterial sea diferente de 1 y 2 y 3 se ejecutara el ciclo
    
                            System.out.println("La opcion no es valida volvela a ingresar");//Se imprime un mensaje
    
                            idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor que se ingrese por teclado
    
                        }//Fin del ciclo
                        
                        profesor.consultarMaterial(libros, revistas, tesis,idmaterial);//Se manda a llamar al metodo consultarMaterial de la clase Profesor
        
                    break;//Se termina el caso
        
                    case 2://Caso 2
                
                        profesor.prestarMaterial(libros, revistas, tesis);//Se manda a llamar al metodo prestarMaterial de la clase Profesor
                
                    break;//Se termina el caso
        
                    case 3://Caso 3
                
                        profesor.devolverMaterial(libros, revistas, tesis);//Se manda a llamar al metodo devolverMaterial de la clase Profesor
                
                    break;//Se termina el caso
            
                }//Fin del bloque switch
        
                System.out.println("¿Que desea hacer, ingrese el numero de la opcion correcta?");//Se imprime un mensaje
        
                System.out.println("1. Consultar material bibliografico.");//Se imprime un mensaje
        
                System.out.println("2. Pedir material bibliografico.");//Se imprime un mensaje
        
                System.out.println("3. Devolver material bibliografico.");//Se imprime un mensaje
        
                System.out.println("4. Salir.");//Se imprime un mensaje
            
                op = scan.nextInt();//Se le asigna a la variable op el valor ingresado por el usuario
            
                while (op < 0 && op > 4) {//Se crea una condicion que se ejecutara si el valor de op es menor a 0 y mayor a 4
            
                    System.out.println("La opcion no es valida volvela a ingresar");//Se imprime un mensaje
            
                    op = scan.nextInt();//Se le asigna a la variable op el valor ingresado por el usuario
            
                }//Fin de la condicion
        
            }//Fin del ciclo while
            
            System.out.println("Gracias por usar el sistema de gestion de biblioteca.");//Se imprime un mensaje
            
            System.exit(0);//Se finaliza el programa
        
        } else if (op == 2) {//Se crea una condicion que se ejecutara si el valor de op es 2
          
            Estudiante estudiante = new Estudiante(nombre, edad);//Se crea un objeto de la clase Estudiante
        
            System.out.println("Bienvenido, Estudiante " + nombre + ".");//Se imprime un mensaje
        
            System.out.println("¿Que desea hacer, ingrese el numero de la opcion correcta?");//Se imprime un mensaje
        
            System.out.println("1. Consultar material bibliografico.");//Se imprime un mensaje
        
            System.out.println("2. Pedir material bibliografico.");//Se imprime un mensaje
        
            System.out.println("3. Devolver material bibliografico.");//Se imprime un mensaje
        
            System.out.println("4. Salir.");//Se imprime un mensaje
            
            op = scan.nextInt();//Se le asigna a la variable op el valor ingresado por el usuario
            
            while (op < 0 && op > 4) {//Se crea una condicion que se ejecutara si el valor de op es menor a 0 y mayor a 4
            
                System.out.println("La opcion no es valida volvela a ingresar");//Se imprime un mensaje
            
                op = scan.nextInt();//Se le asigna a la variable op el valor ingresado por el usuario
            
            }//Fin de la condicion
            while (op != 4) {//Se crea una condicion que se ejecutara si el valor de op es diferente de 4
        
                switch (op) {//Se inicia un bloque switch que evaluara la variable op
        
                    case 1://Caso 1
                        
                        int idmaterial;//Se crea una variable de tipo entero llamada idmaterial
    
                        System.out.println("Que tipo de material quieres investigar, ingresa el numero correcto: 1-Libro");//Se imprime un mensaje
    
                        System.out.println("                                                                     2-Revista");//Se imprime un mensaje
    
                        System.out.println("                                                                     3-Tesis");//Se imprime un mensaje
    
                        idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor que se ingrese por teclado
                        
                        while (idmaterial != 1 && idmaterial != 2 && idmaterial != 3) {//Mientras idmaterial sea diferente de 1 y 2 y 3 se ejecutara el ciclo
    
                            System.out.println("La opcion no es valida volvela a ingresar");//Se imprime un mensaje
    
                            idmaterial = scan.nextInt();//Se le asigna a la variable idmaterial el valor que se ingrese por teclado
    
                        }//Fin del ciclo
                        
                        estudiante.consultarMaterial(libros, revistas, tesis,idmaterial);//Se manda a llamar al metodo consultarMaterial de la clase Estudiante
                
                    break;//Se termina el caso
        
                    case 2://Caso 2
            
                        estudiante.prestarMaterial(libros, revistas, tesis);//Se manda a llamar al metodo prestarMaterial de la clase Estudiante
                
                    break;//Se termina el caso
        
                    case 3://Caso 3
            
                        estudiante.devolverMaterial(libros, revistas, tesis);//Se manda a llamar al metodo devolverMaterial de la clase Estudiante
                
                    break;//Se termina el caso
            
                }//Fin del bloque switch
            
                System.out.println("¿Que desea hacer, ingrese el numero de la opcion correcta?");//Se imprime un mensaje
        
                System.out.println("1. Consultar material bibliografico.");//Se imprime un mensaje
        
                System.out.println("2. Pedir material bibliografico.");//Se imprime un mensaje
        
                System.out.println("3. Devolver material bibliografico.");//Se imprime un mensaje
        
                System.out.println("4. Salir.");//Se imprime un mensaje
            
                op = scan.nextInt();//Se le asigna a la variable op el valor ingresado por el usuario
            
                while (op < 0 && op > 4) {//Se crea una condicion que se ejecutara si el valor de op es menor a 0 y mayor a 4
            
                    System.out.println("La opcion no es valida volvela a ingresar");//Se imprime un mensaje
            
                    op = scan.nextInt();//Se le asigna a la variable op el valor ingresado por el usuario
            
                }//Fin de la condicion
            }
            
            System.out.println("Gracias por usar el sistema de gestion de biblioteca.");//Se imprime un mensaje
            
            System.exit(0);//Se finaliza el programa

        }//Fin de la condicion    
    
    }//Fin del metodo main

}//Fin de la clase Main