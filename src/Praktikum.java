import java.awt.BorderLayout;
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.Image; 
import java.awt.RenderingHints; 
import java.awt.image.BufferedImage; 
import java.awt.image.WritableRaster; 
import java.io.File; 
import java.io.IOException;
import javax.imageio.ImageIO; 
import javax.swing.ImageIcon;
import javax.swing.JFileChooser; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;



public class Praktikum extends javax.swing.JFrame {

    String sumber;
    BufferedImage gambar;
    Image gambarhasil;
    int ukuranX;
    int ukuranY;
    int bin;
    String gb1 = "Grafik Histogram"; 
    
    public Praktikum() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollBar2 = new javax.swing.JScrollBar();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollBar3 = new javax.swing.JScrollBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setText("Brightness");

        jLabel6.setText("Contrast");

        jScrollBar2.setMaximum(255);
        jScrollBar2.setMinimum(-255);
        jScrollBar2.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar2.setVisibleAmount(50);
        jScrollBar2.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBar2AdjustmentValueChanged(evt);
            }
        });

        jScrollBar1.setMaximum(255);
        jScrollBar1.setMinimum(-255);
        jScrollBar1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar1.setVisibleAmount(50);
        jScrollBar1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBar1AdjustmentValueChanged(evt);
            }
        });

        jScrollBar3.setMaximum(255);
        jScrollBar3.setMinimum(-255);
        jScrollBar3.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar3.setVisibleAmount(50);
        jScrollBar3.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBar3AdjustmentValueChanged(evt);
            }
        });

        jLabel7.setText("Threshold");

        jLabel8.setText("Negative");

        jButton1.setText("PROSES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tampilkan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Histogram");

        jLabel1.setText("FLIPPING :==============");

        jButton3.setText("PROSES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("PROSES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("VERTICAL");

        jLabel3.setText("HORIZONTAL");

        jButton6.setText("RESET");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("RESET");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Open ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Save As");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(31, 31, 31)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(112, 112, 112))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(117, 117, 117))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(115, 115, 115))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollBar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollBar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton7)
                                        .addGap(51, 51, 51)))
                                .addContainerGap(20, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel9)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButton3)
                            .addComponent(jLabel3)
                            .addComponent(jButton4)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton7))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollBar2AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBar2AdjustmentValueChanged
            int cerah = jScrollBar2.getValue();
            BufferedImage hasilcont = kontras(sumber,cerah);
            int x = jLabel4.getWidth();
            int y = jLabel4.getHeight();
            ImageIcon imageico = new ImageIcon(resize((hasilcont), x, y));
            jLabel4.setIcon(imageico);
    }//GEN-LAST:event_jScrollBar2AdjustmentValueChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFileChooser fc = new JFileChooser();
        int open = fc.showOpenDialog(jLabel4);
        if (open == JFileChooser.APPROVE_OPTION){
            sumber = fc.getSelectedFile().getPath();
            BufferedImage loadimg = loadImage(sumber);
            int x1 = jLabel4.getWidth();
            int y1 = jLabel4.getHeight();
            ImageIcon imageIcon2 = new ImageIcon(resize(loadimg, x1, y1));
            jLabel4.setIcon(imageIcon2);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jScrollBar1AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBar1AdjustmentValueChanged
        // TODO add your handling code here:
        int cerah = jScrollBar1.getValue();
        BufferedImage hasilbright = brigthness(sumber,cerah);
        int x = jLabel4.getWidth();
        int y = jLabel4.getHeight();
        ImageIcon imageico = new ImageIcon(resize((hasilbright), x, y));
        jLabel4.setIcon(imageico);
    }//GEN-LAST:event_jScrollBar1AdjustmentValueChanged

    private void jScrollBar3AdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBar3AdjustmentValueChanged
        // TODO add your handling code here:
        int cerah = jScrollBar3.getValue();
        BufferedImage hasilThreshold = threshold(sumber,cerah);
        int x = jLabel4.getWidth();
        int y = jLabel4.getHeight();
        ImageIcon imageico = new ImageIcon(resize((hasilThreshold), x, y));
        jLabel4.setIcon(imageico);
    }//GEN-LAST:event_jScrollBar3AdjustmentValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BufferedImage hasilnegative = negative(sumber);
        int x = jLabel4.getWidth();
        int y = jLabel4.getHeight();
        ImageIcon imageico = new ImageIcon(resize((hasilnegative), x, y));
        jLabel4.setIcon(imageico);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // TODO add your handling code here:
        BufferedImage hasilhistogram = histogram(sumber);
        int x = jLabel4.getWidth();
        int y = jLabel4.getHeight();
        ImageIcon imageico = new ImageIcon(resize((hasilhistogram), x, y));
        jLabel4.setIcon(imageico);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        // TODO add your handling code here:
        BufferedImage hasilvertical= verticalFlip(sumber);
        int x = jLabel4.getWidth();
        int y = jLabel4.getHeight();
        ImageIcon imageico = new ImageIcon(resize((hasilvertical), x, y));
        jLabel4.setIcon(imageico);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        // TODO add your handling code here:
        BufferedImage hasilhorizontal= horizontalFlip(sumber);
        int x = jLabel4.getWidth();
        int y = jLabel4.getHeight();
        ImageIcon imageico = new ImageIcon(resize((hasilhorizontal), x, y));
        jLabel4.setIcon(imageico);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        BufferedImage buffer= buffer(sumber);
        int x = jLabel4.getWidth();
        int y = jLabel4.getHeight();
        ImageIcon imageico = new ImageIcon(resize((buffer), x, y));
        jLabel4.setIcon(imageico);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         BufferedImage buffer= buffer(sumber);
        int x = jLabel4.getWidth();
        int y = jLabel4.getHeight();
        ImageIcon imageico = new ImageIcon(resize((buffer), x, y));
        jLabel4.setIcon(imageico);
    }//GEN-LAST:event_jButton7ActionPerformed

