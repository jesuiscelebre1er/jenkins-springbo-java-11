pipeline {
    agent any
    
    stages {
        
        stage('clean workspace') {
            steps {
                sh 'rm -r $JENKINS_HOME/workspace/$JOB_NAME/*'
            }
        }
        
        stage('Clone repository') {
            steps {
                git 'https://github.com/jesuiscelebre1er/jenkins-springbo-java-11.git'
               
            }
            
             
        }
        
       
        
         stage('test env var') {
           
            steps {
                sh 'echo mon project en cours $JOB_NAME'
            }
            
            
        }
        
        stage('Build') {
            steps {
                sh 'echo repertoire de travail'
                sh 'ls -l ./'
                sg 'echo =====IN MY REPO DIR======== '
                sh './mvnw clean package'
            }
        }
        
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
        
        stage('Deploy') {
            steps {
                sh './mvnw deploy'
            }
        }
    }
}
