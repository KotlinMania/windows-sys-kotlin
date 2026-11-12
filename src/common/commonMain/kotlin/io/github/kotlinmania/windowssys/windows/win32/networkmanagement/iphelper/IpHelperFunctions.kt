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

public expect fun addIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: MutPtr<UInt>, nteinstance: MutPtr<UInt>): UInt

public expect fun cancelIPChangeNotify(notifyoverlapped: ConstPtr<Overlapped>): Bool

public expect fun cancelIfTimestampConfigChange(notificationhandle: Hiftimestampchange)

public expect fun cancelMibChangeNotify2(notificationhandle: Handle): Win32Error

public expect fun captureInterfaceHardwareCrossTimestamp(interfaceluid: ConstPtr<NetLuidLh>, crosstimestamp: MutPtr<InterfaceHardwareCrosstimestamp>): UInt

public expect fun convertCompartmentGuidToId(compartmentguid: ConstPtr<Guid>, compartmentid: MutPtr<UInt>): Win32Error

public expect fun convertCompartmentIdToGuid(compartmentid: NetIfCompartmentId, compartmentguid: MutPtr<Guid>): Win32Error

public expect fun convertInterfaceAliasToLuid(interfacealias: Pcwstr, interfaceluid: MutPtr<NetLuidLh>): Win32Error

public expect fun convertInterfaceGuidToLuid(interfaceguid: ConstPtr<Guid>, interfaceluid: MutPtr<NetLuidLh>): Win32Error

public expect fun convertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: MutPtr<NetLuidLh>): Win32Error

public expect fun convertInterfaceLuidToAlias(interfaceluid: ConstPtr<NetLuidLh>, interfacealias: Pwstr, length: ULong): Win32Error

public expect fun convertInterfaceLuidToGuid(interfaceluid: ConstPtr<NetLuidLh>, interfaceguid: MutPtr<Guid>): Win32Error

public expect fun convertInterfaceLuidToIndex(interfaceluid: ConstPtr<NetLuidLh>, interfaceindex: MutPtr<UInt>): Win32Error

public expect fun convertInterfaceLuidToNameA(interfaceluid: ConstPtr<NetLuidLh>, interfacename: Pstr, length: ULong): Win32Error

public expect fun convertInterfaceLuidToNameW(interfaceluid: ConstPtr<NetLuidLh>, interfacename: Pwstr, length: ULong): Win32Error

public expect fun convertInterfaceNameToLuidA(interfacename: Pcstr, interfaceluid: MutPtr<NetLuidLh>): Win32Error

public expect fun convertInterfaceNameToLuidW(interfacename: Pcwstr, interfaceluid: MutPtr<NetLuidLh>): Win32Error

public expect fun convertIpv4MaskToLength(mask: UInt, masklength: MutPtr<UByte>): Win32Error

public expect fun convertLengthToIpv4Mask(masklength: UInt, mask: MutPtr<UInt>): Win32Error

public expect fun createAnycastIpAddressEntry(row: ConstPtr<MibAnycastipaddressRow>): Win32Error

public expect fun createIpForwardEntry(proute: ConstPtr<MibIpforwardrow>): UInt

public expect fun createIpForwardEntry2(row: ConstPtr<MibIpforwardRow2>): Win32Error

public expect fun createIpNetEntry(parpentry: ConstPtr<MibIpnetrowLh>): UInt

public expect fun createIpNetEntry2(row: ConstPtr<MibIpnetRow2>): Win32Error

public expect fun createPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt

public expect fun createPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt

public expect fun createProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt

public expect fun createSortedAddressPairs(sourceaddresslist: ConstPtr<SockaddrIn6>, sourceaddresscount: UInt, destinationaddresslist: ConstPtr<SockaddrIn6>, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: MutPtr<MutPtr<SockaddrIn6Pair>>, sortedaddresspaircount: MutPtr<UInt>): Win32Error

public expect fun createUnicastIpAddressEntry(row: ConstPtr<MibUnicastipaddressRow>): Win32Error

public expect fun deleteAnycastIpAddressEntry(row: ConstPtr<MibAnycastipaddressRow>): Win32Error

public expect fun deleteIPAddress(ntecontext: UInt): UInt

public expect fun deleteIpForwardEntry(proute: ConstPtr<MibIpforwardrow>): UInt

public expect fun deleteIpForwardEntry2(row: ConstPtr<MibIpforwardRow2>): Win32Error

