package ru.homework.work5and6.zoo.animal;

import static java.lang.Thread.sleep;

import ru.homework.work5and6.zoo.interfaces.Eating;

public class Rabbit extends BaseAnimal implements Eating {
  private Boolean eats;

  public Rabbit(String name, String type, String color, Integer age) {
    super(name, type, color, age);
    this.eats = false;
  }

  /**
   * move.
   *
   * @param len the len
   */
  public void move(Integer len) throws InterruptedException {
    for (int i = 1; i <= len; i++) {
      if (i == 1 || i == len) {
        this.moving = !this.moving;
      }
      sleep(1000);
      System.out.println("Пройдено " + i + " шагов, осталось " + (len - i));
    }
    System.out.println("Итого пропрыгано " + len + " шагов");
  }

  public void say(String msg) {
    System.out.println(this.name + " произносит " + msg);
  }

  public Boolean getEats() {
    return eats;
  }

  @Override
  public void eat(int num) {
    this.eats = true;
    //какие то действия
    System.out.println("Грызем " + num + "шт. морковок(и)");
    this.eats = false;
  }

  @Override
  public String toString() {
    return "Rabbit{"
        + "name='" + name + '\''
        + ", type='" + type + '\''
        + ", color='" + color + '\''
        + ", age=" + age
        + ", moving=" + moving
        + '}';
  }
}
