package com.example.mg.masterdetail.data.model;

import com.google.gson.Gson;

public class WeatherModel {


    /**
     * response : {"version":"0.1","termsofService":"http://www.wunderground.com/weather/api/d/terms.html","features":{"conditions":1}}
     * current_observation : {"image":{"url":"http://icons.wxug.com/graphics/wu2/logo_130x80.png","title":"Weather Underground","link":"http://www.wunderground.com"},"display_location":{"full":"Cairo, Egypt","CITY":"Cairo","state":"KB","state_name":"Egypt","COUNTRY":"EG","country_iso3166":"EG","zip":"00000","magic":"1","wmo":"62375","latitude":"30.05999947","longitude":"31.25000000","elevation":"60.0"},"observation_location":{"full":"Cairo, ","CITY":"Cairo","state":"","COUNTRY":"EG","country_iso3166":"EG","latitude":"30.04","longitude":"31.24","elevation":"157 ft"},"estimated":{},"station_id":"ICAIRO11","observation_time":"Last Updated on May 12, 6:33 PM EET","observation_time_rfc822":"Sat, 12 May 2018 18:33:38 +0200","observation_epoch":"1526142818","local_time_rfc822":"Sat, 12 May 2018 18:33:57 +0200","local_epoch":"1526142837","local_tz_short":"EET","local_tz_long":"Africa/Cairo","local_tz_offset":"+0200","weather":"Mostly Cloudy","temperature_string":"79.2 F (26.2 C)","temp_f":79.2,"temp_c":26.2,"relative_humidity":"48%","wind_string":"From the North at 3.2 MPH","wind_dir":"North","wind_degrees":360,"wind_mph":3.2,"wind_gust_mph":0,"wind_kph":5.1,"wind_gust_kph":0,"pressure_mb":"1010","pressure_in":"29.83","pressure_trend":"0","dewpoint_string":"58 F (14 C)","dewpoint_f":58,"dewpoint_c":14,"heat_index_string":"NA","heat_index_f":"NA","heat_index_c":"NA","windchill_string":"NA","windchill_f":"NA","windchill_c":"NA","feelslike_string":"79.2 F (27 C)","feelslike_f":"79.2","feelslike_c":"27","visibility_mi":"6.2","visibility_km":"10.0","solarradiation":"--","UV":"0","precip_1hr_string":"-999.00 in ( 0 mm)","precip_1hr_in":"-999.00","precip_1hr_metric":" 0","precip_today_string":"0.00 in (0 mm)","precip_today_in":"0.00","precip_today_metric":"0","icon":"mostlycloudy","icon_url":"http://icons.wxug.com/i/c/k/mostlycloudy.gif","forecast_url":"http://www.wunderground.com/global/stations/62375.html","history_url":"http://www.wunderground.com/weatherstation/WXDailyHistory.asp?ID=ICAIRO11","ob_url":"http://www.wunderground.com/cgi-bin/findweather/getForecast?query=30.035122,31.237038","nowcast":""}
     */

    private ResponseBean response;
    private CurrentObservationBean current_observation;

    public static WeatherModel objectFromData(String str) {

        return new Gson().fromJson(str, WeatherModel.class);
    }

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public CurrentObservationBean getCurrent_observation() {
        return current_observation;
    }

    public void setCurrent_observation(CurrentObservationBean current_observation) {
        this.current_observation = current_observation;
    }

    public static class ResponseBean {
        /**
         * version : 0.1
         * termsofService : http://www.wunderground.com/weather/api/d/terms.html
         * features : {"conditions":1}
         */

        private String version;
        private String termsofService;
        private FeaturesBean features;

        public static ResponseBean objectFromData(String str) {

            return new Gson().fromJson(str, ResponseBean.class);
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getTermsofService() {
            return termsofService;
        }

        public void setTermsofService(String termsofService) {
            this.termsofService = termsofService;
        }

        public FeaturesBean getFeatures() {
            return features;
        }

        public void setFeatures(FeaturesBean features) {
            this.features = features;
        }

        public static class FeaturesBean {
            /**
             * conditions : 1
             */

            private int conditions;

            public static FeaturesBean objectFromData(String str) {

                return new Gson().fromJson(str, FeaturesBean.class);
            }

            public int getConditions() {
                return conditions;
            }

            public void setConditions(int conditions) {
                this.conditions = conditions;
            }
        }
    }

