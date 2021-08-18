package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
	@Value("Amit Dubey")
	private String name;
	@Value("28")
	private int age;
	@Value("#{myphones}")
	private List<String> numbers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", numbers=" + numbers + "]";
	}

}
