package tech.becoming.common.constants;

/**
 * Constants for the http status codes
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status">HTTP response status codes</a>
 */
@SuppressWarnings("ALL")
public class HttpStatusCode {

    private HttpStatusCode() {
    }

    /**
     * Informational responses (100–199)
     * <br><br>
     * This interim response indicates that everything so far is OK and that the client should continue the request, or ignore the response if the request is already finished.
     */
    public final static int CONTINUE_100 = 100;

    /**
     * Informational responses (100–199)
     * <br><br>
     * This code is sent in response to an Upgrade request header from the client, and indicates the protocol the server is switching to.
     */
    public final static int SWITCHING_PROTOCOL_101 = 101;

    /**
     * Informational responses (100–199)
     * <br>WebDAV
     * <br><br>
     * This code indicates that the server has received and is processing the request, but no response is available yet.
     */
    public final static int PROCESSING_102 = 102;

    /**
     * Informational responses (100–199)
     * <br><br>
     * This status code is primarily intended to be used with the Link header, letting the user agent start preloading resources while the server prepares a response.
     */
    public final static int EARLY_HITS_103 = 103;

    /**
     * Successful responses (200–299)
     * <br><br>
     * The request has succeeded. The meaning of the success depends on the HTTP method:
     * <br>
     * <strong>GET</strong>: The resource has been fetched and is transmitted in the message body.
     * <br><strong>HEAD</strong>: The entity headers are in the message body.
     * <br><strong>PUT or POST</strong>: The resource describing the result of the action is transmitted in the message body.
     * <br><strong>TRACE</strong>: The message body contains the request message as received by the server
     * <br>
     */
    public final static int OK_200 = 200;

    /**
     * Successful responses (200–299)
     * <br><br>
     * The request has succeeded, and a new resource has been created as a result. This is typically the response sent after <strong>POST</strong> requests, or some <strong>PUT</strong> requests.
     */
    public final static int CREATED_201 = 201;

    /**
     * Successful responses (200–299)
     * <br><br>
     * The request has been received but not yet acted upon. It is noncommittal, since there is no way in HTTP to later send an asynchronous response indicating the outcome of the request. It is intended for cases where another process or server handles the request, or for batch processing.
     */
    public final static int ACCEPTED_202 = 202;

    /**
     * Successful responses (200–299)
     * <br><br>
     * This response code means the returned meta-information is not exactly the same as is available from the origin server, but is collected from a local or a third-party copy. This is mostly used for mirrors or backups of another resource. Except for that specific case, the "200 OK" response is preferred to this status.
     */
    public final static int NON_AUTHORITATIVE_INFORMATION_203 = 203;

    /**
     * Successful responses (200–299)
     * <br><br>
     * There is no content to send for this request, but the headers may be useful. The user-agent may update its cached headers for this resource with the new ones.
     */
    public final static int NO_CONTENT_204 = 204;

    /**
     * Successful responses (200–299)
     * <br><br>
     * Tells the user-agent to reset the document which sent this request.
     */
    public final static int REST_CONTENT_205 = 205;

    /**
     * Successful responses (200–299)
     * <br><br>
     * This response code is used when the Range header is sent from the client to request only part of a resource.
     */
    public final static int PARTIAL_CONTENT_206 = 206;

    /**
     * Successful responses (200–299)
     * <br><br>
     * Conveys information about multiple resources, for situations where multiple status codes might be appropriate.
     * <br>WebDAV
     */
    public final static int MULTI_STATUS_207 = 207;

    /**
     * Successful responses (200–299)
     * <br>WebDAV
     * <br><br>
     * Used inside a &lt;dav:propstat&gt; response element to avoid repeatedly enumerating the internal members of multiple bindings to the same collection.
     */
    public final static int ALREADY_REPORTED_208 = 208;

    /**
     * Successful responses (200–299)
     * <br>HTTP Delta encoding
     * <br><br>
     * The server has fulfilled a GET request for the resource, and the response is a representation of the result of one or more instance-manipulations applied to the current instance.
     */
    public final static int IM_USED_226 = 226;

