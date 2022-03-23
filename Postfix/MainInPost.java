import java.util.Scanner;

public class MainInPost {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Prefix converti = new Prefix();
        
        System.out.println("Infix to Postfix converter");
        System.out.print("Masukan Operasi: ");
		System.out.println(converti.infixToPostfix(in.nextLine()));

        in.close();
	}
}
