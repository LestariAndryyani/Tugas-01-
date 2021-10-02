package no1;

class Barang{
    private String idProduk;
    private String nama;
    private double harga;

    public Barang(String idProduk, String nama, double harga){
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }
    public Barang(String idProduk, String nama){
        this.idProduk = idProduk;
        this.nama = nama;
    }
    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return nama;
    }
    void setHarga(double harga){
        this.harga = harga;
    }
    double getHarga(){
        return harga;
    }
    String getIdProduk(){
        return idProduk;
    }

}

public class Main {
    public static void main(String[] args) {
        Barang Brg1 = new Barang("BRG-001", "Tas Gucci");
        Brg1.setHarga(1200);
        System.out.println("Barang 1 = "+Brg1.getIdProduk()+" " +Brg1.getNama()+ " " + Brg1.getHarga());

        Barang Brg2 = new Barang("BRG-002", "Printer Epson L355");
        Brg2.setHarga(200);
        System.out.println("Barang 2 = "+Brg2.getIdProduk()+" " +Brg2.getNama()+ " " + Brg2.getHarga());

        Barang Brg3 = new Barang("BRG-003", "Koper", 150);
        System.out.println("Barang 3 = "+Brg3.getIdProduk()+" " +Brg3.getNama()+ " " + Brg3.getHarga());

        Barang Brg4 = new Barang("BRG-004", "Helm", 20);
        System.out.println("Barang 4 = "+Brg4.getIdProduk()+" " +Brg4.getNama()+ " " + Brg4.getHarga());

        System.out.println("Total Harga dari BRG-001, BRG-003, BRG-004 =");
        System.out.println(Brg1.getHarga() + Brg3.getHarga() + Brg4.getHarga());
    }
}
