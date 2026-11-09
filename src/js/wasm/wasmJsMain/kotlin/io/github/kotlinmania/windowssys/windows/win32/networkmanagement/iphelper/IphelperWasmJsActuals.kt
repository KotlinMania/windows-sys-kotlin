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

public actual fun AddIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: Long, nteinstance: Long): UInt =
    0u

public actual fun CancelIPChangeNotify(notifyoverlapped: Long): BOOL =
    0

public actual fun CancelIfTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE) {
}

public actual fun CancelMibChangeNotify2(notificationhandle: HANDLE): WIN32_ERROR =
    0u

public actual fun CaptureInterfaceHardwareCrossTimestamp(interfaceluid: Long, crosstimestamp: Long): UInt =
    0u

public actual fun ConvertCompartmentGuidToId(compartmentguid: Long, compartmentid: Long): WIN32_ERROR =
    0u

public actual fun ConvertCompartmentIdToGuid(compartmentid: NET_IF_COMPARTMENT_ID, compartmentguid: Long): WIN32_ERROR =
    0u

public actual fun ConvertInterfaceAliasToLuid(interfacealias: PCWSTR, interfaceluid: Long): WIN32_ERROR =
    0u

public actual fun ConvertInterfaceGuidToLuid(interfaceguid: Long, interfaceluid: Long): WIN32_ERROR =
    0u

public actual fun ConvertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: Long): WIN32_ERROR =
    0u

public actual fun ConvertInterfaceLuidToAlias(interfaceluid: Long, interfacealias: PWSTR, length: ULong): WIN32_ERROR =
    0u

public actual fun ConvertInterfaceLuidToGuid(interfaceluid: Long, interfaceguid: Long): WIN32_ERROR =
    0u

public actual fun ConvertInterfaceLuidToIndex(interfaceluid: Long, interfaceindex: Long): WIN32_ERROR =
    0u

public actual fun ConvertInterfaceLuidToNameA(interfaceluid: Long, interfacename: PSTR, length: ULong): WIN32_ERROR =
    0u

public actual fun ConvertInterfaceLuidToNameW(interfaceluid: Long, interfacename: PWSTR, length: ULong): WIN32_ERROR =
    0u

public actual fun ConvertInterfaceNameToLuidA(interfacename: PCSTR, interfaceluid: Long): WIN32_ERROR =
    0u

public actual fun ConvertInterfaceNameToLuidW(interfacename: PCWSTR, interfaceluid: Long): WIN32_ERROR =
    0u

public actual fun ConvertIpv4MaskToLength(mask: UInt, masklength: Long): WIN32_ERROR =
    0u

public actual fun ConvertLengthToIpv4Mask(masklength: UInt, mask: Long): WIN32_ERROR =
    0u

public actual fun CreateAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    0u

public actual fun CreateIpForwardEntry(proute: Long): UInt =
    0u

public actual fun CreateIpForwardEntry2(row: Long): WIN32_ERROR =
    0u

public actual fun CreateIpNetEntry(parpentry: Long): UInt =
    0u

public actual fun CreateIpNetEntry2(row: Long): WIN32_ERROR =
    0u

public actual fun CreatePersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    0u

public actual fun CreatePersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    0u

public actual fun CreateProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    0u

public actual fun CreateSortedAddressPairs(sourceaddresslist: Long, sourceaddresscount: UInt, destinationaddresslist: Long, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: Long, sortedaddresspaircount: Long): WIN32_ERROR =
    0u

public actual fun CreateUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    0u

public actual fun DeleteAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    0u

public actual fun DeleteIPAddress(ntecontext: UInt): UInt =
    0u

public actual fun DeleteIpForwardEntry(proute: Long): UInt =
    0u

public actual fun DeleteIpForwardEntry2(row: Long): WIN32_ERROR =
    0u

public actual fun DeleteIpNetEntry(parpentry: Long): UInt =
    0u

public actual fun DeleteIpNetEntry2(row: Long): WIN32_ERROR =
    0u

