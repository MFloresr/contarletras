package cuentaletras;
//comentario proyecto 2
import java.util.Scanner;
//comentario proyecto 1
public class principal {
	public static void main(String[] args){
		principal monster = new principal();
		monster.inicio();
	}

	public void inicio(){
		int[] caracteres = new int[26];
		Pfrase();
		Contar(caracteres);
		mresultado(caracteres);
	}
	
	public void Pfrase(){
		System.out.println("introduce una frase: ");
	}
	
	public void Contar(int[] abc){
		Scanner lector = new Scanner(System.in);
		String frase = lector.nextLine();
		for (int i =0;i < frase.length(); i++){
			char letra = frase.charAt(i);
			if (letra >= 'a' && letra <= 'z'){
				abc[letra - 'a' ]++;
			}
                        if (letra >= '0' && letra <= '9'){
				System.out.println("la letra "+ (char) (i+'a')+ "es un numero ");
			}
		}
	}
	
	public void mresultado(int[] abc){
		for (int i = 0;i < abc.length;i++){
			if (abc[i] > 1 ){
				System.out.println("la letra "+ (char) (i+'a')+ "sale" + abc[i]+"veces");
			}if (abc[i] == 1 ){
				System.out.println("la letra "+ (char) (i+'a')+ "sale" + abc[i]+"vez");
			}
		}
	}
}
