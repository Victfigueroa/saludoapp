pipeline {
    agent any
    stages {
        stage('Compilar') {
            steps {
                bat '"C:\\Maven\\apache-maven-3.9.10\\bin\\mvn.cmd" clean compile'
            }
        }
        stage('Probar') {
            steps {
                bat '"C:\\Maven\\apache-maven-3.9.10\\bin\\mvn.cmd" test'
            }
        }
        stage('Empaquetar') {
            steps {
                bat '"C:\\Maven\\apache-maven-3.9.10\\bin\\mvn.cmd" package'
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