public expect fun deleteIpNetEntry(parpentry: ConstPtr<MibIpnetrowLh>): UInt

public expect fun deleteIpNetEntry2(row: ConstPtr<MibIpnetRow2>): Win32Error

public expect fun deletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt

public expect fun deletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt

public expect fun deleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt

public expect fun deleteUnicastIpAddressEntry(row: ConstPtr<MibUnicastipaddressRow>): Win32Error

public expect fun disableMediaSense(phandle: MutPtr<Handle>, poverlapped: ConstPtr<Overlapped>): UInt

public expect fun enableRouter(phandle: MutPtr<Handle>, poverlapped: MutPtr<Overlapped>): UInt

public expect fun flushIpNetTable(dwifindex: UInt): UInt

public expect fun flushIpNetTable2(family: AddressFamily, interfaceindex: UInt): Win32Error

public expect fun flushIpPathTable(family: AddressFamily): Win32Error

public expect fun freeDnsSettings(settings: MutPtr<DnsSettings>)

public expect fun freeInterfaceDnsSettings(settings: MutPtr<DnsInterfaceSettings>)

public expect fun freeMibTable(memory: ConstPtr<CVoid>)

public expect fun getAdapterIndex(adaptername: Pcwstr, ifindex: MutPtr<UInt>): UInt

public expect fun getAdapterOrderMap(): MutPtr<IpAdapterOrderMap>

public expect fun getAdaptersAddresses(family: UInt, flags: GetAdaptersAddressesFlags, reserved: ConstPtr<CVoid>, adapteraddresses: MutPtr<IpAdapterAddressesLh>, sizepointer: MutPtr<UInt>): UInt

public expect fun getAdaptersInfo(adapterinfo: MutPtr<IpAdapterInfo>, sizepointer: MutPtr<UInt>): UInt

public expect fun getAnycastIpAddressEntry(row: MutPtr<MibAnycastipaddressRow>): Win32Error

public expect fun getAnycastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibAnycastipaddressTable>>): Win32Error

public expect fun getBestInterface(dwdestaddr: UInt, pdwbestifindex: MutPtr<UInt>): UInt

public expect fun getBestInterfaceEx(pdestaddr: ConstPtr<Sockaddr>, pdwbestifindex: MutPtr<UInt>): UInt

public expect fun getBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: MutPtr<MibIpforwardrow>): UInt

public expect fun getBestRoute2(interfaceluid: ConstPtr<NetLuidLh>, interfaceindex: UInt, sourceaddress: ConstPtr<SockaddrInet>, destinationaddress: ConstPtr<SockaddrInet>, addresssortoptions: UInt, bestroute: MutPtr<MibIpforwardRow2>, bestsourceaddress: MutPtr<SockaddrInet>): Win32Error

public expect fun getCurrentThreadCompartmentId(): NetIfCompartmentId

public expect fun getCurrentThreadCompartmentScope(compartmentscope: MutPtr<UInt>, compartmentid: MutPtr<UInt>)

public expect fun getDefaultCompartmentId(): NetIfCompartmentId

public expect fun getDnsSettings(settings: MutPtr<DnsSettings>): Win32Error

public expect fun getExtendedTcpTable(ptcptable: MutPtr<CVoid>, pdwsize: MutPtr<UInt>, border: Bool, ulaf: UInt, tableclass: TcpTableClass, reserved: UInt): UInt

public expect fun getExtendedUdpTable(pudptable: MutPtr<CVoid>, pdwsize: MutPtr<UInt>, border: Bool, ulaf: UInt, tableclass: UdpTableClass, reserved: UInt): UInt

public expect fun getFriendlyIfIndex(ifindex: UInt): UInt

public expect fun getIcmpStatistics(statistics: MutPtr<MibIcmp>): UInt

public expect fun getIcmpStatisticsEx(statistics: MutPtr<MibIcmpExXpsp1>, family: UInt): UInt

public expect fun getIfEntry(pifrow: MutPtr<MibIfrow>): UInt

public expect fun getIfEntry2(row: MutPtr<MibIfRow2>): Win32Error

public expect fun getIfEntry2Ex(level: MibIfEntryLevel, row: MutPtr<MibIfRow2>): Win32Error

public expect fun getIfStackTable(table: MutPtr<MutPtr<MibIfstackTable>>): Win32Error

