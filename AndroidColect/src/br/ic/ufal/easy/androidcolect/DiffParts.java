package br.ic.ufal.easy.androidcolect;

public class DiffParts {
	
	private String path;
	private int lineBegin;
	private int linEnd;
	
	public DiffParts() {
		this.path = "";
		this.lineBegin = 0;
		this.linEnd = 0;
	}
	
	public DiffParts(String path, int lineBegin, int linEnd) {
		this.path = path;
		this.lineBegin = lineBegin;
		this.linEnd = linEnd;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getLineBegin() {
		return lineBegin;
	}

	public void setLineBegin(int lineBegin) {
		this.lineBegin = lineBegin;
	}

	public int getLinEnd() {
		return linEnd;
	}

	public void setLinEnd(int linEnd) {
		this.linEnd = linEnd;
	}
	
	

}
