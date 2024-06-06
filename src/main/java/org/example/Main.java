package org.example;

import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;
import java.nio.file.Files;

import static com.codeborne.selenide.Browsers.EDGE;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import static java.util.Collections.singletonList;

public class Main {
    public static void main(String[] args) {
        File file = new File(System.getenv("LOCALAPPDATA") + "/Microsoft/WindowsApps/ms-teams.exe");
        System.out.println("file.exists() = " + file.exists());
        System.out.println("Files.exists(...) = " + Files.exists(file.toPath(), NOFOLLOW_LINKS));
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
