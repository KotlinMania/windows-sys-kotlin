@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.ADDRESS_FAMILY
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NET_IF_COMPARTMENT_ID
import io.github.kotlinmania.windowssys.windows.win32.system.io.PIO_APC_ROUTINE

private object WindowsWin32NetworkmanagementIphelperJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_AddIPAddress(address: Int, ipmask: Int, ifindex: Int, ntecontext: Long, nteinstance: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CancelIPChangeNotify(notifyoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CancelIfTimestampConfigChange(notificationhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CancelMibChangeNotify2(notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CaptureInterfaceHardwareCrossTimestamp(interfaceluid: Long, crosstimestamp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentGuidToId(compartmentguid: Long, compartmentid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentIdToGuid(compartmentid: Int, compartmentguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceAliasToLuid(interfacealias: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceGuidToLuid(interfaceguid: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceIndexToLuid(interfaceindex: Int, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToAlias(interfaceluid: Long, interfacealias: Long, length: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToGuid(interfaceluid: Long, interfaceguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToIndex(interfaceluid: Long, interfaceindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameA(interfaceluid: Long, interfacename: Long, length: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameW(interfaceluid: Long, interfacename: Long, length: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidA(interfacename: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidW(interfacename: Long, interfaceluid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertIpv4MaskToLength(mask: Int, masklength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ConvertLengthToIpv4Mask(masklength: Int, mask: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CreateAnycastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry(proute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry(parpentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentTcpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentUdpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CreateProxyArpEntry(dwaddress: Int, dwmask: Int, dwifindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CreateSortedAddressPairs(sourceaddresslist: Long, sourceaddresscount: Int, destinationaddresslist: Long, destinationaddresscount: Int, addresssortoptions: Int, sortedaddresspairlist: Long, sortedaddresspaircount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_CreateUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_DeleteAnycastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_DeleteIPAddress(ntecontext: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry(proute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry(parpentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentTcpPortReservation(startport: Short, numberofports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentUdpPortReservation(startport: Short, numberofports: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_DeleteProxyArpEntry(dwaddress: Int, dwmask: Int, dwifindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_DeleteUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_DisableMediaSense(phandle: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_EnableRouter(phandle: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable(dwifindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable2(family: Short, interfaceindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_FlushIpPathTable(family: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_FreeDnsSettings(settings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_FreeInterfaceDnsSettings(settings: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_FreeMibTable(memory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetAdapterIndex(adaptername: Long, ifindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetAdapterOrderMap(): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersAddresses(family: Int, flags: Int, reserved: Long, adapteraddresses: Long, sizepointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersInfo(adapterinfo: Long, sizepointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetBestInterface(dwdestaddr: Int, pdwbestifindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetBestInterfaceEx(pdestaddr: Long, pdwbestifindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute(dwdestaddr: Int, dwsourceaddr: Int, pbestroute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute2(interfaceluid: Long, interfaceindex: Int, sourceaddress: Long, destinationaddress: Long, addresssortoptions: Int, bestroute: Long, bestsourceaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentScope(compartmentscope: Long, compartmentid: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetDefaultCompartmentId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetDnsSettings(settings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetExtendedTcpTable(ptcptable: Long, pdwsize: Long, border: Int, ulaf: Int, tableclass: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetExtendedUdpTable(pudptable: Long, pdwsize: Long, border: Int, ulaf: Int, tableclass: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetFriendlyIfIndex(ifindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatistics(statistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry(pifrow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2Ex(level: Int, row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIfStackTable(table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIfTable(piftable: Long, pdwsize: Long, border: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2(table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2Ex(level: Int, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceActiveTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceCurrentTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceHardwareTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceInfo(piftable: Long, dwoutbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceSupportedTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetInvertedIfStackTable(table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpAddrTable(pipaddrtable: Long, pdwsize: Long, border: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpErrorString(errorcode: Int, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable(pipforwardtable: Long, pdwsize: Long, border: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable2(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable(ipnettable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable2(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpNetworkConnectionBandwidthEstimates(interfaceindex: Int, addressfamily: Short, bandwidthestimates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpPathEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpPathTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpStatistics(statistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetIpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetJobCompartmentId(jobhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHint(connectivityhint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHintForInterface(interfaceindex: Int, connectivityhint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetNetworkInformation(networkguid: Long, compartmentid: Long, siteid: Long, networkname: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetNetworkParams(pfixedinfo: Long, poutbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetNumberOfInterfaces(pdwnumif: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromPidAndInfo(ulpid: Int, pinfo: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcp6Entry(ptcpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcpEntry(ptcpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdp6Entry(pudpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdpEntry(pudpentry: Long, cls: Int, pbuffer: Long, pdwsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetPerAdapterInfo(ifindex: Int, pperadapterinfo: Long, poutbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetPerTcp6ConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, ros: Long, rosversion: Int, rossize: Int, rod: Long, rodversion: Int, rodsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetPerTcpConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, ros: Long, rosversion: Int, rossize: Int, rod: Long, rodversion: Int, rodsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetRTTAndHopCount(destipaddress: Int, hopcount: Long, maxhops: Int, rtt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetSessionCompartmentId(sessionid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table2(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatistics(statistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx2(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable2(tcptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetTeredoPort(port: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetUdp6Table(udp6table: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatistics(stats: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx2(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetUdpTable(udptable: Long, sizepointer: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetUniDirectionalAdapterInfo(pipifinfo: Long, dwoutbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressTable(family: Short, table: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_Icmp6CreateFile(): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_Icmp6ParseReplies(replybuffer: Long, replysize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_IcmpCloseHandle(icmphandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_IcmpCreateFile(): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_IcmpParseReplies(replybuffer: Long, replysize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_IcmpSendEcho(icmphandle: Long, destinationaddress: Int, requestdata: Long, requestsize: Short, requestoptions: Long, replybuffer: Long, replysize: Int, timeout: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_InitializeIpForwardEntry(row: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_InitializeIpInterfaceEntry(row: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_InitializeUnicastIpAddressEntry(row: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_IpReleaseAddress(adapterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_IpRenewAddress(adapterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentTcpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentUdpPortReservation(startport: Short, numberofports: Short, token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_NhpAllocateAndGetInterfaceInfoFromStack(pptable: Long, pdwcount: Long, border: Int, hheap: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_NotifyAddrChange(handle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_NotifyIfTimestampConfigChange(callercontext: Long, callback: Long, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_NotifyIpInterfaceChange(family: Short, callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_NotifyNetworkConnectivityHintChange(callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange(handle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange2(addressfamily: Short, callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_NotifyStableUnicastIpAddressTable(family: Short, table: Long, callercallback: Long, callercontext: Long, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_NotifyTeredoPortChange(callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_NotifyUnicastIpAddressChange(family: Short, callback: Long, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ParseNetworkString(networkstring: Long, types: Int, addressinfo: Long, portnumber: Long, prefixlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfAddFiltersToInterface(ih: Long, cinfilters: Int, pfiltin: Long, coutfilters: Int, pfiltout: Long, pfhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfAddGlobalFilterToInterface(pinterface: Long, gffilter: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIPAddress(pinterface: Long, pfattype: Int, ipaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIndex(pinterface: Long, dwindex: Int, pfatlinktype: Int, linkipaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfCreateInterface(dwname: Int, inaction: Int, outaction: Int, buselog: Int, bmustbeunique: Int, ppinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfDeleteInterface(pinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfDeleteLog(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfGetInterfaceStatistics(pinterface: Long, ppfstats: Long, pdwbuffersize: Long, fresetcounters: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfMakeLog(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfRebindFilters(pinterface: Long, platebindinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFilterHandles(pinterface: Long, cfilters: Int, pvhandles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFiltersFromInterface(ih: Long, cinfilters: Int, pfiltin: Long, coutfilters: Int, pfiltout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfRemoveGlobalFilterFromInterface(pinterface: Long, gffilter: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfSetLogBuffer(pbbuffer: Long, dwsize: Int, dwthreshold: Int, dwentries: Int, pdwloggedentries: Long, pdwlostentries: Long, pdwsizeused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfTestPacket(pininterface: Long, poutinterface: Long, cbytes: Int, pbpacket: Long, ppaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_PfUnBindInterface(pinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_RegisterInterfaceTimestampConfigChange(callback: Long, callercontext: Long, notificationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ResolveIpNetEntry2(row: Long, sourceaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_ResolveNeighbor(networkaddress: Long, physicaladdress: Long, physicaladdresslength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_RestoreMediaSense(poverlapped: Long, lpdwenablecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SendARP(destip: Int, srcip: Int, pmacaddr: Long, phyaddrlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentId(compartmentid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentScope(compartmentscope: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetDnsSettings(settings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetIfEntry(pifrow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry(proute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry2(route: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetIpInterfaceEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry(parpentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry2(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetIpStatistics(pipstats: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetIpStatisticsEx(statistics: Long, family: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetIpTTL(nttl: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetJobCompartmentId(jobhandle: Long, compartmentid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetNetworkInformation(networkguid: Long, compartmentid: Int, networkname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetPerTcp6ConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, offset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetPerTcpConnectionEStats(row: Long, estatstype: Int, rw: Long, rwversion: Int, rwsize: Int, offset: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetSessionCompartmentId(sessionid: Int, compartmentid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetTcpEntry(ptcprow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_SetUnicastIpAddressEntry(row: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_UnenableRouter(poverlapped: Long, lpdwenablecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_UnregisterInterfaceTimestampConfigChange(notificationhandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_if_indextoname(interfaceindex: Int, interfacename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_iphelper_if_nametoindex(interfacename: Long): Int
}

public actual fun AddIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: Long, nteinstance: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_AddIPAddress(address.toInt(), ipmask.toInt(), ifindex.toInt(), ntecontext, nteinstance).toUInt()

public actual fun CancelIPChangeNotify(notifyoverlapped: Long): BOOL =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CancelIPChangeNotify(notifyoverlapped)

public actual fun CancelIfTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CancelIfTimestampConfigChange(notificationhandle)
}

public actual fun CancelMibChangeNotify2(notificationhandle: HANDLE): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CancelMibChangeNotify2(notificationhandle).toUInt()

public actual fun CaptureInterfaceHardwareCrossTimestamp(interfaceluid: Long, crosstimestamp: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CaptureInterfaceHardwareCrossTimestamp(interfaceluid, crosstimestamp).toUInt()

public actual fun ConvertCompartmentGuidToId(compartmentguid: Long, compartmentid: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentGuidToId(compartmentguid, compartmentid).toUInt()

public actual fun ConvertCompartmentIdToGuid(compartmentid: NET_IF_COMPARTMENT_ID, compartmentguid: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentIdToGuid(compartmentid.toInt(), compartmentguid).toUInt()

public actual fun ConvertInterfaceAliasToLuid(interfacealias: PCWSTR, interfaceluid: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceAliasToLuid(interfacealias, interfaceluid).toUInt()

public actual fun ConvertInterfaceGuidToLuid(interfaceguid: Long, interfaceluid: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceGuidToLuid(interfaceguid, interfaceluid).toUInt()

public actual fun ConvertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceIndexToLuid(interfaceindex.toInt(), interfaceluid).toUInt()

public actual fun ConvertInterfaceLuidToAlias(interfaceluid: Long, interfacealias: PWSTR, length: ULong): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToAlias(interfaceluid, interfacealias, length.toLong()).toUInt()

public actual fun ConvertInterfaceLuidToGuid(interfaceluid: Long, interfaceguid: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToGuid(interfaceluid, interfaceguid).toUInt()

public actual fun ConvertInterfaceLuidToIndex(interfaceluid: Long, interfaceindex: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToIndex(interfaceluid, interfaceindex).toUInt()

public actual fun ConvertInterfaceLuidToNameA(interfaceluid: Long, interfacename: PSTR, length: ULong): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameA(interfaceluid, interfacename, length.toLong()).toUInt()

public actual fun ConvertInterfaceLuidToNameW(interfaceluid: Long, interfacename: PWSTR, length: ULong): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameW(interfaceluid, interfacename, length.toLong()).toUInt()

public actual fun ConvertInterfaceNameToLuidA(interfacename: PCSTR, interfaceluid: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidA(interfacename, interfaceluid).toUInt()

public actual fun ConvertInterfaceNameToLuidW(interfacename: PCWSTR, interfaceluid: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidW(interfacename, interfaceluid).toUInt()

public actual fun ConvertIpv4MaskToLength(mask: UInt, masklength: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertIpv4MaskToLength(mask.toInt(), masklength).toUInt()

public actual fun ConvertLengthToIpv4Mask(masklength: UInt, mask: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ConvertLengthToIpv4Mask(masklength.toInt(), mask).toUInt()

public actual fun CreateAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CreateAnycastIpAddressEntry(row).toUInt()

public actual fun CreateIpForwardEntry(proute: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry(proute).toUInt()

public actual fun CreateIpForwardEntry2(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry2(row).toUInt()

public actual fun CreateIpNetEntry(parpentry: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry(parpentry).toUInt()

public actual fun CreateIpNetEntry2(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry2(row).toUInt()

public actual fun CreatePersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentTcpPortReservation(startport.toShort(), numberofports.toShort(), token).toUInt()

public actual fun CreatePersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentUdpPortReservation(startport.toShort(), numberofports.toShort(), token).toUInt()

public actual fun CreateProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CreateProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt()

public actual fun CreateSortedAddressPairs(sourceaddresslist: Long, sourceaddresscount: UInt, destinationaddresslist: Long, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: Long, sortedaddresspaircount: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CreateSortedAddressPairs(sourceaddresslist, sourceaddresscount.toInt(), destinationaddresslist, destinationaddresscount.toInt(), addresssortoptions.toInt(), sortedaddresspairlist, sortedaddresspaircount).toUInt()

public actual fun CreateUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_CreateUnicastIpAddressEntry(row).toUInt()

public actual fun DeleteAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_DeleteAnycastIpAddressEntry(row).toUInt()

public actual fun DeleteIPAddress(ntecontext: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_DeleteIPAddress(ntecontext.toInt()).toUInt()

public actual fun DeleteIpForwardEntry(proute: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry(proute).toUInt()

public actual fun DeleteIpForwardEntry2(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry2(row).toUInt()

public actual fun DeleteIpNetEntry(parpentry: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry(parpentry).toUInt()

public actual fun DeleteIpNetEntry2(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry2(row).toUInt()

public actual fun DeletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentTcpPortReservation(startport.toShort(), numberofports.toShort()).toUInt()

public actual fun DeletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentUdpPortReservation(startport.toShort(), numberofports.toShort()).toUInt()

public actual fun DeleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_DeleteProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt()

public actual fun DeleteUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_DeleteUnicastIpAddressEntry(row).toUInt()

public actual fun DisableMediaSense(phandle: Long, poverlapped: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_DisableMediaSense(phandle, poverlapped).toUInt()

public actual fun EnableRouter(phandle: Long, poverlapped: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_EnableRouter(phandle, poverlapped).toUInt()

public actual fun FlushIpNetTable(dwifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable(dwifindex.toInt()).toUInt()

public actual fun FlushIpNetTable2(family: ADDRESS_FAMILY, interfaceindex: UInt): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable2(family.toShort(), interfaceindex.toInt()).toUInt()

public actual fun FlushIpPathTable(family: ADDRESS_FAMILY): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_FlushIpPathTable(family.toShort()).toUInt()

public actual fun FreeDnsSettings(settings: Long) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_FreeDnsSettings(settings)
}

public actual fun FreeInterfaceDnsSettings(settings: Long) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_FreeInterfaceDnsSettings(settings)
}

public actual fun FreeMibTable(memory: Long) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_FreeMibTable(memory)
}

public actual fun GetAdapterIndex(adaptername: PCWSTR, ifindex: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetAdapterIndex(adaptername, ifindex).toUInt()

public actual fun GetAdapterOrderMap(): Long =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetAdapterOrderMap()

public actual fun GetAdaptersAddresses(family: UInt, flags: GET_ADAPTERS_ADDRESSES_FLAGS, reserved: Long, adapteraddresses: Long, sizepointer: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersAddresses(family.toInt(), flags.toInt(), reserved, adapteraddresses, sizepointer).toUInt()

public actual fun GetAdaptersInfo(adapterinfo: Long, sizepointer: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersInfo(adapterinfo, sizepointer).toUInt()

public actual fun GetAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressEntry(row).toUInt()

public actual fun GetAnycastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressTable(family.toShort(), table).toUInt()

public actual fun GetBestInterface(dwdestaddr: UInt, pdwbestifindex: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetBestInterface(dwdestaddr.toInt(), pdwbestifindex).toUInt()

public actual fun GetBestInterfaceEx(pdestaddr: Long, pdwbestifindex: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetBestInterfaceEx(pdestaddr, pdwbestifindex).toUInt()

public actual fun GetBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute(dwdestaddr.toInt(), dwsourceaddr.toInt(), pbestroute).toUInt()

public actual fun GetBestRoute2(interfaceluid: Long, interfaceindex: UInt, sourceaddress: Long, destinationaddress: Long, addresssortoptions: UInt, bestroute: Long, bestsourceaddress: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute2(interfaceluid, interfaceindex.toInt(), sourceaddress, destinationaddress, addresssortoptions.toInt(), bestroute, bestsourceaddress).toUInt()

public actual fun GetCurrentThreadCompartmentId(): NET_IF_COMPARTMENT_ID =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentId().toUInt()

public actual fun GetCurrentThreadCompartmentScope(compartmentscope: Long, compartmentid: Long) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentScope(compartmentscope, compartmentid)
}

public actual fun GetDefaultCompartmentId(): NET_IF_COMPARTMENT_ID =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetDefaultCompartmentId().toUInt()

public actual fun GetDnsSettings(settings: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetDnsSettings(settings).toUInt()

public actual fun GetExtendedTcpTable(ptcptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: TCP_TABLE_CLASS, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetExtendedTcpTable(ptcptable, pdwsize, border, ulaf.toInt(), tableclass, reserved.toInt()).toUInt()

public actual fun GetExtendedUdpTable(pudptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: UDP_TABLE_CLASS, reserved: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetExtendedUdpTable(pudptable, pdwsize, border, ulaf.toInt(), tableclass, reserved.toInt()).toUInt()

public actual fun GetFriendlyIfIndex(ifindex: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetFriendlyIfIndex(ifindex.toInt()).toUInt()

public actual fun GetIcmpStatistics(statistics: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatistics(statistics).toUInt()

public actual fun GetIcmpStatisticsEx(statistics: Long, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatisticsEx(statistics, family.toInt()).toUInt()

public actual fun GetIfEntry(pifrow: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry(pifrow).toUInt()

public actual fun GetIfEntry2(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2(row).toUInt()

public actual fun GetIfEntry2Ex(level: MIB_IF_ENTRY_LEVEL, row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2Ex(level, row).toUInt()

public actual fun GetIfStackTable(table: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIfStackTable(table).toUInt()

public actual fun GetIfTable(piftable: Long, pdwsize: Long, border: BOOL): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIfTable(piftable, pdwsize, border).toUInt()

public actual fun GetIfTable2(table: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2(table).toUInt()

public actual fun GetIfTable2Ex(level: MIB_IF_TABLE_LEVEL, table: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2Ex(level, table).toUInt()

public actual fun GetInterfaceActiveTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceActiveTimestampCapabilities(interfaceluid, timestampcapabilites).toUInt()

public actual fun GetInterfaceCurrentTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceCurrentTimestampCapabilities(interfaceluid, timestampcapabilites).toUInt()

public actual fun GetInterfaceDnsSettings(iface: GUID, settings: Long): WIN32_ERROR =
    0u

public actual fun GetInterfaceHardwareTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceHardwareTimestampCapabilities(interfaceluid, timestampcapabilites).toUInt()

public actual fun GetInterfaceInfo(piftable: Long, dwoutbuflen: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceInfo(piftable, dwoutbuflen).toUInt()

public actual fun GetInterfaceSupportedTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceSupportedTimestampCapabilities(interfaceluid, timestampcapabilites).toUInt()

public actual fun GetInvertedIfStackTable(table: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetInvertedIfStackTable(table).toUInt()

public actual fun GetIpAddrTable(pipaddrtable: Long, pdwsize: Long, border: BOOL): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpAddrTable(pipaddrtable, pdwsize, border).toUInt()

public actual fun GetIpErrorString(errorcode: UInt, buffer: PWSTR, size: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpErrorString(errorcode.toInt(), buffer, size).toUInt()

public actual fun GetIpForwardEntry2(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardEntry2(row).toUInt()

public actual fun GetIpForwardTable(pipforwardtable: Long, pdwsize: Long, border: BOOL): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable(pipforwardtable, pdwsize, border).toUInt()

public actual fun GetIpForwardTable2(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable2(family.toShort(), table).toUInt()

public actual fun GetIpInterfaceEntry(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceEntry(row).toUInt()

public actual fun GetIpInterfaceTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceTable(family.toShort(), table).toUInt()

public actual fun GetIpNetEntry2(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetEntry2(row).toUInt()

public actual fun GetIpNetTable(ipnettable: Long, sizepointer: Long, order: BOOL): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable(ipnettable, sizepointer, order).toUInt()

public actual fun GetIpNetTable2(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable2(family.toShort(), table).toUInt()

public actual fun GetIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: ADDRESS_FAMILY, bandwidthestimates: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetworkConnectionBandwidthEstimates(interfaceindex.toInt(), addressfamily.toShort(), bandwidthestimates).toUInt()

public actual fun GetIpPathEntry(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpPathEntry(row).toUInt()

public actual fun GetIpPathTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpPathTable(family.toShort(), table).toUInt()

public actual fun GetIpStatistics(statistics: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpStatistics(statistics).toUInt()

public actual fun GetIpStatisticsEx(statistics: Long, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetIpStatisticsEx(statistics, family.toInt()).toUInt()

public actual fun GetJobCompartmentId(jobhandle: HANDLE): NET_IF_COMPARTMENT_ID =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetJobCompartmentId(jobhandle).toUInt()

public actual fun GetMulticastIpAddressEntry(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressEntry(row).toUInt()

public actual fun GetMulticastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressTable(family.toShort(), table).toUInt()

public actual fun GetNetworkConnectivityHint(connectivityhint: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHint(connectivityhint).toUInt()

public actual fun GetNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHintForInterface(interfaceindex.toInt(), connectivityhint).toUInt()

public actual fun GetNetworkInformation(networkguid: Long, compartmentid: Long, siteid: Long, networkname: PWSTR, length: UInt): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkInformation(networkguid, compartmentid, siteid, networkname, length.toInt()).toUInt()

public actual fun GetNetworkParams(pfixedinfo: Long, poutbuflen: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkParams(pfixedinfo, poutbuflen).toUInt()

public actual fun GetNumberOfInterfaces(pdwnumif: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetNumberOfInterfaces(pdwnumif).toUInt()

public actual fun GetOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromPidAndInfo(ulpid.toInt(), pinfo, cls, pbuffer, pdwsize).toUInt()

public actual fun GetOwnerModuleFromTcp6Entry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcp6Entry(ptcpentry, cls, pbuffer, pdwsize).toUInt()

public actual fun GetOwnerModuleFromTcpEntry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcpEntry(ptcpentry, cls, pbuffer, pdwsize).toUInt()

public actual fun GetOwnerModuleFromUdp6Entry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdp6Entry(pudpentry, cls, pbuffer, pdwsize).toUInt()

public actual fun GetOwnerModuleFromUdpEntry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdpEntry(pudpentry, cls, pbuffer, pdwsize).toUInt()

public actual fun GetPerAdapterInfo(ifindex: UInt, pperadapterinfo: Long, poutbuflen: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetPerAdapterInfo(ifindex.toInt(), pperadapterinfo, poutbuflen).toUInt()

public actual fun GetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetPerTcp6ConnectionEStats(row, estatstype, rw, rwversion.toInt(), rwsize.toInt(), ros, rosversion.toInt(), rossize.toInt(), rod, rodversion.toInt(), rodsize.toInt()).toUInt()

public actual fun GetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetPerTcpConnectionEStats(row, estatstype, rw, rwversion.toInt(), rwsize.toInt(), ros, rosversion.toInt(), rossize.toInt(), rod, rodversion.toInt(), rodsize.toInt()).toUInt()

public actual fun GetRTTAndHopCount(destipaddress: UInt, hopcount: Long, maxhops: UInt, rtt: Long): BOOL =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetRTTAndHopCount(destipaddress.toInt(), hopcount, maxhops.toInt(), rtt)

public actual fun GetSessionCompartmentId(sessionid: UInt): NET_IF_COMPARTMENT_ID =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetSessionCompartmentId(sessionid.toInt()).toUInt()

public actual fun GetTcp6Table(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table(tcptable, sizepointer, order).toUInt()

public actual fun GetTcp6Table2(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table2(tcptable, sizepointer, order).toUInt()

public actual fun GetTcpStatistics(statistics: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatistics(statistics).toUInt()

public actual fun GetTcpStatisticsEx(statistics: Long, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx(statistics, family.toInt()).toUInt()

public actual fun GetTcpStatisticsEx2(statistics: Long, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx2(statistics, family.toInt()).toUInt()

public actual fun GetTcpTable(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable(tcptable, sizepointer, order).toUInt()

public actual fun GetTcpTable2(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable2(tcptable, sizepointer, order).toUInt()

public actual fun GetTeredoPort(port: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetTeredoPort(port).toUInt()

public actual fun GetUdp6Table(udp6table: Long, sizepointer: Long, order: BOOL): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetUdp6Table(udp6table, sizepointer, order).toUInt()

public actual fun GetUdpStatistics(stats: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatistics(stats).toUInt()

public actual fun GetUdpStatisticsEx(statistics: Long, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx(statistics, family.toInt()).toUInt()

public actual fun GetUdpStatisticsEx2(statistics: Long, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx2(statistics, family.toInt()).toUInt()

public actual fun GetUdpTable(udptable: Long, sizepointer: Long, order: BOOL): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetUdpTable(udptable, sizepointer, order).toUInt()

public actual fun GetUniDirectionalAdapterInfo(pipifinfo: Long, dwoutbuflen: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetUniDirectionalAdapterInfo(pipifinfo, dwoutbuflen).toUInt()

public actual fun GetUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressEntry(row).toUInt()

public actual fun GetUnicastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressTable(family.toShort(), table).toUInt()

public actual fun Icmp6CreateFile(): HANDLE =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_Icmp6CreateFile()

public actual fun Icmp6ParseReplies(replybuffer: Long, replysize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_Icmp6ParseReplies(replybuffer, replysize.toInt()).toUInt()

public actual fun Icmp6SendEcho2(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, sourceaddress: Long, destinationaddress: Long, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun IcmpCloseHandle(icmphandle: HANDLE): BOOL =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_IcmpCloseHandle(icmphandle)

public actual fun IcmpCreateFile(): HANDLE =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_IcmpCreateFile()

public actual fun IcmpParseReplies(replybuffer: Long, replysize: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_IcmpParseReplies(replybuffer, replysize.toInt()).toUInt()

public actual fun IcmpSendEcho(icmphandle: HANDLE, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_IcmpSendEcho(icmphandle, destinationaddress.toInt(), requestdata, requestsize.toShort(), requestoptions, replybuffer, replysize.toInt(), timeout.toInt()).toUInt()

public actual fun IcmpSendEcho2(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun IcmpSendEcho2Ex(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, sourceaddress: UInt, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun InitializeIpForwardEntry(row: Long) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_InitializeIpForwardEntry(row)
}

public actual fun InitializeIpInterfaceEntry(row: Long) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_InitializeIpInterfaceEntry(row)
}

public actual fun InitializeUnicastIpAddressEntry(row: Long) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_InitializeUnicastIpAddressEntry(row)
}

public actual fun IpReleaseAddress(adapterinfo: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_IpReleaseAddress(adapterinfo).toUInt()

public actual fun IpRenewAddress(adapterinfo: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_IpRenewAddress(adapterinfo).toUInt()

public actual fun LookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentTcpPortReservation(startport.toShort(), numberofports.toShort(), token).toUInt()

public actual fun LookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentUdpPortReservation(startport.toShort(), numberofports.toShort(), token).toUInt()

public actual fun NhpAllocateAndGetInterfaceInfoFromStack(pptable: Long, pdwcount: Long, border: BOOL, hheap: HANDLE, dwflags: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_NhpAllocateAndGetInterfaceInfoFromStack(pptable, pdwcount, border, hheap, dwflags.toInt()).toUInt()

public actual fun NotifyAddrChange(handle: Long, overlapped: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_NotifyAddrChange(handle, overlapped).toUInt()

public actual fun NotifyIfTimestampConfigChange(callercontext: Long, callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, notificationhandle: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_NotifyIfTimestampConfigChange(callercontext, callback.toLong(), notificationhandle).toUInt()

public actual fun NotifyIpInterfaceChange(family: ADDRESS_FAMILY, callback: PIPINTERFACE_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_NotifyIpInterfaceChange(family.toShort(), callback.toLong(), callercontext, initialnotification, notificationhandle).toUInt()

public actual fun NotifyNetworkConnectivityHintChange(callback: PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_NotifyNetworkConnectivityHintChange(callback.toLong(), callercontext, initialnotification, notificationhandle).toUInt()

public actual fun NotifyRouteChange(handle: Long, overlapped: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange(handle, overlapped).toUInt()

public actual fun NotifyRouteChange2(addressfamily: ADDRESS_FAMILY, callback: PIPFORWARD_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange2(addressfamily.toShort(), callback.toLong(), callercontext, initialnotification, notificationhandle).toUInt()

public actual fun NotifyStableUnicastIpAddressTable(family: ADDRESS_FAMILY, table: Long, callercallback: PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACK, callercontext: Long, notificationhandle: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_NotifyStableUnicastIpAddressTable(family.toShort(), table, callercallback.toLong(), callercontext, notificationhandle).toUInt()

public actual fun NotifyTeredoPortChange(callback: PTEREDO_PORT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_NotifyTeredoPortChange(callback.toLong(), callercontext, initialnotification, notificationhandle).toUInt()

public actual fun NotifyUnicastIpAddressChange(family: ADDRESS_FAMILY, callback: PUNICAST_IPADDRESS_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_NotifyUnicastIpAddressChange(family.toShort(), callback.toLong(), callercontext, initialnotification, notificationhandle).toUInt()

public actual fun ParseNetworkString(networkstring: PCWSTR, types: UInt, addressinfo: Long, portnumber: Long, prefixlength: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ParseNetworkString(networkstring, types.toInt(), addressinfo, portnumber, prefixlength).toUInt()

public actual fun PfAddFiltersToInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long, pfhandle: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfAddFiltersToInterface(ih, cinfilters.toInt(), pfiltin, coutfilters.toInt(), pfiltout, pfhandle).toUInt()

public actual fun PfAddGlobalFilterToInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfAddGlobalFilterToInterface(pinterface, gffilter).toUInt()

public actual fun PfBindInterfaceToIPAddress(pinterface: Long, pfattype: PFADDRESSTYPE, ipaddress: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIPAddress(pinterface, pfattype, ipaddress).toUInt()

public actual fun PfBindInterfaceToIndex(pinterface: Long, dwindex: UInt, pfatlinktype: PFADDRESSTYPE, linkipaddress: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIndex(pinterface, dwindex.toInt(), pfatlinktype, linkipaddress).toUInt()

public actual fun PfCreateInterface(dwname: UInt, inaction: PFFORWARD_ACTION, outaction: PFFORWARD_ACTION, buselog: BOOL, bmustbeunique: BOOL, ppinterface: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfCreateInterface(dwname.toInt(), inaction, outaction, buselog, bmustbeunique, ppinterface).toUInt()

public actual fun PfDeleteInterface(pinterface: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfDeleteInterface(pinterface).toUInt()

public actual fun PfDeleteLog(): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfDeleteLog().toUInt()

public actual fun PfGetInterfaceStatistics(pinterface: Long, ppfstats: Long, pdwbuffersize: Long, fresetcounters: BOOL): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfGetInterfaceStatistics(pinterface, ppfstats, pdwbuffersize, fresetcounters).toUInt()

public actual fun PfMakeLog(hevent: HANDLE): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfMakeLog(hevent).toUInt()

public actual fun PfRebindFilters(pinterface: Long, platebindinfo: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfRebindFilters(pinterface, platebindinfo).toUInt()

public actual fun PfRemoveFilterHandles(pinterface: Long, cfilters: UInt, pvhandles: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFilterHandles(pinterface, cfilters.toInt(), pvhandles).toUInt()

public actual fun PfRemoveFiltersFromInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFiltersFromInterface(ih, cinfilters.toInt(), pfiltin, coutfilters.toInt(), pfiltout).toUInt()

public actual fun PfRemoveGlobalFilterFromInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfRemoveGlobalFilterFromInterface(pinterface, gffilter).toUInt()

public actual fun PfSetLogBuffer(pbbuffer: Long, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: Long, pdwlostentries: Long, pdwsizeused: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfSetLogBuffer(pbbuffer, dwsize.toInt(), dwthreshold.toInt(), dwentries.toInt(), pdwloggedentries, pdwlostentries, pdwsizeused).toUInt()

public actual fun PfTestPacket(pininterface: Long, poutinterface: Long, cbytes: UInt, pbpacket: Long, ppaction: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfTestPacket(pininterface, poutinterface, cbytes.toInt(), pbpacket, ppaction).toUInt()

public actual fun PfUnBindInterface(pinterface: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_PfUnBindInterface(pinterface).toUInt()

public actual fun RegisterInterfaceTimestampConfigChange(callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, callercontext: Long, notificationhandle: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_RegisterInterfaceTimestampConfigChange(callback.toLong(), callercontext, notificationhandle).toUInt()

public actual fun ResolveIpNetEntry2(row: Long, sourceaddress: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ResolveIpNetEntry2(row, sourceaddress).toUInt()

public actual fun ResolveNeighbor(networkaddress: Long, physicaladdress: Long, physicaladdresslength: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_ResolveNeighbor(networkaddress, physicaladdress, physicaladdresslength).toUInt()

public actual fun RestoreMediaSense(poverlapped: Long, lpdwenablecount: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_RestoreMediaSense(poverlapped, lpdwenablecount).toUInt()

public actual fun SendARP(destip: UInt, srcip: UInt, pmacaddr: Long, phyaddrlen: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SendARP(destip.toInt(), srcip.toInt(), pmacaddr, phyaddrlen).toUInt()

public actual fun SetCurrentThreadCompartmentId(compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentId(compartmentid.toInt()).toUInt()

public actual fun SetCurrentThreadCompartmentScope(compartmentscope: UInt): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentScope(compartmentscope.toInt()).toUInt()

public actual fun SetDnsSettings(settings: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetDnsSettings(settings).toUInt()

public actual fun SetIfEntry(pifrow: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetIfEntry(pifrow).toUInt()

public actual fun SetInterfaceDnsSettings(iface: GUID, settings: Long): WIN32_ERROR =
    0u

public actual fun SetIpForwardEntry(proute: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry(proute).toUInt()

public actual fun SetIpForwardEntry2(route: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry2(route).toUInt()

public actual fun SetIpInterfaceEntry(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetIpInterfaceEntry(row).toUInt()

public actual fun SetIpNetEntry(parpentry: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry(parpentry).toUInt()

public actual fun SetIpNetEntry2(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry2(row).toUInt()

public actual fun SetIpStatistics(pipstats: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetIpStatistics(pipstats).toUInt()

public actual fun SetIpStatisticsEx(statistics: Long, family: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetIpStatisticsEx(statistics, family.toInt()).toUInt()

public actual fun SetIpTTL(nttl: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetIpTTL(nttl.toInt()).toUInt()

public actual fun SetJobCompartmentId(jobhandle: HANDLE, compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetJobCompartmentId(jobhandle, compartmentid.toInt()).toUInt()

public actual fun SetNetworkInformation(networkguid: Long, compartmentid: NET_IF_COMPARTMENT_ID, networkname: PCWSTR): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetNetworkInformation(networkguid, compartmentid.toInt(), networkname).toUInt()

public actual fun SetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetPerTcp6ConnectionEStats(row, estatstype, rw, rwversion.toInt(), rwsize.toInt(), offset.toInt()).toUInt()

public actual fun SetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetPerTcpConnectionEStats(row, estatstype, rw, rwversion.toInt(), rwsize.toInt(), offset.toInt()).toUInt()

public actual fun SetSessionCompartmentId(sessionid: UInt, compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetSessionCompartmentId(sessionid.toInt(), compartmentid.toInt()).toUInt()

public actual fun SetTcpEntry(ptcprow: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetTcpEntry(ptcprow).toUInt()

public actual fun SetUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_SetUnicastIpAddressEntry(row).toUInt()

public actual fun UnenableRouter(poverlapped: Long, lpdwenablecount: Long): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_UnenableRouter(poverlapped, lpdwenablecount).toUInt()

public actual fun UnregisterInterfaceTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE) {
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_UnregisterInterfaceTimestampConfigChange(notificationhandle)
}

public actual fun if_indextoname(interfaceindex: UInt, interfacename: PSTR): PSTR =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_if_indextoname(interfaceindex.toInt(), interfacename)

public actual fun if_nametoindex(interfacename: PCSTR): UInt =
    WindowsWin32NetworkmanagementIphelperJniBridge.windowssys_windows_win32_networkmanagement_iphelper_if_nametoindex(interfacename).toUInt()
