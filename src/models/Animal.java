package models;

public class Animal {
    private String name;
    private double weight;
    private Gender gender;
    private Habitat habitat;
    private AnimalType animalType;
    private Feeding feeding;

    public Animal(String name, double weight, Gender gender, Habitat habitat, AnimalType animalType, Feeding feeding) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.habitat = habitat;
        this.animalType = animalType;
        this.feeding = feeding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public Feeding getFeeding() {
        return feeding;
    }

    public void setFeeding(Feeding feeding) {
        this.feeding = feeding;
    }
}
