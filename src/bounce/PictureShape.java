/** Incomplete PictureShape class

package bounce;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PictureShape extends Shape {

    public PictureShape(int x, int y, int deltaX, int deltaY) {
        super(x,y,deltaX,deltaY);
    }

    public PictureShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x,y,deltaX,deltaY,width,height);
    }

    public PictureShape(String FileName, int x, int y, int deltaX, int deltaY, int width, int height) {
        _x = x;
        _y = y;
        _deltaX = deltaX;
        _deltaY = deltaY;
        _width = width;
        _height = height;
        _picture = FileName;
    }

    public PictureShape (_picture,_x, _y, _width, _height) throws IOException {
        BufferedImage Image = ImageIO.read(new File("FileName"));
        _picture = Image;
    }
}
*/