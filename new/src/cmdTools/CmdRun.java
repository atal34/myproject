package cmdTools;

import java.io.*;
import javax.swing.JOptionPane;

public class CmdRun {
    public static void main(String[] args) throws Exception {
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd \"C:\\Users\" && net start");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        int flag = 0;
        String output;
        while (true) {
        	output = r.readLine();
            if (output == null) { break; }
            System.out.println(output);
            if(output.contains("Apache Tomcat")){
            	System.out.println("Tomcat is running!!");
            	JOptionPane.showMessageDialog(null, "Tomcat is running!!", "Success", JOptionPane.OK_OPTION);
            	flag = 1;
            	break;
            }
        }
        if(flag == 0){
        	System.out.println("Tomcat is not running!!");
        	String msg = EmailEngine.sendMail("Tomcat not running");
        	JOptionPane.showMessageDialog(null, "Tomcat is not running!!", "Success", JOptionPane.OK_OPTION);
        }
    }
}
