//M0521023_Gentur Sahadewa
public class Kubus {
    int sisiKubus = 5;
    public Double hitungVolume() {
        Double volume = 0.0;
        volume = Math.pow(this.sisiKubus, 3);
        return volume;
    }

    public int hitungLuasPermukaan() {
        int luasPermukaan = 0;
        luasPermukaan = 6*(this.sisiKubus*this.sisiKubus);
        return luasPermukaan;   
    }

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        System.out.println("Volume Kubus : "+kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus : "+kubus.hitungLuasPermukaan());
    }
}    
