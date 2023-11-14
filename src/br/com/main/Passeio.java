package br.com.main;

class Passeio extends Veiculo {
    private int qtdPassageiros;

    public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor, int qtdPassageiros) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, motor);
        this.qtdPassageiros = qtdPassageiros;
    }

    // getters e setters

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    // Implementação do método abstrato
    @Override
    public float calVel(float velocMax) {
        return velocMax;
    }
}