import java.util.Scanner;

public class Main {

    public static Main(String[] args) {

        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Good Day!");
        System.out.println("-------------------");
    

        while true {

            System.out.println("\n Choose a number that you want to do: "
                    + "\n 1. Add Items"
                    + "\n 2. Delete an Item"
                    + "\n 3. Move/Swap an Item"
                    + "\n 4. Exit");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    
                    System.out.println("Enter atleast 5 elements you want to add: ");
                    for (int i = 0; i < 5; i++) {
                        int element = scanner.nextInt();
                        linkedList.add(element);
                    }
                    System.out.println("Current Linked List:");
                    linkedList.printList();
                    break;
            
                case 2:
                    
                    System.out.println("Enter the value of the item you want to delete: ");
                    int valueToDelete = scanner.nextInt();
                    linkedList.deleteByValue(valueToDelete);
                    System.out.println("Item deleted (if existed). Current Linked List:");
                    linkedList.printList();
                    break;

                case 3:
                    
                    System.out.println("Enter the index of the item you want to move: ");
                    int currentIndex = scanner.nextInt();
                    System.out.println("Enter the new index to move the item to: ");
                    int newIndex = scanner.nextInt();
                    linkedList.moveNodePointer(currentIndex, newIndex);
                    System.out.println("Item moved! Current Linked List:");
                    linkedList.printList();
                    break;

                case 4:
                    
                    System.out.println("Exit! Bye...........!!!");
                    scanner.close(); // Closing the scanner
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        
        }
    
    }
}