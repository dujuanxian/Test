/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11-11-30
 * Time: 下午6:35
 * To change this template use File | Settings | File Templates.
 */
public class ClassOne {
    private String name = "Du Juan";
    private int id = 0;

    public void showname(){
        System.out.println(name);
        System.out.println(++id);
    }

    public static void main(String[] args){
        ClassOne c = new ClassOne();
        c.showname();
        System.out.println("Class One");
    }
}
