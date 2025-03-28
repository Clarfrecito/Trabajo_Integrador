package sistemagestionbiblioteca;//Esto es un paquete en el cual esta todo nuestro proyecto, lo usamos para que las clases puedan comunicarse

public class Revista extends MaterialBibliografico {//Se crea una clase publica llamada Revista que hereda de MaterialBibliografico

    private int idRevista;//Se crea un atributo privado de tipo entero llamado idRevista

    public Revista(String nombre_texto, String autor, boolean disponible, int idRevista) {//Se crea un constructor publico que recibe un String nombre_texto, un String autor, un boolean disponible y un entero idRevista

        super(nombre_texto, autor, disponible);//Se manda a llamar al constructor de la clase madre con los parametros nombre_texto, autor y disponible

        this.idRevista = idRevista;//Se inicializa el atributo idRevista con el valor del parametro idRevista

    }//Fin del constructor

    @Override
    public String obtenerInformacion() {//Se crea un metodo publico de tipo String llamado obtenerInformacion

        return "Revista - Título: " + nombre_texto + ", Autor: " + autor + ", ID: " + idRevista;//Se regresa un mensaje con el titulo, autor y id de la revista
    }//Fin del metodo

}//Fin de la clase Revista