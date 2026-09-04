class TestAnimal {
    public static void main(String[] args) {
    Perro miPerro = new Perro();
    Gato miGato = new Gato();
    miPerro.setNombre("Venus");
    miGato.setNombre("Tofu");
    miPerro.ladrar();
    miGato.maullar();
    miPerro.comer();
    miGato.comer();
    }
}
abstract class Animal {
    protected String nombre;
    public void comer() {
        System.out.println(this.nombre + " está comiendo");
    }
    public void setNombre(String nom) { this.nombre = nom; }
    public String getNombre() { return this.nombre;}
}
interface Mascota {
    void serCarinoso();
}
class Perro extends Animal implements Mascota{
    @Override
    public void comer() {
        super.comer();
        System.out.println(" CARNE");
    }
    public void ladrar() { System.out.println(this.nombre + " está ladrando");}
}
class Gato extends Animal {
    public void maullar() { System.out.println(this.nombre + " está maullando");}
}
