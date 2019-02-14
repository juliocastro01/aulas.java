
public class Notebook extends maquina {
    private String processador;

    public Notebook(String Modelo, String NumSerie, String processador) {
        super(Modelo, NumSerie);
        this.processador = processador;
    } 
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }   
    @Override
    public void mostrarmodelo(String Modelo){
       System.out.println("O modelo que voce escolheu é : " + Modelo);
   }
}
