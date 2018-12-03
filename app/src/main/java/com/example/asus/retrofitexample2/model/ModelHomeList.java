package com.example.asus.retrofitexample2.model;

import java.util.List;

public class ModelHomeList {

    /**
     * message : Success
     * status : true
     * access_token_status : 1
     * has_more_venues : false
     * has_more_artists : false
     * details : {"NearByVenues":[{"venue_id":12,"venue_name":"Rosemount Hotel","venue_subtitle":"459 Fitzgerald St","venue_image":"","venue_logo":"","venue_distance":3,"venue_latitude":8.5606437899679,"venue_longitude":76.881033734286,"is_user_checked_in":false,"venue_user_description":"Because you listened to:\nDjango Django,Peanuts Wilson,Jake Bugg"},{"venue_id":28,"venue_name":"Store2","venue_subtitle":"Leela infopark","venue_image":"","venue_logo":"","venue_distance":3,"venue_latitude":8.5606437899679,"venue_longitude":76.881033734286,"is_user_checked_in":false,"venue_user_description":""},{"venue_id":27,"venue_name":"Store1tech","venue_subtitle":"Leela infopark","venue_image":"","venue_logo":"","venue_distance":5,"venue_latitude":8.5606265498474,"venue_longitude":76.881046810055,"is_user_checked_in":false,"venue_user_description":"Because you listened to:\nFrankie Smith,Atlantic Starr,Aurra"}],"LovedArtists":[]}
     */

    private String message;
    private boolean status;
    private int access_token_status;
    private boolean has_more_venues;
    private boolean has_more_artists;
    private DetailsBean details;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAccess_token_status() {
        return access_token_status;
    }

    public void setAccess_token_status(int access_token_status) {
        this.access_token_status = access_token_status;
    }

    public boolean isHas_more_venues() {
        return has_more_venues;
    }

    public void setHas_more_venues(boolean has_more_venues) {
        this.has_more_venues = has_more_venues;
    }

    public boolean isHas_more_artists() {
        return has_more_artists;
    }

    public void setHas_more_artists(boolean has_more_artists) {
        this.has_more_artists = has_more_artists;
    }

    public DetailsBean getDetails() {
        return details;
    }

    public void setDetails(DetailsBean details) {
        this.details = details;
    }

    public static class DetailsBean {
        private List<NearByVenuesBean> NearByVenues;
        private List<?> LovedArtists;

        public List<NearByVenuesBean> getNearByVenues() {
            return NearByVenues;
        }

        public void setNearByVenues(List<NearByVenuesBean> NearByVenues) {
            this.NearByVenues = NearByVenues;
        }

        public List<?> getLovedArtists() {
            return LovedArtists;
        }

        public void setLovedArtists(List<?> LovedArtists) {
            this.LovedArtists = LovedArtists;
        }

        public static class NearByVenuesBean {
            /**
             * venue_id : 12
             * venue_name : Rosemount Hotel
             * venue_subtitle : 459 Fitzgerald St
             * venue_image :
             * venue_logo :
             * venue_distance : 3
             * venue_latitude : 8.5606437899679
             * venue_longitude : 76.881033734286
             * is_user_checked_in : false
             * venue_user_description : Because you listened to:
             Django Django,Peanuts Wilson,Jake Bugg
             */

            private int venue_id;
            private String venue_name;
            private String venue_subtitle;
            private String venue_image;
            private String venue_logo;
            private int venue_distance;
            private double venue_latitude;
            private double venue_longitude;
            private boolean is_user_checked_in;
            private String venue_user_description;

            public int getVenue_id() {
                return venue_id;
            }

            public void setVenue_id(int venue_id) {
                this.venue_id = venue_id;
            }

            public String getVenue_name() {
                return venue_name;
            }

            public void setVenue_name(String venue_name) {
                this.venue_name = venue_name;
            }

            public String getVenue_subtitle() {
                return venue_subtitle;
            }

            public void setVenue_subtitle(String venue_subtitle) {
                this.venue_subtitle = venue_subtitle;
            }

            public String getVenue_image() {
                return venue_image;
            }

            public void setVenue_image(String venue_image) {
                this.venue_image = venue_image;
            }

            public String getVenue_logo() {
                return venue_logo;
            }

            public void setVenue_logo(String venue_logo) {
                this.venue_logo = venue_logo;
            }

            public int getVenue_distance() {
                return venue_distance;
            }

            public void setVenue_distance(int venue_distance) {
                this.venue_distance = venue_distance;
            }

            public double getVenue_latitude() {
                return venue_latitude;
            }

            public void setVenue_latitude(double venue_latitude) {
                this.venue_latitude = venue_latitude;
            }

            public double getVenue_longitude() {
                return venue_longitude;
            }

            public void setVenue_longitude(double venue_longitude) {
                this.venue_longitude = venue_longitude;
            }

            public boolean isIs_user_checked_in() {
                return is_user_checked_in;
            }

            public void setIs_user_checked_in(boolean is_user_checked_in) {
                this.is_user_checked_in = is_user_checked_in;
            }

            public String getVenue_user_description() {
                return venue_user_description;
            }

            public void setVenue_user_description(String venue_user_description) {
                this.venue_user_description = venue_user_description;
            }
        }
    }
}
