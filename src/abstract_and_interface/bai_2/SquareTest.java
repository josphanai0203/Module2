package abstract_and_interface.bai_2;

public class SquareTest {
	public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3.5);
        System.out.println(square);
        
        square.howToColor();
        
    }
}
