
public class TestaLivroFisico {

	public static void main(String[] args) {
		
		LivroFisico livrof = new LivroFisico();
		livrof.autor = "Vitória";
		livrof.categoria = "Romance";
		livrof.titulo = "Vitória e Emilly";
		livrof.valor = 200.00;
		
		livrof.AplicarDesconto();
		System.out.println("Autor: " + livrof.autor + "\nCategoria: " + livrof.categoria + " Título: " + livrof.titulo + "\nValor: " + livrof.valor);
	}
}

