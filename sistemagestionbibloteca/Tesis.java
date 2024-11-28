package sistemagestionbibloteca;//Esto es un paquete en el cual esta todo nuestro proyecto, lo usamos para que las clases puedan comunicarse

public class Tesis extends MaterialBibliografico {//Se crea una clase publica llamada Tesis que hereda de MaterialBibliografico

    private int idTesis;//Se crea un atributo privado de tipo entero llamado idTesis

    public Tesis(String nombre_texto, String autor, boolean disponible, int idTesis) {//Se crea un constructor publico que recibe un String nombre_texto, un String autor, un boolean disponible y un entero idTesis

        super(nombre_texto, autor, disponible);//Se manda a llamar al constructor de la clase padre con los parametros nombre_texto, autor y disponible

        this.idTesis = idTesis;//Se inicializa el atributo idTesis con el valor del parametro idTesis

    }//Fin del constructor

    public boolean isDisponible() {//Se crea un metodo publico de tipo booleano llamado isDisponible

        return disponible;//Se regresa el valor del atributo disponible

    }//Fin del metodo

    public void setDisponible(boolean disponible) {//Se crea un metodo publico llamado setDisponible que recibe un boolean disponible

        this.disponible = disponible;//Se inicializa el atributo disponible con el valor del parametro disponible

    }//Fin del metodo

    public boolean isNotDisponible() {//Se crea un metodo publico de tipo booleano llamado isNotDisponible

        return !disponible;//Se regresa el valor contrario del atributo disponible

    }//Fin del metodo

    public String obtenerInformacion() {//Se crea un metodo publico de tipo String llamado obtenerInformacion

        return "Tesis - Título: " + nombre_texto + ", Autor: " + autor + ", ID: " + idTesis;//Se regresa un mensaje con el titulo, autor y id de la tesis

    }//Fin del metodo

}//Fin de la clase Tesis