public actual fun DeletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt =
    0u

public actual fun DeletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt =
    0u

public actual fun DeleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    0u

public actual fun DeleteUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    0u

public actual fun DisableMediaSense(phandle: Long, poverlapped: Long): UInt =
    0u

public actual fun EnableRouter(phandle: Long, poverlapped: Long): UInt =
    0u

public actual fun FlushIpNetTable(dwifindex: UInt): UInt =
    0u

public actual fun FlushIpNetTable2(family: ADDRESS_FAMILY, interfaceindex: UInt): WIN32_ERROR =
    0u

public actual fun FlushIpPathTable(family: ADDRESS_FAMILY): WIN32_ERROR =
    0u

public actual fun FreeDnsSettings(settings: Long) {
}

public actual fun FreeInterfaceDnsSettings(settings: Long) {
}

public actual fun FreeMibTable(memory: Long) {
}

public actual fun GetAdapterIndex(adaptername: PCWSTR, ifindex: Long): UInt =
    0u

public actual fun GetAdapterOrderMap(): Long =
    0L

public actual fun GetAdaptersAddresses(family: UInt, flags: GET_ADAPTERS_ADDRESSES_FLAGS, reserved: Long, adapteraddresses: Long, sizepointer: Long): UInt =
    0u

public actual fun GetAdaptersInfo(adapterinfo: Long, sizepointer: Long): UInt =
    0u

public actual fun GetAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    0u

public actual fun GetAnycastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    0u

public actual fun GetBestInterface(dwdestaddr: UInt, pdwbestifindex: Long): UInt =
    0u

public actual fun GetBestInterfaceEx(pdestaddr: Long, pdwbestifindex: Long): UInt =
    0u

public actual fun GetBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: Long): UInt =
    0u

public actual fun GetBestRoute2(interfaceluid: Long, interfaceindex: UInt, sourceaddress: Long, destinationaddress: Long, addresssortoptions: UInt, bestroute: Long, bestsourceaddress: Long): WIN32_ERROR =
    0u

public actual fun GetCurrentThreadCompartmentId(): NET_IF_COMPARTMENT_ID =
    0u

public actual fun GetCurrentThreadCompartmentScope(compartmentscope: Long, compartmentid: Long) {
}

public actual fun GetDefaultCompartmentId(): NET_IF_COMPARTMENT_ID =
    0u

public actual fun GetDnsSettings(settings: Long): WIN32_ERROR =
    0u

public actual fun GetExtendedTcpTable(ptcptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: TCP_TABLE_CLASS, reserved: UInt): UInt =
    0u

public actual fun GetExtendedUdpTable(pudptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: UDP_TABLE_CLASS, reserved: UInt): UInt =
    0u

public actual fun GetFriendlyIfIndex(ifindex: UInt): UInt =
    0u

public actual fun GetIcmpStatistics(statistics: Long): UInt =
    0u

public actual fun GetIcmpStatisticsEx(statistics: Long, family: UInt): UInt =
    0u

public actual fun GetIfEntry(pifrow: Long): UInt =
    0u

public actual fun GetIfEntry2(row: Long): WIN32_ERROR =
    0u

public actual fun GetIfEntry2Ex(level: MIB_IF_ENTRY_LEVEL, row: Long): WIN32_ERROR =
    0u

public actual fun GetIfStackTable(table: Long): WIN32_ERROR =
    0u

public actual fun GetIfTable(piftable: Long, pdwsize: Long, border: BOOL): UInt =
    0u

public actual fun GetIfTable2(table: Long): WIN32_ERROR =
    0u

public actual fun GetIfTable2Ex(level: MIB_IF_TABLE_LEVEL, table: Long): WIN32_ERROR =
    0u

public actual fun GetInterfaceActiveTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    0u

public actual fun GetInterfaceCurrentTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    0u

public actual fun GetInterfaceDnsSettings(iface: GUID, settings: Long): WIN32_ERROR =
    0u

