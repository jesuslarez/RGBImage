package model;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Canvas extends JPanel {

    private BufferedImage image = null;
    private BufferedImage logo = null;
    private int logoPosition = 1;
    private boolean red = true;
    private boolean green = true;
    private boolean blue = true;
    public Canvas() {
        try {
            image = ImageIO.read(new File("src/main/resources/dog.jpg"));
            logo = ImageIO.read(new File("src/main/resources/imperial1.png"));
            this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
        } catch (IOException ex) {
            Logger.getLogger(Canvas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setLogoPosition(int logoPosition) {
        this.logoPosition = logoPosition;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public void setGreen(boolean green) {
        this.green = green;
    }

    public void setBlue(boolean blue) {
        this.blue = blue;
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawRGBImage(g);
        drawLogo(g);
    }

    private int getBottomPosition() {
        return image.getHeight() - logo.getHeight();
    }

    private int getRightPosition() {
        return image.getWidth() - logo.getWidth();
    }

    private void drawLogo(Graphics g) {
        switch (logoPosition) {
            case 0:
                g.drawImage(logo, 0, 0, null);
                break;
            case 1:
                g.drawImage(logo, getRightPosition(), 0, null);
                break;
            case 2:
                g.drawImage(logo, 0, getBottomPosition(), null);
                break;
            case 3:
                g.drawImage(logo, getRightPosition(), getBottomPosition(), null);
                break;
        }
    }

    private void drawRGBImage(Graphics g) {
        BufferedImage clone = UtilsPractica5.seleccionarComponentes(image, red, green, blue);
        g.drawImage(clone, 0, 0, null);
    }
}
