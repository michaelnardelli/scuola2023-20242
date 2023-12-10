test -f  /etc/services
    2  echo $
    3  echo $$
    4  test -f  /etc/services
    5  echo $?
    6  echo $? /etc/services
    7  echo $?
    8  echo $? /etc/service
    9  test -f  /etc/service
   10  echo $?
   11  history
	12head /etc/services
    13  head 10 /etc/services
    14 head 5  /etc/services
    15 head "5"  /etc/services
    16 head -5  /etc/services
    17 head --5  /etc/services
    18 head -5  /etc/services
    19 tails -5  /etc/services
    20 tail -5  /etc/services
   21 man heaf
   22  man haed
   23
   24  head z -20  /etc/services
   25  head -5  /etc/services
   26  history
1  head /etc/services
    2  head 10 /etc/services
    3  head 5  /etc/services
    4  head "5"  /etc/services
    5  head -5  /etc/services
    6  head --5  /etc/services
    7  head -5  /etc/services
    8  tails -5  /etc/services
    9  tail -5  /etc/services
   10  man heaf
   11  man haed
   12*
   13  head z -20  /etc/services
   14  head -5  /etc/services
   15  history
   16  sort /etc/services
   17  sort /etc/services |uniq|head
   18  sort /etc/services |uniq
   19  sort /etc/services |uniq
   20  sort /etc/services |uniq| sort /etc/services |uniq| head z -20  /etc/services
   21  head /proc/cpuinfo
   22  head /proc/gpuinfo
   23  head /proc/raminfo
   24  hysotry
   25  history