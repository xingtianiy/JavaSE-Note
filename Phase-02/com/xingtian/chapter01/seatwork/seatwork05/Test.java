package com.xingtian.chapter01.seatwork.seatwork05;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 14:18
 * @Description: 测试学生信息管理功能
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 任务描述：
         * 1. 定义一个长度为3的数组，存储1~3名学生对象作为初始数据，学生对象的学号、姓名各不相同。
         * 2. 添加新学生时，判断学号是否唯一。
         * 3. 添加完毕后，遍历所有学生信息。
         * 4. 通过学号删除学生信息，如果存在则删除，否则提示删除失败。
         * 5. 删除完毕后，再次遍历所有学生信息。
         * 6. 查询学号为"1"的学生，如果存在，则将其年龄加1岁。
         */

        // 1. 创建一个数组用来存储学生对象
        Student[] arr = new Student[3];

        // 2. 创建学生对象并添加到数组中
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        // Student stu3 = new Student(3, "wangwu", 25);

        // 3. 把学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        // arr[2] = stu3;

        // 要求1：再次添加一个学生对象，并在添加时进行学号的性唯一判断
        Student stu4 = new Student(4, "zhaoliu", 26);

        // 唯一性判断
        // 已存在 --- 不用添加
        // 不存在 --- 就可以把学生对象添加进数组
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            // 已存在 --- 不用添加
            System.out.println("当前id重复，请修改id后再进行添加");
        } else {
            // 不存在 --- 就可以把学生对象添加进数组
            // 1. 数组已经存满 --- 只能创建一个新的数组，新数组的长度=老数组长度+1
            // 2. 数组没有存满 --- 直接添加
            int count = getCount(arr); // 获取当前数组中已有的学生数量
            if (count == arr.length) {
                // 已经存满
                // 创建一个数组新，长度为老数组长度+1
                Student[] newArr = creatNewArr(arr);
                // 把stu4添加进去
                newArr[count] = stu4;

                // 要求2：添加完毕后，遍历所有学生信息
                printArr(newArr);
            } else {
                // 没有存满
                // [stu1, stu2, null]
                // getCount获取到的是2，数组表示中已经有2个元素
                // 还有一层意思：如果下一次要添加数据，就是添加到索引2的位置
                arr[count] = stu4;
                printArr(arr);
            }
        }

        // 要求3：通过id删除学生信息
        boolean delete = delete(arr, stu1.getId());
        if (delete) {
            System.out.println("删除成功");
            System.out.println("删除后的数组");
            printArr(arr);
        } else {
            System.out.println("删除失败");
        }

        System.out.println("=========================");

        // 要求5：查询学号为"1"的学生，如果存在，则将其年龄+1岁
        boolean findId = findId(arr, stu2.getId());
        if (findId) {
            System.out.println("修改成功");
            System.out.println("修改后的数组");
            printArr(arr);
        } else {
            System.out.println("修改失败");
        }
    }

    /**
     * 查询指定学号的学生，并将其年龄加1岁
     * @param arr 学生数组
     * @param id 要查询的学号
     * @return 是否找到并修改成功
     */
    public static boolean findId(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (arr[i].getId() == id) {
                arr[i].setAge(arr[i].getAge() + 1); // 将找到的学生年龄加1
                return true;
            }
        }
        return false; // 没有找到指定学号的学生
    }

    /**
     * 删除指定学号的学生
     * @param arr 学生数组
     * @param id 要删除的学号
     * @return 是否删除成功
     */
    public static boolean delete(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null && stu.getId() == id) {
                arr[i] = null; // 将对应的学生对象设置为null，表示删除
                return true;
            }
        }
        return false; // 没有找到指定学号的学生
    }

    /**
     * 打印学生数组中的所有学生信息
     * @param arr 学生数组
     */
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge());
            }
        }
    }

    /**
     * 创建一个新的数组，长度为老数组长度+1，并将老数组的元素拷贝到新数组中
     * @param arr 老数组
     * @return 新数组
     */
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        // 循环遍历老数组，将元素拷贝到新数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /**
     * 统计数组中已有的学生数量
     * @param arr 学生数组
     * @return 数组中已有的学生数量
     */
    public static int getCount(Student[] arr) {
        int count = 0; // 定义计数器
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++; // 如果当前元素不为null，计数器加1
            }
        }
        return count; // 返回统计结果
    }

    /**
     * 判断数组中是否已经存在指定学号的学生
     * @param arr 学生数组
     * @param id 要判断的学号
     * @return 是否存在
     */
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null && stu.getId() == id) {
                return true; // 如果找到相同学号的学生，返回true
            }
        }
        return false; // 如果循环结束都没有找到，返回false
    }
}