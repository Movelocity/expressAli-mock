# ExpressAli Share 本地 Mock 项目安装指南

ExpressAli 的sdk获取困难，但是项目存在依赖，所以需要本地 mock 解决依赖问题。

## 环境要求
- JDK 8 或更高版本
- Maven 3.6 或更高版本

## 项目结构
本项目包含以下模块：
- `share`: 核心共享模块 (com.expressAli.sdk:share:1.0.2)
- `dev`: 开发工具模块 (global.iop.api:dev:1.0.2)
- `iopapi`: IOP API 模块 (com.global.iop:iopapi:1.0.0)
- `TestMvnPkg`: 测试模块 (cn.yafex.test:TestMvnPkg:1.0.2)

## 安装步骤

1. 克隆项目到本地
```bash
git clone [项目地址]
cd expressAli
```

2. 安装依赖模块
首先需要安装基础依赖模块到本地 Maven 仓库：
```bash
# 安装 dev 模块
cd dev
mvn clean install -DskipTests

# 安装 iopapi 模块
cd ../iopapi
mvn clean install -DskipTests
```

3. 安装 Share 项目
```bash
# 回到项目根目录
cd ..

# 安装 share 模块
cd share
mvn clean install -DskipTests
```
安装后的包会存在于本地环境 `C:\Users\用户名\.m2\repository\com\expressAli\sdk\share\1.0.2`

在其它项目里使用将以上依赖加入 pom.xml 依赖
```
<dependency>
  <groupId>com.expressAli.sdk</groupId>
  <artifactId>share</artifactId>
  <version>1.0.2</version>
</dependency>
```

4. 安装测试项目（可选）
```bash
# 安装 TestMvnPkg
cd ../TestMvnPkg
mvn clean install -DskipTests
```

## 验证安装
安装完成后，可以通过以下命令验证 share 模块是否安装成功：
```bash
cd share
mvn dependency:tree
```
应该能看到所有依赖都正确解析。

## 常见问题
1. 如果遇到依赖无法下载，请检查 Maven 的 settings.xml 配置
2. 如果遇到版本冲突，请检查各个模块的 pom.xml 中的版本号是否匹配
3. 确保本地 Maven 仓库有足够的磁盘空间

## 注意事项
- 建议使用 `-DskipTests` 参数跳过测试以加快安装速度
- 如果遇到权限问题，请确保对 Maven 本地仓库目录有写入权限
- 建议使用国内 Maven 镜像源以加快下载速度
- Share 模块是核心模块，其他模块都依赖于它，请确保优先安装 