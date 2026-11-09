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

public expect fun AddIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: Long, nteinstance: Long): UInt

public expect fun CancelIPChangeNotify(notifyoverlapped: Long): BOOL

public expect fun CancelIfTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE)

public expect fun CancelMibChangeNotify2(notificationhandle: HANDLE): WIN32_ERROR

public expect fun CaptureInterfaceHardwareCrossTimestamp(interfaceluid: Long, crosstimestamp: Long): UInt

public expect fun ConvertCompartmentGuidToId(compartmentguid: Long, compartmentid: Long): WIN32_ERROR

public expect fun ConvertCompartmentIdToGuid(compartmentid: NET_IF_COMPARTMENT_ID, compartmentguid: Long): WIN32_ERROR

public expect fun ConvertInterfaceAliasToLuid(interfacealias: PCWSTR, interfaceluid: Long): WIN32_ERROR

public expect fun ConvertInterfaceGuidToLuid(interfaceguid: Long, interfaceluid: Long): WIN32_ERROR

public expect fun ConvertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: Long): WIN32_ERROR

public expect fun ConvertInterfaceLuidToAlias(interfaceluid: Long, interfacealias: PWSTR, length: ULong): WIN32_ERROR

public expect fun ConvertInterfaceLuidToGuid(interfaceluid: Long, interfaceguid: Long): WIN32_ERROR

public expect fun ConvertInterfaceLuidToIndex(interfaceluid: Long, interfaceindex: Long): WIN32_ERROR

public expect fun ConvertInterfaceLuidToNameA(interfaceluid: Long, interfacename: PSTR, length: ULong): WIN32_ERROR

public expect fun ConvertInterfaceLuidToNameW(interfaceluid: Long, interfacename: PWSTR, length: ULong): WIN32_ERROR

public expect fun ConvertInterfaceNameToLuidA(interfacename: PCSTR, interfaceluid: Long): WIN32_ERROR

public expect fun ConvertInterfaceNameToLuidW(interfacename: PCWSTR, interfaceluid: Long): WIN32_ERROR

public expect fun ConvertIpv4MaskToLength(mask: UInt, masklength: Long): WIN32_ERROR

public expect fun ConvertLengthToIpv4Mask(masklength: UInt, mask: Long): WIN32_ERROR

public expect fun CreateAnycastIpAddressEntry(row: Long): WIN32_ERROR

public expect fun CreateIpForwardEntry(proute: Long): UInt

public expect fun CreateIpForwardEntry2(row: Long): WIN32_ERROR

public expect fun CreateIpNetEntry(parpentry: Long): UInt

public expect fun CreateIpNetEntry2(row: Long): WIN32_ERROR

public expect fun CreatePersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt

public expect fun CreatePersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt

public expect fun CreateProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt

public expect fun CreateSortedAddressPairs(sourceaddresslist: Long, sourceaddresscount: UInt, destinationaddresslist: Long, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: Long, sortedaddresspaircount: Long): WIN32_ERROR

public expect fun CreateUnicastIpAddressEntry(row: Long): WIN32_ERROR

public expect fun DeleteAnycastIpAddressEntry(row: Long): WIN32_ERROR

public expect fun DeleteIPAddress(ntecontext: UInt): UInt

public expect fun DeleteIpForwardEntry(proute: Long): UInt

public expect fun DeleteIpForwardEntry2(row: Long): WIN32_ERROR

public expect fun DeleteIpNetEntry(parpentry: Long): UInt

public expect fun DeleteIpNetEntry2(row: Long): WIN32_ERROR

public expect fun DeletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt

public expect fun DeletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt

public expect fun DeleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt

public expect fun DeleteUnicastIpAddressEntry(row: Long): WIN32_ERROR

public expect fun DisableMediaSense(phandle: Long, poverlapped: Long): UInt

public expect fun EnableRouter(phandle: Long, poverlapped: Long): UInt

public expect fun FlushIpNetTable(dwifindex: UInt): UInt

public expect fun FlushIpNetTable2(family: ADDRESS_FAMILY, interfaceindex: UInt): WIN32_ERROR

public expect fun FlushIpPathTable(family: ADDRESS_FAMILY): WIN32_ERROR

public expect fun FreeDnsSettings(settings: Long)

public expect fun FreeInterfaceDnsSettings(settings: Long)

public expect fun FreeMibTable(memory: Long)

public expect fun GetAdapterIndex(adaptername: PCWSTR, ifindex: Long): UInt

public expect fun GetAdapterOrderMap(): Long

