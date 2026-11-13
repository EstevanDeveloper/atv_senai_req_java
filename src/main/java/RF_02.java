import java.util.Scanner;

//EXIBIÇÃO DO STATUS DO ROBO
void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = input.nextLine();

    int opcao;
    do {


        System.out.println("""
                =========================)
                
                
                                                 MENU DE OPÇÕES\n
                                                 14:34:87\n
                
                                                                                 [===]\n
                                                                                ( o o )\n
                                                                              --{  ^  }--\n
                                                                                /  |  \\  \n
                                1 - Status                                     /___|___\\   \n
                                2 - Operação robo                                 [|]  \n
                                3 - Quantiade de peças                           / | \\    \n
                                4 - Video/straming                              /  |  \\ \n                  
                                5 - Notificações                               /   |   \\  \n
                                6 - Perfil do usuário                             / \\    \n
                                7 - Painel de LOGS                               /   \\   \n
                                8 - PARADA DE MERGÊNCIA                         /     \\    \n
                                9+ - Sair
                                ======================================""");

        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("""
                        ================================
                                MENU ESTATÍSTICO
                        
                         Comunicação com o sistema: Online
                         Templo de ciclo: 4,2s
                         Taxa de acerto da separação por cor: 98.5%
                         Eficiência global: 85%
                         Programa de operação do robo: Habilitado
                         Célula robótica: Online
                        ================================
                        """);
                System.out.print("Pressione ENTER para voltar ao menu...");
                input.nextLine();
                opcao = 0;
                break;

            case 2:
                System.out.println("""
                        =================================
                             VISUALIZAÇÃO DA OPERAÇÃO
                             Programa de operação do robo: Habilitado
                        
                             Estado atual: Rampa 3 em execução
                        =================================
                        """);
                break;

            case 3:
                System.out.println("""
                        ===============================
                             QUANTIADADE DE PEÇAS
                             
                             Peças totais em estoque: 1.257
                             Peças Azuis: 460
                             peças vermelhas:440
                             peças pretas:125
                             Peças amarelas: 128
                             Peças processadas: 1.234
                             
                        ===============================
                        """);
                break;

            case 4:
                System.out.println("""
                        ==============================================
                                [===]              /--\\               [===]  \n
                               ( o o )            |====|             ( o o )   \n
                             --{  ^  }--        --|====|--         --{  ^  }--   \n
                               /  |  \\           /====/            /  |  \\    \n
                              /___|___\\          /    \\           /___|___\\    \n
                                 [|]            /       \\            [|]    \n
                                / | \\          /        \\           / | \\    \n
                               /  |  \\        |   [==]   |         /  |   \\     \n
                              /   |   \\       |   [==]   |        /   |    \\     \n
                                 / \\           \\        /            / \\     \n
                                /   \\           \\______/            /   \\    \n
                               /     \\         ~~~~~~~~~~~~         /     \\ \n
                          --------------------------------------------------------   \n
                             [📦] ======= [⚙️] ======= [🤖 BRAPO] ======= [📦]  \n
                          --------------------------------------------------------   \n
                        ==============================================  
                        
                        """);
                System.out.print("VOLTAR(ENTER)");
                input.nextLine();
                opcao = 0;
                break;

            case 5:
                System.out.println("""
                        """);

                System.out.print("VOLTAR(ENTER)");
                input.nextLine();
                opcao = 0;
                break;

            case 6:
                System.out.println("User: "+ nome);
                System.out.print("Função: Tester");

                System.out.print("VOLTAR(ENTER)");
                input.nextLine();
                opcao = 0;
                break;

            case 7:
                System.out.print("""
                        ==================================            
                          Aqui está a lista de logs com 20 itens simulando a produção de peças coloridas na esteira: \n
                         \n
                          ```text  \n
                          [LOG_001] 2026-11-12 16:27:01 - Peça produzida: [Quadrado Azul] - Qualidade: OK  \n
                          [LOG_002] 2026-11-12 16:27:15 - Peça produzida: [Quadrado Vermelho] - Qualidade: OK  \n
                          [LOG_003] 2026-11-12 16:27:30 - Peça produzida: [Quadrado Amarelo] - Qualidade: OK  \n
                          [LOG_004] 2026-11-12 16:27:44 - Peça produzida: [Quadrado Verde] - Qualidade: OK  \n
                          [LOG_005] 2026-11-12 16:28:02 - Peça produzida: [Quadrado Azul] - Qualidade: OK  \n
                          [LOG_006] 2026-11-12 16:28:19 - Peça produzida: [Quadrado Vermelho] - Qualidade: Alerta leve (revisada)  \n
                          [LOG_007] 2026-11-12 16:28:35 - Peça produzida: [Quadrado Amarelo] - Qualidade: OK  \n
                          [LOG_008] 2026-11-12 16:28:50 - Peça produzida: [Quadrado Verde] - Qualidade: OK  \n
                          [LOG_009] 2026-11-12 16:29:12 - Peça produzida: [Quadrado Azul] - Qualidade: OK  \n
                          [LOG_010] 2026-11-12 16:29:28 - Peça produzida: [Quadrado Vermelho] - Qualidade: OK  \n
                          [LOG_011] 2026-11-12 16:29:45 - Peça produzida: [Quadrado Amarelo] - Qualidade: OK  \n
                          [LOG_012] 2026-11-12 16:30:01 - Peça produzida: [Quadrado Verde] - Qualidade: OK  \n
                          [LOG_013] 2026-11-12 16:30:18 - Peça produzida: [Quadrado Azul] - Qualidade: OK  \n
                          [LOG_014] 2026-11-12 16:30:33 - Peça produzida: [Quadrado Vermelho] - Qualidade: OK  \n
                          [LOG_015] 2026-11-12 16:30:50 - Peça produzida: [Quadrado Amarelo] - Qualidade: Alerta leve (revisada)  \n
                          [LOG_016] 2026-11-12 16:31:05 - Peça produzida: [Quadrado Verde] - Qualidade: OK  \n
                          [LOG_017] 2026-11-12 16:31:22 - Peça produzida: [Quadrado Azul] - Qualidade: OK  \n
                          [LOG_018] 2026-11-12 16:31:39 - Peça produzida: [Quadrado Vermelho] - Qualidade: OK  \n
                          [LOG_019] 2026-11-12 16:31:54 - Peça produzida: [Quadrado Amarelo] - Qualidade: OK  \n
                          [LOG_020] 2026-11-12 16:32:10 - Peça produzida: [Quadrado Verde] - Qualidade: OK  \n
                         
                          ```  
                        ==================================            
                        """);

                System.out.print("VOLTAR(ENTER)");
                input.nextLine();
                opcao = 0;
                break;


            case 8:
                System.out.print("""
                        ===============================
                              PARANDO OPERAÇÃO...  
                        ===============================
                        
                        """);
                break;
            default:

                break;
        }
    } while (opcao < 9);

    System.out.print("""
            
            ====================================
                   ENCERRANDO PROGRAMA
            ====================================
            
            """);

}
