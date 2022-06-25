package tech.becoming.common.constants;

/**
 * Headers can be grouped according to their contexts:
 * <br>
 * <br><strong>General headers</strong> apply to both requests and responses, but with no relation to the data transmitted in the body.
 * <br><strong>Request headers</strong> contain more information about the resource to be fetched, or about the client requesting the resource.
 * <br><strong>Response headers</strong> hold additional information about the response, like its location or about the server providing it.
 * <br><strong>Entity headers</strong> contain information about the body of the resource, like its content length or MIME type.
 * <br>
 * Other groupings are available.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers">HTTP headers</a>
 */
@SuppressWarnings("ALL")
public class HttpHeader {

    private HttpHeader() {
    }

    /**
     * Authentication
     * <br>Response header
     * <br><br>
     * Defines the authentication method that should be used to access a resource.
     * <pre>{@code
     * WWW-Authenticate: <type> realm=<realm>
     * }</pre>
     */
    public static final String WWW_AUTHENTICATE = "WWW-Authenticate";

    /**
     * Authentication
     * <br>Request header
     * <br><br>
     * Contains the credentials to authenticate a user-agent with a server.
     * <pre>{@code
     *  Authorization: <type> <credentials>
     * }</pre>
     * <br>
     */
    public static final String AUTHORIZATION = "Authorization";

    /**
     * Authentication
     * <br>Response header
     * <br><br>
     * Defines the authentication method that should be used to access a resource behind a proxy server.
     * <pre>{@code
     * Proxy-Authenticate: <type> realm=<realm>
     * }</pre>
     */
    public static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";

    /**
     * Authentication
     * <br>Request header
     * <br><br>
     * Contains the credentials to authenticate a user agent with a proxy server.
     * <pre>{@code
     * Proxy-Authorization: <type> <credentials>
     * }</pre>
     */
    public static final String PROXY_AUTHORIZATION = "Proxy-Authorization";

    /**
     * Caching
     * <br>Response header
     * <br><br>
     * The time, in seconds, that the object has been in a proxy cache.
     * <pre>{@code
     * Age: <delta-seconds>
     * }</pre>
     */
    public static final String AGE = "Age";

    /**
     * Caching
     * <br>General header
     * <br><br>
     * Directives for caching mechanisms in both requests and responses.
     * <pre>{@code
     * Cache-Control: max-age=<seconds>
     * Cache-Control: max-stale[=<seconds>]
     * Cache-Control: min-fresh=<seconds>
     * Cache-Control: no-cache
     * Cache-Control: no-store
     * Cache-Control: no-transform
     * Cache-Control: only-if-cached
     * }</pre>
     */
    public static final String CACHE_CONTROL = "Cache-Control";

    /**
     * Caching
     * <br>Response header
     * <br><br>
     * Clears browsing data (e.g. cookies, storage, cache) associated with the requesting website.
     * <pre>{@code
     * // Single directive
     * Clear-Site-Data: "cache"
     *
     * // Multiple directives (comma separated)
     * Clear-Site-Data: "cache", "cookies", "storage", "executionContexts"
     *
     * // Wild card
     * Clear-Site-Data: "*"
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Clear-Site-Data#Directives">Directives</a>
     */
    public static final String CLEAR_SITE_DATA = "Clear-Site-Data";

    /**
     * Caching
     * <br>Response header
     * <br><br>
     * The date/time after which the response is considered stale.
     * <pre>{@code
     * Expires: <http-date>
     * }</pre>
     */
    public static final String EXPIRES = "Expires";

    /**
     * Caching
     * <br>General header
     * <br><br>
     * Implementation-specific header that may have various effects anywhere along the request-response chain. Used for backwards compatibility with HTTP/1.0 caches where the Cache-Control header is not yet present.
     * <br>
     * <br>
     * <strong>Note</strong>: Pragma is not specified for HTTP responses and is therefore not a reliable replacement for the general HTTP/1.1 Cache-Control header, although it does behave the same as Cache-Control: no-cache, if the Cache-Control header field is omitted in a request. Use Pragma only for backwards compatibility with HTTP/1.0 clients.
     * <pre>{@code
     * Pragma: no-cache
     * }</pre>
     */
    public static final String PRAGMA = "Pragma";

    /**
     * Caching
     * <br>General header
     * <br><br>
     * General warning information about possible problems.
     * <pre>{@code
     * Warning: <warn-code> <warn-agent> <warn-text> [<warn-date>]
     * Example:
     * Warning: 110 anderson/1.3.37 "Response is stale"
     * Warning: 112 - "cache down" "Wed, 21 Oct 2015 07:28:00 GMT"
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Warning#Directives">Directives</a>
     */
    public static final String WARNING = "Warning";

    /**
     * Client hints
     * <br>Response header
     * <br>HTML5
     * <br><br>
     * Servers can advertise support for Client Hints using the Accept-CH header field or an equivalent HTML &lt;metq&gt; element with http-equiv attribute
     * <pre>{@code
     * Accept-CH: <list of client hints>
     *
     * Examples
     * Accept-CH: DPR, Viewport-Width
     * Accept-CH: Width
     * Accept-CH-Lifetime: 86400
     * Vary: DPR, Viewport-Width, Width
     * }</pre>
     */
    public static final String ACCEPT_CH = "Accept-CH";

    /**
     * Client hints
     * <br>Response header
     * <br><br>
     * Servers can ask the client to remember the set of Client Hints that the server supports for a specified period of time, to enable delivery of Client Hints on subsequent requests to the server’s origin (RFC6454).
     * <pre>{@code
     * Accept-CH-Lifetime: <age>
     *
     * Examples
     * Accept-CH: Viewport-Width, DPR
     * Accept-CH-Lifetime: 86400
     * }</pre>
     */
    public static final String ACCEPT_CH_LIFETIME = "Accept-CH-Lifetime";

    /**
     * Client hints
     * <br>Request header
     * <br><br>
     * Indicates that the request has been conveyed in early data.
     * <pre>{@code
     * Early-Data: 1
     * }</pre>
     */
    public static final String EARLY_DATA = "Early-Data";

    /**
     * Client hints
     * <br><br>
     * A number that indicates the ratio between physical pixels over CSS pixels of the selected image response.
     */
    public static final String CONTENT_DPR = "Content-DPR";

    /**
     * Client hints
     * <br>Request header
     * <br><br>
     * A number that indicates the client’s current Device Pixel Ratio (DPR), which is the ratio of physical pixels over CSS pixels (Section 5.2 of [CSSVAL]) of the layout viewport (Section 9.1.1 of [CSS2]) on the device.
     * <pre>{@code
     * DPR: <number>
     *
     * Examples
     * Server first needs to opt in to receive DPR header by sending the response headers Accept-CH containing DPR and Accept-CH-Lifetime.
     *
     * Accept-CH: DPR
     * Accept-CH-Lifetime: 86400
     *
     * Then on subsequent requests the client might send DPR header back:
     *
     * DPR: 1.0
     * }</pre>
     */
    public static final String DPR = "DPR";

    /**
     * Client hints
     * <br>Request header
     * <br><br>
     * Technically a part of Device Memory API, this header represents an approximate amount of RAM client has.
     * <pre>{@code
     * Device-Memory: <number>
     *
     * Examples
     *
     * Server first needs to opt in to receive Device-Memory header by sending the response headers Accept-CH containing Device-Memory and Accept-CH-Lifetime.
     *
     * Accept-CH: Device-Memory
     * Accept-CH-Lifetime: 86400
     *
     * Then on subsequent requests the client might send Device-Memory header back:
     *
     * Device-Memory: 1
     * }</pre>
     */
    public static final String DEVICE_MEMORY = "Device-Memory";

    /**
     * Client hints
     * <br><br>
     * A boolean that indicates the user agent's preference for reduced data usage.
     * <pre>{@code
     * Save-Data: <sd-token>
     *
     * <sd-token> A numerical value indicating whether the client wants to opt in to reduced data usage mode. "on" indicates yes, while "off" (the default) indicates no.
     * }</pre>
     */
    public static final String SAVE_DATA = "Save-Data";

    /**
     * Client hints
     * <br><br>
     * A number that indicates the layout viewport width in CSS pixels. The provided pixel value is a number rounded to the smallest following integer (i.e. ceiling value).
     * <br>
     * <br>
     * If Viewport-Width occurs in a message more than once, the last value overrides all previous occurrences.
     */
    public static final String VIEWPORT_WIDTH = "Viewport-Width";