public static BufferedImage loadImage(String ref) {        
        BufferedImage bimg = null;         
        try {             
            bimg = ImageIO.read(new File(ref));        
        } catch (Exception e) {             
            e.printStackTrace();         
        }         
        return bimg;     
    }  
public static BufferedImage resize(BufferedImage img,int newW, int newH) {   
        int w = img.getWidth();   
        int h = img.getHeight();   
        BufferedImage dimg = new BufferedImage(newW, newH,img.getType());  
        Graphics2D g = dimg.createGraphics();   
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);   
        g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);   
        g.dispose();   
        return dimg;  
    }
public BufferedImage buffer(String sumber){
         BufferedImage prosesGambar;
         BufferedImage loadIng = loadImage(sumber);
         ukuranX = loadIng.getWidth();
         ukuranY = loadIng.getHeight();
         prosesGambar = new BufferedImage(ukuranX, ukuranY,BufferedImage.TYPE_INT_RGB);

         for (int x = 0; x < ukuranX ; x++) {      
             for (int y = 0; y < ukuranY; y++ )  {   

             int rgb2 = loadIng.getRGB(y, x);    
             prosesGambar.setRGB(y,x,rgb2);  
             
         }
      }
return prosesGambar;     
}  
public BufferedImage brigthness(String sumber, int cerah) {        
         BufferedImage prosesGambar = buffer(sumber);
         BufferedImage loadIng = buffer(sumber);
         for (int x = 0; x < ukuranX; x++) {     
             for (int y = 0; y < ukuranY; y++) {   
                 
             int rgb = loadIng.getRGB(x, y);              
             int alpha = (rgb << 24) & 0xff;   
             int merahg = (rgb >> 16) & 0xff;
             int hijaug = (rgb >> 8) & 0xff;   
             int birug = (rgb >> 0) & 0xff;     
             int gray = ((merahg) + (hijaug) + (birug)) / 3; 
             int merah2 = merahg + cerah;           
             int hijau2 = hijaug + cerah;        
             int biru2 = birug + cerah;            
             if (merah2 < 0) {
                 merah2 = 0;
             }  
             if (hijau2 < 0) { 
                 hijau2 = 0;       
             }            
             if (biru2 < 0) { 
                 biru2 = 0;
              }                 
             if (merah2 > 255) {     
                 merah2 = 255;
             }                 
             if (hijau2 > 255) {                    
                 hijau2 = 255;
             }   
             if (biru2 > 255) {     
                 biru2 = 255;
             }             
             int rgb2 = alpha | merah2 << 16 | hijau2 << 8 | biru2;    
             prosesGambar.setRGB(x, y, rgb2);  
             
         }        
      }
return prosesGambar;     
}  
public BufferedImage kontras(String sumber, int kontras) {                
         BufferedImage prosesGambar = buffer(sumber);
         BufferedImage loadIng = buffer(sumber);
            for (int x = 0; x < ukuranX; x++) {
                for (int y = 0; y < ukuranY; y++) {        
                int rgb = loadIng.getRGB(x, y);
                int alpha = (rgb << 24) & 0xff;   
                int merahg = (rgb >> 16) & 0xff;         
                int hijaug = (rgb >> 8) & 0xff;    
                int birug = (rgb >> 0) & 0xff;       
                int gray = ((merahg) + (hijaug) + (birug)) / 3; 
                int merah2=0, hijau2=0, biru2=0;            
                if (merahg > 128) {         
                    merah2 = merahg + kontras;
                } else  merah2 = merahg - kontras;     
                if (hijaug > 128) { 
                    hijau2 = hijaug + kontras;
                } else  hijau2 = hijaug - kontras;  
                if (birug > 128) {     
                    biru2 = birug + kontras;
                } else  biru2 = birug + kontras;     
                if (merah2 < 0) {         
                    merah2 = 0;
                }                   
                if (hijau2 < 0) {     
                    hijau2 = 0;
                }                                      
                if (biru2 < 0) {             
                    biru2 = 0;
                }  
                if (hijau2 > 255) {   
                    hijau2 = 255;
                }                                   
                if (biru2 > 255) {                   
                    biru2 = 255;
                }                                   
                int rgb2 = alpha | merah2 << 16 | hijau2 << 8 | biru2;     
                prosesGambar.setRGB(x, y, rgb2);                 
                }             
            }            
            return prosesGambar;
        } 
 
