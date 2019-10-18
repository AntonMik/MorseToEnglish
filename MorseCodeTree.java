package MorseCode;

import java.util.ArrayList;

public class MorseCodeTree<T> implements LinkedConverterTreeInterface<String>{

	
	private TreeNode<T> root = new TreeNode();
	private String fetchString = "";
	
	public MorseCodeTree() {
		
		buildTree();
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public TreeNode<String> getRoot() {
		
		return (TreeNode<String>) root;
	}

	@Override
	public void setRoot(TreeNode<String> newNode) {
		root = (TreeNode<T>) newNode;
	}

	public LinkedConverterTreeInterface<String> insert(String code, String letter) {
		addNode((TreeNode<String>) root, code, letter);
		return this;   // THIS if not working
	}

	@Override
	public void addNode(TreeNode<String> root, String code, String letter) {
		
		if (code.length() == 1) {
			if (code.equals(".")) {
				root.left = new TreeNode<String>(letter);
			}
			else
				root.right = new TreeNode<String>(letter);
			
			return;
		}
		
		else {
			
			if (code.charAt(0) == '.')
				addNode((TreeNode<String>) root.left, code.substring(1), letter);
			
			else
				addNode((TreeNode<String>) root.right, code.substring(1), letter);	
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public String fetch(String code) {
		
		return fetchNode((TreeNode<String>) root, code);
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public String fetchNode(TreeNode<String> root, String code) {


		if (code.length() == 1) {
			
			if (code.equals("."))
				fetchString = (String) ((TreeNode<String>) root.left).getData();
			else
				fetchString = (String) ((TreeNode<String>) root.right).getData();
		}
		
		else {
			
			if (code.charAt(0) == ('.')) {
				fetchNode(root.left, code.substring(1));
			}
			else {
				fetchNode(root.right, code.substring(1));
			}
		}
		return fetchString;
	}


	@Override
	public LinkedConverterTreeInterface<String> delete(String data) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public LinkedConverterTreeInterface<String> update() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void buildTree() {
		
		insert(".", "e");
	    insert("-", "t");
		
	    insert("..", "i");
	    insert(".-", "a");
	    insert("-.", "n");
	    insert("--", "m");
		
	    insert("...", "s");
	    insert("..-", "u");
	    insert(".-.", "r");
	    insert(".--", "w");
	    insert("-..", "d");
	    insert("-.-", "k");
	    insert("--.", "g");
	    insert("---", "o");
	    
	    insert("....", "h");
	    insert("...-", "v");
	    insert("..-.", "f");
	    insert(".-..", "l");
	    insert(".--.", "p");
	    insert(".---", "j");
	    insert("-...", "b");
	    insert("-..-", "x");
	    insert("-.-.", "c");
	    insert("-.--", "y");
	    insert("--..", "z");
	    insert("--.-", "q");
	    
	}


	@Override
	public ArrayList<String> toArrayList() {
		
		ArrayList<String> printTree = new ArrayList<String>();
		
		LNRoutputTraversal((TreeNode<String>) root, printTree);
		
		return printTree;
	}


	@SuppressWarnings("unchecked")
	@Override
	public void LNRoutputTraversal(TreeNode<String> root, ArrayList<String> list) {
		
		
		if (root == null)
			return;
		
		LNRoutputTraversal((TreeNode<String>) root.left, list);
		list.add(root.getData());
		LNRoutputTraversal((TreeNode<String>) root.right, list);
		
		
		
	}

	

	
	

	

	
}


















