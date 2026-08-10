public class Veterinaria {
    
    public static void main(String[] args) {
        
        Perro golden_retriever = new Perro();
        Perro akita_americano = new Perro();
        Perro hasuki = new Perro();

        golden_retriever.raza_perro = "Golden Retriever";
        golden_retriever.edad_perro = 14;
        golden_retriever.tamano_perro = 1.3;

        akita_americano.raza_perro = "Akita Americano";
        akita_americano.edad_perro = 4;
        akita_americano.tamano_perro = 1;

        hasuki.raza_perro = "Hasuki";
        hasuki.edad_perro = 2;
        hasuki.tamano_perro = 1.5;

        System.out.println("Bievenidos a la veterinaria");

        System.out.println("Perro de Alberto:");
        System.out.println(golden_retriever.raza_perro);
        System.out.println(golden_retriever.edad_perro);
        System.out.println(golden_retriever.tamano_perro);

        System.out.println("Perro de Franco");
        System.out.println(akita_americano.raza_perro);
        System.out.println(akita_americano.edad_perro);
        System.out.println(akita_americano.tamano_perro);

        System.out.println("Perro Amaro");
        System.out.println(hasuki.raza_perro);
        System.out.println(hasuki.edad_perro);
        System.out.println(hasuki.tamano_perro);

        System.out.println("Acciones de los perros");
        String ladrar_golden = golden_retriever.ladrar();
        System.out.println("El perro de alberto va a ladrar");
        System.out.println(ladrar_golden);

    }
}