    /**
     * Client hints
     * <br><br>
     * The Width request header field is a number that indicates the desired resource width in physical pixels (i.e. intrinsic size of an image). The provided pixel value is a number rounded to the smallest following integer (i.e. ceiling value).
     * <br><br>
     * If the desired resource width is not known at the time of the request or the resource does not have a display width, the Width header field can be omitted. If Width occurs in a message more than once, the last value overrides all previous occurrences
     */
    public static final String WIDTH = "Width";

    /**
     * Conditionals
     * <br>Response header
     * <br><br>
     * The last modification date of the resource, used to compare several versions of the same resource. It is less accurate than ETag, but easier to calculate in some environments. Conditional requests using If-Modified-Since and If-Unmodified-Since use this value to change the behavior of the request.
     * <pre>{@code
     * Last-Modified: &lt;day-name&gt;, &lt;day&gt; &lt;month&gt; &lt;year&gt; &lt;hour&gt;:&lt;minute&gt;:&lt;second&gt; GMT
     *
     * <month> One of "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" (case sensitive).
     *
     * Examples
     *
     * Last-Modified: Wed, 21 Oct 2015 07:28:00 GMT
     * Last-Modified: Wed, 04 Jan 2015 07:28:00 GMT
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Last-Modified#Directives">Directives</a>
     */
    public static final String LAST_MODIFIED = "Last-Modified";

    /**
     * Conditionals
     * <br>Response header
     * <br><br>
     * A unique string identifying the version of the resource. Conditional requests using If-Match and If-None-Match use this value to change the behavior of the request.
     * <pre>{@code
     * ETag: W/"<etag_value>"
     * ETag: "<etag_value>"
     *
     * Examples
     *
     * ETag: "33a64df551425fcc55e4d42a148795d9f25f89d4"
     * ETag: W/"0815"
     * }</pre>
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/ETag#Directives">Directives</a>
     */
    public static final String ETAG = "ETag";

    /**
     * Conditionals
     * <br>Request header
     * <br><br>
     * Makes the request conditional, and applies the method only if the stored resource matches one of the given ETags.
     * <pre>{@code
     * If-Match: <etag_value>
     * If-Match: <etag_value>, <etag_value>, …
     *
     * <etag_value> Entity tags uniquely representing the requested
     * resources. They are a string of ASCII characters placed
     * between double quotes (like "675af34563dc-tr34").
     * They may be prefixed by W/ to indicate that they are "weak",
     * i.e. that they represent the resource semantically,
     * but not byte-for-byte. However, in an If-Match header,
     * weak entity tags will never match.
     *
     * Examples
     *
     * If-Match: "bfc13a64729c4290ef5b2c2730249c88ca92d82d"
     * If-Match: "67ab43", "54ed21", "7892dd"
     * If-Match: *
     * }</pre>
     */
    public static final String IF_MATCH = "If-Match";

    /**
     * Conditionals
     * <br>Request header
     * <br><br>
     * Makes the request conditional, and applies the method only if the stored resource doesn't match any of the given ETags. This is used to update caches (for safe requests), or to prevent to upload a new resource when one already exists.
     * <pre>{@code
     * If-None-Match: "<etag_value>"
     * If-None-Match: "<etag_value>", "<etag_value>", …
     * If-None-Match: *
     *
     * Examples
     *
     * If-None-Match: "bfc13a64729c4290ef5b2c2730249c88ca92d82d"
     * If-None-Match: W/"67ab43", "54ed21", "7892dd"
     * If-None-Match: *
     * }</pre>
     */
    public static final String IF_NONE_MATCH = "If-None-Match";

    /**
     * Conditionals
     * <br>Request header
     * <br><br>
     * Makes the request conditional, and expects the entity to be transmitted only if it has been modified after the given date. This is used to transmit data only when the cache is out of date.
     * <pre>{@code
     * If-Modified-Since: <day-name>, <day> <month> <year> <hour>:<minute>:<second> GMT
     *
     * Examples
     *
     * If-Modified-Since: Wed, 21 Oct 2015 07:28:00 GMT
     *
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-Modified-Since#Directives">Directives</a>
     */
    public static final String IF_MODIFIED_SINCE = "If-Modified-Since";

    /**
     * Conditionals
     * <br>Request header
     * <br><br>
     * Makes the request conditional, and expects the entity to be transmitted only if it has not been modified after the given date. This ensures the coherence of a new fragment of a specific range with previous ones, or to implement an optimistic concurrency control system when modifying existing documents.
     * <pre>{@code
     * If-Unmodified-Since: <day-name>, <day> <month> <year> <hour>:<minute>:<second> GMT
     *
     * Examples
     *
     * If-Unmodified-Since: Wed, 21 Oct 2015 07:28:00 GMT
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-Unmodified-Since#Directives">Directives</a>
     */
    public static final String IF_UNMODIFIED_SINCE = "If-Unmodified-Since";

    /**
     * Conditionals
     * <br>Response header
     * <br><br>
     * Determines how to match request headers to decide whether a cached response can be used rather than requesting a fresh one from the origin server.
     * <pre>{@code
     * Vary: *
     * Vary: <header-name>, <header-name>, ...
     *
     * Examples
     * Dynamic serving
     *
     * When using the Vary: User-Agent header, caching servers should
     * consider the user agent when deciding whether to serve the page
     * from cache. For example, if you are serving different content
     * to mobile users, it can help you to avoid that a cache may
     * mistakenly serve a desktop version of your site to
     * your mobile users. It can help Google and other
     * search engines to discover the mobile version of a page,
     * and might also tell them that no Cloaking is intended.
     *
     * Vary: User-Agent
     * }</pre>
     */
    public static final String VARY = "Vary";

    /**
     * Connection management
     * <br>General header
     * <br><br>
     * Controls whether the network connection stays open after the current transaction finishes.
     * <pre>{@code
     * Connection: keep-alive
     * Connection: close
     * }</pre>
     */
    public static final String CONNECTION = "Connection";

    /**
     * Connection management
     * <br>General header
     * <br><br>
     * Controls how long a persistent connection should stay open.
     * <pre>{@code
     * Keep-Alive: parameters
     *
     * Examples
     *
     * A response containing a Keep-Alive header:
     *
     * HTTP/1.1 200 OK
     * Connection: Keep-Alive
     * Content-Encoding: gzip
     * Content-Type: text/html; charset=utf-8
     * Date: Thu, 11 Aug 2016 15:23:13 GMT
     * Keep-Alive: timeout=5, max=1000
     * Last-Modified: Mon, 25 Jul 2016 04:32:39 GMT
     * Server: Apache
     *
     * (body)
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Keep-Alive#Directives">Directives</a>
     */
    public static final String KEEP_ALIVE = "Keep-Alive";

    /**
     * Content negotiation
     * <br>Request header
     * <br><br>
     * Informs the server about the types of data that can be sent back.
     * <pre>{@code
     * Accept: <MIME_type>/<MIME_subtype>
     * Accept: <MIME_type>/*
     * Accept: * / *
     * --> no spaces between wildcard and slash
     *
     * // Multiple types, weighted with the quality value syntax:
     * Accept:text/html,application/xhtml+xml,application/xml;q=0.9,image/webp, * / *;q=0.8
     *
     * Examples
     *
     * Accept: text/html
     *
     * Accept: image/*
     *
     * // General default
     * Accept: * / *
     * --> no spaces between wildcard and slash
     *
     * // Default for navigation requests
     * Accept:text/html,application/xhtml+xml,application/xml;q=0.9,* / *;q=0.8
     * }</pre>
     */
    public static final String Accept = "Accept";

    /**
     * Content negotiation
     * <br>Request header
     * <br><br>
     * Which character encodings the client understands.
     * <pre>{@code
     * Accept-Charset: <charset>
     *
     * // Multiple types, weighted with the quality value syntax:
     * Accept-Charset: utf-8, iso-8859-1;q=0.5
     *
     * Examples
     *
     * Accept-Charset: iso-8859-1
     * Accept-Charset: utf-8, iso-8859-1;q=0.5
     * Accept-Charset: utf-8, iso-8859-1;q=0.5, *;q=0.1
     *
     * }</pre>
     */
    public static final String ACCEPT_CHARSET = "Accept-Charset";

