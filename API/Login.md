## Login
#### 内容
- request `[ServerIP]:[Port]/user/login`
  - param: `username`,`password` 
  
  - return: 
  
    ```json
    {
        "code": 201,
        "token": "Token String",
        "message": "About message"
    }
    ```
#### 举例
```http
http://localhost:8080/user/login?username=test&password=test
```

  

```
{
"code":201,

"token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6MiwiZXhwIjoxNjM2MDg4MzA1LCJpYXQiOjE2MzYwODgzMDV9.crnf7u0qbYj6W4M97Jn8NqGjMUDBJurNRtNh9MJI69w",

"message":"Login Success"
}
```

#### code说明

>  201 : 登录成功
>
> 400 : 登录失败 							    账号或密码错误
>
> 401:  服务器内错误                         登录的账号密码正确但未获取到ID,生成Token失败
