package org.example;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import org.openqa.selenium.edge.EdgeOptions;

import static com.codeborne.selenide.Browsers.EDGE;
import static java.util.Collections.singletonList;

public class Main {
    public static void main(String[] args) {
        new SelenideDriver(new SelenideConfig()
                .browser(EDGE)
                .browserCapabilities(new EdgeOptions()
                        .addArguments("--remote-debugging-port=1111")
                        .setExperimentalOption("windowTypes", singletonList("webview")))
                .browserBinary(System.getenv("LOCALAPPDATA") + "/Microsoft/WindowsApps/ms-teams.exe")
                .browserVersion("125")
                .browserSize(null)).open();
    }
}
