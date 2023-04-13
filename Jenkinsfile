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
                sh 'echo repertoire de travail --- $pwd'
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
