/**
 * Created with IntelliJ IDEA.
 * User: dustin
 * Date: 7/15/13
 * Time: 7:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntListNode {
    int value;
    IntListNode nextNode = null;
    IntListNode prevNode = null;

    public IntListNode(int valueToSetTo){
        value = valueToSetTo;
    }

    IntListNode getNextNode(){
        return nextNode;
    }
    IntListNode setNextNode(IntListNode nextNodeToSetTo){
        nextNode = nextNodeToSetTo;
        return nextNode;
    }
    IntListNode getPrevNode(){
        return prevNode;
    }
    IntListNode setPrevNode(IntListNode prevNodeToSetTo){
        prevNode = prevNodeToSetTo;
        return prevNode;
    }
}
