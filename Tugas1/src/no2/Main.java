package no2;
 class Buku{
    private String judul;
    private String pengarang;
    private double harga;

    public Buku(){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    void setJudul(String judul){
        this.judul = judul;
    }
    void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    void setHarga(double harga){
        this.harga = harga;
    }
    String getJudul(){
        return judul;
    }
    String getPengarang(){
        return pengarang;
    }
    double getHarga(){
        return harga;
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setJudul("Harry Potter");
        buku1.setPengarang("J.K. Rowling");
        buku1.setHarga(300000);

        Buku buku2 = new Buku();
        buku2.setJudul("UML");
        buku2.setPengarang("Ivan Jacobson");
        buku2.setHarga(400000);

        System.out.println("Buku 1 Judul = " +buku1.getJudul()+ "; Pengarang = " + buku1.getPengarang()+ "; Harga = " + buku1.getHarga());
        System.out.println("Buku 2 Judul = " +buku2.getJudul()+ "; Pengarang = " + buku2.getPengarang()+ "; Harga = " + buku2.getHarga());
    }
}
