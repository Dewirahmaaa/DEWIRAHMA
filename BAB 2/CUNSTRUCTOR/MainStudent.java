package PEMLAN;

public class MainStudent {
        public static void main(String[] args) {
         Student anna = new Student();
         anna.setName("Anna");
         anna.setAddress("Malang");
         anna.setAge(20);
         anna.setMath(100);
        anna.setScience(89);
         anna.setEnglish(80);
         anna.displayMessage();
         anna.jumlahObjek();
        
     System.out.println("===================");
     Student chris = new Student("Chris", "Kediri", 21);
     chris.setMath(70);
     chris.setScience(60);
     chris.setEnglish(90);
     chris.displayMessage();
     anna.jumlahObjek();
        
         System.out.println("===================");
         anna = new Student("anna", "Batu", 18);
         anna.displayMessage();
         

         System.out.println("===================");
         chris.setAddress("Surabaya");
         chris.setAge(22);
         chris.displayMessage();
         anna.jumlahObjek();
         }
        }

