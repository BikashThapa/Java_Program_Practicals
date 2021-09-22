package IOStreams;
import java.io.*;

public class IOByteStreams {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
		in = new FileInputStream("input.txt");
		out = new FileOutputStream("output.txt");
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

