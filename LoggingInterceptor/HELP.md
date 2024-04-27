# Getting Started
Run the application setting the spring.profiles.active to dev or local  
ex. "spring.profiles.active=local"
Then paste this url in your browser "http://localhost:8099/swagger-ui/index.html".

### Logging Interceptor
The interceptor intercepts any request to the application and logs some information,  
it logs before it reaches the rest api and after it is consumed.

PreHandle logs:
* Request Method
* Request URI

PostHandle logs:
* Time taken to process request
* Response Status

### Environments using YAML files
In order to run the application with different configurations based on dev or prod  
environments we have to change yml file, in this case we can switch between  
application-dev and application-local.

Each file can contain differents configurations, such as different databases,  
different port etc..

We can switch between this two files setting spring.profiles.active to local in the  
Environment variables of your IDE, or setting it in the command line:  
ex. "java -jar myapp.jar -Dspring.profiles.active=dev"