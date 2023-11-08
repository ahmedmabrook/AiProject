import java.util.Queue;
import java.util.LinkedList;

public class BFS {
    public static void BFSFunction(){
        String [] operators;

        String [] operatorsWithOUTWait={"RequestFood","RequestMaterial",
                                        "RequestEnergy","Build1","Build2"};

        String [] build1build2={"Build1","Build2"};                               
        // get the initial state of the problem
        System.out.println(LLAPSearch.getLLAPInitialState());
        
        
        
        //create new node to start with it
        //another note the operator is the applied operator to produce this node
        //so at the begining null 
        State initialState = new State();
        Node nodeInitial = new Node(initialState, 
                                    null, null, 
                                    0, 0);
        System.out.println(nodeInitial.printNodeAsString());
        // System.out.println(nodeInitial.getState().getProsperity());
        Queue<Node> queueLevelNodes=new LinkedList<Node>();
        queueLevelNodes.add(nodeInitial);

        
        Node currentNodeInitial = queueLevelNodes.poll();
        String [] theNextOperationsInitial= getOperators(nodeInitial);
        nodeInitial.setDepth(nodeInitial.getDepth() + 1);
        for (String operator : theNextOperationsInitial) {
                    Node nodeChild = null;
                    System.out.println(operator);
                    State newState = new State();
                    nodeChild = new Node(newState, 
                                    nodeInitial, operator, 
                                    nodeInitial.getDepth(), 0);
                    applyOperator(nodeChild, operator);                
                    queueLevelNodes.add(nodeChild);
        }

        while (!queueLevelNodes.isEmpty()) {
                    Node currentNode = queueLevelNodes.remove();
                    System.out.println(currentNode.printNodeAsString());
        }
        // while (!queueLevelNodes.isEmpty()) {
        //     Node currentNode = queueLevelNodes.poll();
        //     String [] theNextOperations= getOperators(currentNode);
        //     String applicableOperator = currentNode.getOperator();
        //     applyOperator(currentNode, applicableOperator);                
        // }

        //node (50 , initialNode , requestFood , 1 ,0 )//node (50 , initialNode , requestMaterial , 1 ,0 )//node (50 , initialNode , requestEnergy , 1 ,0 )//node (50 , initialNode , build1 , 1 ,0 )//node (50 , initialNode , build2 , 1 ,0 )
        // System.out.println(nodeInitial.printNodeAsString());                         
        


    }

    public static void expand(Node node ){
    
    }

    public static void applyOperator(Node node ,String operator){
        if(operator.equals("RequestFood")){
 
            Operators.RequestFood(node);
 
        }else if(operator.equals("RequestMaterial")){
            Operators.RequestMaterials(node);
        }else if(operator.equals("RequestEnergy")){
            Operators.RequestEnergy(node);
        }else if(operator.equals("Wait")){
            Operators.WAIT();
        }else if(operator.equals("Build1")){
            Operators.BUILD1();
        }else if(operator.equals("Build2")){
            Operators.BUILD2();
        }else{
        }

    }


    public static String[] getOperators(Node node){
        String [] operators={};
        if(node.getOperator()==null){
             operators=new String[]{"RequestFood","RequestMaterial",
                                        "RequestEnergy","Build1","Build2"};
        }else if(node.getOperator().equals("RequestFood")||node.getOperator().equals("RequestEnergy")||node.getOperator().equals("RequestMaterial")){
             operators=new String[]{"Wait","Build1","Build2"};

        }
        return operators;

    }

    // public static bfs(graph, start, goal){
    //     Queue<Node> visited= null;



    // }
}
