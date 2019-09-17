//�鼮��
public class Book {
	private String name;//����
	private String authorName;//����
	private float price;//�۸�
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
	
	//��д���������̳���Object���equals����
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
	//��д���������̳���Object���toString����
	public String toString()
	{
		//String str="����:"+name+",����:"+authorName+",�۸�:"+price+"Ԫ";
		String str="����:"+name+",����:"+authorName+",�۸�:"+String.valueOf(price)+"Ԫ";
		return str;
	}
}
