package kai.id.graphql.resolver.bank.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import kai.id.graphql.domain.bank.BankAccount;
import kai.id.graphql.domain.bank.CreateBankAccountInput;
import kai.id.graphql.domain.bank.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author Gemuruh Geo Pratama
 * @created 16/02/2021-2:13 PM
 */
@Component
@Slf4j
public class CreateBankAccountMutationResolver implements GraphQLMutationResolver {

    public BankAccount createBankAccount(CreateBankAccountInput input, DataFetchingEnvironment environment) {
        log.info("Create Bank Account with Name {}", input.getFirstName());
        return BankAccount.builder().id(UUID.randomUUID()).currency(Currency.IDR).build();
    }

}
