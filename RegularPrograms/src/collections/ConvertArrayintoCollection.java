package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayintoCollection {

	public static void main(String[] args) {
		String[] players= {"kohli","Rohit","Dhoni","Pant","Bumrah"};
		ArrayList<String> cricket = new ArrayList<>(Arrays.asList(players));
		System.out.println(cricket);
	}

}
