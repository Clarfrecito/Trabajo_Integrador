package sistemagestionbiblioteca;//Esto es un paquete en el cual esta todo nuestro proyecto, lo usamos para que las clases puedan comunicarse

public class Libro extends MaterialBibliografico {//Se crea una clase publica llamada Libro que hereda de MaterialBibliografico

    private int idLibro;//Se crea un atributo privado de tipo entero llamado idLibro

    public Libro(String nombre_texto, String autor, boolean disponible, int idLibro) {//Se crea un constructor publico que recibe un String nombre_texto, un String autor, un boolean disponible y un entero idLibro
    
        super(nombre_texto, autor, disponible);//Se manda a llamar al constructor de la clase madre con los parametros nombre_texto, autor y disponible
    
        this.idLibro = idLibro;//Se inicializa el atributo idLibro con el valor del parametro idLibro
    
    }//Fin del constructor

    @Override
    public String obtenerInformacion() {//Se crea un metodo publico de tipo String llamado obtenerInformacion
    
        return "Libro - Título: " + nombre_texto + ", Autor: " + autor + "ID: " + idLibro;//Se regresa un mensaje con el titulo, autor y id del libro
    
    }//Fin del metodo

}//Fin de la clase Libro