public actual fun GetInterfaceHardwareTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    0u

public actual fun GetInterfaceInfo(piftable: Long, dwoutbuflen: Long): UInt =
    0u

public actual fun GetInterfaceSupportedTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    0u

public actual fun GetInvertedIfStackTable(table: Long): WIN32_ERROR =
    0u

public actual fun GetIpAddrTable(pipaddrtable: Long, pdwsize: Long, border: BOOL): UInt =
    0u

public actual fun GetIpErrorString(errorcode: UInt, buffer: PWSTR, size: Long): UInt =
    0u

public actual fun GetIpForwardEntry2(row: Long): WIN32_ERROR =
    0u

public actual fun GetIpForwardTable(pipforwardtable: Long, pdwsize: Long, border: BOOL): UInt =
    0u

public actual fun GetIpForwardTable2(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    0u

public actual fun GetIpInterfaceEntry(row: Long): WIN32_ERROR =
    0u

public actual fun GetIpInterfaceTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    0u

public actual fun GetIpNetEntry2(row: Long): WIN32_ERROR =
    0u

public actual fun GetIpNetTable(ipnettable: Long, sizepointer: Long, order: BOOL): UInt =
    0u

public actual fun GetIpNetTable2(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    0u

public actual fun GetIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: ADDRESS_FAMILY, bandwidthestimates: Long): WIN32_ERROR =
    0u

public actual fun GetIpPathEntry(row: Long): WIN32_ERROR =
    0u

public actual fun GetIpPathTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    0u

public actual fun GetIpStatistics(statistics: Long): UInt =
    0u

public actual fun GetIpStatisticsEx(statistics: Long, family: UInt): UInt =
    0u

public actual fun GetJobCompartmentId(jobhandle: HANDLE): NET_IF_COMPARTMENT_ID =
    0u

public actual fun GetMulticastIpAddressEntry(row: Long): WIN32_ERROR =
    0u

public actual fun GetMulticastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    0u

public actual fun GetNetworkConnectivityHint(connectivityhint: Long): WIN32_ERROR =
    0u

public actual fun GetNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: Long): WIN32_ERROR =
    0u

public actual fun GetNetworkInformation(networkguid: Long, compartmentid: Long, siteid: Long, networkname: PWSTR, length: UInt): WIN32_ERROR =
    0u

public actual fun GetNetworkParams(pfixedinfo: Long, poutbuflen: Long): WIN32_ERROR =
    0u

public actual fun GetNumberOfInterfaces(pdwnumif: Long): UInt =
    0u

public actual fun GetOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    0u

public actual fun GetOwnerModuleFromTcp6Entry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    0u

public actual fun GetOwnerModuleFromTcpEntry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    0u

public actual fun GetOwnerModuleFromUdp6Entry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    0u

public actual fun GetOwnerModuleFromUdpEntry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    0u

public actual fun GetPerAdapterInfo(ifindex: UInt, pperadapterinfo: Long, poutbuflen: Long): UInt =
    0u

public actual fun GetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt =
    0u

public actual fun GetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt =
    0u

public actual fun GetRTTAndHopCount(destipaddress: UInt, hopcount: Long, maxhops: UInt, rtt: Long): BOOL =
    0

public actual fun GetSessionCompartmentId(sessionid: UInt): NET_IF_COMPARTMENT_ID =
    0u

