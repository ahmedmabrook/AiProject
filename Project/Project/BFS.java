import java.util.Queue;
import java.util.LinkedList;

public class BFS {
    public static void BFSFunction(){
        String [] operatorsWithWait={"RequestFood","RequestMaterial","RequestEnergy",
                             "Wait","Build1","Build2"};

        String [] operatorsWithOUTWait={"RequestFood","RequestMaterial",
                                        "RequestEnergy","Build1","Build2"};

        String [] build1build2={"Build1","Build2"};                               
        // get the initial state of the problem
        System.out.println(LLAPSearch.getLLAPInitialState());
        //create new node to start with it
        //another note the operator is the applied operator to produce this node
        //so at the begining null 
        Node nodeInitial = new Node(Operators.getInitialProsperity(), 
                                    null, null, 
                                    0, 0);


        System.out.println(nodeInitial.printNodeAsString());                         
        
        Node childNode = new Node(Operators.getInitialProsperity(), 
                                    nodeInitial, null, 
                                    0, 0);

    }

    // public static bfs(graph, start, goal){
    //     Queue<Node> visited= null;



    // }
}
