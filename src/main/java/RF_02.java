import java.util.Scanner;

//EXIBIÇÃO DO STATUS DO ROBO
void main() {
    Scanner input = new Scanner(System.in);


    do {


        System.out.println("""=========================)
                
                
                                 MENU DE OPÇÕES
                                 14:34:87
                
                                                                 [===]
                                                                ( o o )
                                                              --{  ^  }--
                                                                /  |  \\
                1 - Status                                     /___|___\\
                2 - Operação robo                                 [|]
                3 - Quantiade de peças                           / | \\
                4 - Video/straming                              /  |  \\                    
                5 - Notificações                              /   |   \\
                6 - Perfil do usuário                             / \\
                7 - Painel de LOGS                               /   \\
                8 - PARADA DE MERGÊNCIA                         /     \\
                ======================================""");

        int opcao = input.nextInt();

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
                         
                         Peças processadas: 1234
                        
                        ================================
                        """);
                System.out.print("VOLTAR(ENTER)");
                String voltar = input.nextLine();
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
                        """);
                break;

            case 4:
                System.out.println("""
                      ==============================================
                              [===]              /--\\               [===]
                             ( o o )            |====|             ( o o )
                           --{  ^  }--        --|====|--         --{  ^  }--
                             /  |  \\           \\====/            /  |  \\
                            /___|___\\          /    \\           /___|___\\
                               [|]            /      \\             [|]
                              / | \\          /        \\           / | \\
                             /  |  \\        |   [==]   |         /  |  \\
                            /   |   \\       |   [==]   |        /   |   \\
                               / \\           \\        /            / \\
                              /   \\           \\______/            /   \\
                             /     \\         ~~~~~~~~~~~~        /     \\
                        --------------------------------------------------------
                           [📦] ======= [⚙️] ======= [🤖 BRAPO] ======= [📦]
                        --------------------------------------------------------
                      ==============================================  
                        
                        """);
                System.out.print("VOLTAR(ENTER)");
                voltar = input.nextLine();
                opcao = 0;
                break;

            case 5:
                System.out.println("""
                        """);
                break;

            case 6:
                System.out.println("""
                        """);
                break;

            case 7:
                System.out.print("""
                        ==================================            
                                  PARANDO OPERAÇÃO...  
                        ==================================            
                        """);
                break;


            default:

                break;
        }
    } while( opcao = 9 );

    System.out.print("""
            
            ====================================
                   ENCERRANDO PROGRAMA
            ====================================
            
            """);