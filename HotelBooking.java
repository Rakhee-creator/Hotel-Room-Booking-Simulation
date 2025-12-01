import java.util.Scanner;
public class HotelBooking {

        public static void main(String[] args) {
            int totalrooms = 200;
            int occupied = 0;
            Scanner sc = new Scanner(System.in);

            while (occupied < totalrooms) {
                System.out.println("Total Rooms: " + totalrooms);
                System.out.println("Rooms currently available: " + (totalrooms - occupied));
                System.out.print("Enter number of rooms required: ");
                int requirement = sc.nextInt();

                if (requirement <= (totalrooms - occupied)) {
                    occupied += requirement;
                    System.out.println("✅ Booking successful!");
                    System.out.println("Rooms occupied: " + occupied);
                    System.out.println("Rooms available: " + (totalrooms - occupied));
                } else {
                    System.out.println("❌ Not enough rooms available. Try a smaller number.");
                }

                System.out.println("-----------------------------------");
            }

            System.out.println("🏨 All rooms are now occupied! No more bookings possible.");
        }
    }



