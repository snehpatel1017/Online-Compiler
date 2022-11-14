import java.lang.*;

public class run_c {
    public static void main() {
        try {
            // We are running "dir" and "ping" command on cmd
            Runtime.getRuntime().exec("cmd /c cmd.exe /K \"dir && ping localhost\"");
        } catch (Exception e) {
            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
            e.printStackTrace();
        }
    }
}