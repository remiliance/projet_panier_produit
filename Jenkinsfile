node {
    def app
    stage('Clone') {
        checkout scm
    }
    stage('Build') {
         app=docker.build("remil/java")
    }
}
