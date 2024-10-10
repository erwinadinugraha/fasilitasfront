package id.go.pajak.fasilitashibah.util.exception;

import org.springframework.http.HttpStatus;

public class CustomValidationException extends RuntimeException {

	private HttpStatus status;
	private Object pesan;
	
	public CustomValidationException(HttpStatus status, Object pesan) {
		super();
		this.status = status;
		this.pesan = pesan;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public Object getPesan() {
		return pesan;
	}

	public void setPesan(Object pesan) {
		this.pesan = pesan;
	}
	

}
