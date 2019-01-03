pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Limpiando y construyendo'
                sh 'mvn clean package'
            }
        }
    }
}
