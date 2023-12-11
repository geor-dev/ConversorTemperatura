import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Object>Lista = new ArrayList<>();


        Scanner out = new Scanner(System.in);

        System.out.println("Digite a escala da Temperatura a ser convertida");

        float temperatura = out.nextFloat();

        Lista.add(temperatura);

        out.nextLine();

        System.out.println("Digite o tipo da escala do numero que voce digitou(caixa alta) \nF-fahrenheit \nC-celsius \nK-kelvin  ");
        String tipo = out.nextLine();

        Lista.add(tipo);

        System.out.println("Digite para qual escala sera convertida  \n1-celsius \n2-fahrenheit\n3-kelvin");
        int escolha = out.nextInt();

        switch(escolha){
            case 1:
                if((!Lista.get(1).equals("C")) && (Lista.get(1).equals("F"))){
                    double resultado;
                    resultado = (temperatura - 32.0)*(5.0/9.0);
                    System.out.printf("Em fahrenheit vale: %.2f ", resultado );

                }else if(Lista.get(1).equals("K")){
                    double resultado;
                    resultado = temperatura-273;
                    System.out.printf("Em Kelvin vale: %.2f",resultado);
                }else{
                    System.out.println("O valor ja esta na escala solicitada");
                }
                break;
            case 2:
                if((!Lista.get(1).equals("F")) && (Lista.get(1).equals("C"))){
                    double resultado;
                    resultado = temperatura*(9.0/5.0)+32;
                    System.out.printf("Em Celsius vale: %.2f",resultado);

                }else if(Lista.get(1).equals("K")){
                    double resultado;
                    resultado = (temperatura-273)*1.8 + 32;
                    System.out.printf("Em Kelvin vale: %.2f",resultado);
                }else {
                    System.out.println("O valor ja esta na escala solicitada");
                }

                break;

            case 3:
                if((!Lista.get(1).equals("K")) && (Lista.get(1).equals("C"))){
                    double resultado;
                    resultado = temperatura+273;
                    System.out.printf("O valor em Celsius vale: %.2f",resultado);

                }else if(Lista.get(1).equals("F")){
                    double resultado;
                    resultado = (temperatura-32)*(5.0/9.0) + 273;
                    System.out.printf("O valor em Fahrenheit vale: %.2f",resultado);
                }else{
                    System.out.println("O valor ja está na escala solicitada");

                }
                break;

            default:
                System.out.println("conversão não efetuada");
            }
        }

    }
