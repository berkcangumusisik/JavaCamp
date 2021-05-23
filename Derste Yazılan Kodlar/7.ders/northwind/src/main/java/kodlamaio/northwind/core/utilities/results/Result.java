package kodlamaio.northwind.core.utilities.results;

public class Result {
	private boolean success;
	private String mesagge;
	public Result(boolean success) {
		this.success = success;
	}
	public Result(boolean success, String mesagge) {
		this(success);
		this.mesagge = mesagge;
	}
	public boolean isSuccess() {
		return this.success;
	}
	public String getMessage(){
		return this.mesagge;
	}
}

