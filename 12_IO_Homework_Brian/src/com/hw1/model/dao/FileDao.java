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
	
	//어떤 파일에 어떤 내용을 저장 할지 입력 받아 파일 출력을 실행하는 메소드
	public void fileSave() {	
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오:");
			String insert = sc.nextLine();
			
//			System.out.println(insert);
			
			if(insert.equals("exit")) {
				System.out.println("종료합니다."); break; 
			} else {
				sb.append(insert);
			}
		}//e.loop
			
//			System.out.println("sb --> " + sb);  // to check if it is inserted
			
			System.out.println("저장하시겠습니까(Y/N)? :");
			char yn = sc.next().charAt(0);
			sc.nextLine();
			
			if(yn == 'y' || yn == 'Y') {
				System.out.println("저장할 파일명 입력 : ");
				String fileName = sc.nextLine(); // fileName으로 입력값 받기 
				
				BufferedWriter bw = null;	// close 하기 위에 try 밖에 생성 
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
	
	//원하는 파일을 파일 입력 후 콘솔 화면에 출력하는 메소드
	public void fileOpen() {
		System.out.print("출력할 파일명: ");
		String output = sc.nextLine(); 
		
		//기존스트림
		//보조스트림
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
			System.out.println("존재하는 파일이 없습니다.");
			
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
	
	//기존 파일을 입출력을 통해 내용을 푸가해 주정하는 메소드
	public void fileEdit() {
		System.out.print("수정할 파일 명: ");
		String update = sc.nextLine();
		
		BufferedReader br = null;
		try {
			
			FileReader fr = new FileReader(update + ".txt"); // 불러오기 
			br = new BufferedReader(fr);
			
			StringBuilder sb = new StringBuilder(); 
			
			while(true) {
			System.out.println("파일에 추가할 내용을 입력하시요 : ");
			String updateInfo = sc.nextLine();
			if(updateInfo.equals("exit")) {
				break;
			} else {
				sb.append(updateInfo);
				
			}
			} //e.while
			
			System.out.println("변경된 내용을 파일에 추가하시겠습니까(y/n) : ");
			char yn = sc.next().charAt(0);
			
			if(yn == 'y' || yn == 'Y') {
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(update+".txt"));){
					bw.write(sb.toString());
					System.out.println(update+".txt" + "파일의 내용이 변경되었습니다.");
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
