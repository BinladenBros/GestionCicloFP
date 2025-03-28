public class Estudiante {
	
 /*   public String Nombre_estudiante;  
    public int ID_ESTUDIANTE;         
    public int Edad_Estudiante;       
   
    public Estudiante(String Nombre_estudiante, int ID_ESTUDIANTE, int Edad_Estudiante) {
        this.Nombre_estudiante = Nombre_estudiante;
        this.ID_ESTUDIANTE = ID_ESTUDIANTE;
        this.Edad_Estudiante = Edad_Estudiante;
       
    }

    public String datos_estudiante() {
        return "Estudiante: " + Nombre_estudiante + " (ID: " + ID_ESTUDIANTE + ") Edad: " + Edad_Estudiante;
    }*/
	
	    private String nombre;
	    private int id;
	    private int edad;


	    
	    public Estudiante(String nombre, int id, int edad) {
	        this.nombre = nombre;
	        this.id = id;
	        this.edad = edad;
	    }

	    public String obtenerDatos() {
	        return "Estudiante: " + nombre + " (ID: " + id + ") Edad: " + edad;
	    }

	    // Getters y setters
	    public String getNombre() { return nombre; }
	    public int getId() { return id; }
	    public int getEdad() { return edad; }
	    public void setNombre(String nombre) { this.nombre = nombre; }
	    public void setEdad(int edad) { this.edad = edad; }
	}


/*
 * Tercer commit
 * */