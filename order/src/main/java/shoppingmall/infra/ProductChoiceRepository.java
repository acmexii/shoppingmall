package shoppingmall.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shoppingmall.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "productChoices",
    path = "productChoices"
)
public interface ProductChoiceRepository
    extends PagingAndSortingRepository<ProductChoice, Long> {}
