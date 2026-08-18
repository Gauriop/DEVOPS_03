@echo off
echo ==============================
echo Verifying Java
echo ==============================
java -version
javac -version

echo.
echo ==============================
echo Verifying Git
echo ==============================
git --version

echo.
echo ==============================
echo Verifying Maven
echo ==============================
mvn -version

echo.
echo ==============================
echo Verifying Ant
echo ==============================
ant -version

echo.
echo ==============================
echo Verifying Gradle
echo ==============================
gradle -version

echo.
echo ==============================
echo All checks complete.
echo ==============================
pause
