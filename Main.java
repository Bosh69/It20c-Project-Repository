package topic_2_linkedlist_string;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        // Adding predefined songs to the list
        list.add("Reign Of Darkness by Thy Art Is Murder");
        list.add("The Purest Strain Of Hate by Thy Art Is Murder");
        list.add("Shadow Of Eternal Sin by Thy Art Is Murder");
        list.add("Vile Creation by Thy Art Is Murder");
        System.out.println("Songs by Thy Art Is Murder added to the list.");
        System.out.println("Enter more song titles to add to the list (type 'done' to finish):");

        // Loop to allow user input for adding nodes to the linked list
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            list.add(input);
        }

        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.printList();

        // Deleting by value using user input
        System.out.println("Enter the song title to delete from the list: Reign Of Darkness by Thy Art Is Murder");
        input = scanner.nextLine();  // Get user input for the song to delete
        list.deleteByValue(input);   // Delete the song from the linked list
        System.out.println("Deleting \"Reign Of Darkness by Thy Art Is Murder" + input + "\" from the list...");
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.printList();

        

        scanner.close();
    }
}
