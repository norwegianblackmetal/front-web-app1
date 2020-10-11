from flask import Flask
from flask import render_template
app = Flask(__name__)

@app.route('/')
def endpoint1():
    return render_template('base.html')

@app.route('/str')
def str():
    return "strinfg"

if __name__ == '__main__':
    app.run(host='0.0.0.0', port='5000')