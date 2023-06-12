package com.kh.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 문자 기반 스트림
 * - 문자 데이터를 읽고 출력할 때 사용
 * - Reader, Writer : 문자 기반 입출력 스트림의 최상위 클래스
 * */

public class FileReadingTest {
	
	String fileName = "src/test.txt";
	String outfileName = "src/result.txt";
	

	public static void main(String[] args) {

		FileReadingTest f = new FileReadingTest();
		f.fileSave();
//		f.fileRead(); //한단어씩
//		f.method1(); //한줄씩
//		f.method2(); //다른 파일로 출력
		f.method3();
	}

	public void fileSave() { //src에서 리프레시
		//try-with-resource 문 : 사용한 리소스를 자동으로 close()
		//FileWriter : 파일을 생성하고 데이터를 문자 단위로 저장
		try (FileWriter fw = new FileWriter(fileName, true)){ // finally에 close를 하기 싫을때 //true를 사용할경우 복사
			
			fw.write("IO 재미있으신가요? \n");
			fw.write("아닌가요? ㅠ \n");
			fw.write("또리매에에에엔 \n");
			
			fw.flush(); // 강제로 자료를 출력_ 반드시 해줘야 저장됨
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public void fileRead() {
		// FileReader를 사용해서 파일에서 데이터를 문자 단위로 읽어온다.
		try (FileReader fr = new FileReader(fileName)) {

			int data = 0;
			while ((data = fr.read()) != -1) {
				System.out.print((char) data); // 한글자씩 가져오는 data라서 char로 형변환
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	// 파일에 있는 내용을 읽어서 한 줄 단위로 콘솔에 출력하는 로직
	public void method1() {
		//BufferedReader : 버퍼는 데이터가 쌓이기를 기다렸다가 꽉 차게 되면 데이터를 한꺼번에 보냄
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			
			String line = "";
			
			while((line = br.readLine()) != null)
				System.out.println(line);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	// 파일에 있는 내용을 읽어서 또다른 파일로 출력하는 로직
	public void method2() {
		/*
		 * BufferedReader, BufferedWriter : 입출력 효율을 높이기 위해 버퍼를 사용하는 보조스트림
		 * - 라인(line) 단위로 입출력이 편리
		 * - String readLine() : 한 라인만 읽어온다. (BufferedReader 메서드)
		 * - void newLine() : 라인 구분자(개행문자)를 출력한다. (BufferedWriter 메서드)
		 * 
		 * */
		BufferedReader br = null;
		BufferedWriter bw = null;
	
		try {
			
			br = new BufferedReader(new FileReader(fileName));
			bw = new BufferedWriter(new FileWriter(outfileName));
			
			String line = "";
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine(); //개행문자
				
			}
			
		} catch (IOException e) { 
			
			e.printStackTrace();
		} finally { //try catch문이라서 finally 사용
			try {
				br.close();
				bw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	// 파일에 있는 내용을 읽어서 또다른 파일로 출력하는 로직
	public void method3() {

		BufferedReader br = null;
		PrintWriter pw = null;
		
		//PrintWriter : 프린터와 유사하게 출력하는 print(), println()메서드를 가지고 있는 보조 스트림
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			pw = new PrintWriter(new FileWriter(outfileName, true), true);
			
			String line = "";
			while((line = br.readLine()) != null) {
				pw.println(line);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
