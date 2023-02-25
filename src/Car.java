public class Car extends Engine {
    public String model, type;
    public int year;

    public String go(){
        return "I go";
    }

    public String toString(){
        return "Car {" +
                "model = " + this.model +
                ", type = " + this.type +
                ", year = " + this.year +
                ", volume = " + this.getVolume() +
                ", power = " + this.getPower() +
                ", firm = " + this.getFirm() + " }";
    }
}
