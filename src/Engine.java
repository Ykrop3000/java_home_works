public class Engine {
    private float volume;
    private int power;
    private String firm;

    public void setVolume(float volume){
        if (volume <= 0){
            System.out.println("Error: volume lower or equal zero");
            return;
        }
        this.volume = volume;
    }
    public void setPower(int power){
        if (power < 0){
            System.out.println("Error: power lower zero");
            return;
        }
        this.power = power;
    }
    public void setFirm(String firm){
        this.firm = firm;
    }

    public float getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

    public String getFirm() {
        return firm;
    }
}
