package lesson01;

/**
 * @author jinp
 * @date 2021/9/3 22:56
 */
public class BoxingDemo {

    public static void main(String[] args) {
        MemoryCell<Integer> m = new MemoryCell<>();
        m.write(5);
        int i = m.read();
        System.out.println(i);
    }
}
