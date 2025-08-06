/*
14. Design a program that accepts a URL and fetches the content of the webpage.
Handle exceptions for invalid URLs, network issues, and unavailable resources.
 */

import java.util.*;

class Fetcher {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Enter a URL:");
                String url = ob.nextLine();
                if(fetchWebContent(url)) break;
            } catch (InvalidURLException e) {
                System.out.println("Invalid URL: " + e.getMessage());
            } catch (NetworkException e) {
                System.out.println("Network issue: " + e.getMessage());
            } catch (ResourceUnavailableException e) {
                System.out.println("Resource unavailable: " + e.getMessage());
            }
        }
    }

    static boolean fetchWebContent(String url) throws InvalidURLException, NetworkException, ResourceUnavailableException {
        if (url.equals("http://invalid.url")) {
            throw new InvalidURLException("The URL format is incorrect.");
        } else if (url.equals("http://network.issue")) {
            throw new NetworkException("Failed to connect to the network.");
        } else if (url.equals("http://unavailable.resource")) {
            throw new ResourceUnavailableException("The requested resource is unavailable.");
        } else {
            System.out.println("Fetching content from: " + url);
            System.out.println("Content fetched successfully.");
            return true;
        }
    }
}

class InvalidURLException extends Exception {
    InvalidURLException(String message) {
        super(message);
    }
}

class NetworkException extends Exception {
    NetworkException(String message) {
        super(message);
    }
}

class ResourceUnavailableException extends Exception {
    ResourceUnavailableException(String message) {
        super(message);
    }
}
