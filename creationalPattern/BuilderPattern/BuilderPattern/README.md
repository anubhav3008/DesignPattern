### **Builder Pattern** 
is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction&nbsp;code.   

### Problem :
Imagine a complex object that requires laborious, step-by-step initialization of many fields and nested objects. Such initialization code is usually buried inside a monstrous constructor with lots of parameters. Or even worse: scattered all over the client code.   
### &nbsp;  


The simplest solution is to extend the base House class and create a set of subclasses to cover all combinations of the parameters. But eventually you will end up with a considerable number of subclasses. Any new parameter, such as the porch style, will require growing this hierarchy even more.   

There is another approach that does not involve breeding subclasses. You can create a giant constructor right in the base &nbsp; House &nbsp; class with all possible parameters that control the house object. While this approach indeed eliminates the need for subclasses, it creates another problem.   

The constructor with lots of parameters has its downside: not all the parameters are needed at all&nbsp;times.  

### **Solution**   

The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called &nbsp; builders .   

The Builder pattern lets you construct complex objects step by step. The Builder doesn’t allow other objects to access the product while it is being&nbsp;built.  
