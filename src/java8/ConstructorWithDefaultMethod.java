package java8;

public interface ConstructorWithDefaultMethod {
  public default void eat(){

  };
  public int pray();

  /**
   * Override not allowed in static methods, it created hidden methods
   * @return
   */
  public static boolean love(){
    return false;
  };
}
