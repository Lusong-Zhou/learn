//书籍类
public class Book {
	private String name;//书名
	private String authorName;//作者
	private float price;//价格
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public Book(String name,String authorName,float price)
	{
		this.name=name;
		this.authorName=authorName;
		this.price=price;
	}
	
	//重写覆盖隐含继承于Object类的equals方法
	public boolean equals(Book book)
	{
		if((name==book.name)&&(authorName==book.authorName)&&(price==book.price))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//重写覆盖隐含继承于Object类的toString方法
	public String toString()
	{
		//String str="书名:"+name+",作者:"+authorName+",价格:"+price+"元";
		String str="书名:"+name+",作者:"+authorName+",价格:"+String.valueOf(price)+"元";
		return str;
	}
}
