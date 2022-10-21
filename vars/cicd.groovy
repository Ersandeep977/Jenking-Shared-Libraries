def newgit(repo)
{
  git "${repo}"
}

def mvn()
{
  sh 'mvn package'
}

def scp1()
{
  sh 'scp /var/lib/jenkins/sa.txt ubuntu@172.31.20.2:/home/ubuntu'
}
/*
WORKSPACE=/var/lib/jenkins/workspace/Shared-Lib-3

sh 'scp /home/ubuntu/.jenkins/workspace/DeclarativePipeline3/webapp/target/webapp.war ubuntu@172.31.20.211:/var/lib/tomcat9/webapps/testapp.war'
*/

def scp(a)
{
  sh 'scp ${a}/webapp/target/webapp.war ubuntu@172.31.20.2:/var/lib/tomcat9/webapps/webapp.war'
}

def scp1()
{
  sh 'scp /var/lib/jenkins/workspace/Shared-Lib-4/webapp/target/webapp.war ubuntu@172.31.20.2:/var/lib/tomcat9/webapps/testapp.war'
}
