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

	// 어떤 파일에 어떤 내용을 저장 할지 입력 받아 파일 출력을 실행하는 메소드
	public void fileSave() {

		StringBuilder sb = new StringBuilder();

		while (true) {
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오 : ");
			String save = sc.nextLine();

			if (save.equals("exit")) {
				break;
			}
			sb.append(save);
//			System.out.println("sb: " + sb);	--> test  
		} // e.while

		System.out.print("저장하시겠습니까(Y/N): ");
		char yn = sc.next().charAt(0);
		sc.nextLine();

		if (yn == 'y' || yn == 'Y') {
			System.out.print("저장할 파일명: ");
			String fileName = sc.nextLine();

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt"));) {

				bw.write(sb.toString());

			} catch (IOException e) {
				e.printStackTrace();
			} // e.try

			System.out.println("입력받은 " + fileName + ".txt" + " 파일에 성공적으로 저장했습니다.");

		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
//			return;
		}

	}

	// 원하는 파일을 파일 입력 후 콘솔 화면에 출력하는 메소드
	public void fileOpen() {
		System.out.print("열기 할 파일명 : ");
		String nameFile = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(nameFile + ".txt"));) {
			
			String value = null;
			while((value = br.readLine())!= null ) {
				System.out.println(value);
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("존재하는 파일이 없습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 기존 파일을 입출력을 통해 내용을 푸가해 주정하는 메소드
	public void fileEdit() {
		System.out.print("수정 할 파일명: ");
		String edit = sc.nextLine();

		StringBuilder sb = new StringBuilder();

		try (BufferedReader br = new BufferedReader(new FileReader(edit + ".txt"));) {
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}

			while (true) {
				System.out.println("파일에 추가할 내용 입력하시요: ");
				String addInfo = sc.nextLine();
				
				if (addInfo.equals("exit")) {
					break;
				} else {
					sb.append(addInfo);
				}
		
			}//e.while

			System.out.println("변경되 내용을 저장하시겠습니까(y/n)? ");
			char yn = sc.next().charAt(0);

			if (yn == 'y' || yn == 'Y') {

				try (BufferedWriter bw = new BufferedWriter(new FileWriter(edit + ".txt", true));) {

					bw.write(sb.toString());
					System.out.println("입력받은 파일명" + edit + ".txt 변경되었습니다.");
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
