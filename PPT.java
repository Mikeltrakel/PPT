import java.util.Scanner;
import java.util.Random;
public class PPT {

    public static void main(String[] args) {
        
        int empezar;
        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Hola y bienvenido a Piedra Papel o Tijera!");
            System.out.println("Presiona 1 para jugar al juego");
            System.out.println("Presiona 2 para ver el tutorial");
            System.out.println("Presiona 3 para salir del juego");     

            empezar=entrada();

            if (empezar==1) {
                String player;
        String IA;

        System.out.println();
        System.out.println("Comencemos, buena suerte!");
        
        IA = funcionbot();

        System.out.println();
        System.out.println("Eliga 'Piedra' 'Papel' o 'Tijera' ");
        player = playerfunc();
        player.toLowerCase();

        System.out.println(player);

        System.out.println();
        System.out.println("La IA ha elegido: "+IA);
        System.out.println();

        switch (player) {
            case "piedra":
                switch (IA) {
                    case "piedra":
                        System.out.println("Empate!");
                        break;
                    case "papel":
                        System.out.println("Has perdido, vuelve a intentarlo!");
                        break;
                    case "tijera":
                        System.out.println("Felicidades, has ganado!");
                        break;
                    default:
                        break;
                }

                break;

            case "papel":
                switch (IA) {
                    case "piedra":
                        System.out.println("Felicidades, has ganado!");
                        break;
                    case "papel":
                        System.out.println("Empate!");
                        break;
                    case "tijera":
                        System.out.println("Has perdido, vuelve a intentarlo!");
                        break;
                    default:
                        break;
                }

                break;
        
            case "tijera":
                switch (IA) {
                    case "piedra":
                        System.out.println("Has perdido, vuelve a intentarlo!");
                        break;
                    case "papel":
                        System.out.println("Felicidades, has ganado!");
                        break;
                    case "tijera":
                        System.out.println("Empate!");
                        break;
                    default:
                        break;
                }
                
                break;

            default:
                break;
            }

            }else if (empezar==2) {
                System.out.println();
                System.out.println("Cuando empieces a jugar, escribe 'Piedra', 'Papel' o 'Tijera'");
                System.out.println("Una inteligencia artificial seleccionará previamente una función aleatoria");
                System.out.println("Se comprobará quien gana");
                System.out.println("Piedra gana a tijera  //  Papel gana a piedra  //  Tijera gana a papel");

                System.out.println();
                System.out.println("Para volver al menú principal, presiona 'enter'");
                scanner.nextLine();
            }

        } while (empezar!=3);
        System.out.println("Has salido del juego");
    }

    static int entrada() {
        int empezar = 0;
        Scanner scanner = new Scanner(System.in);
        boolean empezarcheck = false;

        while (!empezarcheck) {
            if (scanner.hasNextInt()) {
                empezar = scanner.nextInt();
                if (empezar != 1 && empezar != 2 && empezar != 3) {
                    System.out.println("Por favor, escoja una función de las indicadas");
                } else {
                    empezarcheck = true;

                }
            } else {
                System.out.println("Por favor, escoja una función de las indicadas");
                scanner.nextLine();
            }
        }

        return empezar;
    }

    static String playerfunc() {
        String empezar = "";
        Scanner scanner = new Scanner(System.in);
        boolean empezarcheck = false;
    
        while (!empezarcheck) {
            if (scanner.hasNextLine()) {
                empezar = scanner.nextLine();
                empezar = empezar.toLowerCase();
                if (!empezar.equalsIgnoreCase("papel") && !empezar.equalsIgnoreCase("piedra") && !empezar.equalsIgnoreCase("tijera")) {
                    System.out.println("Por favor, escoja una función de las indicadas");
                } else {
                    empezarcheck = true;
                }
            } else {
                System.out.println("Por favor, escoja una función de las indicadas");
                scanner.nextLine();
            }
        }
        return empezar;
    }

    static String funcionbot() {

        String IA;
        Random random = new Random();
        int nia = random.nextInt(3)+1;

        switch (nia) {
            case 1:
                IA = "piedra";
                break;
            case 2:
                IA = "papel";
                break;
            case 3:
                IA = "tijera";
                break;
            default:
                IA = "Funcion no valida";  
        }
        return IA;
    }

}
