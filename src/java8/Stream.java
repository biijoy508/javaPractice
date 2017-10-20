package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(final String[] args) {
        /**
         * Filter and collect methods in Array using array
         */
      List<String> demoDataToFilter = Arrays.asList("haha", "hoho", "meh", "lol");

      List<String> filteredData = demoDataToFilter.stream().filter(demo -> !"lol".equals(demo)).collect(Collectors.toList());

      filteredData.forEach(System.out::println);

      /**
       * Find any , or else method and result returned as an object.
       */
      List<Person> persons = Arrays.asList(
              new Person("mkyong", 30),
              new Person("jack", 20),
              new Person("lawrence", 40)
      );

      Person result1 = persons.stream()                        // Convert to steam
              .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
              .findAny()                                      // If 'findAny' then return found
              .orElse(null);                                  // If not found, return null

      System.out.println(result1.getAge());

      Person result2 = persons.stream()
              .filter((p) -> "jack".equals(p.getName()) && 20 == p.getAge())
              .findAny()
              .orElse(null);

      System.out.println("result 1 :" + result2.getAge());

      /**
       * map and filter
       */
      String name = persons.stream()
              .filter(x -> "jack".equals(x.getName()))
              .map(Person::getName)                        //convert stream to String
              .findAny()
              .orElse("");

      System.out.println("name : " + name);

      List<String> collect = persons.stream()
              .map(Person::getName)
              .collect(Collectors.toList());

      collect.forEach(System.out::println);

    }

}
 class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }
}

