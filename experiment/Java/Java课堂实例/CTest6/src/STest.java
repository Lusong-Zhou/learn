
public class STest {

	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		//System.out.println(dao.findStuByPara("001", 1));
		//System.out.println(dao.findStuByPara("����", 2));
		//System.out.println(dao.addStudent("006,��һ,��"));
		//String[] strs={"001,����,��","007,����,Ů","008,�ŷ�,��"};
		//System.out.println("�ɹ������"+dao.addStudents(strs)+"��ѧ����¼");
		//System.out.println(dao.deleteStudent("008"));
		//String[] nums={"002","001","004"};
		//System.out.println("�ɹ�ɾ����"+dao.deleteStudents(nums)+"��ѧ����¼");
		dao.updateStudent("003,����,Ů");
	}

}
