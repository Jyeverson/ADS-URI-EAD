package heranca;

/*
Trabalhar com herança em orientação a objetos pode nos trazer muitas vantagens,
 como a economia de código; entretanto, é importante termos um bom conhecimento
  sobre o assunto para aplicá-lo da melhor forma em nossos projetos.

Você trabalha como analista/programador em uma fábrica de software e foi encarregado
 de atender uma locadora de veículos. O cliente necessita realizar o cadastro de sua
  frota, que é constituída por veículos de passageiros e de carga.

- Espécie (se o veículo é de carga ou de passageiro), placa,
 procedência (nacional ou importado), marca, modelo, ano do modelo,
  ano da fabricação, chassi, renavam, cor externa, cor interna, combustível,
   motor, quilometragem, consumo médio, número de portas, número de passageiros e opcionais.

- Espécie (se o veículo é de carga ou de passageiro), placa,
 procedência (nacional ou importado), marca, modelo, ano do modelo,
  ano da fabricação, chassi, renavam, combustível, motor, quilometragem,
   consumo médio, capacidade máxima de carga em kg, altura, largura e profundidade.


Sua tarefa é implementar as classes de modelo em uma linguagem de programação orientada
 a objetos. Considere a possibilidade de criar uma estrutura de herança.

*/

/**
 *
 * @author jyeverson.madalozo
 */
public class Veiculos {
 String placa;
 String procedência; 
 String marca;
 String modelo;
 String anoModelo;
 String anoFabricacao;
 String chassi;
 String renavam;
 String combustível;
 String motor;
 Double quilometragem;
 Double consumoMedio;
 
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String Placa) {
        this.placa = Placa;
    }

    public String getProcedência() {
        return procedência;
    }

    public void setProcedência(String procedência) {
        this.procedência = procedência;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getCombustível() {
        return combustível;
    }

    public void setCombustível(String combustível) {
        this.combustível = combustível;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(Double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

}
