package kai.id.graphql.resolver.bank.query;

import graphql.GraphQLException;
import graphql.kickstart.tools.GraphQLResolver;
import kai.id.graphql.domain.bank.BankAccount;
import kai.id.graphql.domain.bank.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Gemuruh Geo Pratama
 * @created 16/02/2021-9:32 AM
 */
@Component
@Slf4j
public class ClientResolver implements GraphQLResolver<BankAccount> {
    private final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public CompletableFuture<Client> client(BankAccount bankAccount) {
        log.info("Start Client Resolver");
        return CompletableFuture.supplyAsync(()->{
            log.info("Retreive Client from another thread");
            return Client.builder()
                .firstName("Gemuruh")
                .lastName("Geo")
                .middleNames(Collections.singletonList("pratama")).build();
        }, executorService);

    }
}
