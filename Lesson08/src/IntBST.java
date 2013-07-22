import java.util.LinkedList;

public class IntBST {
    private IntNode rootNode;

    public void printTree() {
        LinkedList<IntNode> queue = new LinkedList<IntNode>();
        queue.add(rootNode);
        System.out.print("BFS of BST:" );

        while(!queue.isEmpty()) {
            IntNode node = queue.remove();
            System.out.print(node.getValue() + " ");

            if (node.getLeftChild() != null)
                queue.add(node.getLeftChild());
            if (node.getRightChild() != null)
                queue.add(node.getRightChild());
        }
    }

    public void insertValue(int value) {
        if(rootNode == null){
            rootNode = new IntNode(value);

        }
        else {
            IntNode currentNode = rootNode;
            if(!search(value)){
                currentNode = getEndNode(currentNode, value);
                if(currentNode.getValue() < value){
                    currentNode.setRightChild(new IntNode(value));
                }
                else{
                    currentNode.setLeftChild(new IntNode(value));
                }
            }
        }
    }

    public boolean search(int value) {
        IntNode currentNode = rootNode;
        while(currentNode != null){
            if (currentNode.getValue() < value){
                currentNode = currentNode.getRightChild();
            }
            else if (currentNode.getValue() > value){
                currentNode = currentNode.getLeftChild();
            }
            else{
                return true;
            }
        }
        return false;
    }

    public void remove(int value) {
        // TODO: Optional Challenge HW Question for next Monday
        // To remove, first examine the find the node, then:
        // 1) Node N has no children? Just remove N
        // 2) Node N has one child? Just remove N and replace with the child
        // 3) Node N has two children? A little harder. Either take the in-order successor or predecessor R, swap the values of N and R, then delete R

    }

    private IntNode getEndNode(IntNode currentNode, int value){
        if (currentNode.getValue() < value){
            if(currentNode.getRightChild() != null){
                return getEndNode(currentNode.getRightChild(), value);
            }
        }
        else{
            if(currentNode.getLeftChild() != null){
                return getEndNode(currentNode.getLeftChild(), value);
            }
        }
        return currentNode;
    }
}
