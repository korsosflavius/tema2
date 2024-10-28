import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sirul initial: ");
        StringBuilder sir_initial = new StringBuilder(sc.nextLine());
        System.out.println("sirul de inserat: ");
        String sir_inserat = sc.nextLine();
        System.out.println("pozitia( 0- " + sir_initial.length() + " ):");
        int poz= sc.nextInt();
        sir_initial.insert(poz, sir_inserat);
        System.out.println("sirul dupa inserare: " +sir_initial);
        System.out.println("pozitia pt stergere: ");
        int poz_stergere= sc.nextInt();
        System.out.println("numarul de caractere pt stergere: ");
        int nr_caractere= sc.nextInt();
        if(poz_stergere >= 0 && poz_stergere +nr_caractere <= sir_initial.length() ){
            sir_initial.delete(poz_stergere,poz_stergere + nr_caractere);
            System.out.println("sirul dupa stergere: " +sir_initial);
        }
        else
            System.out.println("nu se poate realiza stergerea");
        sc.close();
    }
}