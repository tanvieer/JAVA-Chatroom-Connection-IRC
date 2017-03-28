import org.jibble.pircbot.PircBot;

public class TwitchBot extends PircBot {
	public TwitchBot(){
		super.setName("tanvieer");
		this.isConnected();
	}
	public void onMessage(String chnl, String sender, String login, String host, String msg ){
		if(msg.equalsIgnoreCase("|game")){
			sendMessage(chnl,"This Game Is " + Config.currentGame);
		}
		else if(msg.equalsIgnoreCase("|about")){
			sendMessage(chnl,"This game is about gaming comedy.");
		}
		else{
			//sendMessage(chnl,"cant understand");
			System.out.println("MESSAGE: " + msg);
		}
	}

}
