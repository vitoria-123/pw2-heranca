
public class TestaEBook {

	public static void main(String[] args) {
		EBook ebook = new EBook();
		ebook.autor = "Emilly";
		ebook.categoria = "Com�dia";
		ebook.titulo = "Emilly e Vit�ria";
		ebook.valor = 20.00;
		
		ebook.AplicarDesconto();
		System.out.println("Autor: " + ebook.autor + " Categoria: " + ebook.categoria + " T�tulo: " + ebook.titulo + " Valor: " + ebook.valor);
	}
}
