@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.networkdiagnosticsframework

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Socket
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SocketAddressList
import io.github.kotlinmania.windowssys.windows.win32.security.Sid

private object WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge {
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
        val stream = WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident(hostname: Long, querytype: Short, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident(cloudname: Long, groupname: Long, identity: Long, invitation: Long, addresses: Long, appid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident(helperclassname: Long, celt: Int, attributes: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident(cloudname: Long, peername: Long, diagnosepublish: Int, appid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident(uncpath: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident(url: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx(url: Long, usewinhttp: Int, modulename: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident(sock: Long, host: Long, port: Short, appid: Long, userid: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident(handle: Long, rootcausecount: Long, rootcauses: Long, dwwait: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis(handle: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile(handle: Long, tracefilelocation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident(handle: Long, repairex: Long, dwwait: Int): Int
}

public actual fun ndfCancelIncident(handle: ConstPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCancelIncident(handle.rawAddress)

public actual fun ndfCloseIncident(handle: MutPtr<CVoid>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCloseIncident(handle.rawAddress)

public actual fun ndfCreateConnectivityIncident(handle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateConnectivityIncident(handle.rawAddress)

public actual fun ndfCreateDNSIncident(hostname: Pcwstr, querytype: UShort, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateDNSIncident(hostname.rawAddress, querytype.toShort(), handle.rawAddress)

public actual fun ndfCreateGroupingIncident(cloudname: Pcwstr, groupname: Pcwstr, identity: Pcwstr, invitation: Pcwstr, addresses: ConstPtr<SocketAddressList>, appid: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateGroupingIncident(cloudname.rawAddress, groupname.rawAddress, identity.rawAddress, invitation.rawAddress, addresses.rawAddress, appid.rawAddress, handle.rawAddress)

public actual fun ndfCreateIncident(helperclassname: Pcwstr, celt: UInt, attributes: ConstPtr<HelperAttribute>, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateIncident(helperclassname.rawAddress, celt.toInt(), attributes.rawAddress, handle.rawAddress)

public actual fun ndfCreateNetConnectionIncident(handle: MutPtr<MutPtr<CVoid>>, id: Guid): Hresult =
    0

public actual fun ndfCreatePnrpIncident(cloudname: Pcwstr, peername: Pcwstr, diagnosepublish: Bool, appid: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreatePnrpIncident(cloudname.rawAddress, peername.rawAddress, diagnosepublish, appid.rawAddress, handle.rawAddress)

public actual fun ndfCreateSharingIncident(uncpath: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateSharingIncident(uncpath.rawAddress, handle.rawAddress)

public actual fun ndfCreateWebIncident(url: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncident(url.rawAddress, handle.rawAddress)

public actual fun ndfCreateWebIncidentEx(url: Pcwstr, usewinhttp: Bool, modulename: Pcwstr, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWebIncidentEx(url.rawAddress, usewinhttp, modulename.rawAddress, handle.rawAddress)

public actual fun ndfCreateWinSockIncident(sock: Socket, host: Pcwstr, port: UShort, appid: Pcwstr, userid: ConstPtr<Sid>, handle: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfCreateWinSockIncident(sock.toLong(), host.rawAddress, port.toShort(), appid.rawAddress, userid.rawAddress, handle.rawAddress)

public actual fun ndfDiagnoseIncident(handle: ConstPtr<CVoid>, rootcausecount: MutPtr<UInt>, rootcauses: MutPtr<MutPtr<RootCauseInfo>>, dwwait: UInt, dwflags: UInt): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfDiagnoseIncident(handle.rawAddress, rootcausecount.rawAddress, rootcauses.rawAddress, dwwait.toInt(), dwflags.toInt())

public actual fun ndfExecuteDiagnosis(handle: ConstPtr<CVoid>, hwnd: Hwnd): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfExecuteDiagnosis(handle.rawAddress, hwnd.rawAddress)

public actual fun ndfGetTraceFile(handle: ConstPtr<CVoid>, tracefilelocation: MutPtr<Pcwstr>): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfGetTraceFile(handle.rawAddress, tracefilelocation.rawAddress)

public actual fun ndfRepairIncident(handle: ConstPtr<CVoid>, repairex: ConstPtr<RepairInfoEx>, dwwait: UInt): Hresult =
    WindowsWin32NetworkmanagementNetworkdiagnosticsframeworkJniBridge.windowssysWindowsWin32NetworkmanagementNetworkdiagnosticsframeworkNdfRepairIncident(handle.rawAddress, repairex.rawAddress, dwwait.toInt())
