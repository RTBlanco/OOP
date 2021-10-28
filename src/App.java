public class App {
    public static void main(String[] args) throws Exception {
        Owner ronny = new Owner("Ronny");
        ronny.pets.add(new Pet("Rosy", ronny));
        ronny.pets.add(new Pet("flash", ronny));
        

        for (Pet i : ronny.pets){
            System.out.println(i.name);
        }
        
    }
}
