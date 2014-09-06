import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class IntroController {
	JFrame frame;
	
	public IntroController(JFrame frame){
		this.frame = frame;
	}
	
	public boolean LoadAction(IntroWindow window){
		String current = new File(".").getAbsolutePath();
		current = current.substring(0,current.length()-1);
		File f = new File(current+"save.ser");
		System.out.println(f.getAbsoluteFile());
		Player p = null;
		Universe u = null;
		if(f.exists()){
			try{
				FileInputStream fileIn = new FileInputStream(f);
				ObjectInputStream in = new ObjectInputStream(fileIn);
				p = (Player)in.readObject();
				u = (Universe)in.readObject();
				GameEngine.loadGame(p,u);
				window.setLoaded(true);
				return true;
			}
			catch(IOException e){
				e.getStackTrace();
			}
			catch(ClassNotFoundException t){
				t.printStackTrace();
			}
		}
		else{
			JOptionPane dialog = new JOptionPane();
			dialog.showMessageDialog(new JFrame(),"No save game file found!");
		}
		return false;
	}
}
