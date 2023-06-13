package com.movie;

public class Movie {
    private String movieName;
    private String releaseDate;
    private double productionCost;
    private int noOfScreensReleased;
    private String directedBy;
    private String producedBy;
    private boolean status;

    public Movie(String movieName, String releaseDate, boolean status) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.status = status;
    }

    public Movie(String movieName, String directedBy, double productionCost) {
        this.movieName = movieName;
        this.directedBy = directedBy;
        this.productionCost = productionCost;
    }

    public Movie() {
        // Default constructor
    }

    // Getters and setters
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getNoOfScreensReleased() {
        return noOfScreensReleased;
    }

    public void setNoOfScreensReleased(int noOfScreensReleased) {
        this.noOfScreensReleased = noOfScreensReleased;
    }

    public String getDirectedBy() {
        return directedBy;
    }

    public void setDirectedBy(String directedBy) {
        this.directedBy = directedBy;
    }

    public String getProducedBy() {
        return producedBy;
    }

    public void setProducedBy(String producedBy) {
        this.producedBy = producedBy;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Overloaded getMovie methods
    //public static ArrayList<Movie> getMovie(String releaseDate) {
        // Implementation to retrieve movies released on the given date from the database
    //}

    //public static ArrayList<Movie> getMovie(boolean status) {
        // Implementation to retrieve movies with the given status from the database
    //}

    //public static ArrayList<Movie> getMovie(double productionCost) {
        // Implementation to retrieve movies with production cost more than 100 crores from the database
    //}
}

