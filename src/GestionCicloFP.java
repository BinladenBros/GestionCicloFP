import java.util.ArrayList;

/*public class GestionCicloFP {
    public ArrayList<Estudiante> lista_estudiantes = new ArrayList<>(); 
    public ArrayList<Ciclo> lista_ciclos = new ArrayList<>();         

    public void AgregarEstudiante(String Nombre, int ID, int Edad) {  
        lista_estudiantes.add(new Estudiante(Nombre, ID, Edad));
    }

    public void AgregarCiclo(String NombreCiclo) { 
    	lista_ciclos.add(new Ciclo(NombreCiclo));
    }

    public void Matricular_estudiante(int id_estudiante, String nombre_ciclo) { 
        Estudiante est = null; 
        Ciclo cur = null;      

        for (Estudiante e : lista_estudiantes) { 
            if (e.ID_ESTUDIANTE == id_estudiante) {
                est = e;
                break;
            }
        }

        for (Ciclo c : lista_ciclos) { 
            if (c.NOMBRE_CICLO.equals(nombre_ciclo)) {
                cur = c;
                break;
            }
        }

        if (est != null && cur != null) {
            cur.Agregar_estudiante(est);
        }
    }

    public void Mostrar_ciclos() { 
        for (Ciclo ciclo : lista_ciclos) {
            System.out.println(ciclo.datos_ciclo());
        }
    }

    public static void main(String[] args) {
        GestionCicloFP gestion = new GestionCicloFP();

        gestion.AgregarEstudiante("Alicia", 1, 20);
        gestion.AgregarEstudiante("Roberto", 2, 22);

        gestion.AgregarCiclo("DAW");
        gestion.AgregarCiclo("ASIR");

        gestion.Matricular_estudiante(1, "DAW");
        gestion.Matricular_estudiante(2, "ASIR");

        gestion.Mostrar_ciclos();
    }
}*/






public class GestionCicloFP {
 private ArrayList<Estudiante> estudiantes;
 private ArrayList<Ciclo> ciclos;

 public GestionCicloFP() {
     this.estudiantes = new ArrayList<>();
     this.ciclos = new ArrayList<>();
 }


 public void agregarEstudiante(String nombre, int id, int edad) {
     estudiantes.add(new Estudiante(nombre, id, edad));
 }


 public void agregarCiclo(String nombre) {
     ciclos.add(new Ciclo(nombre));
 }


 public void matricularEstudiante(int idEstudiante, String nombreCiclo) {
     Estudiante estudiante = buscarEstudiantePorId(idEstudiante);
     Ciclo ciclo = buscarCicloPorNombre(nombreCiclo);

     if (estudiante != null && ciclo != null) {
         ciclo.agregarEstudiante(estudiante);
     }
 }

 private Estudiante buscarEstudiantePorId(int id) {
     for (Estudiante e : estudiantes) {
         if (e.getId() == id) {
             return e;
         }
     }
     return null;
 }

 private Ciclo buscarCicloPorNombre(String nombre) {
     for (Ciclo c : ciclos) {
         if (c.getNombre().equals(nombre)) {
             return c;
         }
     }
     return null;
 }

 public void mostrarCiclos() {
     for (Ciclo ciclo : ciclos) {
         System.out.println(ciclo.obtenerDatos());
     }
 }

 public static void main(String[] args) {
	 GestionCicloFP gestion = new GestionCicloFP();

     gestion.agregarEstudiante("Alicia", 1, 20);
     gestion.agregarEstudiante("Roberto", 2, 22);

     gestion.agregarCiclo("DAM");
     gestion.agregarCiclo("ASIR");

     gestion.matricularEstudiante(1, "DAM");
     gestion.matricularEstudiante(2, "ASIR");

     gestion.mostrarCiclos();
 }
}














