#!/
from flask import Flask, render_template

def main():
    print(hello())


app = Flask(__name__)

@app.route('/')
def hello():
    return( render_template('index.html') )



if __name__ == '__main__':
    app.run(host='192.168.0.13',port=5000, debug=True,load_dotenv=True)
