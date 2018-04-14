from socket import*
client = socket(AF_INET,SOCK_STREAM)
client.connect(('localhost',56743))

while True:
    m=input("You: ")
    client.send(m.encode())
    data = client.recv(1048576).decode()
    print("Zahid : " + data)