    /**
     * Content negotiation
     * <br>Request header
     * <br><br>
     * The encoding algorithm, usually a compression algorithm, that can be used on the resource sent back.
     * <pre>{@code
     * Accept-Encoding: gzip
     * Accept-Encoding: compress
     * Accept-Encoding: deflate
     * Accept-Encoding: br
     * Accept-Encoding: identity
     * Accept-Encoding: *
     *
     * // Multiple algorithms, weighted with the quality value syntax:
     * Accept-Encoding: deflate, gzip;q=1.0, *;q=0.5
     *
     * Examples
     *
     * Accept-Encoding: gzip
     * Accept-Encoding: gzip, compress, br
     * Accept-Encoding: br;q=1.0, gzip;q=0.8, *;q=0.1
     * }</pre>
     */
    public static final String ACCEPT_ENCODING = "Accept-Encoding";

    /**
     * Content negotiation
     * <br>Request header
     * <br><br>
     * Informs the server about the human language the server is expected to send back. This is a hint and is not necessarily under the full control of the user: the server should always pay attention not to override an explicit user choice (like selecting a language from a dropdown).
     * <pre>{@code
     * Accept-Language: <language>
     * Accept-Language: *
     *
     * // Multiple types, weighted with the quality value syntax:
     * Accept-Language: fr-CH, fr;q=0.9, en;q=0.8, de;q=0.7, *;q=0.5
     *
     * Examples
     *
     * Accept-Language: de
     * Accept-Language: de-CH
     * Accept-Language: en-US,en;q=0.5
     * }</pre>
     */
    public static final String ACCEPT_LANGUAGE = "Accept-Language";

    /**
     * Controls
     * <br>Request header
     * <br><br>
     * Indicates expectations that need to be fulfilled by the server to properly handle the request.
     * <pre>{@code
     * Expect: 100-continue
     * }</pre>
     * <br>
     * Examples<br>
     * Large message body
     * <br>
     * A client sends a request with a Expect header and waits for the server to respond before sending the message body.
     * <br>
     * PUT /somewhere/fun HTTP/1.1<br>
     * Host: origin.example.com<br>
     * Content-Type: video/h264<br>
     * Content-Length: 1234567890987<br>
     * Expect: 100-continue<br>
     * <br>
     * The server now checks the request headers and may respond with a 100 (Continue) response to instruct the client to go ahead and send the message body, or it will send a 417 (Expectation Failed) status if any of the expectations cannot be met.
     */
    public static final String EXPECT = "Expect";

    /**
     * Cookies
     * <br><br>
     * Contains stored HTTP cookies previously sent by the server with the Set-Cookie header.
     * <pre>{@code
     * Cookie: <cookie-list>
     * Cookie: name=value
     * Cookie: name=value; name2=value2; name3=value3
     *
     * Examples
     *
     * Cookie: PHPSESSID=298zf09hf012fh2; csrftoken=u32t4o3tb3gg43; _gat=1;
     * }</pre>
     */
    public static final String COOKIE = "Cookie";

    /**
     * Cookies
     * <br>Response header
     * <br><br>
     * Send cookies from the server to the user-agent.
     * <pre>{@code
     * Set-Cookie: <cookie-name>=<cookie-value>
     * Set-Cookie: <cookie-name>=<cookie-value>; Expires=<date>
     * Set-Cookie: <cookie-name>=<cookie-value>; Max-Age=<non-zero-digit>
     * Set-Cookie: <cookie-name>=<cookie-value>; Domain=<domain-value>
     * Set-Cookie: <cookie-name>=<cookie-value>; Path=<path-value>
     * Set-Cookie: <cookie-name>=<cookie-value>; Secure
     * Set-Cookie: <cookie-name>=<cookie-value>; HttpOnly
     *
     * Set-Cookie: <cookie-name>=<cookie-value>; SameSite=Strict
     * Set-Cookie: <cookie-name>=<cookie-value>; SameSite=Lax
     * Set-Cookie: <cookie-name>=<cookie-value>; SameSite=None
     *
     * // Multiple directives are also possible, for example:
     * Set-Cookie: <cookie-name>=<cookie-value>; Domain=<domain-value>; Secure; HttpOnly
     *
     * Examples
     * Session cookie
     *
     * Session cookies are removed when the client shuts down. Cookies are session cookies if they don't specify the Expires or Max-Age directives.
     *
     * Set-Cookie: sessionId=38afes7a8
     *
     * Permanent cookie
     *
     * Instead of expiring when the client is closed, permanent cookies expire at a specific date (Expires) or after a specific length of time (Max-Age).
     *
     * Set-Cookie: id=a3fWa; Expires=Wed, 21 Oct 2015 07:28:00 GMT
     *
     * Set-Cookie: id=a3fWa; Max-Age=2592000
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Set-Cookie#Directives">Directives</a>
     */
    public static final String SET_COOKIE = "Set-Cookie";

    /**
     * @deprecated Cookies
     * Contains an HTTP cookie previously sent by the server with the Set-Cookie2 header, but has been obsoleted. Use Cookie instead
     */
    @Deprecated
    public static final String COOKIE_2 = "Cookie2";

    /**
     * @deprecated Cookies
     * Contains an HTTP cookie previously sent by the server with the Set-Cookie2 header, but has been obsoleted. Use Cookie instead
     */
    @Deprecated
    public static final String SET_COOKIE_2 = "Set-Cookie2";

    /**
     * CORS
     * <br>Response header
     * <br><br>
     * Indicates whether the response can be shared.
     * <pre>{@code
     * Access-Control-Allow-Origin: *
     * Access-Control-Allow-Origin: <origin>
     * Access-Control-Allow-Origin: null
     *
     * Examples
     *
     * Access-Control-Allow-Origin: *
     * Access-Control-Allow-Origin: https://developer.mozilla.org
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin#Directives">Directives</a>
     */
    public static final String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";

    /**
     * CORS
     * <br>Response header
     * <br><br>
     * Indicates whether the response to the request can be exposed when the credentials flag is true.
     * <pre>{@code
     * Access-Control-Allow-Credentials: true
     *
     * Examples
     *
     * Allow credentials:
     *
     * Access-Control-Allow-Credentials: true
     *
     * Using XHR with credentials:
     *
     * var xhr = new XMLHttpRequest();
     * xhr.open('GET', 'http://example.com/', true);
     * xhr.withCredentials = true;
     * xhr.send(null);
     *
     * Using Fetch with credentials:
     *
     * fetch(url, {
     *   credentials: 'include'
     * })
     *
     * }</pre>
     */
    public static final String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";

    /**
     * CORS
     * <br>Response header
     * <br><br>
     * Used in response to a preflight request to indicate which HTTP headers can be used when making the actual request.
     * <pre>{@code
     * Access-Control-Allow-Headers: <header-name>[, <header-name>]*
     * Access-Control-Allow-Headers: *
     *
     * Examples
     *
     * Access-Control-Allow-Headers: X-Custom-Header
     * }</pre>
     */
    public static final String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";

    /**
     * CORS
     * <br>Response header
     * <br><br>
     * Specifies the methods allowed when accessing the resource in response to a preflight request.
     * <pre>{@code
     * Access-Control-Allow-Methods: <method>, <method>, ...
     * Access-Control-Allow-Methods: *
     *
     * Examples
     *
     * Access-Control-Allow-Methods: POST, GET, OPTIONS
     * Access-Control-Allow-Methods: *
     * }</pre>
     */
    public static final String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";

    /**
     * CORS
     * <br>Response header
     * <br><br>
     * Indicates which headers can be exposed as part of the response by listing their names.
     * <pre>{@code
     * Access-Control-Expose-Headers: <header-name>, <header-name>, ...
     * Access-Control-Expose-Headers: *
     *
     * Examples
     *
     * To expose a non-CORS-safelisted request header,
     * you can specify:
     *
     * Access-Control-Expose-Headers: Content-Length
     *
     * To additionally expose a custom header,
     * like X-Kuma-Revision, you can specify
     * multiple headers separated by a comma:
     *
     * Access-Control-Expose-Headers: Content-Length, X-Kuma-Revision
     *
     * In requests without credentials,
     * you can also use a wildcard value:
     *
     * Access-Control-Expose-Headers: *
     *
     * However, this won't wildcard the Authorization header,
     * so if you need to expose that,
     * you will need to list it explicitly:
     *
     * Access-Control-Expose-Headers: *, Authorization
     * }</pre>
     */
    public static final String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";

    /**
     * CORS
     * <br>Response header
     * <br><br>
     * Indicates how long the results of a preflight request can be cached.
     * <pre>{@code
     * Access-Control-Max-Age: <delta-seconds>
     *
     *     Examples
     *
     * Cache results of a preflight request for 10 minutes:
     *
     * Access-Control-Max-Age: 600
     *
     * }</pre>
     */
    public static final String ACCESS_CONTROL_MAX_AGE = "Access-Control-Max-Age";

