import java.util.ArrayList;

public class RegistrosSL {
    ArrayList<StringTokenSubList> tk_id_registros;
    ArrayList<String> tk_id_padres;

    public RegistrosSL(ArrayList<String> padre){
        this.tk_id_registros = new ArrayList<>();
        this.tk_id_padres = padre;
    }
}
