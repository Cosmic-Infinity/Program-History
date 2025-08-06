/*
5. **Interface with Constants:**
Create an interface `Taxable` with a constant `TAX_RATE = 0.1`.
Then, create a class `Product` that implements `Taxable` and calculates the price after tax.
 Demonstrate how interfaces can hold constants and how they are accessed in implementing classes.
*/

class Mains5{
    public static void main(String[] args){
        Product p1 = new Product(100);
        Product p2 = new Product(1000);
        Product p3 = new Product(10000);
        System.out.println("Price after tax = "+p1.calculate());
        System.out.println("Price after tax = "+p2.calculate());
        System.out.println("Price after tax = "+p3.calculate());
    }
}
interface Taxable{
    final float TAX_RATE = 0.1f;
}
class Product implements Taxable{
    float price;
    Product(float p){price = p;}
    float calculate(){
        return ((1+TAX_RATE)*price);
    }
}