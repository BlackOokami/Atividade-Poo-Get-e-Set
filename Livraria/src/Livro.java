
public class Livro {
	//atributos
	 String nome;
	public String autor;
	private double taxa;
	private String categoria;
	private int diasp;
	//Construtor
	Livro() {
		
	}
	//metodo
	void taxaporcategoria (){
		if (categoria.equals("Terror")){
			taxa = 5.00;
		
		}else if(categoria.equals("Tecnologia")){
			taxa = 7.00;
		
		}else if(categoria.equals("Aventura")){
			taxa = 15.0;
		
		}else{
			taxa = 20.0;
		}	
	}
	//retorno
	double taxaporatraso(int diasdeatraso) {
		return taxa*diasdeatraso;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getDiasp() {
		return diasp;
	}
	public void setDiasp(int diasp) {
		this.diasp = diasp;
	}
		
}

