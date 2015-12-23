package br.ic.ufal.easy.androidcolect;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeCheck {	
	
	public List<DiffParts> getFilesPaths(List<String> diff){
		List<DiffParts> parts = new ArrayList<DiffParts>();
		String line = "";
		DiffParts dp = null;
		
		Pattern pattern = Pattern.compile("(diff --git .*)");
		Matcher matcher;
		
		for(int i = 0; i < diff.size(); i++){
			line = diff.get(i);
			matcher = pattern.matcher(line);
            if(matcher.find()) {
            	if(dp != null){
            		dp.setLineEnd(i - 1);
            		parts.add(dp);
            	}
            	String result = matcher.group();
            	dp = new DiffParts(result.split(" b")[1].replace("/", "\\"), i , 0);
            }
		}
		if(dp != null){
    		dp.setLineEnd(diff.size() - 1);
    		parts.add(dp);
    	}
		
		return parts;
	}
	
	public void codeComparison(List<String> diff, List<String> before, List<String> after, DiffParts part){
		String diffLine = "";
		
		Pattern pattern = Pattern.compile("(@@ .* @@.*)");
		Matcher matcher;
		
		if(before != null && after == null){
			System.out.println(part.getPath() + "was removed from old version");
		}else if(before == null && after != null){
			System.out.println(part.getPath() + "was add to new version");
		}else{
			for(int i = part.getLineBegin(); i <= part.getLineEnd(); i++){
				diffLine = diff.get(i);
			}
		}
	}

}
