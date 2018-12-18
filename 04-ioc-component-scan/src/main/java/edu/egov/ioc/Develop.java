package edu.egov.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/* TODO 04-01. Bean 자동 등록을 위한 애노테이션 등록 */
@Component //@contriller @service @ repository
public class Develop {
	/* TODO 04-02. Autowired 애노테이션 등록 */
	/* TODO 04-03. Qualifier를 사용하여 등록된 Bean 중에서 programmer 의존성 주입 */
	@Autowired
	@Qualifier("programmer")
	private Emp emp;

	public void coding() {
		emp.gotoOffice();
		System.out.println("회사에서 일하는 중");
		emp.getOffWork();
	}
}
