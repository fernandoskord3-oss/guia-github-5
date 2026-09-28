import com.uped.proyecto.modelo.Docente;

public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("María Hernández", "05987654-3",
                "Ingeniería de Software", 8);
        System.out.println(docente);
        docente.impartirClase("Programación III");
    }
}
