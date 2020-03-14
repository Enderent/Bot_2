import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import javax.annotation.Nonnull;
import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class main extends ListenerAdapter {

        public static void main(String[] args) throws LoginException {
            JDABuilder builder = new JDABuilder(AccountType.BOT);

            String token ="Njg4NDc2MTQ1MTYyNzgwNzAw.Xm1Enw.suZcRRomuQl19P1Yr9JjLVoFVVU";
            builder.setToken(token);
            builder.addEventListeners(new main());
            builder.build();

        }

    @Override
    public void onGuildMessageReceived( GuildMessageReceivedEvent event) {
        System.out.println("coś" + event.getAuthor().getName() + event.getMessage().getContentDisplay());
        if (event.getMessage().getContentRaw().equals("!ping")){
            event.getChannel().sendMessage("pong!").queue();
        }
    }
}
