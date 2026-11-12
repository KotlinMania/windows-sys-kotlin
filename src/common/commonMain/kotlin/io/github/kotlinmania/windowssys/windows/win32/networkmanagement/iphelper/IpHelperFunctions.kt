package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

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
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfCompartmentId
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

public expect fun addIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: MutPtr, nteinstance: MutPtr): UInt

public expect fun cancelIPChangeNotify(notifyoverlapped: ConstPtr): Bool

public expect fun cancelIfTimestampConfigChange(notificationhandle: Hiftimestampchange)

public expect fun cancelMibChangeNotify2(notificationhandle: Handle): Win32Error

public expect fun captureInterfaceHardwareCrossTimestamp(interfaceluid: ConstPtr, crosstimestamp: MutPtr): UInt

public expect fun convertCompartmentGuidToId(compartmentguid: ConstPtr, compartmentid: MutPtr): Win32Error

public expect fun convertCompartmentIdToGuid(compartmentid: NetIfCompartmentId, compartmentguid: MutPtr): Win32Error

public expect fun convertInterfaceAliasToLuid(interfacealias: Pcwstr, interfaceluid: MutPtr): Win32Error

public expect fun convertInterfaceGuidToLuid(interfaceguid: ConstPtr, interfaceluid: MutPtr): Win32Error

public expect fun convertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: MutPtr): Win32Error

public expect fun convertInterfaceLuidToAlias(interfaceluid: ConstPtr, interfacealias: Pwstr, length: ULong): Win32Error

public expect fun convertInterfaceLuidToGuid(interfaceluid: ConstPtr, interfaceguid: MutPtr): Win32Error

public expect fun convertInterfaceLuidToIndex(interfaceluid: ConstPtr, interfaceindex: MutPtr): Win32Error

public expect fun convertInterfaceLuidToNameA(interfaceluid: ConstPtr, interfacename: Pstr, length: ULong): Win32Error

public expect fun convertInterfaceLuidToNameW(interfaceluid: ConstPtr, interfacename: Pwstr, length: ULong): Win32Error

public expect fun convertInterfaceNameToLuidA(interfacename: Pcstr, interfaceluid: MutPtr): Win32Error

public expect fun convertInterfaceNameToLuidW(interfacename: Pcwstr, interfaceluid: MutPtr): Win32Error

public expect fun convertIpv4MaskToLength(mask: UInt, masklength: MutPtr): Win32Error

public expect fun convertLengthToIpv4Mask(masklength: UInt, mask: MutPtr): Win32Error

public expect fun createAnycastIpAddressEntry(row: ConstPtr): Win32Error

public expect fun createIpForwardEntry(proute: ConstPtr): UInt

public expect fun createIpForwardEntry2(row: ConstPtr): Win32Error

public expect fun createIpNetEntry(parpentry: ConstPtr): UInt

public expect fun createIpNetEntry2(row: ConstPtr): Win32Error

public expect fun createPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt

public expect fun createPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt

public expect fun createProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt

public expect fun createSortedAddressPairs(sourceaddresslist: ConstPtr, sourceaddresscount: UInt, destinationaddresslist: ConstPtr, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: MutPtr, sortedaddresspaircount: MutPtr): Win32Error

public expect fun createUnicastIpAddressEntry(row: ConstPtr): Win32Error

public expect fun deleteAnycastIpAddressEntry(row: ConstPtr): Win32Error

public expect fun deleteIPAddress(ntecontext: UInt): UInt

public expect fun deleteIpForwardEntry(proute: ConstPtr): UInt

public expect fun deleteIpForwardEntry2(row: ConstPtr): Win32Error

public expect fun deleteIpNetEntry(parpentry: ConstPtr): UInt

public expect fun deleteIpNetEntry2(row: ConstPtr): Win32Error

public expect fun deletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt

public expect fun deletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt

public expect fun deleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt

public expect fun deleteUnicastIpAddressEntry(row: ConstPtr): Win32Error

public expect fun disableMediaSense(phandle: MutPtr, poverlapped: ConstPtr): UInt

