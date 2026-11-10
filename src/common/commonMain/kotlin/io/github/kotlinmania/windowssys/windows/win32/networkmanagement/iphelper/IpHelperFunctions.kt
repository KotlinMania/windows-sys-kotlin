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

public expect fun addIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: COpaquePointer?, nteinstance: COpaquePointer?): UInt

public expect fun cancelIPChangeNotify(notifyoverlapped: COpaquePointer?): Bool

public expect fun cancelIfTimestampConfigChange(notificationhandle: Hiftimestampchange)

public expect fun cancelMibChangeNotify2(notificationhandle: Handle): Win32Error

public expect fun captureInterfaceHardwareCrossTimestamp(interfaceluid: COpaquePointer?, crosstimestamp: COpaquePointer?): UInt

public expect fun convertCompartmentGuidToId(compartmentguid: COpaquePointer?, compartmentid: COpaquePointer?): Win32Error

public expect fun convertCompartmentIdToGuid(compartmentid: NetIfCompartmentId, compartmentguid: COpaquePointer?): Win32Error

public expect fun convertInterfaceAliasToLuid(interfacealias: Pcwstr, interfaceluid: COpaquePointer?): Win32Error

public expect fun convertInterfaceGuidToLuid(interfaceguid: COpaquePointer?, interfaceluid: COpaquePointer?): Win32Error

public expect fun convertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: COpaquePointer?): Win32Error

public expect fun convertInterfaceLuidToAlias(interfaceluid: COpaquePointer?, interfacealias: Pwstr, length: ULong): Win32Error

public expect fun convertInterfaceLuidToGuid(interfaceluid: COpaquePointer?, interfaceguid: COpaquePointer?): Win32Error

public expect fun convertInterfaceLuidToIndex(interfaceluid: COpaquePointer?, interfaceindex: COpaquePointer?): Win32Error

public expect fun convertInterfaceLuidToNameA(interfaceluid: COpaquePointer?, interfacename: Pstr, length: ULong): Win32Error

public expect fun convertInterfaceLuidToNameW(interfaceluid: COpaquePointer?, interfacename: Pwstr, length: ULong): Win32Error

public expect fun convertInterfaceNameToLuidA(interfacename: Pcstr, interfaceluid: COpaquePointer?): Win32Error

public expect fun convertInterfaceNameToLuidW(interfacename: Pcwstr, interfaceluid: COpaquePointer?): Win32Error

public expect fun convertIpv4MaskToLength(mask: UInt, masklength: COpaquePointer?): Win32Error

public expect fun convertLengthToIpv4Mask(masklength: UInt, mask: COpaquePointer?): Win32Error

public expect fun createAnycastIpAddressEntry(row: COpaquePointer?): Win32Error

public expect fun createIpForwardEntry(proute: COpaquePointer?): UInt

public expect fun createIpForwardEntry2(row: COpaquePointer?): Win32Error

public expect fun createIpNetEntry(parpentry: COpaquePointer?): UInt

public expect fun createIpNetEntry2(row: COpaquePointer?): Win32Error

public expect fun createPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt

public expect fun createPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt

public expect fun createProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt

public expect fun createSortedAddressPairs(sourceaddresslist: COpaquePointer?, sourceaddresscount: UInt, destinationaddresslist: COpaquePointer?, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: COpaquePointer?, sortedaddresspaircount: COpaquePointer?): Win32Error

public expect fun createUnicastIpAddressEntry(row: COpaquePointer?): Win32Error

public expect fun deleteAnycastIpAddressEntry(row: COpaquePointer?): Win32Error

public expect fun deleteIPAddress(ntecontext: UInt): UInt

public expect fun deleteIpForwardEntry(proute: COpaquePointer?): UInt

public expect fun deleteIpForwardEntry2(row: COpaquePointer?): Win32Error

public expect fun deleteIpNetEntry(parpentry: COpaquePointer?): UInt

public expect fun deleteIpNetEntry2(row: COpaquePointer?): Win32Error

public expect fun deletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt

public expect fun deletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt

public expect fun deleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt

