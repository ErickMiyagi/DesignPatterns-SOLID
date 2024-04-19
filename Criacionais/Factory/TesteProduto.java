package Factory;

public class TesteProduto {
    public static void main(String[] args) {
        Product produtoFisico =  FactoryProduct.getInstance(ProductType.FISICO);
        Product produtoDigital =  FactoryProduct.getInstance(ProductType.DIGITAL);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);
    }
}
