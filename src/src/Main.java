import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  Ex4: Telas do console
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println();
        while (true) {
            System.out.println("""
                    Escolha uma opção:
                    1 - Cadastrar paciente
                    2 - Listar pacientes
                    3 - Alterar informações do paciente
                    4 - Mostrar informações do paciente
                    5 - Registrar atividade física para um paciente
                    6 - Remover paciente
                    7 - Sair""");
           
            opcao = Integer.parseInt(scanner.next());

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.println("Cadastrar paciente");
                    telaCadastrarPaciente(scanner);
                    continue;
                case 2:
                    System.out.println();
                    System.out.println("Lista de pacientes");
                    telaListarPacientes();
                    continue;
                case 3:
                    System.out.println();
                    System.out.println("Alterar informações do paciente");
                    telaAlterarPaciente(scanner);
                    continue;
                case 4:
                    System.out.println();
                    System.out.println("Mostrar informações do paciente");
                    telaExibirPaciente(scanner);
                    continue;
                case 5:
                    System.out.println();
                    System.out.println("Registrar atividade física para um paciente");
                    telaRegistrarAtividade(scanner);
                    continue;
                case 6:
                    System.out.println();
                    System.out.println("Remover paciente");
                    telaRemoverPaciente(scanner);
                    continue;
                case 7:
                    System.out.println("Saindo..");
                    break;
                default:
                    continue;
            }
            break; // break referente ao while;
        }
        scanner.close();
    }
    //Ex5: cadastrar um novo paciente
    private static void telaCadastrarPaciente(Scanner scanner) {
        Paciente paciente = new Paciente();
        System.out.println("Insira os dados do paciente:");

        System.out.print("Nome: ");
        paciente.nome = scanner.next();

        System.out.print("Idade: ");
        paciente.idade = Integer.parseInt(scanner.next());

        System.out.print("Peso: ");
        paciente.peso = Double.parseDouble(scanner.next());

        System.out.print("Altura: ");
        paciente.altura = Double.parseDouble(scanner.next());

        System.out.print("Pressão Arterial: ");
        paciente.pressaoArterial = Double.parseDouble(scanner.next());

        System.out.print("Frequência cardíaca: ");
        paciente.frequenciaCardiaca = Integer.parseInt(scanner.next());

        System.out.print("Tipo de dieta alimentar: ");
        paciente.dietaAlimentar = scanner.next();

        ListaPacientes.adicionarPaciente(paciente);
    }

    //Ex6: listar pacientes
    private static void telaListarPacientes() {
        ListaPacientes.listarPacientes();
    }

    private static void telaAlterarPaciente(Scanner scanner) {
        
    }

    private static void telaExibirPaciente(Scanner scanner) {
        
    }

    private static void telaRegistrarAtividade(Scanner scanner) {
        
    }

    private static void telaRemoverPaciente(Scanner scanner) {
        
    }


}
