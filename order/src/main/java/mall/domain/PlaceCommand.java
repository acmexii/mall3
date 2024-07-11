package mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PlaceCommand {

    private String userId;
    private Long productId;
}
