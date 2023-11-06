package basics.staticVariables;

import basics.separateFileClass.UserDetails;

import java.util.Date;

public class File {
    int absolutePath;
    int size;
    Date dateOfCreation;
    static int countOfObjects = 0;
    File(){
        countOfObjects++;
    }
    public static void main(String[] args) {
        File f1 = new File();
        System.out.println(countOfObjects);
        File f2 = new File();
        System.out.println(File.countOfObjects);
        UserDetails userDetails = new UserDetails();
    }
}