    /**
     * CORS
     * <br>Request header
     * <br><br>
     * Used when issuing a preflight request to let the server know which HTTP headers will be used when the actual request is made.
     * <pre>{@code
     * Access-Control-Request-Headers: <header-name>, <header-name>, ...
     *
     * Examples
     *
     * Access-Control-Request-Headers: X-PINGOTHER, Content-Type
     * }</pre>
     */
    public static final String ACCESS_CONTROL_REQUEST_HEADERS = "Access-Control-Request-Headers";

    /**
     * CORS
     * <br>Request header
     * <br><br>
     * Used when issuing a preflight request to let the server know which HTTP method will be used when the actual request is made.
     * <pre>{@code
     * Access-Control-Request-Method: <method>
     *
     * Examples
     *
     * Access-Control-Request-Method: POST
     * }</pre>
     */
    public static final String ACCESS_CONTROL_REQUEST_METHOD = "Access-Control-Request-Method";

    /**
     * CORS
     * <br>Request header
     * <br><br>
     * Indicates where a fetch originates from.
     * <pre>{@code
     * Origin: null
     * Origin: <scheme> "://" <hostname> [ ":" <port> ]
     *
     * Examples
     *
     * Origin: https://developer.mozilla.org
     * }</pre>
     */
    public static final String ORIGIN = "Origin";

    /**
     * CORS
     * <br>Response header
     * <br><br>
     * Specifies origins that are allowed to see values of attributes retrieved via features of the Resource Timing API, which would otherwise be reported as zero due to cross-origin restrictions.
     * <pre>{@code
     * Timing-Allow-Origin: *
     * Timing-Allow-Origin: <origin>[, <origin>]*
     *
     * Examples
     *
     * To allow any resource to see timing resources:
     *
     * Timing-Allow-Origin: *
     *
     * To allow https://developer.mozilla.org
     * to see timing resources, you can specify:
     *
     * Timing-Allow-Origin: https://developer.mozilla.org
     * }</pre>
     */
    public static final String TIMING_ALLOW_ORIGIN = "Timing-Allow-Origin";

    /**
     * Do Not Track
     * <br>Request header
     * <br><br>
     * Expresses the user's tracking preference.
     * <pre>{@code
     * DNT: 0
     * DNT: 1
     *
     * Examples
     * Reading Do Not Track status from JavaScript
     *
     * The user's DNT preference can also be read
     * from JavaScript using the
     * Navigator.doNotTrack property:
     *
     * navigator.doNotTrack; // "0" or "1"
     * }</pre>
     */
    public static final String DNT = "DNT";

    /**
     * Do Not Track
     * <br>Response header
     * <br><br>
     * Indicates the tracking status of the corresponding response.
     * <pre>{@code
     * Tk: !  (under construction)
     * Tk: ?  (dynamic)
     * Tk: G  (gateway or multiple parties)
     * Tk: N  (not tracking)
     * Tk: T  (tracking)
     * Tk: C  (tracking with consent)
     * Tk: P  (potential consent)
     * Tk: D  (disregarding DNT)
     * Tk: U  (updated)
     *
     * Examples
     *
     * A Tk header for a resource that claims
     * not to be tracking would look like:
     *
     * Tk: N
     * }</pre>
     */
    public static final String TK = "Tk";

    /**
     * Downloads
     * <br>Response header (for the main body)
     * <br>General header (for a subpart of a multipart
     * <br><br>
     * Indicates if the resource transmitted should be displayed inline (default behavior without the header), or if it should be handled like a download and the browser should present a “Save As” dialog.
     * <pre>{@code
     * As a response header for the main body
     *
     * Content-Disposition: inline
     * Content-Disposition: attachment
     * Content-Disposition: attachment; filename="filename.jpg"
     *
     * As a header for a multipart body
     *
     * Content-Disposition: form-data
     * Content-Disposition: form-data; name="fieldName"
     * Content-Disposition: form-data; name="fieldName"; filename="filename.jpg"
     *
     * Examples
     *
     * A response triggering the "Save As" dialog:
     *
     * 200 OK
     * Content-Type: text/html; charset=utf-8
     * Content-Disposition: attachment; filename="cool.html"
     * Content-Length: 21
     *
     * <HTML>Save me!</HTML>
     *
     * -------------------------
     *
     * An example of an HTML form posted
     * using the multipart/form-data format
     * that makes use of the Content-Disposition header:
     *
     * POST /test.html HTTP/1.1
     * Host: example.org
     * Content-Type: multipart/form-data;boundary="boundary"
     *
     * --boundary
     * Content-Disposition: form-data; name="field1"
     *
     * value1
     * --boundary
     * Content-Disposition: form-data; name="field2"; filename="example.txt"
     *
     * value2
     * --boundary--
     * }</pre>
     */
    public static final String CONTENT_DISPOSITION = "Content-Disposition";

    /**
     * Message body information
     * <br>Entity header
     * <br><br>
     * The size of the resource, in decimal number of bytes.
     * <pre>{@code
     * Content-Length: <length>
     *
     * <length> The length in decimal number of octets.
     * }</pre>
     */
    public static final String CONTENT_LENGTH = "Content-Length";

    /**
     * Message body information
     * <br>Entity header
     * <br><br>
     * Indicates the media type of the resource.
     * <pre>{@code
     * Content-Type: text/html; charset=UTF-8
     * Content-Type: multipart/form-data; boundary=something
     *
     * Examples
     *
     * POST /foo HTTP/1.1
     * Content-Length: 68137
     * Content-Type: multipart/form-data; boundary=---------------------------974767299852498929531610575
     *
     * -----------------------------974767299852498929531610575
     * Content-Disposition: form-data; name="description"
     *
     * some text
     * -----------------------------974767299852498929531610575
     * Content-Disposition: form-data; name="myFile"; filename="foo.txt"
     * Content-Type: text/plain
     *
     * (content of the uploaded file foo.txt)
     * -----------------------------974767299852498929531610575--
     * }</pre>
     */
    public static final String CONTENT_TYPE = "Content-Type";

    /**
     * Message body information
     * <br>Entity header
     * <br><br>
     * Used to specify the compression algorithm.
     * <pre>{@code
     * Content-Encoding: gzip
     * Content-Encoding: compress
     * Content-Encoding: deflate
     * Content-Encoding: identity
     * Content-Encoding: br
     *
     * // Multiple, in the order in which they were applied
     * Content-Encoding: gzip, identity
     * Content-Encoding: deflate, gzip
     *
     * Examples
     * Compressing with gzip
     *
     * On the client side, you can advertise a list
     * of compression schemes that will be sent along
     * in an HTTP request. The Accept-Encoding header
     * is used for negotiating content encoding.
     *
     * Accept-Encoding: gzip, deflate
     *
     * The server responds with the scheme used,
     * indicated by the Content-Encoding response header.
     *
     * Content-Encoding: gzip
     *
     * Note that the server is not obligated
     * to use any compression method. Compression highly
     * depends on server settings and used server modules.
     * }</pre>
     */
    public static final String CONTENT_ENCODING = "Content-Encoding";

    /**
     * Message body information
     * <br>Entity header
     * <br><br>
     * Describes the human language(s) intended for the audience, so that it allows a user to differentiate according to the users' own preferred language.
     * <pre>{@code
     * Content-Language: de-DE
     * Content-Language: en-US
     * Content-Language: de-DE, en-CA
     *
     * Examples
     * Indicating the language a document is written in
     *
     * The global lang attribute is used on HTML elements
     * to indicate the language of an entire HTML document
     * or parts of it.
     *
     * &lt;html lang="de"&gt;
     *
     * Do not use this meta element like this
     * for stating a document language:
     *
     * <!-- /!\ This is bad practice -->
     * &lt;meta http-equiv="content-language" content="de"&gt;
     *
     * Indicating a target audience for a resource
     *
     * The Content-Language header is used to specify
     * the intended audience of the page,
     * and can indicate that this is more than one language.
     *
     * Content-Language: de, en
     *
     * }</pre>
     */
    public static final String CONTENT_LANGUAGE = "Content-Language";

    /**
     * Message body information
     * <br>Entity header
     * <br><br>
     * Indicates an alternate location for the returned data.
     * <pre>{@code
     * Content-Location: <url>
     *
     * Examples
     *
     * Accept: application/json, text/json   -->   Content-Location: /documents/foo.json
     * Accept: application/xml, text/xml   -->   Content-Location: /documents/foo.xml
     * Accept: text/plain, text/*  -->  Content-Location: /documents/foo.txt
     * }</pre>
     */
    public static final String CONTENT_LOCATION = "Content-Location";

