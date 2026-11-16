@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.qos

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket

private object WindowsWin32NetworkmanagementQosJniBridge {
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
        val stream = WindowsWin32NetworkmanagementQosJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32NetworkmanagementQosQOSAddSocketToFlow(qoshandle: Long, socket: Long, destaddr: Long, traffictype: Int, flags: Int, flowid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosQOSCancel(qoshandle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosQOSCloseHandle(qoshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosQOSCreateHandle(version: Long, qoshandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosQOSEnumerateFlows(qoshandle: Long, size: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosQOSNotifyFlow(qoshandle: Long, flowid: Int, operation: Int, size: Long, buffer: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosQOSQueryFlow(qoshandle: Long, flowid: Int, operation: Int, size: Long, buffer: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosQOSRemoveSocketFromFlow(qoshandle: Long, socket: Long, flowid: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosQOSSetFlow(qoshandle: Long, flowid: Int, operation: Int, size: Int, buffer: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosQOSStartTrackingClient(qoshandle: Long, destaddr: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosQOSStopTrackingClient(qoshandle: Long, destaddr: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcAddFilter(flowhandle: Long, pgenericfilter: Long, pfilterhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcAddFlow(ifchandle: Long, clflowctx: Long, flags: Int, pgenericflow: Long, pflowhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcCloseInterface(ifchandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcDeleteFilter(filterhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcDeleteFlow(flowhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcDeregisterClient(clienthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcEnumerateFlows(ifchandle: Long, penumhandle: Long, pflowcount: Long, pbufsize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcEnumerateInterfaces(clienthandle: Long, pbuffersize: Long, interfacebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameA(flowhandle: Long, strsize: Int, pflowname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameW(flowhandle: Long, strsize: Int, pflowname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcModifyFlow(flowhandle: Long, pgenericflow: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceA(pinterfacename: Long, clienthandle: Long, clifcctx: Long, pifchandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceW(pinterfacename: Long, clienthandle: Long, clifcctx: Long, pifchandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcQueryFlowA(pflowname: Long, pguidparam: Long, pbuffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcQueryFlowW(pflowname: Long, pguidparam: Long, pbuffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcQueryInterface(ifchandle: Long, pguidparam: Long, notifychange: Boolean, pbuffersize: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcRegisterClient(tciversion: Int, clregctx: Long, clienthandlerlist: Long, pclienthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcSetFlowA(pflowname: Long, pguidparam: Long, buffersize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcSetFlowW(pflowname: Long, pguidparam: Long, buffersize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementQosTcSetInterface(ifchandle: Long, pguidparam: Long, buffersize: Int, buffer: Long): Int
}

public actual fun qOSAddSocketToFlow(qoshandle: Handle, socket: Socket, destaddr: ConstPtr, traffictype: QosTrafficType, flags: UInt, flowid: MutPtr): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosQOSAddSocketToFlow(qoshandle.rawAddress, socket.toLong(), destaddr.rawAddress, traffictype, flags.toInt(), flowid.rawAddress)

public actual fun qOSCancel(qoshandle: Handle, overlapped: ConstPtr): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosQOSCancel(qoshandle.rawAddress, overlapped.rawAddress)

public actual fun qOSCloseHandle(qoshandle: Handle): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosQOSCloseHandle(qoshandle.rawAddress)

public actual fun qOSCreateHandle(version: ConstPtr, qoshandle: MutPtr): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosQOSCreateHandle(version.rawAddress, qoshandle.rawAddress)

public actual fun qOSEnumerateFlows(qoshandle: Handle, size: MutPtr, buffer: MutPtr): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosQOSEnumerateFlows(qoshandle.rawAddress, size.rawAddress, buffer.rawAddress)

public actual fun qOSNotifyFlow(qoshandle: Handle, flowid: UInt, operation: QosNotifyFlow, size: MutPtr, buffer: MutPtr, flags: UInt, overlapped: MutPtr): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosQOSNotifyFlow(qoshandle.rawAddress, flowid.toInt(), operation, size.rawAddress, buffer.rawAddress, flags.toInt(), overlapped.rawAddress)

public actual fun qOSQueryFlow(qoshandle: Handle, flowid: UInt, operation: QosQueryFlow, size: MutPtr, buffer: MutPtr, flags: UInt, overlapped: MutPtr): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosQOSQueryFlow(qoshandle.rawAddress, flowid.toInt(), operation, size.rawAddress, buffer.rawAddress, flags.toInt(), overlapped.rawAddress)

public actual fun qOSRemoveSocketFromFlow(qoshandle: Handle, socket: Socket, flowid: UInt, flags: UInt): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosQOSRemoveSocketFromFlow(qoshandle.rawAddress, socket.toLong(), flowid.toInt(), flags.toInt())

public actual fun qOSSetFlow(qoshandle: Handle, flowid: UInt, operation: QosSetFlow, size: UInt, buffer: ConstPtr, flags: UInt, overlapped: MutPtr): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosQOSSetFlow(qoshandle.rawAddress, flowid.toInt(), operation, size.toInt(), buffer.rawAddress, flags.toInt(), overlapped.rawAddress)

public actual fun qOSStartTrackingClient(qoshandle: Handle, destaddr: ConstPtr, flags: UInt): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosQOSStartTrackingClient(qoshandle.rawAddress, destaddr.rawAddress, flags.toInt())

public actual fun qOSStopTrackingClient(qoshandle: Handle, destaddr: ConstPtr, flags: UInt): Bool =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosQOSStopTrackingClient(qoshandle.rawAddress, destaddr.rawAddress, flags.toInt())

public actual fun tcAddFilter(flowhandle: Handle, pgenericfilter: ConstPtr, pfilterhandle: MutPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcAddFilter(flowhandle.rawAddress, pgenericfilter.rawAddress, pfilterhandle.rawAddress).toUInt()

public actual fun tcAddFlow(ifchandle: Handle, clflowctx: Handle, flags: UInt, pgenericflow: ConstPtr, pflowhandle: MutPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcAddFlow(ifchandle.rawAddress, clflowctx.rawAddress, flags.toInt(), pgenericflow.rawAddress, pflowhandle.rawAddress).toUInt()

public actual fun tcCloseInterface(ifchandle: Handle): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcCloseInterface(ifchandle.rawAddress).toUInt()

public actual fun tcDeleteFilter(filterhandle: Handle): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcDeleteFilter(filterhandle.rawAddress).toUInt()

public actual fun tcDeleteFlow(flowhandle: Handle): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcDeleteFlow(flowhandle.rawAddress).toUInt()

public actual fun tcDeregisterClient(clienthandle: Handle): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcDeregisterClient(clienthandle.rawAddress).toUInt()

public actual fun tcEnumerateFlows(ifchandle: Handle, penumhandle: MutPtr, pflowcount: MutPtr, pbufsize: MutPtr, buffer: MutPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcEnumerateFlows(ifchandle.rawAddress, penumhandle.rawAddress, pflowcount.rawAddress, pbufsize.rawAddress, buffer.rawAddress).toUInt()

public actual fun tcEnumerateInterfaces(clienthandle: Handle, pbuffersize: MutPtr, interfacebuffer: MutPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcEnumerateInterfaces(clienthandle.rawAddress, pbuffersize.rawAddress, interfacebuffer.rawAddress).toUInt()

public actual fun tcGetFlowNameA(flowhandle: Handle, strsize: UInt, pflowname: Pstr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameA(flowhandle.rawAddress, strsize.toInt(), pflowname.rawAddress).toUInt()

public actual fun tcGetFlowNameW(flowhandle: Handle, strsize: UInt, pflowname: Pwstr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcGetFlowNameW(flowhandle.rawAddress, strsize.toInt(), pflowname.rawAddress).toUInt()

public actual fun tcModifyFlow(flowhandle: Handle, pgenericflow: ConstPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcModifyFlow(flowhandle.rawAddress, pgenericflow.rawAddress).toUInt()

public actual fun tcOpenInterfaceA(pinterfacename: Pcstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceA(pinterfacename.rawAddress, clienthandle.rawAddress, clifcctx.rawAddress, pifchandle.rawAddress).toUInt()

public actual fun tcOpenInterfaceW(pinterfacename: Pcwstr, clienthandle: Handle, clifcctx: Handle, pifchandle: MutPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcOpenInterfaceW(pinterfacename.rawAddress, clienthandle.rawAddress, clifcctx.rawAddress, pifchandle.rawAddress).toUInt()

public actual fun tcQueryFlowA(pflowname: Pcstr, pguidparam: ConstPtr, pbuffersize: MutPtr, buffer: MutPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcQueryFlowA(pflowname.rawAddress, pguidparam.rawAddress, pbuffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun tcQueryFlowW(pflowname: Pcwstr, pguidparam: ConstPtr, pbuffersize: MutPtr, buffer: MutPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcQueryFlowW(pflowname.rawAddress, pguidparam.rawAddress, pbuffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun tcQueryInterface(ifchandle: Handle, pguidparam: ConstPtr, notifychange: Boolean, pbuffersize: MutPtr, buffer: MutPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcQueryInterface(ifchandle.rawAddress, pguidparam.rawAddress, notifychange, pbuffersize.rawAddress, buffer.rawAddress).toUInt()

public actual fun tcRegisterClient(tciversion: UInt, clregctx: Handle, clienthandlerlist: ConstPtr, pclienthandle: MutPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcRegisterClient(tciversion.toInt(), clregctx.rawAddress, clienthandlerlist.rawAddress, pclienthandle.rawAddress).toUInt()

public actual fun tcSetFlowA(pflowname: Pcstr, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcSetFlowA(pflowname.rawAddress, pguidparam.rawAddress, buffersize.toInt(), buffer.rawAddress).toUInt()

public actual fun tcSetFlowW(pflowname: Pcwstr, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcSetFlowW(pflowname.rawAddress, pguidparam.rawAddress, buffersize.toInt(), buffer.rawAddress).toUInt()

public actual fun tcSetInterface(ifchandle: Handle, pguidparam: ConstPtr, buffersize: UInt, buffer: ConstPtr): UInt =
    WindowsWin32NetworkmanagementQosJniBridge.windowssysWindowsWin32NetworkmanagementQosTcSetInterface(ifchandle.rawAddress, pguidparam.rawAddress, buffersize.toInt(), buffer.rawAddress).toUInt()
