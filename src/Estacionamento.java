public class Estacionamento {

    private Carro[] vagas;

    public Estacionamento(int capacidade) {
        vagas = new Carro[capacidade];
    }

    public void estacionar(Carro carro) {
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] != null && vagas[i].getPlaca().equalsIgnoreCase(carro.getPlaca())) {
                System.out.println("Carro já está estacionado!");
                return;
            }
        }
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] == null) {
                vagas[i] = carro;
                System.out.println("Carro estacionado na vaga " + (i + 1) + "!");
                return;
            }
        }
        System.out.println("Estacionamento cheio!");
    }

    public void retirar(String placa) {
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i] != null && vagas[i].getPlaca().equalsIgnoreCase(placa)) {
                vagas[i] = null;
                System.out.println("Carro com placa " + placa + " retirado da vaga " + (i + 1) + "!");
                return;
            }
        }
        System.out.println("Carro não encontrado no estacionamento!");
    }

    public void listarVagas() {
        for (int i = 0; i < vagas.length; i++) {
            Carro carro = vagas[i];
            if (carro == null) {
                System.out.println("Vaga " + (i + 1) + ": Livre");
            } else {
                System.out.println("Vaga " + (i + 1) + ": " + carro.getPlaca() + " - " + carro.getModelo() + " - "
                        + carro.getCor());
            }
        }
    }
}