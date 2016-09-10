
import java.awt.Font;
import java.util.Set;


import javax.swing.*;

import javax.swing.UIManager;

public class SetFont {
	

    public static void setDefaultSize(int size) {   //looks this method must be called before JFrame is instanciated.
    	
    	  try {
              UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
          } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
              ex.printStackTrace();
          }

        Set<Object> keySet = UIManager.getLookAndFeelDefaults().keySet();//A Hashtable of defaults for Swing components. 
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
    public static void main()
    {
    	  SetFont.setDefaultSize(20);
    }
	

}
