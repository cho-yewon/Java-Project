import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;

public class CaptchaGenerator {

    public static String generateCaptchaText() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder captchaText = new StringBuilder(5);
        
        for (int i = 0; i < 5; i++) {
            int randomIndex = random.nextInt(characters.length());
            captchaText.append(characters.charAt(randomIndex));
        }

        return captchaText.toString();
    }

    public static BufferedImage generateCaptchaImage(String captchaText) {
        int width = 250;
        int height = 100;
        
        BufferedImage captchaImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = captchaImage.getGraphics();
        
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 40));

        g.drawString(captchaText, 50, 60);

        g.setColor(Color.GRAY);
        for (int i = 0; i < 5; i++) {
            int x1 = (int) (Math.random() * width);
            int y1 = (int) (Math.random() * height);
            int x2 = (int) (Math.random() * width);
            int y2 = (int) (Math.random() * height);
            g.drawLine(x1, y1, x2, y2);
        }

        g.dispose();
        return captchaImage;
    }
}
