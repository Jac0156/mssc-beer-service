package guru.springframework.mssc_beer_service.services.inventory;

import java.util.UUID;

public interface BeerInventoryService {

    Integer getOnHandInventory(UUID beerId);

}
