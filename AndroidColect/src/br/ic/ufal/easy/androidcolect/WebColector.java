package br.ic.ufal.easy.androidcolect;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebColector {
	
	public String getCode(String URL) throws IOException{
		String code = "";

		Connection connection = Jsoup.connect(URL).timeout(300000).ignoreHttpErrors(true);
		Document doc = connection.get();

        Elements ele = doc.getElementsByTag("pre");
        
        for (int i = 1; i < ele.size(); i++) {
        	code = code + "\n" + ele.get(i).getAllElements().get(0).text();
        }
		
		return code;
	}

}
