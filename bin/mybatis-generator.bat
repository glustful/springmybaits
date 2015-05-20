@echo off
echo [INFO] Use maven mybatis-generator plugin generate model from table.

cd %~dp0
cd ..
call mvn mybatis-generator:generate
cd bin
pause