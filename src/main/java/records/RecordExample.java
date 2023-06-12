package records;

public class RecordExample {
    public static void main(String[] args) {
        Name name = new Name("aven", "desta");
        System.out.println(name);
        System.out.println(name.firstName());
    }

    record Name(String firstName, String lastName) {
        Name {
            if(firstName.trim().length()*lastName.trim().length() == 0){
                throw new IllegalStateException("You must have a first and last name!");
            }
        }
        Name(String firstName){
            this(firstName, "");    // canonical constructor will/should always be called
        }
    }
      /*
    // can not be extended
    record Name(String firstName, String lastName) extends Object{
    }
     */
}
