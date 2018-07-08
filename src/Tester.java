import java.io.File;

public class Tester {

	public static void main(String[] args) {
		File dir1 = new File("C:\\Users\\Vladislav\\Desktop\\1");
		File dir2 = new File("C:\\Users\\Vladislav\\Desktop\\2");
        System.out.println(Copy.copy(dir1, dir2, "docx"));
	}

}
