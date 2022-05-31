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
    private int count_connections;
    private Scanner receivePlayer1, receivePlayer2;
    private PrintStream sendPlayer1, sendPlayer2;
    
    //inicializando o servidor
    public Server(int port){
        try{
            server = new ServerSocket(port);
            System.out.println("Server created! Listening at port: " + port);
            count_connections = 0; // inicializando o contador de player conectados;
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
                room.add(connection); // apesar de ser um ArrayList, a intencao é haver apenas uma tupla-2
                count_connections++; // contador de jogadores concectados.
                if(count_connections == 1) // se apenas um jogador se conectou, o jogo ainda não pode ser iniciado, o jogador aguarda no lobby;
                    System.out.println("A player has connected, waiting for another.");
                if(count_connections == 2){ // os dois jogadores se conectaram, nao existe mais a necessidade de escutar mais conexoes;
                    System.out.println("All players connected! Starting the game!");
                    break; // saindo do laco infinito;
                }
            }
            connection.close(); // fechando a variavel de conexão
            receivePlayer1 = new Scanner(room.get(0).getInputStream()); // criando a entrada de dados(recebimento) do player1; 
            receivePlayer2 = new Scanner(room.get(1).getInputStream()); // criando a entrada de dados(recebimento) do player2;
            sendPlayer1 = new PrintStream(room.get(0).getOutputStream()); // criando a saida de dados(saida) do player1;
            sendPlayer2 = new PrintStream(room.get(1).getOutputStream()); // criando a saida de dados(saida) do player2;
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
    
    public void removePlayer(int i){ //removendo o player do indice desejado; a estrutura de controle ficara para a classe que implementar o servidor;
        Socket sckt = room.get(i);
        room.remove(i);
        try{
            sckt.close();
        }catch (IOException ex){
            System.out.println("Error at closing the connection. This was... unexpect");
            ex.getMessage();
        }
    }
    
    public void removeAllPlayers(){ // removendo todas as conexoes do servidor;
        for (int i = 0; i < room.size(); i++) {
            removePlayer(i);
        }
    }
    
    public String messageFromPlayer1(){ //conexao de entrada de dados do playeer1;
        return receivePlayer1.nextLine();
    }
    
    public void sendToPlayer1(String msg){ //conexao de saida de dados do player1;
        sendPlayer1.println(msg);
    }
    
    public String messageFromPlayer2(){ //conexao de entrada de dados do playeer2;
        return receivePlayer2.nextLine();
    }
    
    public void sendToPlayer2(String msg){ //conexao de saida de dados do player2;
        sendPlayer2.println(msg);
    }
}