public expect fun deleteUnicastIpAddressEntry(row: COpaquePointer?): Win32Error

public expect fun disableMediaSense(phandle: COpaquePointer?, poverlapped: COpaquePointer?): UInt

public expect fun enableRouter(phandle: COpaquePointer?, poverlapped: COpaquePointer?): UInt

public expect fun flushIpNetTable(dwifindex: UInt): UInt

public expect fun flushIpNetTable2(family: AddressFamily, interfaceindex: UInt): Win32Error

public expect fun flushIpPathTable(family: AddressFamily): Win32Error

public expect fun freeDnsSettings(settings: COpaquePointer?)

public expect fun freeInterfaceDnsSettings(settings: COpaquePointer?)

public expect fun freeMibTable(memory: COpaquePointer?)

public expect fun getAdapterIndex(adaptername: Pcwstr, ifindex: COpaquePointer?): UInt

public expect fun getAdapterOrderMap(): COpaquePointer?

public expect fun getAdaptersAddresses(family: UInt, flags: GetAdaptersAddressesFlags, reserved: COpaquePointer?, adapteraddresses: COpaquePointer?, sizepointer: COpaquePointer?): UInt

public expect fun getAdaptersInfo(adapterinfo: COpaquePointer?, sizepointer: COpaquePointer?): UInt

public expect fun getAnycastIpAddressEntry(row: COpaquePointer?): Win32Error

public expect fun getAnycastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error

public expect fun getBestInterface(dwdestaddr: UInt, pdwbestifindex: COpaquePointer?): UInt

public expect fun getBestInterfaceEx(pdestaddr: COpaquePointer?, pdwbestifindex: COpaquePointer?): UInt

public expect fun getBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: COpaquePointer?): UInt

public expect fun getBestRoute2(interfaceluid: COpaquePointer?, interfaceindex: UInt, sourceaddress: COpaquePointer?, destinationaddress: COpaquePointer?, addresssortoptions: UInt, bestroute: COpaquePointer?, bestsourceaddress: COpaquePointer?): Win32Error

public expect fun getCurrentThreadCompartmentId(): NetIfCompartmentId

public expect fun getCurrentThreadCompartmentScope(compartmentscope: COpaquePointer?, compartmentid: COpaquePointer?)

public expect fun getDefaultCompartmentId(): NetIfCompartmentId

public expect fun getDnsSettings(settings: COpaquePointer?): Win32Error

public expect fun getExtendedTcpTable(ptcptable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool, ulaf: UInt, tableclass: TcpTableClass, reserved: UInt): UInt

public expect fun getExtendedUdpTable(pudptable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool, ulaf: UInt, tableclass: UdpTableClass, reserved: UInt): UInt

public expect fun getFriendlyIfIndex(ifindex: UInt): UInt

public expect fun getIcmpStatistics(statistics: COpaquePointer?): UInt

public expect fun getIcmpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt

public expect fun getIfEntry(pifrow: COpaquePointer?): UInt

public expect fun getIfEntry2(row: COpaquePointer?): Win32Error

public expect fun getIfEntry2Ex(level: MibIfEntryLevel, row: COpaquePointer?): Win32Error

public expect fun getIfStackTable(table: COpaquePointer?): Win32Error

