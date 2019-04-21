package com.apple.pattern.singleton.hungrySingleton;

import com.apple.pattern.singleton.lazySimpleSingleton.NSSerializableSingleton;
import org.junit.Test;

import java.io.*;

public class NSSerializableSingletonTest {

    public static void main(String[] args) {
        NSSerializableSingleton s1 = null;
        NSSerializableSingleton s2 = NSSerializableSingleton.getInstance();

        try {
            FileOutputStream fos = new FileOutputStream(new File("NSSerializableSingleton.obj"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("NSSerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (NSSerializableSingleton) ois.readObject();
            ois.close();
            fis.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
