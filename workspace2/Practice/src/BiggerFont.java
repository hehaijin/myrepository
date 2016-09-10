import java.awt.Font;
import java.util.Set;

import javax.swing.UIManager;

public class BiggerFont {
	
	
	 public static void setDefaultSize(int size) {

	        Set<Object> keySet = UIManager.getLookAndFeelDefaults().keySet();
	        Object[] keys = keySet.toArray(new Object[keySet.size()]);

	        for (Object key : keys) {

	            if (key != null && key.toString().toLowerCase().contains("font")) {

	                System.out.println(key);
	                Font font = UIManager.getDefaults().getFont(key);
	                if (font != null) {
	                    font = font.deriveFont((float)size);
	                    UIManager.put(key, font);
	                }

	            }

	        }


		
	}
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
