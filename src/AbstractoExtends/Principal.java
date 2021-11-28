package AbstractoExtends;

public class Principal {

    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro();
        AnimalHervivoro animalHervivoro = new AnimalHervivoro();
        planta.alimentarse();
        animalCarnivoro.alimentarse();
        animalHervivoro.alimentarse();
    }
}
