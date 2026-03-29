/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
           int op;
           
           do {
               System.out.println("1 - Exercício 1");
               System.out.println("2 - Exercício 2");
               System.out.println("3 - Exercício 3");
               System.out.println("4 - Exercício 4");
               System.out.println("0 - Sair");
               
               op = sc.nextInt();
               System.out.println("Você escolheu: " + op);
               
               switch(op) {
                   
                   case 1:
                       System.out.println("Exercício 1");
                       System.out.println("+\"\"\"\"\"\"+");
	                	System.out.println("[| o o |]");
	                 	System.out.println(" |  ^  | ");
	                 	System.out.println(" | '-' | ");
	                	System.out.println(" +-----+ ");
	                break;
	                
	                
	                case 2:
	                    System.out.println("Exercício 2");
	                    
	                    // Entrada de dados
        System.out.print("Latitude da coordenada 1: ");
        double x1 = sc.nextDouble();

        System.out.print("Longitude da coordenada 1: ");
        double y1 = sc.nextDouble();

        System.out.print("Latitude da coordenada 2: ");
        double x2 = sc.nextDouble();

        System.out.print("Longitude da coordenada 2: ");
        double y2 = sc.nextDouble();

        // Raio da Terra
        double r = 6371.01;

        // Convertendo para radianos e aplicando a fórmula
        double parte1 = Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2));

        double parte2 = Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                        Math.cos(Math.toRadians(y1 - y2));

        double d = r * Math.acos(parte1 + parte2);

        // Saída
        System.out.println("A distância entre esses pontos é: " + d + " km");
        break;
        
        
                    case 3:
                        System.out.println("Exercício 3");
                        
                        sc.nextLine();
                        
                        System.out.print("Digite um texto: ");
                        String texto = sc.nextLine();

        
                        int letras = 0;
                        int numeros = 0;
                        int espacos = 0;
                        int outros = 0;

                        for (int i = 0; i < texto.length(); i++) {
                        char c = texto.charAt(i);

                         if (Character.isLetter(c)) {
                             letras++;
                         } else if (Character.isDigit(c)) {
                             numeros++;
                         } else if (Character.isWhitespace(c)) {
                             espacos++;
                         } else {
                             outros++;
                         }
                     }

        
                     System.out.println("Letras: " + letras);
                     System.out.println("Números: " + numeros);
                     System.out.println("Espaços: " + espacos);
                     System.out.println("Outros caracteres: " + outros);
                     break;
                
                    case 4:
                        System.out.println("Exercício 4");
                        
                         int tentativa = 1;
                         boolean acertou = false;

                         do {
            
                             System.out.println("Qual estrutura é utilizada para repetição em java?");
                             System.out.println("a) if");
                             System.out.println("b) for");
                             System.out.println("c) case");
                             System.out.println("d) break");
                             System.out.println("e) switch");

                             System.out.print("Resposta: ");
                             char resposta = sc.next().charAt(0);
                             resposta = Character.toLowerCase(resposta);
            
                             switch (resposta) {
                                 case 'b':
                                     System.out.println("Resposta correta");
                                     System.out.println("Você acertou na tentativa " + tentativa);
                                     acertou = true;
                                    break;

                default:
                    System.out.println("Resposta incorreta");
            }

            tentativa++;

        } while (!acertou && tentativa <= 3);

        if (!acertou) {
            System.out.println("Resposta incorreta nas 3 tentativas");
        } 
                break;
                
            case 0:
                System.out.println("Saindo do programa...");
                break;
                    
             default:
                    System.out.println("Opção inválida");

               }
               
           }  while (op != 0);
           
    }
}
        
    