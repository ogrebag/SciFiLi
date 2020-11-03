class BTNode{
    private int data;
    private BTNode left;
    private BTNode right;

    public BTNode(int element){
        data = element;
        left = null;
        right = null;
    }

    public void setRightChild(BTNode n)
    {
        right = n;
    }

    public void setLeftChild(BTNode n){
        left = n;
    }

    public BTNode getRightChild(){
        return right;
    }

    public BTNode getLeftChild(){
        return left;
    }

    public int getData(){
        return data;
    }

    public void setData(int x){
        data = x;
    }
}