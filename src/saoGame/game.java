package saoGame;

import java.util.Random;
import java.util.Scanner;

public class game {
java.util.Random rando=new java.util.Random();

	
	
	public static void main (String[] args){
		int fb;
		int cz=0;
		wupin hongpin=new wupin("����HPҩ��",20,0);
		wupin hongpin1=new wupin("�м�HPҩ��",100,0);
		wupin hongpin2=new wupin("�߼�HPҩ��",500,0);
		wupin hongpin3=new wupin("����HPҩ��",1000,0);
		chailiao v=new  chailiao("ʷ��ķ�ľ���",0);
		 chailiao qw=new chailiao("ʷ��ķ������",0);
		 chailiao dj=new chailiao("��������֮��",0);
		 chailiao dx=new chailiao("��������֮��",0);
		 chailiao xbs=new chailiao("Ѫ��ʯ",0);
		 chailiao xmn=new chailiao("Ѫ���",0);
		 chailiao bqsp=new chailiao("������Ƭ",0);
		 chailiao sbzh=new chailiao("���֮��",0);
		 
		 
		System.out.println("���������������");
		Scanner input=new Scanner(System.in);
		String z = input.nextLine();
		int hp=new Random().nextInt(20)+1;
		int att=new Random().nextInt(20)+1;
		int def=new Random().nextInt(10)+1;
		Player p=new Player(z,1,50+hp,att,def,0,100,0);
		if(Player.name!=null){
		
		 p.show();
		
		System.out.println("��ȷ�����������ԣ�");
	
			System.out.println("-------------------");
			System.out.println("����Ҫ��ʲô�أ�");
			System.out.println("1.�鿴����");
			System.out.println("2.̽����ͼ");
			System.out.println("3.����ǿ��");
			System.out.println("4.��ҳ齱");
			System.out.println("5.���϶һ�");
			System.out.println("6.������ѯ");
			System.out.println("7.������");

		for(int i=1;i>0;i++){//������Ϸ
			Scanner scanner=new Scanner(System.in);
			int xz= scanner.nextInt();//ѡ��
			
			switch(xz){
			case 1:p.show(); 
			System.out.println("-------------------");
			System.out.println("����Ҫ��ʲô�أ�");
			System.out.println("1.�鿴����");
			System.out.println("2.̽����ͼ");
			System.out.println("3.����ǿ��");
			System.out.println("4.��ҳ齱");
			System.out.println("5.���϶һ�");
			System.out.println("6.������ѯ");
			System.out.println("7.������");
			break;
			case 2:				
			System.out.println("����������ѡ�񸱱�!");
			System.out.println("1.�İ�����(1-5)");
			System.out.println("2.���ع���(5-10)");
			System.out.println("3.Ѫ�ȳǱ�(10-15)");
			System.out.println("4.������(15-20)");
			Scanner xz2=new Scanner(System.in);
			int fbxz = xz2.nextInt();
			if(fbxz==1){//////////////////////////////////////��һ�أ�
				fb=1;
				int wjxl=p.hp;
				
				System.out.println("�İ���С��ͨ�����ֵ��!~");
				//���븱��1
				System.out.println("����������ȥ���𽥵Ľ������");
				int guanka=new Random().nextInt(10)+1;
				for(int g=0;g!=guanka;g++){

					
					System.out.println("����ǰ�ߣ�ͻȻһֻʷ��ķ��ס�����ȥ·��");
					System.out.println("ʷ��ķ:ž��ž��~");
					System.out.println("��"+(g+1)+"��"+",��"+guanka+"��");
					monster y= new monster("ʷ��ķ",1,20,10,5);
					int gwxl=y.hp;
					y.show();
					if(wjxl<=0){
						p.end();
						break;
					}
					System.out.println("1.����	2.����	3.��Ѫ");
					Scanner scn=new Scanner(System.in);
					int a=scn.nextInt();
					if(a==1){
						cz=1;
						System.out.println("��ѡ���˹�����");
						while(wjxl>0&&gwxl>0){
							int wjsh=0;
							int gwsh=0;

							if(p.attack(y.def)<0){
								wjsh=0;
								gwxl=gwxl-wjsh;
								System.out.println("��̧����ȭͷ�ݺݵ�����"+y.name+"���������"+wjsh+"���˺�");
							}else{
								wjsh=gwxl-p.attack(y.def);
								gwxl=gwxl-p.attack(y.def);
								System.out.println("��̧����ȭͷ�ݺݵ�����"+y.name+"���������"+p.attack(y.def)+"���˺�");
							}
							if(y.attack(p.def)<0){
								gwsh=0;
								wjxl=wjxl-gwsh;
								System.out.println("��"+y.name+"��ʹ��ճ�򹥻������������"+gwsh+"���˺�");
							}else{
								gwsh=y.attack(p.def);
								wjxl=wjxl-y.attack(p.def);
								System.out.println("��"+y.name+"��ʹ��ճ�򹥻������������"+y.attack(p.def)+"���˺�");
							}

							
							if(wjxl>=p.hp){
								wjxl=p.hp;
								System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
							}else{
								if(wjxl<0){
									wjxl=0;
									System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
								}else{
									wjxl=wjxl-gwsh;
									System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
								}

							}
							if(gwsh>=y.hp){
								gwxl=y.hp;
								System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
							}else{
								if(gwxl<0){
									gwxl=0;
								System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
								}else{
									gwxl=gwxl-wjsh;
									System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
								}
								}
							}

								

							if(wjxl<=0){
								p.end();
								break;
							
							}
							if(gwxl<=0){
								System.out.println("ս��ʤ��:��ϲ��ɱ��ʷ��ķ!");
								p.exp=p.exp+ y.jjy(y.lv*2);
								System.out.println("��þ���:"+y.jjy(y.lv*2));
								
								p.money=p.money+ y.jjq(y.lv*5);
								System.out.println("��ý��:"+ y.jjq(y.lv*5));
								if(y.jwp(true)){


									hongpin.shuliang=hongpin.shuliang+1;
									System.out.println("�����Ʒ:����HPҩ��*1");	
									System.out.println("----------------");	

									
								
								if(p.exp>=p.thisExp){
									p.lv=p.lv+1;
									p.hp=p.hp+20;
									p.att=p.att+10;
									p.def=p.def+10;
									p.exp=p.exp-p.thisExp;
									p.thisExp=p.thisExp+p.lv*5;
									System.out.println("-------------------");	
									System.out.println("��ϲ����,����������ԣ�");		
									System.out.println("Ѫ��*20");	
									System.out.println("����*10");	
									System.out.println("����*10");	
									System.out.println("-------------------");		
									}
								}else{
									int sl=new Random().nextInt(2)+1;

									v.shuliang=v.shuliang+sl;
									System.out.println("�����Ʒ:ʷ��ķ�ľ���*"+sl);	
									System.out.println("----------------");	
								}

										}
								


							}else{
								if(a==2){
									System.out.println("���ܳɹ���");
									cz=2;
									break;
								}else{
									if(a==3){
										cz=3;
										if(hongpin.shuliang>0){
											System.out.println("ʹ�ó���HPҩ���ɹ���Ѫ��+20");
											if(wjxl>p.hp){
												wjxl=p.hp;
											}
											wjxl=wjxl+hongpin.hp;
											
											hongpin.shuliang=hongpin.shuliang-1;
											g--;
											System.out.println(i);
										}else{
											System.out.println("û��ҩˮ�ˣ�");
											System.out.println("�Զ��˳�������");
											break;
										}
										
									}
						
						
						
					}


						
						
					}
								
									
								}
				if(wjxl>0){
					if(cz==2){
						break;
						
					}else{
						if(cz==3){
							break;
						}
					}
					
					 System.out.println("��ϲͨ�أ�");

								int sjs=new Random().nextInt(5)+1;
								if(sjs==1){
									qw.shuliang=qw.shuliang+1;
									System.out.println("�����Ʒ:ʷ��ķ������*1");	
									System.out.println("----------------");	
								}else{
									System.out.println("����ͨ�أ���ʲô��û�õ���");	
								}

		
							
							}
						
				

				break;
			}else{

				if(fbxz==2&&p.lv>=5){/////////////////////////�ڶ���
					fb=2;
					int wjxl=p.hp;
					
					System.out.println("��������һ�����ʯм�����˵��棡");
					//���븱��1
					System.out.println("���򹬵�������ȥ���Ѿ��޷���ͷ����");
					int guanka=new Random().nextInt(10)+1;
					for(int g=0;g!=guanka;g++){

						
						System.out.println("��"+(g+1)+"��"+",��"+guanka+"��");
						
						monster y= new monster("��������",5,100,50,35);
						System.out.println("��������:�޴��ķ��ˣ���");
						System.out.println("����ǰ�ߣ�ͻȻһֻ��"+y.name+"����ס�����ȥ·��");

						int gwxl=y.hp;
						y.show();
						if(wjxl<=0){
							p.end();
							break;
						}
						System.out.println("1.����	2.����	3.��Ѫ");
						Scanner scn=new Scanner(System.in);
						int a=scn.nextInt();
						if(a==1){
							cz=1;
							System.out.println("��ѡ���˹�����");
							while(wjxl>0&&gwxl>0){
								
								int wjsh=0;
								int gwsh=0;
								if(p.attack(y.def)<0){
									wjsh=0;
									gwxl=gwxl-wjsh;
									System.out.println("��̧����ȭͷ�ݺݵ�����"+y.name+"���������"+wjsh+"���˺�");
								}else{
									wjsh=gwxl-p.attack(y.def);
									gwxl=gwxl-p.attack(y.def);
									System.out.println("��̧����ȭͷ�ݺݵ�����"+y.name+"���������"+p.attack(y.def)+"���˺�");
								}
								if(y.attack(p.def)<0){
									gwsh=0;
									wjxl=wjxl-gwsh;
									System.out.println("��"+y.name+"��ʹ��������ײ�����������"+gwsh+"���˺�");
								}else{
									gwsh=y.attack(p.def);
									wjxl=wjxl-y.attack(p.def);
									System.out.println("��"+y.name+"��ʹ��������ײ�����������"+y.attack(p.def)+"���˺�");
								}

								
								if(wjxl>=p.hp){
									wjxl=p.hp;
									System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
								}else{
									if(wjxl<0){
										wjxl=0;
										System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
									}else{
										wjxl=wjxl-gwsh;
										System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
									}

								}
								if(gwsh>=y.hp){
									gwxl=y.hp;
									System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
								}else{
									if(gwxl<0){
										gwxl=0;
									System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
									}else{
										gwxl=gwxl-wjsh;
										System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
									}
									}
									

								if(wjxl<=0){
									p.end();
									break;
								
								}
								if(gwxl<=0){
									System.out.println("ս��ʤ��:��ϲ��ɱ����"+y.name+"��");
									p.exp=p.exp+ y.jjy(y.lv*2);
									System.out.println("��þ���:"+y.jjy(y.lv*2));
									
									p.money=p.money+ y.jjq(y.lv*5);
									System.out.println("��ý��:"+ y.jjq(y.lv*5));
									if(y.jwp(true)){


										hongpin1.shuliang=hongpin1.shuliang+1;
										System.out.println("�����Ʒ:�м�HPҩ��*1");	
										System.out.println("----------------");	

										
									
									if(p.exp>=p.thisExp){
										p.lv=p.lv+1;
										p.hp=p.hp+20;
										p.att=p.att+10;
										p.def=p.def+10;
										p.exp=p.exp-p.thisExp;
										p.thisExp=p.thisExp+p.lv*5;
										System.out.println("-------------------");	
										System.out.println("��ϲ����,����������ԣ�");		
										System.out.println("Ѫ��*20");	
										System.out.println("����*10");	
										System.out.println("����*10");	
										System.out.println("-------------------");		
										}
									}else{
										int sl=new Random().nextInt(2)+1;

										dj.shuliang=dj.shuliang+sl;
										System.out.println("�����Ʒ:"+dj.name+"*"+sl);	
										System.out.println("----------------");	
									}

											}
									}


								}else{
									if(a==2){
										System.out.println("���ܳɹ���");
										cz=2;
										break;
									}else{
										if(a==3){
											cz=3;
											if(hongpin1.shuliang>0){
												System.out.println("ʹ��"+hongpin1.name+"�ɹ���Ѫ��+"+hongpin1.hp);
												if(wjxl>p.hp){
													wjxl=p.hp;
												}
												wjxl=wjxl+hongpin1.hp;
												
												hongpin1.shuliang=hongpin1.shuliang-1;
												g--;
											}else{
												System.out.println("û��ҩˮ�ˣ�");
												System.out.println("�Զ��˳�������");
												break;
											}
											
										}
							
							
							
						}


							
							
						}
									
										
									}
					if(wjxl>0){
						if(cz==2){
							break;
							
						}else{
							if(cz==3){
								break;
							}
						}
						
						 System.out.println("��ϲͨ�أ�");

									int sjs=new Random().nextInt(5)+1;
									if(sjs==1){
										dx.shuliang=dx.shuliang+1;
										System.out.println("�����Ʒ:"+dx.name);	
										System.out.println("----------------");	
									}else{
										System.out.println("����ͨ�أ���ʲô��û�õ���");	
									}

			
								
								}
							
					

					break;

				}else{
					System.out.println("�ȼ����㣬�޷������ͼ��������ѡ��");
					if(fbxz==3&&p.lv>=10){
						//���븱��3
						fb=3;
						int wjxl=p.hp;
						
						System.out.println("��������һ���Ǳ���Ѫ�������˽�������");
						//���븱��1
						System.out.println("����Ǳ�����ȥ����Ȼ�����ű�ͻȻ���ϣ���");
						int guanka=new Random().nextInt(10)+1;
						for(int g=0;g!=guanka;g++){

							
							System.out.println("��"+(g+1)+"��"+",��"+guanka+"��");
							
							monster y= new monster("Ѫɫ��ʦ",10,500,100,60);
							System.out.println("Ѫɫ��ʦ:����һ���˴�������������");
							System.out.println("����ǰ�ߣ�ͻȻһֻ��"+y.name+"����ס�����ȥ·��");

							int gwxl=y.hp;
							y.show();
							if(wjxl<=0){
								p.end();
								break;
							}
							System.out.println("1.����	2.����	3.��Ѫ");
							Scanner scn=new Scanner(System.in);
							int a=scn.nextInt();
							if(a==1){
								cz=1;
								System.out.println("��ѡ���˹�����");
								while(wjxl>0&&gwxl>0){
									
									int wjsh=0;
									int gwsh=0;
									if(p.attack(y.def)<0){
										wjsh=0;
										gwxl=gwxl-wjsh;
										System.out.println("��̧����ȭͷ�ݺݵ�����"+y.name+"���������"+wjsh+"���˺�");
									}else{
										wjsh=gwxl-p.attack(y.def);
										gwxl=gwxl-p.attack(y.def);
										System.out.println("��̧����ȭͷ�ݺݵ�����"+y.name+"���������"+p.attack(y.def)+"���˺�");
									}
									if(y.attack(p.def)<0){
										gwsh=0;
										wjxl=wjxl-gwsh;
										System.out.println("��"+y.name+"��ʹ��Ѫ֮���룬���������"+gwsh+"���˺�");
									}else{
										gwsh=y.attack(p.def);
										wjxl=wjxl-y.attack(p.def);
										System.out.println("��"+y.name+"��ʹ��Ѫ֮���룬���������"+y.attack(p.def)+"���˺�");
									}

									
									if(wjxl>=p.hp){
										wjxl=p.hp;
										System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
									}else{
										if(wjxl<0){
											wjxl=0;
											System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
										}else{
											wjxl=wjxl-gwsh;
											System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
										}

									}
									if(gwsh>=y.hp){
										gwxl=y.hp;
										System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
									}else{
										if(gwxl<0){
											gwxl=0;
										System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
										}else{
											gwxl=gwxl-wjsh;
											System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
										}
										}
										

									if(wjxl<=0){
										p.end();
										break;
									
									}
									if(gwxl<=0){
										System.out.println("ս��ʤ��:��ϲ��ɱ����"+y.name+"��");
										p.exp=p.exp+ y.jjy(y.lv*2);
										System.out.println("��þ���:"+y.jjy(y.lv*2));
										
										p.money=p.money+ y.jjq(y.lv*5);
										System.out.println("��ý��:"+ y.jjq(y.lv*5));
										if(y.jwp(true)){


											hongpin2.shuliang=hongpin2.shuliang+1;
											System.out.println("�����Ʒ:�߼�HPҩ��*1");	
											System.out.println("----------------");	

											
										
										if(p.exp>=p.thisExp){
											p.lv=p.lv+1;
											p.hp=p.hp+20;
											p.att=p.att+10;
											p.def=p.def+10;
											p.exp=p.exp-p.thisExp;
											p.thisExp=p.thisExp+p.lv*5;
											System.out.println("-------------------");	
											System.out.println("��ϲ����,����������ԣ�");		
											System.out.println("Ѫ��*20");	
											System.out.println("����*10");	
											System.out.println("����*10");	
											System.out.println("-------------------");		
											}
										}else{
											int sl=new Random().nextInt(2)+1;

											xbs.shuliang=xbs.shuliang+sl;
											System.out.println("�����Ʒ:"+xbs.name+"*"+sl);	
											System.out.println("----------------");	
										}

												}
										}


									}else{
										if(a==2){
											System.out.println("���ܳɹ���");
											cz=2;
											break;
										}else{
											if(a==3){
												cz=3;
												if(hongpin2.shuliang>0){
													System.out.println("ʹ��"+hongpin2.name+"�ɹ���Ѫ��+"+hongpin1.hp);
													if(wjxl>p.hp){
														wjxl=p.hp;
													}
													wjxl=wjxl+hongpin2.hp;
													
													hongpin2.shuliang=hongpin2.shuliang-1;
													g--;
												}else{
													System.out.println("û��ҩˮ�ˣ�");
													System.out.println("�Զ��˳�������");
													break;
												}
												
											}
								
								
								
							}


								
								
							}
										
											
										}
						if(wjxl>0){
							if(cz==2){
								break;
								
							}else{
								if(cz==3){
									break;
								}
							}
							
							 System.out.println("��ϲͨ�أ�");

										int sjs=new Random().nextInt(5)+1;
										if(sjs==1){
											xmn.shuliang=xmn.shuliang+1;
											System.out.println("�����Ʒ:"+xmn.name);	
											System.out.println("----------------");	
										}else{
											System.out.println("����ͨ�أ���ʲô��û�õ���");	
										}

				
									
									}
								
						

						break;
					}else{
						System.out.println("�ȼ����㣬�޷������ͼ��������ѡ��");
						if(fbxz==4&&p.lv>=15){
							fb=4;
							//���븱��4
							System.out.println("�������������ڣ����������ƺ��ܾ�����ĳ���");
							int wjxl=p.hp;
							//���븱��1
							int guanka=new Random().nextInt(10)+1;
							for(int g=0;g!=guanka;g++){

								
								System.out.println("��"+(g+1)+"��"+",��"+guanka+"��");
								
								monster y= new monster("�������",15,1500,500,300);
								System.out.println("�������:���𣡣���");
								System.out.println("����ǰ�ߣ�ͻȻһֻ��"+y.name+"����ס�����ȥ·��");

								int gwxl=y.hp;
								y.show();
								if(wjxl<=0){
									p.end();
									break;
								}
								System.out.println("1.����	2.����	3.��Ѫ");
								Scanner scn=new Scanner(System.in);
								int a=scn.nextInt();
								if(a==1){
									cz=1;
									System.out.println("��ѡ���˹�����");
									while(wjxl>0&&gwxl>0){
										
										int wjsh=0;
										int gwsh=0;
										if(p.attack(y.def)<0){
											wjsh=0;
											gwxl=gwxl-wjsh;
											System.out.println("��̧����ȭͷ�ݺݵ�����"+y.name+"���������"+wjsh+"���˺�");
										}else{
											wjsh=gwxl-p.attack(y.def);
											gwxl=gwxl-p.attack(y.def);
											System.out.println("��̧����ȭͷ�ݺݵ�����"+y.name+"���������"+p.attack(y.def)+"���˺�");
										}
										if(y.attack(p.def)<0){
											gwsh=0;
											wjxl=wjxl-gwsh;
											System.out.println("��"+y.name+"��ʹ�óͽ�֮�⣬���������"+gwsh+"���˺�");
										}else{
											gwsh=y.attack(p.def);
											wjxl=wjxl-y.attack(p.def);
											System.out.println("��"+y.name+"��ʹ�óͽ�֮�⣬���������"+y.attack(p.def)+"���˺�");
										}

										
										if(wjxl>=p.hp){
											wjxl=p.hp;
											System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
										}else{
											if(wjxl<0){
												wjxl=0;
												System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
											}else{
												wjxl=wjxl-gwsh;
												System.out.println(p.name+"��Ѫ��:"+wjxl+"/"+p.hp);
											}

										}
										if(gwsh>=y.hp){
											gwxl=y.hp;
											System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
										}else{
											if(gwxl<0){
												gwxl=0;
											System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
											}else{
												gwxl=gwxl-wjsh;
												System.out.println(y.name+"��Ѫ��:"+gwxl+"/"+y.hp);
											}
											}
											

										if(wjxl<=0){
											p.end();
											break;
										
										}
										if(gwxl<=0){
											System.out.println("ս��ʤ��:��ϲ��ɱ����"+y.name+"��");
											p.exp=p.exp+ y.jjy(y.lv*2);
											System.out.println("��þ���:"+y.jjy(y.lv*2));
											
											p.money=p.money+ y.jjq(y.lv*5);
											System.out.println("��ý��:"+ y.jjq(y.lv*5));
											if(y.jwp(true)){


												hongpin3.shuliang=hongpin3.shuliang+1;
												System.out.println("�����Ʒ:����HPҩ��*1");	
												System.out.println("----------------");	

												
											
											if(p.exp>=p.thisExp){
												p.lv=p.lv+1;
												p.hp=p.hp+20;
												p.att=p.att+10;
												p.def=p.def+10;
												p.exp=p.exp-p.thisExp;
												p.thisExp=p.thisExp+p.lv*5;
												System.out.println("-------------------");	
												System.out.println("��ϲ����,����������ԣ�");		
												System.out.println("Ѫ��*20");	
												System.out.println("����*10");	
												System.out.println("����*10");	
												System.out.println("-------------------");		
												}
											}else{
												int sl=new Random().nextInt(2)+1;

												bqsp.shuliang=bqsp.shuliang+sl;
												System.out.println("�����Ʒ:"+bqsp.name+"*"+sl);	
												System.out.println("----------------");	
											}

													}
											}


										}else{
											if(a==2){
												System.out.println("���ܳɹ���");
												cz=2;
												break;
											}else{
												if(a==3){
													cz=3;
													if(hongpin3.shuliang>0){
														System.out.println("ʹ��"+hongpin3.name+"�ɹ���Ѫ��+"+hongpin3.hp);
														if(wjxl>p.hp){
															wjxl=p.hp;
														}
														wjxl=wjxl+hongpin3.hp;
														
														hongpin3.shuliang=hongpin3.shuliang-1;
														g--;
													}else{
														System.out.println("û��ҩˮ�ˣ�");
														System.out.println("�Զ����븱����");
														break;
													}
													
												}
									
									
									
								}

									
									
								}
											
												
											}
							if(wjxl>0){
								if(cz==2){
									break;
									
								}else{
									if(cz==3){
										break;
									}
								}
								
								 System.out.println("��ϲͨ�أ�");

											int sjs=new Random().nextInt(5)+1;
											if(sjs==1){
												sbzh.shuliang=sbzh.shuliang+1;
												System.out.println("�����Ʒ:"+sbzh.name);	
												System.out.println("----------------");	
											}else{
												System.out.println("����ͨ�أ���ʲô��û�õ���");	
											}

					
										
										}
									
							

							break;

						}else{
							System.out.println("������󣬻�ȼ����㣡������1-4��");
							break;
							
							
						}
						
					}
					
					
				}
				
			}
			
			
			
			default:System.out.println("-------------------");
			
			break;
			
			
					
			case 3:		
				System.out.println("1.100��Ҷһ�10������");
				System.out.println("2.100��Ҷһ�10������");
				System.out.println("3.100��Ҷһ�50���飡");
				Scanner qh=new Scanner(System.in);
				int qh1=qh.nextInt();
				if(qh1==1){
					if(p.money>=100){
						p.money=p.money-100;
						p.att=p.att+10;
						System.out.println("����10��");
					}else{
					System.out.println("�ܱ�Ǹ����Ҳ���!");
					}
				}else{
					if(qh1==2){
						if(p.money>=100){
							p.money=p.money-100;
							p.def=p.def+10;
							System.out.println("����ֵ����10��");
						}else{
						System.out.println("�ܱ�Ǹ����Ҳ���!");
						}
					}else{
						if(qh1==3){
							if(p.money>=100){
								p.money=p.money-100;
								p.exp=p.exp+50;
								System.out.println("����ֵ����50��");
								if(p.exp>=p.thisExp){
									p.lv=p.lv+1;
									p.hp=p.hp+20;
									p.att=p.att+10;
									p.def=p.def+10;
									p.exp=p.exp-p.thisExp;
									p.thisExp=p.thisExp+p.lv*5;
									System.out.println("-------------------");	
									System.out.println("��ϲ����,����������ԣ�");		
									System.out.println("Ѫ��*20");	
									System.out.println("����*10");	
									System.out.println("����*10");	
									System.out.println("-------------------");		
									
								}
								
							}else{
								System.out.println("�ܱ�Ǹ����Ҳ���!");
							}
						}else{
							System.out.println("������1-3");
							break;
						}
						
					}
				}
		
				
				break;
				
			case 4:	
				if(p.money>200){
					p.money=p.money-200;
					int jieguo=new Random().nextInt(6)+1;
					switch(jieguo){
					case 1: 
						int exp=new Random().nextInt(200)+1;
						p.exp=p.exp+100+exp;
						System.out.println("��ϲ�����"+exp+"����ֵ");
						if(p.exp>=p.thisExp){
							p.lv=p.lv+1;
							p.hp=p.hp+20;
							p.att=p.att+10;
							p.def=p.def+10;
							p.exp=p.exp-p.thisExp;
							p.thisExp=p.thisExp+p.lv*5;
							System.out.println("-------------------");	
							System.out.println("��ϲ����,����������ԣ�");		
							System.out.println("Ѫ��*20");	
							System.out.println("����*10");	
							System.out.println("����*10");	
							System.out.println("-------------------");		
							}
						break;
					case 2:
						int money=new Random().nextInt(300)+1;
						p.money=p.money+money;
						System.out.println("��ϲ�����"+money+"���");
						break;
					case 3:
						int gg=new Random().nextInt(20)+1;
						dx.shuliang=dx.shuliang+gg;
						System.out.println("��ϲ�����"+gg+"��"+dx.name);
						break;
					}
					if(jieguo>3){
					System.out.println("�ٽ������������³��ԣ�");
					}
					
					
				}else{
					System.out.println("��Ҳ���200���޷��齱��");
				}
				
				
				
				
				break;
				
			case 5:		
				
				
				
				
				
				break;
			case 6:

				if(hongpin.shuliang!=0){
					System.out.println(hongpin.name+"����Ϊ"+hongpin.shuliang+"��");
				}
				if(hongpin1.shuliang!=0){
					System.out.println(hongpin1.name+"����Ϊ"+hongpin1.shuliang+"��");
				}
				if(hongpin2.shuliang!=0){
					System.out.println(hongpin2.name+"����Ϊ"+hongpin2.shuliang+"��");
				}
				if(hongpin3.shuliang!=0){
					System.out.println(hongpin3.name+"����Ϊ"+hongpin3.shuliang+"��");
				}
				if(v.shuliang!=0){
					System.out.println(v.name+"����Ϊ"+v.shuliang+"��");
				}
				if(qw.shuliang!=0){
					System.out.println(qw.name+"����Ϊ"+qw.shuliang+"��");
				}
				if(dj.shuliang!=0){
					System.out.println(dj.name+"����Ϊ"+dj.shuliang+"��");
				}
				if(dx.shuliang!=0){
					System.out.println(dx.name+"����Ϊ"+dx.shuliang+"��");
				}
				if(xbs.shuliang!=0){
					System.out.println(xbs.name+"����Ϊ"+xbs.shuliang+"��");
				}
				if(xmn.shuliang!=0){
					System.out.println(xmn.name+"����Ϊ"+xmn.shuliang+"��");
				}
				if(bqsp.shuliang!=0){
					System.out.println(bqsp.name+"����Ϊ"+bqsp.shuliang+"��");
				}
				if(sbzh.shuliang!=0){
					System.out.println(sbzh.name+"����Ϊ"+sbzh.shuliang+"��");
				}
					System.out.println("��Ǯ��"+p.money);

				
				
				break;
			
			case 7:	p.lv=99;p.att=99999;p.def=99999;p.money=9999999;p.hp=99999;
			int exp=0;
			for(i=0;i<=99;i++){
				exp=exp+i*5;
			}
			
			p.thisExp=exp+100;
			System.out.println("LV:99");
			System.out.println("������:99999");				
			System.out.println("������:99999");
			System.out.println("������:99999");
			System.out.println("��Ǯ:9999999");
			break;
				
			}
				

			
				}
				
		
			
				
			
			
			}
				
				
			}
			
		
		}
			
		

			
		
		
		
			

	
	

