//First add one node to the linked list
//Then fill out print method

public class IntLinkedList {
    IntListNode firstNode = null;
    IntListNode lastNode = null;

    // O(1)
    public void insert(int value){
        if(nodeForGivenValue(value) != null){
            return;
        }
        else{
            IntListNode currentNode = new IntListNode(value);
            if(firstNode == null){
                firstNode = currentNode;
                lastNode = currentNode;
            }
            else {
                lastNode.setNextNode(currentNode);
                currentNode.setPrevNode(lastNode);
                lastNode = currentNode;
            }
        }
    }

    public void print(){
        if(firstNode == null){
            System.out.println("null");
        }
        else {
            IntListNode currentNode = firstNode;
            while(currentNode != null){
                System.out.println(currentNode.value);
                currentNode = currentNode.getNextNode();
            }
        }
    }

    private IntListNode nodeForGivenValue(int value){
        IntListNode currentNode = firstNode;
        while(currentNode != null){
            if(value == currentNode.value){
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }
        // Here's the fallthrough.
        return null;
    }

    // O(n)... ughghghg...
    public void remove(int value){
        IntListNode nodeToRemove = nodeForGivenValue(value);
        IntListNode previousNode = nodeToRemove.getPrevNode();
        IntListNode nextNode = nodeToRemove.getNextNode();
        if(previousNode == null){
            firstNode = nextNode;
            nextNode.setPrevNode(null);
        }
        else if (nextNode == null){
            lastNode = previousNode;
            previousNode.setNextNode(null);
        }
        else {
            previousNode.setNextNode(nodeToRemove.getNextNode());
            nextNode.setPrevNode(nodeToRemove.getPrevNode());
        }

        nodeToRemove = null;
    };
}