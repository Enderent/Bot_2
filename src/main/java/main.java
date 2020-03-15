import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.player.DefaultAudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.source.AudioSourceManagers;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.VoiceChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.AudioManager;

import javax.security.auth.login.LoginException;

public class main extends ListenerAdapter {
    static char prfix = ',';
    static boolean isclaimed = true;

    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);

        String token = "Njg4NDc2MTQ1MTYyNzgwNzAw.Xm1H0A.3n85MK47mYs84NVeVWoTBrNUKhw";
        builder.setToken(token);
        builder.addEventListeners(new main());
        builder.setActivity(Activity.watching("Killing of false gods"));

        //lavaplayer impementation
        AudioPlayerManager playerManager = new DefaultAudioPlayerManager();
        AudioSourceManagers.registerRemoteSources(playerManager);
        AudioPlayer player = playerManager.createPlayer();

        builder.build();


    }

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        if (event.getMessage().getContentRaw().equals(prfix + "Tek'ma'tek Teal'c")) {
            event.getChannel().sendMessage("Tek'ma'tek!" + " " + event.getAuthor().getName()).queue();
        }

        if (event.getMessage().getContentDisplay().contains(".claim")) {

            if (!event.getAuthor().isBot()) {
                event.getChannel().sendMessage("Hasshak").queue();
                //isclaimed = false;
            } //else
                //isclaimed = true;
            if (event.getMessage().getContentRaw().startsWith(prfix+"play")) {

                VoiceChannel channel = event.getMember().getVoiceState().getChannel();
                AudioManager manager = event.getGuild().getAudioManager();
                manager.openAudioConnection(channel);





            }


        }
    }


    }

