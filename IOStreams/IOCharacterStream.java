package IOStreams;
import java.io.*;


public class IOCharacterStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader in = null;
		FileWriter out = null;
		try {
		in = new FileReader("input.txt");
		out = new FileWriter("output.txt");
		int c;
		while ((c = in.read()) != -1) {
				out.write(c);
			}
		}finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}//End of finally
	}

}