public expect fun getIfTable(piftable: MutPtr<MibIftable>, pdwsize: MutPtr<UInt>, border: Bool): UInt

public expect fun getIfTable2(table: MutPtr<MutPtr<MibIfTable2>>): Win32Error

public expect fun getIfTable2Ex(level: MibIfTableLevel, table: MutPtr<MutPtr<MibIfTable2>>): Win32Error

public expect fun getInterfaceActiveTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt

public expect fun getInterfaceCurrentTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt

public expect fun getInterfaceDnsSettings(iface: Guid, settings: MutPtr<DnsInterfaceSettings>): Win32Error

public expect fun getInterfaceHardwareTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt

public expect fun getInterfaceInfo(piftable: MutPtr<IpInterfaceInfo>, dwoutbuflen: MutPtr<UInt>): UInt

public expect fun getInterfaceSupportedTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt

public expect fun getInvertedIfStackTable(table: MutPtr<MutPtr<MibInvertedifstackTable>>): Win32Error

public expect fun getIpAddrTable(pipaddrtable: MutPtr<MibIpaddrtable>, pdwsize: MutPtr<UInt>, border: Bool): UInt

public expect fun getIpErrorString(errorcode: UInt, buffer: Pwstr, size: MutPtr<UInt>): UInt

public expect fun getIpForwardEntry2(row: MutPtr<MibIpforwardRow2>): Win32Error

public expect fun getIpForwardTable(pipforwardtable: MutPtr<MibIpforwardtable>, pdwsize: MutPtr<UInt>, border: Bool): UInt

public expect fun getIpForwardTable2(family: AddressFamily, table: MutPtr<MutPtr<MibIpforwardTable2>>): Win32Error

public expect fun getIpInterfaceEntry(row: MutPtr<MibIpinterfaceRow>): Win32Error

public expect fun getIpInterfaceTable(family: AddressFamily, table: MutPtr<MutPtr<MibIpinterfaceTable>>): Win32Error

public expect fun getIpNetEntry2(row: MutPtr<MibIpnetRow2>): Win32Error

public expect fun getIpNetTable(ipnettable: MutPtr<MibIpnettable>, sizepointer: MutPtr<UInt>, order: Bool): UInt

public expect fun getIpNetTable2(family: AddressFamily, table: MutPtr<MutPtr<MibIpnetTable2>>): Win32Error

public expect fun getIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: AddressFamily, bandwidthestimates: MutPtr<MibIpNetworkConnectionBandwidthEstimates>): Win32Error

public expect fun getIpPathEntry(row: MutPtr<MibIppathRow>): Win32Error

public expect fun getIpPathTable(family: AddressFamily, table: MutPtr<MutPtr<MibIppathTable>>): Win32Error

public expect fun getIpStatistics(statistics: MutPtr<MibIpstatsLh>): UInt

public expect fun getIpStatisticsEx(statistics: MutPtr<MibIpstatsLh>, family: UInt): UInt

public expect fun getJobCompartmentId(jobhandle: Handle): NetIfCompartmentId

public expect fun getMulticastIpAddressEntry(row: MutPtr<MibMulticastipaddressRow>): Win32Error

public expect fun getMulticastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibMulticastipaddressTable>>): Win32Error

public expect fun getNetworkConnectivityHint(connectivityhint: MutPtr<NlNetworkConnectivityHint>): Win32Error

public expect fun getNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: MutPtr<NlNetworkConnectivityHint>): Win32Error

public expect fun getNetworkInformation(networkguid: ConstPtr<Guid>, compartmentid: MutPtr<UInt>, siteid: MutPtr<UInt>, networkname: Pwstr, length: UInt): Win32Error

public expect fun getNetworkParams(pfixedinfo: MutPtr<FixedInfoW2ksp1>, poutbuflen: MutPtr<UInt>): Win32Error

public expect fun getNumberOfInterfaces(pdwnumif: MutPtr<UInt>): UInt

public expect fun getOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: ConstPtr<ULong>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt

