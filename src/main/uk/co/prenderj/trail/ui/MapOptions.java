package uk.co.prenderj.trail.ui;

/**
 * Color and route display arguments.
 * @author Joshua Prendergast
 */
public class MapOptions {
    public final int colorOutOfBounds;
    public final int colorRouteLine;
    public final Route route;

    public MapOptions(int outOfBoundsColor, int routeColor, Route route) {
        this.colorOutOfBounds = outOfBoundsColor;
        this.colorRouteLine = routeColor;
        this.route = route;
    }
}
