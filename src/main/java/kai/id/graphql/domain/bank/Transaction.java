package kai.id.graphql.domain.bank;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Gemuruh Geo Pratama
 * @created 16/02/2021-10:50 AM
 */
@Data
@Builder
public class Transaction {
    BigDecimal amount;
    String name;
}
