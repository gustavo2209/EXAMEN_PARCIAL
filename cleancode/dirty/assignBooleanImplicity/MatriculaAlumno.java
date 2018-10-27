import java.util.Arrays;
import java.util.List;

public class MatriculaAlumno {
    
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private boolean estaMatriculado;

    public Integer RegistrarAlumnoMatriculado(){
        Integer alumnoId = null;
        String tipoDoc = "DNI";
        List<String> listaTipoDoc =Arrays.asList( "DNI", "CE", "Pasaporte");
        List<String> listaTipoColegio = Arrays.asList( "EBA", "EBE", "EBR", "CETPRO");
        
        if (listaTipoDoc.contains(tipoDoc) && listaTipoColegio.contains("EBR")){
            if(this.edad >=6 && this.edad <= 18){
                this.estaMatriculado = true;
                alumnoId = 1;                
            }else{
                this.estaMatriculado = false;
            }                
        }else{
            this.estaMatriculado = false;
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
