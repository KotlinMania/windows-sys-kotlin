@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.AddressFamily
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfCompartmentId
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

private object WindowsWin32NetworkmanagementIphelperJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_addIPAddress(address: Int, ipmask: Int, ifindex: Int, ntecontext: Long, nteinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_cancelIPChangeNotify(notifyoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_cancelIfTimestampConfigChange(notificationhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_cancelMibChangeNotify2(notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_captureInterfaceHardwareCrossTimestamp(interfaceluid: Long, crosstimestamp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentGuidToId(compartmentguid: Long, compartmentid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentIdToGuid(compartmentid: Int, compartmentguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceAliasToLuid(interfacealias: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceGuidToLuid(interfaceguid: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceIndexToLuid(interfaceindex: Int, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToAlias(interfaceluid: Long, interfacealias: Long, length: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToGuid(interfaceluid: Long, interfaceguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToIndex(interfaceluid: Long, interfaceindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameA(interfaceluid: Long, interfacename: Long, length: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameW(interfaceluid: Long, interfacename: Long, length: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidA(interfacename: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidW(interfacename: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertIpv4MaskToLength(mask: Int, masklength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_convertLengthToIpv4Mask(masklength: Int, mask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_createAnycastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry(proute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry(parpentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_createPersistentTcpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_createPersistentUdpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_createProxyArpEntry(dwaddress: Int, dwmask: Int, dwifindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_createSortedAddressPairs(sourceaddresslist: Long, sourceaddresscount: Int, destinationaddresslist: Long, destinationaddresscount: Int, addresssortoptions: Int, sortedaddresspairlist: Long, sortedaddresspaircount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_createUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_deleteAnycastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_deleteIPAddress(ntecontext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry(proute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry(parpentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_deletePersistentTcpPortReservation(startport: Short, numberofports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_deletePersistentUdpPortReservation(startport: Short, numberofports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_deleteProxyArpEntry(dwaddress: Int, dwmask: Int, dwifindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_deleteUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_disableMediaSense(phandle: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_enableRouter(phandle: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable(dwifindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable2(family: Short, interfaceindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_flushIpPathTable(family: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_freeDnsSettings(settings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_freeInterfaceDnsSettings(settings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_freeMibTable(memory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getAdapterIndex(adaptername: Long, ifindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getAdapterOrderMap(): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getAdaptersAddresses(family: Int, flags: Int, reserved: Long, adapteraddresses: Long, sizepointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getAdaptersInfo(adapterinfo: Long, sizepointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getBestInterface(dwdestaddr: Int, pdwbestifindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getBestInterfaceEx(pdestaddr: Long, pdwbestifindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getBestRoute(dwdestaddr: Int, dwsourceaddr: Int, pbestroute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getBestRoute2(interfaceluid: Long, interfaceindex: Int, sourceaddress: Long, destinationaddress: Long, addresssortoptions: Int, bestroute: Long, bestsourceaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentScope(compartmentscope: Long, compartmentid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getDefaultCompartmentId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getDnsSettings(settings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getExtendedTcpTable(ptcptable: Long, pdwsize: Long, border: Int, ulaf: Int, tableclass: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getExtendedUdpTable(pudptable: Long, pdwsize: Long, border: Int, ulaf: Int, tableclass: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getFriendlyIfIndex(ifindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatistics(statistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIfEntry(pifrow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2Ex(level: Int, row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIfStackTable(table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIfTable(piftable: Long, pdwsize: Long, border: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIfTable2(table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIfTable2Ex(level: Int, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getInterfaceActiveTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getInterfaceCurrentTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getInterfaceHardwareTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getInterfaceInfo(piftable: Long, dwoutbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getInterfaceSupportedTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getInvertedIfStackTable(table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpAddrTable(pipaddrtable: Long, pdwsize: Long, border: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpErrorString(errorcode: Int, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpForwardEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable(pipforwardtable: Long, pdwsize: Long, border: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable2(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable(ipnettable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable2(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpNetworkConnectionBandwidthEstimates(interfaceindex: Int, addressfamily: Short, bandwidthestimates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpPathEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpPathTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpStatistics(statistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getIpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getJobCompartmentId(jobhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHint(connectivityhint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHintForInterface(interfaceindex: Int, connectivityhint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getNetworkInformation(networkguid: Long, compartmentid: Long, siteid: Long, networkname: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getNetworkParams(pfixedinfo: Long, poutbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getNumberOfInterfaces(pdwnumif: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromPidAndInfo(ulpid: Int, pinfo: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcp6Entry(ptcpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcpEntry(ptcpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdp6Entry(pudpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdpEntry(pudpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getPerAdapterInfo(ifindex: Int, pperadapterinfo: Long, poutbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getPerTcp6ConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, ros: Long, rosversion: Int, rossize: Int, rod: Long, rodversion: Int, rodsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getPerTcpConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, ros: Long, rosversion: Int, rossize: Int, rod: Long, rodversion: Int, rodsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getRTTAndHopCount(destipaddress: Int, hopcount: Long, maxhops: Int, rtt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getSessionCompartmentId(sessionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table2(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getTcpStatistics(statistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx2(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getTcpTable(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getTcpTable2(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getTeredoPort(port: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getUdp6Table(udp6table: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getUdpStatistics(stats: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx2(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getUdpTable(udptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getUniDirectionalAdapterInfo(pipifinfo: Long, dwoutbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_icmp6CreateFile(): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_icmp6ParseReplies(replybuffer: Long, replysize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_icmp6SendEcho2(icmphandle: Long, event: Long, apcroutine: Long, apccontext: Long, sourceaddress: Long, destinationaddress: Long, requestdata: Long, requestsize: Short, requestoptions: Long, replybuffer: Long, replysize: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_icmpCloseHandle(icmphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_icmpCreateFile(): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_icmpParseReplies(replybuffer: Long, replysize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho(icmphandle: Long, destinationaddress: Int, requestdata: Long, requestsize: Short, requestoptions: Long, replybuffer: Long, replysize: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2(icmphandle: Long, event: Long, apcroutine: Long, apccontext: Long, destinationaddress: Int, requestdata: Long, requestsize: Short, requestoptions: Long, replybuffer: Long, replysize: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2Ex(icmphandle: Long, event: Long, apcroutine: Long, apccontext: Long, sourceaddress: Int, destinationaddress: Int, requestdata: Long, requestsize: Short, requestoptions: Long, replybuffer: Long, replysize: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_initializeIpForwardEntry(row: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_initializeIpInterfaceEntry(row: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_initializeUnicastIpAddressEntry(row: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ipReleaseAddress(adapterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ipRenewAddress(adapterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentTcpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentUdpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_nhpAllocateAndGetInterfaceInfoFromStack(pptable: Long, pdwcount: Long, border: Int, hheap: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_notifyAddrChange(handle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_notifyIfTimestampConfigChange(callercontext: Long, callback: Long, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_notifyIpInterfaceChange(family: Short, callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_notifyNetworkConnectivityHintChange(callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange(handle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange2(addressfamily: Short, callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_notifyStableUnicastIpAddressTable(family: Short, table: Long, callercallback: Long, callercontext: Long, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_notifyTeredoPortChange(callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_notifyUnicastIpAddressChange(family: Short, callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_parseNetworkString(networkstring: Long, types: Int, addressinfo: Long, portnumber: Long, prefixlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfAddFiltersToInterface(ih: Long, cinfilters: Int, pfiltin: Long, coutfilters: Int, pfiltout: Long, pfhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfAddGlobalFilterToInterface(pinterface: Long, gffilter: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIPAddress(pinterface: Long, pfattype: Int, ipaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIndex(pinterface: Long, dwindex: Int, pfatlinktype: Int, linkipaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfCreateInterface(dwname: Int, inaction: Int, outaction: Int, buselog: Int, bmustbeunique: Int, ppinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfDeleteInterface(pinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfDeleteLog(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfGetInterfaceStatistics(pinterface: Long, ppfstats: Long, pdwbuffersize: Long, fresetcounters: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfMakeLog(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfRebindFilters(pinterface: Long, platebindinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFilterHandles(pinterface: Long, cfilters: Int, pvhandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFiltersFromInterface(ih: Long, cinfilters: Int, pfiltin: Long, coutfilters: Int, pfiltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfRemoveGlobalFilterFromInterface(pinterface: Long, gffilter: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfSetLogBuffer(pbbuffer: Long, dwsize: Int, dwthreshold: Int, dwentries: Int, pdwloggedentries: Long, pdwlostentries: Long, pdwsizeused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfTestPacket(pininterface: Long, poutinterface: Long, cbytes: Int, pbpacket: Long, ppaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_pfUnBindInterface(pinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_registerInterfaceTimestampConfigChange(callback: Long, callercontext: Long, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_resolveIpNetEntry2(row: Long, sourceaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_resolveNeighbor(networkaddress: Long, physicaladdress: Long, physicaladdresslength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_restoreMediaSense(poverlapped: Long, lpdwenablecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_sendARP(destip: Int, srcip: Int, pmacaddr: Long, phyaddrlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentId(compartmentid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentScope(compartmentscope: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setDnsSettings(settings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setIfEntry(pifrow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry(proute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry2(route: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setIpInterfaceEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry(parpentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setIpStatistics(pipstats: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setIpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setIpTTL(nttl: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setJobCompartmentId(jobhandle: Long, compartmentid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setNetworkInformation(networkguid: Long, compartmentid: Int, networkname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setPerTcp6ConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, offset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setPerTcpConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, offset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setSessionCompartmentId(sessionid: Int, compartmentid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setTcpEntry(ptcprow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_setUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_unenableRouter(poverlapped: Long, lpdwenablecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_unregisterInterfaceTimestampConfigChange(notificationhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ifIndextoname(interfaceindex: Int, interfacename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ifNametoindex(interfacename: Long): Int
}

public actual fun addIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: COpaquePointer?, nteinstance: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_addIPAddress(address.toInt(), ipmask.toInt(), ifindex.toInt(), (ntecontext?.value ?: 0L), (nteinstance?.value ?: 0L)).toUInt()

public actual fun cancelIPChangeNotify(notifyoverlapped: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_cancelIPChangeNotify((notifyoverlapped?.value ?: 0L))

public actual fun cancelIfTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_cancelIfTimestampConfigChange((notificationhandle?.value ?: 0L))
}

public actual fun cancelMibChangeNotify2(notificationhandle: Handle): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_cancelMibChangeNotify2((notificationhandle?.value ?: 0L)).toUInt()

public actual fun captureInterfaceHardwareCrossTimestamp(interfaceluid: COpaquePointer?, crosstimestamp: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_captureInterfaceHardwareCrossTimestamp((interfaceluid?.value ?: 0L), (crosstimestamp?.value ?: 0L)).toUInt()

public actual fun convertCompartmentGuidToId(compartmentguid: COpaquePointer?, compartmentid: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentGuidToId((compartmentguid?.value ?: 0L), (compartmentid?.value ?: 0L)).toUInt()

public actual fun convertCompartmentIdToGuid(compartmentid: NetIfCompartmentId, compartmentguid: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentIdToGuid(compartmentid.toInt(), (compartmentguid?.value ?: 0L)).toUInt()

public actual fun convertInterfaceAliasToLuid(interfacealias: Pcwstr, interfaceluid: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceAliasToLuid((interfacealias?.value ?: 0L), (interfaceluid?.value ?: 0L)).toUInt()

public actual fun convertInterfaceGuidToLuid(interfaceguid: COpaquePointer?, interfaceluid: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceGuidToLuid((interfaceguid?.value ?: 0L), (interfaceluid?.value ?: 0L)).toUInt()

public actual fun convertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceIndexToLuid(interfaceindex.toInt(), (interfaceluid?.value ?: 0L)).toUInt()

public actual fun convertInterfaceLuidToAlias(interfaceluid: COpaquePointer?, interfacealias: Pwstr, length: ULong): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToAlias((interfaceluid?.value ?: 0L), (interfacealias?.value ?: 0L), length.toLong()).toUInt()

public actual fun convertInterfaceLuidToGuid(interfaceluid: COpaquePointer?, interfaceguid: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToGuid((interfaceluid?.value ?: 0L), (interfaceguid?.value ?: 0L)).toUInt()

public actual fun convertInterfaceLuidToIndex(interfaceluid: COpaquePointer?, interfaceindex: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToIndex((interfaceluid?.value ?: 0L), (interfaceindex?.value ?: 0L)).toUInt()

public actual fun convertInterfaceLuidToNameA(interfaceluid: COpaquePointer?, interfacename: Pstr, length: ULong): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameA((interfaceluid?.value ?: 0L), (interfacename?.value ?: 0L), length.toLong()).toUInt()

public actual fun convertInterfaceLuidToNameW(interfaceluid: COpaquePointer?, interfacename: Pwstr, length: ULong): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameW((interfaceluid?.value ?: 0L), (interfacename?.value ?: 0L), length.toLong()).toUInt()

public actual fun convertInterfaceNameToLuidA(interfacename: Pcstr, interfaceluid: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidA((interfacename?.value ?: 0L), (interfaceluid?.value ?: 0L)).toUInt()

public actual fun convertInterfaceNameToLuidW(interfacename: Pcwstr, interfaceluid: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidW((interfacename?.value ?: 0L), (interfaceluid?.value ?: 0L)).toUInt()

public actual fun convertIpv4MaskToLength(mask: UInt, masklength: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertIpv4MaskToLength(mask.toInt(), (masklength?.value ?: 0L)).toUInt()

public actual fun convertLengthToIpv4Mask(masklength: UInt, mask: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_convertLengthToIpv4Mask(masklength.toInt(), (mask?.value ?: 0L)).toUInt()

public actual fun createAnycastIpAddressEntry(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_createAnycastIpAddressEntry((row?.value ?: 0L)).toUInt()

public actual fun createIpForwardEntry(proute: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry((proute?.value ?: 0L)).toUInt()

public actual fun createIpForwardEntry2(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry2((row?.value ?: 0L)).toUInt()

public actual fun createIpNetEntry(parpentry: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry((parpentry?.value ?: 0L)).toUInt()

public actual fun createIpNetEntry2(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry2((row?.value ?: 0L)).toUInt()

public actual fun createPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_createPersistentTcpPortReservation(startport.toShort(), numberofports.toShort(), (token?.value ?: 0L)).toUInt()

public actual fun createPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_createPersistentUdpPortReservation(startport.toShort(), numberofports.toShort(), (token?.value ?: 0L)).toUInt()

public actual fun createProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_createProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt()

public actual fun createSortedAddressPairs(sourceaddresslist: COpaquePointer?, sourceaddresscount: UInt, destinationaddresslist: COpaquePointer?, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: COpaquePointer?, sortedaddresspaircount: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_createSortedAddressPairs((sourceaddresslist?.value ?: 0L), sourceaddresscount.toInt(), (destinationaddresslist?.value ?: 0L), destinationaddresscount.toInt(), addresssortoptions.toInt(), (sortedaddresspairlist?.value ?: 0L), (sortedaddresspaircount?.value ?: 0L)).toUInt()

public actual fun createUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_createUnicastIpAddressEntry((row?.value ?: 0L)).toUInt()

public actual fun deleteAnycastIpAddressEntry(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_deleteAnycastIpAddressEntry((row?.value ?: 0L)).toUInt()

public actual fun deleteIPAddress(ntecontext: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_deleteIPAddress(ntecontext.toInt()).toUInt()

public actual fun deleteIpForwardEntry(proute: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry((proute?.value ?: 0L)).toUInt()

public actual fun deleteIpForwardEntry2(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry2((row?.value ?: 0L)).toUInt()

public actual fun deleteIpNetEntry(parpentry: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry((parpentry?.value ?: 0L)).toUInt()

public actual fun deleteIpNetEntry2(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry2((row?.value ?: 0L)).toUInt()

public actual fun deletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_deletePersistentTcpPortReservation(startport.toShort(), numberofports.toShort()).toUInt()

public actual fun deletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_deletePersistentUdpPortReservation(startport.toShort(), numberofports.toShort()).toUInt()

public actual fun deleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_deleteProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt()

public actual fun deleteUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_deleteUnicastIpAddressEntry((row?.value ?: 0L)).toUInt()

public actual fun disableMediaSense(phandle: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_disableMediaSense((phandle?.value ?: 0L), (poverlapped?.value ?: 0L)).toUInt()

public actual fun enableRouter(phandle: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_enableRouter((phandle?.value ?: 0L), (poverlapped?.value ?: 0L)).toUInt()

public actual fun flushIpNetTable(dwifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable(dwifindex.toInt()).toUInt()

public actual fun flushIpNetTable2(family: AddressFamily, interfaceindex: UInt): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable2(family.toShort(), interfaceindex.toInt()).toUInt()

public actual fun flushIpPathTable(family: AddressFamily): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_flushIpPathTable(family.toShort()).toUInt()

public actual fun freeDnsSettings(settings: COpaquePointer?) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_freeDnsSettings((settings?.value ?: 0L))
}

public actual fun freeInterfaceDnsSettings(settings: COpaquePointer?) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_freeInterfaceDnsSettings((settings?.value ?: 0L))
}

public actual fun freeMibTable(memory: COpaquePointer?) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_freeMibTable((memory?.value ?: 0L))
}

public actual fun getAdapterIndex(adaptername: Pcwstr, ifindex: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getAdapterIndex((adaptername?.value ?: 0L), (ifindex?.value ?: 0L)).toUInt()

public actual fun getAdapterOrderMap(): COpaquePointer? =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getAdapterOrderMap().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getAdaptersAddresses(family: UInt, flags: GetAdaptersAddressesFlags, reserved: COpaquePointer?, adapteraddresses: COpaquePointer?, sizepointer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getAdaptersAddresses(family.toInt(), flags.toInt(), (reserved?.value ?: 0L), (adapteraddresses?.value ?: 0L), (sizepointer?.value ?: 0L)).toUInt()

public actual fun getAdaptersInfo(adapterinfo: COpaquePointer?, sizepointer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getAdaptersInfo((adapterinfo?.value ?: 0L), (sizepointer?.value ?: 0L)).toUInt()

public actual fun getAnycastIpAddressEntry(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressEntry((row?.value ?: 0L)).toUInt()

public actual fun getAnycastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressTable(family.toShort(), (table?.value ?: 0L)).toUInt()

public actual fun getBestInterface(dwdestaddr: UInt, pdwbestifindex: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getBestInterface(dwdestaddr.toInt(), (pdwbestifindex?.value ?: 0L)).toUInt()

public actual fun getBestInterfaceEx(pdestaddr: COpaquePointer?, pdwbestifindex: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getBestInterfaceEx((pdestaddr?.value ?: 0L), (pdwbestifindex?.value ?: 0L)).toUInt()

public actual fun getBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getBestRoute(dwdestaddr.toInt(), dwsourceaddr.toInt(), (pbestroute?.value ?: 0L)).toUInt()

public actual fun getBestRoute2(interfaceluid: COpaquePointer?, interfaceindex: UInt, sourceaddress: COpaquePointer?, destinationaddress: COpaquePointer?, addresssortoptions: UInt, bestroute: COpaquePointer?, bestsourceaddress: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getBestRoute2((interfaceluid?.value ?: 0L), interfaceindex.toInt(), (sourceaddress?.value ?: 0L), (destinationaddress?.value ?: 0L), addresssortoptions.toInt(), (bestroute?.value ?: 0L), (bestsourceaddress?.value ?: 0L)).toUInt()

public actual fun getCurrentThreadCompartmentId(): NetIfCompartmentId =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentId().toUInt()

public actual fun getCurrentThreadCompartmentScope(compartmentscope: COpaquePointer?, compartmentid: COpaquePointer?) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentScope((compartmentscope?.value ?: 0L), (compartmentid?.value ?: 0L))
}

public actual fun getDefaultCompartmentId(): NetIfCompartmentId =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getDefaultCompartmentId().toUInt()

public actual fun getDnsSettings(settings: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getDnsSettings((settings?.value ?: 0L)).toUInt()

public actual fun getExtendedTcpTable(ptcptable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool, ulaf: UInt, tableclass: TcpTableClass, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getExtendedTcpTable((ptcptable?.value ?: 0L), (pdwsize?.value ?: 0L), border, ulaf.toInt(), tableclass, reserved.toInt()).toUInt()

public actual fun getExtendedUdpTable(pudptable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool, ulaf: UInt, tableclass: UdpTableClass, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getExtendedUdpTable((pudptable?.value ?: 0L), (pdwsize?.value ?: 0L), border, ulaf.toInt(), tableclass, reserved.toInt()).toUInt()

public actual fun getFriendlyIfIndex(ifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getFriendlyIfIndex(ifindex.toInt()).toUInt()

public actual fun getIcmpStatistics(statistics: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatistics((statistics?.value ?: 0L)).toUInt()

public actual fun getIcmpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatisticsEx((statistics?.value ?: 0L), family.toInt()).toUInt()

public actual fun getIfEntry(pifrow: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIfEntry((pifrow?.value ?: 0L)).toUInt()

public actual fun getIfEntry2(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2((row?.value ?: 0L)).toUInt()

public actual fun getIfEntry2Ex(level: MibIfEntryLevel, row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2Ex(level, (row?.value ?: 0L)).toUInt()

public actual fun getIfStackTable(table: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIfStackTable((table?.value ?: 0L)).toUInt()

public actual fun getIfTable(piftable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIfTable((piftable?.value ?: 0L), (pdwsize?.value ?: 0L), border).toUInt()

public actual fun getIfTable2(table: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIfTable2((table?.value ?: 0L)).toUInt()

public actual fun getIfTable2Ex(level: MibIfTableLevel, table: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIfTable2Ex(level, (table?.value ?: 0L)).toUInt()

public actual fun getInterfaceActiveTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceActiveTimestampCapabilities((interfaceluid?.value ?: 0L), (timestampcapabilites?.value ?: 0L)).toUInt()

public actual fun getInterfaceCurrentTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceCurrentTimestampCapabilities((interfaceluid?.value ?: 0L), (timestampcapabilites?.value ?: 0L)).toUInt()

public actual fun getInterfaceDnsSettings(iface: Guid, settings: COpaquePointer?): Win32Error =
    0u

public actual fun getInterfaceHardwareTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceHardwareTimestampCapabilities((interfaceluid?.value ?: 0L), (timestampcapabilites?.value ?: 0L)).toUInt()

public actual fun getInterfaceInfo(piftable: COpaquePointer?, dwoutbuflen: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceInfo((piftable?.value ?: 0L), (dwoutbuflen?.value ?: 0L)).toUInt()

public actual fun getInterfaceSupportedTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceSupportedTimestampCapabilities((interfaceluid?.value ?: 0L), (timestampcapabilites?.value ?: 0L)).toUInt()

public actual fun getInvertedIfStackTable(table: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getInvertedIfStackTable((table?.value ?: 0L)).toUInt()

public actual fun getIpAddrTable(pipaddrtable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpAddrTable((pipaddrtable?.value ?: 0L), (pdwsize?.value ?: 0L), border).toUInt()

public actual fun getIpErrorString(errorcode: UInt, buffer: Pwstr, size: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpErrorString(errorcode.toInt(), (buffer?.value ?: 0L), (size?.value ?: 0L)).toUInt()

public actual fun getIpForwardEntry2(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpForwardEntry2((row?.value ?: 0L)).toUInt()

public actual fun getIpForwardTable(pipforwardtable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable((pipforwardtable?.value ?: 0L), (pdwsize?.value ?: 0L), border).toUInt()

public actual fun getIpForwardTable2(family: AddressFamily, table: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable2(family.toShort(), (table?.value ?: 0L)).toUInt()

public actual fun getIpInterfaceEntry(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceEntry((row?.value ?: 0L)).toUInt()

public actual fun getIpInterfaceTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceTable(family.toShort(), (table?.value ?: 0L)).toUInt()

public actual fun getIpNetEntry2(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpNetEntry2((row?.value ?: 0L)).toUInt()

public actual fun getIpNetTable(ipnettable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable((ipnettable?.value ?: 0L), (sizepointer?.value ?: 0L), order).toUInt()

public actual fun getIpNetTable2(family: AddressFamily, table: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable2(family.toShort(), (table?.value ?: 0L)).toUInt()

public actual fun getIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: AddressFamily, bandwidthestimates: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpNetworkConnectionBandwidthEstimates(interfaceindex.toInt(), addressfamily.toShort(), (bandwidthestimates?.value ?: 0L)).toUInt()

public actual fun getIpPathEntry(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpPathEntry((row?.value ?: 0L)).toUInt()

public actual fun getIpPathTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpPathTable(family.toShort(), (table?.value ?: 0L)).toUInt()

public actual fun getIpStatistics(statistics: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpStatistics((statistics?.value ?: 0L)).toUInt()

public actual fun getIpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getIpStatisticsEx((statistics?.value ?: 0L), family.toInt()).toUInt()

public actual fun getJobCompartmentId(jobhandle: Handle): NetIfCompartmentId =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getJobCompartmentId((jobhandle?.value ?: 0L)).toUInt()

public actual fun getMulticastIpAddressEntry(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressEntry((row?.value ?: 0L)).toUInt()

public actual fun getMulticastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressTable(family.toShort(), (table?.value ?: 0L)).toUInt()

public actual fun getNetworkConnectivityHint(connectivityhint: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHint((connectivityhint?.value ?: 0L)).toUInt()

public actual fun getNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHintForInterface(interfaceindex.toInt(), (connectivityhint?.value ?: 0L)).toUInt()

public actual fun getNetworkInformation(networkguid: COpaquePointer?, compartmentid: COpaquePointer?, siteid: COpaquePointer?, networkname: Pwstr, length: UInt): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getNetworkInformation((networkguid?.value ?: 0L), (compartmentid?.value ?: 0L), (siteid?.value ?: 0L), (networkname?.value ?: 0L), length.toInt()).toUInt()

public actual fun getNetworkParams(pfixedinfo: COpaquePointer?, poutbuflen: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getNetworkParams((pfixedinfo?.value ?: 0L), (poutbuflen?.value ?: 0L)).toUInt()

public actual fun getNumberOfInterfaces(pdwnumif: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getNumberOfInterfaces((pdwnumif?.value ?: 0L)).toUInt()

public actual fun getOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromPidAndInfo(ulpid.toInt(), (pinfo?.value ?: 0L), cls, (pbuffer?.value ?: 0L), (pdwsize?.value ?: 0L)).toUInt()

public actual fun getOwnerModuleFromTcp6Entry(ptcpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcp6Entry((ptcpentry?.value ?: 0L), cls, (pbuffer?.value ?: 0L), (pdwsize?.value ?: 0L)).toUInt()

public actual fun getOwnerModuleFromTcpEntry(ptcpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcpEntry((ptcpentry?.value ?: 0L), cls, (pbuffer?.value ?: 0L), (pdwsize?.value ?: 0L)).toUInt()

public actual fun getOwnerModuleFromUdp6Entry(pudpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdp6Entry((pudpentry?.value ?: 0L), cls, (pbuffer?.value ?: 0L), (pdwsize?.value ?: 0L)).toUInt()

public actual fun getOwnerModuleFromUdpEntry(pudpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdpEntry((pudpentry?.value ?: 0L), cls, (pbuffer?.value ?: 0L), (pdwsize?.value ?: 0L)).toUInt()

public actual fun getPerAdapterInfo(ifindex: UInt, pperadapterinfo: COpaquePointer?, poutbuflen: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getPerAdapterInfo(ifindex.toInt(), (pperadapterinfo?.value ?: 0L), (poutbuflen?.value ?: 0L)).toUInt()

public actual fun getPerTcp6ConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, ros: COpaquePointer?, rosversion: UInt, rossize: UInt, rod: COpaquePointer?, rodversion: UInt, rodsize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getPerTcp6ConnectionEStats((row?.value ?: 0L), estatstype, (rw?.value ?: 0L), rwversion.toInt(), rwsize.toInt(), (ros?.value ?: 0L), rosversion.toInt(), rossize.toInt(), (rod?.value ?: 0L), rodversion.toInt(), rodsize.toInt()).toUInt()

public actual fun getPerTcpConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, ros: COpaquePointer?, rosversion: UInt, rossize: UInt, rod: COpaquePointer?, rodversion: UInt, rodsize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getPerTcpConnectionEStats((row?.value ?: 0L), estatstype, (rw?.value ?: 0L), rwversion.toInt(), rwsize.toInt(), (ros?.value ?: 0L), rosversion.toInt(), rossize.toInt(), (rod?.value ?: 0L), rodversion.toInt(), rodsize.toInt()).toUInt()

public actual fun getRTTAndHopCount(destipaddress: UInt, hopcount: COpaquePointer?, maxhops: UInt, rtt: COpaquePointer?): Bool =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getRTTAndHopCount(destipaddress.toInt(), (hopcount?.value ?: 0L), maxhops.toInt(), (rtt?.value ?: 0L))

public actual fun getSessionCompartmentId(sessionid: UInt): NetIfCompartmentId =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getSessionCompartmentId(sessionid.toInt()).toUInt()

public actual fun getTcp6Table(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table((tcptable?.value ?: 0L), (sizepointer?.value ?: 0L), order).toUInt()

public actual fun getTcp6Table2(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table2((tcptable?.value ?: 0L), (sizepointer?.value ?: 0L), order).toUInt()

public actual fun getTcpStatistics(statistics: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getTcpStatistics((statistics?.value ?: 0L)).toUInt()

public actual fun getTcpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx((statistics?.value ?: 0L), family.toInt()).toUInt()

public actual fun getTcpStatisticsEx2(statistics: COpaquePointer?, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx2((statistics?.value ?: 0L), family.toInt()).toUInt()

public actual fun getTcpTable(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getTcpTable((tcptable?.value ?: 0L), (sizepointer?.value ?: 0L), order).toUInt()

public actual fun getTcpTable2(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getTcpTable2((tcptable?.value ?: 0L), (sizepointer?.value ?: 0L), order).toUInt()

public actual fun getTeredoPort(port: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getTeredoPort((port?.value ?: 0L)).toUInt()

public actual fun getUdp6Table(udp6table: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getUdp6Table((udp6table?.value ?: 0L), (sizepointer?.value ?: 0L), order).toUInt()

public actual fun getUdpStatistics(stats: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getUdpStatistics((stats?.value ?: 0L)).toUInt()

public actual fun getUdpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx((statistics?.value ?: 0L), family.toInt()).toUInt()

public actual fun getUdpStatisticsEx2(statistics: COpaquePointer?, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx2((statistics?.value ?: 0L), family.toInt()).toUInt()

public actual fun getUdpTable(udptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getUdpTable((udptable?.value ?: 0L), (sizepointer?.value ?: 0L), order).toUInt()

public actual fun getUniDirectionalAdapterInfo(pipifinfo: COpaquePointer?, dwoutbuflen: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getUniDirectionalAdapterInfo((pipifinfo?.value ?: 0L), (dwoutbuflen?.value ?: 0L)).toUInt()

public actual fun getUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressEntry((row?.value ?: 0L)).toUInt()

public actual fun getUnicastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressTable(family.toShort(), (table?.value ?: 0L)).toUInt()

public actual fun icmp6CreateFile(): Handle =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_icmp6CreateFile().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun icmp6ParseReplies(replybuffer: COpaquePointer?, replysize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_icmp6ParseReplies((replybuffer?.value ?: 0L), replysize.toInt()).toUInt()

public actual fun icmp6SendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, sourceaddress: COpaquePointer?, destinationaddress: COpaquePointer?, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_icmp6SendEcho2((icmphandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (sourceaddress?.value ?: 0L), (destinationaddress?.value ?: 0L), (requestdata?.value ?: 0L), requestsize.toShort(), (requestoptions?.value ?: 0L), (replybuffer?.value ?: 0L), replysize.toInt(), timeout.toInt()).toUInt()

public actual fun icmpCloseHandle(icmphandle: Handle): Bool =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_icmpCloseHandle((icmphandle?.value ?: 0L))

public actual fun icmpCreateFile(): Handle =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_icmpCreateFile().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun icmpParseReplies(replybuffer: COpaquePointer?, replysize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_icmpParseReplies((replybuffer?.value ?: 0L), replysize.toInt()).toUInt()

public actual fun icmpSendEcho(icmphandle: Handle, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho((icmphandle?.value ?: 0L), destinationaddress.toInt(), (requestdata?.value ?: 0L), requestsize.toShort(), (requestoptions?.value ?: 0L), (replybuffer?.value ?: 0L), replysize.toInt(), timeout.toInt()).toUInt()

public actual fun icmpSendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2((icmphandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), destinationaddress.toInt(), (requestdata?.value ?: 0L), requestsize.toShort(), (requestoptions?.value ?: 0L), (replybuffer?.value ?: 0L), replysize.toInt(), timeout.toInt()).toUInt()

public actual fun icmpSendEcho2Ex(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, sourceaddress: UInt, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2Ex((icmphandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), sourceaddress.toInt(), destinationaddress.toInt(), (requestdata?.value ?: 0L), requestsize.toShort(), (requestoptions?.value ?: 0L), (replybuffer?.value ?: 0L), replysize.toInt(), timeout.toInt()).toUInt()

public actual fun initializeIpForwardEntry(row: COpaquePointer?) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_initializeIpForwardEntry((row?.value ?: 0L))
}

public actual fun initializeIpInterfaceEntry(row: COpaquePointer?) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_initializeIpInterfaceEntry((row?.value ?: 0L))
}

public actual fun initializeUnicastIpAddressEntry(row: COpaquePointer?) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_initializeUnicastIpAddressEntry((row?.value ?: 0L))
}

public actual fun ipReleaseAddress(adapterinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ipReleaseAddress((adapterinfo?.value ?: 0L)).toUInt()

public actual fun ipRenewAddress(adapterinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ipRenewAddress((adapterinfo?.value ?: 0L)).toUInt()

public actual fun lookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentTcpPortReservation(startport.toShort(), numberofports.toShort(), (token?.value ?: 0L)).toUInt()

public actual fun lookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentUdpPortReservation(startport.toShort(), numberofports.toShort(), (token?.value ?: 0L)).toUInt()

public actual fun nhpAllocateAndGetInterfaceInfoFromStack(pptable: COpaquePointer?, pdwcount: COpaquePointer?, border: Bool, hheap: Handle, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_nhpAllocateAndGetInterfaceInfoFromStack((pptable?.value ?: 0L), (pdwcount?.value ?: 0L), border, (hheap?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun notifyAddrChange(handle: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_notifyAddrChange((handle?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun notifyIfTimestampConfigChange(callercontext: COpaquePointer?, callback: PinterfaceTimestampConfigChangeCallback, notificationhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_notifyIfTimestampConfigChange((callercontext?.value ?: 0L), 0L, (notificationhandle?.value ?: 0L)).toUInt()

public actual fun notifyIpInterfaceChange(family: AddressFamily, callback: PipinterfaceChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_notifyIpInterfaceChange(family.toShort(), 0L, (callercontext?.value ?: 0L), initialnotification, (notificationhandle?.value ?: 0L)).toUInt()

public actual fun notifyNetworkConnectivityHintChange(callback: PnetworkConnectivityHintChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_notifyNetworkConnectivityHintChange(0L, (callercontext?.value ?: 0L), initialnotification, (notificationhandle?.value ?: 0L)).toUInt()

public actual fun notifyRouteChange(handle: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange((handle?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun notifyRouteChange2(addressfamily: AddressFamily, callback: PipforwardChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange2(addressfamily.toShort(), 0L, (callercontext?.value ?: 0L), initialnotification, (notificationhandle?.value ?: 0L)).toUInt()

public actual fun notifyStableUnicastIpAddressTable(family: AddressFamily, table: COpaquePointer?, callercallback: PstableUnicastIpaddressTableCallback, callercontext: COpaquePointer?, notificationhandle: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_notifyStableUnicastIpAddressTable(family.toShort(), (table?.value ?: 0L), 0L, (callercontext?.value ?: 0L), (notificationhandle?.value ?: 0L)).toUInt()

public actual fun notifyTeredoPortChange(callback: PteredoPortChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_notifyTeredoPortChange(0L, (callercontext?.value ?: 0L), initialnotification, (notificationhandle?.value ?: 0L)).toUInt()

public actual fun notifyUnicastIpAddressChange(family: AddressFamily, callback: PunicastIpaddressChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_notifyUnicastIpAddressChange(family.toShort(), 0L, (callercontext?.value ?: 0L), initialnotification, (notificationhandle?.value ?: 0L)).toUInt()

public actual fun parseNetworkString(networkstring: Pcwstr, types: UInt, addressinfo: COpaquePointer?, portnumber: COpaquePointer?, prefixlength: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_parseNetworkString((networkstring?.value ?: 0L), types.toInt(), (addressinfo?.value ?: 0L), (portnumber?.value ?: 0L), (prefixlength?.value ?: 0L)).toUInt()

public actual fun pfAddFiltersToInterface(ih: COpaquePointer?, cinfilters: UInt, pfiltin: COpaquePointer?, coutfilters: UInt, pfiltout: COpaquePointer?, pfhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfAddFiltersToInterface((ih?.value ?: 0L), cinfilters.toInt(), (pfiltin?.value ?: 0L), coutfilters.toInt(), (pfiltout?.value ?: 0L), (pfhandle?.value ?: 0L)).toUInt()

public actual fun pfAddGlobalFilterToInterface(pinterface: COpaquePointer?, gffilter: GlobalFilter): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfAddGlobalFilterToInterface((pinterface?.value ?: 0L), gffilter).toUInt()

public actual fun pfBindInterfaceToIPAddress(pinterface: COpaquePointer?, pfattype: Pfaddresstype, ipaddress: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIPAddress((pinterface?.value ?: 0L), pfattype, (ipaddress?.value ?: 0L)).toUInt()

public actual fun pfBindInterfaceToIndex(pinterface: COpaquePointer?, dwindex: UInt, pfatlinktype: Pfaddresstype, linkipaddress: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIndex((pinterface?.value ?: 0L), dwindex.toInt(), pfatlinktype, (linkipaddress?.value ?: 0L)).toUInt()

public actual fun pfCreateInterface(dwname: UInt, inaction: PfforwardAction, outaction: PfforwardAction, buselog: Bool, bmustbeunique: Bool, ppinterface: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfCreateInterface(dwname.toInt(), inaction, outaction, buselog, bmustbeunique, (ppinterface?.value ?: 0L)).toUInt()

public actual fun pfDeleteInterface(pinterface: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfDeleteInterface((pinterface?.value ?: 0L)).toUInt()

public actual fun pfDeleteLog(): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfDeleteLog().toUInt()

public actual fun pfGetInterfaceStatistics(pinterface: COpaquePointer?, ppfstats: COpaquePointer?, pdwbuffersize: COpaquePointer?, fresetcounters: Bool): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfGetInterfaceStatistics((pinterface?.value ?: 0L), (ppfstats?.value ?: 0L), (pdwbuffersize?.value ?: 0L), fresetcounters).toUInt()

public actual fun pfMakeLog(hevent: Handle): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfMakeLog((hevent?.value ?: 0L)).toUInt()

public actual fun pfRebindFilters(pinterface: COpaquePointer?, platebindinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfRebindFilters((pinterface?.value ?: 0L), (platebindinfo?.value ?: 0L)).toUInt()

public actual fun pfRemoveFilterHandles(pinterface: COpaquePointer?, cfilters: UInt, pvhandles: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFilterHandles((pinterface?.value ?: 0L), cfilters.toInt(), (pvhandles?.value ?: 0L)).toUInt()

public actual fun pfRemoveFiltersFromInterface(ih: COpaquePointer?, cinfilters: UInt, pfiltin: COpaquePointer?, coutfilters: UInt, pfiltout: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFiltersFromInterface((ih?.value ?: 0L), cinfilters.toInt(), (pfiltin?.value ?: 0L), coutfilters.toInt(), (pfiltout?.value ?: 0L)).toUInt()

public actual fun pfRemoveGlobalFilterFromInterface(pinterface: COpaquePointer?, gffilter: GlobalFilter): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfRemoveGlobalFilterFromInterface((pinterface?.value ?: 0L), gffilter).toUInt()

public actual fun pfSetLogBuffer(pbbuffer: COpaquePointer?, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: COpaquePointer?, pdwlostentries: COpaquePointer?, pdwsizeused: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfSetLogBuffer((pbbuffer?.value ?: 0L), dwsize.toInt(), dwthreshold.toInt(), dwentries.toInt(), (pdwloggedentries?.value ?: 0L), (pdwlostentries?.value ?: 0L), (pdwsizeused?.value ?: 0L)).toUInt()

public actual fun pfTestPacket(pininterface: COpaquePointer?, poutinterface: COpaquePointer?, cbytes: UInt, pbpacket: COpaquePointer?, ppaction: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfTestPacket((pininterface?.value ?: 0L), (poutinterface?.value ?: 0L), cbytes.toInt(), (pbpacket?.value ?: 0L), (ppaction?.value ?: 0L)).toUInt()

public actual fun pfUnBindInterface(pinterface: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_pfUnBindInterface((pinterface?.value ?: 0L)).toUInt()

public actual fun registerInterfaceTimestampConfigChange(callback: PinterfaceTimestampConfigChangeCallback, callercontext: COpaquePointer?, notificationhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_registerInterfaceTimestampConfigChange(0L, (callercontext?.value ?: 0L), (notificationhandle?.value ?: 0L)).toUInt()

public actual fun resolveIpNetEntry2(row: COpaquePointer?, sourceaddress: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_resolveIpNetEntry2((row?.value ?: 0L), (sourceaddress?.value ?: 0L)).toUInt()

public actual fun resolveNeighbor(networkaddress: COpaquePointer?, physicaladdress: COpaquePointer?, physicaladdresslength: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_resolveNeighbor((networkaddress?.value ?: 0L), (physicaladdress?.value ?: 0L), (physicaladdresslength?.value ?: 0L)).toUInt()

public actual fun restoreMediaSense(poverlapped: COpaquePointer?, lpdwenablecount: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_restoreMediaSense((poverlapped?.value ?: 0L), (lpdwenablecount?.value ?: 0L)).toUInt()

public actual fun sendARP(destip: UInt, srcip: UInt, pmacaddr: COpaquePointer?, phyaddrlen: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_sendARP(destip.toInt(), srcip.toInt(), (pmacaddr?.value ?: 0L), (phyaddrlen?.value ?: 0L)).toUInt()

public actual fun setCurrentThreadCompartmentId(compartmentid: NetIfCompartmentId): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentId(compartmentid.toInt()).toUInt()

public actual fun setCurrentThreadCompartmentScope(compartmentscope: UInt): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentScope(compartmentscope.toInt()).toUInt()

public actual fun setDnsSettings(settings: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setDnsSettings((settings?.value ?: 0L)).toUInt()

public actual fun setIfEntry(pifrow: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setIfEntry((pifrow?.value ?: 0L)).toUInt()

public actual fun setInterfaceDnsSettings(iface: Guid, settings: COpaquePointer?): Win32Error =
    0u

public actual fun setIpForwardEntry(proute: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry((proute?.value ?: 0L)).toUInt()

public actual fun setIpForwardEntry2(route: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry2((route?.value ?: 0L)).toUInt()

public actual fun setIpInterfaceEntry(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setIpInterfaceEntry((row?.value ?: 0L)).toUInt()

public actual fun setIpNetEntry(parpentry: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry((parpentry?.value ?: 0L)).toUInt()

public actual fun setIpNetEntry2(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry2((row?.value ?: 0L)).toUInt()

public actual fun setIpStatistics(pipstats: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setIpStatistics((pipstats?.value ?: 0L)).toUInt()

public actual fun setIpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setIpStatisticsEx((statistics?.value ?: 0L), family.toInt()).toUInt()

public actual fun setIpTTL(nttl: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setIpTTL(nttl.toInt()).toUInt()

public actual fun setJobCompartmentId(jobhandle: Handle, compartmentid: NetIfCompartmentId): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setJobCompartmentId((jobhandle?.value ?: 0L), compartmentid.toInt()).toUInt()

public actual fun setNetworkInformation(networkguid: COpaquePointer?, compartmentid: NetIfCompartmentId, networkname: Pcwstr): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setNetworkInformation((networkguid?.value ?: 0L), compartmentid.toInt(), (networkname?.value ?: 0L)).toUInt()

public actual fun setPerTcp6ConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setPerTcp6ConnectionEStats((row?.value ?: 0L), estatstype, (rw?.value ?: 0L), rwversion.toInt(), rwsize.toInt(), offset.toInt()).toUInt()

public actual fun setPerTcpConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setPerTcpConnectionEStats((row?.value ?: 0L), estatstype, (rw?.value ?: 0L), rwversion.toInt(), rwsize.toInt(), offset.toInt()).toUInt()

public actual fun setSessionCompartmentId(sessionid: UInt, compartmentid: NetIfCompartmentId): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setSessionCompartmentId(sessionid.toInt(), compartmentid.toInt()).toUInt()

public actual fun setTcpEntry(ptcprow: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setTcpEntry((ptcprow?.value ?: 0L)).toUInt()

public actual fun setUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_setUnicastIpAddressEntry((row?.value ?: 0L)).toUInt()

public actual fun unenableRouter(poverlapped: COpaquePointer?, lpdwenablecount: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_unenableRouter((poverlapped?.value ?: 0L), (lpdwenablecount?.value ?: 0L)).toUInt()

public actual fun unregisterInterfaceTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_unregisterInterfaceTimestampConfigChange((notificationhandle?.value ?: 0L))
}

public actual fun ifIndextoname(interfaceindex: UInt, interfacename: Pstr): Pstr =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ifIndextoname(interfaceindex.toInt(), (interfacename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ifNametoindex(interfacename: Pcstr): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ifNametoindex((interfacename?.value ?: 0L)).toUInt()
