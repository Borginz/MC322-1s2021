package Lab03;

public class AppLab03 {
	public static void main(String args[]) {
		String entrada_str = "080403MCMVM";
		Animacao alegre = new Animacao(entrada_str);
		alegre.apresenta();
		System.out.println(alegre.apresenta());
		alegre.passo();
		System.out.println(alegre.apresenta());
		alegre.passo();
		System.out.println(alegre.apresenta());
		alegre.passo();
		System.out.println(alegre.apresenta());
		alegre.passo();
		System.out.println(alegre.apresenta());
		alegre.passo();
		System.out.println(alegre.apresenta());
		
	}
}
