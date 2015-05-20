@echo off
echo [INFO] Use maven clean run the project.

cd %~dp0
cd ..
call mvn clean
cd bin
pause