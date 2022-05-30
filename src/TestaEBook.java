
public class TestaEBook {

	public static void main(String[] args) {
		EBook ebook = new EBook();
		ebook.autor = "Emilly";
		ebook.categoria = "Comédia";
		ebook.titulo = "Emilly e Vitória";
		ebook.valor = 20.00;
		
		ebook.AplicarDesconto();
		System.out.println("Autor: " + ebook.autor + " Categoria: " + ebook.categoria + " Título: " + ebook.titulo + " Valor: " + ebook.valor);
	}
}
