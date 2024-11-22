import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.*;

///////////////
//Welcome//
//////////////
abstract class Cios {
    public static ArrayList<valid> hrManager = new ArrayList<>();
    public static ArrayList<valid> hrAssistant = new ArrayList<>();
    public static ArrayList<Dep> AddDepartment = new ArrayList<>();
    public static ArrayList<Desi> AddDesignation = new ArrayList<>();

    abstract void Dashboard();

    abstract void Search();

    ///////////////
    // Clear//
    //////////////
    public final static void clearConsole() {

        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }

            else {

                System.out.print("\033[H\033[2J");
                System.out.flush();
            }

        } catch (final Exception e) {

        }
    }

    ////////////// MAIN SACNNER///////////////
    public static Scanner scanner = new Scanner(System.in);
// overloading 

    public static int Year(int Y) {
        return Y;
    }

    public static String Year(String Y) {
        return Y;
    }
    /////////////////////
    /// MAIN PAGE ///
    ////////////////////

    public static void mainPage() {
        System.out.println("\t\t\t\t\t\t\t\t\t ____                       ______     ______               ______");
        System.out
                .println(
                        "\t\t\t\t\t\t\t\t\t  ||    ||\\     ||  _______   ||  ____   ||    ||      ||     ||    ______");
        System.out
                .println(
                        "\t\t\t\t\t\t\t\t\t  ||    || \\    || ||         ||   ||    ||    ||      ||     ||   ||     ");
        System.out
                .println(
                        "\t\t\t\t\t\t\t\t\t  ||    ||  \\   || ||_______  ||   ||    ||    ||      ||     ||   ||     ");
        System.out
                .println(
                        "\t\t\t\t\t\t\t\t\t  ||    ||   \\  ||        ||  ||   ||    ||    ||      ||     ||   ||_____");
        System.out
                .println(
                        "\t\t\t\t\t\t\t\t\t  ||    ||    \\ ||  ______||  ||   ||    ||    ||      ||     ||   ||     ");
        System.out
                .println(
                        "\t\t\t\t\t\t\t\t\t__||__  ||     \\||               __||__        ||______||          ||     ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                   ||_____");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t_______  ______");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t||   || ||     ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t||   || ||_____");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t||   || ||     ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t||___|| ||     ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t||             ");
        System.out.println("\t\t\t\t\t\t\t\t\t_______");
        System.out.println("\t\t\t\t\t\t\t\t\t||        ______   ||     ______                 ||        ______");
        System.out.println("\t\t\t\t\t\t\t\t\t||        ||  ||   ||     ||  || ____      ____  ||        ||  ||");
        System.out.println("\t\t\t\t\t\t\t\t\t||        ||  ||   ||     ||  ||  ||\\    //||    ||______  ||  ||");
        System.out.println("\t\t\t\t\t\t\t\t\t||        ||  ||   ||     ||  ||  || \\  // ||    ||     || ||  ||");
        System.out.println("\t\t\t\t\t\t\t\t\t||        ||__||   ||     ||__||  ||  \\//  ||    ||_____|| ||__||");
        System.out.println("\t\t\t\t\t\t\t\t\t||______           ||____       __||       ||__                  ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t    |----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t    |       WELCOME TO COLOMBO INSTITUE      |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t    |----------------------------------------|");
        int year = Year(2023);
        String creater = Year("Created BY Anusara Weearawarna");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t" + year + "\n\t\t\t\t\t\t\t\t\t\t\t   " + creater);
        System.out.println("\t\t\t\t\t\t\t\t\t\t    |----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t                  1.ADMIN LOGIN");
        System.out.println("\t\t\t\t\t\t\t\t\t\t                  2.HR LOGIN   ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t                  3.ASSISTANT LOGIN");
        System.out.print("\t\t\t\t\t\t\t\t\t                        ENTER YOUR CHOICE:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                clearConsole();
                Login();
                break;
            case 2:
                clearConsole();
                Login(scanner);
                break;
            case 3:
                clearConsole();
                assistHrLogin();
                break;
            default:
                System.out.println("Invalid Number Please try again!");
                clearConsole();
                mainPage();

        }
    }
    ///////////////////////
    /// ADMIN LOGIN ///
    //////////////////////

    public static void Login() {
        clearConsole();
        String correctU = "Admin";
        String correctP = "1234";
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|               ADMIN LOGIN              |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tENTER YOUR USERNAME:");
        String username = scanner.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tENTER YOUR PASSWORD:");
        String password = scanner.next();
        if (username.equals(correctU) && password.equals(correctP)) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tYOUR LOGGED IN...");
            try {
                processing();
                Thread.sleep(10000);
                signup();
            } catch (Exception e) {

            }
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tLOGGING FAILED! Try Agian.");
            try {
                Thread.sleep(1000);
                Login();
            } catch (Exception e) {

            }

        }
    }
    ////////////////////
    /// HR LOGIN ///
    ///////////////////

    public static void Login(Scanner scanner) {
        clearConsole();
        String correctU = "HR";
        String correctP = "1234";
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                 HR LOGIN               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tENTER YOUR USERNAME:");
        String username = scanner.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tENTER YOUR PASSWORD:");
        String password = scanner.next();
        if (validInputHr(username, password) || username.equals(correctU) && password.equals(correctP)) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tYOUR LOGGED IN...");
            try {
                processing();
                Thread.sleep(10000);
                clearConsole();
                DashS n = new DashS();
                n.Dashboard();
            } catch (Exception e) {

            }

        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tLOGGING FAILED! Try Agian.");
            try {
                Thread.sleep(1000);
                Login(scanner);
            } catch (Exception e) {

            }

        }
    }
    //////////////////////////////
    /// ASSISTANTHR LOGIN ///
    /////////////////////////////

    public static void assistHrLogin() {
        clearConsole();
        String correctU = "ASSIST";
        String correctP = "1234";
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|            ASSISTANT HR LOGIN          |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tENTER YOUR USERNAME:");
        String username = scanner.next();
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tENTER YOUR PASSWORD:");
        String password = scanner.next();
        if (validInputAssist(username, password) || username.equals(correctU) && password.equals(correctP)) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tYOUR LOGGED IN...");
            try {
                processing();
                Thread.sleep(10000);
                clearConsole();
                DashS n = new DashS();
                n.Dashboard();
            } catch (Exception e) {

            }
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tLOGGING FAILED! Try Agian.");
            try {
                Thread.sleep(50);
                assistHrLogin();
            } catch (Exception e) {

            }

        }
    }

    ////////////////////
    /// REGISTER ///
    ///////////////////
    public static void signup() {
        clearConsole();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|               REGISTER                 |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            1.HR");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            2.ASSISTANT HR");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            3.EXIT");
        System.out.print("\t\t\t\t\t\t\t\t\t\t ENTER YOUR CHOICE:");
        int register_Choice = scanner.nextInt();
        switch (register_Choice) {
            case 1:
                clearConsole();
                hrSignup();
                break;
            case 2:
                clearConsole();
                assistantSignup();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Number Please try again!");
                clearConsole();
                signup();

        }

    }
    /////////////////////
    /// HR SIGHUP ///
    ////////////////////

    public static void hrSignup() {
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|               HR SIGNUP                |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.print("\t\t\t\t\t\t\t\t\t\tENTER EMAIL:");
        String email = scanner.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\tENTER VALID USERNAME:");
        String userName = scanner.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        if (userInputHr(userName)) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t YOUR USERNAME IS ALREADY TAKEN!");
            return;
        }
        System.out.print("\t\t\t\t\t\t\t\t\t\tCREATE YOUR PASSWORD:");
        String passWord = scanner.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        valid newHr = new valid(userName, passWord);
        hrManager.add(newHr);
        hrManager.add(newHr);
        System.out.println("\t\t\t\t\t\t\t\t\t\tREGISTER SUCCESSFUL.");
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\tPress 1 To Create Another Account or 0 To Go To Main.:");
        int goChoice = scanner.nextInt();

        if (goChoice == 1) {
            clearConsole();
            hrSignup();

        } else if (goChoice == 0) {
            clearConsole();
            mainPage();

        }

    }
    ///////////////////////////////
    /// ASSISTANTHR SIGHUP ///
    //////////////////////////////

    public static void assistantSignup() {
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|           ASSISTANT HR SIGNUP          |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.print("\t\t\t\t\t\t\t\t\t\tENTER EMAIL:");
        String email = scanner.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\tENTER VALID USERNAME:");
        String userName = scanner.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        if (userInputAssist(userName)) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t YOUR USERNAME IS ALREADY TAKEN!");
            return;
        }
        System.out.print("\t\t\t\t\t\t\t\t\t\tCREATE YOUR PASSWORD:");
        String passWord = scanner.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        valid newAssistant = new valid(userName, passWord);
        hrAssistant.add(newAssistant);
        hrAssistant.add(newAssistant);
        System.out.println("\t\t\t\t\t\t\t\t\t\tREGISTER SUCCESSFUL.");
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\tPress 1 To Create Another Account or 0 To Go To Main.:");
        int goChoice = scanner.nextInt();

        if (goChoice == 1) {
            clearConsole();
            assistantSignup();

        } else if (goChoice == 0) {
            clearConsole();
            mainPage();

        }

    }

    ///////////////////////////////
    /// ADDING DEPARTMENTS ///
    //////////////////////////////
    public static void AddDepartment() {
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|              ADD DEPARTMENT            |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.print("\t\t\t\t\t\t\t\t\t\tENTER DEPARTMENT NAME:");
        String depName = scanner.next();
        Dep depat = new Dep(depName);
        AddDepartment.add(depat);
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\tPress 1 To ADD Another Department or 0 To Go To Dashboard.:");
        int goChoice = scanner.nextInt();

        if (goChoice == 1) { // create if  statment 
            clearConsole();
            AddDepartment();

        } else if (goChoice == 0) {
            clearConsole();
            DashS n = new DashS();
            n.Dashboard();

        }
    }
    ///////////////////////////////
    /// ADDING DESIGNATIONS ///
    //////////////////////////////

    public static void AddDesignation() {
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|              ADD DESIGNATION           |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.print("\t\t\t\t\t\t\t\t\t\tENTER DESIGNATION NAME:");
        String desiName = scanner.next();
        Desi desig = new Desi(desiName);
        AddDesignation.add(desig);
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\tPress 1 To ADD Another Designation or 0 To Go To Dashboard.:");
        int goChoice = scanner.nextInt();

        if (goChoice == 1) {
            clearConsole();
            AddDesignation();

        } else if (goChoice == 0) {
            clearConsole();
            DashS n = new DashS();
            n.Dashboard();

        }
    }

    ///////////////////////////////
    /// ADDING EMPLOYEES ///
    //////////////////////////////

    public static void AddEmployee() {
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|               ADD EMPLOYEE             |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.print("\t\t\t\t\t\t\t\t\t\tENTER EMPLOYEE NAME:");
        String empName = scanner.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\tENTER EPF NO:");
        String epfNo = scanner.next();
        System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\t\t\tAVAILABLE DEPARTMENTS :-");
        for (Dep dep : AddDepartment) {
            System.out.print(" " + dep.getDepName());
        }
        System.out.println(" ");
        System.out.print("\t\t\t\t\t\t\t\t\t\tAVAILABLE DESIGNATIONS :-");
        for (Desi desi : AddDesignation) {
            System.out.print(" " + desi.getDesiName());
        }

        while (true) {

            System.out.print("\n\t\t\t\t\t\t\t\t\t\tENTER DEPARTMENT NAME:");
            String depName = scanner.next();
            System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
            System.out.println("\n");
            System.out.print("\t\t\t\t\t\t\t\t\t\tENTER DESIGNATION NAME:");
            String desiName = scanner.next();
            System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
            try {
                saving();
                Thread.sleep(10000);
            } catch (Exception e) {

            }
// create a text file 
            if (displayDep(depName) || displayDesi(desiName)) {
                try {
                    FileWriter writeEmployee = new FileWriter("data.txt", true);
                    writeEmployee
                            .append("\n\t\t\t" + empName + "\t\t\t" + epfNo + "\t\t\t" + depName + "\t\t\t" + desiName);
                    System.out.println("\n\n\t\t\t\t\t\t\t\t\t\tEmployee Details Added Succssfully.");
                    writeEmployee.close();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t------------------------------------------");
                    System.out.print("\t\t\t\t\t\t\t\t\t\tPress 1 to ADD another Employee or 0 to go to Dashboard.:");
                    int goChoice = scanner.nextInt();

                    if (goChoice == 1) {
                        clearConsole();
                        AddEmployee();

                    } else if (goChoice == 0) {
                        DashS n = new DashS();
                        n.Dashboard();

                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            } else {
                try {
                    System.out
                            .println("Cannot ADD new Employee to Department Go ADD Employees to Available Departments");
                    Thread.sleep(3000);
                    DashS n1 = new DashS();
                    n1.Dashboard();
                } catch (Exception e) {
                    System.out.println(e);

                }

            }

        }
    }

    public static boolean userInputHr(String userName) {
        for (valid user : hrManager) {
            if (user.setUserName().equals(userName)) {
                return true;
            }

        }
        return false;
    }

    public static boolean userInputAssist(String userName) {
        for (valid user : hrAssistant) {
            if (user.setUserName().equals(userName)) {
                return true;
            }

        }
        return false;
    }

    public static boolean validInputHr(String userName, String passWord) {
        for (valid user : hrManager) {
            if (user.setUserName().equals(userName) && user.getPassWord().equals(passWord))
                return true;
        }
        return false;
    }

    public static boolean validInputAssist(String userName, String passWord) {
        for (valid user : hrAssistant) {
            if (user.setUserName().equals(userName) && user.getPassWord().equals(passWord))
                return true;
        }
        return false;
    }


    public static boolean displayDep(String depName) {

        for (Dep dep : AddDepartment) {
            if (dep.getDepName().equals(depName)) {
                return true;
            }

        }
        return false;
    }

    public static boolean displayDesi(String desiName) {
        for (Desi desi : AddDesignation) {
            if (desi.getDesiName().equals(desiName)) {
                return true;
            }

        }
        return false;
    }

    public static void processing() {
        Thread t;
        t = new Thread() {
            public void run() {
                clearConsole();
                System.out.print(
                        "\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t>>>Loading.................................................");
                for (int i = 0; i <= 100; i++) {
                    if (i < 10) {
                        System.out.print(i + "%");
                        System.out.print("\b\b");
                    } else if (i >= 10 && i <= 99) {
                        System.out.print(i + "%");
                        System.out.print("\b\b\b");
                    }
                    if (i == 100) {
                        System.out.print(i + "%");
                    }
                    try {
                        Thread.sleep(50);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }
            }
        };
        t.start();
    }

    public static void saving() {
        Thread t;
        t = new Thread() {
            public void run() {
                clearConsole();
                System.out.print(
                        "\n\n\n\n\n\t\t\t\t\t\t\t\t\t\t>>>Saving.................................................");
                for (int i = 0; i <= 100; i++) {
                    if (i < 10) {
                        System.out.print(i + "%");
                        System.out.print("\b\b");
                    } else if (i >= 10 && i <= 99) {
                        System.out.print(i + "%");
                        System.out.print("\b\b\b");
                    }
                    if (i == 100) {
                        System.out.print(i + "%");
                    }
                    try {
                        Thread.sleep(50);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }
            }
        };
        t.start();
    }

    public static void main(String[] args) {
        File Employee = new File("data.txt");
        try {
            // System.out.println(Employee.createNewFile());

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            processing();
            Thread.sleep(10000);
        } catch (Exception e) {

        }
        clearConsole();
        mainPage();

    }
}
class Dep {
    private String depName;

    public Dep(String depName) {
        this.depName = depName;
    }

    public String getDepName() {
        return depName;
    }
}

class Desi {
    private String desiName;

    public Desi(String desiName) {
        this.desiName = desiName;
    }

    public String getDesiName() {
        return desiName;
    }
}

class valid {
    private String userName;
    private String passWord;

    public valid(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;

    }

    public String setUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
}

// create inheritance 
class Searching extends Cios {

    /////////////////
    /// SEARCH ///
    ////////////////
    void Search() {
        File input = new File("data.txt");
        FileReader fr = null;
        String SearchWord, str;
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|                 SEARCH                 |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t  SEARCH:");
        SearchWord = scanner.next();
        try {
            fr = new FileReader(input);
            BufferedReader br = new BufferedReader(fr);
            while ((str = br.readLine()) != null) {
                if (str.contains(SearchWord)) {
                    System.out.println(
                            "\t\t\t\t\t\t\t\t--------------------------------------------------------------------------------");
                    System.out.println(
                            "\t\t\t\t\t\t\t\tEMP NAME" + "\t\tEPF NO" + "\t\t     DEPARTMENT"
                                    + "\t\t       DESIGNATION");
                    System.out.println("\n\t\t\t\t\t" + str + "");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t--------------------------------------------------------------------------------");
                    System.out.print("\t\t\t\t\t\t\t\t\t\tPress 1 to Search Again or 0 to go to Dashboard.:");
                    int goChoice = scanner.nextInt();

                    if (goChoice == 1) {
                        clearConsole();
                        Search();

                    } else if (goChoice == 0) {
                        Dashboard();

                    }

                }
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Searching.class.getName()).log(Level.SEVERE, null, e);

        } catch (IOException e) {
            Logger.getLogger(Searching.class.getName()).log(Level.SEVERE, null, e);

        }

    }

    void Dashboard() {
        clearConsole();
        System.out.println("\n\n\n");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|               DASH BOARD               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            1.ADD DEPARTMENT");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            2.ADD DESIGNATION");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            3.ADD EMPLOYEES");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            4.SEARCH");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            5.LOGOUT");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            6.EXIT");
        System.out.print("\t\t\t\t\t\t\t\t\t\tENTER YOUR CHOICE:");
        int DashBoardChoice = scanner.nextInt();
        switch (DashBoardChoice) {
            case 1:
                clearConsole();
                AddDepartment();
                break;
            case 2:
                clearConsole();
                AddDesignation();
                break;
            case 3:
                clearConsole();
                AddEmployee();
                break;
            case 4:
                try {
                    processing();
                    Thread.sleep(10000);
                } catch (Exception e) {

                }
                clearConsole();
                Searching show = new Searching();
                show.Search();
                break;
            case 5:
                try {
                    processing();
                    Thread.sleep(10000);
                } catch (Exception e) {

                }
                clearConsole();
                mainPage();
            case 6:
                System.exit(0);
            default:
                System.out.println("Invalid Number Please try again!");
                clearConsole();
                Dashboard();

        }

    }

}

