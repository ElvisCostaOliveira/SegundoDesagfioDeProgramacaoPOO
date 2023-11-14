package br.com.main;

public class Teste {
    public static void main(String[] args) {
        Passeio veiculoPasseio = new Passeio(null, null, null, null, 0, 0, null, 0);
        veiculoPasseio.setMarca("Nissan");
        veiculoPasseio.setModelo("March");
        veiculoPasseio.setPlaca("ABC 1234");
        veiculoPasseio.setVelocMax(200);
        veiculoPasseio.setQtdPassageiros(5);

        Motor motorPasseio = new Motor(0, 0);
        motorPasseio.setPotencia(70);
        motorPasseio.setQtdPist(3);

        veiculoPasseio.setMotor(motorPasseio);

        Carga veiculoCarga = new Carga(null, null, null, null, 0, 0, motorPasseio, 0, 0);
        veiculoCarga.setMarca("Fiat");
        veiculoCarga.setModelo("Strada");
        veiculoCarga.setPlaca("BBB 3333");
        veiculoCarga.setVelocMax(164);
        veiculoCarga.setCargaMax(705);
        veiculoCarga.setTara(1084);

        Motor motorCarga = new Motor(0, 0);
        motorCarga.setPotencia(88);
        motorCarga.setQtdPist(7);

        veiculoCarga.setMotor(motorCarga);

        exibirInformacoes(veiculoPasseio);
        exibirInformacoes(veiculoCarga);
    }

    private static void exibirInformacoes(Veiculo veiculo) {
    	System.out.println("################ VEICULO " + (veiculo instanceof Passeio ? "DE PASSEIO" : "DE CARGA") + " #################");
        
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Velocidade Máxima: " + veiculo.calVel(veiculo.getVelocMax()));
        if (veiculo instanceof Passeio) {
            System.out.println("Quantidade de Passageiros: " + ((Passeio) veiculo).getQtdPassageiros());
        } else if (veiculo instanceof Carga) {
            System.out.println("Carga Máxima: " + ((Carga) veiculo).getCargaMax());
            System.out.println("Tara: " + ((Carga) veiculo).getTara());
        }
        System.out.println("Potência do Motor: " + veiculo.getMotor().getPotencia());
        System.out.println("Número de Pistões: " + veiculo.getMotor().getQtdPist());
        System.out.println("####################################################\n");
    }
}
