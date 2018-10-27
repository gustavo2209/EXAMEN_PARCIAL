import java.util.Arrays;
import java.util.List;

public class MatriculaAlumno {
    
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private Integer edad;
    boolean estaMatriculado;

    public boolean verificaMatriculaAlumno(int edad) throws Exception {
        Integer alumnoId = null;
        String tipoDoc = "DNI";
        estaMatriculado = false;
        List<String> listaTipoDoc =Arrays.asList( "DNI", "CE", "Pasaporte");
        List<String> listaTipoColegio =Arrays.asList( "EBA", "EBE", "EBR", "CETPRO");
        
       if(this.edad >= 6){

               if(listaTipoColegio.contains("EBR")){
                        estaMatriculado = true;
                   }

       }
        return estaMatriculado;
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
