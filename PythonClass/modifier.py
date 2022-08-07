class Time:
    def __init__(self, hour, minute):
        self.hour = hour
        self.minute = minute
damn = Time(1, 30)
duration = Time(2, 30)

def increment_time(damn,duration):
    damn.hour += duration.hour
    damn.minute += duration.minute
    return "%.2d:%.2d" % (damn.hour, damn.minute)

x = increment_time(damn,duration)
print(x)