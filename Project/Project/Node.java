public class Node {
    private  State states;
    private  Node parent;
    private  String operator;
    private  int depth;
    private  int pathCost;

    public Node(State states, Node parent, String operator, int depth, int pathCost) {
        this.states = states;
        this.parent = parent;
        this.operator = operator;
        this.depth = depth;
        this.pathCost = pathCost;
    }
    // Getter for 'state'
    public State getState() {
        return states;
    }

    // Setter for 'state'
    public void setState(State states) {
        this.states = states;
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
    public  int getDepth() {
        return this.depth;
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
   
    public  String printNodeAsString() {
        return " energy: " + this.states.getEnergy() +" prosperity: " + this.states.getProsperity() +" materials: " + this.states.getMaterials() +" food: " + this.states.getFood() + ", Parent: " + this.parent + ", Operator: " + this.operator + ", Depth: " + this.depth + ", Path Cost: " + this.pathCost;
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
