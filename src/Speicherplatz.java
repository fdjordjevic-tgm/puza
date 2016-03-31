import java.io.File;


public class Speicherplatz {
	
	private void listDir(File dir, String prefix) {
		 
		  File[] files = dir.listFiles();
		  if (files != null) {
		    for (int i = 0; i < files.length; i++) {
		      System.out.print(prefix + files[i].getAbsolutePath());
		      if (files[i].isDirectory()) {
		        System.out.print(" (Ordner)\n");
		        listDir(files[i], prefix + "  "); // ruft sich selbst auf
		      }
		      else {
		        System.out.print(" (Datei)\n");
		      }
		    }
		  }
		}
	public static void main(String[] args) {
		Speicherplatz sp = new Speicherplatz();
		System.out.println(sp.listDir("C:/Users/Filip/Desktop/Ordner", "b"));
	}
}
