public class Carro {
    
    String cor = "Preta";
    int portas = 4;
    String modelo = "Creta";
    int tanque = 50;

    Carro() {

    }

    Carro(String cor, String modelo, int tanque, int portas) {
        this.tanque = tanque;
        this.cor = cor;
        this.modelo = modelo;
        
    }

    
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setTanque(int tanque) {
        this.tanque = tanque;
    }

    int getTanque() {
        return tanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return tanque * valorCombustivel;
    }

}