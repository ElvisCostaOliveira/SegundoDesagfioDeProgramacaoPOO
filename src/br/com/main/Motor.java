package br.com.main;

class Motor {
    private int qtdPist;
    private int potencia;

    public Motor(int qtdPist, int potencia) {
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }

    // getters and setters

    public int getQtdPist() {
        return qtdPist;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}