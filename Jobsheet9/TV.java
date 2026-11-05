package Jobsheet9;

public class TV extends AlatElektronik implements Audible {
    public String jenisLayar;
    public int volume;

    @Override
    public void naikkanVolume() {
        volume++;
        System.out.println("Volume naik menjadi: " + volume);
    }

    @Override
    public void turunkanVolume() {
        volume--;
        System.out.println("Volume turun menjadi: " + volume);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nJenis Layar: " + jenisLayar +
                "\nVolume: " + volume;
    }
}
