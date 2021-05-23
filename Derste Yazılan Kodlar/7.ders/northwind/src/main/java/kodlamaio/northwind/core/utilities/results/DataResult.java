package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {
	private T data;

	public DataResult(T data, boolean success, String mesagge) {
		super(success, mesagge);
		this.data = data;
	}
	
	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
	
}
