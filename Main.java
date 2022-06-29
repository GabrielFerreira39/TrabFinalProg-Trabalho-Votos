import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        File arquivoCandidatos = new File("candidatos.txt");
        File arquivoEleitores = new File("eleitores.txt");

        opcoesMenu();
        menu();
    }

    private static void menu() {
        int key = meuScannerDeInt();
        switch (key) {
            case 1:
                iniciarVoto();
                break;

            case 2:
                System.out.println("Opção 2");
                break;

            case 3:
                System.out.println("Opção 3");
                break;

            case 4:
                System.out.println("Opção 4");
                break;

            case 5:
                System.out.println("Opção 5");
                break;

            case 6:
                System.out.println("Opção 6");
                break;

            case 0:
                System.out.println("Opção 0");
                break;

            default:

                break;
        }
    }

    private static void iniciarVoto() {
        System.out.println("1-Registrar novo voto");
        System.out.println("0-Voltar");
        int key = meuScannerDeInt();
        switch (key) {
            case 1:
                registrarNovoVoto();
                break;

            case 0:
                opcoesMenu();
                menu();

                break;

        }
    }

    private static void registrarNovoVoto() {
        System.out.println("Digite seu número de eleitor:");
        int numeroDoEleitor = meuScannerDeInt();
	}

	private static void opcoesMenu() {
        System.out.println("1-Iniciar votação");
        System.out.println("2-Encerrar votação");
        System.out.println("3-Listar eleitores em tela");
        System.out.println("4-Listar eleitores em tela (ordem alfabética)");
        System.out.println("5-Imprimir resultados na tela");
        System.out.println("6-Gerar arquivo com resultados");
        System.out.println("0-Sair");
    }

    private static int meuScannerDeInt() {
        Scanner in = new Scanner(System.in);
        int retornoDeInt = in.nextInt();
        return retornoDeInt;
    }

    private static String meuScannerDeString() {
        Scanner in = new Scanner(System.in);
        String retornoDeString = in.nextLine();
        return retornoDeString;
    }
}
