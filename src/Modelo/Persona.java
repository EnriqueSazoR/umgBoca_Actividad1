package Modelo;

/**
 *
 * @author Luis Sazo
 */
abstract class Persona {  // esta clase es abstracta, unicamente va a heredar a otras clases
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String fechaNac;
    
    // Constructor con parametros

    public Persona(String nombres, String apellidos, String direccion, String telefono, String fechaNac) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
    }
    
    // Constructor Vacio
    public Persona(){
        
    }
    
    // Getters and Setters

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    // Métodos
    protected String[] crear(){
        return null;
    }
    protected void leer(){}
    protected void actualizar(){}
    protected void borrar(){}
    
}
