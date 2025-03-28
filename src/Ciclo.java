import java.util.ArrayList;

/*public class Ciclo {
    public String NOMBRE_CICLO;
    public ArrayList<Estudiante> LISTA_ESTUDIANTES = new ArrayList<>();

    public Ciclo(String NOMBRE_CICLO) {
        this.NOMBRE_CICLO = new String(NOMBRE_CICLO);
    }

    public void Agregar_estudiante(Estudiante e) { 
        LISTA_ESTUDIANTES.add(e); 
    }

    public String datos_ciclo() {  
        String datos = "Ciclo: " + NOMBRE_CICLO + "\nEstudiantes:\n";
        for (Estudiante e : LISTA_ESTUDIANTES) {
            datos += e.datos_estudiante() + "\n";
        }
        return datos;
    }
}
*/
public class Ciclo {
 private String nombre;
 private ArrayList<Estudiante> estudiantes;


 public Ciclo(String nombre) {
     this.nombre = nombre;
     this.estudiantes = new ArrayList<>();
 }


 public void agregarEstudiante(Estudiante estudiante) {
     estudiantes.add(estudiante);
 }


 public String obtenerDatos() {
     StringBuilder datos = new StringBuilder("Ciclo: " + nombre + "\nEstudiantes:\n");
     for (Estudiante e : estudiantes) {
         datos.append(e.obtenerDatos()).append("\n");
     }
     return datos.toString();
 }

 public String getNombre() { return nombre; }
 public ArrayList<Estudiante> getEstudiantes() { return estudiantes; }
 public void setNombre(String nombre) { this.nombre = nombre; }
}


/*
 * Este es para el segundo comentario
 * */
