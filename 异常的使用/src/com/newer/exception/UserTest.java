package com.newer.exception;

import java.util.Scanner;

public class UserTest {
	public static void main(String[] args) {
		User user = new User();
		System.out.println("请输入年龄 ：");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			user.setAge(age);
		} catch (TooYoungException e) {

			// TODO Auto-generated catch block
			handleTooYoungException(user, e);
		} catch (TooOldException e) {
			handleTooOldException(user, e);

		} finally {
			System.out.println("成功修改年龄：" + user);
			System.out.println("over");
		}
	}

	private static void handleTooYoungException(User user, TooYoungException e1) {
		// TODO Auto-generated method stub
		System.out.println(e1.getMessage());
		System.out.println("请再次输入年龄 ：");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			user.setAge(age);
		} catch (TooYoungException e) {

			// TODO Auto-generated catch block
			handleTooYoungException(user, e);
		} catch (TooOldException e) {
			// TODO Auto-generated catch block
			handleTooOldException(user, e);
		}
	}

	private static void handleTooOldException(User user, TooOldException e1) {
		// TODO Auto-generated method stub
		System.out.println(e1.getMessage());
		System.out.println("请再次输入年龄 ：");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try {
			user.setAge(age);
		} catch (TooYoungException e) {

			// TODO Auto-generated catch block
			handleTooYoungException(user, e);
		} catch (TooOldException e) {
			// TODO Auto-generated catch block
			handleTooOldException(user, e);
		}
	}

}
