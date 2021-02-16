package kai.id.graphql.resolver.bank.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import kai.id.graphql.domain.bank.BankAccount;
import kai.id.graphql.domain.bank.Client;
import kai.id.graphql.domain.bank.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.UUID;

/**
 * @author Gemuruh Geo Pratama
 * @created 15/02/2021-12:22 PM
 */
@Component
@Slf4j
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id) {
        log.info("Retrieving Bank Account id: {}", id);
        return BankAccount.builder().id(id).currency(Currency.IDR)
                .build();
    }
}
