import java.io.File;
import java.io.IOException;

public class Copy {

	
	public static boolean copy(File dir1, File dir2, String format) {
		boolean isCopy = false;
		File[] fileArray = dir1.listFiles();
		for(File file : fileArray) {
			String extension = "";

			int i = file.getName().lastIndexOf('.');
			if (i > 0) {
			    extension = file.getName().substring(i+1);
			}
			System.out.println(extension);
			
			if(extension.equals(format)) {
				try {
					File out = new File(dir2, file.getName());
					FileWork.copyFile(file, out);
					isCopy = true;
					System.out.println(dir2.getAbsolutePath());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return isCopy;
	}
}
