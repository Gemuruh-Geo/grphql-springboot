package kai.id.graphql.resolver.bank.query;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.SelectedField;
import kai.id.graphql.domain.bank.BankAccount;
import kai.id.graphql.domain.bank.Currency;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author Gemuruh Geo Pratama
 * @created 15/02/2021-12:22 PM
 */
@Component
@Slf4j
public class BankAccountResolver implements GraphQLQueryResolver {
    public BankAccount bankAccount(UUID id, DataFetchingEnvironment environment) {
        log.info("Retrieving Bank Account id: {}", id);

        Set<String> namesQueryField = environment.getSelectionSet().getFields().stream().map(SelectedField::getName).collect(Collectors.toSet());

        return BankAccount.builder().id(id).currency(Currency.IDR)
                .build();
    }
}
