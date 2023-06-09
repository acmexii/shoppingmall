package shoppingmall.domain;

import java.util.*;
import lombok.*;
import shoppingmall.domain.*;
import shoppingmall.infra.AbstractEvent;

@Data
@ToString
public class StockDecresed extends AbstractEvent {

    private Long id;
    private String productName;
    private Integer stock;

    public StockDecresed(Stock aggregate) {
        super(aggregate);
    }

    public StockDecresed() {
        super();
    }
}
