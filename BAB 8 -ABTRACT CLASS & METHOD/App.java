package tugas;

public class App {
  public static void main(String[] args) {
  
    // todopublic class App {     

  // todo...       
  Owner owner1 = new Owner("Rahmat"); Car car1 = new Car(owner1, "Honda Mobilio", 2022, 6500);
  car1.printInfo();
  
  Owner owner2 = new Owner("Steven ");Car car2 = new Car(owner2, "Panther Touring", 1972, 6000);
  car2.printInfo();
  
  Owner owner3 = new Owner("Addin"); Car car3 = new Car(owner3, "BMW 520i", 1967, 10500); 
  car3.printInfo();
  
  Owner owner4 = new Owner("Indra"); Car car4 = new Car(owner4, "Mercedes Benz 220", 1958, 5500); 
  car4.printInfo();
  
  }
  }