public actual fun GetTcp6Table(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    0u

public actual fun GetTcp6Table2(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    0u

public actual fun GetTcpStatistics(statistics: Long): UInt =
    0u

public actual fun GetTcpStatisticsEx(statistics: Long, family: UInt): UInt =
    0u

public actual fun GetTcpStatisticsEx2(statistics: Long, family: UInt): UInt =
    0u

public actual fun GetTcpTable(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    0u

public actual fun GetTcpTable2(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    0u

public actual fun GetTeredoPort(port: Long): WIN32_ERROR =
    0u

public actual fun GetUdp6Table(udp6table: Long, sizepointer: Long, order: BOOL): UInt =
    0u

public actual fun GetUdpStatistics(stats: Long): UInt =
    0u

public actual fun GetUdpStatisticsEx(statistics: Long, family: UInt): UInt =
    0u

public actual fun GetUdpStatisticsEx2(statistics: Long, family: UInt): UInt =
    0u

public actual fun GetUdpTable(udptable: Long, sizepointer: Long, order: BOOL): UInt =
    0u

public actual fun GetUniDirectionalAdapterInfo(pipifinfo: Long, dwoutbuflen: Long): UInt =
    0u

public actual fun GetUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    0u

public actual fun GetUnicastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    0u

public actual fun Icmp6CreateFile(): HANDLE =
    0L

public actual fun Icmp6ParseReplies(replybuffer: Long, replysize: UInt): UInt =
    0u

public actual fun Icmp6SendEcho2(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, sourceaddress: Long, destinationaddress: Long, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun IcmpCloseHandle(icmphandle: HANDLE): BOOL =
    0

public actual fun IcmpCreateFile(): HANDLE =
    0L

public actual fun IcmpParseReplies(replybuffer: Long, replysize: UInt): UInt =
    0u

public actual fun IcmpSendEcho(icmphandle: HANDLE, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun IcmpSendEcho2(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun IcmpSendEcho2Ex(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, sourceaddress: UInt, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun InitializeIpForwardEntry(row: Long) {
}

public actual fun InitializeIpInterfaceEntry(row: Long) {
}

public actual fun InitializeUnicastIpAddressEntry(row: Long) {
}

public actual fun IpReleaseAddress(adapterinfo: Long): UInt =
    0u

public actual fun IpRenewAddress(adapterinfo: Long): UInt =
    0u

public actual fun LookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    0u

public actual fun LookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    0u

public actual fun NhpAllocateAndGetInterfaceInfoFromStack(pptable: Long, pdwcount: Long, border: BOOL, hheap: HANDLE, dwflags: UInt): UInt =
    0u

public actual fun NotifyAddrChange(handle: Long, overlapped: Long): UInt =
    0u

public actual fun NotifyIfTimestampConfigChange(callercontext: Long, callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, notificationhandle: Long): UInt =
    0u

public actual fun NotifyIpInterfaceChange(family: ADDRESS_FAMILY, callback: PIPINTERFACE_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    0u

public actual fun NotifyNetworkConnectivityHintChange(callback: PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    0u

public actual fun NotifyRouteChange(handle: Long, overlapped: Long): UInt =
    0u

public actual fun NotifyRouteChange2(addressfamily: ADDRESS_FAMILY, callback: PIPFORWARD_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    0u

public actual fun NotifyStableUnicastIpAddressTable(family: ADDRESS_FAMILY, table: Long, callercallback: PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACK, callercontext: Long, notificationhandle: Long): WIN32_ERROR =
    0u

public actual fun NotifyTeredoPortChange(callback: PTEREDO_PORT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    0u

public actual fun NotifyUnicastIpAddressChange(family: ADDRESS_FAMILY, callback: PUNICAST_IPADDRESS_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    0u

public actual fun ParseNetworkString(networkstring: PCWSTR, types: UInt, addressinfo: Long, portnumber: Long, prefixlength: Long): UInt =
    0u

public actual fun PfAddFiltersToInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long, pfhandle: Long): UInt =
    0u

public actual fun PfAddGlobalFilterToInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt =
    0u

public actual fun PfBindInterfaceToIPAddress(pinterface: Long, pfattype: PFADDRESSTYPE, ipaddress: Long): UInt =
    0u

public actual fun PfBindInterfaceToIndex(pinterface: Long, dwindex: UInt, pfatlinktype: PFADDRESSTYPE, linkipaddress: Long): UInt =
    0u

public actual fun PfCreateInterface(dwname: UInt, inaction: PFFORWARD_ACTION, outaction: PFFORWARD_ACTION, buselog: BOOL, bmustbeunique: BOOL, ppinterface: Long): UInt =
    0u

public actual fun PfDeleteInterface(pinterface: Long): UInt =
    0u

public actual fun PfDeleteLog(): UInt =
    0u

public actual fun PfGetInterfaceStatistics(pinterface: Long, ppfstats: Long, pdwbuffersize: Long, fresetcounters: BOOL): UInt =
    0u

public actual fun PfMakeLog(hevent: HANDLE): UInt =
    0u

public actual fun PfRebindFilters(pinterface: Long, platebindinfo: Long): UInt =
    0u

public actual fun PfRemoveFilterHandles(pinterface: Long, cfilters: UInt, pvhandles: Long): UInt =
    0u

public actual fun PfRemoveFiltersFromInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long): UInt =
    0u

public actual fun PfRemoveGlobalFilterFromInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt =
    0u

public actual fun PfSetLogBuffer(pbbuffer: Long, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: Long, pdwlostentries: Long, pdwsizeused: Long): UInt =
    0u

public actual fun PfTestPacket(pininterface: Long, poutinterface: Long, cbytes: UInt, pbpacket: Long, ppaction: Long): UInt =
    0u

public actual fun PfUnBindInterface(pinterface: Long): UInt =
    0u

public actual fun RegisterInterfaceTimestampConfigChange(callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, callercontext: Long, notificationhandle: Long): UInt =
    0u

public actual fun ResolveIpNetEntry2(row: Long, sourceaddress: Long): WIN32_ERROR =
    0u

public actual fun ResolveNeighbor(networkaddress: Long, physicaladdress: Long, physicaladdresslength: Long): UInt =
    0u

public actual fun RestoreMediaSense(poverlapped: Long, lpdwenablecount: Long): UInt =
    0u

public actual fun SendARP(destip: UInt, srcip: UInt, pmacaddr: Long, phyaddrlen: Long): UInt =
    0u

public actual fun SetCurrentThreadCompartmentId(compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    0u

public actual fun SetCurrentThreadCompartmentScope(compartmentscope: UInt): WIN32_ERROR =
    0u

public actual fun SetDnsSettings(settings: Long): WIN32_ERROR =
    0u

public actual fun SetIfEntry(pifrow: Long): UInt =
    0u

public actual fun SetInterfaceDnsSettings(iface: GUID, settings: Long): WIN32_ERROR =
    0u

public actual fun SetIpForwardEntry(proute: Long): UInt =
    0u

public actual fun SetIpForwardEntry2(route: Long): WIN32_ERROR =
    0u

public actual fun SetIpInterfaceEntry(row: Long): WIN32_ERROR =
    0u

public actual fun SetIpNetEntry(parpentry: Long): UInt =
    0u

public actual fun SetIpNetEntry2(row: Long): WIN32_ERROR =
    0u

public actual fun SetIpStatistics(pipstats: Long): UInt =
    0u

public actual fun SetIpStatisticsEx(statistics: Long, family: UInt): UInt =
    0u

public actual fun SetIpTTL(nttl: UInt): UInt =
    0u

public actual fun SetJobCompartmentId(jobhandle: HANDLE, compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    0u

public actual fun SetNetworkInformation(networkguid: Long, compartmentid: NET_IF_COMPARTMENT_ID, networkname: PCWSTR): WIN32_ERROR =
    0u

public actual fun SetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    0u

public actual fun SetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    0u

public actual fun SetSessionCompartmentId(sessionid: UInt, compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    0u

public actual fun SetTcpEntry(ptcprow: Long): UInt =
    0u

public actual fun SetUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    0u

public actual fun UnenableRouter(poverlapped: Long, lpdwenablecount: Long): UInt =
    0u

public actual fun UnregisterInterfaceTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE) {
}

public actual fun if_indextoname(interfaceindex: UInt, interfacename: PSTR): PSTR =
    0L

public actual fun if_nametoindex(interfacename: PCSTR): UInt =
    0u
