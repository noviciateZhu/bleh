
import java.util.Scanner;

public class DateSearcho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthDay[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int sum = 0;
		int year,month,day;
		
		System.out.println("��������Ҫ��ѯ������:");
		Scanner scanner = new Scanner(System.in);
		
		//��ȡ������
		year = Integer.parseInt(scanner.next());
		month = Integer.parseInt(scanner.next());
		day = Integer.parseInt(scanner.next());
		
		//��ݼ���
		 for (int i = 2012; i < year; i++){//�ж�ÿһ���Ƿ�Ϊ����
		  if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
		   sum += 366;
		  else
		   sum += 365;
		 }
		 
		 //�·ݼ���
		 if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)//���������Ϊ����ʱ���±�Ϊ29��
		   monthDay[1] = 29;
		 
		 for (int j = 0; j < month-1; j++){
		  sum += monthDay[j];//�����·ݵ�����
		 }
		 
		 //��������
		 sum += day;
		 sum -= 22;//��ȥ��ʼ����
		 
		 //���
		 System.out.println(sum % 7);
		 
		 //�ر�scanner
		 scanner.close();

	}

}
