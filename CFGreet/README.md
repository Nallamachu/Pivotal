This is the sample Greeting Application for Cloud Foundry. This is also an another example of how to define application configuration in manifest.yml file. This approach will make easy to push application into cloud environment with simple command called CF PUSH without entering any other parameters in CLI.

CFGreet application has two API with default greeting message and Geeting message with passing name param. This application will run on 8081 port which I have configured in application.properties.

http://localhost:8081/greet/

http://localhost:8081/greet/<name>
