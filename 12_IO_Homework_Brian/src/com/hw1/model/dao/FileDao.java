package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	Scanner sc = new Scanner(System.in);

	public FileDao() {
		
	}
	
	//� ���Ͽ� � ������ ���� ���� �Է� �޾� ���� ����� �����ϴ� �޼ҵ�
	public void fileSave() {	
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			System.out.print("���Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�:");
			String insert = sc.nextLine();
			
//			System.out.println(insert);
			
			if(insert.equals("exit")) {
				System.out.println("�����մϴ�."); break; 
			} else {
				sb.append(insert);
			}
		}//e.loop
			
//			System.out.println("sb --> " + sb);  // to check if it is inserted
			
			System.out.println("�����Ͻðڽ��ϱ�(Y/N)? :");
			char yn = sc.next().charAt(0);
			sc.nextLine();
			
			if(yn == 'y' || yn == 'Y') {
				System.out.println("������ ���ϸ� �Է� : ");
				String fileName = sc.nextLine(); // fileName���� �Է°� �ޱ� 
				
				BufferedWriter bw = null;	// close �ϱ� ���� try �ۿ� ���� 
				try{
					FileWriter fw = new FileWriter(fileName + ".txt");
					bw = new BufferedWriter(fw);
					
					
					bw.write(sb.toString());
						
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						bw.close();
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} else if (yn == 'n'|| yn == 'N'){
				return;
			}//e.if
			
		
	}
	
	//���ϴ� ������ ���� �Է� �� �ܼ� ȭ�鿡 ����ϴ� �޼ҵ�
	public void fileOpen() {
		System.out.print("����� ���ϸ�: ");
		String output = sc.nextLine(); 
		
		//������Ʈ��
		//������Ʈ��
		BufferedReader br = null;
		try{
			FileReader fr = new FileReader(output + ".txt");
			br = new BufferedReader(fr); 
			
			/*
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			*/
			System.out.println(br.readLine());
			
			
		}catch(FileNotFoundException e ) {
			System.out.println("�����ϴ� ������ �����ϴ�.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	//���� ������ ������� ���� ������ Ǫ���� �����ϴ� �޼ҵ�
	public void fileEdit() {
		System.out.print("������ ���� ��: ");
		String update = sc.nextLine();
		
		BufferedReader br = null;
		try {
			
			FileReader fr = new FileReader(update + ".txt"); // �ҷ����� 
			br = new BufferedReader(fr);
			
			StringBuilder sb = new StringBuilder(); 
			
			while(true) {
			System.out.println("���Ͽ� �߰��� ������ �Է��Ͻÿ� : ");
			String updateInfo = sc.nextLine();
			if(updateInfo.equals("exit")) {
				break;
			} else {
				sb.append(updateInfo);
				
			}
			} //e.while
			
			System.out.println("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�(y/n) : ");
			char yn = sc.next().charAt(0);
			
			if(yn == 'y' || yn == 'Y') {
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(update+".txt"));){
					bw.write(sb.toString());
					System.out.println(update+".txt" + "������ ������ ����Ǿ����ϴ�.");
				}catch(IOException e) {
					e.printStackTrace();
				}
				
			} else if(yn == 'n' || yn == 'N') {
				return;
				
			}

		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}	finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
