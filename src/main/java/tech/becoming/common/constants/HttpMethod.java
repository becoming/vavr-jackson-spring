package tech.becoming.common.constants;

/**
 * HTTP defines a set of request methods to indicate the desired action to be performed for a given resource.
 * Although they can also be nouns, these request methods are sometimes referred to as HTTP verbs.
 * Each of them implements a different semantic, but some common features are shared by a group of them:
 * e.g. a request method can be safe, idempotent, or cacheable.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods">HTTP methods</a>
 */
@SuppressWarnings("ALL")
public class HttpMethod {

    private HttpMethod() {
    }

    /**
     * The HTTP GET method requests a representation of the specified resource. Requests using GET should only be used to request data (they shouldn't include data).
     */
    public final static String GET = "GET";

    /**
     * The HTTP HEAD method requests the headers that would be returned if the HEAD request's URL was instead requested with the HTTP GET method. For example, if a URL might produce a large download, a HEAD request could read its Content-Length header to check the filesize without actually downloading the file.
     * <br><br>
     * <b>Warning:</b> A response to a HEAD method should not have a body. If it has one anyway, that body must be ignored: any representation headers that might describe the erroneous body are instead assumed to describe the response which a similar GET request would have received.
     */
    public final static String HEAD = "HEAD";

    /**
     * The HTTP POST method sends data to the server. The type of the body of the request is indicated by the Content-Type header.
     * <br><br>
     * The difference between PUT and POST is that PUT is idempotent: calling it once or several times successively has the same effect (that is no side effect), where successive identical POST may have additional effects, like passing an order several times.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/POST">POST</a>
     */
    public final static String POST = "POST";

    /**
     * The PUT method replaces all current representations of the target resource with the request payload.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PUT">PUT</a>
     */
    public final static String PUT = "PUT";

    /**
     * The DELETE method deletes the specified resource.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/DELETE">DELETE</a>
     */
    public final static String DELETE = "DELETE";

    /**
     * The CONNECT method establishes a tunnel to the server identified by the target resource.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/CONNECT">CONNECT</a>
     */
    public final static String CONNECT = "CONNECT";

    /**
     * The OPTIONS method describes the communication options for the target resource.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/OPTIONS">OPTIONS</a>
     */
    public final static String OPTIONS = "OPTIONS";

    /**
     * The TRACE method performs a message loop-back test along the path to the target resource.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/TRACE">TRACE</a>
     */
    public final static String TRACE = "TRACE";

    /**
     * The PATCH method applies partial modifications to a resource.
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PATCH">PATCH</a>
     */
    public final static String PATCH = "PATCH";



}
