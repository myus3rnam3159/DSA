import os
from datetime import datetime

def timeConversion(s):

    time_obj = datetime.strptime(s, "%I:%M:%S%p")
    time_24 = time_obj.strftime("%H:%M:%S")

    return time_24