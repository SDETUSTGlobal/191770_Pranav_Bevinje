from flask import Flask, render_template, request
from flask_mysqldb import MySQL
db = Flask(__name__)


db.config['MYSQL_HOST'] = 'localhost'
db.config['MYSQL_USER'] = 'root'
db.config['MYSQL_PASSWORD'] = 'root'
db.config['MYSQL_DB'] = 'projectpranav'

mysql = MySQL(db)


@db.route('/', methods=['GET', 'POST'])
def nav():
    if request.method == "POST":
        info = request.form
        NAME = info['NE']
        UID = info['UD']
        CNAME = info['CN']
        EMAIL = info['EL']

        connect = mysql.connection.cursor()
        connect.execute("INSERT INTO sdetFinal(Fullname, UID , Company, Email) VALUES (%s, %s, %s, %s)", (NAME, UID, CNAME, EMAIL))
        mysql.connection.commit()
        connect.close()
        return render_template('result.html', rname=NAME, ruid=UID, rcname=CNAME, rcmail=EMAIL)
    return render_template('index.html')

@db.route('/result')
def resultpage():
    return render_template('result.html')


if __name__ == '__main__':
    db.run()