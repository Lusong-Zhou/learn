
public class StringTest {

	public static void main(String[] args)
	{
		/*String str=" a b c ";
		System.out.println("*"+str.trim()+"*");
		System.out.println("1+2="+(1+2));
		System.out.println("1+2="+String.valueOf(1+2));
		System.out.println(convert("61010119891216012x"));*/
		
		/*String str="����,123456,4223432,superman@163.com";
		String[] strs=str.split(",");
		//���ݶ��Ž��зָ�õ�һ���ַ�������
		for(int i=0;i<strs.length;i++)
		{
			System.out.println(strs[i]);
		}*/
		
		/*String str="�����Ƽ���ѧ";
		System.out.println(str.contains("����"));*/
		
		String Id="61010119891216012x";
		System.out.println(Id.startsWith("61"));
		System.out.println(Id.substring(0, 2).equals("61"));
		System.out.println(Id.indexOf("61")==0);
	}
	
	public static String convert(String Id)
	{
		String result="���˳���������";
		result=result+Id.substring(6,10)+"��";
		if(Id.charAt(10)=='0')
		{
			result=result+Id.charAt(11)+"��";
		}
		else
		{
			result=result+Id.substring(10,12)+"��";
		}
		if(Id.charAt(12)=='0')
		{
			result=result+Id.charAt(13)+"��";
		}
		else
		{
			result=result+Id.substring(12,14)+"��";
		}
		return result;
	}

}
