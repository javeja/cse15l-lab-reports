import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.

    public String handleRequest(URI url) {
        if (url.getPath().contains("/add")) {
            String[] user = url.getQuery().split("s=");
          if (url.getPath().contains("/add")) {
                String[] message = url.getQuery().split("user=");
                }
            }
      return String.format("user"+": "+"message");
}

class NumberServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
