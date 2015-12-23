package br.ic.ufal.easy.androidcolect;

public class DiffParts {
	
	private String path;
	private int lineBegin;
	private int lineEnd;
	
	public DiffParts() {
		this.path = "";
		this.lineBegin = 0;
		this.lineEnd = 0;
	}
	
	public DiffParts(String path, int lineBegin, int lineEnd) {
		this.path = path;
		this.lineBegin = lineBegin;
		this.lineEnd = lineEnd;
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

	public int getLineEnd() {
		return lineEnd;
	}

	public void setLineEnd(int lineEnd) {
		this.lineEnd = lineEnd;
	}
	
	

}
