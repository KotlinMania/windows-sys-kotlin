@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.AddressFamily
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.NlNetworkConnectivityHint
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.Sockaddr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrIn6
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrIn6Pair
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.SockaddrInet
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfCompartmentId
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetLuidLh
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

private object WindowsWin32NetworkmanagementIphelperJniBridge {
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
        val stream = WindowsWin32NetworkmanagementIphelperJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32NetworkmanagementIphelperAddIPAddress(address: Int, ipmask: Int, ifindex: Int, ntecontext: Long, nteinstance: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCancelIPChangeNotify(notifyoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCancelIfTimestampConfigChange(notificationhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCancelMibChangeNotify2(notificationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCaptureInterfaceHardwareCrossTimestamp(interfaceluid: Long, crosstimestamp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentGuidToId(compartmentguid: Long, compartmentid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentIdToGuid(compartmentid: Int, compartmentguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceAliasToLuid(interfacealias: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceGuidToLuid(interfaceguid: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceIndexToLuid(interfaceindex: Int, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToAlias(interfaceluid: Long, interfacealias: Long, length: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToGuid(interfaceluid: Long, interfaceguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToIndex(interfaceluid: Long, interfaceindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameA(interfaceluid: Long, interfacename: Long, length: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameW(interfaceluid: Long, interfacename: Long, length: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidA(interfacename: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidW(interfacename: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertIpv4MaskToLength(mask: Int, masklength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperConvertLengthToIpv4Mask(masklength: Int, mask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCreateAnycastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry(proute: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry2(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry(parpentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentTcpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentUdpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCreateProxyArpEntry(dwaddress: Int, dwmask: Int, dwifindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCreateSortedAddressPairs(sourceaddresslist: Long, sourceaddresscount: Int, destinationaddresslist: Long, destinationaddresscount: Int, addresssortoptions: Int, sortedaddresspairlist: Long, sortedaddresspaircount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperCreateUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperDeleteAnycastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperDeleteIPAddress(ntecontext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry(proute: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry2(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry(parpentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentTcpPortReservation(startport: Short, numberofports: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentUdpPortReservation(startport: Short, numberofports: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperDeleteProxyArpEntry(dwaddress: Int, dwmask: Int, dwifindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperDeleteUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperDisableMediaSense(phandle: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperEnableRouter(phandle: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable(dwifindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable2(family: Short, interfaceindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperFlushIpPathTable(family: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperFreeDnsSettings(settings: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperFreeInterfaceDnsSettings(settings: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperFreeMibTable(memory: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetAdapterIndex(adaptername: Long, ifindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetAdapterOrderMap(): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersAddresses(family: Int, flags: Int, reserved: Long, adapteraddresses: Long, sizepointer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersInfo(adapterinfo: Long, sizepointer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetBestInterface(dwdestaddr: Int, pdwbestifindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetBestInterfaceEx(pdestaddr: Long, pdwbestifindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute(dwdestaddr: Int, dwsourceaddr: Int, pbestroute: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute2(interfaceluid: Long, interfaceindex: Int, sourceaddress: Long, destinationaddress: Long, addresssortoptions: Int, bestroute: Long, bestsourceaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentId(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentScope(compartmentscope: Long, compartmentid: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetDefaultCompartmentId(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetDnsSettings(settings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetExtendedTcpTable(ptcptable: Long, pdwsize: Long, border: Int, ulaf: Int, tableclass: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetExtendedUdpTable(pudptable: Long, pdwsize: Long, border: Int, ulaf: Int, tableclass: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetFriendlyIfIndex(ifindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatistics(statistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry(pifrow: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2Ex(level: Int, row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIfStackTable(table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIfTable(piftable: Long, pdwsize: Long, border: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2(table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2Ex(level: Int, table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceActiveTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceCurrentTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceHardwareTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceInfo(piftable: Long, dwoutbuflen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceSupportedTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetInvertedIfStackTable(table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpAddrTable(pipaddrtable: Long, pdwsize: Long, border: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpErrorString(errorcode: Int, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardEntry2(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable(pipforwardtable: Long, pdwsize: Long, border: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable2(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceEntry(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable(ipnettable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable2(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpNetworkConnectionBandwidthEstimates(interfaceindex: Int, addressfamily: Short, bandwidthestimates: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpPathEntry(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpPathTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpStatistics(statistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetIpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetJobCompartmentId(jobhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHint(connectivityhint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHintForInterface(interfaceindex: Int, connectivityhint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetNetworkInformation(networkguid: Long, compartmentid: Long, siteid: Long, networkname: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetNetworkParams(pfixedinfo: Long, poutbuflen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetNumberOfInterfaces(pdwnumif: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromPidAndInfo(ulpid: Int, pinfo: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcp6Entry(ptcpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcpEntry(ptcpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdp6Entry(pudpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdpEntry(pudpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetPerAdapterInfo(ifindex: Int, pperadapterinfo: Long, poutbuflen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetPerTcp6ConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, ros: Long, rosversion: Int, rossize: Int, rod: Long, rodversion: Int, rodsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetPerTcpConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, ros: Long, rosversion: Int, rossize: Int, rod: Long, rodversion: Int, rodsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetRTTAndHopCount(destipaddress: Int, hopcount: Long, maxhops: Int, rtt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetSessionCompartmentId(sessionid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table2(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatistics(statistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx2(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable2(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetTeredoPort(port: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetUdp6Table(udp6table: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatistics(stats: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx2(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetUdpTable(udptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetUniDirectionalAdapterInfo(pipifinfo: Long, dwoutbuflen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIcmp6CreateFile(): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIcmp6ParseReplies(replybuffer: Long, replysize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIcmp6SendEcho2(icmphandle: Long, event: Long, apcroutine: Long, apccontext: Long, sourceaddress: Long, destinationaddress: Long, requestdata: Long, requestsize: Short, requestoptions: Long, replybuffer: Long, replysize: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIcmpCloseHandle(icmphandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIcmpCreateFile(): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIcmpParseReplies(replybuffer: Long, replysize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho(icmphandle: Long, destinationaddress: Int, requestdata: Long, requestsize: Short, requestoptions: Long, replybuffer: Long, replysize: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2(icmphandle: Long, event: Long, apcroutine: Long, apccontext: Long, destinationaddress: Int, requestdata: Long, requestsize: Short, requestoptions: Long, replybuffer: Long, replysize: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2Ex(icmphandle: Long, event: Long, apcroutine: Long, apccontext: Long, sourceaddress: Int, destinationaddress: Int, requestdata: Long, requestsize: Short, requestoptions: Long, replybuffer: Long, replysize: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperInitializeIpForwardEntry(row: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperInitializeIpInterfaceEntry(row: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperInitializeUnicastIpAddressEntry(row: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIpReleaseAddress(adapterinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIpRenewAddress(adapterinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentTcpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentUdpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperNhpAllocateAndGetInterfaceInfoFromStack(pptable: Long, pdwcount: Long, border: Int, hheap: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperNotifyAddrChange(handle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperNotifyIfTimestampConfigChange(callercontext: Long, callback: Long, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperNotifyIpInterfaceChange(family: Short, callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperNotifyNetworkConnectivityHintChange(callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange(handle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange2(addressfamily: Short, callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperNotifyStableUnicastIpAddressTable(family: Short, table: Long, callercallback: Long, callercontext: Long, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperNotifyTeredoPortChange(callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperNotifyUnicastIpAddressChange(family: Short, callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperParseNetworkString(networkstring: Long, types: Int, addressinfo: Long, portnumber: Long, prefixlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfAddFiltersToInterface(ih: Long, cinfilters: Int, pfiltin: Long, coutfilters: Int, pfiltout: Long, pfhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfAddGlobalFilterToInterface(pinterface: Long, gffilter: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIPAddress(pinterface: Long, pfattype: Int, ipaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIndex(pinterface: Long, dwindex: Int, pfatlinktype: Int, linkipaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfCreateInterface(dwname: Int, inaction: Int, outaction: Int, buselog: Int, bmustbeunique: Int, ppinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfDeleteInterface(pinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfDeleteLog(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfGetInterfaceStatistics(pinterface: Long, ppfstats: Long, pdwbuffersize: Long, fresetcounters: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfMakeLog(hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfRebindFilters(pinterface: Long, platebindinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFilterHandles(pinterface: Long, cfilters: Int, pvhandles: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFiltersFromInterface(ih: Long, cinfilters: Int, pfiltin: Long, coutfilters: Int, pfiltout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfRemoveGlobalFilterFromInterface(pinterface: Long, gffilter: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfSetLogBuffer(pbbuffer: Long, dwsize: Int, dwthreshold: Int, dwentries: Int, pdwloggedentries: Long, pdwlostentries: Long, pdwsizeused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfTestPacket(pininterface: Long, poutinterface: Long, cbytes: Int, pbpacket: Long, ppaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperPfUnBindInterface(pinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperRegisterInterfaceTimestampConfigChange(callback: Long, callercontext: Long, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperResolveIpNetEntry2(row: Long, sourceaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperResolveNeighbor(networkaddress: Long, physicaladdress: Long, physicaladdresslength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperRestoreMediaSense(poverlapped: Long, lpdwenablecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSendARP(destip: Int, srcip: Int, pmacaddr: Long, phyaddrlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentId(compartmentid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentScope(compartmentscope: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetDnsSettings(settings: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetIfEntry(pifrow: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry(proute: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry2(route: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetIpInterfaceEntry(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry(parpentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetIpStatistics(pipstats: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetIpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetIpTTL(nttl: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetJobCompartmentId(jobhandle: Long, compartmentid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetNetworkInformation(networkguid: Long, compartmentid: Int, networkname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetPerTcp6ConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, offset: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetPerTcpConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, offset: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetSessionCompartmentId(sessionid: Int, compartmentid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetTcpEntry(ptcprow: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperSetUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperUnenableRouter(poverlapped: Long, lpdwenablecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperUnregisterInterfaceTimestampConfigChange(notificationhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIfIndextoname(interfaceindex: Int, interfacename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementIphelperIfNametoindex(interfacename: Long): Int
}

public actual fun addIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: MutPtr<UInt>, nteinstance: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperAddIPAddress(address.toInt(), ipmask.toInt(), ifindex.toInt(), ntecontext.rawAddress, nteinstance.rawAddress).toUInt()

public actual fun cancelIPChangeNotify(notifyoverlapped: ConstPtr<Overlapped>): Bool =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCancelIPChangeNotify(notifyoverlapped.rawAddress)

public actual fun cancelIfTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCancelIfTimestampConfigChange(notificationhandle.rawAddress)
}

public actual fun cancelMibChangeNotify2(notificationhandle: Handle): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCancelMibChangeNotify2(notificationhandle.rawAddress).toUInt()

public actual fun captureInterfaceHardwareCrossTimestamp(interfaceluid: ConstPtr<NetLuidLh>, crosstimestamp: MutPtr<InterfaceHardwareCrosstimestamp>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCaptureInterfaceHardwareCrossTimestamp(interfaceluid.rawAddress, crosstimestamp.rawAddress).toUInt()

public actual fun convertCompartmentGuidToId(compartmentguid: ConstPtr<Guid>, compartmentid: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentGuidToId(compartmentguid.rawAddress, compartmentid.rawAddress).toUInt()

public actual fun convertCompartmentIdToGuid(compartmentid: NetIfCompartmentId, compartmentguid: MutPtr<Guid>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentIdToGuid(compartmentid.toInt(), compartmentguid.rawAddress).toUInt()

public actual fun convertInterfaceAliasToLuid(interfacealias: Pcwstr, interfaceluid: MutPtr<NetLuidLh>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceAliasToLuid(interfacealias.rawAddress, interfaceluid.rawAddress).toUInt()

public actual fun convertInterfaceGuidToLuid(interfaceguid: ConstPtr<Guid>, interfaceluid: MutPtr<NetLuidLh>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceGuidToLuid(interfaceguid.rawAddress, interfaceluid.rawAddress).toUInt()

public actual fun convertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: MutPtr<NetLuidLh>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceIndexToLuid(interfaceindex.toInt(), interfaceluid.rawAddress).toUInt()

public actual fun convertInterfaceLuidToAlias(interfaceluid: ConstPtr<NetLuidLh>, interfacealias: Pwstr, length: ULong): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToAlias(interfaceluid.rawAddress, interfacealias.rawAddress, length.toLong()).toUInt()

public actual fun convertInterfaceLuidToGuid(interfaceluid: ConstPtr<NetLuidLh>, interfaceguid: MutPtr<Guid>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToGuid(interfaceluid.rawAddress, interfaceguid.rawAddress).toUInt()

public actual fun convertInterfaceLuidToIndex(interfaceluid: ConstPtr<NetLuidLh>, interfaceindex: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToIndex(interfaceluid.rawAddress, interfaceindex.rawAddress).toUInt()

public actual fun convertInterfaceLuidToNameA(interfaceluid: ConstPtr<NetLuidLh>, interfacename: Pstr, length: ULong): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameA(interfaceluid.rawAddress, interfacename.rawAddress, length.toLong()).toUInt()

public actual fun convertInterfaceLuidToNameW(interfaceluid: ConstPtr<NetLuidLh>, interfacename: Pwstr, length: ULong): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameW(interfaceluid.rawAddress, interfacename.rawAddress, length.toLong()).toUInt()

public actual fun convertInterfaceNameToLuidA(interfacename: Pcstr, interfaceluid: MutPtr<NetLuidLh>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidA(interfacename.rawAddress, interfaceluid.rawAddress).toUInt()

public actual fun convertInterfaceNameToLuidW(interfacename: Pcwstr, interfaceluid: MutPtr<NetLuidLh>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidW(interfacename.rawAddress, interfaceluid.rawAddress).toUInt()

public actual fun convertIpv4MaskToLength(mask: UInt, masklength: MutPtr<UByte>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertIpv4MaskToLength(mask.toInt(), masklength.rawAddress).toUInt()

public actual fun convertLengthToIpv4Mask(masklength: UInt, mask: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperConvertLengthToIpv4Mask(masklength.toInt(), mask.rawAddress).toUInt()

public actual fun createAnycastIpAddressEntry(row: ConstPtr<MibAnycastipaddressRow>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCreateAnycastIpAddressEntry(row.rawAddress).toUInt()

public actual fun createIpForwardEntry(proute: ConstPtr<MibIpforwardrow>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry(proute.rawAddress).toUInt()

public actual fun createIpForwardEntry2(row: ConstPtr<MibIpforwardRow2>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry2(row.rawAddress).toUInt()

public actual fun createIpNetEntry(parpentry: ConstPtr<MibIpnetrowLh>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry(parpentry.rawAddress).toUInt()

public actual fun createIpNetEntry2(row: ConstPtr<MibIpnetRow2>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry2(row.rawAddress).toUInt()

public actual fun createPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentTcpPortReservation(startport.toShort(), numberofports.toShort(), token.rawAddress).toUInt()

public actual fun createPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentUdpPortReservation(startport.toShort(), numberofports.toShort(), token.rawAddress).toUInt()

public actual fun createProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCreateProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt()

public actual fun createSortedAddressPairs(sourceaddresslist: ConstPtr<SockaddrIn6>, sourceaddresscount: UInt, destinationaddresslist: ConstPtr<SockaddrIn6>, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: MutPtr<MutPtr<SockaddrIn6Pair>>, sortedaddresspaircount: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCreateSortedAddressPairs(sourceaddresslist.rawAddress, sourceaddresscount.toInt(), destinationaddresslist.rawAddress, destinationaddresscount.toInt(), addresssortoptions.toInt(), sortedaddresspairlist.rawAddress, sortedaddresspaircount.rawAddress).toUInt()

public actual fun createUnicastIpAddressEntry(row: ConstPtr<MibUnicastipaddressRow>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperCreateUnicastIpAddressEntry(row.rawAddress).toUInt()

public actual fun deleteAnycastIpAddressEntry(row: ConstPtr<MibAnycastipaddressRow>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperDeleteAnycastIpAddressEntry(row.rawAddress).toUInt()

public actual fun deleteIPAddress(ntecontext: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperDeleteIPAddress(ntecontext.toInt()).toUInt()

public actual fun deleteIpForwardEntry(proute: ConstPtr<MibIpforwardrow>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry(proute.rawAddress).toUInt()

public actual fun deleteIpForwardEntry2(row: ConstPtr<MibIpforwardRow2>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry2(row.rawAddress).toUInt()

public actual fun deleteIpNetEntry(parpentry: ConstPtr<MibIpnetrowLh>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry(parpentry.rawAddress).toUInt()

public actual fun deleteIpNetEntry2(row: ConstPtr<MibIpnetRow2>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry2(row.rawAddress).toUInt()

public actual fun deletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentTcpPortReservation(startport.toShort(), numberofports.toShort()).toUInt()

public actual fun deletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentUdpPortReservation(startport.toShort(), numberofports.toShort()).toUInt()

public actual fun deleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperDeleteProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt()

public actual fun deleteUnicastIpAddressEntry(row: ConstPtr<MibUnicastipaddressRow>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperDeleteUnicastIpAddressEntry(row.rawAddress).toUInt()

public actual fun disableMediaSense(phandle: MutPtr<Handle>, poverlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperDisableMediaSense(phandle.rawAddress, poverlapped.rawAddress).toUInt()

public actual fun enableRouter(phandle: MutPtr<Handle>, poverlapped: MutPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperEnableRouter(phandle.rawAddress, poverlapped.rawAddress).toUInt()

public actual fun flushIpNetTable(dwifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable(dwifindex.toInt()).toUInt()

public actual fun flushIpNetTable2(family: AddressFamily, interfaceindex: UInt): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable2(family.toShort(), interfaceindex.toInt()).toUInt()

public actual fun flushIpPathTable(family: AddressFamily): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperFlushIpPathTable(family.toShort()).toUInt()

public actual fun freeDnsSettings(settings: MutPtr<DnsSettings>) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperFreeDnsSettings(settings.rawAddress)
}

public actual fun freeInterfaceDnsSettings(settings: MutPtr<DnsInterfaceSettings>) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperFreeInterfaceDnsSettings(settings.rawAddress)
}

public actual fun freeMibTable(memory: ConstPtr<CVoid>) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperFreeMibTable(memory.rawAddress)
}

public actual fun getAdapterIndex(adaptername: Pcwstr, ifindex: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetAdapterIndex(adaptername.rawAddress, ifindex.rawAddress).toUInt()

public actual fun getAdapterOrderMap(): MutPtr<IpAdapterOrderMap> =
    MutPtr(WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetAdapterOrderMap())

public actual fun getAdaptersAddresses(family: UInt, flags: GetAdaptersAddressesFlags, reserved: ConstPtr<CVoid>, adapteraddresses: MutPtr<IpAdapterAddressesLh>, sizepointer: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersAddresses(family.toInt(), flags.toInt(), reserved.rawAddress, adapteraddresses.rawAddress, sizepointer.rawAddress).toUInt()

public actual fun getAdaptersInfo(adapterinfo: MutPtr<IpAdapterInfo>, sizepointer: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersInfo(adapterinfo.rawAddress, sizepointer.rawAddress).toUInt()

public actual fun getAnycastIpAddressEntry(row: MutPtr<MibAnycastipaddressRow>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressEntry(row.rawAddress).toUInt()

public actual fun getAnycastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibAnycastipaddressTable>>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressTable(family.toShort(), table.rawAddress).toUInt()

public actual fun getBestInterface(dwdestaddr: UInt, pdwbestifindex: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetBestInterface(dwdestaddr.toInt(), pdwbestifindex.rawAddress).toUInt()

public actual fun getBestInterfaceEx(pdestaddr: ConstPtr<Sockaddr>, pdwbestifindex: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetBestInterfaceEx(pdestaddr.rawAddress, pdwbestifindex.rawAddress).toUInt()

public actual fun getBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: MutPtr<MibIpforwardrow>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute(dwdestaddr.toInt(), dwsourceaddr.toInt(), pbestroute.rawAddress).toUInt()

public actual fun getBestRoute2(interfaceluid: ConstPtr<NetLuidLh>, interfaceindex: UInt, sourceaddress: ConstPtr<SockaddrInet>, destinationaddress: ConstPtr<SockaddrInet>, addresssortoptions: UInt, bestroute: MutPtr<MibIpforwardRow2>, bestsourceaddress: MutPtr<SockaddrInet>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute2(interfaceluid.rawAddress, interfaceindex.toInt(), sourceaddress.rawAddress, destinationaddress.rawAddress, addresssortoptions.toInt(), bestroute.rawAddress, bestsourceaddress.rawAddress).toUInt()

public actual fun getCurrentThreadCompartmentId(): NetIfCompartmentId =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentId().toUInt()

public actual fun getCurrentThreadCompartmentScope(compartmentscope: MutPtr<UInt>, compartmentid: MutPtr<UInt>) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentScope(compartmentscope.rawAddress, compartmentid.rawAddress)
}

public actual fun getDefaultCompartmentId(): NetIfCompartmentId =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetDefaultCompartmentId().toUInt()

public actual fun getDnsSettings(settings: MutPtr<DnsSettings>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetDnsSettings(settings.rawAddress).toUInt()

public actual fun getExtendedTcpTable(ptcptable: MutPtr<CVoid>, pdwsize: MutPtr<UInt>, border: Bool, ulaf: UInt, tableclass: TcpTableClass, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetExtendedTcpTable(ptcptable.rawAddress, pdwsize.rawAddress, border, ulaf.toInt(), tableclass, reserved.toInt()).toUInt()

public actual fun getExtendedUdpTable(pudptable: MutPtr<CVoid>, pdwsize: MutPtr<UInt>, border: Bool, ulaf: UInt, tableclass: UdpTableClass, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetExtendedUdpTable(pudptable.rawAddress, pdwsize.rawAddress, border, ulaf.toInt(), tableclass, reserved.toInt()).toUInt()

public actual fun getFriendlyIfIndex(ifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetFriendlyIfIndex(ifindex.toInt()).toUInt()

public actual fun getIcmpStatistics(statistics: MutPtr<MibIcmp>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatistics(statistics.rawAddress).toUInt()

public actual fun getIcmpStatisticsEx(statistics: MutPtr<MibIcmpExXpsp1>, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatisticsEx(statistics.rawAddress, family.toInt()).toUInt()

public actual fun getIfEntry(pifrow: MutPtr<MibIfrow>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry(pifrow.rawAddress).toUInt()

public actual fun getIfEntry2(row: MutPtr<MibIfRow2>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2(row.rawAddress).toUInt()

public actual fun getIfEntry2Ex(level: MibIfEntryLevel, row: MutPtr<MibIfRow2>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2Ex(level, row.rawAddress).toUInt()

public actual fun getIfStackTable(table: MutPtr<MutPtr<MibIfstackTable>>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIfStackTable(table.rawAddress).toUInt()

public actual fun getIfTable(piftable: MutPtr<MibIftable>, pdwsize: MutPtr<UInt>, border: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIfTable(piftable.rawAddress, pdwsize.rawAddress, border).toUInt()

public actual fun getIfTable2(table: MutPtr<MutPtr<MibIfTable2>>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2(table.rawAddress).toUInt()

public actual fun getIfTable2Ex(level: MibIfTableLevel, table: MutPtr<MutPtr<MibIfTable2>>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2Ex(level, table.rawAddress).toUInt()

public actual fun getInterfaceActiveTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceActiveTimestampCapabilities(interfaceluid.rawAddress, timestampcapabilites.rawAddress).toUInt()

public actual fun getInterfaceCurrentTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceCurrentTimestampCapabilities(interfaceluid.rawAddress, timestampcapabilites.rawAddress).toUInt()

public actual fun getInterfaceDnsSettings(iface: Guid, settings: MutPtr<DnsInterfaceSettings>): Win32Error =
    0u

public actual fun getInterfaceHardwareTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceHardwareTimestampCapabilities(interfaceluid.rawAddress, timestampcapabilites.rawAddress).toUInt()

public actual fun getInterfaceInfo(piftable: MutPtr<IpInterfaceInfo>, dwoutbuflen: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceInfo(piftable.rawAddress, dwoutbuflen.rawAddress).toUInt()

public actual fun getInterfaceSupportedTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceSupportedTimestampCapabilities(interfaceluid.rawAddress, timestampcapabilites.rawAddress).toUInt()

public actual fun getInvertedIfStackTable(table: MutPtr<MutPtr<MibInvertedifstackTable>>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetInvertedIfStackTable(table.rawAddress).toUInt()

public actual fun getIpAddrTable(pipaddrtable: MutPtr<MibIpaddrtable>, pdwsize: MutPtr<UInt>, border: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpAddrTable(pipaddrtable.rawAddress, pdwsize.rawAddress, border).toUInt()

public actual fun getIpErrorString(errorcode: UInt, buffer: Pwstr, size: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpErrorString(errorcode.toInt(), buffer.rawAddress, size.rawAddress).toUInt()

public actual fun getIpForwardEntry2(row: MutPtr<MibIpforwardRow2>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardEntry2(row.rawAddress).toUInt()

public actual fun getIpForwardTable(pipforwardtable: MutPtr<MibIpforwardtable>, pdwsize: MutPtr<UInt>, border: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable(pipforwardtable.rawAddress, pdwsize.rawAddress, border).toUInt()

public actual fun getIpForwardTable2(family: AddressFamily, table: MutPtr<MutPtr<MibIpforwardTable2>>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable2(family.toShort(), table.rawAddress).toUInt()

public actual fun getIpInterfaceEntry(row: MutPtr<MibIpinterfaceRow>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceEntry(row.rawAddress).toUInt()

public actual fun getIpInterfaceTable(family: AddressFamily, table: MutPtr<MutPtr<MibIpinterfaceTable>>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceTable(family.toShort(), table.rawAddress).toUInt()

public actual fun getIpNetEntry2(row: MutPtr<MibIpnetRow2>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetEntry2(row.rawAddress).toUInt()

public actual fun getIpNetTable(ipnettable: MutPtr<MibIpnettable>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable(ipnettable.rawAddress, sizepointer.rawAddress, order).toUInt()

public actual fun getIpNetTable2(family: AddressFamily, table: MutPtr<MutPtr<MibIpnetTable2>>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable2(family.toShort(), table.rawAddress).toUInt()

public actual fun getIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: AddressFamily, bandwidthestimates: MutPtr<MibIpNetworkConnectionBandwidthEstimates>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetworkConnectionBandwidthEstimates(interfaceindex.toInt(), addressfamily.toShort(), bandwidthestimates.rawAddress).toUInt()

public actual fun getIpPathEntry(row: MutPtr<MibIppathRow>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpPathEntry(row.rawAddress).toUInt()

public actual fun getIpPathTable(family: AddressFamily, table: MutPtr<MutPtr<MibIppathTable>>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpPathTable(family.toShort(), table.rawAddress).toUInt()

public actual fun getIpStatistics(statistics: MutPtr<MibIpstatsLh>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpStatistics(statistics.rawAddress).toUInt()

public actual fun getIpStatisticsEx(statistics: MutPtr<MibIpstatsLh>, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetIpStatisticsEx(statistics.rawAddress, family.toInt()).toUInt()

public actual fun getJobCompartmentId(jobhandle: Handle): NetIfCompartmentId =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetJobCompartmentId(jobhandle.rawAddress).toUInt()

public actual fun getMulticastIpAddressEntry(row: MutPtr<MibMulticastipaddressRow>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressEntry(row.rawAddress).toUInt()

public actual fun getMulticastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibMulticastipaddressTable>>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressTable(family.toShort(), table.rawAddress).toUInt()

public actual fun getNetworkConnectivityHint(connectivityhint: MutPtr<NlNetworkConnectivityHint>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHint(connectivityhint.rawAddress).toUInt()

public actual fun getNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: MutPtr<NlNetworkConnectivityHint>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHintForInterface(interfaceindex.toInt(), connectivityhint.rawAddress).toUInt()

public actual fun getNetworkInformation(networkguid: ConstPtr<Guid>, compartmentid: MutPtr<UInt>, siteid: MutPtr<UInt>, networkname: Pwstr, length: UInt): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkInformation(networkguid.rawAddress, compartmentid.rawAddress, siteid.rawAddress, networkname.rawAddress, length.toInt()).toUInt()

public actual fun getNetworkParams(pfixedinfo: MutPtr<FixedInfoW2ksp1>, poutbuflen: MutPtr<UInt>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkParams(pfixedinfo.rawAddress, poutbuflen.rawAddress).toUInt()

public actual fun getNumberOfInterfaces(pdwnumif: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetNumberOfInterfaces(pdwnumif.rawAddress).toUInt()

public actual fun getOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: ConstPtr<ULong>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromPidAndInfo(ulpid.toInt(), pinfo.rawAddress, cls, pbuffer.rawAddress, pdwsize.rawAddress).toUInt()

public actual fun getOwnerModuleFromTcp6Entry(ptcpentry: ConstPtr<MibTcp6rowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcp6Entry(ptcpentry.rawAddress, cls, pbuffer.rawAddress, pdwsize.rawAddress).toUInt()

public actual fun getOwnerModuleFromTcpEntry(ptcpentry: ConstPtr<MibTcprowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcpEntry(ptcpentry.rawAddress, cls, pbuffer.rawAddress, pdwsize.rawAddress).toUInt()

public actual fun getOwnerModuleFromUdp6Entry(pudpentry: ConstPtr<MibUdp6rowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdp6Entry(pudpentry.rawAddress, cls, pbuffer.rawAddress, pdwsize.rawAddress).toUInt()

public actual fun getOwnerModuleFromUdpEntry(pudpentry: ConstPtr<MibUdprowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdpEntry(pudpentry.rawAddress, cls, pbuffer.rawAddress, pdwsize.rawAddress).toUInt()

public actual fun getPerAdapterInfo(ifindex: UInt, pperadapterinfo: MutPtr<IpPerAdapterInfoW2ksp1>, poutbuflen: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetPerAdapterInfo(ifindex.toInt(), pperadapterinfo.rawAddress, poutbuflen.rawAddress).toUInt()

public actual fun getPerTcp6ConnectionEStats(row: ConstPtr<MibTcp6row>, estatstype: TcpEstatsType, rw: MutPtr<UByte>, rwversion: UInt, rwsize: UInt, ros: MutPtr<UByte>, rosversion: UInt, rossize: UInt, rod: MutPtr<UByte>, rodversion: UInt, rodsize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetPerTcp6ConnectionEStats(row.rawAddress, estatstype, rw.rawAddress, rwversion.toInt(), rwsize.toInt(), ros.rawAddress, rosversion.toInt(), rossize.toInt(), rod.rawAddress, rodversion.toInt(), rodsize.toInt()).toUInt()

public actual fun getPerTcpConnectionEStats(row: ConstPtr<MibTcprowLh>, estatstype: TcpEstatsType, rw: MutPtr<UByte>, rwversion: UInt, rwsize: UInt, ros: MutPtr<UByte>, rosversion: UInt, rossize: UInt, rod: MutPtr<UByte>, rodversion: UInt, rodsize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetPerTcpConnectionEStats(row.rawAddress, estatstype, rw.rawAddress, rwversion.toInt(), rwsize.toInt(), ros.rawAddress, rosversion.toInt(), rossize.toInt(), rod.rawAddress, rodversion.toInt(), rodsize.toInt()).toUInt()

public actual fun getRTTAndHopCount(destipaddress: UInt, hopcount: MutPtr<UInt>, maxhops: UInt, rtt: MutPtr<UInt>): Bool =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetRTTAndHopCount(destipaddress.toInt(), hopcount.rawAddress, maxhops.toInt(), rtt.rawAddress)

public actual fun getSessionCompartmentId(sessionid: UInt): NetIfCompartmentId =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetSessionCompartmentId(sessionid.toInt()).toUInt()

public actual fun getTcp6Table(tcptable: MutPtr<MibTcp6table>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table(tcptable.rawAddress, sizepointer.rawAddress, order).toUInt()

public actual fun getTcp6Table2(tcptable: MutPtr<MibTcp6table2>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table2(tcptable.rawAddress, sizepointer.rawAddress, order).toUInt()

public actual fun getTcpStatistics(statistics: MutPtr<MibTcpstatsLh>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatistics(statistics.rawAddress).toUInt()

public actual fun getTcpStatisticsEx(statistics: MutPtr<MibTcpstatsLh>, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx(statistics.rawAddress, family.toInt()).toUInt()

public actual fun getTcpStatisticsEx2(statistics: MutPtr<MibTcpstats2>, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx2(statistics.rawAddress, family.toInt()).toUInt()

public actual fun getTcpTable(tcptable: MutPtr<MibTcptable>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable(tcptable.rawAddress, sizepointer.rawAddress, order).toUInt()

public actual fun getTcpTable2(tcptable: MutPtr<MibTcptable2>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable2(tcptable.rawAddress, sizepointer.rawAddress, order).toUInt()

public actual fun getTeredoPort(port: MutPtr<UShort>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetTeredoPort(port.rawAddress).toUInt()

public actual fun getUdp6Table(udp6table: MutPtr<MibUdp6table>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetUdp6Table(udp6table.rawAddress, sizepointer.rawAddress, order).toUInt()

public actual fun getUdpStatistics(stats: MutPtr<MibUdpstats>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatistics(stats.rawAddress).toUInt()

public actual fun getUdpStatisticsEx(statistics: MutPtr<MibUdpstats>, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx(statistics.rawAddress, family.toInt()).toUInt()

public actual fun getUdpStatisticsEx2(statistics: MutPtr<MibUdpstats2>, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx2(statistics.rawAddress, family.toInt()).toUInt()

public actual fun getUdpTable(udptable: MutPtr<MibUdptable>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetUdpTable(udptable.rawAddress, sizepointer.rawAddress, order).toUInt()

public actual fun getUniDirectionalAdapterInfo(pipifinfo: MutPtr<IpUnidirectionalAdapterAddress>, dwoutbuflen: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetUniDirectionalAdapterInfo(pipifinfo.rawAddress, dwoutbuflen.rawAddress).toUInt()

public actual fun getUnicastIpAddressEntry(row: MutPtr<MibUnicastipaddressRow>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressEntry(row.rawAddress).toUInt()

public actual fun getUnicastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibUnicastipaddressTable>>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressTable(family.toShort(), table.rawAddress).toUInt()

public actual fun icmp6CreateFile(): Handle =
    MutPtr(WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIcmp6CreateFile())

public actual fun icmp6ParseReplies(replybuffer: MutPtr<CVoid>, replysize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIcmp6ParseReplies(replybuffer.rawAddress, replysize.toInt()).toUInt()

public actual fun icmp6SendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, sourceaddress: ConstPtr<SockaddrIn6>, destinationaddress: ConstPtr<SockaddrIn6>, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIcmp6SendEcho2(icmphandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, sourceaddress.rawAddress, destinationaddress.rawAddress, requestdata.rawAddress, requestsize.toShort(), requestoptions.rawAddress, replybuffer.rawAddress, replysize.toInt(), timeout.toInt()).toUInt()

public actual fun icmpCloseHandle(icmphandle: Handle): Bool =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIcmpCloseHandle(icmphandle.rawAddress)

public actual fun icmpCreateFile(): Handle =
    MutPtr(WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIcmpCreateFile())

public actual fun icmpParseReplies(replybuffer: MutPtr<CVoid>, replysize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIcmpParseReplies(replybuffer.rawAddress, replysize.toInt()).toUInt()

public actual fun icmpSendEcho(icmphandle: Handle, destinationaddress: UInt, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho(icmphandle.rawAddress, destinationaddress.toInt(), requestdata.rawAddress, requestsize.toShort(), requestoptions.rawAddress, replybuffer.rawAddress, replysize.toInt(), timeout.toInt()).toUInt()

public actual fun icmpSendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, destinationaddress: UInt, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2(icmphandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, destinationaddress.toInt(), requestdata.rawAddress, requestsize.toShort(), requestoptions.rawAddress, replybuffer.rawAddress, replysize.toInt(), timeout.toInt()).toUInt()

public actual fun icmpSendEcho2Ex(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, sourceaddress: UInt, destinationaddress: UInt, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2Ex(icmphandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, sourceaddress.toInt(), destinationaddress.toInt(), requestdata.rawAddress, requestsize.toShort(), requestoptions.rawAddress, replybuffer.rawAddress, replysize.toInt(), timeout.toInt()).toUInt()

public actual fun initializeIpForwardEntry(row: MutPtr<MibIpforwardRow2>) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperInitializeIpForwardEntry(row.rawAddress)
}

public actual fun initializeIpInterfaceEntry(row: MutPtr<MibIpinterfaceRow>) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperInitializeIpInterfaceEntry(row.rawAddress)
}

public actual fun initializeUnicastIpAddressEntry(row: MutPtr<MibUnicastipaddressRow>) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperInitializeUnicastIpAddressEntry(row.rawAddress)
}

public actual fun ipReleaseAddress(adapterinfo: ConstPtr<IpAdapterIndexMap>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIpReleaseAddress(adapterinfo.rawAddress).toUInt()

public actual fun ipRenewAddress(adapterinfo: ConstPtr<IpAdapterIndexMap>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIpRenewAddress(adapterinfo.rawAddress).toUInt()

public actual fun lookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentTcpPortReservation(startport.toShort(), numberofports.toShort(), token.rawAddress).toUInt()

public actual fun lookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentUdpPortReservation(startport.toShort(), numberofports.toShort(), token.rawAddress).toUInt()

public actual fun nhpAllocateAndGetInterfaceInfoFromStack(pptable: MutPtr<MutPtr<IpInterfaceNameInfoW2ksp1>>, pdwcount: MutPtr<UInt>, border: Bool, hheap: Handle, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperNhpAllocateAndGetInterfaceInfoFromStack(pptable.rawAddress, pdwcount.rawAddress, border, hheap.rawAddress, dwflags.toInt()).toUInt()

public actual fun notifyAddrChange(handle: MutPtr<Handle>, overlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperNotifyAddrChange(handle.rawAddress, overlapped.rawAddress).toUInt()

public actual fun notifyIfTimestampConfigChange(callercontext: ConstPtr<CVoid>, callback: PinterfaceTimestampConfigChangeCallback, notificationhandle: MutPtr<Hiftimestampchange>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperNotifyIfTimestampConfigChange(callercontext.rawAddress, 0L, notificationhandle.rawAddress).toUInt()

public actual fun notifyIpInterfaceChange(family: AddressFamily, callback: PipinterfaceChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperNotifyIpInterfaceChange(family.toShort(), 0L, callercontext.rawAddress, initialnotification, notificationhandle.rawAddress).toUInt()

public actual fun notifyNetworkConnectivityHintChange(callback: PnetworkConnectivityHintChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperNotifyNetworkConnectivityHintChange(0L, callercontext.rawAddress, initialnotification, notificationhandle.rawAddress).toUInt()

public actual fun notifyRouteChange(handle: MutPtr<Handle>, overlapped: ConstPtr<Overlapped>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange(handle.rawAddress, overlapped.rawAddress).toUInt()

public actual fun notifyRouteChange2(addressfamily: AddressFamily, callback: PipforwardChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange2(addressfamily.toShort(), 0L, callercontext.rawAddress, initialnotification, notificationhandle.rawAddress).toUInt()

public actual fun notifyStableUnicastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibUnicastipaddressTable>>, callercallback: PstableUnicastIpaddressTableCallback, callercontext: ConstPtr<CVoid>, notificationhandle: MutPtr<Handle>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperNotifyStableUnicastIpAddressTable(family.toShort(), table.rawAddress, 0L, callercontext.rawAddress, notificationhandle.rawAddress).toUInt()

public actual fun notifyTeredoPortChange(callback: PteredoPortChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperNotifyTeredoPortChange(0L, callercontext.rawAddress, initialnotification, notificationhandle.rawAddress).toUInt()

public actual fun notifyUnicastIpAddressChange(family: AddressFamily, callback: PunicastIpaddressChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperNotifyUnicastIpAddressChange(family.toShort(), 0L, callercontext.rawAddress, initialnotification, notificationhandle.rawAddress).toUInt()

public actual fun parseNetworkString(networkstring: Pcwstr, types: UInt, addressinfo: MutPtr<NetAddressInfo>, portnumber: MutPtr<UShort>, prefixlength: MutPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperParseNetworkString(networkstring.rawAddress, types.toInt(), addressinfo.rawAddress, portnumber.rawAddress, prefixlength.rawAddress).toUInt()

public actual fun pfAddFiltersToInterface(ih: MutPtr<CVoid>, cinfilters: UInt, pfiltin: MutPtr<PfFilterDescriptor>, coutfilters: UInt, pfiltout: MutPtr<PfFilterDescriptor>, pfhandle: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfAddFiltersToInterface(ih.rawAddress, cinfilters.toInt(), pfiltin.rawAddress, coutfilters.toInt(), pfiltout.rawAddress, pfhandle.rawAddress).toUInt()

public actual fun pfAddGlobalFilterToInterface(pinterface: MutPtr<CVoid>, gffilter: GlobalFilter): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfAddGlobalFilterToInterface(pinterface.rawAddress, gffilter).toUInt()

public actual fun pfBindInterfaceToIPAddress(pinterface: MutPtr<CVoid>, pfattype: Pfaddresstype, ipaddress: MutPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIPAddress(pinterface.rawAddress, pfattype, ipaddress.rawAddress).toUInt()

public actual fun pfBindInterfaceToIndex(pinterface: MutPtr<CVoid>, dwindex: UInt, pfatlinktype: Pfaddresstype, linkipaddress: MutPtr<UByte>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIndex(pinterface.rawAddress, dwindex.toInt(), pfatlinktype, linkipaddress.rawAddress).toUInt()

public actual fun pfCreateInterface(dwname: UInt, inaction: PfforwardAction, outaction: PfforwardAction, buselog: Bool, bmustbeunique: Bool, ppinterface: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfCreateInterface(dwname.toInt(), inaction, outaction, buselog, bmustbeunique, ppinterface.rawAddress).toUInt()

public actual fun pfDeleteInterface(pinterface: MutPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfDeleteInterface(pinterface.rawAddress).toUInt()

public actual fun pfDeleteLog(): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfDeleteLog().toUInt()

public actual fun pfGetInterfaceStatistics(pinterface: MutPtr<CVoid>, ppfstats: MutPtr<PfInterfaceStats>, pdwbuffersize: MutPtr<UInt>, fresetcounters: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfGetInterfaceStatistics(pinterface.rawAddress, ppfstats.rawAddress, pdwbuffersize.rawAddress, fresetcounters).toUInt()

public actual fun pfMakeLog(hevent: Handle): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfMakeLog(hevent.rawAddress).toUInt()

public actual fun pfRebindFilters(pinterface: MutPtr<CVoid>, platebindinfo: MutPtr<PfLatebindInfo>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfRebindFilters(pinterface.rawAddress, platebindinfo.rawAddress).toUInt()

public actual fun pfRemoveFilterHandles(pinterface: MutPtr<CVoid>, cfilters: UInt, pvhandles: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFilterHandles(pinterface.rawAddress, cfilters.toInt(), pvhandles.rawAddress).toUInt()

public actual fun pfRemoveFiltersFromInterface(ih: MutPtr<CVoid>, cinfilters: UInt, pfiltin: MutPtr<PfFilterDescriptor>, coutfilters: UInt, pfiltout: MutPtr<PfFilterDescriptor>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFiltersFromInterface(ih.rawAddress, cinfilters.toInt(), pfiltin.rawAddress, coutfilters.toInt(), pfiltout.rawAddress).toUInt()

public actual fun pfRemoveGlobalFilterFromInterface(pinterface: MutPtr<CVoid>, gffilter: GlobalFilter): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfRemoveGlobalFilterFromInterface(pinterface.rawAddress, gffilter).toUInt()

public actual fun pfSetLogBuffer(pbbuffer: MutPtr<UByte>, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: MutPtr<UInt>, pdwlostentries: MutPtr<UInt>, pdwsizeused: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfSetLogBuffer(pbbuffer.rawAddress, dwsize.toInt(), dwthreshold.toInt(), dwentries.toInt(), pdwloggedentries.rawAddress, pdwlostentries.rawAddress, pdwsizeused.rawAddress).toUInt()

public actual fun pfTestPacket(pininterface: MutPtr<CVoid>, poutinterface: MutPtr<CVoid>, cbytes: UInt, pbpacket: MutPtr<UByte>, ppaction: MutPtr<PfforwardAction>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfTestPacket(pininterface.rawAddress, poutinterface.rawAddress, cbytes.toInt(), pbpacket.rawAddress, ppaction.rawAddress).toUInt()

public actual fun pfUnBindInterface(pinterface: MutPtr<CVoid>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperPfUnBindInterface(pinterface.rawAddress).toUInt()

public actual fun registerInterfaceTimestampConfigChange(callback: PinterfaceTimestampConfigChangeCallback, callercontext: ConstPtr<CVoid>, notificationhandle: MutPtr<Hiftimestampchange>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperRegisterInterfaceTimestampConfigChange(0L, callercontext.rawAddress, notificationhandle.rawAddress).toUInt()

public actual fun resolveIpNetEntry2(row: MutPtr<MibIpnetRow2>, sourceaddress: ConstPtr<SockaddrInet>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperResolveIpNetEntry2(row.rawAddress, sourceaddress.rawAddress).toUInt()

public actual fun resolveNeighbor(networkaddress: ConstPtr<Sockaddr>, physicaladdress: MutPtr<CVoid>, physicaladdresslength: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperResolveNeighbor(networkaddress.rawAddress, physicaladdress.rawAddress, physicaladdresslength.rawAddress).toUInt()

public actual fun restoreMediaSense(poverlapped: ConstPtr<Overlapped>, lpdwenablecount: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperRestoreMediaSense(poverlapped.rawAddress, lpdwenablecount.rawAddress).toUInt()

public actual fun sendARP(destip: UInt, srcip: UInt, pmacaddr: MutPtr<CVoid>, phyaddrlen: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSendARP(destip.toInt(), srcip.toInt(), pmacaddr.rawAddress, phyaddrlen.rawAddress).toUInt()

public actual fun setCurrentThreadCompartmentId(compartmentid: NetIfCompartmentId): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentId(compartmentid.toInt()).toUInt()

public actual fun setCurrentThreadCompartmentScope(compartmentscope: UInt): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentScope(compartmentscope.toInt()).toUInt()

public actual fun setDnsSettings(settings: ConstPtr<DnsSettings>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetDnsSettings(settings.rawAddress).toUInt()

public actual fun setIfEntry(pifrow: ConstPtr<MibIfrow>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetIfEntry(pifrow.rawAddress).toUInt()

public actual fun setInterfaceDnsSettings(iface: Guid, settings: ConstPtr<DnsInterfaceSettings>): Win32Error =
    0u

public actual fun setIpForwardEntry(proute: ConstPtr<MibIpforwardrow>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry(proute.rawAddress).toUInt()

public actual fun setIpForwardEntry2(route: ConstPtr<MibIpforwardRow2>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry2(route.rawAddress).toUInt()

public actual fun setIpInterfaceEntry(row: MutPtr<MibIpinterfaceRow>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetIpInterfaceEntry(row.rawAddress).toUInt()

public actual fun setIpNetEntry(parpentry: ConstPtr<MibIpnetrowLh>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry(parpentry.rawAddress).toUInt()

public actual fun setIpNetEntry2(row: ConstPtr<MibIpnetRow2>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry2(row.rawAddress).toUInt()

public actual fun setIpStatistics(pipstats: ConstPtr<MibIpstatsLh>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetIpStatistics(pipstats.rawAddress).toUInt()

public actual fun setIpStatisticsEx(statistics: ConstPtr<MibIpstatsLh>, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetIpStatisticsEx(statistics.rawAddress, family.toInt()).toUInt()

public actual fun setIpTTL(nttl: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetIpTTL(nttl.toInt()).toUInt()

public actual fun setJobCompartmentId(jobhandle: Handle, compartmentid: NetIfCompartmentId): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetJobCompartmentId(jobhandle.rawAddress, compartmentid.toInt()).toUInt()

public actual fun setNetworkInformation(networkguid: ConstPtr<Guid>, compartmentid: NetIfCompartmentId, networkname: Pcwstr): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetNetworkInformation(networkguid.rawAddress, compartmentid.toInt(), networkname.rawAddress).toUInt()

public actual fun setPerTcp6ConnectionEStats(row: ConstPtr<MibTcp6row>, estatstype: TcpEstatsType, rw: ConstPtr<UByte>, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetPerTcp6ConnectionEStats(row.rawAddress, estatstype, rw.rawAddress, rwversion.toInt(), rwsize.toInt(), offset.toInt()).toUInt()

public actual fun setPerTcpConnectionEStats(row: ConstPtr<MibTcprowLh>, estatstype: TcpEstatsType, rw: ConstPtr<UByte>, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetPerTcpConnectionEStats(row.rawAddress, estatstype, rw.rawAddress, rwversion.toInt(), rwsize.toInt(), offset.toInt()).toUInt()

public actual fun setSessionCompartmentId(sessionid: UInt, compartmentid: NetIfCompartmentId): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetSessionCompartmentId(sessionid.toInt(), compartmentid.toInt()).toUInt()

public actual fun setTcpEntry(ptcprow: ConstPtr<MibTcprowLh>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetTcpEntry(ptcprow.rawAddress).toUInt()

public actual fun setUnicastIpAddressEntry(row: ConstPtr<MibUnicastipaddressRow>): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperSetUnicastIpAddressEntry(row.rawAddress).toUInt()

public actual fun unenableRouter(poverlapped: ConstPtr<Overlapped>, lpdwenablecount: MutPtr<UInt>): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperUnenableRouter(poverlapped.rawAddress, lpdwenablecount.rawAddress).toUInt()

public actual fun unregisterInterfaceTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperUnregisterInterfaceTimestampConfigChange(notificationhandle.rawAddress)
}

public actual fun ifIndextoname(interfaceindex: UInt, interfacename: Pstr): Pstr =
    MutPtr(WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIfIndextoname(interfaceindex.toInt(), interfacename.rawAddress))

public actual fun ifNametoindex(interfacename: Pcstr): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssysWindowsWin32NetworkmanagementIphelperIfNametoindex(interfacename.rawAddress).toUInt()