    /**
     * Proxies
     * <br>Request header
     * <br><br>
     * Contains information from the client-facing side of proxy servers that is altered or lost when a proxy is involved in the path of the request.
     * <pre>{@code
     * Forwarded: by=<identifier>;for=<identifier>;host=<host>;proto=<http|https>
     *
     * Examples
     *
     * Using the Forwarded header
     *
     * Forwarded: for="_mdn"
     *
     * # case insensitive
     * Forwarded: For="[2001:db8:cafe::17]:4711"
     *
     * # separated by semicolon
     * Forwarded: for=192.0.2.60;proto=http;by=203.0.113.43
     *
     * # multiple values can be appended using a comma
     * Forwarded: for=192.0.2.43, for=198.51.100.17
     *
     * Transitioning from X-Forwarded-For to Forwarded
     *
     * X-Forwarded-For: 123.34.567.89
     * Forwarded: for=123.34.567.89
     *
     * X-Forwarded-For: 192.0.2.43, "[2001:db8:cafe::17]"
     * Forwarded: for=192.0.2.43, for="[2001:db8:cafe::17]"
     * }</pre>
     */
    public static final String FORWARDED = "Forwarded";

    /**
     * Proxies
     * <br>Request header
     * <br><br>
     * Identifies the originating IP addresses of a client connecting to a web server through an HTTP proxy or a load balancer.
     * <pre>{@code
     * X-Forwarded-For: <client>, <proxy1>, <proxy2>
     *
     * Examples
     *
     * X-Forwarded-For: 2001:db8:85a3:8d3:1319:8a2e:370:7348
     * X-Forwarded-For: 203.0.113.195
     * X-Forwarded-For: 203.0.113.195, 70.41.3.18, 150.172.238.178
     *
     * Other non-standard forms:
     *
     * # Used for some Google services
     * X-ProxyUser-Ip: 203.0.113.19
     * }</pre>
     */
    public static final String X_FORWARDED_FOR = "X-Forwarded-For";

    /**
     * Proxies
     * <br>Request header
     * <br><br>
     * Identifies the original host requested that a client used to connect to your proxy or load balancer.
     * <pre>{@code
     * X-Forwarded-Host: <host>
     *
     * Examples
     *
     * X-Forwarded-Host: id42.example-cdn.com
     * }</pre>
     */
    public static final String X_FORWARDED_HOST = "X-Forwarded-Host";

    /**
     * Proxies
     * <br>Request header
     * <br><br>
     * Identifies the protocol (HTTP or HTTPS) that a client used to connect to your proxy or load balancer.
     * <pre>{@code
     * X-Forwarded-Proto: <protocol>
     *
     * Examples
     *
     * X-Forwarded-Proto: https
     *
     * Other non-standard forms:
     *
     * # Microsoft
     * Front-End-Https: on
     *
     * X-Forwarded-Protocol: https
     * X-Forwarded-Ssl: on
     * X-Url-Scheme: https
     * }</pre>
     */
    public static final String X_FORWARDED_PROTO = "X-Forwarded-Proto";

    /**
     * Proxies
     * <br>General header
     * <br><br>
     * Added by proxies, both forward and reverse proxies, and can appear in the request headers and the response headers.
     * <pre>{@code
     * Via: [ <protocol-name> "/" ] <protocol-version> <host> [ ":" <port> ]
     * or
     * Via: [ <protocol-name> "/" ] <protocol-version> <pseudonym>
     *
     * Examples
     *
     * Via: 1.1 vegur
     * Via: HTTP/1.1 GWA
     * Via: 1.0 fred, 1.1 p.example.net
     * }</pre>
     */
    public static final String VIA = "Via";

    /**
     * Redirects
     * <br>Response header
     * <br><br>
     * Indicates the URL to redirect a page to.
     * <pre>{@code
     * Location: <url>
     *
     * Examples
     *
     * Location: /index.html
     * }</pre>
     */
    public static final String LOCATION = "Location";

    /**
     * Request context
     * <br>Request header
     * <br><br>
     * Contains an Internet email address for a human user who controls the requesting user agent.
     * <pre>{@code
     * From: <email>
     *
     * Examples
     *
     * From: webmaster@example.org
     * }</pre>
     */
    public static final String FROM = "From";

    /**
     * Request context
     * <br>Request header
     * <br><br>
     * Specifies the domain name of the server (for virtual hosting), and (optionally) the TCP port number on which the server is listening.
     * <pre>{@code
     * Host: <host>:<port>
     *
     * Examples
     *
     * Host: developer.cdn.mozilla.net
     * }</pre>
     */
    public static final String HOST = "Host";

    /**
     * Request context
     * <br>Request header
     * <br><br>
     * The address of the previous web page from which a link to the currently requested page was followed.
     * <pre>{@code
     * Referer: <url>
     *
     * Examples
     *
     * Referer: https://developer.mozilla.org/en-US/docs/Web/JavaScript
     * }</pre>
     */
    public static final String REFERER = "Referer";

    /**
     * Request context
     * <br>Response header
     * <br><br>
     * Governs which referrer information sent in the Referer header should be included with requests made.
     * <pre>{@code
     * Referrer-Policy: no-referrer
     * Referrer-Policy: no-referrer-when-downgrade
     * Referrer-Policy: origin
     * Referrer-Policy: origin-when-cross-origin
     * Referrer-Policy: same-origin
     * Referrer-Policy: strict-origin
     * Referrer-Policy: strict-origin-when-cross-origin
     * Referrer-Policy: unsafe-url
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy#Directives">Directives</a>
     */
    public static final String REFERRER_POLICY = "Referrer-Policy";

    /**
     * Request context
     * <br>Request header
     * <br><br>
     * Contains a characteristic string that allows the network protocol peers to identify the application type, operating system, software vendor or software version of the requesting software user agent.
     *
     * <pre>{@code
     * User-Agent: <product> / <product-version> <comment>
     *
     * Common format for web browsers:
     *
     * User-Agent: Mozilla/5.0 (<system-information>) <platform> (<platform-details>) <extensions>
     *
     *     Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0
     * Mozilla/5.0 (Macintosh; Intel Mac OS X x.y; rv:42.0) Gecko/20100101 Firefox/42.0
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/User-Agent/Firefox">Firefox user agent string reference.</a>
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/User-Agent#Syntax">Syntax.</a>
     */
    public static final String USER_AGENT = "User-Agent";

    /**
     * Response context
     * <br>Entity header
     * <br><br>
     * Lists the set of HTTP request methods supported by a resource.
     * <pre>{@code
     * Allow: <http-methods>
     *
     * Examples
     *
     * Allow: GET, POST, HEAD
     * }</pre>
     */
    public static final String ALLOW = "Allow";

    /**
     * Response context
     * <br>Response header
     * <br><br>
     * Contains information about the software used by the origin server to handle the request.
     * <pre>{@code
     * Server: <product>
     *
     * Examples
     *
     * Server: Apache/2.4.1 (Unix)
     * }</pre>
     */
    public static final String SERVER = "Server";

    /**
     * Range requests
     * <br>Response header
     * <br><br>
     * Indicates if the server supports range requests, and if so in which unit the range can be expressed.
     * <pre>{@code
     * Accept-Ranges: <range-unit>
     * Accept-Ranges: none
     *
     * Examples
     *
     * Accept-Ranges: bytes
     * }</pre>
     */
    public static final String ACCEPT_RANGES = "Accept-Ranges";

    /**
     * Range requests
     * <br>Request header
     * <br><br>
     * Indicates the part of a document that the server should return.
     * <pre>{@code
     * Range: <unit>=<range-start>-
     * Range: <unit>=<range-start>-<range-end>
     * Range: <unit>=<range-start>-<range-end>, <range-start>-<range-end>
     * Range: <unit>=<range-start>-<range-end>, <range-start>-<range-end>, <range-start>-<range-end>
     * Range: <unit>=-<suffix-length>
     *
     * Examples
     *
     * Requesting three ranges from the file.
     *
     * Range: bytes=200-1000, 2000-6576, 19000-
     *
     * Requesting the first 500 and last 500 bytes of the file.
     * The request may be rejected by the server
     * if the ranges overlap.
     *
     * Range: bytes=0-499, -500
     * }</pre>
     */
    public static final String RANGE = "Range";

