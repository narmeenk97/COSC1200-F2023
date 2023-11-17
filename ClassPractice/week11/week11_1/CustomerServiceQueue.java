package ClassPractice.week11.week11_1;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerServiceQueue {

    private Queue<String> serviceQueue;

    public CustomerServiceQueue() {
        serviceQueue = new LinkedList<>();
    }

    /**
     * add a request to queue
     * @param request
     */
    public void newRequest(String request) {
        serviceQueue.add(request);
    }

    /**
     * process the next request
     * @return
     */
    public String processRequest(){
        return serviceQueue.isEmpty() ?
                "No requests to process" : serviceQueue.poll();
    }

    /**
     * Get the next request
     * @return
     */
    public String nextRequest() {
        return serviceQueue.isEmpty() ?
                "No pending requests" : serviceQueue.peek();
    }

    public static void main(String[] args) {
        CustomerServiceQueue csQueue = new CustomerServiceQueue();
        csQueue.newRequest("Request1");
        csQueue.newRequest("Request2");
        System.out.println("Next Request: " + csQueue.nextRequest());
        System.out.println("Processing Request: " + csQueue.processRequest());
        System.out.println("Next Request: " + csQueue.nextRequest());
    }
}
