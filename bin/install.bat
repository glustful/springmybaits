@echo off
cd %~dp0
cd ..
call mvn clean source:jar install -Dmaven.test.skip=true

pause