    public static class CurrentObservationBean {
        /**
         * image : {"url":"http://icons.wxug.com/graphics/wu2/logo_130x80.png","title":"Weather Underground","link":"http://www.wunderground.com"}
         * display_location : {"full":"Cairo, Egypt","CITY":"Cairo","state":"KB","state_name":"Egypt","COUNTRY":"EG","country_iso3166":"EG","zip":"00000","magic":"1","wmo":"62375","latitude":"30.05999947","longitude":"31.25000000","elevation":"60.0"}
         * observation_location : {"full":"Cairo, ","CITY":"Cairo","state":"","COUNTRY":"EG","country_iso3166":"EG","latitude":"30.04","longitude":"31.24","elevation":"157 ft"}
         * estimated : {}
         * station_id : ICAIRO11
         * observation_time : Last Updated on May 12, 6:33 PM EET
         * observation_time_rfc822 : Sat, 12 May 2018 18:33:38 +0200
         * observation_epoch : 1526142818
         * local_time_rfc822 : Sat, 12 May 2018 18:33:57 +0200
         * local_epoch : 1526142837
         * local_tz_short : EET
         * local_tz_long : Africa/Cairo
         * local_tz_offset : +0200
         * weather : Mostly Cloudy
         * temperature_string : 79.2 F (26.2 C)
         * temp_f : 79.2
         * temp_c : 26.2
         * relative_humidity : 48%
         * wind_string : From the North at 3.2 MPH
         * wind_dir : North
         * wind_degrees : 360
         * wind_mph : 3.2
         * wind_gust_mph : 0
         * wind_kph : 5.1
         * wind_gust_kph : 0
         * pressure_mb : 1010
         * pressure_in : 29.83
         * pressure_trend : 0
         * dewpoint_string : 58 F (14 C)
         * dewpoint_f : 58
         * dewpoint_c : 14
         * heat_index_string : NA
         * heat_index_f : NA
         * heat_index_c : NA
         * windchill_string : NA
         * windchill_f : NA
         * windchill_c : NA
         * feelslike_string : 79.2 F (27 C)
         * feelslike_f : 79.2
         * feelslike_c : 27
         * visibility_mi : 6.2
         * visibility_km : 10.0
         * solarradiation : --
         * UV : 0
         * precip_1hr_string : -999.00 in ( 0 mm)
         * precip_1hr_in : -999.00
         * precip_1hr_metric :  0
         * precip_today_string : 0.00 in (0 mm)
         * precip_today_in : 0.00
         * precip_today_metric : 0
         * icon : mostlycloudy
         * icon_url : http://icons.wxug.com/i/c/k/mostlycloudy.gif
         * forecast_url : http://www.wunderground.com/global/stations/62375.html
         * history_url : http://www.wunderground.com/weatherstation/WXDailyHistory.asp?ID=ICAIRO11
         * ob_url : http://www.wunderground.com/cgi-bin/findweather/getForecast?query=30.035122,31.237038
         * nowcast :
         */

        private ImageBean image;
        private DisplayLocationBean display_location;
        private ObservationLocationBean observation_location;
        private EstimatedBean estimated;
        private String station_id;
        private String observation_time;
        private String observation_time_rfc822;
        private String observation_epoch;
        private String local_time_rfc822;
        private String local_epoch;
        private String local_tz_short;
        private String local_tz_long;
        private String local_tz_offset;
        private String weather;
        private String temperature_string;
        private double temp_f;
        private double temp_c;
        private String relative_humidity;
        private String wind_string;
        private String wind_dir;
        private int wind_degrees;
        private double wind_mph;
        private String wind_gust_mph;
        private double wind_kph;
        private String wind_gust_kph;
        private String pressure_mb;
        private String pressure_in;
        private String pressure_trend;
        private String dewpoint_string;
        private int dewpoint_f;
        private int dewpoint_c;
        private String heat_index_string;
        private String heat_index_f;
        private String heat_index_c;
        private String windchill_string;
        private String windchill_f;
        private String windchill_c;
        private String feelslike_string;
        private String feelslike_f;
        private String feelslike_c;
        private String visibility_mi;
        private String visibility_km;
        private String solarradiation;
        private String UV;
        private String precip_1hr_string;
        private String precip_1hr_in;
        private String precip_1hr_metric;
        private String precip_today_string;
        private String precip_today_in;
        private String precip_today_metric;
        private String icon;
        private String icon_url;
        private String forecast_url;
        private String history_url;
        private String ob_url;
        private String nowcast;

