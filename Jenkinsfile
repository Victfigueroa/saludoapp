pipeline {
    agent any
    stages {
        stage('Compilar') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Probar') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Empaquetar') {
            steps {
                sh 'mvn package'
            }
        }
    }
    post {
        success {
            echo "El build fue exitoso"
        }
        failure {
            echo "El build falló"
        }
    }
}




