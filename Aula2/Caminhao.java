package transporte;
public class Caminhao extends Veiculo{
    private int eixos;
    private int toneladas;
    private boolean desengatavel;

    public Caminhao() {
        super();
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    public boolean isDesengatavel() {
        return desengatavel;
    }

    public void setDesengatavel(boolean desengatavel) {
        this.desengatavel = desengatavel;
    }
    
    
    
    
    
}     
