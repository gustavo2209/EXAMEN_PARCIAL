import java.util.Arrays;
import java.util.List;

public class MatriculaAlumno {
    
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private Integer edad;
    boolean estaMatriculado;

    public Integer RegistrarAlumnoMatriculado() throws Exception {
        Integer alumnoId = null;
        String tipoDoc = "DNI";
        Integer edadMinima = 6;
        List<String> listaTipoDoc =Arrays.asList( "DNI", "CE", "Pasaporte");
        List<String> listaTipoColegio =Arrays.asList( "EBA", "EBE", "EBR", "CETPRO");
        
        if(nombre.isEmpty() ){
            throw new IllegalArgumentException("Nombre es requerido.");
        }
        if(apellidos.isEmpty() ){
            throw new IllegalArgumentException("Apellido es requerido.");
        }
        if(dni.isEmpty() ){
            throw new IllegalArgumentException("DNI es requerido.");
        }
        if(edad != null){
            throw new IllegalArgumentException("La edad es requerida.");
        }
        
        this.estaMatriculado = (listaTipoDoc.contains(tipoDoc) && 
                                    this.edad >= edadMinima && 
                                    listaTipoColegio.contains("EBR"));    
                
        if(estaMatriculado){
            alumnoId = 1;   
        }
        return alumnoId;
    }
    
    public boolean analizarEdad(int edad){
        if(edad >=6 && edad <= 18){
            return true;
        }
        return false;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
}

