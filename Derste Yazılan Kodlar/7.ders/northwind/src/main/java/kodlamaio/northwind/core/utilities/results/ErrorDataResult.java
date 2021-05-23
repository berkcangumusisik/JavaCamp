package kodlamaio.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data, String mesagge) {
		super(data, false, mesagge);
	}
	public ErrorDataResult(T data) {
		super(data, false);
	}
	public ErrorDataResult(String mesagge) {
		super(null, false, mesagge);
	}
	public ErrorDataResult() {
		super(null, false);
	}
}