package edu.egov.ioc;

import org.springframework.stereotype.Component;

@Component
public class Programmer implements Emp {
	@Override
	public void gotoOffice() {
		System.out.println("프로그래머 출근");
	}

	@Override
	public void getOffWork() {
		System.out.println("프로그래머 퇴근");
	}
}