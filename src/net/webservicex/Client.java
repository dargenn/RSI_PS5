package net.webservicex;

public class Client {
    public static void main(String[] args) {
        GeoIPService geoIPService = new GeoIPService();
        GeoIPServiceSoap soap = geoIPService.getGeoIPServiceSoap();

        String query = "Client querying...";
        GeoIP response = soap.getGeoIP("82.139.136.20");
        System.out.println(response.getCountryName());
        System.out.println(response.getIP());
        System.out.println(response.getCountryCode());
    }
}
