# 前言
模仿 `leetcode` 的一个在线代码编辑器，可以在线运行查看结果。
# 主要功能实现
通过把字符串代码保存在 `.java` 文件中，然后通过 `JavaCompiler`
去动态编译生成 `.class` 文件，然后通过自定义类加载器 `FileClassLoader` 
去加载生成的类，最后通过反射调用 `main` 方法拦截 **控制台输出信息** 返回给前段页面。
# 运行结果展示
## 成功结果展示
![FCF15D00-84D1-4095-A66D-E9ED4197AE5A.png](http://ww1.sinaimg.cn/large/006Vpl27ly1gbi601k02pj31k018w41r.jpg)

## 失败结果展示
![2462E104-D47E-4833-A582-8C4F5FD84BC3.png](http://ww1.sinaimg.cn/large/006Vpl27ly1gbi618kxs6j31i21c6n0w.jpg)