public expect fun GetAdaptersAddresses(family: UInt, flags: GET_ADAPTERS_ADDRESSES_FLAGS, reserved: Long, adapteraddresses: Long, sizepointer: Long): UInt

public expect fun GetAdaptersInfo(adapterinfo: Long, sizepointer: Long): UInt

public expect fun GetAnycastIpAddressEntry(row: Long): WIN32_ERROR

public expect fun GetAnycastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR

public expect fun GetBestInterface(dwdestaddr: UInt, pdwbestifindex: Long): UInt

public expect fun GetBestInterfaceEx(pdestaddr: Long, pdwbestifindex: Long): UInt

public expect fun GetBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: Long): UInt

public expect fun GetBestRoute2(interfaceluid: Long, interfaceindex: UInt, sourceaddress: Long, destinationaddress: Long, addresssortoptions: UInt, bestroute: Long, bestsourceaddress: Long): WIN32_ERROR

public expect fun GetCurrentThreadCompartmentId(): NET_IF_COMPARTMENT_ID

public expect fun GetCurrentThreadCompartmentScope(compartmentscope: Long, compartmentid: Long)

public expect fun GetDefaultCompartmentId(): NET_IF_COMPARTMENT_ID

public expect fun GetDnsSettings(settings: Long): WIN32_ERROR

public expect fun GetExtendedTcpTable(ptcptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: TCP_TABLE_CLASS, reserved: UInt): UInt

public expect fun GetExtendedUdpTable(pudptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: UDP_TABLE_CLASS, reserved: UInt): UInt

public expect fun GetFriendlyIfIndex(ifindex: UInt): UInt

public expect fun GetIcmpStatistics(statistics: Long): UInt

public expect fun GetIcmpStatisticsEx(statistics: Long, family: UInt): UInt

public expect fun GetIfEntry(pifrow: Long): UInt

public expect fun GetIfEntry2(row: Long): WIN32_ERROR

public expect fun GetIfEntry2Ex(level: MIB_IF_ENTRY_LEVEL, row: Long): WIN32_ERROR

public expect fun GetIfStackTable(table: Long): WIN32_ERROR

public expect fun GetIfTable(piftable: Long, pdwsize: Long, border: BOOL): UInt

public expect fun GetIfTable2(table: Long): WIN32_ERROR

public expect fun GetIfTable2Ex(level: MIB_IF_TABLE_LEVEL, table: Long): WIN32_ERROR

public expect fun GetInterfaceActiveTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt

public expect fun GetInterfaceCurrentTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt

public expect fun GetInterfaceDnsSettings(iface: GUID, settings: Long): WIN32_ERROR

public expect fun GetInterfaceHardwareTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt

public expect fun GetInterfaceInfo(piftable: Long, dwoutbuflen: Long): UInt

public expect fun GetInterfaceSupportedTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt

public expect fun GetInvertedIfStackTable(table: Long): WIN32_ERROR

public expect fun GetIpAddrTable(pipaddrtable: Long, pdwsize: Long, border: BOOL): UInt

public expect fun GetIpErrorString(errorcode: UInt, buffer: PWSTR, size: Long): UInt

public expect fun GetIpForwardEntry2(row: Long): WIN32_ERROR

public expect fun GetIpForwardTable(pipforwardtable: Long, pdwsize: Long, border: BOOL): UInt

public expect fun GetIpForwardTable2(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR

public expect fun GetIpInterfaceEntry(row: Long): WIN32_ERROR

public expect fun GetIpInterfaceTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR

public expect fun GetIpNetEntry2(row: Long): WIN32_ERROR

public expect fun GetIpNetTable(ipnettable: Long, sizepointer: Long, order: BOOL): UInt

public expect fun GetIpNetTable2(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR

public expect fun GetIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: ADDRESS_FAMILY, bandwidthestimates: Long): WIN32_ERROR

public expect fun GetIpPathEntry(row: Long): WIN32_ERROR

public expect fun GetIpPathTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR

public expect fun GetIpStatistics(statistics: Long): UInt

public expect fun GetIpStatisticsEx(statistics: Long, family: UInt): UInt

public expect fun GetJobCompartmentId(jobhandle: HANDLE): NET_IF_COMPARTMENT_ID

public expect fun GetMulticastIpAddressEntry(row: Long): WIN32_ERROR

public expect fun GetMulticastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR

public expect fun GetNetworkConnectivityHint(connectivityhint: Long): WIN32_ERROR

public expect fun GetNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: Long): WIN32_ERROR

