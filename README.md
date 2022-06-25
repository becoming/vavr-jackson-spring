# vavr-jackson-spring

This lib allows you to return `Try` and `Option` classes via `Spring Boot Controllers`.

It is enabled as a `Jackson` module.

```java
@GetMapping("{id}")
public Try<RobotView> getRobot(@PathVariable Long id) {
    return service.findById(id);
}
```

```java
@GetMapping("{id}")
public Option<RobotView> getRobot(@PathVariable Long id) {
    return service.findById(id);
}
```

```xml
<dependency>
    <groupId>tech.becoming</groupId>
    <artifactId>vavr-jackson-spring</artifactId>
    <version>0.0.1</version>
</dependency>
```
