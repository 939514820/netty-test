import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test {
    static private final byte messgae[]={83,111,109,101,32,98,121,116,101,115,46};
    public static void main(String[] args) {
        try {
            FileOutputStream fout=new FileOutputStream("test.txt");
            FileChannel channel = fout.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            for(int i=0;i<messgae.length;++i){
               buffer.put(messgae[i]);
            }
            buffer.flip();
            channel.write(buffer);
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("==========");
    }
}
