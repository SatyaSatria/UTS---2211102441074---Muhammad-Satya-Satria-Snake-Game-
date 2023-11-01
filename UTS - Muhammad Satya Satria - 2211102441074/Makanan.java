import greenfoot.*;

public class Makanan extends Actor
{
    public void addedToWorld(World Latar)
    {
        setGambar("coin.png"); // Ganti "nama_file.png" dengan nama file PNG yang ingin Anda gunakan.
    }
    
    private void setGambar(String namaFile)
    {
        GreenfootImage image = new GreenfootImage(namaFile);
        setImage(image);
    }
    
    public void act() 
    {
        // Tambahkan kode tindakan Anda di sini.
    }    
}
