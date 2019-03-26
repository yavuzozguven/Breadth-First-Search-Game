package prolab21;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;


public class Karakter{
    private String ad;
    private int tur_sayisi;
    private int x;
    private int y;
    private int can_sayisi;
    BufferedImage bi = null;

    public Karakter(String ad,int tur_sayisi){
        this.tur_sayisi = tur_sayisi;
        this.ad = ad;
    }
    
    public Karakter(){
        
    }
  
    public String getAd() {
        return ad;
    }

    
    public void setAd(String ad) {
        this.ad = ad;
    }

    
    public int getTur_sayisi() {
        return tur_sayisi;
    }

    
    public void setTur_sayisi(int tur_sayisi) {
        this.tur_sayisi = tur_sayisi;
    }

    
    public int getX() {
        return x;
    }

    
    public void setX(int x) {
        this.x = x;
    }

    
    public int getY() {
        return y;
    }

    
    public void setY(int y) {
        this.y = y;
    }
    
    public Image getImage(){
        return bi;
    }
    
    public ArrayList EnKisaYol(int mat[][],int i,int j,int x,int y){
        return new ArrayList();
    }

    
    public int getCan_sayisi() {
        return can_sayisi;
    }

    
    public void setCan_sayisi(int can_sayisi) {
        this.can_sayisi = can_sayisi;
    }
   
}