class DashS extends Cios {
    /////////////////////
    /// DASHBOARD///
    ////////////////////
    void Dashboard() {
        clearConsole();
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|               DASH BOARD               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            1.ADD DEPARTMENT");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            2.ADD DESIGNATION");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            3.ADD EMPLOYEES");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            4.SEARCH");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            5.LOGOUT");
        System.out.println("\t\t\t\t\t\t\t\t\t\t            6.EXIT");
        System.out.print("\t\t\t\t\t\t\t\t\t\tENTER YOUR CHOICE:");
        int DashBoardChoice = scanner.nextInt();
        switch (DashBoardChoice) {
            case 1:
                clearConsole();
                AddDepartment();
                break;
            case 2:
                clearConsole();
                AddDesignation();
                break;
            case 3:
                clearConsole();
                AddEmployee();
                break;
            case 4:
                try {
                    processing();
                    Thread.sleep(10000);
                } catch (Exception e) {

                }
                clearConsole();
                Searching myobj = new Searching();
                myobj.Search();
                break;
            case 5:
                try {
                    processing();
                    Thread.sleep(10000);
                } catch (Exception e) {

                }
                clearConsole();
                mainPage();
            case 6:
                System.exit(0);
            default:
                System.out.println("Invalid Number Please try again!");
                clearConsole();
                Dashboard();

        }

    }

    void Search() {
        File input = new File("data.txt");
        FileReader fr = null;
        String SearchWord, str;
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|                 SEARCH                 |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|----------------------------------------|");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t  SEARCH:");
        SearchWord = scanner.next();
        try {
            fr = new FileReader(input);
            BufferedReader br = new BufferedReader(fr);
            while ((str = br.readLine()) != null) {
                if (str.contains(SearchWord)) {
                    System.out.println("\n\t\t\t\t\t" + str + "");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t--------------------------------------------------------------------------------");
                    System.out.print("\t\t\t\t\t\t\t\t\t\tPress 1 to Search Again or 0 to go to Dashboard.:");
                    int goChoice = scanner.nextInt();

                    if (goChoice == 1) {
                        clearConsole();
                        Search();

                    } else if (goChoice == 0) {
                        Dashboard();

                    }

                }
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(DashS.class.getName()).log(Level.SEVERE, null, e);

        } catch (IOException e) {
            Logger.getLogger(DashS.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
