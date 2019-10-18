package MorseCode;

public class TreeNode<T> {

	protected TreeNode<T> left;
	protected TreeNode<T> right;
	protected T data;

	
	TreeNode(T dataNode) {
		this.left = null;
		this.right = null;
		this.data = dataNode;
	}
	
	TreeNode(TreeNode<T> node) {
		new TreeNode<T>(node);
	}
	
	public TreeNode() {
		this.left = null;
		this.right = null;
		this.data = (T) "";
	}

	public T getData() {
		return data;
	}
	
}
