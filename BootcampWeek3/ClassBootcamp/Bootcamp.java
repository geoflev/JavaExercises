import java.time.LocalDate;
import java.util.Objects;

public class Bootcamp {

    private String name;
    private LocalDate startingDate;
    private LocalDate endingDate;



    public Bootcamp(String name, LocalDate startingDate, LocalDate endingDate) {
        this.name = name;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "name='" + name + '\'' +
                ", startingDate=" + startingDate +
                ", endingDate=" + endingDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return name.equals(bootcamp.name) &&
                startingDate.equals(bootcamp.startingDate) &&
                endingDate.equals(bootcamp.endingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startingDate, endingDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }
}

//    Create a new program to exercise with LocalDates.
//        Create a class BootCamp.
//        This class has 3 variables
//        name: String
//        startingDate: LocalDate
//        endingDate: LocalDate
//        The program should ask the user to create three Bootcamps.
//        Ask for name, startingDate and endingDate for each one from the user (keyboard).
//        Store these Bootcamps in a list.
//        Then ask the user to enter a date. Check if a bootcamp will be available in that date and inform the user accordingly.
//        For example, if the user enters 10/10/2020 and a bootcamp is available, then the program should print a message:
//        Bootcamp SQL will be available in 10 Oct 2020. It starts 01 Oct 2020 and ends 30 Nov 2020.
//        Otherwise, the message will be: Sorry no bootcamp available in X date.
//        ***Catch any exceptions that might occur. Accepts only Dates in the format dd/MM/yyyy.
//        ***Try to use methods.