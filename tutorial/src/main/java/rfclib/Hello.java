package main.java.rfclib;

/**
 * 
 * @author 'Yang o3'
 */
public class Hello {
  private int num = 0;

  public Hello() {
    num = 888;
  }

  public String toString() {
    return num + "";
  }

  public void say() {
    System.out.println("I'm " + num + " years old.");
  }
}