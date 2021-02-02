package zaffora;

public class Apps {
    String url;
    String ID;
    String name, subtitle, icon_url;
    String average_user_rating, user_rating_count, price, in_app_purchases;
    String description, developer, age, languages;
    String size;
    String primary_Genre, genres, original_Release_Date, current_Version_Release_Date;

    public Apps(){}

    public Apps(String url, String ID, String name, String subtitle, String icon_url, String average_user_rating, String user_rating_count, String price, String in_app_purchases, String description, String developer, String age, String languages, String size, String primary_Genre, String genres, String original_Release_Date, String current_Version_Release_Date) {
        this.url = url;
        this.ID = ID;
        this.name = name;
        this.subtitle = subtitle;
        this.icon_url = icon_url;
        this.average_user_rating = average_user_rating;
        this.user_rating_count = user_rating_count;
        this.price = price;
        this.in_app_purchases = in_app_purchases;
        this.description = description;
        this.developer = developer;
        this.age = age;
        this.languages = languages;
        this.size = size;
        this.primary_Genre = primary_Genre;
        this.genres = genres;
        this.original_Release_Date = original_Release_Date;
        this.current_Version_Release_Date = current_Version_Release_Date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getAverage_user_rating() {
        return average_user_rating;
    }

    public void setAverage_user_rating(String average_user_rating) {
        this.average_user_rating = average_user_rating;
    }

    public String getUser_rating_count() {
        return user_rating_count;
    }

    public void setUser_rating_count(String user_rating_count) {
        this.user_rating_count = user_rating_count;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIn_app_purchases() {
        return in_app_purchases;
    }

    public void setIn_app_purchases(String in_app_purchases) {
        this.in_app_purchases = in_app_purchases;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrimary_Genre() {
        return primary_Genre;
    }

    public void setPrimary_Genre(String primary_Genre) {
        this.primary_Genre = primary_Genre;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getOriginal_Release_Date() {
        return original_Release_Date;
    }

    public void setOriginal_Release_Date(String original_Release_Date) {
        this.original_Release_Date = original_Release_Date;
    }

    public String getCurrent_Version_Release_Date() {
        return current_Version_Release_Date;
    }

    public void setCurrent_Version_Release_Date(String current_Version_Release_Date) {
        this.current_Version_Release_Date = current_Version_Release_Date;
    }

    @Override
    public String toString() {
        return "Apps{" +
                "url='" + url + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", icon_url='" + icon_url + '\'' +
                ", average_user_rating=" + average_user_rating +
                ", user_rating_count=" + user_rating_count +
                ", price=" + price +
                ", in_app_purchases=" + in_app_purchases +
                ", description='" + description + '\'' +
                ", developer='" + developer + '\'' +
                ", age='" + age + '\'' +
                ", languages='" + languages + '\'' +
                ", size=" + size +
                ", primary_Genre='" + primary_Genre + '\'' +
                ", genres='" + genres + '\'' +
                ", original_Release_Date='" + original_Release_Date + '\'' +
                ", current_Version_Release_Date='" + current_Version_Release_Date + '\'' +
                '}';
    }
}
