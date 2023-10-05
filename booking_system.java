import java.util.Scanner;
public class booking_system {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] room_no = {"1","2","3","4","5"};
        String[] names = new String[5];
        int[] members = new int[5];

        while (true){
            System.out.print("Press 1=check in | 2=check out | 3=display | 9=exit: ");
            int code = input.nextInt();
            input.nextLine();

            if (code == 1){
                while (true){
                    int available_rooms = 0;
                    for (int member : members) {
                        if (member == 0) {
                            available_rooms += 1;
                        }
                    }

                    if (available_rooms == 0){
                        System.out.println("All rooms are booked\n");
                        break;
                    } else {
                        System.out.println("Available rooms");
                        for (int i = 0; i < members.length; i++){
                            if (members[i] == 0){
                                System.out.print(room_no[i]+" ");
                            }
                        }
                        System.out.print("\nSelect a room number: ");
                        int checkin_no = input.nextInt();
                        input.nextLine();

                        if (checkin_no <= 0 || checkin_no >= 6){
                            System.out.println("Invalid room number. Try again\n");
                            continue;
                        } else if (members[checkin_no-1] > 0){
                            System.out.println("This room is already booked\n");
                            continue;
                        } else {
                            System.out.print("Enter the name: ");
                            String name = input.nextLine();

                            while (true){
                                System.out.print("Enter the number of members: ");
                                int no_members = input.nextInt();
                                input.nextLine();

                                if (no_members > 4){
                                    System.out.println("\nMaximum number is 4\n");
                                    continue;
                                }

                                if (no_members == 0){
                                    System.out.println("\nMinimum number is 1\n");
                                    continue;
                                }

                                if (no_members > 0){
                                    names[checkin_no - 1] = name;
                                    members[checkin_no -1] = no_members;

                                    System.out.println("\nBooking successful");
                                    System.out.println("Room " + checkin_no + " is reserved for " + name + "\n");
                                    break;
                                }

                            }
                        }
                    }
                    break;
                }
            }

            if (code == 2){
                while (true){
                    System.out.println("Booked rooms");
                    for (int i = 0; i < 5; i++){
                        if (members[i] != 0){
                            System.out.println(room_no[i]+" ");
                        }
                    }

                    System.out.print("Enter the room number: ");
                    int checkout_no = input.nextInt();
                    input.nextLine();

                    if (checkout_no <= 0 || checkout_no >= 6){
                        System.out.println("Invalid room number. Try again\n");
                        continue;
                    } else if (members[checkout_no-1] == 0){
                        System.out.println("This room is empty\n");
                        continue;
                    } else {
                        System.out.println(names[checkout_no - 1] + " checked out from room number " + checkout_no);
                        System.out.println("Room " + checkout_no + " is free now\n");
                        members[checkout_no-1] = 0;
                        break;
                    }
                }
            }

            if (code == 3){
                System.out.print("\nRoom numbers:\t\t");
                for (int i = 0; i < 5; i++){
                    System.out.print(room_no[i] + "\t\t");
                }

                System.out.print("\nCurrent Status:\t\t");
                for (int i = 0; i < 5; i++){
                    if (members[i] == 0){
                        System.out.print("free\t");
                    } else {
                        System.out.print("booked\t");
                    }
                }

                System.out.print("\nMembers:\t\t\t");
                for (int i = 0; i < 5; i++){
                    System.out.print(members[i]+ "\t\t");
                }

                System.out.print("\n\n");
            }

            if (code == 9){
                break;
            }
        }
    }
}