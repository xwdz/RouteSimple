### 组件化调研
   

### ARoute

> 注意:  项目有3个module，分别是app、moduleA 、moduleB。
         app一定要先依赖moduleA、moduleB。
         如果没有这个操作，那么单独的b、c都没有被打包到apk中，是不能跳转的
         所以一般是app 依赖 A和B 然后A、B没有依赖关系也可以相互调整。
### CC

