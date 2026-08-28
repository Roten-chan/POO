public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal("Max", 3);
        perro.setEdad(-4);
        System.out.println("La edad es " + perro.getEdad() + " años.");
    }
}