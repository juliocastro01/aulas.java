
public class Viewer {
    public static void main(String[] args) {
        Notebook modelo1 = new Notebook ("Dell","12345","i9");
        calculadora modelo2 = new calculadora ("hp","1235",200);
        modelo1.mostrarmodelo(modelo1.getModelo());
        modelo2.mostrarmodelo(modelo2.getModelo());
        System.out.println(modelo2.Desconto((float)2.0));
    }
 
}
