
public abstract class maquina {
   private String Modelo;
   private String NumSerie;
   
   maquina(String Modelo, String NumSerie){
       this.Modelo = Modelo;
       this.NumSerie = NumSerie;
   }
   public void setModelo(String Modelo){
       this.Modelo = Modelo;
   }
   public void setNumSerie(String NumSerie){
       this.NumSerie = NumSerie;
   }
   public String getModelo(){
       return Modelo;
   }
   public String getNumSerie(){
       return NumSerie;
   }
   public void mostrarmodelo(String Modelo){
       System.out.println("O modelo é : " + Modelo);
   }
}
