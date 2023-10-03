package nassau.poo.exercicioElevador;

import java.util.Scanner;


public class exercicioElevador {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int numeroAndares=2, capacidadePessoas=2;
        /* System.out.println("Digite o número de andares do predio: ");
        numeroAndares = scanner.nextInt();
        System.out.println("Digite a capacidade de pessoas do elevador: ");
        capacidadePessoas = scanner.nextInt();
 */
        Elevador elevador = new Elevador(capacidadePessoas,numeroAndares);
        elevador.status();
        elevador.subir();
        elevador.subir();
        elevador.status();
        elevador.subir();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        /* elevador.descer();
        elevador.sair(); */

    }
}
