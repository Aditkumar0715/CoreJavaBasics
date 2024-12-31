
// enums allows us to create a class with pre defined objects as named constants

enum Status {
    Pending, Error, Failed, Success
}

public class enums {
    public static void main(String[] args) {
        Status s = Status.Success;
        // System.out.println(s);
        // System.out.println(s.ordinal());

        // printing all the statuses
        // Status ss[] = Status.values();
        // for (Status status : ss) {
        // System.out.println(status + " : " + status.ordinal());
        // }

        // printing something based on status
        // if (s == Status.Pending)
        //     System.out.println("Working on it");
        // else if (s == Status.Error)
        //     System.out.println("Some error occured");
        // else if (s == Status.Failed)
        //     System.out.println("Executon failed");
        // else
        //     System.out.println("Done");

        // similar can be done with switch statements

        switch (s) {
            case Pending:
                System.out.println("Working on it");
                break;
            case Error:
                System.out.println("Some error occured");
                break;
            case Failed:
                System.out.println("Execution failed");
                break;
            default:
                System.out.println("Done");
                break;
        }

    }
}
