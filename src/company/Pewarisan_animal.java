package company;

public class Pewarisan_animal {
    public static void main(String[] args) {

        System.out.println("----------------Hewan Karnivora---------------");
        Carnivora animalCarnivor = new Carnivora();
        animalCarnivor.food();
        animalCarnivor.teeth();
        animalCarnivor.identify_myself();
        System.out.println();

        System.out.println("----------------Hewan Herbivora---------------");
        Herbivora animalHerbivora = new Herbivora();
        animalHerbivora.food();
        animalHerbivora.teeth();
        animalHerbivora.identify_myself();
        System.out.println();

        System.out.println("----------------Hewan Omnivora---------------");
        Omnivora animalOmnivora = new Omnivora();
        animalOmnivora.food();
        animalOmnivora.teeth();
        animalOmnivora.identify_myself();
        System.out.println();
    }

}
