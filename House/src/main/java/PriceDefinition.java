import java.math.BigDecimal;

public record PriceDefinition(BigDecimal floorPrice, BigDecimal wallPrice, BigDecimal carportPrice) {
}
