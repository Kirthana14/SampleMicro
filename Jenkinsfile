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
               
                
            }
        } 
      
        stage('Deploy') {
            steps {
                echo 'Delivering...'
               // sh 'java -jar build/libs/gs-securing-web-0.1.0.jar '
               sh' java -jar build/libs/gs-securing-web-0.1.0.jar &'      # Send it to the background
                MyPID=$!                        # Record PID
                echo $MyPID                     # Print to terminal
                # Do stuff
                sh 'kill $MyPID '
               
                
            }
        }
    }
}
