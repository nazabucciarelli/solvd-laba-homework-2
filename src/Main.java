import models.*;

public class Main {
    public static void main(String[] args) {
        // Instantiating countries
        Country mexico = new Country("Mexico");
        Country argentina = new Country("Argentina");


        // Instantiating genders
        Gender male = new Gender("Male");
        Gender female = new Gender("Female");


        // Instantiating employees for the zoo
        Employee vet = new Employee("30423123","John", "Doe",male,mexico,2019
                                    ,800);
        Employee manager = new Employee("394312940","Alvaro", "Rodriguez",male,
                                        argentina, 2021,1400);
        Employee securityGuard = new Employee("293843212","Karen","Lopez",
                                              female,mexico,2020,1240);
        Employee[] administrationEmployees = {vet,manager,securityGuard};


        // Instantiang a department for the zoo
        Department administrationDepartment =
                new Department("Administration Department",
                                administrationEmployees);
        Department[] zooDepartments = {administrationDepartment};


        // Instantiang feeding for each animal from the zoo
        Feeding insects = new Feeding("Insects");
        Feeding seeds = new Feeding("Seeds");


        // Instantiating natural habitats of the animals
        Habitat wetlands = new Habitat("Wetlands");
        Habitat forest = new Habitat("Forest");


        // Instantiating animal types for the animals
        AnimalType amphibian = new AnimalType("Amphibian");
        AnimalType birds = new AnimalType("Birds");


        // Instantiang animals for the zoo
        Animal axolot = new Animal("Axolot",1.2D,male,wetlands,amphibian,
                insects);
        Animal frog = new Animal("Frog",1,female,wetlands,amphibian,insects);
        Animal parrot = new Animal("Parrot",2.5D,female,forest,birds,seeds);
        Animal pigeon = new Animal("Pigeon",3,male,forest,birds,seeds);
        Animal[] birdsRoomAnimals = {parrot,pigeon};
        Animal[] amphibianRoomAnimals = {axolot,frog};


        // Instantiang a animal rooms for the zoo
        AnimalRoom birdsRoom = new AnimalRoom("Birds Room",birdsRoomAnimals,45);
        AnimalRoom amphibiansRoom = new AnimalRoom("Amphibians Room",
                                    amphibianRoomAnimals,20);
        AnimalRoom[] zooAnimalRooms = {birdsRoom, amphibiansRoom};


        // Instantiang the zoo
        Zoo californiaZoo = new Zoo("California Zoo",zooAnimalRooms,
                                    zooDepartments);
    }
}
