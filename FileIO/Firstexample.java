package FileIO;
import java.io.*;

public class Firstexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String text;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader  br = new BufferedReader(isr);
			try {
				text = br.readLine();
				System.out.println(text);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				

				e.printStackTrace();
			}
			
			
	}

}
