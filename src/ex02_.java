import java.util.Scanner;

    /*Ex02_
    Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
    (considere que as idades dos homens serão sempre diferentes entre si, bem como as das mulheres).
    Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova,
    e o produto das idades do homem mais novo com a mulher mais velha.*/

    public class ex02_ {

        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean validacao = true;
        int idadeHomem2 = 0;
        int idadeMulher2 = 0;
        int homemMaisVelho = 0;
        int homemMaisNovo = 0;
        int mulherMaisVelha = 0;
        int mulherMaisNova = 0;

        // -------- HOMEM --------

        System.out.print("Digita a idade do homem 01: ");
        int idadeHomem1 = scan.nextInt();
        homemMaisVelho = idadeHomem1;

        //verificando se as idades são repetidas...
        while (validacao) {

            System.out.print("Digita a idade do homem 02: ");
            idadeHomem2 = scan.nextInt();

            if (idadeHomem1 == idadeHomem2) {
                System.out.println(" ---------> As idades precisam ser diferentes");
                validacao = true;
            } else {
                validacao = false;
            }
        }

        // -------- MULHER --------

        validacao = true;

        System.out.print("\nDigita a idade da mulher 01: ");
        int idadeMulher1 = scan.nextInt();
        mulherMaisVelha = idadeMulher1;

        //verificando se as idades são repetidas...
        while (validacao) {

            System.out.print("Digita a idade da mulher 02: ");
            idadeMulher2 = scan.nextInt();

            if (idadeMulher1 == idadeMulher2) {
                System.out.println(" ---------> As idades precisam ser diferentes");
                validacao = true;
            } else {
                validacao = false;
            }

        }

        // -------- CALCULANDO --------

        //homem mais novo e mais velho...
        if (idadeHomem2 > homemMaisVelho) {
            homemMaisVelho = idadeHomem2;
            homemMaisNovo = idadeHomem1;
        } else {
            homemMaisVelho = idadeHomem1;
            homemMaisNovo = idadeHomem2;
        }

        //mulher mais nova e mais velha...
        if (idadeMulher2 > mulherMaisVelha) {
            mulherMaisVelha = idadeMulher2;
            mulherMaisNova = idadeMulher1;
        } else {
            mulherMaisVelha = idadeMulher1;
            mulherMaisNova = idadeMulher2;
        }

        int somaDasIdades = homemMaisVelho + mulherMaisNova;
        int produtoDasIdades = homemMaisNovo * mulherMaisVelha;


        //----------------RESPONDENDO

        System.out.println("\n -------------- RESPOSTAS -------------- \n");
        System.out.println("As idades dos homens são " + idadeHomem1 + " e " + idadeHomem2 +" anos." );
        System.out.println("As idades das mulheres são " + idadeMulher1 + " e " + idadeMulher2 +" anos." );

        System.out.println("A soma da idade do homem mais velho com a mulher mais nova é de " + somaDasIdades +" anos." );
        System.out.println("O produto da idade do homem mais novo com a mulher mais velha é de " + produtoDasIdades +" anos." );

    }

}
