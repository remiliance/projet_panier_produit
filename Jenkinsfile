node {
    def app
    stage('Clone') {
        git 'https://github.com/remiliance/projet_panier_produit.git'
    }
    stage('Build') {
         app=docker.build("remil/java")
    }
}
