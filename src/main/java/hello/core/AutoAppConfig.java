package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // 1. 직접 지정 가능
        //basePackages = "hello.core.member",
        //basePackageClasses = AutoAppConfig.class,

        //2. 직접 지정 하지 않으면, Default 는 AutoAppConfig 의 하위 package 부터

        // 수동 등록 건들은 제외: 예제 코드를 살리기 위해...
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }
}
