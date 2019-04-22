package com.apple.pattern.singleton.hungrySingleton;

import java.io.*;

public class NSHungryEnumSingletonTest {
    public static void main(String[] args) {
        NSHungryEnumSingleton s1;
        NSHungryEnumSingleton s2 = NSHungryEnumSingleton.INSTANCE;

        try {
            FileOutputStream fos = new FileOutputStream(new File("NSSerializableSingleton.obj"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("NSSerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (NSHungryEnumSingleton) ois.readObject();
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
