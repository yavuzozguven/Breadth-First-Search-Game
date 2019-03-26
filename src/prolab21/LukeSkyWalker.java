package prolab21;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class LukeSkyWalker extends Karakter {
    BufferedImage bi = null;
    
    
    public LukeSkyWalker(String ad,int tur_sayisi){
        super(ad,tur_sayisi);
    }
    
    public LukeSkyWalker(){
       
    }
    
    public void setImage(){
        try {
            bi = ImageIO.read(new File("C:\\Users\\Yavuz\\Desktop\\luke_skywalker.png"));
        } catch (IOException ex) {
            System.out.println("Görsel bulunamadı.");
        }
    }
    
    public Image getImage(){
        return bi;
    }
    
}
