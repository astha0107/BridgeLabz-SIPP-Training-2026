// Interface 1
interface StreamingService {

    // Abstract method
    void streamMovie(String movie);

    // Default method
    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium Plan");
    }
}

// Interface 2
interface GamingService {

    // Abstract method
    void playGame(String game);

    // Default method
    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Gold Plan");
    }
}

// Class implementing both interfaces
class SmartTV implements StreamingService, GamingService {

    // Implement abstract methods
    @Override
    public void streamMovie(String movie) {
        System.out.println("Streaming Movie: " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing Game: " + game);
    }

    // Resolve default method conflict
    @Override
    public void showSubscriptionDetails() {
        System.out.println("Smart TV Subscription Details:");

        // Calling both interface default methods
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    // Display all available content
    void displayContent(String[] movies, String[] games) {

        System.out.println("\nAvailable Movies:");
        for (String movie : movies) {
            System.out.println("- " + movie);
        }

        System.out.println("\nAvailable Games:");
        for (String game : games) {
            System.out.println("- " + game);
        }
    }
}

// Main class
public class MultiServiceSmartTV {
    public static void main(String[] args) {

        // Arrays storing movies and games
        String[] movies = {
                "Inception",
                "Avengers: Endgame",
                "Interstellar"
        };

        String[] games = {
                "FIFA 25",
                "Minecraft",
                "Need for Speed"
        };

        SmartTV tv = new SmartTV();

        // Display subscription details
        tv.showSubscriptionDetails();

        // Display available content
        tv.displayContent(movies, games);

        // Example usage
        System.out.println();
        tv.streamMovie(movies[0]);
        tv.playGame(games[0]);
    }
}
