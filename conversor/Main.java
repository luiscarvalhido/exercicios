package conversor;

import java.io.*;

public class Main {

public static void main(String[] args) throws IOException {

    BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

    Conversor conversor = new Conversor();
    int operador;
    double valorParaConversao, resultado=0;
    String resposta = "-";
    
    String titulo = "Escolha o tipo de conversão:\n"
            
    + "1 - Celsius para Fahrenheit.\n"
    + "2 - Celsius para Kelvin.\n"
    + "3 - Fahrenheit para Celsius.\n"
    + "4 - Fahrenheit para Kelvin.\n"
    + "5 - Kelvin para Fahrenheit.\n"
    + "6 - Kelvin para Celsius. \n";

    System.out.println(titulo);

    operador = Integer.parseInt(leitor.readLine());

    System.out.println("Digite o valor a ser convertido:");
    valorParaConversao = Double.parseDouble(leitor.readLine());
    
    switch(operador){
        case 1:
            resultado = conversor.celsiusParaFahrenheit(valorParaConversao);
            resposta = resultado + "Fahrenheits.";
        break;

        case 2:
            resultado = conversor.celsiusParaKelvin(valorParaConversao);
            resposta = resultado + "Kelvins.";
        break;

        case 3:
            resultado = conversor.fahrenheitParaCelsius(valorParaConversao);
            resposta = resultado + "Celcius.";
        break;

        case 4:
            resultado = conversor.fahrenheitParaKelvin(valorParaConversao);
            resposta = resultado + "Kelvin.";
        break;

        case 5:
            resultado = conversor.kelvinParaCelsius(valorParaConversao);
            resposta = resultado + "Celcius.";
        break;

        case 6:
            resultado = conversor.kelvinParaFahrenheit(valorParaConversao);
            resposta = resultado + "Fahrenheit.";
        break;
        
        default:
        System.out.println("Opção inválida!");
        }

    System.out.println("O resultado da conversão é " + resposta);
    }
}