//edit by Muhamad Bayu
private static int Rgb2(int Merah, int Hijau, int Biru) {
		return Merah<<16|Hijau<<8|Biru;
	}

//        public static int getAlpha(int color) {
//		return (color & 0xff000000)  >> 24;
//	}
public static int getMerah(int color) {
		return (color & 0x00ff0000)  >> 16;
	}
	
public static int getHijau(int color) {
		return	(color & 0x0000ff00)  >> 8;
	}
	
public static int getBiru(int color) {
		return (color & 0x000000ff)  >> 0;
		
	}
        
    
public BufferedImage threshold(String sumber, int cerah) {        
         BufferedImage prosesGambar = buffer(sumber);
         BufferedImage loadIng = buffer(sumber); 
         
         int  merah = 0, hijau=0, biru = 0; 
         for (int x = 0; x < ukuranX; x++) {     
             for (int y = 0; y < ukuranY; y++) {   
                 
             int rgb = loadIng.getRGB(x, y);      
//           alpha = Praktikum.getAlpha(rgb);
             merah = Praktikum.getMerah(rgb);
             hijau = Praktikum.getHijau(rgb);
             biru = Praktikum.getBiru(rgb);
             
             if((merah+biru+hijau)/3 > (int) (cerah)) {
							prosesGambar.setRGB (x,y, Praktikum.Rgb2(0, 0,0));
						}
						else {
							prosesGambar.setRGB(x,y,Praktikum.Rgb2(255, 255,255));
						}

//             if (merah2 < 0) {
//                 merah2 = 0;
//             }  
//             if (hijau2 < 0) { 
//                 hijau2 = 0;       
//             }            
//             if (biru2 < 0) { 
//                 biru2 = 0;
//              }                 
//             if (merah2 > 255) {     
//                 merah2 = 255;
//             }                 
//             if (hijau2 > 255) {                    
//                 hijau2 = 255;
//             }   
//             if (biru2 > 255) {     
//                 biru2 = 255;
//             }             
//             int Rgb2 = alpha | merah2 << 16 | hijau2 << 8 | biru2;    
//             prosesGambar.setRGB(x, y, Rgb2);  
             
         }        
      }
return prosesGambar;     
}             
// end edit
//edit by Muhamad Bayu
public BufferedImage negative(String sumber) {
 
         BufferedImage prosesGambar = buffer(sumber);
         BufferedImage loadIng = buffer(sumber);
         
         for (int x = 0; x < ukuranX; x++) {     
             for (int y = 0; y < ukuranY; y++) {   
                 
             int rgb = loadIng.getRGB(x, y);              
             int alpha = (rgb << 24) & 0xff;   
             int merahg = (rgb >> 16) & 0xff;
             int hijaug = (rgb >> 8) & 0xff;   
             int birug = (rgb >> 0) & 0xff;     
             int gray = ((merahg) + (hijaug) + (birug)) / 3; 
             int merah2 = 255 - merahg;           
             int hijau2 = 255 - hijaug;        
             int biru2 = 255 - birug;            
             if (merah2 < 0) {
                 merah2 = 0;
             }  
             if (hijau2 < 0) { 
                 hijau2 = 0;       
             }            
             if (biru2 < 0) { 
                 biru2 = 0;
              }                 
             if (merah2 > 255) {     
                 merah2 = 255;
             }                 
             if (hijau2 > 255) {                    
                 hijau2 = 255;
             }   
             if (biru2 > 255) {     
                 biru2 = 255;
             }             
             int rgb2 = alpha | merah2 << 16 | hijau2 << 8 | biru2;    
             prosesGambar.setRGB(x, y, rgb2);  
             
         }        
      }
return prosesGambar;     
}
//end edit
public BufferedImage histogram(String sumber){        
         BufferedImage prosesGambar;
         BufferedImage loadIng = loadImage(sumber);
         ukuranX = loadIng.getWidth();
         ukuranY = loadIng.getHeight();
         prosesGambar = new BufferedImage(ukuranX, ukuranY,BufferedImage.TYPE_INT_RGB);
            Graphics g = prosesGambar.getGraphics();
            g.drawImage(loadIng, 0, 0, null); 
            WritableRaster raster = prosesGambar.getRaster();    
            int count[][] = new int[4][0x100];
            int total = loadIng.getWidth() * loadIng.getWidth();
        
            for (int x = 0; x < loadIng.getWidth(); x++) {
                for (int y = 0; y < loadIng.getHeight(); y++) {
                    int rgb = loadIng.getRGB(x, y);
                    int merahg = (rgb >> 16) & 0xff;
                    int hijaug = (rgb >> 8) & 0xff;   
                    int birug = (rgb >> 0) & 0xff;     

                    count[0][merahg ]++;
                    count[1][hijaug ]++;
                    count[2][birug ]++;
                    
                }
            }


        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int f = 0; f < 0x100; f++) {
            dataset.addValue(count[0][f], "Red", new Integer(f));
            dataset.addValue(count[2][f], "Green", new Integer(f));
            dataset.addValue(count[1][f], "blue", new Integer(f));   
        }

        JFreeChart histo = ChartFactory.createBarChart(null,"Nilai", "Frekuensi", dataset, 
        PlotOrientation.VERTICAL, true, true, false);

        ChartFrame frame = new ChartFrame(null,histo);
        histo.setBackgroundPaint(Color.white);
        final CategoryPlot plot = (CategoryPlot) histo.getPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeMinorGridlinePaint(Color.white);

        frame.setSize(500, 300);
        frame.setLocation(380, 200);
        frame.setTitle(sumber);
        frame.setVisible(true);
        
        return prosesGambar;   
}
//edit by Muhamad Bayu
public BufferedImage horizontalFlip(String sumber ) {
    
         BufferedImage prosesGambar = buffer(sumber);
         BufferedImage loadIng = buffer(sumber);
         for (int x = 0; x < ukuranX; x++) {     
             for (int y = 0,  lebar = ukuranY -1; y < ukuranY -1 ; y++, lebar-- )  {   
             int rgb2 = loadIng.getRGB(y, x);    
             prosesGambar.setRGB(lebar, x, rgb2);   
             
         }
      }
return prosesGambar;     
}  
public BufferedImage verticalFlip(String sumber ) {
 
         BufferedImage prosesGambar = buffer(sumber);
         BufferedImage loadIng = buffer(sumber);

         for (int x = 0, tinggi = ukuranX -1; x < ukuranX - 1; x++, tinggi--) {     
             for (int y = 0; y < ukuranY; y++ )  {   

             int rgb2 = loadIng.getRGB(y, x);    
             prosesGambar.setRGB(y,  tinggi,rgb2);  
             
         }
      }
return prosesGambar;     
}  
//end edit
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Praktikum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Praktikum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Praktikum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Praktikum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Praktikum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JScrollBar jScrollBar3;
    // End of variables declaration//GEN-END:variables


}
