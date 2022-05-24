    /*Ex.01_
    Conforme o seguinte algoritmo:

    início

	ler x
	ler y
	z = (x*y) + 5
		se z <= 0 então
			resposta =  ‘A’
		senão
		se z <= 100 então
			resposta = ‘B’
		senão
			resposta = ‘C’
		fim_se
	fim_se
	escrever z, resposta
    fim

    Faça um teste de mesa e complete o quadro a seguir para os seguintes valores:

    +------------------------------+
    |         VARIAVEIS            |
    +------------------------------+
    |  X  |  Y  |  Z  |  RESPOSTA  |
    +------------------------------+
    |  3  |  2  |     |            |
    | 150 |  3  |     |            |
    |  7  | -1  |     |            |
    | -2  |  5  |     |            |
    | 50  |  3  |     |            |
    +------------------------------+
    */

public class ex01_ {

    public static void main(String[] args) {

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|                      VARIAVEIS                        |");
        System.out.println("|+------------------------------------------------------+");
        System.out.println("| PASSO  |  X  |  Y  |          Z           | RESPOSTA  |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("| INíCIO |  -  |  -  |      (x * y) + 5     |     -     |");
        System.out.println("|   1    |  3  |  2  |   (3 * 2) + 5 = 11   | ... B ... |");
        System.out.println("|   2    | 150 |  3  | (150 * 3) + 5 = 455	| ... C ... |");
        System.out.println("|   3    |  7  | -1  |  (7 * (-1)) + 5 = -2	| ... A ... |");
        System.out.println("|   4    | -2  |  5  |  ((-2) * 5) + 5 = -5	| ... A ... |");
        System.out.println("|   5    | 50  |  3  | (50 * 3) + 5 = 155   | ... C ... |");
        System.out.println("|  FIM   |  -  |  -  |           -          |     -     |");
        System.out.println("+-------------------------------------------------------+");

    }

}
