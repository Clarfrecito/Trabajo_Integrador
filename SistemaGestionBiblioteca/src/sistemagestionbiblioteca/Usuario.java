package sistemagestionbiblioteca;//Esto es un paquete en el cual esta todo nuestro proyecto, lo usamos para que las clases puedan comunicarse

public abstract class Usuario {//Se crea una clase abstracta llamada Usuario

    protected String nombre;//Se crea un atributo protegido de tipo String llamado nombre
    
    protected int edad;//Se crea un atributo protegido de tipo entero llamado edad

    public Usuario(String nombre, int edad) {//Se crea un constructor publico que recibe un String nombre y un entero edad
    
        this.nombre = nombre;//Se inicializa el atributo nombre con el valor del parametro nombre
    
        this.edad = edad;//Se inicializa el atributo edad con el valor del parametro edad
    
    }//Fin del constructor

    public abstract void consultarMaterial(Libro[] libros, Revista[] revistas, Tesis[] tesis, int idmaterial);//Se crea un metodo abstracto llamado consultarMaterial que recibe un arreglo de libros, revistas y tesis

}//Fin de la clase Usuario