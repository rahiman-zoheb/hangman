
# hangman web application.

Repository with docker containers for hangman web app
1. mysql container for db
2. spring boot container for adding guess
3. spring boot container for showing guesses

MySQL database
# To create the mysql database, run the following at command line
docker run -d -it --name hangman-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=hangman -e MYSQL_USER=hangman -e MYSQL_PASSWORD=hangman mysql

# Create a database
CREATE DATABASE hangman;

# Grant all the privileges
GRANT ALL PRIVILEGES ON hangman.* TO 'hangman';
