
public class calculadora extends maquina {
    private float valor;

    public calculadora(String Modelo, String NumSerie, float valor) {
        super(Modelo, NumSerie);
        this.valor = valor;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public float Desconto (float desconto){
        return valor - desconto;
    }
    
}
