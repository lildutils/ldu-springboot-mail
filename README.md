# ldu-springboot-mail

## Prerequisites

* [JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html) - jdk1.8.0_201
* [AdoptOpenJDK](https://adoptopenjdk.net/index.html) - jdk8u242-b08
* [Gradle](https://gradle.org/releases/) - 5.6.2
* [IDE *(recommended)*](https://spring.io/tools) - latest

## Development

### Configurations

```properties
# application.properties

spring.mail.host=stringValue
spring.mail.port=numberValue
spring.mail.username=stringValue
spring.mail.password=stringValue
spring.mail.properties.mail.smtp.auth=booleanValue
spring.mail.properties.mail.smtp.starttls.enable=booleanValue

```

```yaml
# application.yml

spring:
  mail:
    host: stringValue
    port: numberValue
    username: stringValue
    password: stringValue
    properties: 
      mail:
        smtp:
          auth: booleanValue
          starttls:
            enable: booleanValue
```

### Install

```Gradle
gradle init
```

### Build

```Gradle
gradle build
```

## About

To get more informations about this library, or if you have any question or suggestion, please send an email to [me](mailto:lildworks@gmail.com)

## 

Thanks :)
