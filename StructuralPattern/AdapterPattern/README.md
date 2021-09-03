### Problem  
Imagine that you’re creating a stock market monitoring app. The app downloads the stock data from multiple sources in XML format and then displays nice-looking charts and diagrams for the user.  

At some point, you decide to improve the app by integrating a smart 3rd-party analytics library. But there’s a catch: the analytics library only works with data in JSON format.  

You can’t use the analytics library “as is” because it expects the data in a format that’s incompatible with your&nbsp;app.  

You could change the library to work with XML. However, this might break some existing code that relies on the library. And worse, you might not have access to the library’s source code in the first place, making this approach impossi  

### Solution  

You can create an &nbsp; *adapter* . This is a special object that converts the interface of one object so that another object can understand it.   

Adapter pattern is also known as wrapper  

The way to identify adapter patten is that the adapter has incompatible interface   