    /**
     * Redirects (300–399)
     * <br><br>
     * The request has more than one possible response. The user-agent or user should choose one of them. (There is no standardized way of choosing one of the responses, but HTML links to the possibilities are recommended so the user can pick.)
     */
    public final static int MULTIPLE_CHOISES_300 = 300;

    /**
     * Redirects (300–399)
     * <br><br>
     * The URL of the requested resource has been changed permanently. The new URL is given in the response.
     */
    public final static int MOVED_PERMANENTLY_301 = 300;

    /**
     * Redirects (300–399)
     * <br><br>
     * This response code means that the URI of requested resource has been changed temporarily. Further changes in the URI might be made in the future. Therefore, this same URI should be used by the client in future requests.
     */
    public final static int FOUND_302 = 302;

    /**
     * Redirects (300–399)
     * <br><br>
     * The server sent this response to direct the client to get the requested resource at another URI with a GET request.
     */
    public final static int SEE_OTHER_303 = 303;

    /**
     * Redirects (300–399)
     * <br><br>
     * This is used for caching purposes. It tells the client that the response has not been modified, so the client can continue to use the same cached version of the response.
     */
    public final static int NOT_MODIFIED_304 = 304;

    /**
     * Redirects (300–399)
     * <br><br>
     * Defined in a previous version of the HTTP specification to indicate that a requested response must be accessed by a proxy. It has been deprecated due to security concerns regarding in-band configuration of a proxy.
     *
     * @deprecated
     */
    @Deprecated
    public final static int USE_PROXY_305 = 305;

    /**
     * Redirects (300–399)
     * <br><br>
     * This response code is no longer used; it is just reserved. It was used in a previous version of the HTTP/1.1 specification.
     *
     * @deprecated
     */
    @Deprecated
    public final static int UNUSED_306 = 306;

    /**
     * Redirects (300–399)
     * <br><br>
     * The server sends this response to direct the client to get the requested resource at another URI with same method that was used in the prior request. This has the same semantics as the 302 Found HTTP response code, with the exception that the user agent must not change the HTTP method used: If a POST was used in the first request, a POST must be used in the second request.
     */
    public final static int TEMPORARY_REDIRECT_307 = 307;

    /**
     * Redirects (300–399)
     * <br><br>
     * This means that the resource is now permanently located at another URI, specified by the Location: HTTP Response header. This has the same semantics as the 301 Moved Permanently HTTP response code, with the exception that the user agent must not change the HTTP method used: If a POST was used in the first request, a POST must be used in the second request.
     */
    public final static int PERMANENT_REDIRECT_308 = 308;

    /**
     * Client errors (400–499)
     * <br><br>
     * The server could not understand the request due to invalid syntax.
     */
    public final static int BAD_REQUEST_400 = 400;

    /**
     * Client errors (400–499)
     * <br><br>
     * Although the HTTP standard specifies "unauthorized", semantically this response means "unauthenticated". That is, the client must authenticate itself to get the requested response.
     */
    public final static int UNAUTHORIZED_401 = 401;

    /**
     * Client errors (400–499)
     * <br><br>
     * This response code is reserved for future use. The initial aim for creating this code was using it for digital payment systems, however this status code is used very rarely and no standard convention exists.
     */
    public final static int PAYMENT_REQUIRED_402 = 402;

    /**
     * Client errors (400–499)
     * <br><br>
     * The client does not have access rights to the content; that is, it is unauthorized, so the server is refusing to give the requested resource. Unlike 401, the client's identity is known to the server.
     */
    public final static int FORBIDDEN_403 = 403;

    /**
     * Client errors (400–499)
     * <br><br>
     * The server can not find the requested resource. In the browser, this means the URL is not recognized. In an API, this can also mean that the endpoint is valid but the resource itself does not exist. Servers may also send this response instead of 403 to hide the existence of a resource from an unauthorized client. This response code is probably the most famous one due to its frequent occurrence on the web.
     */
    public final static int NOT_FOUND_404 = 404;

    /**
     * Client errors (400–499)
     * <br><br>
     * The request method is known by the server but has been disabled and cannot be used. For example, an API may forbid DELETE-ing a resource. The two mandatory methods, GET and HEAD, must never be disabled and should not return this error code.
     */
    public final static int METHOD_NOT_ALLOWED_405 = 405;

