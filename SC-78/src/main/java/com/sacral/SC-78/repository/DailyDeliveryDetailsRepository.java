.

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.SC-78.entity.DailyDeliveryDetails;

@Repository
public interface DailyDeliveryDetailsRepository extends JpaRepository<DailyDeliveryDetails, Long> {

    List<DailyDeliveryDetails> findByTitleContaining(String title);

    List<DailyDeliveryDetails> findByRRPContaining(String RRP);

    List<DailyDeliveryDetails> findByDeliveredQuantityContaining(String deliveredQuantity);

    List<DailyDeliveryDetails> findByDeliveryStatusContaining(String deliveryStatus);

    List<DailyDeliveryDetails> findByDeliveryTimeContaining(String deliveryTime);

    List<DailyDeliveryDetails> findByExpectedDeliveryTimeAndDateContaining(String expectedDeliveryTimeAndDate);

    void deleteByTitle(String title);

    void deleteByRRP(String RRP);

    void deleteByDeliveredQuantity(String deliveredQuantity);

    void deleteByDeliveryStatus(String deliveryStatus);

    void deleteByDeliveryTime(String deliveryTime);

    void deleteByExpectedDeliveryTimeAndDate(String expectedDeliveryTimeAndDate);

}