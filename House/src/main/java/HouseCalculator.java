import java.math.BigDecimal;

public class HouseCalculator {
    public static double getFloorArea(HouseModel house) {
        return house.getWidth().getValue() * house.getLength().getValue();
    }

    public static double getCarportArea(HouseModel house) {
        return house.getCarportModel().getLength().getValue() * house.getCarportModel().getWidth().getValue();
    }

    public static double getTotalArea(HouseModel house) {
        return getFloorArea(house) + getCarportArea(house);
    }

    public static double getWallArea(HouseModel house) {
        double widthWall = house.getWidth().getValue() * house.getHeight().getValue() * 2;
        double lengthWall = house.getLength().getValue() * house.getHeight().getValue() * 2;

        return widthWall + lengthWall;
    }

    public static BigDecimal getFloorPrice(HouseModel house, PriceDefinition priceDef) {
        return priceDef.floorPrice().multiply(BigDecimal.valueOf(getFloorArea(house)));
    }

    public static BigDecimal getWallPrice(HouseModel house, PriceDefinition priceDef) {
        return priceDef.wallPrice().multiply(BigDecimal.valueOf(getWallArea(house)));
    }

    public static BigDecimal getCarportPrice(HouseModel house, PriceDefinition priceDef) {
        return priceDef.carportPrice().multiply(BigDecimal.valueOf(getCarportArea(house)));
    }

    public static BigDecimal getTotalPrice(HouseModel house, PriceDefinition priceDef) {
        return getFloorPrice(house, priceDef).add(getWallPrice(house, priceDef)).add(getCarportPrice(house, priceDef));
    }
}
