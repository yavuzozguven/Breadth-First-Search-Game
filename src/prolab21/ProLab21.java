package prolab21;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ProLab21 extends javax.swing.JFrame{
    public ProLab21() {
        initComponents();
        dosya_Oku();
    }

    int[][] harita2d = new int[11][14];
    Graphics2D gfx;
    ArrayList<Integer> harita;
    ArrayList<Karakter> karakterler;
    int[][] defaultpos = new int[10][2];
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        baslat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tur_sayisi = new javax.swing.JLabel();
        hedef = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(149, 191, 196));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setText("Canlar:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab21/img/tam_can.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab21/img/tam_can.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab21/img/tam_can.png"))); // NOI18N

        baslat.setText("Başlat");
        baslat.setActionCommand("baslat");
        baslat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslatActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab21/img/kupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(hedef)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tur_sayisi)
                                .addGap(217, 217, 217)
                                .addComponent(baslat)))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(59, 59, 59)
                .addComponent(hedef)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baslat)
                    .addComponent(tur_sayisi))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void baslatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslatActionPerformed
        gfx = (Graphics2D)jPanel1.getGraphics();
        
        Color renk = new Color(149,191,196);
        Color harfler = new Color(43,57,144);
        int cnt=0,i=0,j=0;
        while(cnt!=harita.size()){
            if(harita.get(cnt).equals(1)){
                gfx.setColor(renk);
                gfx.fillRect(80+(i*30),80+(j*30), 30, 30);
                gfx.setColor(Color.black);
                if(cnt == 76){
                gfx.setColor(Color.YELLOW);
                gfx.fillRect(80+(i*30),80+(j*30), 30, 30);
                gfx.setColor(Color.black);
                }
            }
            else{
                gfx.setColor(Color.WHITE);
                gfx.fillRect(80+(i*30),80+(j*30), 30, 30);
                gfx.setColor(Color.black);
            }
            gfx.drawString(Integer.toString(harita.get(cnt)), 92+(i*30), 100+(j*30));
            i++;
            if(cnt == 4){
            gfx.setColor(harfler);
            gfx.fillRect(200, 80, 30, 30);
            gfx.setColor(Color.white);
            gfx.drawString("B", 212, 100);
            gfx.setColor(Color.black);
            }
            if(cnt == 12){
            gfx.setColor(harfler);
            gfx.fillRect(440, 80, 30, 30);
            gfx.setColor(Color.white);
            gfx.drawString("C", 452, 100);
            gfx.setColor(Color.black);
            }
            if(cnt == 70){
            gfx.setColor(harfler);
            gfx.fillRect(80, 230, 30, 30);
            gfx.setColor(Color.white);
            gfx.drawString("A", 92, 250);
            gfx.setColor(Color.black);
            }
            if(cnt == 83){
            gfx.setColor(harfler);
            gfx.fillRect(470, 230, 30, 30);
            gfx.setColor(Color.white);
            gfx.drawString("D", 482, 250);
            gfx.setColor(Color.black);
            }
            if(cnt == 144){
            gfx.setColor(harfler);
            gfx.fillRect(200, 380, 30, 30);
            gfx.setColor(Color.white);
            gfx.drawString("E", 212, 400);
            gfx.setColor(Color.black);
            }
            cnt++;
            if(i%14==0){
                i=0;
                j++;
            }
        }
        gfx.setColor(Color.black);
        for (int x = 80; x < 500; x+=30) {
            for (int y = 80; y < 410; y+=30) {
                gfx.drawRect(x, y, 30, 30);
            }
        }
        Object[] options= {
            "Master Yoda",
            "Luke Sky Walker"
        };
        int snc = JOptionPane.showOptionDialog(null,"Hangi iyi karakteri seçmek istersiniz?","Seçim Ekranı",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
        if(snc == 0){
            MasterYoda my = new MasterYoda();
            my.setX(6);
            my.setY(5);
            my.setImage();
            my.setTur_sayisi(0);
            my.setAd("Master Yoda");
            my.setCan_sayisi(11);
            karakterler.add(my);
        }
        if(snc == 1){
            LukeSkyWalker my = new LukeSkyWalker();
            my.setX(6);
            my.setY(5);
            my.setImage();
            my.setTur_sayisi(0);
            my.setAd("Luke Skywalker");
            my.setCan_sayisi(3);
            karakterler.add(my);
        }
        for (int k = 0; k < karakterler.size(); k++) {
            oyuncu_Ciz(karakterler.get(k).getX(),karakterler.get(k).getY(),karakterler.get(k));
        }
        
        //haritayı 2 boyutlu matrise çevirme
        int sayacx=0,sayacy=0;
        for (int k = 0; k < harita.size(); k++) {
            if(sayacy%14 == 0 && sayacy != 0){
                sayacy=0;
                ++sayacx;
            }
            harita2d[sayacx][sayacy] = harita.get(k);
            sayacy++;
        }
        //
        kirmizi_Yol();
        klavye();
        jPanel1.requestFocusInWindow();
    }//GEN-LAST:event_baslatActionPerformed

    public void klavye(){
        
        jPanel1.addKeyListener(new KeyListener() {
            int x = karakterler.get(karakterler.size()-1).getX();
            int y = karakterler.get(karakterler.size()-1).getY();
            @Override
            public void keyTyped(KeyEvent e) {
              
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_SPACE){
                    harita_sifirla();
                    kirmizi_Yol();
                    for (int i = 0; i < karakterler.size(); i++) {
                        oyuncu_Ciz(karakterler.get(i).getX(),karakterler.get(i).getY(),karakterler.get(i));
                    }
                }
                if(e.getKeyCode() == KeyEvent.VK_UP && harita.get((14*(y-1))+x)!=0){
                    y--;
                    karakterler.get(karakterler.size()-1).setY(y);
                    int tur = karakterler.get(karakterler.size()-1).getTur_sayisi();
                    tur++;
                    tur_sayisi.setText(karakterler.get(karakterler.size()-1).getAd()+" Tur Sayısı:"+Integer.toString(tur));
                    karakterler.get(karakterler.size()-1).setTur_sayisi(tur);
                    harita_sifirla();
                    kirmizi_Yol();
                 for (int i = 0; i < karakterler.size()-1; i++) {
                    karakterler.get(i).setTur_sayisi((karakterler.get(i).getTur_sayisi())+1);
                    oyuncu_Ciz(karakterler.get(i).getX(),karakterler.get(i).getY(),karakterler.get(i));
                    if(ulastiMi(karakterler.get(i),karakterler.get(karakterler.size()-1))){
                    karakterler.get(karakterler.size()-1).setCan_sayisi(karakterler.get(karakterler.size()-1).getCan_sayisi()-1);
                    x = karakterler.get(karakterler.size()-1).getX();
                    y = karakterler.get(karakterler.size()-1).getY();
                    }
                } 
                 oyuncu_Ciz(x,y,karakterler.get(karakterler.size()-1));
                 hedefeulastiMi(karakterler.get(karakterler.size()-1));
                }
                if(e.getKeyCode() == KeyEvent.VK_DOWN && harita.get((14*(y+1))+x)!=0){
                    y++;
                    karakterler.get(karakterler.size()-1).setY(y);
                    int tur = karakterler.get(karakterler.size()-1).getTur_sayisi();
                    tur++;
                    tur_sayisi.setText(karakterler.get(karakterler.size()-1).getAd()+" Tur Sayısı:"+Integer.toString(tur));
                    karakterler.get(karakterler.size()-1).setTur_sayisi(tur);
                    harita_sifirla();
                    kirmizi_Yol();
                 for (int i = 0; i < karakterler.size()-1; i++) {
                    karakterler.get(i).setTur_sayisi((karakterler.get(i).getTur_sayisi())+1);
                    oyuncu_Ciz(karakterler.get(i).getX(),karakterler.get(i).getY(),karakterler.get(i));
                    if(ulastiMi(karakterler.get(i),karakterler.get(karakterler.size()-1))){
                    karakterler.get(karakterler.size()-1).setCan_sayisi(karakterler.get(karakterler.size()-1).getCan_sayisi()-1);
                    x = karakterler.get(karakterler.size()-1).getX();
                    y = karakterler.get(karakterler.size()-1).getY();
                    }
                }
                 
                 oyuncu_Ciz(x,y,karakterler.get(karakterler.size()-1));
                 hedefeulastiMi(karakterler.get(karakterler.size()-1));
                }
                if(e.getKeyCode() == KeyEvent.VK_RIGHT && harita.get((14*y)+x+1)!=0){
                    x++;
                    karakterler.get(karakterler.size()-1).setX(x);
                    int tur = karakterler.get(karakterler.size()-1).getTur_sayisi();
                    tur++;
                    tur_sayisi.setText(karakterler.get(karakterler.size()-1).getAd()+" Tur Sayısı:"+Integer.toString(tur));
                    karakterler.get(karakterler.size()-1).setTur_sayisi(tur);
                    harita_sifirla();
                    kirmizi_Yol();
                 for (int i = 0; i < karakterler.size()-1; i++) {
                    karakterler.get(i).setTur_sayisi((karakterler.get(i).getTur_sayisi())+1);
                    oyuncu_Ciz(karakterler.get(i).getX(),karakterler.get(i).getY(),karakterler.get(i));
                    if(ulastiMi(karakterler.get(i),karakterler.get(karakterler.size()-1))){
                    karakterler.get(karakterler.size()-1).setCan_sayisi(karakterler.get(karakterler.size()-1).getCan_sayisi()-1);
                    x = karakterler.get(karakterler.size()-1).getX();
                    y = karakterler.get(karakterler.size()-1).getY();
                    }
                }
                 
                 oyuncu_Ciz(x,y,karakterler.get(karakterler.size()-1));
                 hedefeulastiMi(karakterler.get(karakterler.size()-1));
                }
                if(e.getKeyCode() == KeyEvent.VK_LEFT && harita.get((14*y)+x-1)!=0){
                    x--;
                    karakterler.get(karakterler.size()-1).setX(x);
                    int tur = karakterler.get(karakterler.size()-1).getTur_sayisi();
                    tur++;
                    tur_sayisi.setText(karakterler.get(karakterler.size()-1).getAd()+" Tur Sayısı:"+Integer.toString(tur));
                    karakterler.get(karakterler.size()-1).setTur_sayisi(tur);
                    harita_sifirla();
                    kirmizi_Yol();
                 for (int i = 0; i < karakterler.size()-1; i++) {
                    karakterler.get(i).setTur_sayisi((karakterler.get(i).getTur_sayisi())+1);
                    oyuncu_Ciz(karakterler.get(i).getX(),karakterler.get(i).getY(),karakterler.get(i));
                    if(ulastiMi(karakterler.get(i),karakterler.get(karakterler.size()-1))){
                    karakterler.get(karakterler.size()-1).setCan_sayisi(karakterler.get(karakterler.size()-1).getCan_sayisi()-1);
                    x = karakterler.get(karakterler.size()-1).getX();
                    y = karakterler.get(karakterler.size()-1).getY();
                    }
                }
                 oyuncu_Ciz(x,y,karakterler.get(karakterler.size()-1));
                 hedefeulastiMi(karakterler.get(karakterler.size()-1));
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        jPanel1.setFocusable(true);
        jPanel1.requestFocusInWindow();
    }
    
    public void harita_sifirla(){
        Color renk = new Color(149,191,196);
        Color harfler = new Color(43,57,144);
        int cnt=0,i=0,j=0;
        while(cnt!=harita.size()){
            if(harita.get(cnt).equals(1)){
                gfx.setColor(renk);
                gfx.fillRect(80+(i*30),80+(j*30), 30, 30);
                gfx.setColor(Color.black);
                if(cnt == 76){
                gfx.setColor(Color.YELLOW);
                gfx.fillRect(80+(i*30),80+(j*30), 30, 30);
                gfx.setColor(Color.black);
                }
            }
            else{
                gfx.setColor(Color.WHITE);
                gfx.fillRect(80+(i*30),80+(j*30), 30, 30);
                gfx.setColor(Color.black);
            }
            gfx.drawString(Integer.toString(harita.get(cnt)), 92+(i*30), 100+(j*30));
            i++;
            if(cnt == 4){
            gfx.setColor(harfler);
            gfx.fillRect(200, 80, 30, 30);
            gfx.setColor(Color.white);
            gfx.drawString("B", 212, 100);
            gfx.setColor(Color.black);
            }
            if(cnt == 12){
            gfx.setColor(harfler);
            gfx.fillRect(440, 80, 30, 30);
            gfx.setColor(Color.white);
            gfx.drawString("C", 452, 100);
            gfx.setColor(Color.black);
            }
            if(cnt == 70){
            gfx.setColor(harfler);
            gfx.fillRect(80, 230, 30, 30);
            gfx.setColor(Color.white);
            gfx.drawString("A", 92, 250);
            gfx.setColor(Color.black);
            }
            if(cnt == 83){
            gfx.setColor(harfler);
            gfx.fillRect(470, 230, 30, 30);
            gfx.setColor(Color.white);
            gfx.drawString("D", 482, 250);
            gfx.setColor(Color.black);
            }
            if(cnt == 144){
            gfx.setColor(harfler);
            gfx.fillRect(200, 380, 30, 30);
            gfx.setColor(Color.white);
            gfx.drawString("E", 212, 400);
            gfx.setColor(Color.black);
            }
            cnt++;
            if(i%14==0){
                i=0;
                j++;
            }
        }
        gfx.setColor(Color.black);
        for (int x = 80; x < 500; x+=30) {
            for (int y = 80; y < 410; y+=30) {
                gfx.drawRect(x, y, 30, 30);
            }
        }
    }
    
    public void oyuncu_Ciz(int x,int y,Karakter k){
        gfx.drawImage(k.getImage(),80+(x*30),80+(y*30),this);
    }
    
    public void kirmizi_Yol(){
        Color renk = new Color(207,0,5,80);
        gfx.setColor(renk);
        String gidilenyol = "";
        int x=0,y=0;
        for (int i = 0; i < karakterler.size()-1; i++) {
                harita2d[karakterler.get(karakterler.size()-1).getY()][karakterler.get(karakterler.size()-1).getX()] = 9;
                ArrayList kirmizi_yol = karakterler.get(i).EnKisaYol(harita2d,karakterler.get(i).getY(),karakterler.get(i).getX(),karakterler.get(karakterler.size()-1).getY(),karakterler.get(karakterler.size()-1).getX());
                if(!karakterler.get(i).getAd().equals("KyloRen")){
                for (int z = 0; z < kirmizi_yol.size()-1; z++) {
                    for (int j = 0; j < 2; j++) {
                        if(j%2 == 0){
                        int sayac = kirmizi_yol.get(z).toString().indexOf('+');
                        x = Integer.parseInt(kirmizi_yol.get(z).toString().substring(0,sayac));
                        }
                        if(j%2 == 1){
                        int sayac = kirmizi_yol.get(z).toString().indexOf('+');
                        y = Integer.parseInt(kirmizi_yol.get(z).toString().substring(sayac,kirmizi_yol.get(z).toString().length()));
                        }
                    }
                    gfx.fillRect(80+(x*30),80+(y*30), 30, 30);
                }
                }
                else{
                    for (int z = 0; z < kirmizi_yol.size()-2; z++) {
                    for (int j = 0; j < 2; j++) {
                        if(j%2 == 0){
                        int sayac = kirmizi_yol.get(z).toString().indexOf('+');
                        x = Integer.parseInt(kirmizi_yol.get(z).toString().substring(0,sayac));
                        }
                        if(j%2 == 1){
                        int sayac = kirmizi_yol.get(z).toString().indexOf('+');
                        y = Integer.parseInt(kirmizi_yol.get(z).toString().substring(sayac,kirmizi_yol.get(z).toString().length()));
                        }
                    }
                    gfx.fillRect(80+(x*30),80+(y*30), 30, 30);
                }
                }
                
                float adim_sayisi=0;
                if(karakterler.get(0).getTur_sayisi() == 0)
                    adim_sayisi = kirmizi_yol.size()-1;
                if(karakterler.get(0).getTur_sayisi() != 0)
                    adim_sayisi = kirmizi_yol.size()-2;
                if(karakterler.get(i).getAd().equals("KyloRen") && karakterler.get(i).getTur_sayisi() == 0)
                    adim_sayisi = (adim_sayisi)/2;
                if(karakterler.get(i).getAd().equals("KyloRen") && karakterler.get(i).getTur_sayisi() != 0)
                    adim_sayisi = (adim_sayisi-1)/2;
                gidilenyol += "<html>"+karakterler.get(i).getAd()+" ("+karakterler.get(i).getX()+","+karakterler.get(i).getY()+")'den"
                    +" ("+karakterler.get(karakterler.size()-1).getX()+","+karakterler.get(karakterler.size()-1).getY()+")'ya "+adim_sayisi+"adımda ulaşır.Tur sayısı:"+karakterler.get(i).getTur_sayisi()+"<br/>";
                haritayukle();
                }
                gidilenyol += "</html>";
                hedef.setText(gidilenyol);
     }
    
    public void haritayukle(){
        int sayacx=0,sayacy=0;
        for (int k = 0; k < harita.size(); k++) {
            if(sayacy%14 == 0 && sayacy != 0){
                sayacy=0;
                ++sayacx;
            }
            harita2d[sayacx][sayacy] = harita.get(k);
            sayacy++;
        }
    }
    
    public final void dosya_Oku(){
        karakterler = new ArrayList();
        File file = new File("C:\\Users\\Yavuz\\Desktop\\Harita.txt");
        harita = new ArrayList<>();
        try {
            try (FileReader fr = new FileReader(file)) {
                int ch;
                while((ch=fr.read()) != -1){
                    if(ch == 48)
                        harita.add(0);
                    if(ch == 49)
                        harita.add(1);
                }
                fr.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException ex) {
            Logger.getLogger(ProLab21.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String cumle;
            while((cumle = br.readLine())!=null){
                if(cumle.toLowerCase().contains("stormtrooper")){
                    Stormtrooper str = new Stormtrooper();
                    str.setImage();
                    str.setTur_sayisi(0);
                    str.setAd("Stormtrooper");
                    if(cumle.toLowerCase().contains("kapi:a")){
                        str.setX(0);str.setY(5);
                    }
                    if(cumle.toLowerCase().contains("kapi:b")){
                        str.setX(4);str.setY(0);
                    }
                    if(cumle.toLowerCase().contains("kapi:c")){
                        str.setX(12);str.setY(0);
                    }
                    if(cumle.toLowerCase().contains("kapi:d")){
                        str.setX(13);str.setY(5);
                    }
                    if(cumle.toLowerCase().contains("kapi:e")){
                        str.setX(4);str.setY(10);
                    }
                    karakterler.add(str);
                }
                if(cumle.toLowerCase().contains("kyloren")){
                    KyloRen str = new KyloRen();
                    str.setImage();
                    str.setTur_sayisi(0);
                    str.setAd("KyloRen");
                    if(cumle.toLowerCase().contains("kapi:a")){
                        str.setX(0);str.setY(5);
                    }
                    if(cumle.toLowerCase().contains("kapi:b")){
                        str.setX(4);str.setY(0);
                    }
                    if(cumle.toLowerCase().contains("kapi:c")){
                        str.setX(12);str.setY(0);
                    }
                    if(cumle.toLowerCase().contains("kapi:d")){
                        str.setX(13);str.setY(5);
                    }
                    if(cumle.toLowerCase().contains("kapi:e")){
                        str.setX(4);str.setY(10);
                    }
                    karakterler.add(str);
                }
                if(cumle.toLowerCase().contains("darthvader")){
                    DarthVader str = new DarthVader();
                    str.setImage();
                    str.setTur_sayisi(0);
                    str.setAd("DarthVader");
                    if(cumle.toLowerCase().contains("kapi:a")){
                        str.setX(0);str.setY(5);
                    }
                    if(cumle.toLowerCase().contains("kapi:b")){
                        str.setX(4);str.setY(0);
                    }
                    if(cumle.toLowerCase().contains("kapi:c")){
                        str.setX(12);str.setY(0);
                    }
                    if(cumle.toLowerCase().contains("kapi:d")){
                        str.setX(13);str.setY(5);
                    }
                    if(cumle.toLowerCase().contains("kapi:e")){
                        str.setX(4);str.setY(10);
                    }
                    karakterler.add(str);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException ex) {
            Logger.getLogger(ProLab21.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < karakterler.size(); i++) {
            defaultpos[i][0] = karakterler.get(i).getX();
            defaultpos[i][1] = karakterler.get(i).getY();
        }
    }
    
    public void reset(){
        karakterler.get(karakterler.size()-1).setX(6);
        karakterler.get(karakterler.size()-1).setY(5);
        for (int i = 0; i < karakterler.size()-1; i++) {
            karakterler.get(i).setX(defaultpos[i][0]);
            karakterler.get(i).setY(defaultpos[i][1]);
        }
        harita_sifirla();
        kirmizi_Yol();
        for (int i = 0; i < karakterler.size(); i++) {
            oyuncu_Ciz(karakterler.get(i).getX(),karakterler.get(i).getY(),karakterler.get(i));
        }
    }
    
    public boolean ulastiMi(Karakter k,Karakter k2){
        if(k.getX()==k2.getX() && k.getY()==k2.getY()){
            int can = karakterler.get(karakterler.size()-1).getCan_sayisi();
            ImageIcon ii = new ImageIcon("C:\\Users\\Yavuz\\Desktop\\yarim_can.png");
            if(can == 11){
            jLabel4.setIcon(ii);
            harita_sifirla();
            }
            if(can == 10){
            jLabel4.setVisible(false);
            }
            if(can == 9){
            jLabel3.setIcon(ii);    
            }
            if(can == 8){
            jLabel3.setVisible(false);    
            }
            if(can == 7){
            jLabel2.setIcon(ii);    
            }
            if(can == 6){
            jLabel2.setVisible(false);
            JOptionPane.showMessageDialog(null,"Oyun bitti.");
            }
            if(can == 3){
            jLabel4.setVisible(false);    
            }
            if(can == 2){
            jLabel3.setVisible(false);    
            }
            if(can == 1){
            jLabel2.setVisible(false);
            JOptionPane.showMessageDialog(null,"Oyun bitti.");
            }
            Object[] options= {
            "Tamam" 
        };
        int snc = JOptionPane.showOptionDialog(null,"Karakteriniz yakalandı.","Bilgi Ekranı",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        if(snc == 0){
            ArrayList<Integer> gecicitur = new ArrayList();
            for (int i = 0; i < karakterler.size(); i++) {
                gecicitur.add(karakterler.get(i).getTur_sayisi());
                karakterler.get(i).setTur_sayisi(0);
            }
            reset();
            for (int i = 0; i < karakterler.size(); i++) {
                karakterler.get(i).setTur_sayisi(gecicitur.get(i));
            }
        }    
            return true;
        }
        return false;
    }
    
    public boolean hedefeulastiMi(Karakter k){
        if(k.getX()==13 && k.getY()==9 && k.getCan_sayisi()!=0 && k.getCan_sayisi()!=5){
            JOptionPane.showMessageDialog(null,"Kazandınız");
            return true;
        }
        return false;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProLab21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProLab21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProLab21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProLab21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProLab21().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baslat;
    private javax.swing.JLabel hedef;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tur_sayisi;
    // End of variables declaration//GEN-END:variables

}
