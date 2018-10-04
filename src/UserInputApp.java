import java.util.Scanner;
import java.util.ArrayList;

public class UserInputApp {
    private static final double Cola = 2.50;
    private static final double Sprite = 1.00;
    private static final double Wine = 7.82;
    private static final double Whiskey = 12.00;
    private static final double Chocolate = 0.55;
    private static final double Bread = 1.50;
    private static final double PorkSteak = 8.50;
    private static final double Chips = 1.20;
    private static final double Donuts = 3.25;
    private static final double Pizza = 10.12;
    //initialize the ArrayList
    private static ArrayList<Double> itemsOrdered = new ArrayList<Double>();
    //Initialize the scanner.
    private static Scanner product_Select = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
        selectOption();
    }

    private static void showMenu() {
        System.out.println("PRODUCTS LIST:");
        System.out.println(1 + ". Cola 2.50$");
        System.out.println(2 + ". Sprite 1.00$");
        System.out.println(3 + ". Wine 7.82$");
        System.out.println(4 + ". Whiskey 12.00$");
        System.out.println(5 + ". Chocolate 0.55$");
        System.out.println(6 + ". Bread 1.50$");
        System.out.println(7 + ". Pork Steak 8.50$");
        System.out.println(8 + ". Chips 1.20$");
        System.out.println(9 + ". Donuts 3.25$");
        System.out.println(10 + ". Pizza 10.12$");
        System.out.println();
    }

    private static void selectOption() {

        System.out.println("Please input the number next to the item you want to buy: ");

        //Check if the input is an Int.
        while(!product_Select.hasNextInt()){
            System.out.println();
            System.out.println("Please input a number!!!");
            product_Select.next();
        }

        int product_code = product_Select.nextInt();

        switch (product_code) {
            case 1: {
                System.out.println();
                System.out.println("You have ordered Cola." + "\n");
                How_many_items(Cola);
                Yes_No();
                break;
            }
            case 2: {
                System.out.println();
                System.out.println("You have ordered Sprite." + "\n");
                How_many_items(Sprite);
                Yes_No();
                break;
            }
            case 3: {
                System.out.println();
                System.out.println("You have ordered Wine." + "\n");
                How_many_items(Wine);
                Yes_No();
                break;
            }
            case 4: {
                System.out.println();
                System.out.println("You have ordered Whiskey. " + "\n");
                How_many_items(Whiskey);
                Yes_No();
                break;
            }
            case 5: {
                System.out.println();
                System.out.println("You have ordered Chocolate. " + "\n");
                How_many_items(Chocolate);
                Yes_No();
                break;
            }
            case 6: {
                System.out.println();
                System.out.println("You have ordered Bread. " + "\n");
                How_many_items(Bread);
                Yes_No();
                break;
            }
            case 7: {
                System.out.println();
                System.out.println("You have ordered Pork Steak. " + "\n");
                How_many_items(PorkSteak);
                Yes_No();
                break;
            }
            case 8: {
                System.out.println();
                System.out.println("You have ordered Chips. " + "\n");
                How_many_items(Chips);
                Yes_No();
                break;
            }
            case 9: {
                System.out.println();
                System.out.println("You have ordered Donuts. " + "\n");
                How_many_items(Donuts);
                Yes_No();
                break;
            }
            case 10: {
                System.out.println();
                System.out.println("You have ordered of Pizza. " + "\n");
                How_many_items(Pizza);
                Yes_No();
                break;
            }
            default: {
                System.out.println();
                System.out.println("Please input a valid number! ");
                selectOption();
            }

        }
    }

    private static void How_many_items(double item) {

        System.out.println("How many units of this product would you like to order?");

        //Check if the input is an Int.
        while (!product_Select.hasNextInt()) {
            System.out.println();
            System.out.println("Please input a number!!!");
            product_Select.next();
        }

        int item_numb_req = product_Select.nextInt();

        // Calculate total price per type of product.
        item = item * item_numb_req;

        System.out.println("********************************");
        System.out.println("You have ordered " + item_numb_req + " unit(s). The price is " + item + " $");
        System.out.println("********************************\n");

        // Add element to the ArrayList "itemsOrdered";
        itemsOrdered.add(item);
    }

    private static void Yes_No(){

        System.out.println("Would you like to order something else? Y/N");
        String yesOrNo = product_Select.next();
        System.out.println("********************************\n");

        if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
            showMenu();
            selectOption();
        } else if (yesOrNo.equals("N") || yesOrNo.equals("n")) {
            calculate_Cost();
        } else {
            System.out.println("Please input a valid Character!!");
            Yes_No();
        }
    }

    private static void calculate_Cost () {
        double Total = 0;

        //Summarize the total cost of the whole order.
        for (int n = 0; n < itemsOrdered.size(); n++) {
            Total += itemsOrdered.get(n);
        }

        System.out.println("##########################" + "\n");
        System.out.println("The total PRICE of your order is " + Total + "$" + "\n");
        System.out.println("Have a good day!!!\n");
        System.out.println("##########################");
    }

}

