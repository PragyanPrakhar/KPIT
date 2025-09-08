# Problem Statement 1: String Data Manipulation with Functional
# Programming
# Objective: You are given a list of strings representing log entries. Your task is to process these strings using
# map, filter, reduce, lambda, and list comprehensions to extract meaningful information and perform
# various transformations.
# Data: Assume a list of log entries like this:
log_entries = [
    "ERROR: 2024-10-27 10:00:00 - System Failure in Module X",
    "INFO: 2024-10-27 10:01:00 - User 'Alice' logged in",
    "WARNING: 2024-10-27 10:02:00 - Disk space low on Server Y",
    "DEBUG: 2024-10-27 10:03:00 - Variable Z value: 42",
    "ERROR: 2024-10-27 10:04:00 - Network timeout occurred",
    "INFO: 2024-10-27 10:05:00 - Process P completed successfully",
    "WARNING: 2024-10-27 10:06:00 - High CPU usage detected",
    "DEBUG: 2024-10-27 10:07:00 - Database connection established",
    "ERROR: 2024-10-27 10:08:00 - Invalid input received",
    "INFO: 2024-10-27 10:09:00 - System is running normally",
    "CRITICAL: 2024-10-27 10:10:00 - Critical system error occurred"
]

# Tasks (Implement each using the techniques specified):
# 1. Extract Log Levels: Use map and a lambda function to extract the log level (e.g., "ERROR", "INFO")
# from each log entry.
# 2. Filter Errors: Use filter and a lambda function to create a new list containing only the error log
# entries.
# 3. Extract Dates: Use list comprehension to extract the date from each log entry.
# 4. Count Error Messages: Use reduce to count the total number of error messages in the log entries.
# 5. Get Unique Log Levels: Use a combination of map, set and list comprehension to extract all unique
# log levels.
# 6. Find Longest Log Message: Use map and max with a lambda function to find the longest log
# message in the list.
# 7. Check for Specific User: Use filter and a lambda function to find all log entries related to a
# specific user (e.g., 'Alice').
# 8. Convert to Uppercase: Use map and a lambda function to convert all error messages to uppercase.
# 9. Extract Time: Use list comprehension to extract the time stamp from each log entry.
# 10. Grouping messages by Log Level: Use dictionary comprehension to group log entries by their log
# level.
def extract_log_levels(log_entries:list[str])->list[str]:
    return list(map(lambda x:x.split(":")[0],log_entries))

def filter_errors(log_entries:list[str])->list[str]:
    return list(filter(lambda x:x.split(":")[0]=="ERROR",log_entries))

def extract_date(log_entries:list[dict])->list[str]:
    return list(map(lambda x :x.split(" ")[1],log_entries))

def count_error_messages(log_entries:list[dict])->int:
    return len(list(filter(lambda x : x.split(":")[0]=="ERROR" , log_entries)))

def get_unique_log_levels(log_entries:list[str])->list[str]:
    return list(set(list(map(lambda x:x.split(":")[0],log_entries))))

def find_longest_log_message(log_entries:list[str])->str:
    return list(filter(lambda mess : len(mess.split("-")[3])==len(max(list(map(lambda x:x.split("-")[3],log_entries)),key=len)) ,log_entries))

def check_for_specific_user_Alice(log_entries:list[str])->list[str]:
    return list(filter(lambda x : "Alice" in x.split("-")[3] , log_entries))

def convert_to_upper_case(log_entries:list[str])->list[str]:
    return list(map(lambda x:x.upper() , list(filter(lambda x:x.split(":")[0]=="ERROR",log_entries))))

def extract_time(log_entries:list[str])->list[str]:
    return list(map(lambda x:x.split(" ")[2],log_entries))

def grouping_message_by_log_level(log_entries:list[str])->dict:
    unique_log_levels=list(set(list(map(lambda x:x.split(":")[0],log_entries))))
    grouped_dict={}
    for level in unique_log_levels:
        grouped_dict.setdefault(level,list(filter(lambda x:x.split(":")[0]==level,log_entries)))
        
    return grouped_dict
        

print(extract_log_levels(log_entries))
print(filter_errors(log_entries))
print(f"Only dates are :{extract_date(log_entries)}")
print(f"Only error logs are :{count_error_messages(log_entries)}")
print(f"Unique log levels are : {get_unique_log_levels(log_entries)}")
print(f"Longest message is :{find_longest_log_message(log_entries)}")
print(f"Log with the user Alice is {check_for_specific_user_Alice(log_entries)}")
print(f"Converted into the upper case is {convert_to_upper_case(log_entries)}")
print(f"Extracted time is {extract_time(log_entries)}")
print(f"Grouped Dictionary is {grouping_message_by_log_level(log_entries)}")