public expect fun enableRouter(phandle: MutPtr, poverlapped: MutPtr): UInt

public expect fun flushIpNetTable(dwifindex: UInt): UInt

public expect fun flushIpNetTable2(family: AddressFamily, interfaceindex: UInt): Win32Error

public expect fun flushIpPathTable(family: AddressFamily): Win32Error

public expect fun freeDnsSettings(settings: MutPtr)

public expect fun freeInterfaceDnsSettings(settings: MutPtr)

public expect fun freeMibTable(memory: ConstPtr)

public expect fun getAdapterIndex(adaptername: Pcwstr, ifindex: MutPtr): UInt

public expect fun getAdapterOrderMap(): MutPtr

public expect fun getAdaptersAddresses(family: UInt, flags: GetAdaptersAddressesFlags, reserved: ConstPtr, adapteraddresses: MutPtr, sizepointer: MutPtr): UInt

public expect fun getAdaptersInfo(adapterinfo: MutPtr, sizepointer: MutPtr): UInt

public expect fun getAnycastIpAddressEntry(row: MutPtr): Win32Error

public expect fun getAnycastIpAddressTable(family: AddressFamily, table: MutPtr): Win32Error

public expect fun getBestInterface(dwdestaddr: UInt, pdwbestifindex: MutPtr): UInt

public expect fun getBestInterfaceEx(pdestaddr: ConstPtr, pdwbestifindex: MutPtr): UInt

public expect fun getBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: MutPtr): UInt

public expect fun getBestRoute2(interfaceluid: ConstPtr, interfaceindex: UInt, sourceaddress: ConstPtr, destinationaddress: ConstPtr, addresssortoptions: UInt, bestroute: MutPtr, bestsourceaddress: MutPtr): Win32Error

public expect fun getCurrentThreadCompartmentId(): NetIfCompartmentId

public expect fun getCurrentThreadCompartmentScope(compartmentscope: MutPtr, compartmentid: MutPtr)

public expect fun getDefaultCompartmentId(): NetIfCompartmentId

public expect fun getDnsSettings(settings: MutPtr): Win32Error

public expect fun getExtendedTcpTable(ptcptable: MutPtr, pdwsize: MutPtr, border: Bool, ulaf: UInt, tableclass: TcpTableClass, reserved: UInt): UInt

public expect fun getExtendedUdpTable(pudptable: MutPtr, pdwsize: MutPtr, border: Bool, ulaf: UInt, tableclass: UdpTableClass, reserved: UInt): UInt

public expect fun getFriendlyIfIndex(ifindex: UInt): UInt

public expect fun getIcmpStatistics(statistics: MutPtr): UInt

public expect fun getIcmpStatisticsEx(statistics: MutPtr, family: UInt): UInt

public expect fun getIfEntry(pifrow: MutPtr): UInt

public expect fun getIfEntry2(row: MutPtr): Win32Error

public expect fun getIfEntry2Ex(level: MibIfEntryLevel, row: MutPtr): Win32Error

public expect fun getIfStackTable(table: MutPtr): Win32Error

public expect fun getIfTable(piftable: MutPtr, pdwsize: MutPtr, border: Bool): UInt

public expect fun getIfTable2(table: MutPtr): Win32Error

public expect fun getIfTable2Ex(level: MibIfTableLevel, table: MutPtr): Win32Error

public expect fun getInterfaceActiveTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt

public expect fun getInterfaceCurrentTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt

public expect fun getInterfaceDnsSettings(iface: Guid, settings: MutPtr): Win32Error

public expect fun getInterfaceHardwareTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt

public expect fun getInterfaceInfo(piftable: MutPtr, dwoutbuflen: MutPtr): UInt

public expect fun getInterfaceSupportedTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt

public expect fun getInvertedIfStackTable(table: MutPtr): Win32Error

public expect fun getIpAddrTable(pipaddrtable: MutPtr, pdwsize: MutPtr, border: Bool): UInt

public expect fun getIpErrorString(errorcode: UInt, buffer: Pwstr, size: MutPtr): UInt

public expect fun getIpForwardEntry2(row: MutPtr): Win32Error

