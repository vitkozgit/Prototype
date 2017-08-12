import prototype.LadaPriora;
import prototype.Moskvich;
import prototype.SportCar;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SportCar car1 = new Moskvich(1,"Москвич");
        SportCar car2 = new LadaPriora(2,"Лада Приора");
    }
}