    /**
     * Range requests
     * <br>Request header
     * <br><br>
     * Creates a conditional range request that is only fulfilled if the given etag or date matches the remote resource. Used to prevent downloading two ranges from incompatible version of the resource.
     * <pre>{@code
     * If-Range: <day-name>, <day> <month> <year> <hour>:<minute>:<second> GMT
     * If-Range: <etag>
     *
     * Examples
     *
     * If-Range: Wed, 21 Oct 2015 07:28:00 GMT
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/If-Range">Docs</a>
     */
    public static final String IF_RANGE = "If-Range";

    /**
     * Range requests
     * <br>Response header
     * <br><br>
     * Indicates where in a full body message a partial message belongs.
     * <pre>{@code
     * Content-Range: <unit> <range-start>-<range-end>/<size>
     * Content-Range: <unit> <range-start>-<range-end>/*
     * Content-Range: <unit> * /<size>
     *
     * Examples
     *
     * Content-Range: bytes 200-1000/67589
     * }</pre>
     */
    public static final String CONTENT_RANGE = "Content-Range";

    /**
     * Security
     * <br><br>
     * Allows a server to declare an embedder policy for a given document.
     */
    public static final String CROSS_ORIGIN_EMBEDDER_POLICY = "Cross-Origin-Embedder-Policy";

    /**
     * Security
     * <br><br>
     * Prevents other domains from opening/controlling a window.
     */
    public static final String CROSS_ORIGIN_OPENER_POLICY = "Cross-Origin-Opener-Policy";

    /**
     * Security
     * <br>Response header
     * <br><br>
     * Prevents other domains from reading the response of the resources to which this header is applied.
     * <pre>{@code
     * Cross-Origin-Resource-Policy: same-site | same-origin | cross-origin
     *
     * Examples
     *
     * The response header below will cause compatible user agents to disallow cross-origin no-cors requests:
     *
     * Cross-Origin-Resource-Policy: same-origin
     * }</pre>
     *
     * @see <a href="https://resourcepolicy.fyi/">resourcepolicy.fyi</a>
     */
    public static final String CROSS_ORIGIN_RESOURCE_POLICY = "Cross-Origin-Resource-Policy";

    /**
     * Security
     * <br>Response header
     * <br><br>
     * Controls resources the user agent is allowed to load for a given page.
     * <pre>{@code
     * Content-Security-Policy: <policy-directive>; <policy-directive>
     *
     * Example: Disable unsafe inline/eval, only allow loading of resources (images, fonts, scripts, etc.) over https:
     *
     * // header
     * Content-Security-Policy: default-src https:
     *
     * // meta tag
     * &lt;meta http-equiv="Content-Security-Policy" content="default-src https:"&gt;
     *
     * Example: Pre-existing site that uses too much inline code to fix but wants to ensure resources are loaded only over https and disable plugins:
     *
     * Content-Security-Policy: default-src https: 'unsafe-eval' 'unsafe-inline'; object-src 'none'
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy">Documentation</a>
     */
    public static final String CONTENT_SECURITY_POLICY = "Content-Security-Policy";

    /**
     * Security
     * <br>Response header
     * <br><br>
     * Allows web developers to experiment with policies by monitoring, but not enforcing, their effects. These violation reports consist of JSON documents sent via an HTTP POST request to the specified URI.
     * <pre>{@code
     * Content-Security-Policy-Report-Only: <policy-directive>; <policy-directive>
     *
     * Examples
     *
     * This header reports violations that would have occurred.
     * You can use this to iteratively work on your
     * content security policy. You observe how your site behaves,
     * watching for violation reports, or malware redirects,
     * then choose the desired policy enforced by
     * the Content-Security-Policy header.
     *
     * Content-Security-Policy-Report-Only: default-src https:; report-uri /csp-violation-report-endpoint/
     * }</pre>
     */
    public static final String CONTENT_SECURITY_POLICY_REPORT_ONLY = "Content-Security-Policy-Report-Only";

    /**
     * Security
     * <br>Response header
     * <br><br>
     * Allows sites to opt in to reporting and/or enforcement of Certificate Transparency requirements, which prevents the use of misissued certificates for that site from going unnoticed. When a site enables the Expect-CT header, they are requesting that Chrome check that any certificate for that site appears in public CT logs.
     * <pre>{@code
     * Expect-CT: report-uri="<uri>",
     *            enforce,
     *            max-age=<age>
     *
     * Examples
     *
     * Expect-CT: max-age=86400, enforce, report-uri="https://foo.example/report"
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Expect-CT">Documentation</a>
     */
    public static final String EXPECT_CT = "Expect-CT";

    /**
     * Security
     * <br>Response header
     * <br><br>
     * Provides a mechanism to allow and deny the use of browser features in its own frame, and in iframes that it embeds.
     * <pre>{@code
     * Feature-Policy: <directive> <allowlist>
     *
     * Example
     *
     * SecureCorp Inc. wants to disable Microphone and Geolocation APIs
     * in its application. It can do so by delivering
     * the following HTTP response header to define a feature policy:
     *
     * Feature-Policy: microphone 'none'; geolocation 'none'
     *
     * By specifying the 'none' keyword for the origin list,
     * the specified features will be disabled for all browsing contexts
     * (this includes all iframes), regardless of their origin.
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Feature-Policy">Documentation</a>
     */
    public static final String FEATURE_POLICY = "Feature-Policy";

    /**
     * Security
     * <br>Response header
     * <br><br>
     * Force communication using HTTPS instead of HTTP.
     * <pre>{@code
     * Strict-Transport-Security: max-age=<expire-time>
     * Strict-Transport-Security: max-age=<expire-time>; includeSubDomains
     * Strict-Transport-Security: max-age=<expire-time>; preload
     *
     * Examples
     *
     * All present and future subdomains will be HTTPS for a max-age of
     * 1 year. This blocks access to pages or sub domains that can
     * only be served over HTTP.
     *
     * Strict-Transport-Security: max-age=31536000; includeSubDomains
     *
     * In the following example, max-age is set to 2 years, raised from
     * what was a former limit max-age of 1 year. Note that 1 year is
     * acceptable for a domain to be included in browsers' HSTS preload
     * lists. 2 years is, however, the recommended goal as a website's
     * final HSTS configuration as explained on https://hstspreload.org.
     * It also suffixed with preload which is necessary for inclusion
     * in most major web browsers' HSTS preload lists,
     * e.g. Chromium, Edge, & Firefox.
     *
     * Strict-Transport-Security: max-age=63072000; includeSubDomains; preload
     *
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security">Documentation</a>
     */
    public static final String STRICT_TRANSPORT_SECURITY = "Strict-Transport-Security";

    /**
     * Security
     * <br>Request header
     * <br><br>
     * Sends a signal to the server expressing the client’s preference for an encrypted and authenticated response, and that it can successfully handle the upgrade-insecure-requests directive.
     * <pre>{@code
     * Upgrade-Insecure-Requests: 1
     *
     *  Examples
     *
     * A client requests  signals to the server that it supports
     * the upgrade mechanisms of upgrade-insecure-requests:
     *
     * GET / HTTP/1.1
     * Host: example.com
     * Upgrade-Insecure-Requests: 1
     *
     * The server can now redirect to a secure version of the site.
     * A Vary header can be used so that the site isn't served by
     * caches to clients that don’t support the upgrade mechanism.
     *
     * Location: https://example.com/
     * Vary: Upgrade-Insecure-Requests
     * }</pre>
     */
    public static final String UPGRADE_INSECURE_REQUESTS = "Upgrade-Insecure-Requests";

    /**
     * Security
     * <br>Response header
     * <br><br>
     * Disables MIME sniffing and forces browser to use the type given in Content-Type.
     * <pre>{@code
     * X-Content-Type-Options: nosniff
     *
     * }</pre>
     */
    public static final String X_CONTENT_TYPE_OPTIONS = "X-Content-Type-Options";

    /**
     * Security
     * <br><br>
     * The X-Download-Options HTTP header indicates that the browser (Internet Explorer) should not display the option to "Open" a file that has been downloaded from an application, to prevent phishing attacks as the file otherwise would gain access to execute in the context of the application. (Note: related MS Edge bug).
     */
    public static final String X_DOWNLOAD_OPTIONS = "X-Download-Options";

    /**
     * Security
     * <br>Response header
     * <pre>{@code
     * Indicates whether a browser should be allowed to render
     * a page in a <frame>, <iframe>, <embed> or <object>.
     * }</pre>
     * <pre>{@code
     * X-Frame-Options: DENY
     * X-Frame-Options: SAMEORIGIN
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options">Documentation</a>
     */
    public static final String X_FRAME_OPTIONS = "X-Frame-Options";

