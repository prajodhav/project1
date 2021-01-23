node {
  stage ('Checkout') {
    git 'https://github.com/prajodhav/project1' 
  }
  stage ('Compile-Package') {
    sh 'mvn package'
  }
}
