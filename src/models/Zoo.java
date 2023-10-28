package models;

public class Zoo {
    private String name;
    private AnimalRoom[] animalRooms;
    private Department[] departments;

    public Zoo(String name, AnimalRoom[] animalRooms, Department[] departments){
        this.name = name;
        this.animalRooms = animalRooms;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalRoom[] getAnimalRooms() {
        return animalRooms;
    }

    public void setAnimalRooms(AnimalRoom[] animalRooms) {
        this.animalRooms = animalRooms;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }
}
