import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class main extends ListenerAdapter {



        public static void main(String[] args) throws LoginException {
            JDABuilder builder = new JDABuilder(AccountType.BOT);

            String token ="Njg4NDc2MTQ1MTYyNzgwNzAw.Xm03jw.lW8WG0by2OfjBe0Th3Q5vZtSh1c";
            builder.setToken(token);

            builder.build();

        }


}
