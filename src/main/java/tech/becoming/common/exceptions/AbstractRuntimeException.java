package tech.becoming.common.exceptions;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@NoArgsConstructor
public abstract class AbstractRuntimeException extends RuntimeException {

    public static final Logger LOGGER = Logger.getLogger(AbstractRuntimeException.class.getName());
    private List<ExceptionDetail> details = new ArrayList<>();

    public AbstractRuntimeException(String message) {
        super(message);
    }

    public AbstractRuntimeException(String message, List<ExceptionDetail> details) {
        super(message);
        this.details = details;
    }

    public AbstractRuntimeException(String message, ExceptionDetail detail) {
        super(message);
        details.add(detail);
    }

    public abstract int getHttpCode();

    @Override
    public String toString() {
        var messages = details.stream().map(ExceptionDetail::getMessage).toArray();

        return "Details: " + Arrays.toString(messages);
    }
}
