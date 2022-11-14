import java.lang.*;
import java.io.*;

public class Run_C_by_Java {
    public static void main(String args[]) throws Exception {
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "g++ 123.cpp && .\\a.exe");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = "1\n2\n3\n4\n5";
        System.out.println(line);
        // while (true) {
        // line = r.readLine();
        // if (line == null) {
        // break;
        // }
        // System.out.println(line);
        // }
    }
}
