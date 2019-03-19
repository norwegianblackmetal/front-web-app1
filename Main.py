#!/
from flask import Flask

def main():
    print(hello())


app = Flask(__name__)

@app.route('/')
def hello():
    return 'Hello, World!'



if __name__ == '__main__':
    app.run(host='192.168.0.14',port=5000, debug=True,load_dotenv=True)