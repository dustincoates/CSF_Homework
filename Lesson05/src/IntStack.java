public class IntStack extends IntLinkedList {
    int size = 0;
    public void pop(){
        if(size == 0){
            System.out.println("Cannot pop from empty stack");
        }
        else {
            IntListNode toBeLastNode = lastNode.getPrevNode();
            toBeLastNode.setNextNode(null);
            System.out.println("Popping off: ");
            System.out.println(lastNode.value);
            lastNode = toBeLastNode;
            size--;
            System.out.println("New size: ");
            System.out.println(size);
        }
    }

    public void push(int value){
        IntListNode newNode = new IntListNode(value);
        if(lastNode == null){
            lastNode = newNode;
        }
        else{
            lastNode.setNextNode(newNode);
            newNode.setPrevNode(lastNode);
            lastNode = newNode;
        }
        size++;
    }

    public int getSize(){
        return size;
    }
}
