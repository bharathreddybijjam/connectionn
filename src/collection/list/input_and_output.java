package collection.list;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class input_and_output {
	public static void main(String[] args) {
		String sourcepath= "D:/20230806_165508.jpg";
		String destinationpath= "D:/Trips/program_photo.jpg";
		try(
				FileInputStream file=new FileInputStream(sourcepath);
				FileOutputStream files=new FileOutputStream(destinationpath);
				)
		{
			byte[] buffer =new byte[8192];
			int byteread;
			while((byteread = file.read(buffer))!=-1){
				files.write(buffer,0,byteread);
			}
			System.out.println("Successfully created");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
