#!/usr/bin/env groovy

pipeline {
    agent any
   /* agent  {
        
        docker {
            
            image 'gradle'
            args '-u root'
            //sh 'chmod 666 /var/run/docker.sock'
            //sh 'sudo usermod -a -G docker kirthana'
        }
    } */
    
    stages {
               stage('Build') {
            steps {
                echo 'Building'
               
                
            }
        }
                stage('Test') {
            steps {
                echo 'Testing'
                sh 'java -jar build/libs/gs-securing-web-0.1.0.jar -a gradle –stop  '
                sh 'curl -X POST localhost:9999/shutdown'
                
            }
        }
        
      
        stage('Deploy') {
            steps {
                echo 'Delivering...'
                sh 'fuser -n tcp -k 9999'
                
            }
        }
    }
}
