from socket import*
server = socket(AF_INET,SOCK_STREAM)
server.bind(('localhost',56743))
server.listen(2)
client,addr = server.accept()

while True:
    data = client.recv(1048576).decode()
    print("Imran : " + data)
    m=input("You :")
    client.send(m.encode())
