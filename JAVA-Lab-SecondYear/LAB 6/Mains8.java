/*
8. Design a factory simulation where the superclass `Factory` has a method `produceProduct()` 
returning a `Product` object.
Subclass `ElectronicsFactory` overrides this method to return an `ElectronicProduct`.
Use covariant return types and dynamic method dispatch to demonstrate runtime behavior.
 */
class Mains8 {
    public static void main(String[] args) {
        Factory fac1 = new Factory();
        Factory fac2 = new ElectronicsFactory();

        System.out.println(fac1.produceProduct().s); 
        System.out.println(fac2.produceProduct().s);
    }
}
class Factory{
    Product produceProduct(){
        return new Product();
    }
}
class Product{
    String s = "A dummy product";
}
class ElectronicProduct extends Product{
    ElectronicProduct() {
        s = "An electronic product";
    }
}
class ElectronicsFactory extends Factory{
    Product produceProduct(){
        return new ElectronicProduct();
    }
}