    /**
     * Client errors (400–499)
     * <br><br>
     * This response is sent when the web server, after performing server-driven content negotiation, doesn't find any content that conforms to the criteria given by the user agent.
     */
    public final static int NOT_ACCEPTABLE = 406;

    /**
     * Client errors (400–499)
     * <br><br>
     * This is similar to 401 but authentication is needed to be done by a proxy.
     */
    public final static int PROXY_AUTHENTICATION_REQUIRED_407 = 407;

    /**
     * Client errors (400–499)
     * <br><br>
     * This response is sent on an idle connection by some servers, even without any previous request by the client. It means that the server would like to shut down this unused connection. This response is used much more since some browsers, like Chrome, Firefox 27+, or IE9, use HTTP pre-connection mechanisms to speed up surfing. Also note that some servers merely shut down the connection without sending this message.
     */
    public final static int REQUEST_TIMEOUT_408 = 408;

    /**
     * Client errors (400–499)
     * <br><br>
     * This response is sent when a request conflicts with the current state of the server.
     */
    public final static int CONFLICT_409 = 409;

    /**
     * Client errors (400–499)
     * <br><br>
     * This response is sent when the requested content has been permanently deleted from server, with no forwarding address. Clients are expected to remove their caches and links to the resource. The HTTP specification intends this status code to be used for "limited-time, promotional services". APIs should not feel compelled to indicate resources that have been deleted with this status code.
     */
    public final static int GONE_410 = 410;

    /**
     * Client errors (400–499)
     * <br><br>
     * Server rejected the request because the Content-Length header field is not defined and the server requires it.
     */
    public final static int LENGTH_REQUIRED_411 = 411;

    /**
     * Client errors (400–499)
     * <br><br>
     * The client has indicated preconditions in its headers which the server does not meet.
     */
    public final static int PRECONDITION_FAILED = 412;

    /**
     * Client errors (400–499)
     * <br><br>
     * Request entity is larger than limits defined by server; the server might close the connection or return an Retry-After header field.
     */
    public final static int PAYLOAD_TOO_LARGE_413 = 413;

    /**
     * Client errors (400–499)
     * <br><br>
     * The URI requested by the client is longer than the server is willing to interpret.
     */
    public final static int URI_TOO_LONG_414 = 414;

    /**
     * Client errors (400–499)
     * <br><br>
     * The media format of the requested data is not supported by the server, so the server is rejecting the request.
     */
    public final static int UNSUPPORTED_MEDIA_TYPE_415 = 415;

    /**
     * Client errors (400–499)
     * <br><br>
     * The range specified by the Range header field in the request can't be fulfilled; it's possible that the range is outside the size of the target URI's data
     */
    public final static int RANGE_NOT_SATISFIABLE_416 = 416;

    /**
     * Client errors (400–499)
     * <br><br>
     * This response code means the expectation indicated by the Expect request header field can't be met by the server.
     */
    public final static int EXPECTATION_FAILED_417 = 417;

    /**
     * Client errors (400–499)
     * <br><br>
     * The server refuses the attempt to brew coffee with a teapot.
     */
    public final static int I_AM_A_TEAPOT_418 = 418;

    /**
     * Client errors (400–499)
     * <br><br>
     * The request was directed at a server that is not able to produce a response. This can be sent by a server that is not configured to produce responses for the combination of scheme and authority that are included in the request URI.
     */
    public final static int MISDIRECTED_REQUEST_421 = 421;

    /**
     * Client errors (400–499)
     * <br>WebDAV
     * <br><br>
     * The request was well-formed but was unable to be followed due to semantic errors.
     */
    public final static int UNPROCESSABLE_ENTITY_422 = 422;

    /**
     * Client errors (400–499)
     * <br>WebDAV
     * <br><br>
     * The resource that is being accessed is locked.
     */
    public final static int LOCKED_423 = 423;

    /**
     * Client errors (400–499)
     * <br>WebDAV
     * <br><br>
     * The request failed due to failure of a previous request.
     */
    public final static int FAILED_DEPENDENCY_424 = 424;

    /**
     * Client errors (400–499)
     * <br><br>
     * Indicates that the server is unwilling to risk processing a request that might be replayed.
     */
    public final static int TOO_EARLY_425 = 425;

