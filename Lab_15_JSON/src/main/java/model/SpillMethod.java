package model;

public class SpillMethod {
    private double vol;
    private String tankMaterial;

    public SpillMethod() {}

    public SpillMethod(double vol, String tankMaterial) {
        this.vol = vol;
        this.tankMaterial = tankMaterial;
    }

    public double getVol() {
        return vol;
    }

    public String getTankMaterial() {
        return tankMaterial;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public void setMaterial(String tankMaterial) {
        this.tankMaterial = tankMaterial;
    }

    @Override
    public String toString() {
        return "SpillMethod{" +
                "vol=" + vol +
                ", material='" + tankMaterial + '\'' +
                '}';
    }
}
