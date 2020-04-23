node {
    def app
    stage('Clone') {
        checkout scm
    }
    stage('Build') {
        echo 'debut du build'
         app=docker.build("remil/java")
    }
    stage('Test') {
        echo 'debut du Test'
        docker.image ('remil/java').withRun (' -p 80:80') { c->
        sh 'docker ps'
        sh 'curl localhost'
        }
    }
}
