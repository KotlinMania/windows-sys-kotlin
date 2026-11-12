@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.threading

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.PtimerApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType

private object WindowsWdkSystemThreadingJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWdkSystemThreadingJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtCancelTimer(timerhandle: Long, currentstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtCreateTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long, timertype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtOpenEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtOpenProcess(processhandle: Long, desiredaccess: Int, objectattributes: Long, clientid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtOpenTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtQueryInformationProcess(processhandle: Long, processinformationclass: Int, processinformation: Long, processinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtQueryInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtSetInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtSetTimer(timerhandle: Long, duetime: Long, timerapcroutine: Long, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtSetTimerEx(timerhandle: Long, timersetinformationclass: Int, timersetinformation: Long, timersetinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtTerminateProcess(processhandle: Long, exitstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingNtWaitForSingleObject(handle: Long, alertable: Boolean, timeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwCancelTimer(timerhandle: Long, currentstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwCreateTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long, timertype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwOpenEvent(eventhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwOpenProcess(processhandle: Long, desiredaccess: Int, objectattributes: Long, clientid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwOpenTimer(timerhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwQueryInformationProcess(processhandle: Long, processinformationclass: Int, processinformation: Long, processinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwQueryInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwSetInformationThread(threadhandle: Long, threadinformationclass: Int, threadinformation: Long, threadinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwSetTimer(timerhandle: Long, duetime: Long, timerapcroutine: Long, timercontext: Long, resumetimer: Boolean, period: Int, previousstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwSetTimerEx(timerhandle: Long, timersetinformationclass: Int, timersetinformation: Long, timersetinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwTerminateProcess(processhandle: Long, exitstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemThreadingZwWaitForSingleObject(handle: Long, alertable: Boolean, timeout: Long): Int
}

public actual fun ntCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtCancelTimer(timerhandle.rawAddress, currentstate.rawAddress)

public actual fun ntCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtCreateTimer(timerhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, timertype)

public actual fun ntOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtOpenEvent(eventhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun ntOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtOpenProcess(processhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, clientid.rawAddress)

public actual fun ntOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtOpenTimer(timerhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun ntQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtQueryInformationProcess(processhandle.rawAddress, processinformationclass, processinformation.rawAddress, processinformationlength.toInt(), returnlength.rawAddress)

public actual fun ntQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtQueryInformationThread(threadhandle.rawAddress, threadinformationclass, threadinformation.rawAddress, threadinformationlength.toInt(), returnlength.rawAddress)

public actual fun ntSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtSetInformationThread(threadhandle.rawAddress, threadinformationclass, threadinformation.rawAddress, threadinformationlength.toInt())

public actual fun ntSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtSetTimer(timerhandle.rawAddress, duetime.rawAddress, 0L, timercontext.rawAddress, resumetimer, period, previousstate.rawAddress)

public actual fun ntSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtSetTimerEx(timerhandle.rawAddress, timersetinformationclass, timersetinformation.rawAddress, timersetinformationlength.toInt())

public actual fun ntTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtTerminateProcess(processhandle.rawAddress, exitstatus)

public actual fun ntWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: MutPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingNtWaitForSingleObject(handle.rawAddress, alertable, timeout.rawAddress)

public actual fun zwCancelTimer(timerhandle: Handle, currentstate: MutPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwCancelTimer(timerhandle.rawAddress, currentstate.rawAddress)

public actual fun zwCreateTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, timertype: TimerType): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwCreateTimer(timerhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, timertype)

public actual fun zwOpenEvent(eventhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwOpenEvent(eventhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun zwOpenProcess(processhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, clientid: ConstPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwOpenProcess(processhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, clientid.rawAddress)

public actual fun zwOpenTimer(timerhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwOpenTimer(timerhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun zwQueryInformationProcess(processhandle: Handle, processinformationclass: Processinfoclass, processinformation: MutPtr, processinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwQueryInformationProcess(processhandle.rawAddress, processinformationclass, processinformation.rawAddress, processinformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQueryInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: MutPtr, threadinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwQueryInformationThread(threadhandle.rawAddress, threadinformationclass, threadinformation.rawAddress, threadinformationlength.toInt(), returnlength.rawAddress)

public actual fun zwSetInformationThread(threadhandle: Handle, threadinformationclass: Threadinfoclass, threadinformation: ConstPtr, threadinformationlength: UInt): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwSetInformationThread(threadhandle.rawAddress, threadinformationclass, threadinformation.rawAddress, threadinformationlength.toInt())

public actual fun zwSetTimer(timerhandle: Handle, duetime: ConstPtr, timerapcroutine: PtimerApcRoutine, timercontext: ConstPtr, resumetimer: Boolean, period: Int, previousstate: MutPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwSetTimer(timerhandle.rawAddress, duetime.rawAddress, 0L, timercontext.rawAddress, resumetimer, period, previousstate.rawAddress)

public actual fun zwSetTimerEx(timerhandle: Handle, timersetinformationclass: TimerSetInformationClass, timersetinformation: MutPtr, timersetinformationlength: UInt): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwSetTimerEx(timerhandle.rawAddress, timersetinformationclass, timersetinformation.rawAddress, timersetinformationlength.toInt())

public actual fun zwTerminateProcess(processhandle: Handle, exitstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwTerminateProcess(processhandle.rawAddress, exitstatus)

public actual fun zwWaitForSingleObject(handle: Handle, alertable: Boolean, timeout: ConstPtr): Ntstatus =
    WindowsWdkSystemThreadingJniBridge.windowssysWindowsWdkSystemThreadingZwWaitForSingleObject(handle.rawAddress, alertable, timeout.rawAddress)
