from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys
print("\n------------------------")
print("TEST AUTOMATION STARTED")
print("------------------------\n")
#open Google Chrome browser
driver = webdriver.Chrome("D:/chromedriver_win32/chromedriver.exe")
#maximize the window size
driver.maximize_window()
#delete the cookies
driver.delete_all_cookies()
#navigate to the url
driver.get("http://127.0.0.1:5000/")
#identify the user name text box and enter the value
driver.find_element_by_id("name").send_keys("Rakesh Varmma")
time.sleep(2)
driver.find_element_by_id("uid").send_keys("1913436")
time.sleep(2)
driver.find_element_by_id("cname").send_keys("LG India")
time.sleep(2)
driver.find_element_by_id("cmail").send_keys("RV@lg.com")
time.sleep(4)
driver.find_element_by_class_name("contact100-form-btn").click()
time.sleep(4)
driver.back()
time.sleep(4)
driver.find_element_by_xpath("/html/body/div/div/form/div/button").click()
time.sleep(4)
driver.close()
print("\n-------------------------------------------------------")
print("Your Test Automation successfully completed Congrats!!!")
print("-------------------------------------------------------\n")