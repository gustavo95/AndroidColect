package br.ic.ufal.easy.androidcolect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManagement {
	
	public List<String> readFile(String name){
		List<String> file = new ArrayList<>();
		
		try {
			FileReader reader = new FileReader(name);
			BufferedReader leitor = new BufferedReader(reader);
			String linha = null;
			while(leitor.ready()) { 
				linha = leitor.readLine();
			    file.add(linha);
			}
			leitor.close();  
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(name + " not found!\n");
			file = null;
		}
		
		return file;
	}
	
	public void writeFile(String name, String diff){
		try{
			File newFile = new File("C:\\Users\\Gustavo\\Desktop\\Pesquisa\\Android\\" + name + ".txt");
			FileWriter writer = new FileWriter(newFile);
			PrintWriter out = new PrintWriter(writer);
			out.println(diff);
			out.close();
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
