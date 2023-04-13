pipeline {
    agent any
    
    stages {
        stage('Clone repository') {
            
            steps {
                sh 'git clone https://github.com/jesuiscelebre1er/jenkins-springbo-java-11.git mytest-repo'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                sh 'mvn deploy'
            }
        }
    }
}
