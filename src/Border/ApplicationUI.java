package Border;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Makes up the user interface (text based) of the application.
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 * 
 * @author asty
 * @version 1.0
 */
class ApplicationUI {

    private Application application = null;
    
    String[] menuItems = {
        "1. Create flight",
        "2. Register passenger",
        "3. Sell ticket to passenger",
        "4. List seats in flight",
        "5. List passangers in flight"
    };

    /**
     * Creates an instance of the POSApplicationUI User interface. An instance
     * of the POSApplication is created, and initialized.
     */
    public ApplicationUI() {
        //TODO: Replace "new Application" with your application class.
        this.application = new Application();
    }

    /**
     * Starts the application by showing the menu and retrieving input from the
     * user.
     */
    void start() {
        this.application.init();

        boolean quit = false;

        while (!quit) {
            try {
                int menuSelection = this.showMenu();
                switch (menuSelection) {
                    case 1:
                        this.application.doCreateFlight();
                        break;

                    case 2:
                        this.application.doRegisterPassenger();
                        break;

                    case 3:
                        this.application.doSellTicket();
                        break;

                    case 4:
                        this.application.doListSeatsInFlight();
                        break;

                    case 5:
                        this.application.doListPassengersInFlight();
                        break;

                    case 6:
                        System.out.println("\nThank you for using Application v0.1. Bye!\n");
                        quit = true;
                        break;

                    default:
                }
            } 
            catch (InputMismatchException ime) 
            {
                System.out.println("\nERROR: Please provide a number between 1 and " + this.menuItems.length + "..\n");
            }
        }        
        
    }

    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items. 
     * If the user inputs anything
     * else, an InputMismatchException is thrown. The method returns the valid
     * input from the user.
     *
     * @return the menu number (between 1 and max menu item number) provided by the user.
     * @throws InputMismatchException
     */
    private int showMenu() throws InputMismatchException {
        System.out.println("\n**** Application v0.1 ****\n");
        for ( String menuItem : menuItems )
        {
            System.out.println(menuItem);
        }
        int maxMenuItemNumber = menuItems.length + 1;
        System.out.println(maxMenuItemNumber + ". Exit\n");
        System.out.println("Please choose menu item (1-" + maxMenuItemNumber + "): ");

        Scanner reader = new Scanner(System.in);
        int menuSelection = reader.nextInt();
        if ((menuSelection < 1) || (menuSelection > maxMenuItemNumber)) {
            throw new InputMismatchException();
        }
        return menuSelection;
    }

}
