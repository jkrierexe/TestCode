import static java.lang.System.*;

public class TreeOne{
    public static void main(String[] args){
        Treeable node = new TreeNode("10", new TreeNode("5", null,null), new TreeNode("20", null,null));

        out.println(node.getValue());
        out.println(node.getLeft().getValue());
        out.println(node.getRight().getValue());
    }
}