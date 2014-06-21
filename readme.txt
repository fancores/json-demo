
##########################################################################################
#
#	开发环境：eclipse（indigo） + maven
#	
#	eclipse 导入项目：
#	
#	Import ——> Maven ——> Existing Maven Projects
#	
#	Ant 任务：
#	
#	jetty-run  ( 运行服务 )
#	
#	jetty-stop ( 停止服务 )
#	
#	m-package  ( 打包 )
#	
#	m-clean    ( 清除 )
#	
#	m-idea     ( 生成 idea 项目 )
#	
#	m-eclipse  ( 生成 eclipse 项目 )
#	
#	01. 导入项目报错
#	
#		检查项目依赖包, src/main/webapp/WEB-INF/lib, 选中JAR ——> 右键 ——> Build Path ——> Add to Build Path
#	
#	02. 导入项目结构混乱
#	
#		选中项目 ——> 右键 ——> Maven ——> Update Project Configuration
#	
#	03. 运行项目
#	
#		Window ——> Show View ——> Outline ( 确认 Outline 窗口已经调出 )
#		
#		Outline ——> jetty-run ——> 右键 ——> Run As ——> Ant Build
#	
#	04. 停止项目
#	
#		Window ——> Show View ——> Outline ( 确认 Outline 窗口已经调出 )
#		
#		Outline ——> jetty-stop ——> 右键 ——> Run As ——> Ant Build
#		
#		注意：直接点击控制台的 Terminate 按钮是无效的, 请运行该任务停止JETTY服务
#
#		或在任务管理器中将 java.exe 杀死
#	
#	05. WEB访问入口地址
#	
#		http://localhost/json-demo/
#
#	JAR 源码地址：https://github.com/fancores/json
#
##########################################################################################