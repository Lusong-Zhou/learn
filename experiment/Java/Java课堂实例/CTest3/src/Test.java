
public class Test {

	public static void main(String[] args) {
		//Book book1=new Book("Java����","����",56.5f);
		//Book book2=new Book("Java����","����",56.5f);
		//Book book3=book1;
		//System.out.println(book1.equals(book2));
		/*System.out.println(book1);
		System.out.println(book1.toString());
		System.out.println(book2);
		System.out.println(book3);*/
		
		/*JiaoCai jc1=new JiaoCai("Java����","����",56.5f,"java�������");
		JiaoCai jc2=new JiaoCai("Java����","����",56.5f,"java�������");
		//System.out.println(jc1.equals(jc2));
		System.out.println(jc1);*/
		
		Book bk1=new JiaoCai("Java����","����",56.5f,"java�������");
		Book bk2=new JiaoCai("Java����","����",56.5f,"java");
		System.out.println(bk1.equals(bk2));
		System.out.println(bk1.toString());
	}

}