public expect fun getIpForwardTable(pipforwardtable: MutPtr, pdwsize: MutPtr, border: Bool): UInt

public expect fun getIpForwardTable2(family: AddressFamily, table: MutPtr): Win32Error

public expect fun getIpInterfaceEntry(row: MutPtr): Win32Error

public expect fun getIpInterfaceTable(family: AddressFamily, table: MutPtr): Win32Error

public expect fun getIpNetEntry2(row: MutPtr): Win32Error

public expect fun getIpNetTable(ipnettable: MutPtr, sizepointer: MutPtr, order: Bool): UInt

public expect fun getIpNetTable2(family: AddressFamily, table: MutPtr): Win32Error

public expect fun getIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: AddressFamily, bandwidthestimates: MutPtr): Win32Error

public expect fun getIpPathEntry(row: MutPtr): Win32Error

public expect fun getIpPathTable(family: AddressFamily, table: MutPtr): Win32Error

public expect fun getIpStatistics(statistics: MutPtr): UInt

public expect fun getIpStatisticsEx(statistics: MutPtr, family: UInt): UInt

public expect fun getJobCompartmentId(jobhandle: Handle): NetIfCompartmentId

public expect fun getMulticastIpAddressEntry(row: MutPtr): Win32Error

public expect fun getMulticastIpAddressTable(family: AddressFamily, table: MutPtr): Win32Error

public expect fun getNetworkConnectivityHint(connectivityhint: MutPtr): Win32Error

public expect fun getNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: MutPtr): Win32Error

public expect fun getNetworkInformation(networkguid: ConstPtr, compartmentid: MutPtr, siteid: MutPtr, networkname: Pwstr, length: UInt): Win32Error

public expect fun getNetworkParams(pfixedinfo: MutPtr, poutbuflen: MutPtr): Win32Error

public expect fun getNumberOfInterfaces(pdwnumif: MutPtr): UInt

public expect fun getOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt

