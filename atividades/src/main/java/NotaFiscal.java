import java.util.List;

public class NotaFiscal {
    private List<Produto> vendidos;

    public void adicionarProduto(Produto produto){
        this.produto = new ArraysList<>();



    }
    public void removerProdutos(String codigo){
        for (Produto produto: vendidos )
            if (produto.equals(codigo)){
                System.out.println("Produto removido!");

            }else{
                System.out.println("Produto não encotrado!");

            }
        public void calcularValorProduto(double precoUnitario, int quantidade){
            precoUnitario * quantidade;
            return precoUnitario;
        }
		public calcularValorNotaFiscal(List<Produto> vendidos){
            this.vendidos = vendidos;
        }

    }

}
