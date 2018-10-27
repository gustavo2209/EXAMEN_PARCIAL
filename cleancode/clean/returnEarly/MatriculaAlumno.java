public class MatriculaAlumno {
    
    private int id;
    String nombre;
    String apellidos;
    String dni;
    String tipoColegio;
    Integer edad;
    boolean estaMatriculado;

    public boolean verificaMatriculaAlumno(int edad) throws Exception {
        estaMatriculado = false;
        if(this.edad > 18){
            return false;
        }
        if(!tipoColegio.contains("EBR")){
            return false;
        }
        
        return estaMatriculado = true;
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

