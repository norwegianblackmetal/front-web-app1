from flask import Flask
app = Flask(__name__)

@app.route('/')
def endpoint1():
    return 'Hollow water!'

if __name__ == '__main__':
    app.run();