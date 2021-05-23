package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result {
	public ErrorResult() {
		super(false);
	}
	
	public ErrorResult(String mesagge) {
		super(false, mesagge);
	}

}
