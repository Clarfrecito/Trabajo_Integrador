package sistemagestionbiblioteca;//Esto es un paquete en el cual esta todo nuestro proyecto, lo usamos para que las clases puedan comunicarse

public interface Prestamo {//Se crea una interfaz publica llamada Prestamo

    void prestarMaterial(Libro[] libros, Revista[] revistas, Tesis[] tesis);//Se crea un metodo abstracto llamado prestarMaterial que recibe un arreglo de libros, revistas y tesis

    void devolverMaterial(Libro[] libros, Revista[] revistas, Tesis[] tesis);//Se crea un metodo abstracto llamado devolverMaterial que recibe un arreglo de libros, revistas y tesis

}//Fin de la interfaz Prestamo