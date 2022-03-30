public class CarMain {
    public static void main(String[] args) {
        Car oldJunker = new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8); 
        oldJunker.drive(5); 
        oldJunker.fillTank(1); 
        System.out.println(oldJunker.getFuelRemaining()); 
        System.out.println(oldJunker.toString()); 
    }
}
