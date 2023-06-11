package records;

public class RecordExample {
    public static void main(String[] args) {
        Name name = new Name("aven", "desta");
        System.out.println(name);
        System.out.println(name.firstName());
    }

    record Name(String firstName, String lastName) {
    }
    // can not be extended
      /*
    record Name(String firstName, String lastName) extends Object{
    }
     */
}
