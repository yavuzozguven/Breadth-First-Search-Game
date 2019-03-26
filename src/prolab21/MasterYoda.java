package prolab21;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class MasterYoda extends Karakter {
    BufferedImage bi = null;
    
    public MasterYoda(String ad,int tur_sayisi){
        super(ad,tur_sayisi);
    }
    
    public MasterYoda(){
        
    }
    
    public void setImage(){
        try {
            bi = ImageIO.read(new File("C:\\Users\\Yavuz\\Desktop\\master_yoda.png"));
        } catch (IOException ex) {
            System.out.println("Görsel bulunamadı.");
        }
    }
    
    public Image getImage(){
        return bi;
    }
    
}