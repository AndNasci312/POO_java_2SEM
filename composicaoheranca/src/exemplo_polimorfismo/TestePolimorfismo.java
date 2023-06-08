package exemplo_polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		// a ultima classe das classes filhas sempre tem acesso aos demais atributos 
		
		
		TerceiraClasse tc = new TerceiraClasse();
		tc.a = "acesso a";
		tc.b = "acesso b";
		tc.c = "acesso c";
		tc.d = "acesso d";
		tc.e = "acesso e";
		tc.f = "acesso f";
		
		System.out.println(tc.a);
		System.out.println(tc.b);
		System.out.println(tc.c);
		System.out.println(tc.d);
		System.out.println(tc.e);
		System.out.println(tc.f);
		
		// tire os comentarios que voce irá notar uma certa diferença.....
		/*
		SegundaClasse sc = new SegundaClasse();
		sc.a = "acesso a";
		sc.b = "acesso b";
		sc.c = "acesso c";
		sc.d = "acesso d";
		sc.e = "acesso e";
		sc.f = "acesso f";
		
		System.out.println(tc.a);
		System.out.println(tc.b);
		System.out.println(tc.c);
		System.out.println(tc.d);
		System.out.println(tc.e);
		System.out.println(tc.f);
		
		PrimeiraClasse tc = new PrimeiraClasse();
		tc.a = "acesso a";
		tc.b = "acesso b";
		tc.c = "acesso c";
		tc.d = "acesso d";
		tc.e = "acesso e";
		tc.f = "acesso f";
		
		System.out.println(tc.a);
		System.out.println(tc.b);
		System.out.println(tc.c);
		System.out.println(tc.d);
		System.out.println(tc.e);
		System.out.println(tc.f);
		
		*/


	}

}
