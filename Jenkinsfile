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
                sh 'git clone https://github.com/jesuiscelebre1er/jenkins-springbo-java-11.git mytest-repo'
               
            }
            
             
        }
        
        stage('create directory') {
            steps {
                sh 'mkdir myrepo-dir'
            }
        }
        
         stage('test env var') {
           
            steps {
                sh 'echo mon project en cours $JOB_NAME'
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
