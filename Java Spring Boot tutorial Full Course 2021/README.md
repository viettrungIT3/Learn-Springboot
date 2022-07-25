## To run docker
```base
docker run -d --rm --name mysql-spring-boot-toturial -e MYSQL_ROOT_PASSWORD=12345678 -e MYSQL_USER=viettrungit3 -e MYSQL_PASSWORD=12345678 -e MYSQL_DATABASE=spring-boot-tutorial -p 3309:3306 --volume mysql-spring-boot-tutorial-volume:/var/lib/mysql mysql:latest
```

```cmd
mysql -h localhost -P 3309 --protocol=tcp -u viettrungit3 -p
```