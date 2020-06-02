# HTML-beautifier
HTML beautifier implemented with scala

https://tool.lu/html/
参考这个页面，实现一个html美化和压缩小程序。要求：

1. 实现功能和上述页面提供的一致，例如在压缩里删掉注释，等等；

2. 覆盖较全面的单元测试；

3. 使用scala语言，通过blade或者mill构建；

4. 代码符合databricks格式规范，并能通过scalastyle检查。

##scala语法备注

读取原始数据
val len = data.length()



读取标签的函数，读取下一个标签,readNextLabel(data,start,end,output)
while(start!=end && data(start)!='<')

while(start!=end && data(start)!='>i')



##逻辑思路

拥有相同属性的标签可以用map存，先检查是否contains

标签功能依次增强

不认识的标签
尾换行 br
首尾换行标签，可在同行</dt></h1-6></script></li> ， 内部有标签不管
首尾换行标签，不在同行html,meta,head,body,style
首尾换行标签，不在同行，内部缩进div，dl，form，select,tr,td,ul,ol,p（内部遇到<之前的元素都认为是字符串，遇到<会另起一行）


美化：

2.不能有全空的一行，会被删除

 html,meta,head,body,style都会独占一行


8.script,注释（<!--）和看不懂的标签（<开头）保持原样，只管开始标签的位置缩进


内部触发缩进效果的标签div，dl，form，select,tr,td,ul,ol,p

以上都会结尾都不能与开始同行，结尾后必换行



</dt></h1-6></script></li><br>后必换行

<后直到下一个>必在同一行，<!开头不会

标签位于一行的第一个有效字符，则会调整缩进


p，td,标签内容不变，首尾换行

对于不认识的标签，同一行结尾，或者换行结尾（缩进正确，不然会另起一行），都可以

标签内部
1.字符串最多只能连续1个空格，多余空格会被删除
2.不同关键字间只能最多1个空格，多余空格会被删除
3.>和/>前面不能有空格
4.=后面有空格，会被加上“”





注释
1.内部内容保持原样
2.只管开始标签的位置缩进

压缩：

1.字符串内的空格换行不能压缩
2.删除注释<!--开头 -->结尾的，<!-->，<!--->也算，从<>往前后找