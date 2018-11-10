import itertools as tol

words ="1234567890"
# r=tol.product(words.repeat=5)
r=tol.product(words,repeat=3)
dic =open("wifipwd","a")#a模式。没有文件自动创建
for i in r:
    # dic.truncate()    #清空文件
    dic.write(" ".join(i))#用空格连接
    dic.write("".join("\n"))#换行
dic.close()