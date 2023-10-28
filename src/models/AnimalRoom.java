package models;

public class AnimalRoom {
    private String name;
    private Animal[] animals;
    private int capacity;

    public AnimalRoom(String name, Animal[] animals, int capacity) {
        this.name = name;
        this.animals = animals;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