    /**
     * Client errors (400–499)
     * <br><br>
     * The server refuses to perform the request using the current protocol but might be willing to do so after the client upgrades to a different protocol. The server sends an Upgrade header in a 426 response to indicate the required protocol(s).
     */
    public final static int UPGRADE_REQUIRED_426 = 426;

    /**
     * Client errors (400–499)
     * <br><br>
     * The origin server requires the request to be conditional. This response is intended to prevent the 'lost update' problem, where a client GETs a resource's state, modifies it, and PUTs it back to the server, when meanwhile a third party has modified the state on the server, leading to a conflict.
     */
    public final static int PRECONDITION_REQUIRED_428 = 428;

    /**
     * Client errors (400–499)
     * <br><br>
     * The user has sent too many requests in a given amount of time ("rate limiting").
     */
    public final static int TOO_MANY_REQUESTS_429 = 429;

    /**
     * Client errors (400–499)
     * <br><br>
     * The server is unwilling to process the request because its header fields are too large. The request may be resubmitted after reducing the size of the request header fields.
     */
    public final static int REQUEST_HEADER_FIELDS_TOO_LARGE_431 = 431;

    /**
     * Client errors (400–499)
     * <br><br>
     * The user-agent requested a resource that cannot legally be provided, such as a web page censored by a government.
     */
    public final static int UNAVAILABLE_FOR_LEGAL_REASONS_451 = 451;

    /**
     * Server errors (500–599)
     * <br><br>
     * The server has encountered a situation it doesn't know how to handle.
     */
    public final static int INTERNAL_SERVER_ERROR_500 = 500;

    /**
     * Server errors (500–599)
     * <br><br>
     * The request method is not supported by the server and cannot be handled. The only methods that servers are required to support (and therefore that must not return this code) are GET and HEAD.
     */
    public final static int NOT_IMPLEMENTED_501 = 501;

    /**
     * Server errors (500–599)
     * <br><br>
     * This error response means that the server, while working as a gateway to get a response needed to handle the request, got an invalid response.
     */
    public final static int BAD_GATEWAY_502 = 502;

    /**
     * Server errors (500–599)
     * <br><br>
     * The server is not ready to handle the request. Common causes are a server that is down for maintenance or that is overloaded. Note that together with this response, a user-friendly page explaining the problem should be sent. This responses should be used for temporary conditions and the Retry-After: HTTP header should, if possible, contain the estimated time before the recovery of the service. The webmaster must also take care about the caching-related headers that are sent along with this response, as these temporary condition responses should usually not be cached.
     */
    public final static int SERVICE_UNAVAILABLE_503 = 503;

    /**
     * Server errors (500–599)
     * <br><br>
     * This error response is given when the server is acting as a gateway and cannot get a response in time.
     */
    public final static int GATEWAY_TIMEOUT_504 = 504;

    /**
     * Server errors (500–599)
     * <br><br>
     * The HTTP version used in the request is not supported by the server.
     */
    public final static int HTTP_VERSION_NOT_SUPPORTED_505 = 505;

    /**
     * Server errors (500–599)
     * <br><br>
     * The server has an internal configuration error: the chosen variant resource is configured to engage in transparent content negotiation itself, and is therefore not a proper end point in the negotiation process.
     */
    public final static int VARIANT_ALSO_NEGOTIATES_506 = 506;

    /**
     * Server errors (500–599)
     * <br>WebDAV
     * <br><br>
     * The method could not be performed on the resource because the server is unable to store the representation needed to successfully complete the request.
     */
    public final static int INSUFFICIENT_STORAGE_507 = 507;

    /**
     * Server errors (500–599)
     * <br><br>
     * The server detected an infinite loop while processing the request.
     */
    public final static int LOOP_DETECTED_508 = 508;

    /**
     * Server errors (500–599)
     * <br><br>
     * Further extensions to the request are required for the server to fulfil it.
     */
    public final static int NET_EXTENDED_510 = 510;

    /**
     * Server errors (500–599)
     * <br><br>
     * The 511 status code indicates that the client needs to authenticate to gain network access.
     */
    public final static int NETWORK_AUTHENTICATION_REQUIRED_511 = 511;

}
