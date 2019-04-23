import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
   public static void main(String[] args) throws Exception {
      ByteArrayOutputStream baos = null;
      BufferedOutputStream bos = null;
		
      try {
         // create new ByteArrayOutputStream
         baos = new ByteArrayOutputStream();

         // create new BufferedOutputStream with baos
         bos = new BufferedOutputStream(baos);
			
         // assign integer
         int a = 27;
         int b = 87;

         // write to stream
         bos.write(b);
         bos.write(b);

         // force the byte to be written to baos
         bos.flush();
         bos.write(a);
         bos.write(b);
         bos.flush();
         bos.write(b);
			
         // convert ByteArrayOutputStream to bytes
         byte[] bytes = baos.toByteArray();	

         // prints the byte
         System.out.println(bytes[0]);
         System.out.println(bytes[1]);
         System.out.println(bytes[bytes.length-1]);
         System.out.println(bytes.length);
         
      } catch(IOException e) {
         // if I/O error occurs.
         e.printStackTrace();
      } finally {
         // releases any system resources associated with the stream
         if(baos!=null)
            baos.close();
         if(bos!=null)
            bos.close();
      }
   }
}