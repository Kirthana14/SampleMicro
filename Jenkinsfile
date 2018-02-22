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
                # background process
                sh' java -jar build/libs/gs-securing-web-0.1.0.jar > /dev/null 2>&1 '
                 # take bg process id
                 sh 'PID=$!'
                 # wait 60 s
                 sh 'sleep 60'
                 # you can kill the process - if it's already stopped, then no problem
                 # send default signal TERM to the java process, it if's still working 
                 # = java can handle signal
                 sh 'kill $PID 2>/dev/null'
                 sh 'sleep 2'
                 # still process ? use signal KILL = and I mean it
                 sh 'kill -KILL $PID  2>/dev/null'
                
            }
        }
    }
}
