import java.util.Scanner;

public class App {

    public static void limparTela() {
        System.out.println("\n\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtddAlunos;
        System.out.println("Digite quantos alunos você quer registrar: ");
        qtddAlunos = scanner.nextInt();
        scanner.nextLine();

        Aluno[] alunos = new Aluno[qtddAlunos];

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = criarAluno(scanner);
            alunos[i] = aluno;
            limparTela();
        }

        for (Aluno aluno : alunos) {
            aluno.getInformacoes();
        }
    }

    public static Aluno criarAluno(Scanner scanner) {
        String nome, curso, rua, bairro, cidade, estado;
        int semestre, sala, cep;
        double[] notas = new double[6];

        System.out.println("Qual o seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite o seu semestre: ");
        semestre = scanner.nextInt();
        System.out.println("Digite o número da sua sala: ");
        sala = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o seu curso: ");
        curso = scanner.nextLine();

        for (int j = 0; j < notas.length; j++) {
            System.out.printf("Digite a nota %d\n", j + 1);
            notas[j] = scanner.nextDouble();
        }
        scanner.nextLine();
        System.out.println("Digite a rua que você mora: ");
        rua = scanner.nextLine();
        System.out.println("Digite o seu bairro: ");
        bairro = scanner.nextLine();
        System.out.println("Digite a sua cidade: ");
        cidade = scanner.nextLine();
        System.out.println("Digite o seu estado: ");
        estado = scanner.nextLine();
        System.out.println("Digite o seu cep ");
        cep = scanner.nextInt();
        scanner.nextLine();
        Endereco endereco = new Endereco(rua, bairro, cidade, estado, cep);
        Aluno aluno = new Aluno(nome, semestre, sala, curso, endereco);
        aluno.setNotas(notas); // Define as notas do aluno
        return aluno;
    }
}