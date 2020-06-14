package homework;

public class Sun extends Star implements Universe{

    @Override
    public void doAnything() {
        System.out.println("太阳吸引着九大行星旋转");
    }

    public void shine(){
        System.out.println("sun:光照8分钟到达地球");
    }
}
