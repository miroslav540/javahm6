class Product {

        public int count;
        public String name;
        public double price;
        
    
        public Product(int count, String name, double price) {
            this.count = count;
            this.name = name;
            this.price = price;
        }
        @Override
        public String toString() {
            return "Количесвто: " + count + " Имя: " + name + " Цена: " + price;
        }
    }
    public class storage {
        public static void main(String[] args) {
            Product product = new Product(2,"Tuti-Fruti", 89.99);
            System.out.println(product);
        }
    
    }