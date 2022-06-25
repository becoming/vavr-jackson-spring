package tech.becoming.common.exceptions;

import lombok.NoArgsConstructor;

import java.util.List;

import static tech.becoming.common.constants.HttpStatusCode.UNAUTHORIZED_401;
import static tech.becoming.common.constants.HttpStatusName.UNAUTHORIZED;

public class UnauthenticatedException extends AbstractRuntimeException {

    public UnauthenticatedException() {
        super(UNAUTHORIZED);
    }

    public UnauthenticatedException(List<ExceptionDetail> details) {
        super(UNAUTHORIZED, details);
    }

    public UnauthenticatedException(ExceptionDetail detail) {
        super(UNAUTHORIZED, detail);
    }

    @Override
    public int getHttpCode() {
        return UNAUTHORIZED_401;
    }
}
