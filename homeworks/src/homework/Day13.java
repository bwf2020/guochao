package homework;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
/**
 * 删除文件及文件夹
 * @author 郭超
 *
 */
public class Day13 {
	
	
	public static void name(File dir) {
		
		if(dir.isDirectory()) {
			File[] name=dir.listFiles();
			System.out.println(Arrays.toString(name));
			for (File f1 : name ) {
				
				System.out.println(f1);
				f1.delete();
				System.out.println(dir);
			}
			dir.delete();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = null;
        File dir = new File("C:/file");
        dir.mkdir();
        try {
			file = File.createTempFile
			("java", ".txt", dir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("没创建成功");
		}
        System.out.println(file.getPath().toString());
		
		name(dir);
		
		
	 	//System.out.println(f.length()); 
		
		
		
		
	}

}
