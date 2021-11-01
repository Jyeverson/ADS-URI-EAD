package heranca;
import heranca.Veiculos;

/**
 *
 * @author jyeverson.madalozo
 */
public class Passageiro extends Veiculos{

    String corExterna;
    String corInterna;
    String qtPortas;
    String qtPassageiros;
    String opcionais;

    public String getCorExterna() {
        return corExterna;
    }

    public void setCorExterna(String corExterna) {
        this.corExterna = corExterna;
    }

    public String getCorInterna() {
        return corInterna;
    }

    public void setCorInterna(String corInterna) {
        this.corInterna = corInterna;
    }

    public String getQtPortas() {
        return qtPortas;
    }

    public void setQtPortas(String qtPortas) {
        this.qtPortas = qtPortas;
    }

    public String getQtPassageiros() {
        return qtPassageiros;
    }

    public void setQtPassageiros(String qtPassageiros) {
        this.qtPassageiros = qtPassageiros;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }
}
