pipeline {
    agent {
        ////If you want only single maven version then use this
        //     tools{
        //         maven "3.6.0"
        //     }

        ////If you want multiple maven version then use this
        docker {
            image "maven:3.8.3-jdk-8"
            label "docker"
        }
    }




    stages {
        stage("Build") {
            steps{
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
    }

    post{
        always {
            cleanWs()
        }
    }

}