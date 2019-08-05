# 1. java通过poi模板导出excel
代码支持按照sheet模板导出,并且支持sheet页级的模板复制功能。

- 支持 #{} 只替换当前 
- ${} 从当前行开始向下替换 

# 2. 测试
## 2.1 模板
![image](https://raw.githubusercontent.com/feiniaoying/excel-tool/master/img/p.png)

## 2.2 代码
```
public static void main(String[] args) {
        //获取模板
        String model = "excel/test.xlsx";
        File f = new File("d:/test.xlsx");

        SheetData[] sds = new SheetData[5];

        //创建5个数据sheet
        for( int i = 0 ; i < 5 ; i++) {
            SheetData sd = new SheetData("测试" + i);
            sd.put("name", "张三" + i);
            sd.put("age", 13);

            //每个sheet页加入100条测试数据
            //注意这里可以加入pojo也可以直接使用map,理论上map在这里效率更高一些
            for(int j = 0 ; j < 100 ; j++) {
                TestData td = new TestData(j, j * -1, "t" + j);
                sd.addData(td);;
            }

            sds[i] = sd ;
        }

        try {
            ExcelUtils.writeData(model, new FileOutputStream(f) ,sds);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
```

## 2.3 结果

![image](https://raw.githubusercontent.com/feiniaoying/excel-tool/master/img/p0.png)

![image](https://raw.githubusercontent.com/feiniaoying/excel-tool/master/img/p1.png)
