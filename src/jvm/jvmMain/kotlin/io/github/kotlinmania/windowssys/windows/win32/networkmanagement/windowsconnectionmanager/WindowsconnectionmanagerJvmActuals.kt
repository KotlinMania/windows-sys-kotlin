@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge {
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
        val stream = WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerFreeInterfaceContextTable(interfacecontexttable: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerGetInterfaceContextTableForHostName(hostname: Long, proxyname: Long, flags: Int, connectionprofilefilterrawdata: Long, connectionprofilefilterrawdatasize: Int, interfacecontexttable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandGetRoutingHint(destinationhostname: Long, interfaceindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandRegisterNotification(callback: Long, callbackcontext: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandUnRegisterNotification(registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmFreeMemory(pmemory: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmGetProfileList(preserved: Long, ppprofilelist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmQueryProperty(pinterface: Long, strprofilename: Long, property: Int, preserved: Long, pdwdatasize: Long, ppdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProfileList(pprofilelist: Long, dwposition: Int, fignoreunknownprofiles: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProperty(pinterface: Long, strprofilename: Long, property: Int, preserved: Long, dwdatasize: Int, pbdata: Long): Int
}

public actual fun freeInterfaceContextTable(interfacecontexttable: ConstPtr<NetInterfaceContextTable>) {
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerFreeInterfaceContextTable(interfacecontexttable.rawAddress)
}

public actual fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: ConstPtr<UByte>, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: MutPtr<MutPtr<NetInterfaceContextTable>>): Hresult =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerGetInterfaceContextTableForHostName(hostname.rawAddress, proxyname.rawAddress, flags.toInt(), connectionprofilefilterrawdata.rawAddress, connectionprofilefilterrawdatasize.toInt(), interfacecontexttable.rawAddress)

public actual fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: MutPtr<UInt>): Hresult =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandGetRoutingHint(destinationhostname.rawAddress, interfaceindex.rawAddress)

public actual fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: ConstPtr<CVoid>, registrationhandle: MutPtr<Handle>): Hresult =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandRegisterNotification(0L, callbackcontext.rawAddress, registrationhandle.rawAddress)

public actual fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandUnRegisterNotification(registrationhandle.rawAddress)

public actual fun wcmFreeMemory(pmemory: MutPtr<CVoid>) {
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmFreeMemory(pmemory.rawAddress)
}

public actual fun wcmGetProfileList(preserved: ConstPtr<CVoid>, ppprofilelist: MutPtr<MutPtr<WcmProfileInfoList>>): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmGetProfileList(preserved.rawAddress, ppprofilelist.rawAddress).toUInt()

public actual fun wcmQueryProperty(pinterface: ConstPtr<Guid>, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmQueryProperty(pinterface.rawAddress, strprofilename.rawAddress, property, preserved.rawAddress, pdwdatasize.rawAddress, ppdata.rawAddress).toUInt()

public actual fun wcmSetProfileList(pprofilelist: ConstPtr<WcmProfileInfoList>, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProfileList(pprofilelist.rawAddress, dwposition.toInt(), fignoreunknownprofiles, preserved.rawAddress).toUInt()

public actual fun wcmSetProperty(pinterface: ConstPtr<Guid>, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr<CVoid>, dwdatasize: UInt, pbdata: ConstPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementWindowsconnectionmanagerJniBridge.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProperty(pinterface.rawAddress, strprofilename.rawAddress, property, preserved.rawAddress, dwdatasize.toInt(), pbdata.rawAddress).toUInt()
