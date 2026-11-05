package Jobsheet9;

public class SmartFridge extends Kulkas implements Audible {
    public int volume;
    public String ukuranLayar;

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
                "\nVolume: " + volume +
                "\nUkuran Layar: " + ukuranLayar;
    }
}
