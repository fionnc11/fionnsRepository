import java.util.ArrayList;

public class ColourTable {

    int size = 0;

    public ColourTable() {
        throw new IllegalArgumentException("No parameter was passed to constructor");
    }

    public ColourTable(int size) {
        if (size <= 1 || (size & (size - 1))!=0) {
            throw new IllegalArgumentException("Number entered was not a power of 2 and also greater than 1");
        }
        this.size = size;
    }

    public static void main(String[] args) {
        ArrayList<Integer> colourPalette = new ArrayList<Integer>();;
    }
}
