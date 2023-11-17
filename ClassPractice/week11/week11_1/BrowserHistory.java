package ClassPractice.week11.week11_1;

import java.util.Stack;

public class BrowserHistory {

    private Stack<String> history;
    private Stack<String> forwardStack;

    private BrowserHistory() {
        history = new Stack<>();
        forwardStack = new Stack<>();
    }

    /**
     * Add url to stack
     * @param url
     */
    public void visit(String url) {
        history.push(url);
        forwardStack.clear();
    }

    /**
     * Go back to previous page
     * @return
     */
    public String goBack() {
        if (!history.isEmpty()) {
            forwardStack.push(history.peek());
            return history.pop();
        }
        return "No previous page";
    }

    /**
     * Go forward a page
     * @return
     */
    private String goForward(){
        if (!forwardStack.isEmpty()) {
            String forwardPage = forwardStack.pop();
            history.push(forwardPage);
            return forwardPage;
        }
        return "No forward page";
    }

    public String currentPage() {
        return history.isEmpty()
                ? "No current page" : history.peek();
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visit("Page1");
        browserHistory.visit("Page2");
        System.out.println("Current Page: " + browserHistory.currentPage());
        browserHistory.goBack();
        System.out.println("Current Page: " + browserHistory.currentPage());
        browserHistory.goForward();
        System.out.println("Current Page: " + browserHistory.currentPage());
    }
}
