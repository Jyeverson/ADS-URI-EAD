package heranca;
import heranca.Veiculos;

/**
 *
 * @author jyeverson.madalozo
 */
public class Carga extends Veiculos {

    String maxCarga;
    Double altura;
    Double largura;
    Double profundidade;

    public String getMaxCarga() {
        return maxCarga;
    }

    public void setMaxCarga(String maxCarga) {
        this.maxCarga = maxCarga;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

}
