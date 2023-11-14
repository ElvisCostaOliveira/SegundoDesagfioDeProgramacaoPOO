package br.com.main;

public class Teste {
	public static void main(String[] args) {
		Veiculo[] veiculos = new Veiculo[5];

		for (int i = 0; i < veiculos.length; i++) {
			veiculos[i] = new Veiculo();
			veiculos[i].setPlaca("ABC123" + i);
			veiculos[i].setMarca("Marca" + i);
			veiculos[i].setModelo("Modelo" + i);
			veiculos[i].setCor("Cor" + i);
			veiculos[i].setVelocMax(200.0f + i * 10);
			veiculos[i].setQtdRodas(4);
			veiculos[i].getMotor().setQtdPist(i + 1);
			veiculos[i].getMotor().setPotencia(100 + i * 20);
		}

		for (Veiculo veiculo : veiculos) {
			System.out.println("Placa: " + veiculo.getPlaca());
			System.out.println("Marca: " + veiculo.getMarca());
			System.out.println("Modelo: " + veiculo.getModelo());
			System.out.println("Cor: " + veiculo.getCor());
			System.out.println("Velocidade Máxima: " + veiculo.getVelocMax());
			System.out.println("Quantidade de Rodas: " + veiculo.getQtdRodas());
			System.out.println("Quantidade de Pistões do Motor: " + veiculo.getMotor().getQtdPist());
			System.out.println("Potência do Motor: " + veiculo.getMotor().getPotencia());
			System.out.println("------------------------------");
		}
	}
}
