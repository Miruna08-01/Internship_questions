# Internship_questions

### 1. Explain the difference between a stack and a queue. Provide real life examples of real-life scenarios where each of them are used appropriately.
   #### Stack: it’s like a list, implements the LIFO principle( Last In, First Out), so the last item added to the stack will be the first to be removed.  
       Some real life scenarios are  like a tower of plates in the closet. 
       When adding one plate to the “tower”, it will be on top so it will be the first one to be removed when needed. 
       A simple garbage collector can be another example.
   #### Queue: also like a list, implements the FIFO principle (First In, First Out), so the first item added to the queue will be the first to be removed. 
      Some real life scenarios are like a coffee shop, where the first entered will be the first to leave.


### 2. What is the difference between an array and a linked list? Provide advantages and disadvantages of each data structure.
   #### Both array and linked list are important data structures for storing collections, but there are quite a few differences between them.
|                 | Array                             | Linked List                                                                                                                                |
|-------------------------|-----------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------|
| Definition              | An array is a sequential collection of elements of the same type, stored in contiguous memory locations      | A linked list is a linear collection of elements, where each element contains a data field and a reference to the next element in the list |
|


| Array       |                   |
|-------------|-------------------|
| **Advantages** | **Disadvantages** |
| - Random access by index | - Fixed size |
| - Memory efficiency | - Inefficient insertion/deletion |


| Linked List |                   |
|-------------|-------------------|
| **Advantages** | **Disadvantages** |
| - Dynamic size | - Memory overhead |
| - Efficient insertion/deletion | - No random access |


### 3. What is HTTP? How is it different from HTTPS?
  #### HTTP (Hypertext Transfer Protocol) is a protocol used for transmitting data over the internet. HTTP is set on the Aplication level.
  ##### Goal- retrive inter-linked resources fom WWW
 ##### HTTP has 2 types of messages: Request and Response
#### Common Structure

- **Start Line**
    - *Request-Line* (for requests)
    - *Status-Line* (for responses)

- **Header Fields**
    - General / Request / Response / Representation metadata
    - Header field structure: *Name* : *Field Value*

- **Message Body (optional)**
    - Carries the entity body (document) associated with a request or response
### HTTP Headers

- **Request headers**: Include data about the client.
- **Response headers**: Have information about the server answering the request and the data being sent.

### HTTP Request Methods

1. **GET**:
    - Requests a representation of the specified resource identified by the URI (if possible).

2. **HEAD**:
    - Asks for the response identical to the one that would correspond to a GET request, but without the response body (only the HTTP header).

5. **POST** :
    - Submits data to be processed by the resource specified in the request URI.
    - The data is included in the body of the request message.

6. **PUT**:
    - Usually used when you are updating or replacing existing data on the server

7. **DELETE**:
    - Handles the deletion of the resource identified by the URI in the request.

8. **PATCH**:
    - Applies partial modifications to a resource.

#### HTTPS (Hypertext Transfer Protocol Secure) is an extension of HTTP and uses encryption to secure the data being transmitted. his encryption ensures that the data exchanged between the client and server is secure from some attacks.
#### HTTP typically uses port 80 for communication, while HTTPS uses port 443.

### 4. Can you give some examples of common HTTP response codes?

| Response Code | Description                                                                                                                                                                  |
|---------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 200 OK        | The request has succeeded.                                                                                                                                                   |
| 201 Created   | The request has been succeeded, resulting in the creation of a new data.                                                                                                     |
| 204 No Content| The request has been succeeded, but there is no content to return.                                                                                                           |
| 400 Bad Request | The request cannot be done due a client error.                                                                                                                               |
| 401 Unauthorized | Request needs authorization and the client did not give one.                                                                                                                 |
| 403 Forbidden | The client cannot access the data.                                                                                                                                           |
| 404 Not Found | Server cannot       find the data from the requested resource.                                                                                                               |
| 500 Internal Server Error | A generic server error due to many proble,ms: programming error, missing configurations etc |

### 5. What is the difference between authorization and authentication?
    Authentication is the process to verify the identity of somneone.
    This can be done from a POST request like login to verify if the user exists.
     
    Authorization is the process to verify the resources a user can access.
    For example, if we have a travel agency website, only an admin can modify,add or delete a destiantion. Users only can to make a reservation or search.

### 6. How would you explain to a 5-year-old how the WWW works?
#### I would explain the WWW to a 5-year-old in this way: The World Wide Web is like a giant forest, a huge forest where every tree is a website. The tree represent the website and the leaves represent the pages of that website.The paths to the leaves are represented by branches. Also, in this magic forest, exist special trees, called Routing trees. These special trees are like a starting point in our search. If you want to see some kind of information about Flowers, you need to go to the Routing tree that says flowers. This tree will guide you to all the trees that cointain information about flowers. From the Routing tree that is the start untill the wanted tree, you need to follow a path. Each path leads to a different website. 
