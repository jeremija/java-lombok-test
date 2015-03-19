# java-lombok-test
Experimenting with lombok and gradle.

Given a simple `Person` class:
```
public @Data class Person {
	private String name;
	private String surname;
	private @NonNull final LocalDate birthday;
}
```

Lombok automatically implements these methods:
```
public class website.steiner.lombok.Person {
  public website.steiner.lombok.Person(java.time.LocalDate);
  public java.lang.String getName();
  public java.lang.String getSurname();
  public java.time.LocalDate getBirthday();
  public void setName(java.lang.String);
  public void setSurname(java.lang.String);
  public boolean equals(java.lang.Object);
  protected boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
}
```

# Usage
Standard gradle syntax applies:

- build: `gradle build`
- test: `gradle test`
- run: `gradle run`

## IDEA
To generate a project for IntelliJ IDEA, run `gradle idea`. The 
[lombok-intellij-plugin](https://github.com/mplushnikov/lombok-intellij-plugin) 
needs to be installed, and `Enable annotation processing` option needs to be enabled
in IDEA to make it work if gradle script doesn't enable it while generating the project.

## Eclipse
To generate a project for Eclipse, run `gradle eclipse`. Eclipse needs the 
[lombok.jar](http://projectlombok.org/download.html) plugin.
