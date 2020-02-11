package ejercicios;

public class Otro_1 {

	public static void main(String[] args) {

		int[] matriz_aleatorios = new int[270];

		for (int i = 0; i < matriz_aleatorios.length; i++) {

			matriz_aleatorios[i] = (int) Math.round(Math.random() * 100);
			
			while(matriz_aleatorios[i]<10 || matriz_aleatorios[i]>= 100) {
				matriz_aleatorios[i] = (int) Math.round(Math.random() * 100);
			}
		}

		int contador = 1;
		for (int numero : matriz_aleatorios) {

			if(contador % 30==0) {
				System.out.println(numero + " ");
			}else {
				System.out.print(numero + " ");
			}
			contador++;
		}

	}

}
