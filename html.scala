
object Test {
   def main(args: Array[String]) {

      val str = """
	  <!DOCTYPE html><html>
<head><meta charset="utf-8"/><script src="http://code.jquery.com/jquery-latest.min.js"></script></head>
<body>
<div id="wrap"><div id="header"><h1>html在线工具</h1>
<!--   如果有用，请别忘了推荐给你的朋友：		-->
<!--   Html在线美化、格式化：https://tool.lu/html   -->
</div>
<div id="main">
	<!-- [history] -->
	<dl>
	<dt>v1.0</dt> <dd>2011-06-05 Html工具上线</dd>
	<dt>v1.1</dt> <dd>2012-01-14 修复美化功能，增加压缩</dd>
	<dt>v1.2</dt> <dd>2012-07-20 增加清除链接功能</dd>
	<dt>v1.3</dt> <dd>2014-08-05 修改 html 压缩引擎</dd>
	<dt>v1.4</dt> <dd>2014-08-09 增加转换为js变量的功能</dd>
	</dl>
</div>
<div id="footer">This is just an example.</div>
</div>
</body></html>
"""
      println(str)
   }


   def beautifyCode(source){

   }

   def compressCode(source){

   }
}