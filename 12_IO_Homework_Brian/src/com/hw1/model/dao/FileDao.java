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

	// � ���Ͽ� � ������ ���� ���� �Է� �޾� ���� ����� �����ϴ� �޼ҵ�
	public void fileSave() {

		StringBuilder sb = new StringBuilder();

		while (true) {
			System.out.print("���Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ� : ");
			String save = sc.nextLine();

			if (save.equals("exit")) {
				break;
			}
			sb.append(save);
//			System.out.println("sb: " + sb);	--> test  
		} // e.while

		System.out.print("�����Ͻðڽ��ϱ�(Y/N): ");
		char yn = sc.next().charAt(0);
		sc.nextLine();

		if (yn == 'y' || yn == 'Y') {
			System.out.print("������ ���ϸ�: ");
			String fileName = sc.nextLine();

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt"));) {

				bw.write(sb.toString());

			} catch (IOException e) {
				e.printStackTrace();
			} // e.try

			System.out.println("�Է¹��� " + fileName + ".txt" + " ���Ͽ� ���������� �����߽��ϴ�.");

		} else {
			System.out.println("�ٽ� �޴��� ���ư��ϴ�.");
//			return;
		}

	}

	// ���ϴ� ������ ���� �Է� �� �ܼ� ȭ�鿡 ����ϴ� �޼ҵ�
	public void fileOpen() {
		System.out.print("���� �� ���ϸ� : ");
		String nameFile = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(nameFile + ".txt"));) {
			
			String value = null;
			while((value = br.readLine())!= null ) {
				System.out.println(value);
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�����ϴ� ������ �����ϴ�.");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// ���� ������ ������� ���� ������ Ǫ���� �����ϴ� �޼ҵ�
	public void fileEdit() {
		System.out.print("���� �� ���ϸ�: ");
		String edit = sc.nextLine();

		StringBuilder sb = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new FileReader(edit + ".txt"));) {
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}

			while (true) {
				System.out.println("���Ͽ� �߰��� ���� �Է��Ͻÿ�: ");
				String addInfo = sc.nextLine();
				
				if (addInfo.equals("exit")) {
					break;
				} else {
					sb.append(addInfo);
				}
		
			}//e.while

			System.out.println("����� ������ �����Ͻðڽ��ϱ�(y/n)? ");
			char yn = sc.next().charAt(0);

			if (yn == 'y' || yn == 'Y') {

				try (BufferedWriter bw = new BufferedWriter(new FileWriter(edit + ".txt", true));) {

					bw.write(sb.toString());
					System.out.println("�Է¹��� ���ϸ�" + edit + ".txt ����Ǿ����ϴ�.");
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
