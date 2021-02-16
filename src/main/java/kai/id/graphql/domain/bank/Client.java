package kai.id.graphql.domain.bank;

import lombok.Builder;
import lombok.Setter;
import lombok.Value;

import java.util.List;
import java.util.UUID;

/**
 * @author Gemuruh Geo Pratama
 * @created 15/02/2021-6:11 PM
 */
@Setter
@Builder
public class Client {
    UUID id;
    String firstName;
    List<String> middleNames;
    String lastName;
}
