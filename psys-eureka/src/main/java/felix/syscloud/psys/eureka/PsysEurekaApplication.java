package felix.syscloud.psys.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 编  号：
 * 名  称：PsysEurekaApplication
 * 描  述：
 * 完成日期：2019/2/24 15:23
 * @author：felix.shao
 */
@EnableEurekaServer
@SpringBootApplication
public class PsysEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsysEurekaApplication.class, args);
	}
}
