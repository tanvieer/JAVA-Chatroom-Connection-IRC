
public class Config {
	public static String channel = "#day9tv";
	public static String currentGame = "RumeGame";
	 public static void main( String[] args ) throws Exception
	    {
		 	TwitchBot bot = new TwitchBot();
		 	bot.setVerbose(true);
		 	bot.connect("irc.twitch.tv", 6667, "oauth:4hbuyfckyh1ig24ddz4mhacyn0ntbv");  //http://twitchapps.com/tmi/
		 	bot.joinChannel(channel);
		 	bot.getName();
	    }
	
}
