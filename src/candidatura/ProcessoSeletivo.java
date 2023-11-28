package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws java.lang.ArrayIndexOutOfBoundsException {

        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"ANA", "MARCOS", "FELIPE", "JOÃO", "LUANA", "MARCIO", "LUIZ", "LAURA", "MARCELO", "PEDRO"};
        String[] listaCandidatosSelecionados = new String[5]; //declaração de uma array com valor fixo de indices.
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while( candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                listaCandidatosSelecionados [candidatosSelecionados] = candidato; // armazenando os candidatos na lista.
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++;
            }
            candidatoAtual++;
        }

        //Imprimir a lista de candidatos com a array.

        System.out.println("Candidatos selecionados: ");

        for (String candidato : listaCandidatosSelecionados) {
            if (candidato != null) {
                System.out.println(candidato + " ");
            }
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

}
