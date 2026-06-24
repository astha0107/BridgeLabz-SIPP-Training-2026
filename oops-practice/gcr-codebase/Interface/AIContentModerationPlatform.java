// Interface 1
interface TextModeration {

    // Abstract method
    boolean isOffensive(String post);

    // Default method
    default void displayModerationPolicy() {
        System.out.println("Text Moderation Policy:");
        System.out.println("Posts containing offensive words are not allowed.");
    }

    // Static method
    static boolean containsRestrictedWords(String post) {
        String[] restrictedWords = {"hate", "abuse", "badword"};

        post = post.toLowerCase();

        for (String word : restrictedWords) {
            if (post.contains(word)) {
                return true;
            }
        }
        return false;
    }
}

// Interface 2
interface SpamDetection {

    // Abstract method
    boolean isSpam(String post);

    // Default method
    default void displayModerationPolicy() {
        System.out.println("Spam Detection Policy:");
        System.out.println("Repeated promotional content is not allowed.");
    }
}

// Class implementing both interfaces
class ContentModerator implements TextModeration, SpamDetection {

    // Implement abstract method of TextModeration
    @Override
    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    // Implement abstract method of SpamDetection
    @Override
    public boolean isSpam(String post) {
        post = post.toLowerCase();

        // Simple spam detection logic
        return post.contains("buy now") ||
               post.contains("free money") ||
               post.contains("click here");
    }

    // Resolve default method conflict
    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

// Main class
public class AIContentModerationPlatform {

    public static void main(String[] args) {

        // Array of user posts
        String[] posts = {
            "Welcome everyone to our community!",
            "Buy now and get 50% discount!",
            "I hate this product.",
            "Click here to win free money!",
            "Have a great day everyone!"
        };

        ContentModerator moderator = new ContentModerator();

        // Display moderation policies
        moderator.displayModerationPolicy();

        System.out.println("\nPost Analysis:\n");

        // Check each post
        for (String post : posts) {

            System.out.println("Post: " + post);

            if (moderator.isSpam(post)) {
                System.out.println("Status: Spam Post");
            } else if (moderator.isOffensive(post)) {
                System.out.println("Status: Offensive Post");
            } else {
                System.out.println("Status: Valid Post");
            }

            System.out.println();
        }
    }
}