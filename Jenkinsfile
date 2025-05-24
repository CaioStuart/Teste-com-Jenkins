pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/CaioStuart/Teste-com-Jenkins.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mkdir -p bin'
                bat 'javac -cp "lib/*" -d bin src/testes/*.java'
            }
        }
        stage('Test') {
            steps {
                bat 'java -cp "lib/*;bin" org.junit.runner.JUnitCore testes.SomaTest1'
                bat 'java -cp "lib/*;bin" org.junit.runner.JUnitCore testes.SomaTest2'
                bat 'java -cp "lib/*;bin" org.junit.runner.JUnitCore testes.SomaTest3'
            }
        }
    }
}
