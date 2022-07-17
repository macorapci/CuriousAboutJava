import java.util.ArrayList;
import java.util.List;

public class Main049 {
    public static void main(String[] args) {
        var list = List.of(new AwesomeObject().name("AAA").value(10),
                new AwesomeObject049().name("BBB").value(20),
                new AwesomeObject049().name("CCC").value(20),
                new AwesomeObject049().name("CCC").value(30),
                new AwesomeObject049().name("DDD").value(30),
                new AwesomeObject049().name("EEE").value(20),
                new AwesomeObject049().name("FFF").value(30));

        var map = list.parallelStream()
                .collect(() -> new ArrayList<AwesomeObject049>(),
                        (ArrayList<AwesomeObject049> tempResultList, AwesomeObject049 tempAwesome) -> {
                            if (tempResultList.isEmpty() || tempResultList.get(0).getValue() == tempAwesome.getValue()) {
                                tempResultList.add(tempAwesome);
                                return;
                            }

                            if (tempResultList.get(0).getValue() < tempAwesome.getValue()) {
                                tempResultList.clear();
                                tempResultList.add(tempAwesome);
                            }
                        },
                        (ArrayList<AwesomeObject049> oldList, ArrayList<AwesomeObject049> newList) -> { // *1
                            if (newList.isEmpty()) {
                                return;
                            }

                            if (oldList.isEmpty() || oldList.get(0).getValue() < newList.get(0).getValue()) {
                                oldList.clear();
                                oldList.addAll(newList);
                                return;
                            }

                            if (oldList.get(0).getValue() == newList.get(0).getValue()) {
                                oldList.addAll(newList);
                            }
                        });

        System.out.println(map);
    }
}

class AwesomeObject049 {
    private int value;
    private String name;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public AwesomeObject value(int value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AwesomeObject name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "AwesomeObject{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
