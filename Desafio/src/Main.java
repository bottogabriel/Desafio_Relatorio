
import java.io.File;

import java.io.IOException;

import Process.ProcessFile;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strPathIn = "./data/in";
		String strPathOut = "./data/out/";
		String strFileNameOut = "";
		ProcessFile processFile = new ProcessFile();

		while(true){
		File folder = new File(strPathIn);
		for (final File fileEntry : folder.listFiles())
			if (fileEntry.isDirectory()) {

			} else {
				try {

					if (fileEntry.getName().endsWith(".dat")) {
						strFileNameOut = processFile.processaArquivo(strPathIn,
								fileEntry.getName(), strPathOut);
						System.out.println(fileEntry.getName() + " " + strFileNameOut);
						fileEntry.delete();
						fileEntry.deleteOnExit();
						
						File f = new File(fileEntry.getPath());
						f.deleteOnExit();
						fileEntry.deleteOnExit();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

}
