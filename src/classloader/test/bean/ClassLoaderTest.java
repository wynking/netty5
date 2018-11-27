package classloader.test.bean;  

public class ClassLoaderTest {  

    public static void main(String[] args) {  
        try {  
          /*  //查看当前系统类路径中包含的路径条目  我是分支。。。。
            System.out.println(System.getProperty("java.class.path"));  
            //调用加载当前类的类加载器（这里即为系统类加载器）加载TestBean  
            Class typeLoaded = Class.forName("classloader.test.bean.TestBean");  
            //查看被加载的TestBean类型是被那个类加载器加载的  
            System.out.println(typeLoaded.getClassLoader());
            

            String str = (String) Class.forName("java.lang.String").newInstance();*/
            
            
            MyClassLoader mcl = new MyClassLoader();        
            Class<?> c1 = Class.forName("java.langs.String", true, mcl); 
            java.langs.String obj = (java.langs.String) c1.newInstance();
            System.out.println(obj.AAA);
            System.out.println(obj.getClass().getClassLoader());
            
            //System.out.println(str.AAA);
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}