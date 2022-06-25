package tech.becoming.common.exceptions;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

import static tech.becoming.common.constants.HttpStatusCode.BAD_REQUEST_400;
import static tech.becoming.common.constants.HttpStatusName.BAD_REQUEST;

public class BadRequestException extends AbstractRuntimeException {

    public BadRequestException() {
        super(BAD_REQUEST);
    }

    public BadRequestException(List<ExceptionDetail> details) {
        super(BAD_REQUEST, details);
    }

    public BadRequestException(ExceptionDetail detail) {
        super(BAD_REQUEST, detail);
    }

    @Override
    public int getHttpCode() {
        return BAD_REQUEST_400;
    }

    public static void throwIfHasDetails(List<ExceptionDetail> details) {
        if(details.size() > 0) {
            throw new BadRequestException(details);
        }
    }

    public static <T> T throwIfEmpty(Optional<T> optional) {
        return optional.orElseThrow(NotFoundException::new);
    }

    /**
     * Can be used in conjuncture with Vavr and Spring Data's <b>exist</b> or <b>existById</b>
     * @param b boolean that needs to be checked in <b>exists</b> cases
     * @return true or throw a BadRequestException
     */
    public static Boolean throwIfFalse(Boolean b) {
        if(b) {
            return true;
        }

        throw new BadRequestException();
    }
}