public expect fun getIfTable(piftable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt

public expect fun getIfTable2(table: COpaquePointer?): Win32Error

public expect fun getIfTable2Ex(level: MibIfTableLevel, table: COpaquePointer?): Win32Error

public expect fun getInterfaceActiveTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt

public expect fun getInterfaceCurrentTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt

public expect fun getInterfaceDnsSettings(iface: Guid, settings: COpaquePointer?): Win32Error

public expect fun getInterfaceHardwareTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt

public expect fun getInterfaceInfo(piftable: COpaquePointer?, dwoutbuflen: COpaquePointer?): UInt

public expect fun getInterfaceSupportedTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt

public expect fun getInvertedIfStackTable(table: COpaquePointer?): Win32Error

public expect fun getIpAddrTable(pipaddrtable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt

public expect fun getIpErrorString(errorcode: UInt, buffer: Pwstr, size: COpaquePointer?): UInt

public expect fun getIpForwardEntry2(row: COpaquePointer?): Win32Error

public expect fun getIpForwardTable(pipforwardtable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt

public expect fun getIpForwardTable2(family: AddressFamily, table: COpaquePointer?): Win32Error

public expect fun getIpInterfaceEntry(row: COpaquePointer?): Win32Error

public expect fun getIpInterfaceTable(family: AddressFamily, table: COpaquePointer?): Win32Error

public expect fun getIpNetEntry2(row: COpaquePointer?): Win32Error

public expect fun getIpNetTable(ipnettable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt

public expect fun getIpNetTable2(family: AddressFamily, table: COpaquePointer?): Win32Error

public expect fun getIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: AddressFamily, bandwidthestimates: COpaquePointer?): Win32Error

public expect fun getIpPathEntry(row: COpaquePointer?): Win32Error

public expect fun getIpPathTable(family: AddressFamily, table: COpaquePointer?): Win32Error

public expect fun getIpStatistics(statistics: COpaquePointer?): UInt

public expect fun getIpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt

public expect fun getJobCompartmentId(jobhandle: Handle): NetIfCompartmentId

public expect fun getMulticastIpAddressEntry(row: COpaquePointer?): Win32Error

public expect fun getMulticastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error

public expect fun getNetworkConnectivityHint(connectivityhint: COpaquePointer?): Win32Error

public expect fun getNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: COpaquePointer?): Win32Error

public expect fun getNetworkInformation(networkguid: COpaquePointer?, compartmentid: COpaquePointer?, siteid: COpaquePointer?, networkname: Pwstr, length: UInt): Win32Error

public expect fun getNetworkParams(pfixedinfo: COpaquePointer?, poutbuflen: COpaquePointer?): Win32Error

public expect fun getNumberOfInterfaces(pdwnumif: COpaquePointer?): UInt

public expect fun getOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt

public expect fun getOwnerModuleFromTcp6Entry(ptcpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt

public expect fun getOwnerModuleFromTcpEntry(ptcpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt

public expect fun getOwnerModuleFromUdp6Entry(pudpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt

public expect fun getOwnerModuleFromUdpEntry(pudpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt

public expect fun getPerAdapterInfo(ifindex: UInt, pperadapterinfo: COpaquePointer?, poutbuflen: COpaquePointer?): UInt

public expect fun getPerTcp6ConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, ros: COpaquePointer?, rosversion: UInt, rossize: UInt, rod: COpaquePointer?, rodversion: UInt, rodsize: UInt): UInt

public expect fun getPerTcpConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, ros: COpaquePointer?, rosversion: UInt, rossize: UInt, rod: COpaquePointer?, rodversion: UInt, rodsize: UInt): UInt

public expect fun getRTTAndHopCount(destipaddress: UInt, hopcount: COpaquePointer?, maxhops: UInt, rtt: COpaquePointer?): Bool

public expect fun getSessionCompartmentId(sessionid: UInt): NetIfCompartmentId

public expect fun getTcp6Table(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt

public expect fun getTcp6Table2(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt

public expect fun getTcpStatistics(statistics: COpaquePointer?): UInt

public expect fun getTcpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt

public expect fun getTcpStatisticsEx2(statistics: COpaquePointer?, family: UInt): UInt

public expect fun getTcpTable(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt

public expect fun getTcpTable2(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt

public expect fun getTeredoPort(port: COpaquePointer?): Win32Error

public expect fun getUdp6Table(udp6table: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt

public expect fun getUdpStatistics(stats: COpaquePointer?): UInt

public expect fun getUdpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt

public expect fun getUdpStatisticsEx2(statistics: COpaquePointer?, family: UInt): UInt

public expect fun getUdpTable(udptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt

public expect fun getUniDirectionalAdapterInfo(pipifinfo: COpaquePointer?, dwoutbuflen: COpaquePointer?): UInt

public expect fun getUnicastIpAddressEntry(row: COpaquePointer?): Win32Error

public expect fun getUnicastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error

public expect fun icmp6CreateFile(): Handle

public expect fun icmp6ParseReplies(replybuffer: COpaquePointer?, replysize: UInt): UInt

public expect fun icmp6SendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, sourceaddress: COpaquePointer?, destinationaddress: COpaquePointer?, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt

public expect fun icmpCloseHandle(icmphandle: Handle): Bool

public expect fun icmpCreateFile(): Handle

public expect fun icmpParseReplies(replybuffer: COpaquePointer?, replysize: UInt): UInt

public expect fun icmpSendEcho(icmphandle: Handle, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt

public expect fun icmpSendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt

public expect fun icmpSendEcho2Ex(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, sourceaddress: UInt, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt

public expect fun initializeIpForwardEntry(row: COpaquePointer?)

public expect fun initializeIpInterfaceEntry(row: COpaquePointer?)

public expect fun initializeUnicastIpAddressEntry(row: COpaquePointer?)

public expect fun ipReleaseAddress(adapterinfo: COpaquePointer?): UInt

public expect fun ipRenewAddress(adapterinfo: COpaquePointer?): UInt

public expect fun lookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt

public expect fun lookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt

public expect fun nhpAllocateAndGetInterfaceInfoFromStack(pptable: COpaquePointer?, pdwcount: COpaquePointer?, border: Bool, hheap: Handle, dwflags: UInt): UInt

public expect fun notifyAddrChange(handle: COpaquePointer?, overlapped: COpaquePointer?): UInt

public expect fun notifyIfTimestampConfigChange(callercontext: COpaquePointer?, callback: PinterfaceTimestampConfigChangeCallback, notificationhandle: COpaquePointer?): UInt

public expect fun notifyIpInterfaceChange(family: AddressFamily, callback: PipinterfaceChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error

public expect fun notifyNetworkConnectivityHintChange(callback: PnetworkConnectivityHintChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error

public expect fun notifyRouteChange(handle: COpaquePointer?, overlapped: COpaquePointer?): UInt

public expect fun notifyRouteChange2(addressfamily: AddressFamily, callback: PipforwardChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error

public expect fun notifyStableUnicastIpAddressTable(family: AddressFamily, table: COpaquePointer?, callercallback: PstableUnicastIpaddressTableCallback, callercontext: COpaquePointer?, notificationhandle: COpaquePointer?): Win32Error

public expect fun notifyTeredoPortChange(callback: PteredoPortChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error

public expect fun notifyUnicastIpAddressChange(family: AddressFamily, callback: PunicastIpaddressChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error

public expect fun parseNetworkString(networkstring: Pcwstr, types: UInt, addressinfo: COpaquePointer?, portnumber: COpaquePointer?, prefixlength: COpaquePointer?): UInt

public expect fun pfAddFiltersToInterface(ih: COpaquePointer?, cinfilters: UInt, pfiltin: COpaquePointer?, coutfilters: UInt, pfiltout: COpaquePointer?, pfhandle: COpaquePointer?): UInt

public expect fun pfAddGlobalFilterToInterface(pinterface: COpaquePointer?, gffilter: GlobalFilter): UInt

public expect fun pfBindInterfaceToIPAddress(pinterface: COpaquePointer?, pfattype: Pfaddresstype, ipaddress: COpaquePointer?): UInt

public expect fun pfBindInterfaceToIndex(pinterface: COpaquePointer?, dwindex: UInt, pfatlinktype: Pfaddresstype, linkipaddress: COpaquePointer?): UInt

public expect fun pfCreateInterface(dwname: UInt, inaction: PfforwardAction, outaction: PfforwardAction, buselog: Bool, bmustbeunique: Bool, ppinterface: COpaquePointer?): UInt

public expect fun pfDeleteInterface(pinterface: COpaquePointer?): UInt

public expect fun pfDeleteLog(): UInt

public expect fun pfGetInterfaceStatistics(pinterface: COpaquePointer?, ppfstats: COpaquePointer?, pdwbuffersize: COpaquePointer?, fresetcounters: Bool): UInt

public expect fun pfMakeLog(hevent: Handle): UInt

public expect fun pfRebindFilters(pinterface: COpaquePointer?, platebindinfo: COpaquePointer?): UInt

public expect fun pfRemoveFilterHandles(pinterface: COpaquePointer?, cfilters: UInt, pvhandles: COpaquePointer?): UInt

public expect fun pfRemoveFiltersFromInterface(ih: COpaquePointer?, cinfilters: UInt, pfiltin: COpaquePointer?, coutfilters: UInt, pfiltout: COpaquePointer?): UInt

public expect fun pfRemoveGlobalFilterFromInterface(pinterface: COpaquePointer?, gffilter: GlobalFilter): UInt

public expect fun pfSetLogBuffer(pbbuffer: COpaquePointer?, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: COpaquePointer?, pdwlostentries: COpaquePointer?, pdwsizeused: COpaquePointer?): UInt

public expect fun pfTestPacket(pininterface: COpaquePointer?, poutinterface: COpaquePointer?, cbytes: UInt, pbpacket: COpaquePointer?, ppaction: COpaquePointer?): UInt

public expect fun pfUnBindInterface(pinterface: COpaquePointer?): UInt

public expect fun registerInterfaceTimestampConfigChange(callback: PinterfaceTimestampConfigChangeCallback, callercontext: COpaquePointer?, notificationhandle: COpaquePointer?): UInt

public expect fun resolveIpNetEntry2(row: COpaquePointer?, sourceaddress: COpaquePointer?): Win32Error

public expect fun resolveNeighbor(networkaddress: COpaquePointer?, physicaladdress: COpaquePointer?, physicaladdresslength: COpaquePointer?): UInt

public expect fun restoreMediaSense(poverlapped: COpaquePointer?, lpdwenablecount: COpaquePointer?): UInt

public expect fun sendARP(destip: UInt, srcip: UInt, pmacaddr: COpaquePointer?, phyaddrlen: COpaquePointer?): UInt

public expect fun setCurrentThreadCompartmentId(compartmentid: NetIfCompartmentId): Win32Error

public expect fun setCurrentThreadCompartmentScope(compartmentscope: UInt): Win32Error

public expect fun setDnsSettings(settings: COpaquePointer?): Win32Error

public expect fun setIfEntry(pifrow: COpaquePointer?): UInt

public expect fun setInterfaceDnsSettings(iface: Guid, settings: COpaquePointer?): Win32Error

public expect fun setIpForwardEntry(proute: COpaquePointer?): UInt

public expect fun setIpForwardEntry2(route: COpaquePointer?): Win32Error

public expect fun setIpInterfaceEntry(row: COpaquePointer?): Win32Error

public expect fun setIpNetEntry(parpentry: COpaquePointer?): UInt

public expect fun setIpNetEntry2(row: COpaquePointer?): Win32Error

public expect fun setIpStatistics(pipstats: COpaquePointer?): UInt

public expect fun setIpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt

public expect fun setIpTTL(nttl: UInt): UInt

public expect fun setJobCompartmentId(jobhandle: Handle, compartmentid: NetIfCompartmentId): Win32Error

public expect fun setNetworkInformation(networkguid: COpaquePointer?, compartmentid: NetIfCompartmentId, networkname: Pcwstr): Win32Error

public expect fun setPerTcp6ConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, offset: UInt): UInt

public expect fun setPerTcpConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, offset: UInt): UInt

public expect fun setSessionCompartmentId(sessionid: UInt, compartmentid: NetIfCompartmentId): Win32Error

public expect fun setTcpEntry(ptcprow: COpaquePointer?): UInt

public expect fun setUnicastIpAddressEntry(row: COpaquePointer?): Win32Error

public expect fun unenableRouter(poverlapped: COpaquePointer?, lpdwenablecount: COpaquePointer?): UInt

public expect fun unregisterInterfaceTimestampConfigChange(notificationhandle: Hiftimestampchange)

public expect fun ifIndextoname(interfaceindex: UInt, interfacename: Pstr): Pstr

public expect fun ifNametoindex(interfacename: Pcstr): UInt