        public static CurrentObservationBean objectFromData(String str) {

            return new Gson().fromJson(str, CurrentObservationBean.class);
        }

        public ImageBean getImage() {
            return image;
        }

        public void setImage(ImageBean image) {
            this.image = image;
        }

        public DisplayLocationBean getDisplay_location() {
            return display_location;
        }

        public void setDisplay_location(DisplayLocationBean display_location) {
            this.display_location = display_location;
        }

        public ObservationLocationBean getObservation_location() {
            return observation_location;
        }

        public void setObservation_location(ObservationLocationBean observation_location) {
            this.observation_location = observation_location;
        }

        public EstimatedBean getEstimated() {
            return estimated;
        }

        public void setEstimated(EstimatedBean estimated) {
            this.estimated = estimated;
        }

        public String getStation_id() {
            return station_id;
        }

        public void setStation_id(String station_id) {
            this.station_id = station_id;
        }

        public String getObservation_time() {
            return observation_time;
        }

        public void setObservation_time(String observation_time) {
            this.observation_time = observation_time;
        }

        public String getObservation_time_rfc822() {
            return observation_time_rfc822;
        }

        public void setObservation_time_rfc822(String observation_time_rfc822) {
            this.observation_time_rfc822 = observation_time_rfc822;
        }

        public String getObservation_epoch() {
            return observation_epoch;
        }

        public void setObservation_epoch(String observation_epoch) {
            this.observation_epoch = observation_epoch;
        }

        public String getLocal_time_rfc822() {
            return local_time_rfc822;
        }

        public void setLocal_time_rfc822(String local_time_rfc822) {
            this.local_time_rfc822 = local_time_rfc822;
        }

        public String getLocal_epoch() {
            return local_epoch;
        }

        public void setLocal_epoch(String local_epoch) {
            this.local_epoch = local_epoch;
        }

        public String getLocal_tz_short() {
            return local_tz_short;
        }

        public void setLocal_tz_short(String local_tz_short) {
            this.local_tz_short = local_tz_short;
        }

        public String getLocal_tz_long() {
            return local_tz_long;
        }

        public void setLocal_tz_long(String local_tz_long) {
            this.local_tz_long = local_tz_long;
        }

        public String getLocal_tz_offset() {
            return local_tz_offset;
        }