    /**
     * Security
     * <br><br>
     * Specifies if a cross-domain policy file (crossdomain.xml) is allowed. The file may define a policy to grant clients, such as Adobe's Flash Player, Adobe Acrobat, Microsoft Silverlight, or Apache Flex, permission to handle data across domains that would otherwise be restricted due to the Same-Origin Policy. See the Cross-domain Policy File Specification for more information.
     */
    public static final String X_PERMITTED_CROSS_DOMAIN_POLICIES = "X-Permitted-Cross-Domain-Policies";

    /**
     * Security
     * <br><br>
     * May be set by hosting environments or other frameworks and contains information about them while not providing any usefulness to the application or its visitors. Unset this header to avoid exposing potential vulnerabilities.
     */
    public static final String X_POWERED_BY = "X-Powered-By";

    /**
     * Security
     * <br>Response header
     * <br><br>
     * Enables cross-site scripting filtering.
     * <pre>{@code
     * X-XSS-Protection: 0
     * X-XSS-Protection: 1
     * X-XSS-Protection: 1; mode=block
     * X-XSS-Protection: 1; report=<reporting-uri>
     *
     * Example
     *
     * Block pages from loading when they detect reflected XSS attacks:
     *
     * X-XSS-Protection: 1; mode=block
     *
     * PHP
     *
     * header("X-XSS-Protection: 1; mode=block");
     *
     * Apache (.htaccess)
     *
     * <IfModule mod_headers.c>
     *   Header set X-XSS-Protection "1; mode=block"
     * </IfModule>
     *
     * Nginx
     *
     * add_header "X-XSS-Protection" "1; mode=block";
     *
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection">Documentation</a>
     */
    public static final String X_XSS_PROTECTION = "X-XSS-Protection";

    /**
     * @deprecated Security
     * <br>HTTP Public Key Pinning (HPKP)
     * <br><br>
     * Associates a specific cryptographic public key with a certain web server to decrease the risk of MITM attacks with forged certificates.
     * <pre>{@code
     * Public-Key-Pins: pin-sha256="<pin-value>";
     *                  max-age=<expire-time>;
     *                  includeSubDomains;
     *                  report-uri="<uri>"
     *
     * Examples
     *
     * Public-Key-Pins:
     *   pin-sha256="cUPcTAZWKaASuYWhhneDttWpY3oBAkE3h2+soZS7sWs=";
     *   pin-sha256="M8HztCzM3elUxkcjR2S5P4hhyBNf6lHkmjAHKhpGPWE=";
     *   max-age=5184000; includeSubDomains;
     *   report-uri="https://www.example.org/hpkp-report"
     * }</pre>
     */
    @Deprecated
    public static final String PUBLIC_KEY_PINS = "Public-Key-Pins";

    /**
     * @deprecated Security
     * <br>HTTP Public Key Pinning (HPKP)
     * <br>Response header
     * <br><br>
     * Sends reports to the report-uri specified in the header and does still allow clients to connect to the server even if the pinning is violated.
     * <pre>{@code
     * Public-Key-Pins-Report-Only: pin-sha256="<pin-value>";
     *                              max-age=<expire-time>;
     *                              includeSubDomains;
     *                              report-uri="<uri>"
     *
     * Public-Key-Pins-Report-Only:
     *   pin-sha256="cUPcTAZWKaASuYWhhneDttWpY3oBAkE3h2+soZS7sWs=";
     *   pin-sha256="M8HztCzM3elUxkcjR2S5P4hhyBNf6lHkmjAHKhpGPWE=";
     *   includeSubDomains;
     *   report-uri="https://www.example.org/hpkp-report"
     * }</pre>
     */
    @Deprecated
    public static final String PUBLIC_KEY_PINS_REPORT_ONLY = "Public-Key-Pins-Report-Only";

    /**
     * Security
     * <br>Fetch metadata request headers
     * <br><br>
     * It is a request header that indicates the relationship between a request initiator's origin and its target's origin. It is a Structured Header whose value is a token with possible values cross-site, same-origin, same-site, and none.
     * <pre>{@code
     * Sec-Fetch-Site: cross-site
     * Sec-Fetch-Site: same-origin
     * Sec-Fetch-Site: same-site
     * Sec-Fetch-Site: none
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Sec-Fetch-Site">Documentation</a>
     */
    public static final String SEC_FETCH_SITE = "Sec-Fetch-Site";

    /**
     * Security
     * <br>Fetch metadata request headers
     * <br><br>
     * It is a request header that indicates the request's mode to a server. It is a Structured Header whose value is a token with possible values cors, navigate, nested-navigate, no-cors, same-origin, and websocket.
     * <pre>{@code
     * Sec-Fetch-Mode: cors
     * Sec-Fetch-Mode: navigate
     * Sec-Fetch-Mode: nested-navigate
     * Sec-Fetch-Mode: no-cors
     * Sec-Fetch-Mode: same-origin
     * Sec-Fetch-Mode: websocket
     * }</pre>
     */
    public static final String SEC_FETCH_MODE = "Sec-Fetch-Mode";

    /**
     * Security
     * <br>Fetch metadata request headers
     * <br><br>
     * It is a request header that indicates whether or not a navigation request was triggered by user activation. It is a Structured Header whose value is a boolean so possible values are ?0 for false and ?1 for true.
     * <pre>{@code
     * Sec-Fetch-User: ?0
     * Sec-Fetch-User: ?1
     * }</pre>
     */
    public static final String SEC_FETCH_USER = "Sec-Fetch-User";

    /**
     * Security
     * <br>Fetch metadata request headers
     * <br><br>
     * It is a request header that indicates the request's destination to a server. It is a Structured Header whose value is a token with possible values audio, audioworklet, document, embed, empty, font, image, manifest, object, paintworklet, report, script, serviceworker, sharedworker, style, track, video, worker, xslt, and nested-document.
     * <pre>{@code
     * Sec-Fetch-Dest: audio
     * Sec-Fetch-Dest: audioworklet
     * Sec-Fetch-Dest: document
     * Sec-Fetch-Dest: embed
     * Sec-Fetch-Dest: empty
     * Sec-Fetch-Dest: font
     * Sec-Fetch-Dest: image
     * Sec-Fetch-Dest: manifest
     * Sec-Fetch-Dest: nested-document
     * Sec-Fetch-Dest: object
     * Sec-Fetch-Dest: paintworklet
     * Sec-Fetch-Dest: report
     * Sec-Fetch-Dest: script
     * Sec-Fetch-Dest: serviceworker
     * Sec-Fetch-Dest: sharedworker
     * Sec-Fetch-Dest: style
     * Sec-Fetch-Dest: track
     * Sec-Fetch-Dest: video
     * Sec-Fetch-Dest: worker
     * Sec-Fetch-Dest: xslt
     * Sec-Fetch-Dest: audioworklet
     * Sec-Fetch-Dest: audioworklet
     * }</pre>
     */
    public static final String SEC_FETCH_DEST = "Sec-Fetch-Dest";

    /**
     * Server-sent events
     */
    public static final String LAST_EVENT_ID = "Last-Event-ID";

    /**
     * Server-sent events
     * <br>Response header
     * <br><br>
     * Defines a mechanism that enables developers to declare a network error reporting policy.
     * <pre>{@code
     * NEL: { "report_to": "name_of_reporting_group", "max_age": 12345, "include_subdomains": false, "success_fraction": 0.0, "failure_fraction": 1.0 }
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Network_Error_Logging">Network Error Logging (NEL) explainer</a>
     */
    public static final String NEL = "NEL";

    /**
     * Server-sent events
     */
    public static final String PING_FROM = "Ping-From";

    /**
     *
     */
    public static final String PING_TO = "Ping-To";

    /**
     * Server-sent events
     * <br><br>
     * Used to specify a server endpoint for the browser to send warning and error reports to.
     */
    public static final String REPORT_TO = "Report-To";

