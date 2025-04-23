package collection.list;

import java.io.File;

public class Inputandpoutput_prog2 {
	public static void main(String[] args) {
		File f=new File("index.html");
		try {
			if(f.createNewFile()) {
				System.out.println("file successfully created" +f.getName());
			}else {
				System.out.println("file is not created");
			}
			System.out.println("absolutr path:" +f.getAbsolutePath());
			System.out.println("read:"+f.canRead());
			System.out.println("write: "+f.canWrite());
			System.out.println("length:"+f.length());
			System.out.println("read:" +f.isFile());
			System.out.println("directory"+f.isDirectory());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
