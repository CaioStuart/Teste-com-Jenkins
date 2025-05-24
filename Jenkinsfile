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
                bat 'mkdir bin'
                bat 'javac -cp "lib\\junit-4.13.2.jar;lib\\hamcrest-core-1.3.jar" -d bin src\\testes\\*.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java -cp "bin;lib\\junit-4.13.2.jar;lib\\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore testes.SomaTest1 testes.SomaTest2 testes.SomaTest3'
            }
        }
    }
}
