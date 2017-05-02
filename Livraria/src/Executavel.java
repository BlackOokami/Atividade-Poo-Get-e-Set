import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		//criação de objeto
		Livro Livro1 = new Livro(); 
		//scaner
		Scanner leitor = new Scanner(System.in);
		//preechendo os atributos
		
		System.out.println("Nome do autor: ");
		 Livro1.autor = leitor.next();
		System.out.println("Informe o nome do livro: ");
		 Livro1.nome = leitor.next();
		System.out.println("Informe a Categoria: ");
		 Livro1.setCategoria(leitor.next());
		System.out.println("Dias para devolução:");
		 Livro1.setDiasp(leitor.nextInt()); 
		
		 //Acessando metodo
		 Livro1.taxaporcategoria();
	
		 System.out.println("Nome do Autor: " + Livro1.autor);
		 System.out.println("Nome do livro: " + Livro1.nome);
		 System.out.println("Categoria do Livro: " + Livro1.getCategoria());
		 System.out.println("Dias para devolução: " + Livro1.getDiasp());
		
		 double multa = Livro1.taxaporatraso(Livro1.getDiasp());
		 System.out.println("Sua Multa por atraso foi de: " + multa);
		
		  
		 
		 
		 
		 
	}

}
