package cuentaletras;
import java.util.Scanner;
//comentario proyecto 2
public class principal {
	public static void main(String[] args){
		principal monster = new principal();
		monster.inicio();
	}

	public void inicio(){
		int[] caracteres = new int[52];
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
			if (letra >= 'A' && letra <= 'Z'){
				abc[26 + (letra - 'A')]++;
			}
                        if (letra >= '0' && letra <= '9'){
				System.out.println("el caracter "+ letra + " es un numero ");
			}
		}
	}

	public void mresultado(int[] abc){
		for (int i = 0;i < abc.length;i++){
			char letra = (i < 26) ? (char) (i+'a') : (char) (i-26+'A');
			if (abc[i] > 1 ){
				System.out.println("la letra "+ letra + " sale " + abc[i]+" veces");
			}if (abc[i] == 1 ){
				System.out.println("la letra "+ letra + " sale " + abc[i]+" vez");
			}
		}
	}
}
