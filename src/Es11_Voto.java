/*
Esercizio 11:
Scrivere un’istruzione switch che utilizzando una variabile di controllo acquisita da una
Scanner converta un voto in lettere nel voto numerico equivalente.
Su una scala di quattro punti:
Si assegni alla variabile voto il valore 4.0 per una A,
3.0 per una B,
2.0 per
una C,
1.0 per una D e
0.0 per una F.
Per qualsiasi altra lettera si assegni il valore 0.0 e
si mostri un messaggio di errore.
 */
import java.util.Scanner;
public class Es11_Voto {
    public static void main(String[] args) {
        Scanner votare= new Scanner(System.in);
        System.out.println("VOTO\n");
        System.out.print("Ingressi un VOTO (A, B, C, D o F): ");
        String voto= votare.nextLine();
        switch(voto){
            case "a":
            case "A":
                System.out.println("Il voto " +voto +" vale 4.0");
                break;
            case "b":
            case "B":
                System.out.println("Il voto " +voto +" vale 3.0");
                break;
            case "c":
            case "C":
                System.out.println("Il voto " +voto +" vale 2.0");
                break;
            case "d":
            case "D":
                System.out.println("Il voto " +voto +" vale 1.0");
                break;
            case "f":
            case "F":
                System.out.println("Il voto " +voto +" vale 0.0");
                break;
        }

    }
}