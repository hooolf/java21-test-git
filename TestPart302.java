package com.neuedu.part03;


/**
 * switch �����ж�
 * ���ṹ    switch(���ʽ){���ʽ���ΪԤ��ֵ
 * 					case ֵ: 
 * 						�����;
 * 						[break;]��д�ɲ�д  ������ִ�е���ֹͣ
 * 				    case ֵ: 
 * 						�����;
 * 						[break;]��д�ɲ�д  ������ִ�е���ֹͣ
 *                  case ֵ: 
 * 						�����;
 * 						[break;]��д�ɲ�д  ������ִ�е���ֹͣ
 *                   ...
 *                  default:
 *                      �����; 
 *  				}
 *ע������ : 1.���ʽ��ֵ����Ϊ byte��short��char��int��String
 *        2.case �����ֵ����Ϊ��������ֵ,�Ҳ����ظ�
 *        3.���ܴ���鲿�ֿ���Ϊ����
 *        4.default �൱�� if else �е� else
 *����:���ɱ�������̶�ֵ    �ڶ������ʱǰ�����final
 */
public class TestPart302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i = 2;
		switch(1){
		  case 1:
			  System.out.println(1);
		  case 2:
			  //����2���߼���ͣ����
			  System.out.println(2);
			  break;
		  default:
			  System.out.println("����Ĭ��ֵ");
			  break;
		}
		
		//����̨����һ���ɼ�������óɼ��ĵȼ���90-100 ���ţ�80-89 ����  70-79 ���е�   60-69�Ǽ���  60�����ǲ�����
		//��switchд
		int score = 91;
		switch(score/10){
		  case 10:
		  case 9:
			  System.out.println("��");
			  break;
		  case 8:
			  System.out.println(2);
			  break;
		  case 7:
			  System.out.println(2);
			  break;
		  case 6:
			  System.out.println(2);
			  break;
		  case 5:
		  case 4:
		  case 3:
		  case 2:
		  case 1:
		  case 0:
			  System.out.println("������");
			  break;
		}
		

	}

}
