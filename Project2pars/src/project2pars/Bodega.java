package project2pars;
import java.util.ArrayList;

public class Bodega {
    
    private ArrayList<Comida> comidas;
    private ArrayList<Medicina> medicinas;
    private ArrayList<Mercaderia> mercaderias;

   public Bodega() {
        comidas = new ArrayList<>();
        medicinas = new ArrayList<>();
        mercaderias = new ArrayList<>();
    }

   
   
    public void agregarComida(Comida c) {
        comidas.add(c);
    }
    public ArrayList<Comida> getComidas() {
        return comidas;
    }
}
