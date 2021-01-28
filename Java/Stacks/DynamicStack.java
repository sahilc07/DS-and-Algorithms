public class DynamicStack extends StacksUsingArrays{

    public DynamicStack()throws Exception{
        this(capacity);
    }

    public DynamicStack(int size) throws Exception{
        super(size);
    }

    public void push(int value) throws Exception{
        if(this.data.length == this.size()){
            int arr[] = new int[2*data.length];
            for(int i=0; i<this.size(); i++){
                arr[i] = this.data[i];
            }
            this.data = arr;
        }
        super.push(value);
    }


    public static void main(String[] args) throws Exception{
        DynamicStack ds = new DynamicStack(5);
        for(int i=1; i<=8; i++){
            ds.push(i*10);
            ds.display();
        }
        System.out.println(ds.top());

        while(!ds.isEmpty()){
            ds.pop();
            ds.display();
        }
    }
    
}
