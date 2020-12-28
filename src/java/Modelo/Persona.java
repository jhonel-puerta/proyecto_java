package Modelo;
public class Persona {
    int id;
    String nombre;
    String apellidos;
    float nota1;
    float nota2;
    float promedio;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, float nota1, float nota2, float promedio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
}
