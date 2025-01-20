package file_;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileMain {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Administrator\\Pictures\\Screenshots");
		File[] files = file.listFiles();
		for (File file2 : files) {
			System.out.println(file2);
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file2.lastModified()));
		}
		
		File file2 = new File("C:\\Users\\Administrator\\Pictures\\Screenshots\\스크린샷 2025-01-19 191318.png");
		System.out.println(file2);
		System.out.println(new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초").format(file2.lastModified()));

	}
}
