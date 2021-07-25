### 자바의 정석 기초편 - http://www.yes24.com/Product/Goods/85632276
## 소스 설명  
- flash - 9개의 어려운 개념을 플래시 동영상으로 단계별 설명(exe파일. 윈도우 only)  
- javajungsuk_basic_src - 책의 전체 소스  
- ppt - 요약집(강의자료)
- 연습문제 풀이 - 챕터별 연습문제 답안  
- javajungsuk_basic_sample.pdf - 샘플 ebook(ch1~ch4)
- javajungsuk_basic_요약집.pdf - ppt 요약집 pdf버젼

<BR>
  
## 무료강의 - 최고의 자바강의를 무료로
https://youtube.com/playlist?list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp  

  <BR>  
    
## 책관련 Q&A
http://www.codechobo.com

    

<BR>
      
## 자바개발도구(JDK8) 설치  
[Windows] https://github.com/ojdkbuild/ojdkbuild/releases/download/java-1.8.0-openjdk-1.8.0.292-1.b10/java-1.8.0-openjdk-1.8.0.292-1.b10.ojdkbuild.windows.x86_64.zip

  
[Mac] SDKMAN을 이용해서 openJDK설치

   - SDKMAN 설치 - https://sdkman.io/install  

   ```
    $ curl -s "https://get.sdkman.io" | bash
    $ source "$HOME/.sdkman/bin/sdkman-init.sh"    
   ```

   - SDKMAN 명령어  
   ```
    $ sdk version  <--- sdkman 버전출력  
    $ sdk list java  <-- 설치 가능 & 설치된 JDK목록  
    $ sdk install Identifier <--- 지정된 JDK설치(Identifier대신 8.292.10.1-amzn와 같이 원하는 종류와 버전 지정)  
    $ sdk current java <--- 현재 사용중인 java버전 출력  
    $ sdk use java 버전 <--- 현재 사용중인 java버전을 지정된 버젼으로 변경  
    $ echo $JAVA_HOME  <--- JAVA_HOME으로 지정된 경로 출력  
    $ sdk uninstall java 버전  <--- 지정된 버전의 자바를 uninstall  
   ```
   **[참고]** openJDK버전별 다운로드 - https://jdk.java.net/archive/
<br>
<br>
      
 ## 통합 개발 환경(eclipse) 설치  
https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2019-09/R/eclipse-java-2019-09-R-win32-x86_64.zip&mirror_id=1273  
  
위의 파일을 다운받아서 압축을 풀고, eclipse폴더 내의 eclipse.ini의 중간에 아래의 2줄을 추가

[Windows]
```
  -vm  
  jdk설치경로\bin\javaw.exe  
``` 

[Mac]
```
  -vm  
  jdk설치경로\bin  
```  
  <BR>
    
**[eclipse.ini] - Windows**    
-startup  
plugins/org.eclipse.equinox.launcher_1.5.500.v20190715-1310.jar  
--launcher.library  
plugins/org.eclipse.equinox.launcher.win32.win32.x86_64_1.1.1100.v20190907-0426  
-product  
org.eclipse.epp.package.java.product  
-showsplash  
org.eclipse.epp.package.common  
--launcher.defaultAction  
openFile  
--launcher.defaultAction  
openFile  
--launcher.appendVmargs  
**-vm**  
**c:\jdk8\bin\javaw.exe**      
-vmargs  
-Dosgi.requiredJavaVersion=1.8  
-Dosgi.instance.area.default=@user.home/eclipse-workspace  
-XX:+UseG1GC  
-XX:+UseStringDeduplication  
--add-modules=ALL-SYSTEM  
-Dosgi.requiredJavaVersion=1.8  
-Dosgi.dataAreaRequiresExplicitInit=true  
-Xms256m  
-Xmx1024m  
--add-modules=ALL-SYSTEM  
    
    

  
  
  
  
