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
|-----------|------|---------:|
|Servlet | Interface | javax.servlet.*|
|ServletRequest|  Interface | javax.servlet.*|
|ServletResponse | Interface | javax.servlet.*|
|GenericServlet|  `Class` | javax.servlet.*|
|HttpServlet|  `Class`|  javax.servlet.http.*|
|HttpServletRequest|  Interface | javax.servlet.http.*|
|HttpServletResponse|  Interface | javax.servlet.http.*|
|Filter | Interface | javax.servlet.*|
|ServletConfig|  Interface | javax.servlet.*|

> `Servlet container`, also known as `Servlet engine` is an integrated set of objects that provide a run time environment for Java Servlet components.


### Life Cycle of a Servlet (Servlet Life Cycle)
The web container maintains the life cycle of a servlet instance. Let's see the life cycle of the servlet:

1. Servlet class is loaded.
2. Servlet instance is created.
3. init method is invoked.
4. service method is invoked.
5. destroy method is invoked.



## Session Tracking 

HTTP is a `stateless` protocol. 

Each request is independent of the previous one. However, in some
applications, it is necessary to save state information so that information can be collected from several interactions between a browser and a server.

Sessions provide such a mechanism.