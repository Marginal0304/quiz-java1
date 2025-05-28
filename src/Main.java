public class Main {
    public static void main(String[] args) {
        Cabecalho cabecalho = new Cabecalho();
        cabecalho.exibirInformacoes();
        Questao[] questoes = criarQuestoes();
        int pontuacao = 0;
        

        System.out.println("Bem-vindo ao Quiz!\n");
        System.out.println("Responda às questões com A, B, C, D ou E.\n");

        // Loop através de todas as questões
        for (int i = 0; i < questoes.length; i++) {
            System.out.println("Questão " + (i+1) + ":");
            questoes[i].escrevaQuestao();
            String resposta = questoes[i].leiaResposta();

            if (questoes[i].isCorreta(resposta)) {
                pontuacao++;
            }
        }

        // Exibir resultados finais
        exibirResultado(pontuacao, questoes.length);
    }

    private static Questao[] criarQuestoes() {
        Questao[] questoes = new Questao[15];

        // Questão 1
        Questao q1 = new Questao();
        q1.pergunta = "Qual é o maior planeta do sistema solar?";
        q1.opcaoA = "A) Terra";
        q1.opcaoB = "B) Marte";
        q1.opcaoC = "C) Júpiter";
        q1.opcaoD = "D) Saturno";
        q1.opcaoE = "E) Netuno";
        q1.correta = "C";
        questoes[0] = q1;

        // Questão 2
        Questao q2 = new Questao();
        q2.pergunta = "Em que ano começou a Segunda Guerra Mundial?";
        q2.opcaoA = "A) 1939";
        q2.opcaoB = "B) 1941";
        q2.opcaoC = "C) 1945";
        q2.opcaoD = "D) 1935";
        q2.opcaoE = "E) 1943";
        q2.correta = "A";
        questoes[1] = q2;

        // Questão 3
        Questao q3 = new Questao();
        q3.pergunta = "Qual é a capital do Canadá?";
        q3.opcaoA = "A) Toronto";
        q3.opcaoB = "B) Vancouver";
        q3.opcaoC = "C) Ottawa";
        q3.opcaoD = "D) Montreal";
        q3.opcaoE = "E) Quebec";
        q3.correta = "C";
        questoes[2] = q3;

        // Questão 4
        Questao q4 = new Questao();
        q4.pergunta = "Quem pintou a Mona Lisa?";
        q4.opcaoA = "A) Vincent van Gogh";
        q4.opcaoB = "B) Pablo Picasso";
        q4.opcaoC = "C) Leonardo da Vinci";
        q4.opcaoD = "D) Michelangelo";
        q4.opcaoE = "E) Claude Monet";
        q4.correta = "C";
        questoes[3] = q4;

        // Questão 5
        Questao q5 = new Questao();
        q5.pergunta = "Qual é o maior órgão do corpo humano?";
        q5.opcaoA = "A) Cérebro";
        q5.opcaoB = "B) Fígado";
        q5.opcaoC = "C) Pulmão";
        q5.opcaoD = "D) Pele";
        q5.opcaoE = "E) Coração";
        q5.correta = "D";
        questoes[4] = q5;

        // Questão 6
        Questao q6 = new Questao();
        q6.pergunta = "Quantos continentes existem no mundo?";
        q6.opcaoA = "A) 5";
        q6.opcaoB = "B) 6";
        q6.opcaoC = "C) 7";
        q6.opcaoD = "D) 4";
        q6.opcaoE = "E) 8";
        q6.correta = "B";
        questoes[5] = q6;

        // Questão 7
        Questao q7 = new Questao();
        q7.pergunta = "Qual é o símbolo químico do ouro?";
        q7.opcaoA = "A) Ag";
        q7.opcaoB = "B) Au";
        q7.opcaoC = "C) Fe";
        q7.opcaoD = "D) Pb";
        q7.opcaoE = "E) Cu";
        q7.correta = "B";
        questoes[6] = q7;

        // Questão 8
        Questao q8 = new Questao();
        q8.pergunta = "Quem escreveu 'Dom Quixote'?";
        q8.opcaoA = "A) Miguel de Cervantes";
        q8.opcaoB = "B) Gabriel García Márquez";
        q8.opcaoC = "C) Pablo Neruda";
        q8.opcaoD = "D) Jorge Luis Borges";
        q8.opcaoE = "E) Fernando Pessoa";
        q8.correta = "A";
        questoes[7] = q8;

        // Questão 9
        Questao q9 = new Questao();
        q9.pergunta = "Qual é o rio mais longo do mundo?";
        q9.opcaoA = "A) Amazonas";
        q9.opcaoB = "B) Nilo";
        q9.opcaoC = "C) Yangtzé";
        q9.opcaoD = "D) Mississipi";
        q9.opcaoE = "E) Danúbio";
        q9.correta = "A";
        questoes[8] = q9;

        // Questão 10
        Questao q10 = new Questao();
        q10.pergunta = "Em que país nasceu Adolf Hitler?";
        q10.opcaoA = "A) Alemanha";
        q10.opcaoB = "B) Áustria";
        q10.opcaoC = "C) Polônia";
        q10.opcaoD = "D) França";
        q10.opcaoE = "E) Suíça";
        q10.correta = "B";
        questoes[9] = q10;

        // Questão 11
        Questao q11 = new Questao();
        q11.pergunta = "Qual é o nome do processo de divisão celular?";
        q11.opcaoA = "A) Fotossíntese";
        q11.opcaoB = "B) Mitose";
        q11.opcaoC = "C) Respiração";
        q11.opcaoD = "D) Digestão";
        q11.opcaoE = "E) Osmose";
        q11.correta = "B";
        questoes[10] = q11;

        // Questão 12
        Questao q12 = new Questao();
        q12.pergunta = "Qual destes não é um sistema operacional?";
        q12.opcaoA = "A) Windows";
        q12.opcaoB = "B) Linux";
        q12.opcaoC = "C) macOS";
        q12.opcaoD = "D) Android";
        q12.opcaoE = "E) Google Chrome";
        q12.correta = "E";
        questoes[11] = q12;

        // Questão 13
        Questao q13 = new Questao();
        q13.pergunta = "Quantos elementos químicos a tabela periódica possui?";
        q13.opcaoA = "A) 108";
        q13.opcaoB = "B) 118";
        q13.opcaoC = "C) 92";
        q13.opcaoD = "D) 120";
        q13.opcaoE = "E) 126";
        q13.correta = "B";
        questoes[12] = q13;

        // Questão 14
        Questao q14 = new Questao();
        q14.pergunta = "Qual é o animal mais rápido do mundo?";
        q14.opcaoA = "A) Guepardo";
        q14.opcaoB = "B) Falcão-peregrino";
        q14.opcaoC = "C) Peixe-vela";
        q14.opcaoD = "D) Libélula";
        q14.opcaoE = "E) Antílope";
        q14.correta = "B";
        questoes[13] = q14;

        // Questão 15
        Questao q15 = new Questao();
        q15.pergunta = "Qual destes países não faz parte da União Europeia?";
        q15.opcaoA = "A) Suíça";
        q15.opcaoB = "B) França";
        q15.opcaoC = "C) Alemanha";
        q15.opcaoD = "D) Itália";
        q15.opcaoE = "E) Espanha";
        q15.correta = "A";
        questoes[14] = q15;

        return questoes;
    }

    private static void exibirResultado(int acertos, int totalQuestoes) {
        System.out.println("\n========== RESULTADO FINAL ==========");
        System.out.println("Você acertou " + acertos + " de " + totalQuestoes + " perguntas.");

        double percentual = ((double) acertos / totalQuestoes) * 100;
        System.out.printf("Porcentagem de acertos: %.2f%%\n", percentual);

        if (percentual >= 80) {
            System.out.println("Excelente desempenho! Você é um expert!");
        } else if (percentual >= 60) {
            System.out.println("Bom desempenho! Você sabe bastante!");
        } else if (percentual >= 40) {
            System.out.println("Desempenho regular! Pode melhorar!");
        } else {
            System.out.println("Você precisa estudar mais! Não desista!");
        }
    }
}
