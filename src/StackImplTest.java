public class StackImplTest {
    public static void main(String[] args) {
        System.out.println("TEST");

        Stack<Integer> s = new StackImpl<Integer>(5);

        try {
            System.out.println(s.size());
            s.push(5);
            System.out.println(s.size());
            s.push(12);
            System.out.println(s.size());

            Stack<String> s2 = new StackImpl<String>(3);
            s2.push("Hola");
            System.out.println(s.size());
            s2.push("Adeu");
            System.out.println(s.size());

            s2.pop();
        }
        catch (EmptyStackException empty) {
            empty.printStackTrace();
        }
        catch (FullStackException full) {
            full.printStackTrace();
        }
        finally {
            //
        }
    }
}
