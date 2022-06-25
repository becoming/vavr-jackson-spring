package tech.becoming.common.exceptions;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

/**
 * Example for json response
 * {
 *     "timestamp": "2021-04-03T18:41:16.587+00:00",
 *     "status": 500,
 *     "error": "Internal Server Error",
 *     "message": "",
 *     "path": "/robots/2"
 * }
 */
@Builder
@Getter
public class HttpExceptionBody {
    private Instant timestamp = Instant.now();
    private int status = 500;
    private String error = "Internal Server Error";
    private String message = "";
    private String path = "";
}
