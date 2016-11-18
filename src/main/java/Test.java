import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by Leo on 2016/11/18.
 */
public class Test {
    public static void main(String args[]){
        Webcam webcam=Webcam.getDefault();
        if (webcam!=null){
            webcam.open();

            try {
                ImageIO.write(webcam.getImage(),"PNG",new File("HelloWorld.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("webcam is null");
        }

    }
}
