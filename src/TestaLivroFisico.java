
public class TestaLivroFisico {

	public static void main(String[] args) {
		
		LivroFisico livrof = new LivroFisico();
		livrof.autor = "Vit�ria";
		livrof.categoria = "Romance";
		livrof.titulo = "Vit�ria e Emilly";
		livrof.valor = 200.00;
		
		livrof.AplicarDesconto();
		System.out.println("Autor: " + livrof.autor + "\nCategoria: " + livrof.categoria + " T�tulo: " + livrof.titulo + "\nValor: " + livrof.valor);
	}
}

