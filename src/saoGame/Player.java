package saoGame;

public class Player {	//���������
	static String name;//�����
	int hp;//Ѫ��
	int att;//����
	int def;//����
	int exp;//��ǰ����
	int thisExp;//������
	int lv;//�ȼ�
	int money;//��Ǯ
	Player(String name,int lv,int hp,int att,int def,int exp,int thisExp,int money){//��ʼ������
		this.name=name;
		this.lv=lv;
		this.hp=hp;
		this.att=att;
		this.def=def;
		this.exp=exp;
		this.thisExp=thisExp;
		this.money=money;
	}
	
	
	Player(int hp){//����Ѫ��
		this.hp=hp+50;
	}
	
	
	public int attack (int def){	//��ҹ�������
		
		return att-def;
		
	}
	test
	public void show(){			//��ʾ�������
		System.out.println("���ID��"+"��"+name+"��");
		System.out.println("�ȼ���"+lv);
		System.out.println("Ѫ����"+hp);
		System.out.println("������"+att);
		System.out.println("������"+def);
		System.out.println("����ֵ��"+exp+"/"+thisExp);
		System.out.println("��Ǯ��"+money);
		
		
	}
	public void end(){
			System.out.println("--------------------");
			System.out.println("���������END");
			
			
			
		}
		
		
	}
	
			
		

	

	

