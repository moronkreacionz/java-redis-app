# java-redis-app


First (without using docker compose)
$ docker run -d --name redis redis  
$ docker build -t moronkreacionz/java-redis-app:1.0 .    
$ docker push moronkreacionz/java-redis-app:1.0 
$ docker run --link redis:redis moronkreacionz/java-redis-app:1.0 java JavaRedisApp   

When you run this, do cancel it with ctrl+c since the app is a while loop just to test redis connections.

(do all above things once the code is in git and downloaded into given directory)


With Docker Compose approach:

Check the Compose YAML file
It should have all the things which we have on the commandline given above 
eg: javaclient and redis image and linking the two

$ docker-compose up   

cancel the results if you are done reviewing it

Also (another approach is to check detached mode running in background, using docker ps) 
$ docker-compose up -d 
(detached mode)

Once the container is running, you can check 
$ docker ps
$ docker logs <containerid> 

$ docker stop <containerid> 
since this is an infinite loop application for testing linking between docker containers using docker compose. 

Hope this helps. !
