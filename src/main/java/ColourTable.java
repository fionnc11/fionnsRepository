import java.awt.Color;
import java.util.ArrayList;


/**
 * ColourTable class is a class that represents a palette of colours
 * Methods allow you to add colours to the palette until it is full
 */
public class ColourTable {

    final int size;
    final ArrayList<Color> palette;

    /**
     * default constructor that throws an exception if no parameter is passed when
     * creating a ColourTable object
     */
    public ColourTable() {
        throw new IllegalArgumentException("No parameter was passed to constructor");
    }

    /**
     * constructor which takes input size and sets the instance variables values
     * @param size specifying the size of the colour palette
     * @throws IllegalArgumentException if the parameter passed was not a power of 2 and greater than 1
     */
    public ColourTable(int size) {
        if (size <= 1 || (size & (size - 1))!=0) {
            throw new IllegalArgumentException("Number entered was not a power of 2 and also greater than 1");
        }
        this.size = size;
        this.palette = new ArrayList<>(size);
    }

    /**
     * simple getter to access the size variable
     * @return size of the palette
     */
    public int getSize(){
        return size;
    }

    /**
     * Adds a colour to the palette
     * Colour is a 24 bit RGB colour
     * @param r the red component of the colour ranging from 0-255
     * @param g the green component of the colour ranging from 0-255
     * @param b the blue component of the colour ranging from 0-255
     * @throws IndexOutOfBoundsException if palette is already full
     * @throws IllegalArgumentException if an invalid red, green or blue parameter is passed
     */
    public void add(int r, int g, int b){
        if (palette.size() == this.getSize()){
            throw new IndexOutOfBoundsException("Palette is already full");
        }
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
            throw new IllegalArgumentException("Invalid red, green or blue parameter");
        }
        palette.add(new Color(r, g, b));
    }

    @Override
    public String toString() {
        return "Colour Table : {size = " + this.getSize() + ", palette = [{r="+ this.palette.get(0).getRed() + ",g="
                + this.palette.get(0).getGreen() + ",b=" + this.palette.get(0).getBlue() + "},{r=" +
                this.palette.get(1).getRed() + ",g=" + this.palette.get(1).getGreen() + ",b=" +
                this.palette.get(1).getBlue() + "}]}";
    }

    public static void main(String[] args) {
    }
}
