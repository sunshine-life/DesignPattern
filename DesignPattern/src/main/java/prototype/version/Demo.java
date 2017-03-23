package prototype.version;

/**
 * 仅展示复制原有实例
 */
public class Demo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Model model = new Model("a","b");
        for(int i=0;i<10000000;i++){
            Model  clone  =  new Model();
            clone.value1 = "a"+i;
            clone.value2 = "b"+i;
        }
        long end_a = System.currentTimeMillis();
        System.out.println(end_a-start);
        for(int i=0;i<10000000;i++){
            Model  clone  =  model.clone();
            clone.value1 = "a"+i;
            clone.value2 = "b"+i;
        }
        long end_b = System.currentTimeMillis();
        System.out.println(end_b-end_a);


    }



    public static class Model implements Cloneable{

        Model(){}
        Model(String value1, String value2){
            this.value1 = value1;
            this.value2 = value2;
        }

        String value1;
        String value2;

        @Override
        public Model clone(){
            Model model = null;
            try{
                model = (Model)super.clone();
            }catch (CloneNotSupportedException e){
                e.printStackTrace();
            }
            return model;
        }

        @Override
        public String toString() {
            return "Model{" +
                    "value1='" + value1 + '\'' +
                    ", value2='" + value2 + '\'' +
                    '}';
        }
    }

}
