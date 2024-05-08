# Getting Started

- Generate keystore.jks for self-signed SSL cert:  
  - `keytool -genkeypair -alias mycertificate -keyalg RSA -keysize 2048 -keystore keystore.jks -validity 3650`
  - Move it to `src/main/resources` so it is in classpath
- Run Spring boot app `./mvnw spring-boot:run`
  - [MessagingStompWebsocketApplication.java](src%2Fmain%2Fjava%2Fcom%2Fexample%2Fmessagingstompwebsocket%2FMessagingStompWebsocketApplication.java)
- Go to https://localhost:8443
  - Connect to `wss://localhost:8443/gs-guide-websocket`, and send ws msg to /app/hello => respond in /topic/greetings