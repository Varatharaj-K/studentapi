HTTP DCS

 <b><ol><li>What is http? </b>
 <br>
 <br>
 The Hypertext Transfer Protocol (HTTP) is designed to enable communications between clients and servers.
             HTTP works as a request-response protocol between a client and server.
What types of messages are there?
A start line (Request line || status line)
Zero or more header fields followed by CRLF
An Empty line indicating the end of the header fields
Optionally a message body. 
<br>
<br>
<b><li>What types of http methods are there?</b>

<ul>GET</ul>
<ul>POST</ul>
<ul>PUT</ul>
<ul>DELETE</ul>
<ul>HEAD</ul>
<ul>CONNECT</ul>
<ul>OPTIONS</ul>
<ul>TRACE</ul>


<b><li>What is http resources?</b>
<br>
<br>
The target of an HTTP request is called a "resource", whose nature isn't defined further; it can be a document, a photo, or anything else. Each resource is identified by a Uniform Resource Identifier (URI) used throughout HTTP for identifying resources.
<br>
<br>
<b><li>What is request URI?</b>
<br>
<br>
The request URI is the uniform resource identifier of the resource to which the request applies. While URIs can theoretically refer to either uniform resource locators (URLs) or uniform resource names (URNs), at the present time a URI is almost always an HTTP URL that follows the standard syntax rules of Web URLs.
<br>

<b><li>What is status line?</b>
<br>
<br>The start line of an HTTP response, called the status line, contains the following information: The protocol version, usually HTTP/1.1 . A status code, indicating success or failure of the request
<br>Ex:  HTTP/1.1 200 OK
<br>
<br>
<b><li>What is status code?</b>
<br>
<br>
The Status-Code element in a server response, is a 3-digit integer where the first digit of the Status-Code defines the class of response and the last two digits do not have any categorization role.
<ul>1xx - Information</ul>
<ul>2xx - Successful </ul>
<ul>3xx - Redirection </ul>
<ul>4xx - Error </ul>
<ul>5xx - Internal error</ul>
<br>

<b><li>What is http headers?</b>
<br>
<br>
HTTP header fields provide required information about the request or response, or about the object sent in the message body.
General-header
Client Request-header
Server Response-header
Entity header
Ex: Content-Type: application/json
<br>
<br>
<b><li>What is http message body?</b>
<br>
<br>
The message body part is optional for an HTTP message but if it is available, then it is used to carry the entity-body associated with the request or response. 
<br>Ex: 
{
   Name: “Alice”
}
<br>
<br>

<b><li> What is URL endpoints?</b>
<br>
<br>
an endpoint is one end of a communication channel. When an API interacts with another system, the touchpoints of this communication are considered endpoints.
<br>
