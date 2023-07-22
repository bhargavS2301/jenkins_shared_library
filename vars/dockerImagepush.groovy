 def call(String project, String ImageTag, String hubUser){
     withCredentials([usernamePassword(
       credentialsId: 'docker-cred',
       passwordVariable: 'pass', 
       usernameVariable: 'user')]) {
     )]) {
         sh "docker login -u '$USER' -p '$PASS'"
     }
     sh "docker image push ${hubUser}/${project}:${ImageTag}"
     sh "docker image push ${hubUser}/${project}:latest"   
 }
// withCredentials([usernamePassword(
 // credentialsId: 'docker-cred',
 // passwordVariable: 'pass', 
 // usernameVariable: 'user')]) {
   
