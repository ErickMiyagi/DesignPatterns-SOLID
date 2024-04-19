package Factory;

public class FactoryProduct {
    public static Product getInstance(ProductType type){
        switch (type) {
            case FISICO:
                PhysicalProduct physicalProduct = new PhysicalProduct();
                physicalProduct.setPossuiDimensoesFisicas(true);
                return physicalProduct;
            case DIGITAL:
                DigitalProduct digitalProduct = new DigitalProduct();
                digitalProduct.setPossuiDimensoesFisicas(false);
                return digitalProduct;
            default:
                throw new IllegalAccessError("Tipo não reconhecido");
        }
    }
}
