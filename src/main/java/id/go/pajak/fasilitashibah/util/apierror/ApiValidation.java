package id.go.pajak.fasilitashibah.util.apierror;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ApiValidation extends ApiSubError {

    private String field;
    private Object rejectedValue;
    private String message;

    public ApiValidation(String message) {
        this.message = message;
    }

    public ApiValidation(String field, Object rejectedValue, String message) {
        this.field = field;
        this.rejectedValue = rejectedValue;
        this.message = message;
    }

}
