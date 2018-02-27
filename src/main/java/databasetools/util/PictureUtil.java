package databasetools.util;

import javax.swing.ImageIcon;

public class PictureUtil {

	public static ImageIcon getPicture(String name) {
		ImageIcon icon = new ImageIcon(PictureUtil.class.getClassLoader()
				.getResource("image/" + name));
//		ImageIcon icon = new ImageIcon("src/test/resources/image/" + name);
		return icon;
	}

}
