@echo off
@echo Configurando ambiente para JDK 1.8

rem call set M2_HOME=C:\VB\ferramentas\apache-maven\apache-maven-3.2.5
call set JAVA_HOME=C:\VB\java\jdk1.8.0_77
call PATH=%JAVA_HOME%\bin;%M2_HOME%\bin;%PATH%

@echo Finalizado configurando
@echo  "<<<<<<<<<<<<<<<<<<< Java >>>>>>>>>>>>>>>>>>>>>>>>>>"
call java  -version
call javac -version

rem @echo  "<<<<<<<<<<<<<<<<<<< Maven >>>>>>>>>>>>>>>>>>>>>>>>>>"
rem call mvn -version