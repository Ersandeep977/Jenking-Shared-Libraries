def newgit(repo)
{
  git "${repo}"
}

def mvn()
{
  sh 'mvn package'
}

def scp()
{
  sh 'scp /root/sa.txt ubuntu@172.31.20.2:/home/ubuntu'
}
