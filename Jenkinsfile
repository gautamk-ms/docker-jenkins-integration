node{
    stage('SCM Checkout'){
        git 'https://github.com/gautamk-ms/docker-jenkins-integration.git'
    }

    stage('Compile-Package'){
        sh 'mvn package'
    }
}