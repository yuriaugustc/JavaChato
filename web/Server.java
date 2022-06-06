package web;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public final class Server {
    private ServerSocket server;
    private ArrayList<Socket> room;
    private Database dbconn;
            
    //inicializando o servidor
    public Server(int port){
        try{
            server = new ServerSocket(port);
            System.out.println("Server created! Listening at port: " + port);
            dbconn.createConnection();
            System.out.println("Database created! Everything okay!");
        } catch (IOException ex){ // tratativa de erro caso a inicializacao falhe;
            System.out.println("Error at creating the server: " + ex.getMessage());
            System.out.println("Closing all connections.");
            closeServer();
        }
    }
    
    //fazendo o servidor escutar na porta determinada durante a sua inicializacao.
    public void startServer(){
        try{
            
            Socket connection; // variavel temporaria de conexao, para guarda no ArrayList;
            room = new ArrayList<>();
            while(true){ // enquanto nao se alcançar o minino de jogadores, o laço continuara se repetindo;
                connection = server.accept(); //escutando jogadores para que a sala possa ser criada;
                
                Handler handler = new Handler(connection); // criar uma classe de handler e mover o ArrayList para lá, o handler fará verificando via banco de dados;
                Thread threadHandler = new Thread(handler);
                threadHandler.start();
            }
        }
        catch (IOException ex){ // tratativa de erros para caso de falha;
            System.out.println("Error at starting the server: " + ex.getMessage());
            System.out.println("Closing all connections.");
            closeServer(); //fechando as conexões em caso de falha
        }
    }
    
    public void closeServer(){ //funcao de fechamento das conexoes em caso de falha;
        try{
            if(server != null)
                server.close();
        } catch (IOException ex){
            System.out.println("Error at closing the server. This was... unexpect");
            ex.getMessage();
        }
    }
}