public expect fun GetNetworkInformation(networkguid: Long, compartmentid: Long, siteid: Long, networkname: PWSTR, length: UInt): WIN32_ERROR

public expect fun GetNetworkParams(pfixedinfo: Long, poutbuflen: Long): WIN32_ERROR

public expect fun GetNumberOfInterfaces(pdwnumif: Long): UInt

public expect fun GetOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt

public expect fun GetOwnerModuleFromTcp6Entry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt

public expect fun GetOwnerModuleFromTcpEntry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt

public expect fun GetOwnerModuleFromUdp6Entry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt

public expect fun GetOwnerModuleFromUdpEntry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt

public expect fun GetPerAdapterInfo(ifindex: UInt, pperadapterinfo: Long, poutbuflen: Long): UInt

public expect fun GetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt

public expect fun GetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt

public expect fun GetRTTAndHopCount(destipaddress: UInt, hopcount: Long, maxhops: UInt, rtt: Long): BOOL

public expect fun GetSessionCompartmentId(sessionid: UInt): NET_IF_COMPARTMENT_ID

public expect fun GetTcp6Table(tcptable: Long, sizepointer: Long, order: BOOL): UInt

public expect fun GetTcp6Table2(tcptable: Long, sizepointer: Long, order: BOOL): UInt

public expect fun GetTcpStatistics(statistics: Long): UInt

public expect fun GetTcpStatisticsEx(statistics: Long, family: UInt): UInt

public expect fun GetTcpStatisticsEx2(statistics: Long, family: UInt): UInt

public expect fun GetTcpTable(tcptable: Long, sizepointer: Long, order: BOOL): UInt

public expect fun GetTcpTable2(tcptable: Long, sizepointer: Long, order: BOOL): UInt

public expect fun GetTeredoPort(port: Long): WIN32_ERROR

public expect fun GetUdp6Table(udp6table: Long, sizepointer: Long, order: BOOL): UInt

public expect fun GetUdpStatistics(stats: Long): UInt

public expect fun GetUdpStatisticsEx(statistics: Long, family: UInt): UInt

public expect fun GetUdpStatisticsEx2(statistics: Long, family: UInt): UInt

public expect fun GetUdpTable(udptable: Long, sizepointer: Long, order: BOOL): UInt

public expect fun GetUniDirectionalAdapterInfo(pipifinfo: Long, dwoutbuflen: Long): UInt

public expect fun GetUnicastIpAddressEntry(row: Long): WIN32_ERROR

public expect fun GetUnicastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR

public expect fun Icmp6CreateFile(): HANDLE

public expect fun Icmp6ParseReplies(replybuffer: Long, replysize: UInt): UInt

