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
        stage('Gradle') {
            steps{
           sh 'curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -' 
           sh 'sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"'
           sh 'sudo apt-get install -y docker-ce'
            } 
            
        }
        
        
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'gradle build'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                sh 'java -jar build/libs/gs-securing-web-0.1.0.jar'
            }
        }
    }
}