        public void setLocal_tz_offset(String local_tz_offset) {
            this.local_tz_offset = local_tz_offset;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getTemperature_string() {
            return temperature_string;
        }

        public void setTemperature_string(String temperature_string) {
            this.temperature_string = temperature_string;
        }

        public double getTemp_f() {
            return temp_f;
        }

        public void setTemp_f(double temp_f) {
            this.temp_f = temp_f;
        }

        public double getTemp_c() {
            return temp_c;
        }

        public void setTemp_c(double temp_c) {
            this.temp_c = temp_c;
        }

        public String getRelative_humidity() {
            return relative_humidity;
        }

        public void setRelative_humidity(String relative_humidity) {
            this.relative_humidity = relative_humidity;
        }

        public String getWind_string() {
            return wind_string;
        }

        public void setWind_string(String wind_string) {
            this.wind_string = wind_string;
        }

        public String getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(String wind_dir) {
            this.wind_dir = wind_dir;
        }

        public int getWind_degrees() {
            return wind_degrees;
        }

        public void setWind_degrees(int wind_degrees) {
            this.wind_degrees = wind_degrees;
        }

        public double getWind_mph() {
            return wind_mph;
        }

        public void setWind_mph(double wind_mph) {
            this.wind_mph = wind_mph;
        }

        public String getWind_gust_mph() {
            return wind_gust_mph;
        }

        public void setWind_gust_mph(String wind_gust_mph) {
            this.wind_gust_mph = wind_gust_mph;
        }

        public double getWind_kph() {
            return wind_kph;
        }

        public void setWind_kph(double wind_kph) {
            this.wind_kph = wind_kph;
        }

        public String getWind_gust_kph() {
            return wind_gust_kph;
        }

        public void setWind_gust_kph(String wind_gust_kph) {
            this.wind_gust_kph = wind_gust_kph;
        }

        public String getPressure_mb() {
            return pressure_mb;
        }

        public void setPressure_mb(String pressure_mb) {
            this.pressure_mb = pressure_mb;
        }

        public String getPressure_in() {
            return pressure_in;
        }

        public void setPressure_in(String pressure_in) {
            this.pressure_in = pressure_in;
        }

        public String getPressure_trend() {
            return pressure_trend;
        }

        public void setPressure_trend(String pressure_trend) {
            this.pressure_trend = pressure_trend;
        }

        public String getDewpoint_string() {
            return dewpoint_string;
        }

        public void setDewpoint_string(String dewpoint_string) {
            this.dewpoint_string = dewpoint_string;
        }

        public int getDewpoint_f() {
            return dewpoint_f;
        }

        public void setDewpoint_f(int dewpoint_f) {
            this.dewpoint_f = dewpoint_f;
        }

        public int getDewpoint_c() {
            return dewpoint_c;
        }

        public void setDewpoint_c(int dewpoint_c) {
            this.dewpoint_c = dewpoint_c;
        }

        public String getHeat_index_string() {
            return heat_index_string;
        }

        public void setHeat_index_string(String heat_index_string) {
            this.heat_index_string = heat_index_string;
        }

        public String getHeat_index_f() {
            return heat_index_f;
        }

        public void setHeat_index_f(String heat_index_f) {
            this.heat_index_f = heat_index_f;
        }

        public String getHeat_index_c() {
            return heat_index_c;
        }

        public void setHeat_index_c(String heat_index_c) {
            this.heat_index_c = heat_index_c;
        }

        public String getWindchill_string() {
            return windchill_string;
        }

        public void setWindchill_string(String windchill_string) {
            this.windchill_string = windchill_string;
        }

        public String getWindchill_f() {
            return windchill_f;
        }

        public void setWindchill_f(String windchill_f) {
            this.windchill_f = windchill_f;
        }

        public String getWindchill_c() {
            return windchill_c;
        }

        public void setWindchill_c(String windchill_c) {
            this.windchill_c = windchill_c;
        }

        public String getFeelslike_string() {
            return feelslike_string;
        }

        public void setFeelslike_string(String feelslike_string) {
            this.feelslike_string = feelslike_string;
        }

        public String getFeelslike_f() {
            return feelslike_f;
        }

        public void setFeelslike_f(String feelslike_f) {
            this.feelslike_f = feelslike_f;
        }

        public String getFeelslike_c() {
            return feelslike_c;
        }

        public void setFeelslike_c(String feelslike_c) {
            this.feelslike_c = feelslike_c;
        }

        public String getVisibility_mi() {
            return visibility_mi;
        }

        public void setVisibility_mi(String visibility_mi) {
            this.visibility_mi = visibility_mi;
        }

        public String getVisibility_km() {
            return visibility_km;
        }

        public void setVisibility_km(String visibility_km) {
            this.visibility_km = visibility_km;
        }

        public String getSolarradiation() {
            return solarradiation;
        }

        public void setSolarradiation(String solarradiation) {
            this.solarradiation = solarradiation;
        }

        public String getUV() {
            return UV;
        }

        public void setUV(String UV) {
            this.UV = UV;
        }

        public String getPrecip_1hr_string() {
            return precip_1hr_string;
        }

        public void setPrecip_1hr_string(String precip_1hr_string) {
            this.precip_1hr_string = precip_1hr_string;
        }

        public String getPrecip_1hr_in() {
            return precip_1hr_in;
        }

        public void setPrecip_1hr_in(String precip_1hr_in) {
            this.precip_1hr_in = precip_1hr_in;
        }

        public String getPrecip_1hr_metric() {
            return precip_1hr_metric;
        }

        public void setPrecip_1hr_metric(String precip_1hr_metric) {
            this.precip_1hr_metric = precip_1hr_metric;
        }

        public String getPrecip_today_string() {
            return precip_today_string;
        }

        public void setPrecip_today_string(String precip_today_string) {
            this.precip_today_string = precip_today_string;
        }

        public String getPrecip_today_in() {
            return precip_today_in;
        }

        public void setPrecip_today_in(String precip_today_in) {
            this.precip_today_in = precip_today_in;
        }

        public String getPrecip_today_metric() {
            return precip_today_metric;
        }

        public void setPrecip_today_metric(String precip_today_metric) {
            this.precip_today_metric = precip_today_metric;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getIcon_url() {
            return icon_url;
        }

        public void setIcon_url(String icon_url) {
            this.icon_url = icon_url;
        }

        public String getForecast_url() {
            return forecast_url;
        }

        public void setForecast_url(String forecast_url) {
            this.forecast_url = forecast_url;
        }

        public String getHistory_url() {
            return history_url;
        }

        public void setHistory_url(String history_url) {
            this.history_url = history_url;
        }

        public String getOb_url() {
            return ob_url;
        }

        public void setOb_url(String ob_url) {
            this.ob_url = ob_url;
        }

        public String getNowcast() {
            return nowcast;
        }

        public void setNowcast(String nowcast) {
            this.nowcast = nowcast;
        }

        public static class ImageBean {
            /**
             * url : http://icons.wxug.com/graphics/wu2/logo_130x80.png
             * title : Weather Underground
             * link : http://www.wunderground.com
             */

            private String url;
            private String title;
            private String link;

            public static ImageBean objectFromData(String str) {

                return new Gson().fromJson(str, ImageBean.class);
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }

        public static class DisplayLocationBean {
            /**
             * full : Cairo, Egypt
             * CITY : Cairo
             * state : KB
             * state_name : Egypt
             * COUNTRY : EG
             * country_iso3166 : EG
             * zip : 00000
             * magic : 1
             * wmo : 62375
             * latitude : 30.05999947
             * longitude : 31.25000000
             * elevation : 60.0
             */

            private String full;
            private String city;
            private String state;
            private String state_name;
            private String country;
            private String country_iso3166;
            private String zip;
            private String magic;
            private String wmo;
            private String latitude;
            private String longitude;
            private String elevation;

            public static DisplayLocationBean objectFromData(String str) {

                return new Gson().fromJson(str, DisplayLocationBean.class);
            }

            public String getFull() {
                return full;
            }

            public void setFull(String full) {
                this.full = full;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getState_name() {
                return state_name;
            }

            public void setState_name(String state_name) {
                this.state_name = state_name;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getCountry_iso3166() {
                return country_iso3166;
            }

            public void setCountry_iso3166(String country_iso3166) {
                this.country_iso3166 = country_iso3166;
            }

            public String getZip() {
                return zip;
            }

            public void setZip(String zip) {
                this.zip = zip;
            }

            public String getMagic() {
                return magic;
            }

            public void setMagic(String magic) {
                this.magic = magic;
            }

            public String getWmo() {
                return wmo;
            }

            public void setWmo(String wmo) {
                this.wmo = wmo;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getElevation() {
                return elevation;
            }

            public void setElevation(String elevation) {
                this.elevation = elevation;
            }
        }

        public static class ObservationLocationBean {
            public static ObservationLocationBean objectFromData(String str) {

                return new Gson().fromJson(str, ObservationLocationBean.class);
            }
        }

        public static class EstimatedBean {
            public static EstimatedBean objectFromData(String str) {

                return new Gson().fromJson(str, EstimatedBean.class);
            }
        }
    }
}
