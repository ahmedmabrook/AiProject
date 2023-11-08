public class Node {
    private static int state;
    private static Node parent;
    private static String operator;
    private static int depth;
    private static int pathCost;

    public Node(int state, Node parent, String operator, int depth, int pathCost) {
        this.state = state;
        this.parent = parent;
        this.operator = operator;
        this.depth = depth;
        this.pathCost = pathCost;
    }
    // Getter for 'state'
    public int getState() {
        return state;
    }

    // Setter for 'state'
    public void setState(int state) {
        this.state = state;
    }

    // Getter for 'parent'
    public Node getParent() {
        return parent;
    }

    // Setter for 'parent'
    public void setParent(Node parent) {
        this.parent = parent;
    }

    // Getter for 'operator'
    public String getOperator() {
        return operator;
    }

    // Setter for 'operator'
    public void setOperator(String operator) {
        this.operator = operator;
    }

    // Getter for 'depth'
    public int getDepth() {
        return depth;
    }

    // Setter for 'depth'
    public void setDepth(int depth) {
        this.depth = depth;
    }

    // Getter for 'pathCost'
    public int getPathCost() {
        return pathCost;
    }

    // Setter for 'pathCost'
    public void setPathCost(int pathCost) {
        this.pathCost = pathCost;
    }
   
    public static String printNodeAsString() {
        return "State: " + state + ", Parent: " + parent + ", Operator: " + operator + ", Depth: " + depth + ", Path Cost: " + pathCost;
    }
    // Node node = new Node("some state", null, "some operator", 0, 10);
    // // Using getter methods to access values
    // String stateValue = node.getState();
    // Node parentValue = node.getParent();
    // String operatorValue = node.getOperator();
    // int depthValue = node.getDepth();
    // int pathCostValue = node.getPathCost();
    
    // // Using setter methods to update values
    // node.setState("new state");
    // node.setParent(new Node("new parent state", null, "parent operator", 1, 20));
    // node.setOperator("new operator");
    // node.setDepth(2);
    // node.setPathCost(30);
    
}