public expect fun getOwnerModuleFromTcp6Entry(ptcpentry: ConstPtr<MibTcp6rowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt

public expect fun getOwnerModuleFromTcpEntry(ptcpentry: ConstPtr<MibTcprowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt

public expect fun getOwnerModuleFromUdp6Entry(pudpentry: ConstPtr<MibUdp6rowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt

public expect fun getOwnerModuleFromUdpEntry(pudpentry: ConstPtr<MibUdprowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt

public expect fun getPerAdapterInfo(ifindex: UInt, pperadapterinfo: MutPtr<IpPerAdapterInfoW2ksp1>, poutbuflen: MutPtr<UInt>): UInt

public expect fun getPerTcp6ConnectionEStats(row: ConstPtr<MibTcp6row>, estatstype: TcpEstatsType, rw: MutPtr<UByte>, rwversion: UInt, rwsize: UInt, ros: MutPtr<UByte>, rosversion: UInt, rossize: UInt, rod: MutPtr<UByte>, rodversion: UInt, rodsize: UInt): UInt

public expect fun getPerTcpConnectionEStats(row: ConstPtr<MibTcprowLh>, estatstype: TcpEstatsType, rw: MutPtr<UByte>, rwversion: UInt, rwsize: UInt, ros: MutPtr<UByte>, rosversion: UInt, rossize: UInt, rod: MutPtr<UByte>, rodversion: UInt, rodsize: UInt): UInt

public expect fun getRTTAndHopCount(destipaddress: UInt, hopcount: MutPtr<UInt>, maxhops: UInt, rtt: MutPtr<UInt>): Bool

public expect fun getSessionCompartmentId(sessionid: UInt): NetIfCompartmentId

public expect fun getTcp6Table(tcptable: MutPtr<MibTcp6table>, sizepointer: MutPtr<UInt>, order: Bool): UInt

public expect fun getTcp6Table2(tcptable: MutPtr<MibTcp6table2>, sizepointer: MutPtr<UInt>, order: Bool): UInt

public expect fun getTcpStatistics(statistics: MutPtr<MibTcpstatsLh>): UInt

public expect fun getTcpStatisticsEx(statistics: MutPtr<MibTcpstatsLh>, family: UInt): UInt

public expect fun getTcpStatisticsEx2(statistics: MutPtr<MibTcpstats2>, family: UInt): UInt

public expect fun getTcpTable(tcptable: MutPtr<MibTcptable>, sizepointer: MutPtr<UInt>, order: Bool): UInt

public expect fun getTcpTable2(tcptable: MutPtr<MibTcptable2>, sizepointer: MutPtr<UInt>, order: Bool): UInt

public expect fun getTeredoPort(port: MutPtr<UShort>): Win32Error

public expect fun getUdp6Table(udp6table: MutPtr<MibUdp6table>, sizepointer: MutPtr<UInt>, order: Bool): UInt

public expect fun getUdpStatistics(stats: MutPtr<MibUdpstats>): UInt

public expect fun getUdpStatisticsEx(statistics: MutPtr<MibUdpstats>, family: UInt): UInt

public expect fun getUdpStatisticsEx2(statistics: MutPtr<MibUdpstats2>, family: UInt): UInt

public expect fun getUdpTable(udptable: MutPtr<MibUdptable>, sizepointer: MutPtr<UInt>, order: Bool): UInt

public expect fun getUniDirectionalAdapterInfo(pipifinfo: MutPtr<IpUnidirectionalAdapterAddress>, dwoutbuflen: MutPtr<UInt>): UInt

public expect fun getUnicastIpAddressEntry(row: MutPtr<MibUnicastipaddressRow>): Win32Error

public expect fun getUnicastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibUnicastipaddressTable>>): Win32Error

public expect fun icmp6CreateFile(): Handle

public expect fun icmp6ParseReplies(replybuffer: MutPtr<CVoid>, replysize: UInt): UInt

public expect fun icmp6SendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, sourceaddress: ConstPtr<SockaddrIn6>, destinationaddress: ConstPtr<SockaddrIn6>, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt

public expect fun icmpCloseHandle(icmphandle: Handle): Bool

public expect fun icmpCreateFile(): Handle

public expect fun icmpParseReplies(replybuffer: MutPtr<CVoid>, replysize: UInt): UInt

public expect fun icmpSendEcho(icmphandle: Handle, destinationaddress: UInt, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt

public expect fun icmpSendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, destinationaddress: UInt, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt

public expect fun icmpSendEcho2Ex(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, sourceaddress: UInt, destinationaddress: UInt, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt

public expect fun initializeIpForwardEntry(row: MutPtr<MibIpforwardRow2>)

public expect fun initializeIpInterfaceEntry(row: MutPtr<MibIpinterfaceRow>)

public expect fun initializeUnicastIpAddressEntry(row: MutPtr<MibUnicastipaddressRow>)

public expect fun ipReleaseAddress(adapterinfo: ConstPtr<IpAdapterIndexMap>): UInt

public expect fun ipRenewAddress(adapterinfo: ConstPtr<IpAdapterIndexMap>): UInt

public expect fun lookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt

public expect fun lookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt

public expect fun nhpAllocateAndGetInterfaceInfoFromStack(pptable: MutPtr<MutPtr<IpInterfaceNameInfoW2ksp1>>, pdwcount: MutPtr<UInt>, border: Bool, hheap: Handle, dwflags: UInt): UInt

public expect fun notifyAddrChange(handle: MutPtr<Handle>, overlapped: ConstPtr<Overlapped>): UInt

public expect fun notifyIfTimestampConfigChange(callercontext: ConstPtr<CVoid>, callback: PinterfaceTimestampConfigChangeCallback, notificationhandle: MutPtr<Hiftimestampchange>): UInt

public expect fun notifyIpInterfaceChange(family: AddressFamily, callback: PipinterfaceChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error

public expect fun notifyNetworkConnectivityHintChange(callback: PnetworkConnectivityHintChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error

public expect fun notifyRouteChange(handle: MutPtr<Handle>, overlapped: ConstPtr<Overlapped>): UInt

public expect fun notifyRouteChange2(addressfamily: AddressFamily, callback: PipforwardChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error

public expect fun notifyStableUnicastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibUnicastipaddressTable>>, callercallback: PstableUnicastIpaddressTableCallback, callercontext: ConstPtr<CVoid>, notificationhandle: MutPtr<Handle>): Win32Error

public expect fun notifyTeredoPortChange(callback: PteredoPortChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error

public expect fun notifyUnicastIpAddressChange(family: AddressFamily, callback: PunicastIpaddressChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error

public expect fun parseNetworkString(networkstring: Pcwstr, types: UInt, addressinfo: MutPtr<NetAddressInfo>, portnumber: MutPtr<UShort>, prefixlength: MutPtr<UByte>): UInt

public expect fun pfAddFiltersToInterface(ih: MutPtr<CVoid>, cinfilters: UInt, pfiltin: MutPtr<PfFilterDescriptor>, coutfilters: UInt, pfiltout: MutPtr<PfFilterDescriptor>, pfhandle: MutPtr<MutPtr<CVoid>>): UInt

public expect fun pfAddGlobalFilterToInterface(pinterface: MutPtr<CVoid>, gffilter: GlobalFilter): UInt

public expect fun pfBindInterfaceToIPAddress(pinterface: MutPtr<CVoid>, pfattype: Pfaddresstype, ipaddress: MutPtr<UByte>): UInt

public expect fun pfBindInterfaceToIndex(pinterface: MutPtr<CVoid>, dwindex: UInt, pfatlinktype: Pfaddresstype, linkipaddress: MutPtr<UByte>): UInt

public expect fun pfCreateInterface(dwname: UInt, inaction: PfforwardAction, outaction: PfforwardAction, buselog: Bool, bmustbeunique: Bool, ppinterface: MutPtr<MutPtr<CVoid>>): UInt

public expect fun pfDeleteInterface(pinterface: MutPtr<CVoid>): UInt

public expect fun pfDeleteLog(): UInt

public expect fun pfGetInterfaceStatistics(pinterface: MutPtr<CVoid>, ppfstats: MutPtr<PfInterfaceStats>, pdwbuffersize: MutPtr<UInt>, fresetcounters: Bool): UInt

public expect fun pfMakeLog(hevent: Handle): UInt

public expect fun pfRebindFilters(pinterface: MutPtr<CVoid>, platebindinfo: MutPtr<PfLatebindInfo>): UInt

public expect fun pfRemoveFilterHandles(pinterface: MutPtr<CVoid>, cfilters: UInt, pvhandles: MutPtr<MutPtr<CVoid>>): UInt

public expect fun pfRemoveFiltersFromInterface(ih: MutPtr<CVoid>, cinfilters: UInt, pfiltin: MutPtr<PfFilterDescriptor>, coutfilters: UInt, pfiltout: MutPtr<PfFilterDescriptor>): UInt

public expect fun pfRemoveGlobalFilterFromInterface(pinterface: MutPtr<CVoid>, gffilter: GlobalFilter): UInt

public expect fun pfSetLogBuffer(pbbuffer: MutPtr<UByte>, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: MutPtr<UInt>, pdwlostentries: MutPtr<UInt>, pdwsizeused: MutPtr<UInt>): UInt

public expect fun pfTestPacket(pininterface: MutPtr<CVoid>, poutinterface: MutPtr<CVoid>, cbytes: UInt, pbpacket: MutPtr<UByte>, ppaction: MutPtr<PfforwardAction>): UInt

public expect fun pfUnBindInterface(pinterface: MutPtr<CVoid>): UInt

public expect fun registerInterfaceTimestampConfigChange(callback: PinterfaceTimestampConfigChangeCallback, callercontext: ConstPtr<CVoid>, notificationhandle: MutPtr<Hiftimestampchange>): UInt

public expect fun resolveIpNetEntry2(row: MutPtr<MibIpnetRow2>, sourceaddress: ConstPtr<SockaddrInet>): Win32Error

public expect fun resolveNeighbor(networkaddress: ConstPtr<Sockaddr>, physicaladdress: MutPtr<CVoid>, physicaladdresslength: MutPtr<UInt>): UInt

public expect fun restoreMediaSense(poverlapped: ConstPtr<Overlapped>, lpdwenablecount: MutPtr<UInt>): UInt

public expect fun sendARP(destip: UInt, srcip: UInt, pmacaddr: MutPtr<CVoid>, phyaddrlen: MutPtr<UInt>): UInt

public expect fun setCurrentThreadCompartmentId(compartmentid: NetIfCompartmentId): Win32Error

public expect fun setCurrentThreadCompartmentScope(compartmentscope: UInt): Win32Error

public expect fun setDnsSettings(settings: ConstPtr<DnsSettings>): Win32Error

public expect fun setIfEntry(pifrow: ConstPtr<MibIfrow>): UInt

public expect fun setInterfaceDnsSettings(iface: Guid, settings: ConstPtr<DnsInterfaceSettings>): Win32Error

public expect fun setIpForwardEntry(proute: ConstPtr<MibIpforwardrow>): UInt

public expect fun setIpForwardEntry2(route: ConstPtr<MibIpforwardRow2>): Win32Error

public expect fun setIpInterfaceEntry(row: MutPtr<MibIpinterfaceRow>): Win32Error

public expect fun setIpNetEntry(parpentry: ConstPtr<MibIpnetrowLh>): UInt

public expect fun setIpNetEntry2(row: ConstPtr<MibIpnetRow2>): Win32Error

public expect fun setIpStatistics(pipstats: ConstPtr<MibIpstatsLh>): UInt

public expect fun setIpStatisticsEx(statistics: ConstPtr<MibIpstatsLh>, family: UInt): UInt

public expect fun setIpTTL(nttl: UInt): UInt

public expect fun setJobCompartmentId(jobhandle: Handle, compartmentid: NetIfCompartmentId): Win32Error

public expect fun setNetworkInformation(networkguid: ConstPtr<Guid>, compartmentid: NetIfCompartmentId, networkname: Pcwstr): Win32Error

public expect fun setPerTcp6ConnectionEStats(row: ConstPtr<MibTcp6row>, estatstype: TcpEstatsType, rw: ConstPtr<UByte>, rwversion: UInt, rwsize: UInt, offset: UInt): UInt

public expect fun setPerTcpConnectionEStats(row: ConstPtr<MibTcprowLh>, estatstype: TcpEstatsType, rw: ConstPtr<UByte>, rwversion: UInt, rwsize: UInt, offset: UInt): UInt

public expect fun setSessionCompartmentId(sessionid: UInt, compartmentid: NetIfCompartmentId): Win32Error

public expect fun setTcpEntry(ptcprow: ConstPtr<MibTcprowLh>): UInt

public expect fun setUnicastIpAddressEntry(row: ConstPtr<MibUnicastipaddressRow>): Win32Error

public expect fun unenableRouter(poverlapped: ConstPtr<Overlapped>, lpdwenablecount: MutPtr<UInt>): UInt

public expect fun unregisterInterfaceTimestampConfigChange(notificationhandle: Hiftimestampchange)

public expect fun ifIndextoname(interfaceindex: UInt, interfacename: Pstr): Pstr

public expect fun ifNametoindex(interfacename: Pcstr): UInt
