package kai.id.graphql.domain.bank;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

/**
 * @author Gemuruh Geo Pratama
 * @created 15/02/2021-12:25 PM
 */
@Value
@Builder
public class BankAccount {
    UUID id;
    Client client;
    Currency currency;
}
