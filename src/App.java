import java.util.Locale;

//logica de programação
	//**estrutura sequencial tem comandos pre-estabelecido para executar o algaritmo,
	//somente apos o termino do comando

public class App {
    public static void main(String[] args) throws Exception {
    
        int y =32;
		double x =10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.4f%n",x);
		System.out.println("Conteudo com ponto flutuante!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		System.out.println("RESULTADO =" +x+  "METROS");
		System.out.printf("RESULTADO = %.2f, metros%n", x);
		
    }
}