public expect fun getOwnerModuleFromTcp6Entry(ptcpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt

public expect fun getOwnerModuleFromTcpEntry(ptcpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt

public expect fun getOwnerModuleFromUdp6Entry(pudpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt

public expect fun getOwnerModuleFromUdpEntry(pudpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt

public expect fun getPerAdapterInfo(ifindex: UInt, pperadapterinfo: MutPtr, poutbuflen: MutPtr): UInt

public expect fun getPerTcp6ConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: MutPtr, rwversion: UInt, rwsize: UInt, ros: MutPtr, rosversion: UInt, rossize: UInt, rod: MutPtr, rodversion: UInt, rodsize: UInt): UInt

public expect fun getPerTcpConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: MutPtr, rwversion: UInt, rwsize: UInt, ros: MutPtr, rosversion: UInt, rossize: UInt, rod: MutPtr, rodversion: UInt, rodsize: UInt): UInt

public expect fun getRTTAndHopCount(destipaddress: UInt, hopcount: MutPtr, maxhops: UInt, rtt: MutPtr): Bool

public expect fun getSessionCompartmentId(sessionid: UInt): NetIfCompartmentId

public expect fun getTcp6Table(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt

public expect fun getTcp6Table2(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt

public expect fun getTcpStatistics(statistics: MutPtr): UInt

public expect fun getTcpStatisticsEx(statistics: MutPtr, family: UInt): UInt

public expect fun getTcpStatisticsEx2(statistics: MutPtr, family: UInt): UInt

public expect fun getTcpTable(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt

public expect fun getTcpTable2(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt

public expect fun getTeredoPort(port: MutPtr): Win32Error

public expect fun getUdp6Table(udp6table: MutPtr, sizepointer: MutPtr, order: Bool): UInt

public expect fun getUdpStatistics(stats: MutPtr): UInt

public expect fun getUdpStatisticsEx(statistics: MutPtr, family: UInt): UInt

public expect fun getUdpStatisticsEx2(statistics: MutPtr, family: UInt): UInt

public expect fun getUdpTable(udptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt

public expect fun getUniDirectionalAdapterInfo(pipifinfo: MutPtr, dwoutbuflen: MutPtr): UInt

public expect fun getUnicastIpAddressEntry(row: MutPtr): Win32Error

public expect fun getUnicastIpAddressTable(family: AddressFamily, table: MutPtr): Win32Error

public expect fun icmp6CreateFile(): Handle

public expect fun icmp6ParseReplies(replybuffer: MutPtr, replysize: UInt): UInt

public expect fun icmp6SendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, sourceaddress: ConstPtr, destinationaddress: ConstPtr, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt

public expect fun icmpCloseHandle(icmphandle: Handle): Bool

public expect fun icmpCreateFile(): Handle

public expect fun icmpParseReplies(replybuffer: MutPtr, replysize: UInt): UInt

public expect fun icmpSendEcho(icmphandle: Handle, destinationaddress: UInt, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt

public expect fun icmpSendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, destinationaddress: UInt, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt

public expect fun icmpSendEcho2Ex(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, sourceaddress: UInt, destinationaddress: UInt, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt

public expect fun initializeIpForwardEntry(row: MutPtr)

public expect fun initializeIpInterfaceEntry(row: MutPtr)

public expect fun initializeUnicastIpAddressEntry(row: MutPtr)

public expect fun ipReleaseAddress(adapterinfo: ConstPtr): UInt

public expect fun ipRenewAddress(adapterinfo: ConstPtr): UInt

public expect fun lookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt

public expect fun lookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt

public expect fun nhpAllocateAndGetInterfaceInfoFromStack(pptable: MutPtr, pdwcount: MutPtr, border: Bool, hheap: Handle, dwflags: UInt): UInt

public expect fun notifyAddrChange(handle: MutPtr, overlapped: ConstPtr): UInt

public expect fun notifyIfTimestampConfigChange(callercontext: ConstPtr, callback: PinterfaceTimestampConfigChangeCallback, notificationhandle: MutPtr): UInt

public expect fun notifyIpInterfaceChange(family: AddressFamily, callback: PipinterfaceChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error

public expect fun notifyNetworkConnectivityHintChange(callback: PnetworkConnectivityHintChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error

public expect fun notifyRouteChange(handle: MutPtr, overlapped: ConstPtr): UInt

public expect fun notifyRouteChange2(addressfamily: AddressFamily, callback: PipforwardChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error

public expect fun notifyStableUnicastIpAddressTable(family: AddressFamily, table: MutPtr, callercallback: PstableUnicastIpaddressTableCallback, callercontext: ConstPtr, notificationhandle: MutPtr): Win32Error

public expect fun notifyTeredoPortChange(callback: PteredoPortChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error

public expect fun notifyUnicastIpAddressChange(family: AddressFamily, callback: PunicastIpaddressChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error

public expect fun parseNetworkString(networkstring: Pcwstr, types: UInt, addressinfo: MutPtr, portnumber: MutPtr, prefixlength: MutPtr): UInt

public expect fun pfAddFiltersToInterface(ih: MutPtr, cinfilters: UInt, pfiltin: MutPtr, coutfilters: UInt, pfiltout: MutPtr, pfhandle: MutPtr): UInt

public expect fun pfAddGlobalFilterToInterface(pinterface: MutPtr, gffilter: GlobalFilter): UInt

public expect fun pfBindInterfaceToIPAddress(pinterface: MutPtr, pfattype: Pfaddresstype, ipaddress: MutPtr): UInt

public expect fun pfBindInterfaceToIndex(pinterface: MutPtr, dwindex: UInt, pfatlinktype: Pfaddresstype, linkipaddress: MutPtr): UInt

public expect fun pfCreateInterface(dwname: UInt, inaction: PfforwardAction, outaction: PfforwardAction, buselog: Bool, bmustbeunique: Bool, ppinterface: MutPtr): UInt

public expect fun pfDeleteInterface(pinterface: MutPtr): UInt

public expect fun pfDeleteLog(): UInt

public expect fun pfGetInterfaceStatistics(pinterface: MutPtr, ppfstats: MutPtr, pdwbuffersize: MutPtr, fresetcounters: Bool): UInt

public expect fun pfMakeLog(hevent: Handle): UInt

public expect fun pfRebindFilters(pinterface: MutPtr, platebindinfo: MutPtr): UInt

public expect fun pfRemoveFilterHandles(pinterface: MutPtr, cfilters: UInt, pvhandles: MutPtr): UInt

public expect fun pfRemoveFiltersFromInterface(ih: MutPtr, cinfilters: UInt, pfiltin: MutPtr, coutfilters: UInt, pfiltout: MutPtr): UInt

public expect fun pfRemoveGlobalFilterFromInterface(pinterface: MutPtr, gffilter: GlobalFilter): UInt

public expect fun pfSetLogBuffer(pbbuffer: MutPtr, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: MutPtr, pdwlostentries: MutPtr, pdwsizeused: MutPtr): UInt

public expect fun pfTestPacket(pininterface: MutPtr, poutinterface: MutPtr, cbytes: UInt, pbpacket: MutPtr, ppaction: MutPtr): UInt

public expect fun pfUnBindInterface(pinterface: MutPtr): UInt

public expect fun registerInterfaceTimestampConfigChange(callback: PinterfaceTimestampConfigChangeCallback, callercontext: ConstPtr, notificationhandle: MutPtr): UInt

public expect fun resolveIpNetEntry2(row: MutPtr, sourceaddress: ConstPtr): Win32Error

public expect fun resolveNeighbor(networkaddress: ConstPtr, physicaladdress: MutPtr, physicaladdresslength: MutPtr): UInt

public expect fun restoreMediaSense(poverlapped: ConstPtr, lpdwenablecount: MutPtr): UInt

public expect fun sendARP(destip: UInt, srcip: UInt, pmacaddr: MutPtr, phyaddrlen: MutPtr): UInt

public expect fun setCurrentThreadCompartmentId(compartmentid: NetIfCompartmentId): Win32Error

public expect fun setCurrentThreadCompartmentScope(compartmentscope: UInt): Win32Error

public expect fun setDnsSettings(settings: ConstPtr): Win32Error

public expect fun setIfEntry(pifrow: ConstPtr): UInt

public expect fun setInterfaceDnsSettings(iface: Guid, settings: ConstPtr): Win32Error

public expect fun setIpForwardEntry(proute: ConstPtr): UInt

public expect fun setIpForwardEntry2(route: ConstPtr): Win32Error

public expect fun setIpInterfaceEntry(row: MutPtr): Win32Error

public expect fun setIpNetEntry(parpentry: ConstPtr): UInt

public expect fun setIpNetEntry2(row: ConstPtr): Win32Error

public expect fun setIpStatistics(pipstats: ConstPtr): UInt

public expect fun setIpStatisticsEx(statistics: ConstPtr, family: UInt): UInt

public expect fun setIpTTL(nttl: UInt): UInt

public expect fun setJobCompartmentId(jobhandle: Handle, compartmentid: NetIfCompartmentId): Win32Error

public expect fun setNetworkInformation(networkguid: ConstPtr, compartmentid: NetIfCompartmentId, networkname: Pcwstr): Win32Error

public expect fun setPerTcp6ConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: ConstPtr, rwversion: UInt, rwsize: UInt, offset: UInt): UInt

public expect fun setPerTcpConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: ConstPtr, rwversion: UInt, rwsize: UInt, offset: UInt): UInt

public expect fun setSessionCompartmentId(sessionid: UInt, compartmentid: NetIfCompartmentId): Win32Error

public expect fun setTcpEntry(ptcprow: ConstPtr): UInt

public expect fun setUnicastIpAddressEntry(row: ConstPtr): Win32Error

public expect fun unenableRouter(poverlapped: ConstPtr, lpdwenablecount: MutPtr): UInt

public expect fun unregisterInterfaceTimestampConfigChange(notificationhandle: Hiftimestampchange)

public expect fun ifIndextoname(interfaceindex: UInt, interfacename: Pstr): Pstr

public expect fun ifNametoindex(interfacename: Pcstr): UInt
