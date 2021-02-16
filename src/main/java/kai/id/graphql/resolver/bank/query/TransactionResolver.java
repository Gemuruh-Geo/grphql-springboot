package kai.id.graphql.resolver.bank.query;

import graphql.kickstart.tools.GraphQLResolver;
import kai.id.graphql.domain.bank.BankAccount;
import kai.id.graphql.domain.bank.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Gemuruh Geo Pratama
 * @created 16/02/2021-10:51 AM
 */
@Component
@Slf4j
public class TransactionResolver implements GraphQLResolver<BankAccount> {
    ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    public CompletableFuture<List<Transaction>> transactions(BankAccount bankAccount) {
        log.info("Retreive Transcation");
        return CompletableFuture.supplyAsync(()-> {
            log.info("Start Retreive Transactions from another thread");
            Transaction transaction1 = Transaction.builder().amount(new BigDecimal("1000")).name("Kacamata").build();
            Transaction transaction2 = Transaction.builder().amount(new BigDecimal("2000")).name("Ipad").build();
            return Arrays.asList(transaction1,transaction2);
        }, executorService);
    }
}
