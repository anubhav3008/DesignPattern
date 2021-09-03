**Prototype Design Pattern Real World Example**   
 
1. Let’s consider a scenario where the client is running a Movie Rating website. Client is using a External Rest API to fetch all the details(name,releasedate,genre etc) related to the movie title. As this is an external API, Client have to pay certain fee for every API call.  
2. Client website is designed in such a way that rating of the Movie can change periodically, but other data i.e Name, Genre and releaseDate is constant and will never change.  
3. Client needs an new object of Movie for every visitor who rates the movie.  
4. Inorder to save money, The External API should be hit only once and for every subsequent request, We can use prototype design pattern to return the cloned object of the previous object.    
  
https://www.geeksforgeeks.org/prototype-design-pattern/

https://refactoring.guru/design-patterns/prototype

The prototype pattern is a creational design pattern.   

Prototype patterns is required, when object creation is time consuming, and costly operation, so we create object with existing object itself. One of the best available way to create object from existing objects are **clone() method** .   

Clone is the simplest approach to implement prototype pattern. However, it is your call to decide how to copy existing object based on your business model.  
