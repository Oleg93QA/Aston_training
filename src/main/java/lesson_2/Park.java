package lesson_2;

public class Park {
    private String namePark;
    private String cityPark;
    private String CountryPark;

    public String getNamePark() {
        return namePark;
    }

    public void setNamePark(String namePark) {
        this.namePark = namePark;
    }

    public String getCityPark() {
        return cityPark;
    }

    public void setCityPark(String cityPark) {
        this.cityPark = cityPark;
    }

    public String getCountryPark() {
        return CountryPark;
    }

    public void setCountryPark(String countryPark) {
        CountryPark = countryPark;
    }

    public Park(String namePark, String cityPark, String countryPark) {
        this.namePark = namePark;
        this.cityPark = cityPark;
        CountryPark = countryPark;
    }

    public class Attraction {
        private String nameAttraction;
        private int open;
        private int close;
        private int price;

        public String getNameAttraction() {
            return nameAttraction;
        }

        public void setNameAttraction(String nameAttraction) {
            this.nameAttraction = nameAttraction;
        }

        public int getOpen() {
            return open;
        }

        public void setOpen(int open) {
            this.open = open;
        }

        public int getClose() {
            return close;
        }

        public void setClose(int close) {
            this.close = close;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public Attraction(String nameAttraction, int open, int close, int price) {
            this.nameAttraction = nameAttraction;
            this.open = open;
            this.close = close;
            this.price = price;
        }
// переопределение нужно для того что бы в консоль не выводился ответ типа - lesson_2.Park$Attraction@4157f54e
        @Override
        public String toString() {
            return nameAttraction + open + close + price;
        }

    }


}
