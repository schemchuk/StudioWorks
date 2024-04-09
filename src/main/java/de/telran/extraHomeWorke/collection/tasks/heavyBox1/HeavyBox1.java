package de.telran.extraHomeWorke.collection.tasks.heavyBox1;

import de.telran.extraHomeWorke.collection.tasks.heavyBox.HeavyBox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeavyBox1 extends HeavyBox {

    public HeavyBox1(int weight) {
        super(weight);
    }

  public static List<HeavyBox1> moveHeavyBoxes(List<HeavyBox1> boxes) {
        List<HeavyBox1> heavyBox1s = new ArrayList<>();
      Iterator<HeavyBox1> iterator = boxes.iterator();

      while (iterator.hasNext()) {
          HeavyBox1 box1 = iterator.next();
          if (box1.getWeight() > 300){
              heavyBox1s.add(box1);
              iterator.remove();
          }
      }
      return heavyBox1s;
  }
}
