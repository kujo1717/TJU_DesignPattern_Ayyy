package org.ayyy;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import java.lang.Class.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;
/**
 * @Author: 杨严
 * @Date: ${YEAR}/${MONTH}/${DAY}/${TIME}
 * @Description: 启动类
 */
public class Main {

    public static void main(String[] args) {
        LauncherDiscoveryRequest allTestRequest = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(selectPackage(Main.class.getPackage().getName()))
                .filters(includeClassNamePatterns(".*Test"))
                .build();
        ;

        Launcher launcher = LauncherFactory.create();

        TestPlan testPlan = launcher.discover(allTestRequest);
        Set<TestIdentifier> testIdentifierSet = testPlan.getChildren("[engine:junit-jupiter]");
        List<TestIdentifier> testIdentifierList=new ArrayList<>(testIdentifierSet);
        int i=0;
        for (TestIdentifier test:testIdentifierList){
            System.out.printf("%2d: %s\n", i, test.getDisplayName());
            i+=1;
        }


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入一个数字选择特定测试， -1退出");
            int choice = scanner.nextInt();
            if (choice == -1) {
                break;
            }
            if (choice < 0 || choice >= testIdentifierList.size()) {
                System.out.println("越界！");
                continue;
            }
            TestIdentifier chosenTestIdentifier = testIdentifierList.get(choice);
            System.out.printf("正在执行测试%2d: %s\n", choice, chosenTestIdentifier.getDisplayName());
            LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                    .selectors(selectPackage(Main.class.getPackage().getName()))
                    .filters(includeClassNamePatterns(chosenTestIdentifier.getLegacyReportingName()))
                    .build();
            launcher.execute(request);
        }
    }
}