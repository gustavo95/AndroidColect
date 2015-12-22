package br.ic.ufal.easy.androidcolect;

import java.io.IOException;
import java.util.List;

public class AndroidMain {
	
	public static WebColector wc;
	public static FileManagement fm;
	public static CodeCheck cc;
	
	public static void main(String args[]) throws IOException{
		wc = new WebColector();
		fm = new FileManagement();
		cc = new CodeCheck();
		
		checkCode();
	}
	
	public static void checkCode(){
		List<String> CVELinks;
		String CVE;
		List<DiffParts> parts;
		List<String> diff;
		List<String> before;
		List<String> after;
		
		String androidPath = "C:\\Users\\Gustavo\\Desktop\\Pesquisa\\Analise\\Android\\";
		
		CVELinks = fm.readFile( androidPath + "links.txt");
		for(String cl : CVELinks){
			CVE = cl.split("	")[0];
			String diffPath = androidPath + "diffs\\" + CVE + ".txt";
			System.out.println("\n" + CVE);
			diff = fm.readFile(diffPath);
			parts = cc.getFilesPaths(diff);
			for(DiffParts part : parts){
				before = fm.readFile(androidPath + "codigos\\" + CVE + "\\Before" + part.getPath());
				after = fm.readFile(androidPath + "codigos\\" + CVE + "\\After" + part.getPath());
				//System.out.println(androidPath + "codigos\\" + CVE + "\\Before" + part.getPath());
				//System.out.println(androidPath + "codigos\\" + CVE + "\\After" + part.getPath());
				//System.out.println("B: " + part.getLineBegin() + "  E: " + part.getLinEnd());
			}
		}
	}

}
