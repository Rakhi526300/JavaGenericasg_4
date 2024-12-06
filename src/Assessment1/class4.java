package Assessment1;

public class class4 {


        public static void main(String[] args) {
            // Create and display a Book object
            Book book = new Book("1984", 328, 19.99);
            book.display();

            // Create and display a GameCharacter object
            GameCharacter character = new GameCharacter("Archer", 10, 100.0);
            character.display();

            // Create and display a ProductReview object
            ProductReview review = new ProductReview("Laptop", 5, "Excellent product!");
            review.display();
        }

        static class Book {
            String title;
            int pages;
            double price;

            Book(String title, int pages, double price) {
                this.title = title;
                this.pages = pages;
                this.price = price;
            }

            void display() {
                System.out.println("Book: " + title + ", Pages: " + pages + ", Price: $" + price);
            }
        }

        static class GameCharacter {
            String name;
            int level;
            double health;

            GameCharacter(String name, int level, double health) {
                this.name = name;
                this.level = level;
                this.health = health;
            }

            void display() {
                System.out.println("Character: " + name + ", Level: " + level + ", Health: " + health);
            }
        }

        static class ProductReview {
            String productName;
            int rating;
            String comment;

            ProductReview(String productName, int rating, String comment) {
                this.productName = productName;
                this.rating = rating;
                this.comment = comment;
            }

            void display() {
                System.out.println("Review for: " + productName + ", Rating: " + rating + "/5, Comment: " + comment);
            }
        }
    }

