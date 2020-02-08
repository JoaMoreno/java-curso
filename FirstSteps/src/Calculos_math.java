
public class Calculos_math {

	public static void main(String[] args) {

		double a = 9;
		double raiz = Math.sqrt(a);
		
		System.out.println(raiz);
		
		double num1=5.85;
		/* Refundiciones
		 * el (int) modifica el tipo de dato de Math.round()
		 * que este devuelve un long al utilizar un double*/
		System.out.println((int)Math.round(num1));
		
		double base= 5;
		double exponente = 3;
		
		/* Metodo pow devuelve un double */
		System.out.println((int)Math.pow(base, exponente));
	}

}
