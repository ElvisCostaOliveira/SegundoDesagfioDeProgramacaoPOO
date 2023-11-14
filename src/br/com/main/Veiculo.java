package br.com.main;

abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor;

    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = motor;
    }

    // getters e setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Método abstrato
    public abstract float calVel(float velocMax);

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}

	public float getVelocMax() {
		return velocMax;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}