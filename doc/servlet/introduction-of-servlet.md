# Introduction to Java Servlets

Servlets are the Java programs that run on the Java-enabled web server or application server.

They are used to handle the request obtained from the webserver, process the request, produce the response, then send a response back to the webserver.

Properties of Servlets are as follows:
- Servlets work on the `server-side`.
- Servlets are capable of handling complex requests obtained from the webserver.

> The `server-side` extensions are nothing but the technologies that are used to create dynamic Web pages.

### Servlets API’s:

Servlets are build from two packages:
- `javax.servlet`(Basic)
- `javax.servlet.http`(Advance)

| Component | Type | Package |
|-----------|------|---------|
|Servlet | Interface | javax.servlet.*|
|ServletRequest|  Interface | javax.servlet.*|
|ServletResponse | Interface | javax.servlet.*|
|GenericServlet|  `Class` | javax.servlet.*|
|HttpServlet|  `Class`|  javax.servlet.http.*|
|HttpServletRequest|  Interface | javax.servlet.http.*|
|HttpServletResponse|  Interface | javax.servlet.http.*|
|Filter | Interface | javax.servlet.*|
|ServletConfig|  Interface | javax.servlet.*|