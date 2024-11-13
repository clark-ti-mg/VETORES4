import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer[] v = new Integer[10];
        int uPos = -1;

        while (uPos != v.length) {

            System.out.println("Escolha uma das opções de operação:");
            System.out.println("[A] - Inserir.");
            System.out.println("[B] - Excluir.");
            System.out.println("[C] - Visualizar vetor.");
            String opcao = teclado.next();
            opcao = opcao.toUpperCase();
            switch (opcao) {
                case "A":
                    System.out.println("Escolha onde inserir:");
                    System.out.println("[A] - No início");
                    System.out.println("[B] - No meio");
                    System.out.println("[C] - No final");

                    String opcaoInserir = teclado.next();
                    opcaoInserir = opcaoInserir.toUpperCase();

                    switch (opcaoInserir) {
                        case "A":
                            boolean isDisp = false;
                            for (int i = 0; i < v.length; i++) {
                                if (v[i] == null) {
                                    isDisp = true;
                                    break;
                                }
                            }

                            if (isDisp) {
                                try {
                                    if (v[0] == null) {
                                        System.out.println("Informe o valor que deseja inserir:");
                                        v[0] = teclado.nextInt();
                                        System.out.println("Inclusão no início realizada com sucesso!");
                                    } else {
                                        System.out.println("Início já ocupado.");
                                    }

                                } catch (Exception e) {
                                    System.out.println("Valor inválido. Exceção: " + e.getMessage());
                                }
                            } else {
                                System.out.println("Não há espaço no vetor.");
                            }
                            System.out.println("Inclusão no início realizada com sucesso!");
                            break;
                        case "B":

                            boolean isDisponivel = false;
                            System.out.println("Faixas disponíveis:");

                            int primeiro = -1, ultimo = -1;
                            for (int i = 0; i < v.length; i++) {
                                if (v[i] == null) {
                                    isDisponivel = true;
                                    if (primeiro == -1) {
                                        primeiro = i;
                                    }
                                    ultimo = i;
                                } else {
                                    if (primeiro != -1) {
                                        System.out.println(primeiro + " - " + ultimo);
                                        primeiro = -1;
                                        ultimo = -1;
                                    }
                                }
                            }
                            if (primeiro != -1) {
                                System.out.println(primeiro + " - " + ultimo);
                            }

                            for (int i = 0; i < v.length; i++) {
                                if (v[i] == null) {
                                    if (isDisponivel) {
                                        try {
                                            System.out.println("Informe o valor que deseja inserir:");
                                            v[i] = teclado.nextInt();
                                            System.out.println("Inclusão no meio realizada com sucesso!");
                                        } catch (Exception e) {
                                            System.out.println("Valor inválido. Exceção: " + e.getMessage());
                                        }
                                    } else {
                                        System.out.println("Não há espaço no vetor.");
                                    }

                                }
                            }

                            break;

                        case "C":
                            boolean isDis = false;
                            for (int i = 0; i < v.length; i++) {
                                if (v[i] == null) {
                                    isDisp = true;
                                    break;
                                }
                            }

                            if (isDis) {
                                try {
                                    if (v[v.length - 1] == null) {
                                        System.out.println("Informe o valor que deseja inserir:");
                                        v[v.length - 1] = teclado.nextInt();
                                        System.out.println("Inclusão no final realizada com sucesso!");
                                    } else {
                                        System.out.println("Final já ocupado.");
                                    }

                                } catch (Exception e) {
                                    System.out.println("Valor inválido. Exceção: " + e.getMessage());
                                }
                            } else {
                                System.out.println("Não há espaço no vetor.");
                            }
                            System.out.println("Inclusão no início realizada com sucesso!");
                            break;

                        default:
                            System.out.println("Opção inválida. Tente outra.");
                            break;
                    }

                    break;

                case "B":
                    System.out.println("Escolha de onde deletar:");
                    System.out.println("[A] - Do início");
                    System.out.println("[B] - Do meio");
                    System.out.println("[C] - Do final");

                    String opcaoExcluir = teclado.next();
                    opcaoExcluir = opcaoExcluir.toUpperCase();

                    switch (opcaoExcluir) {
                        case "A":
                            if (v[0] != null) {
                                v[0] = null;
                                System.out.println("Valor removido com sucesso do início.");
                            }
                            break;
                        case "B":
                            System.out.println("Faixas ocupadas:");

                            int primeiro = -1, ultimo = -1;
                            for (int i = 0; i < v.length; i++) {
                                if (v[i] != null) {
                                    if (primeiro == -1) {
                                        primeiro = i;
                                    }
                                    ultimo = i;
                                } else {
                                    if (primeiro != -1) {
                                        System.out.println(primeiro + " - " + ultimo);
                                        primeiro = -1;
                                        ultimo = -1;
                                    }
                                }
                            }
                            if (primeiro != -1) {
                                System.out.println(primeiro + " - " + ultimo);
                            }

                            for (int i = 1; i < v.length - 2; i++) {
                                if (v[i] != null) {
                                    v[i] = null;
                                    System.out.println("Valor removido com sucesso do meio.");
                                    break;
                                }
                            }

                            break;

                        case "C":
                            if (v[v.length - 1] != null) {
                                v[v.length - 1] = null;
                                System.out.println("Valor removido com sucesso do final.");
                            }

                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                    break;

                case "C":
                    for (int i = 0; i < v.length; i++) {
                        System.out.print(v[i] + " ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
