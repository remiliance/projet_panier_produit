node {
    stage('Clone') {
        git 'https://github.com/remiliance/projet_panier_produit.git'
    }
    stage('Build') {
        echo 'debut du build'
          sh 'mvn -DskipTests=true package' 
    }
    stage('Run') {
        echo 'debut du run'
        sh label: '', script: 'java -jar target/microcommerce-0.0.1-SNAPSHOT.jar'
    }
}