    /**
     * Transfer coding
     * <br>Response header
     * <br><br>
     * Specifies the form of encoding used to safely transfer the entity to the user.
     * <pre>{@code
     * Transfer-Encoding: chunked
     * Transfer-Encoding: compress
     * Transfer-Encoding: deflate
     * Transfer-Encoding: gzip
     * Transfer-Encoding: identity
     *
     * // Several values can be listed, separated by a comma
     * Transfer-Encoding: gzip, chunked
     *
     * Examples
     *
     * HTTP/1.1 200 OK
     * Content-Type: text/plain
     * Transfer-Encoding: chunked
     *
     * 7\r\n
     * Mozilla\r\n
     * 9\r\n
     * Developer\r\n
     * 7\r\n
     * Network\r\n
     * 0\r\n
     * \r\n
     *
     * }</pre>
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Transfer-Encoding">Documentation</a>
     */
    public static final String TRANSFER_ENCODING = "Transfer-Encoding";

    /**
     * Transfer Encoding
     * <br>Request header
     * <br><br>
     * Specifies the transfer encodings the user agent is willing to accept.
     * <pre>{@code
     *  TE: compress
     * TE: deflate
     * TE: gzip
     * TE: trailers
     *
     * // Multiple directives, weighted with the quality value syntax:
     * TE: trailers, deflate;q=0.5
     * }</pre>
     */
    public static final String TE = "TE";

    /**
     * Transfer Encoding
     * <br>Response header
     * <br><br>
     * Allows the sender to include additional fields at the end of chunked message.
     * <pre>{@code
     * Trailer: header-names
     *
     * Examples
     * Chunked transfer encoding using a trailing header
     *
     * In this example, the Expires header is used at the
     * end of the chunked message and serves as a trailing header.
     *
     * HTTP/1.1 200 OK
     * Content-Type: text/plain
     * Transfer-Encoding: chunked
     * Trailer: Expires
     *
     * 7\r\n
     * Mozilla\r\n
     * 9\r\n
     * Developer\r\n
     * 7\r\n
     * Network\r\n
     * 0\r\n
     * Expires: Wed, 21 Oct 2015 07:28:00 GMT\r\n
     * \r\n
     * }</pre>
     *
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Trailer">Documentation</a>
     */
    public static final String TRAILER = "Trailer";

    /**
     * WebSockets
     */
    public static final String SEC_WEBSOCKET_KEY = "Sec-WebSocket-Key";

    /**
     * WebSockets
     */
    public static final String SEC_WEBSOCKET_EXTENSIONS = "Sec-WebSocket-Extensions";

    /**
     * WebSockets
     */
    public static final String SEC_WEBSOCKET_ACCEPT = "Sec-WebSocket-Accept";

    /**
     * WebSockets
     */
    public static final String SEC_WEBSOCKET_PROTOCOL = "Sec-WebSocket-Protocol";

    /**
     * WebSockets
     */
    public static final String SEC_WEBSOCKET_VERSION = "Sec-WebSocket-Version";

    /**
     * Other
     * A client can express the desired push policy for a request by sending an Accept-Push-Policy header field in the request.
     */
    public static final String ACCEPT_PUSH_POLICY = "Accept-Push-Policy";

    /**
     * Other
     * A client can send the Accept-Signature header field to indicate intention to take advantage of any available signatures and to indicate what kinds of signatures it supports.
     */
    public static final String ACCEPT_SIGNATURE = "Accept-Signature";

    /**
     * Other
     * <br><br>
     * Used to list alternate ways to reach this service.
     * <pre>{@code
     * Alt-Svc: clear
     * Alt-Svc: <protocol-id>=<alt-authority>; ma=<max-age>
     * Alt-Svc: <protocol-id>=<alt-authority>; ma=<max-age>; persist=1
     *
     * Example
     *
     * Alt-Svc: h2=":443"; ma=2592000;
     * Alt-Svc: h2=":443"; ma=2592000; persist=1
     * Alt-Svc: h2="alt.example.com:443", h2=":443"
     * Alt-Svc: h3-25=":443"; ma=3600, h2=":443"; ma=3600
     * }</pre>
     */
    public static final String ALT_SVC = "Alt-Svc";

    /**
     * Other
     * <br><br>
     * Contains the date and time at which the message was originated.
     * <pre>{@code
     * Date: <day-name>, <day> <month> <year> <hour>:<minute>:<second> GMT
     *
     * Examples
     *
     * Date: Wed, 21 Oct 2015 07:28:00 GMT
     * }</pre>
     */
    public static final String Date = "Date";

    /**
     * Other
     * <br>Response header
     * <br><br>
     * Tells the browser that the page being loaded is going to want to perform a large allocation.
     * <pre>{@code
     * Large-Allocation: 0
     * Large-Allocation: <megabytes>
     *
     * 0 is a special value which represents uncertainty as to what the size of the allocation is.
     *
     * <megabytes> The expected size of the allocation to be performed, in megabytes.
     *
     * Examples
     *
     * Large-Allocation: 0
     * Large-Allocation: 500
     * }</pre>
     *
     */
    public static final String LARGE_ALLOCATION = "Large-Allocation";

    /**
     * Other
     * <br><br>
     * The Link entity-header field provides a means for serialising one or more links in HTTP headers. It is semantically equivalent to the HTML &lt;link&gt; element.
     * <pre>{@code
     * Link: < uri-reference >; param1=value1; param2="value2"
     *
     * Examples
     *
     * GOOD Link: <https://example.com>; rel="preconnect"
     *
     * WRONG Link: https://bad.example; rel="preconnect"
     * }</pre>
     */
    public static final String LINK = "Link";

    /**
     * Other
     * <br><br>
     * A Push-Policy defines the server behaviour regarding push when processing a request.
     */
    public static final String PUSH_POLICY = "Push-Policy";

    /**
     * Other
     * <br><br>
     * Indicates how long the user agent should wait before making a follow-up request.
     */
    public static final String RETRY_AFTER = "Retry-After";

    /**
     * Other
     * <br><br>
     * The Signature header field conveys a list of signatures for an exchange, each one accompanied by information about how to determine the authority of and refresh that signature.
     */
    public static final String SIGNATURE = "Signature";

    /**
     * Other
     * <br><br>
     * The Signed-Headers header field identifies an ordered list of response header fields to include in a signature.
     */
    public static final String SIGNED_HEADERS = "Signed-Headers";

    /**
     * Other
     * <br><br>
     * Communicates one or more metrics and descriptions for the given request-response cycle.
     */
    public static final String SERVER_TIMING = "Server-Timing";

    /**
     * Other
     * <br><br>
     * Used to remove the path restriction by including this header in the response of the Service Worker script.
     */
    public static final String SERVICE_WORKER_ALLOWED = "Service-Worker-Allowed";

    /**
     * Other
     * <br>Response header
     * <br><br>
     * Links generated code to a source map.
     * <pre>{@code
     * SourceMap: <url>
     * X-SourceMap: <url> (deprecated)
     *
     * Examples
     *
     * SourceMap: /path/to/file.js.map
     * }</pre>
     */
    public static final String SOURCEMAP = "SourceMap";

    /**
     * Other
     * <br><br>
     * The relevant RFC document for the Upgrade header field is RFC 7230, section 6.7. The standard establishes rules for upgrading or changing to a different protocol on the current client, server, transport protocol connection. For example, this header standard allows a client to change from HTTP 1.1 to HTTP 2.0, assuming the server decides to acknowledge and implement the Upgrade header field. Neither party is required to accept the terms specified in the Upgrade header field. It can be used in both client and server headers. If the Upgrade header field is specified, then the sender MUST also send the Connection header field with the upgrade option specified. For details on the Connection header field please see section 6.1 of the aforementioned RFC.
     */
    public static final String UPGRADE = "Upgrade";

    /**
     * Other
     * <br><br>
     * Controls DNS prefetching, a feature by which browsers proactively perform domain name resolution on both links that the user may choose to follow as well as URLs for items referenced by the document, including images, CSS, JavaScript, and so forth.
     */
    public static final String X_DNS_PREFETCH_CONTROL = "X-DNS-Prefetch-Control";

    /**
     * @deprecated
     *
     * Other
     */
    @Deprecated
    public static final String X_FIREFOX_SPDY = "X-Firefox-Spdy";

    /**
     * Other
     */
    public static final String X_PINGBACK = "X-Pingback";

    /**
     * Other
     */
    public static final String X_REQUESTED_WITH = "X-Requested-With";

    /**
     * Other
     * <br><br>
     * The X-Robots-Tag HTTP header is used to indicate how a web page is to be indexed within public search engine results. The header is effectively equivalent to &lt;meta name="robots" content="..."&gt;.
     */
    public static final String X_ROBOTS_TAG = "X-Robots-Tag";

    /**
     * Other
     * <br><br>
     * Used by Internet Explorer to signal which document mode to use.
     */
    public static final String X_UA_COMPATIBLE = "X-UA-Compatible";
}