public expect fun Icmp6SendEcho2(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, sourceaddress: Long, destinationaddress: Long, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt

public expect fun IcmpCloseHandle(icmphandle: HANDLE): BOOL

public expect fun IcmpCreateFile(): HANDLE

public expect fun IcmpParseReplies(replybuffer: Long, replysize: UInt): UInt

public expect fun IcmpSendEcho(icmphandle: HANDLE, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt

public expect fun IcmpSendEcho2(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt

public expect fun IcmpSendEcho2Ex(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, sourceaddress: UInt, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt

public expect fun InitializeIpForwardEntry(row: Long)

public expect fun InitializeIpInterfaceEntry(row: Long)

public expect fun InitializeUnicastIpAddressEntry(row: Long)

public expect fun IpReleaseAddress(adapterinfo: Long): UInt

public expect fun IpRenewAddress(adapterinfo: Long): UInt

public expect fun LookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt

public expect fun LookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt

public expect fun NhpAllocateAndGetInterfaceInfoFromStack(pptable: Long, pdwcount: Long, border: BOOL, hheap: HANDLE, dwflags: UInt): UInt

public expect fun NotifyAddrChange(handle: Long, overlapped: Long): UInt

public expect fun NotifyIfTimestampConfigChange(callercontext: Long, callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, notificationhandle: Long): UInt

public expect fun NotifyIpInterfaceChange(family: ADDRESS_FAMILY, callback: PIPINTERFACE_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR

public expect fun NotifyNetworkConnectivityHintChange(callback: PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR

public expect fun NotifyRouteChange(handle: Long, overlapped: Long): UInt

public expect fun NotifyRouteChange2(addressfamily: ADDRESS_FAMILY, callback: PIPFORWARD_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR

public expect fun NotifyStableUnicastIpAddressTable(family: ADDRESS_FAMILY, table: Long, callercallback: PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACK, callercontext: Long, notificationhandle: Long): WIN32_ERROR

public expect fun NotifyTeredoPortChange(callback: PTEREDO_PORT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR

public expect fun NotifyUnicastIpAddressChange(family: ADDRESS_FAMILY, callback: PUNICAST_IPADDRESS_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR

public expect fun ParseNetworkString(networkstring: PCWSTR, types: UInt, addressinfo: Long, portnumber: Long, prefixlength: Long): UInt

public expect fun PfAddFiltersToInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long, pfhandle: Long): UInt

public expect fun PfAddGlobalFilterToInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt

public expect fun PfBindInterfaceToIPAddress(pinterface: Long, pfattype: PFADDRESSTYPE, ipaddress: Long): UInt

public expect fun PfBindInterfaceToIndex(pinterface: Long, dwindex: UInt, pfatlinktype: PFADDRESSTYPE, linkipaddress: Long): UInt

public expect fun PfCreateInterface(dwname: UInt, inaction: PFFORWARD_ACTION, outaction: PFFORWARD_ACTION, buselog: BOOL, bmustbeunique: BOOL, ppinterface: Long): UInt

public expect fun PfDeleteInterface(pinterface: Long): UInt

public expect fun PfDeleteLog(): UInt

public expect fun PfGetInterfaceStatistics(pinterface: Long, ppfstats: Long, pdwbuffersize: Long, fresetcounters: BOOL): UInt

public expect fun PfMakeLog(hevent: HANDLE): UInt

public expect fun PfRebindFilters(pinterface: Long, platebindinfo: Long): UInt

public expect fun PfRemoveFilterHandles(pinterface: Long, cfilters: UInt, pvhandles: Long): UInt

public expect fun PfRemoveFiltersFromInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long): UInt

public expect fun PfRemoveGlobalFilterFromInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt

public expect fun PfSetLogBuffer(pbbuffer: Long, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: Long, pdwlostentries: Long, pdwsizeused: Long): UInt

public expect fun PfTestPacket(pininterface: Long, poutinterface: Long, cbytes: UInt, pbpacket: Long, ppaction: Long): UInt

public expect fun PfUnBindInterface(pinterface: Long): UInt

public expect fun RegisterInterfaceTimestampConfigChange(callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, callercontext: Long, notificationhandle: Long): UInt

public expect fun ResolveIpNetEntry2(row: Long, sourceaddress: Long): WIN32_ERROR

public expect fun ResolveNeighbor(networkaddress: Long, physicaladdress: Long, physicaladdresslength: Long): UInt

public expect fun RestoreMediaSense(poverlapped: Long, lpdwenablecount: Long): UInt

public expect fun SendARP(destip: UInt, srcip: UInt, pmacaddr: Long, phyaddrlen: Long): UInt

public expect fun SetCurrentThreadCompartmentId(compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR

public expect fun SetCurrentThreadCompartmentScope(compartmentscope: UInt): WIN32_ERROR

public expect fun SetDnsSettings(settings: Long): WIN32_ERROR

public expect fun SetIfEntry(pifrow: Long): UInt

public expect fun SetInterfaceDnsSettings(iface: GUID, settings: Long): WIN32_ERROR

public expect fun SetIpForwardEntry(proute: Long): UInt

public expect fun SetIpForwardEntry2(route: Long): WIN32_ERROR

public expect fun SetIpInterfaceEntry(row: Long): WIN32_ERROR

public expect fun SetIpNetEntry(parpentry: Long): UInt

public expect fun SetIpNetEntry2(row: Long): WIN32_ERROR

public expect fun SetIpStatistics(pipstats: Long): UInt

public expect fun SetIpStatisticsEx(statistics: Long, family: UInt): UInt

public expect fun SetIpTTL(nttl: UInt): UInt

public expect fun SetJobCompartmentId(jobhandle: HANDLE, compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR

public expect fun SetNetworkInformation(networkguid: Long, compartmentid: NET_IF_COMPARTMENT_ID, networkname: PCWSTR): WIN32_ERROR

public expect fun SetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt

public expect fun SetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt

public expect fun SetSessionCompartmentId(sessionid: UInt, compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR

public expect fun SetTcpEntry(ptcprow: Long): UInt

public expect fun SetUnicastIpAddressEntry(row: Long): WIN32_ERROR

public expect fun UnenableRouter(poverlapped: Long, lpdwenablecount: Long): UInt

public expect fun UnregisterInterfaceTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE)

public expect fun if_indextoname(interfaceindex: UInt, interfacename: PSTR): PSTR

public expect fun if_nametoindex(interfacename: PCSTR): UInt
