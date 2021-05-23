package kodlamaio.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, String mesagge) {
		super(data, true, mesagge);
	}
	public SuccessDataResult(T data) {
		super(data, true);
	}
	public SuccessDataResult(String mesagge) {
		super(null, true, mesagge);
	}
	public SuccessDataResult() {
		super(null, true);
	}
}
