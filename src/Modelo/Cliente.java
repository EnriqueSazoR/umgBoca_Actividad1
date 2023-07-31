package Modelo;

/**
 *
 * @author Luis Sazo
 */
public class Cliente extends Persona{
    private String nit;
    
    // Constructor con parametros
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fechaNac) {
        super(nombres, apellidos, direccion, telefono, fechaNac);
        this.nit = nit;
    }
    
    // Constructor vacio
    public Cliente(){
        
    }
    
    // Getters and Setters
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    // Metodos
    @Override
     protected String[] crear(){
         String datos [] = new String[6];
         datos[0] = getNit();
         datos[1] = getNombres();
         datos[2] = getApellidos();
         datos[3] = this.getDireccion();
         datos[4] = this.getTelefono();
         datos[5] = this.getFechaNac();
         
        return datos;
    }
    
    
}
