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
*/

def scp(a)
{
  sh 'scp ${a}/webapp/target/webapp.war ubuntu@172.31.20.2:/var/lib/tomcat9/webapps/testapp.war'
}
