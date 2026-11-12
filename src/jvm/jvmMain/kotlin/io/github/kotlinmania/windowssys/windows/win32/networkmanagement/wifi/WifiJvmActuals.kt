@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType

private object WindowsWin32NetworkmanagementWifiJniBridge {
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
        val stream = WindowsWin32NetworkmanagementWifiJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32NetworkmanagementWifiWFDCancelOpenSession(hsessionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWFDCloseHandle(hclienthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWFDCloseSession(hsessionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWFDOpenHandle(dwclientversion: Int, pdwnegotiatedversion: Long, phclienthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWFDOpenLegacySession(hclienthandle: Long, plegacymacaddress: Long, phsessionhandle: Long, pguidsessioninterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWFDStartOpenSession(hclienthandle: Long, pdeviceaddress: Long, pvcontext: Long, pfncallback: Long, phsessionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWFDUpdateDeviceVisibility(pdeviceaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanAllocateMemory(dwmemorysize: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanCloseHandle(hclienthandle: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanConnect(hclienthandle: Long, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanConnect2(hclienthandle: Long, pinterfaceguid: Long, pconnectionparameters: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanDeleteProfile(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanDeviceServiceCommand(hclienthandle: Long, pinterfaceguid: Long, pdeviceserviceguid: Long, dwopcode: Int, dwinbuffersize: Int, pinbuffer: Long, dwoutbuffersize: Int, poutbuffer: Long, pdwbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanDisconnect(hclienthandle: Long, pinterfaceguid: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanEnumInterfaces(hclienthandle: Long, preserved: Long, ppinterfacelist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanExtractPsdIEDataList(hclienthandle: Long, dwiedatasize: Int, prawiedata: Long, strformat: Long, preserved: Long, pppsdiedatalist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanFreeMemory(pmemory: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList(hclienthandle: Long, pinterfaceguid: Long, dwflags: Int, preserved: Long, ppavailablenetworklist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList2(hclienthandle: Long, pinterfaceguid: Long, dwflags: Int, preserved: Long, ppavailablenetworklist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanGetFilterList(hclienthandle: Long, wlanfilterlisttype: Int, preserved: Long, ppnetworklist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanGetInterfaceCapability(hclienthandle: Long, pinterfaceguid: Long, preserved: Long, ppcapability: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanGetNetworkBssList(hclienthandle: Long, pinterfaceguid: Long, pdot11ssid: Long, dot11bsstype: Int, bsecurityenabled: Int, preserved: Long, ppwlanbsslist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanGetProfile(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, preserved: Long, pstrprofilexml: Long, pdwflags: Long, pdwgrantedaccess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileCustomUserData(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, preserved: Long, pdwdatasize: Long, ppdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileList(hclienthandle: Long, pinterfaceguid: Long, preserved: Long, ppprofilelist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanGetSecuritySettings(hclienthandle: Long, securableobject: Int, pvaluetype: Long, pstrcurrentsddl: Long, pdwgrantedaccess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanGetSupportedDeviceServices(hclienthandle: Long, pinterfaceguid: Long, ppdevsvcguidlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStart(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStop(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkInitSettings(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryProperty(hclienthandle: Long, opcode: Int, pdwdatasize: Long, ppvdata: Long, pwlanopcodevaluetype: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQuerySecondaryKey(hclienthandle: Long, pdwkeylength: Long, ppuckeydata: Long, pbispassphrase: Long, pbpersistent: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryStatus(hclienthandle: Long, ppwlanhostednetworkstatus: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkRefreshSecuritySettings(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetProperty(hclienthandle: Long, opcode: Int, dwdatasize: Int, pvdata: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetSecondaryKey(hclienthandle: Long, dwkeylength: Int, puckeydata: Long, bispassphrase: Int, bpersistent: Int, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStartUsing(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStopUsing(hclienthandle: Long, pfailreason: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanIhvControl(hclienthandle: Long, pinterfaceguid: Long, type: Int, dwinbuffersize: Int, pinbuffer: Long, dwoutbuffersize: Int, poutbuffer: Long, pdwbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanOpenHandle(dwclientversion: Int, preserved: Long, pdwnegotiatedversion: Long, phclienthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanQueryAutoConfigParameter(hclienthandle: Long, opcode: Int, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanQueryInterface(hclienthandle: Long, pinterfaceguid: Long, opcode: Int, preserved: Long, pdwdatasize: Long, ppdata: Long, pwlanopcodevaluetype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanReasonCodeToString(dwreasoncode: Int, dwbuffersize: Int, pstringbuffer: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanRegisterDeviceServiceNotification(hclienthandle: Long, pdevsvcguidlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanRegisterNotification(hclienthandle: Long, dwnotifsource: Int, bignoreduplicate: Int, funccallback: Long, pcallbackcontext: Long, preserved: Long, pdwprevnotifsource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanRegisterVirtualStationNotification(hclienthandle: Long, bregister: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanRenameProfile(hclienthandle: Long, pinterfaceguid: Long, stroldprofilename: Long, strnewprofilename: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanSaveTemporaryProfile(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, stralluserprofilesecurity: Long, dwflags: Int, boverwrite: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanScan(hclienthandle: Long, pinterfaceguid: Long, pdot11ssid: Long, piedata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanSetAutoConfigParameter(hclienthandle: Long, opcode: Int, dwdatasize: Int, pdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanSetFilterList(hclienthandle: Long, wlanfilterlisttype: Int, pnetworklist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanSetInterface(hclienthandle: Long, pinterfaceguid: Long, opcode: Int, dwdatasize: Int, pdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanSetProfile(hclienthandle: Long, pinterfaceguid: Long, dwflags: Int, strprofilexml: Long, stralluserprofilesecurity: Long, boverwrite: Int, preserved: Long, pdwreasoncode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileCustomUserData(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, dwdatasize: Int, pdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileEapXmlUserData(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, dwflags: Int, streapxmluserdata: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileList(hclienthandle: Long, pinterfaceguid: Long, dwitems: Int, strprofilenames: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanSetProfilePosition(hclienthandle: Long, pinterfaceguid: Long, strprofilename: Long, dwposition: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanSetPsdIEDataList(hclienthandle: Long, strformat: Long, ppsdiedatalist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanSetSecuritySettings(hclienthandle: Long, securableobject: Int, strmodifiedsddl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWifiWlanUIEditProfile(dwclientversion: Int, wstrprofilename: Long, pinterfaceguid: Long, hwnd: Long, wlstartpage: Int, preserved: Long, pwlanreasoncode: Long): Int
}

public actual fun wFDCancelOpenSession(hsessionhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWFDCancelOpenSession(hsessionhandle.rawAddress).toUInt()

public actual fun wFDCloseHandle(hclienthandle: Handle): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWFDCloseHandle(hclienthandle.rawAddress).toUInt()

public actual fun wFDCloseSession(hsessionhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWFDCloseSession(hsessionhandle.rawAddress).toUInt()

public actual fun wFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: MutPtr<UInt>, phclienthandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWFDOpenHandle(dwclientversion.toInt(), pdwnegotiatedversion.rawAddress, phclienthandle.rawAddress).toUInt()

public actual fun wFDOpenLegacySession(hclienthandle: Handle, plegacymacaddress: ConstPtr<ConstPtr<UByte>>, phsessionhandle: MutPtr<Handle>, pguidsessioninterface: MutPtr<Guid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWFDOpenLegacySession(hclienthandle.rawAddress, plegacymacaddress.rawAddress, phsessionhandle.rawAddress, pguidsessioninterface.rawAddress).toUInt()

public actual fun wFDStartOpenSession(hclienthandle: Handle, pdeviceaddress: ConstPtr<ConstPtr<UByte>>, pvcontext: ConstPtr<CVoid>, pfncallback: WfdOpenSessionCompleteCallback, phsessionhandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWFDStartOpenSession(hclienthandle.rawAddress, pdeviceaddress.rawAddress, pvcontext.rawAddress, 0L, phsessionhandle.rawAddress).toUInt()

public actual fun wFDUpdateDeviceVisibility(pdeviceaddress: ConstPtr<ConstPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWFDUpdateDeviceVisibility(pdeviceaddress.rawAddress).toUInt()

public actual fun wlanAllocateMemory(dwmemorysize: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanAllocateMemory(dwmemorysize.toInt()))

public actual fun wlanCloseHandle(hclienthandle: Handle, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanCloseHandle(hclienthandle.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanConnect(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pconnectionparameters: ConstPtr<WlanConnectionParameters>, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanConnect(hclienthandle.rawAddress, pinterfaceguid.rawAddress, pconnectionparameters.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanConnect2(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pconnectionparameters: ConstPtr<WlanConnectionParametersV2>, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanConnect2(hclienthandle.rawAddress, pinterfaceguid.rawAddress, pconnectionparameters.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanDeleteProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanDeleteProfile(hclienthandle.rawAddress, pinterfaceguid.rawAddress, strprofilename.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanDeviceServiceCommand(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pdeviceserviceguid: ConstPtr<Guid>, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: ConstPtr<CVoid>, dwoutbuffersize: UInt, poutbuffer: MutPtr<CVoid>, pdwbytesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanDeviceServiceCommand(hclienthandle.rawAddress, pinterfaceguid.rawAddress, pdeviceserviceguid.rawAddress, dwopcode.toInt(), dwinbuffersize.toInt(), pinbuffer.rawAddress, dwoutbuffersize.toInt(), poutbuffer.rawAddress, pdwbytesreturned.rawAddress).toUInt()

public actual fun wlanDisconnect(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanDisconnect(hclienthandle.rawAddress, pinterfaceguid.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanEnumInterfaces(hclienthandle: Handle, preserved: ConstPtr<CVoid>, ppinterfacelist: MutPtr<MutPtr<WlanInterfaceInfoList>>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanEnumInterfaces(hclienthandle.rawAddress, preserved.rawAddress, ppinterfacelist.rawAddress).toUInt()

public actual fun wlanExtractPsdIEDataList(hclienthandle: Handle, dwiedatasize: UInt, prawiedata: ConstPtr<UByte>, strformat: Pcwstr, preserved: ConstPtr<CVoid>, pppsdiedatalist: MutPtr<MutPtr<WlanRawDataList>>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanExtractPsdIEDataList(hclienthandle.rawAddress, dwiedatasize.toInt(), prawiedata.rawAddress, strformat.rawAddress, preserved.rawAddress, pppsdiedatalist.rawAddress).toUInt()

public actual fun wlanFreeMemory(pmemory: ConstPtr<CVoid>) {
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanFreeMemory(pmemory.rawAddress)
}

public actual fun wlanGetAvailableNetworkList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwflags: UInt, preserved: ConstPtr<CVoid>, ppavailablenetworklist: MutPtr<MutPtr<WlanAvailableNetworkList>>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList(hclienthandle.rawAddress, pinterfaceguid.rawAddress, dwflags.toInt(), preserved.rawAddress, ppavailablenetworklist.rawAddress).toUInt()

public actual fun wlanGetAvailableNetworkList2(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwflags: UInt, preserved: ConstPtr<CVoid>, ppavailablenetworklist: MutPtr<MutPtr<WlanAvailableNetworkListV2>>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList2(hclienthandle.rawAddress, pinterfaceguid.rawAddress, dwflags.toInt(), preserved.rawAddress, ppavailablenetworklist.rawAddress).toUInt()

public actual fun wlanGetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, preserved: ConstPtr<CVoid>, ppnetworklist: MutPtr<MutPtr<Dot11NetworkList>>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanGetFilterList(hclienthandle.rawAddress, wlanfilterlisttype, preserved.rawAddress, ppnetworklist.rawAddress).toUInt()

public actual fun wlanGetInterfaceCapability(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, preserved: ConstPtr<CVoid>, ppcapability: MutPtr<MutPtr<WlanInterfaceCapability>>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanGetInterfaceCapability(hclienthandle.rawAddress, pinterfaceguid.rawAddress, preserved.rawAddress, ppcapability.rawAddress).toUInt()

public actual fun wlanGetNetworkBssList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pdot11ssid: ConstPtr<Dot11Ssid>, dot11bsstype: Dot11BssType, bsecurityenabled: Bool, preserved: ConstPtr<CVoid>, ppwlanbsslist: MutPtr<MutPtr<WlanBssList>>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanGetNetworkBssList(hclienthandle.rawAddress, pinterfaceguid.rawAddress, pdot11ssid.rawAddress, dot11bsstype, bsecurityenabled, preserved.rawAddress, ppwlanbsslist.rawAddress).toUInt()

public actual fun wlanGetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, preserved: ConstPtr<CVoid>, pstrprofilexml: MutPtr<Pwstr>, pdwflags: MutPtr<UInt>, pdwgrantedaccess: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfile(hclienthandle.rawAddress, pinterfaceguid.rawAddress, strprofilename.rawAddress, preserved.rawAddress, pstrprofilexml.rawAddress, pdwflags.rawAddress, pdwgrantedaccess.rawAddress).toUInt()

public actual fun wlanGetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileCustomUserData(hclienthandle.rawAddress, pinterfaceguid.rawAddress, strprofilename.rawAddress, preserved.rawAddress, pdwdatasize.rawAddress, ppdata.rawAddress).toUInt()

public actual fun wlanGetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, preserved: ConstPtr<CVoid>, ppprofilelist: MutPtr<MutPtr<WlanProfileInfoList>>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileList(hclienthandle.rawAddress, pinterfaceguid.rawAddress, preserved.rawAddress, ppprofilelist.rawAddress).toUInt()

public actual fun wlanGetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, pvaluetype: MutPtr<WlanOpcodeValueType>, pstrcurrentsddl: MutPtr<Pwstr>, pdwgrantedaccess: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanGetSecuritySettings(hclienthandle.rawAddress, securableobject, pvaluetype.rawAddress, pstrcurrentsddl.rawAddress, pdwgrantedaccess.rawAddress).toUInt()

public actual fun wlanGetSupportedDeviceServices(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, ppdevsvcguidlist: MutPtr<MutPtr<WlanDeviceServiceGuidList>>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanGetSupportedDeviceServices(hclienthandle.rawAddress, pinterfaceguid.rawAddress, ppdevsvcguidlist.rawAddress).toUInt()

public actual fun wlanHostedNetworkForceStart(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStart(hclienthandle.rawAddress, pfailreason.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun wlanHostedNetworkForceStop(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStop(hclienthandle.rawAddress, pfailreason.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun wlanHostedNetworkInitSettings(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkInitSettings(hclienthandle.rawAddress, pfailreason.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun wlanHostedNetworkQueryProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, pdwdatasize: MutPtr<UInt>, ppvdata: MutPtr<MutPtr<CVoid>>, pwlanopcodevaluetype: MutPtr<WlanOpcodeValueType>, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryProperty(hclienthandle.rawAddress, opcode, pdwdatasize.rawAddress, ppvdata.rawAddress, pwlanopcodevaluetype.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun wlanHostedNetworkQuerySecondaryKey(hclienthandle: Handle, pdwkeylength: MutPtr<UInt>, ppuckeydata: MutPtr<MutPtr<UByte>>, pbispassphrase: MutPtr<Bool>, pbpersistent: MutPtr<Bool>, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQuerySecondaryKey(hclienthandle.rawAddress, pdwkeylength.rawAddress, ppuckeydata.rawAddress, pbispassphrase.rawAddress, pbpersistent.rawAddress, pfailreason.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun wlanHostedNetworkQueryStatus(hclienthandle: Handle, ppwlanhostednetworkstatus: MutPtr<MutPtr<WlanHostedNetworkStatus>>, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryStatus(hclienthandle.rawAddress, ppwlanhostednetworkstatus.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkRefreshSecuritySettings(hclienthandle.rawAddress, pfailreason.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun wlanHostedNetworkSetProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, dwdatasize: UInt, pvdata: ConstPtr<CVoid>, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetProperty(hclienthandle.rawAddress, opcode, dwdatasize.toInt(), pvdata.rawAddress, pfailreason.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun wlanHostedNetworkSetSecondaryKey(hclienthandle: Handle, dwkeylength: UInt, puckeydata: ConstPtr<UByte>, bispassphrase: Bool, bpersistent: Bool, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetSecondaryKey(hclienthandle.rawAddress, dwkeylength.toInt(), puckeydata.rawAddress, bispassphrase, bpersistent, pfailreason.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun wlanHostedNetworkStartUsing(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStartUsing(hclienthandle.rawAddress, pfailreason.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun wlanHostedNetworkStopUsing(hclienthandle: Handle, pfailreason: MutPtr<WlanHostedNetworkReason>, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStopUsing(hclienthandle.rawAddress, pfailreason.rawAddress, pvreserved.rawAddress).toUInt()

public actual fun wlanIhvControl(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, type: WlanIhvControlType, dwinbuffersize: UInt, pinbuffer: ConstPtr<CVoid>, dwoutbuffersize: UInt, poutbuffer: MutPtr<CVoid>, pdwbytesreturned: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanIhvControl(hclienthandle.rawAddress, pinterfaceguid.rawAddress, type, dwinbuffersize.toInt(), pinbuffer.rawAddress, dwoutbuffersize.toInt(), poutbuffer.rawAddress, pdwbytesreturned.rawAddress).toUInt()

public actual fun wlanOpenHandle(dwclientversion: UInt, preserved: ConstPtr<CVoid>, pdwnegotiatedversion: MutPtr<UInt>, phclienthandle: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanOpenHandle(dwclientversion.toInt(), preserved.rawAddress, pdwnegotiatedversion.rawAddress, phclienthandle.rawAddress).toUInt()

public actual fun wlanQueryAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<CVoid>>, pwlanopcodevaluetype: MutPtr<WlanOpcodeValueType>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanQueryAutoConfigParameter(hclienthandle.rawAddress, opcode, preserved.rawAddress, pdwdatasize.rawAddress, ppdata.rawAddress, pwlanopcodevaluetype.rawAddress).toUInt()

public actual fun wlanQueryInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, opcode: WlanIntfOpcode, preserved: ConstPtr<CVoid>, pdwdatasize: MutPtr<UInt>, ppdata: MutPtr<MutPtr<CVoid>>, pwlanopcodevaluetype: MutPtr<WlanOpcodeValueType>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanQueryInterface(hclienthandle.rawAddress, pinterfaceguid.rawAddress, opcode, preserved.rawAddress, pdwdatasize.rawAddress, ppdata.rawAddress, pwlanopcodevaluetype.rawAddress).toUInt()

public actual fun wlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: Pcwstr, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanReasonCodeToString(dwreasoncode.toInt(), dwbuffersize.toInt(), pstringbuffer.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanRegisterDeviceServiceNotification(hclienthandle: Handle, pdevsvcguidlist: ConstPtr<WlanDeviceServiceGuidList>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterDeviceServiceNotification(hclienthandle.rawAddress, pdevsvcguidlist.rawAddress).toUInt()

public actual fun wlanRegisterNotification(hclienthandle: Handle, dwnotifsource: WlanNotificationSources, bignoreduplicate: Bool, funccallback: WlanNotificationCallback, pcallbackcontext: ConstPtr<CVoid>, preserved: ConstPtr<CVoid>, pdwprevnotifsource: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterNotification(hclienthandle.rawAddress, dwnotifsource.toInt(), bignoreduplicate, 0L, pcallbackcontext.rawAddress, preserved.rawAddress, pdwprevnotifsource.rawAddress).toUInt()

public actual fun wlanRegisterVirtualStationNotification(hclienthandle: Handle, bregister: Bool, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterVirtualStationNotification(hclienthandle.rawAddress, bregister, preserved.rawAddress).toUInt()

public actual fun wlanRenameProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, stroldprofilename: Pcwstr, strnewprofilename: Pcwstr, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanRenameProfile(hclienthandle.rawAddress, pinterfaceguid.rawAddress, stroldprofilename.rawAddress, strnewprofilename.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanSaveTemporaryProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, stralluserprofilesecurity: Pcwstr, dwflags: UInt, boverwrite: Bool, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanSaveTemporaryProfile(hclienthandle.rawAddress, pinterfaceguid.rawAddress, strprofilename.rawAddress, stralluserprofilesecurity.rawAddress, dwflags.toInt(), boverwrite, preserved.rawAddress).toUInt()

public actual fun wlanScan(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, pdot11ssid: ConstPtr<Dot11Ssid>, piedata: ConstPtr<WlanRawData>, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanScan(hclienthandle.rawAddress, pinterfaceguid.rawAddress, pdot11ssid.rawAddress, piedata.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanSetAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, dwdatasize: UInt, pdata: ConstPtr<CVoid>, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanSetAutoConfigParameter(hclienthandle.rawAddress, opcode, dwdatasize.toInt(), pdata.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanSetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, pnetworklist: ConstPtr<Dot11NetworkList>, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanSetFilterList(hclienthandle.rawAddress, wlanfilterlisttype, pnetworklist.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanSetInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, opcode: WlanIntfOpcode, dwdatasize: UInt, pdata: ConstPtr<CVoid>, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanSetInterface(hclienthandle.rawAddress, pinterfaceguid.rawAddress, opcode, dwdatasize.toInt(), pdata.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanSetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwflags: UInt, strprofilexml: Pcwstr, stralluserprofilesecurity: Pcwstr, boverwrite: Bool, preserved: ConstPtr<CVoid>, pdwreasoncode: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfile(hclienthandle.rawAddress, pinterfaceguid.rawAddress, dwflags.toInt(), strprofilexml.rawAddress, stralluserprofilesecurity.rawAddress, boverwrite, preserved.rawAddress, pdwreasoncode.rawAddress).toUInt()

public actual fun wlanSetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, dwdatasize: UInt, pdata: ConstPtr<UByte>, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileCustomUserData(hclienthandle.rawAddress, pinterfaceguid.rawAddress, strprofilename.rawAddress, dwdatasize.toInt(), pdata.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanSetProfileEapUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, eaptype: EapMethodType, dwflags: WlanSetEaphostFlags, dweapuserdatasize: UInt, pbeapuserdata: ConstPtr<UByte>, preserved: ConstPtr<CVoid>): UInt =
    0u

public actual fun wlanSetProfileEapXmlUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, dwflags: WlanSetEaphostFlags, streapxmluserdata: Pcwstr, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileEapXmlUserData(hclienthandle.rawAddress, pinterfaceguid.rawAddress, strprofilename.rawAddress, dwflags.toInt(), streapxmluserdata.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanSetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, dwitems: UInt, strprofilenames: ConstPtr<Pcwstr>, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileList(hclienthandle.rawAddress, pinterfaceguid.rawAddress, dwitems.toInt(), strprofilenames.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanSetProfilePosition(hclienthandle: Handle, pinterfaceguid: ConstPtr<Guid>, strprofilename: Pcwstr, dwposition: UInt, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfilePosition(hclienthandle.rawAddress, pinterfaceguid.rawAddress, strprofilename.rawAddress, dwposition.toInt(), preserved.rawAddress).toUInt()

public actual fun wlanSetPsdIEDataList(hclienthandle: Handle, strformat: Pcwstr, ppsdiedatalist: ConstPtr<WlanRawDataList>, preserved: ConstPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanSetPsdIEDataList(hclienthandle.rawAddress, strformat.rawAddress, ppsdiedatalist.rawAddress, preserved.rawAddress).toUInt()

public actual fun wlanSetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, strmodifiedsddl: Pcwstr): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanSetSecuritySettings(hclienthandle.rawAddress, securableobject, strmodifiedsddl.rawAddress).toUInt()

public actual fun wlanUIEditProfile(dwclientversion: UInt, wstrprofilename: Pcwstr, pinterfaceguid: ConstPtr<Guid>, hwnd: Hwnd, wlstartpage: WlDisplayPages, preserved: ConstPtr<CVoid>, pwlanreasoncode: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementWifiJniBridge.windowssysWindowsWin32NetworkmanagementWifiWlanUIEditProfile(dwclientversion.toInt(), wstrprofilename.rawAddress, pinterfaceguid.rawAddress, hwnd.rawAddress, wlstartpage, preserved.rawAddress, pwlanreasoncode.rawAddress).toUInt()
