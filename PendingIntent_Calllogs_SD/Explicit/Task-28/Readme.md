## Aim : To make an application "x" that reads call logs through activity and pass it to receiver in application "y" which write it in the sd card.
__Flow : Application task28 offers a Main activity. The activity on starting read call logs and store them in stringbuffer. Areceiver named 'ReceiverPend'starts in background and is passed the data of stringbuffer throught intent. The receiver ReceiverPend writes the data in a file. 

In devices with multiple shared/external storage directories, this directory represents the primary storage that the user will interact with.Traditionally this is in SD card, but it may also be implemented as built-in storage in a device that is distinct from the protected internal storage and can be mounted as a filesystem on a computer. [Android Documentation](https://developer.android.com/reference/android/os/Environment.html)

Intent- Explicitly calling receiver from activity.
