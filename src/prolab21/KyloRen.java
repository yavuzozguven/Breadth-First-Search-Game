package prolab21;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.imageio.ImageIO;


public class KyloRen extends Karakter {
    BufferedImage bi = null;
    
    public KyloRen(String ad,int tur_sayisi){
        super(ad,tur_sayisi);
    }
    
    public KyloRen(){
        
    }
    
    public void setImage(){
        try {
            bi = ImageIO.read(new File("C:\\Users\\Yavuz\\Desktop\\kylo_ren.png"));
        } catch (IOException ex) {
            System.out.println("Görsel bulunamadı.");
        }
    }
    
    public Image getImage(){
        return bi;
    }
    
    @Override
    public ArrayList EnKisaYol(int mat[][],int i,int j,int x,int y){
        ArrayList<Dugum> path = new ArrayList();
        Dugum dg = yolBFS(mat,i,j);
        path.add(dg);
        while(dg.getParent() != null){
            dg = dg.getParent();
            path.add(dg);
        }
        if(this.getTur_sayisi()!=0 && path.size()>=3){
            this.setX(path.get(path.size()-3).y);
            this.setY(path.get(path.size()-3).x);
            }
        if(this.getTur_sayisi()!=0 && path.size()<3){
            /*this.setX(path.get(path.size()).y);
            this.setY(path.get(path.size()).x);*/
        }
        return path;
    }
   
    public static class Dugum {
        int x;
        int y;
        Dugum parent;

        public Dugum(int x, int y,Dugum parent) {
            this.x = x;
            this.y = y;
            this.parent = parent;
        }

        public Dugum getParent() {
            return this.parent;
        }

        public String toString() {
            return  y+"+"+x;
        }
  }
    
    public static Queue<Dugum> q;

    public static Dugum yolBFS(int[][] maze,int x, int y) {

        q = new LinkedList<Dugum>();
        q.add(new Dugum(x,y, null));

        while(!q.isEmpty()) {
            Dugum p = q.remove();

            if (maze[p.x][p.y] == 9) {
                return p;
            }

            if(gecerli(maze,p.x+1,p.y)) {
                maze[p.x][p.y] = -1;
                Dugum nextP = new Dugum(p.x+1,p.y, p);
                q.add(nextP);
            }

            if(gecerli(maze,p.x-1,p.y)) {
                maze[p.x][p.y] = -1;
                Dugum nextP = new Dugum(p.x-1,p.y, p);
                q.add(nextP);
            }

            if(gecerli(maze,p.x,p.y+1)) {
                maze[p.x][p.y] = -1;
                Dugum nextP = new Dugum(p.x,p.y+1, p);
                q.add(nextP);
            }

             if(gecerli(maze,p.x,p.y-1)) {
                maze[p.x][p.y] = -1;
                Dugum nextP = new Dugum(p.x,p.y-1, p);
                q.add(nextP);
            }

        }
        return null;
    }

    public static boolean gecerli(int[][] maze,int x, int y) {
        if((x >= 0 && x < maze.length) && (y >= 0 && y < maze[x].length) && (maze[x][y] == 1 || maze[x][y] == 9)) {
            return true;
        }
        return false;
    }

}
