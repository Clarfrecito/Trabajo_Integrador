package sistemagestionbiblioteca;//Esto es un paquete en el cual esta todo nuestro proyecto, lo usamos para que las clases puedan comunicarse

public abstract class MaterialBibliografico {//Se crea una clase abstracta llamada MaterialBibliografico

    protected String nombre_texto;//Se crea un atributo protegido de tipo String llamado nombre_texto
    
    protected String autor;//Se crea un atributo protegido de tipo String llamado autor
    
    protected boolean disponible;//Se crea un atributo protegido de tipo boolean llamado disponible

    public MaterialBibliografico(String nombre_texto, String autor, boolean disponible) {//Se crea un constructor publico que recibe un String nombre_texto, un String autor y un boolean disponible
    
        this.nombre_texto = nombre_texto;//Se inicializa el atributo nombre_texto con el valor del parametro nombre_texto
    
        this.autor = autor;//Se inicializa el atributo autor con el valor del parametro autor
    
        this.disponible = disponible;//Se inicializa el atributo disponible con el valor del parametro disponible
    
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

    public abstract String obtenerInformacion();//Se crea un metodo publico de tipo String llamado obtenerInformacion

}//Fin de la clase MaterialBibliografico