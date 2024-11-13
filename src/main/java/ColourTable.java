import java.awt.Color;
import java.util.ArrayList;

public class ColourTable {

    final int size;
    ArrayList<Color> palette;

    public ColourTable() {
        throw new IllegalArgumentException("No parameter was passed to constructor");
    }

    public ColourTable(int size) {
        if (size <= 1 || (size & (size - 1))!=0) {
            throw new IllegalArgumentException("Number entered was not a power of 2 and also greater than 1");
        }
        this.size = size;
        this.palette = new ArrayList<Color>(size);
    }

    public int getSize(){
        return size;
    }

    public void add(int r, int g, int b){
        if (palette.size() == this.getSize()){
            throw new IndexOutOfBoundsException("Palette is already full");
        }
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
            throw new IllegalArgumentException("Invalid red, green or blue parameter");
        }
        palette.add(new Color(r, g, b));
    }

    public static void main(String[] args) {
    }
}
