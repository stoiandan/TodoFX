package local.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EventSerializer {

    private final static String DATA_PATH = "data.bin";

    public static void serailize(Object[] events) throws IOException
    {
        try(var serilizer = new ObjectOutputStream(new FileOutputStream(DATA_PATH)))
        {
            serilizer.writeObject(events);
        }
    }
    
    public static Object[] deserialize() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        try(var deserializer = new ObjectInputStream(new FileInputStream(DATA_PATH)))
        {
            return (Object[]) deserializer.readObject();
        }
    }
}
