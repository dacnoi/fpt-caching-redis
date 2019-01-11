pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        
		stage('clean') {
            steps {
                sh "mvn clean"
            }
        }
		stage('test') {
            steps {
                sh "mvn test"
            }
        }
        stage('package') {
            steps {
                sh "mvn package"
            }
        }
    }
}