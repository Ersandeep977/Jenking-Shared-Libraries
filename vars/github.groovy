def gitmaven()
{
  git 'https://github.com/Ersandeep977/DevOps-Maven-code.git'
}

def gitfunction()
{
 git 'https://github.com/Ersandeep977/DevOps-FunctionTesting-code.git'
}

def MvnPack()
{
  sh 'mvn package'
}

def ScpData(WORKSPACE)
{
  sh "ssh ubuntu@172.31.20.2 'rm -rf /var/lib/tomcat9/webapps/testapp.war'"
  sh 'scp ${WORKSPACE}/webapp/target/webapp.war ubuntu@172.31.20.2:/var/lib/tomcat9/webapps/testapp.war'
}

def SelTesting(WORKSPACE)
{
  sh 'java -jar ${WORKSPACE}/testing.jar'
}

def ScpData1(WORKSPACE)
{ 
  sh 'scp ${WORKSPACE}/webapp/target/webapp.war ubuntu@172.31.25.117/var/lib/tomcat9/webapps:/var/lib/tomcat9/webapps/testapp.war'
}



