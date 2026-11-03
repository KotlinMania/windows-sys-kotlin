package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(callercontext: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(callercontext: Long, row: Long, notificationtype: MIB_NOTIFICATION_TYPE)
}

public fun interface FnCallback2 {
    public operator fun invoke(callercontext: Long, connectivityhint: Networking.WinSock.NL_NETWORK_CONNECTIVITY_HINT)
}

public fun interface FnCallback3 {
    public operator fun invoke(callercontext: Long, addresstable: Long)
}

public fun interface FnCallback4 {
    public operator fun invoke(callercontext: Long, port: UShort, notificationtype: MIB_NOTIFICATION_TYPE)
}

public fun AddIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: Long, nteinstance: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "AddIPAddress", longArrayOf(address.toLong(), ipmask.toLong(), ifindex.toLong(), ntecontext, nteinstance)).toUInt()
}

public fun CancelIPChangeNotify(notifyoverlapped: Long): BOOL {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "CancelIPChangeNotify", longArrayOf(notifyoverlapped)).toInt()
}

public fun CancelIfTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE) {
    Win32DynamicFfi.invoke("iphlpapi.dll", "CancelIfTimestampConfigChange", longArrayOf(notificationhandle))
}

public fun CancelMibChangeNotify2(notificationhandle: Foundation.HANDLE): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "CancelMibChangeNotify2", longArrayOf(Win32DynamicFfi.objectSlot(notificationhandle)))
    return Foundation.WIN32_ERROR()
}

public fun CaptureInterfaceHardwareCrossTimestamp(interfaceluid: Long, crosstimestamp: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "CaptureInterfaceHardwareCrossTimestamp", longArrayOf(interfaceluid, crosstimestamp)).toUInt()
}

public fun ConvertCompartmentGuidToId(compartmentguid: Long, compartmentid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertCompartmentGuidToId", longArrayOf(compartmentguid, compartmentid))
    return Foundation.WIN32_ERROR()
}

public fun ConvertCompartmentIdToGuid(compartmentid: Ndis.NET_IF_COMPARTMENT_ID, compartmentguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertCompartmentIdToGuid", longArrayOf(Win32DynamicFfi.objectSlot(compartmentid), compartmentguid))
    return Foundation.WIN32_ERROR()
}

public fun ConvertInterfaceAliasToLuid(interfacealias: PCWSTR, interfaceluid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertInterfaceAliasToLuid", longArrayOf(interfacealias, interfaceluid))
    return Foundation.WIN32_ERROR()
}

public fun ConvertInterfaceGuidToLuid(interfaceguid: Long, interfaceluid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertInterfaceGuidToLuid", longArrayOf(interfaceguid, interfaceluid))
    return Foundation.WIN32_ERROR()
}

public fun ConvertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertInterfaceIndexToLuid", longArrayOf(interfaceindex.toLong(), interfaceluid))
    return Foundation.WIN32_ERROR()
}

public fun ConvertInterfaceLuidToAlias(interfaceluid: Long, interfacealias: PWSTR, length: ULong): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertInterfaceLuidToAlias", longArrayOf(interfaceluid, interfacealias, length.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun ConvertInterfaceLuidToGuid(interfaceluid: Long, interfaceguid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertInterfaceLuidToGuid", longArrayOf(interfaceluid, interfaceguid))
    return Foundation.WIN32_ERROR()
}

public fun ConvertInterfaceLuidToIndex(interfaceluid: Long, interfaceindex: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertInterfaceLuidToIndex", longArrayOf(interfaceluid, interfaceindex))
    return Foundation.WIN32_ERROR()
}

public fun ConvertInterfaceLuidToNameA(interfaceluid: Long, interfacename: PSTR, length: ULong): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertInterfaceLuidToNameA", longArrayOf(interfaceluid, interfacename, length.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun ConvertInterfaceLuidToNameW(interfaceluid: Long, interfacename: PWSTR, length: ULong): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertInterfaceLuidToNameW", longArrayOf(interfaceluid, interfacename, length.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun ConvertInterfaceNameToLuidA(interfacename: PCSTR, interfaceluid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertInterfaceNameToLuidA", longArrayOf(interfacename, interfaceluid))
    return Foundation.WIN32_ERROR()
}

public fun ConvertInterfaceNameToLuidW(interfacename: PCWSTR, interfaceluid: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertInterfaceNameToLuidW", longArrayOf(interfacename, interfaceluid))
    return Foundation.WIN32_ERROR()
}

public fun ConvertIpv4MaskToLength(mask: UInt, masklength: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertIpv4MaskToLength", longArrayOf(mask.toLong(), masklength))
    return Foundation.WIN32_ERROR()
}

public fun ConvertLengthToIpv4Mask(masklength: UInt, mask: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ConvertLengthToIpv4Mask", longArrayOf(masklength.toLong(), mask))
    return Foundation.WIN32_ERROR()
}

public fun CreateAnycastIpAddressEntry(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "CreateAnycastIpAddressEntry", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun CreateIpForwardEntry(proute: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "CreateIpForwardEntry", longArrayOf(proute)).toUInt()
}

public fun CreateIpForwardEntry2(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "CreateIpForwardEntry2", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun CreateIpNetEntry(parpentry: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "CreateIpNetEntry", longArrayOf(parpentry)).toUInt()
}

public fun CreateIpNetEntry2(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "CreateIpNetEntry2", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun CreatePersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "CreatePersistentTcpPortReservation", longArrayOf(startport.toLong(), numberofports.toLong(), token)).toUInt()
}

public fun CreatePersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "CreatePersistentUdpPortReservation", longArrayOf(startport.toLong(), numberofports.toLong(), token)).toUInt()
}

public fun CreateProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "CreateProxyArpEntry", longArrayOf(dwaddress.toLong(), dwmask.toLong(), dwifindex.toLong())).toUInt()
}

public fun CreateSortedAddressPairs(sourceaddresslist: Long, sourceaddresscount: UInt, destinationaddresslist: Long, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: Long, sortedaddresspaircount: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "CreateSortedAddressPairs", longArrayOf(sourceaddresslist, sourceaddresscount.toLong(), destinationaddresslist, destinationaddresscount.toLong(), addresssortoptions.toLong(), sortedaddresspairlist, sortedaddresspaircount))
    return Foundation.WIN32_ERROR()
}

public fun CreateUnicastIpAddressEntry(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "CreateUnicastIpAddressEntry", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun DeleteAnycastIpAddressEntry(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "DeleteAnycastIpAddressEntry", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun DeleteIPAddress(ntecontext: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "DeleteIPAddress", longArrayOf(ntecontext.toLong())).toUInt()
}

public fun DeleteIpForwardEntry(proute: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "DeleteIpForwardEntry", longArrayOf(proute)).toUInt()
}

public fun DeleteIpForwardEntry2(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "DeleteIpForwardEntry2", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun DeleteIpNetEntry(parpentry: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "DeleteIpNetEntry", longArrayOf(parpentry)).toUInt()
}

public fun DeleteIpNetEntry2(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "DeleteIpNetEntry2", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun DeletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "DeletePersistentTcpPortReservation", longArrayOf(startport.toLong(), numberofports.toLong())).toUInt()
}

public fun DeletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "DeletePersistentUdpPortReservation", longArrayOf(startport.toLong(), numberofports.toLong())).toUInt()
}

public fun DeleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "DeleteProxyArpEntry", longArrayOf(dwaddress.toLong(), dwmask.toLong(), dwifindex.toLong())).toUInt()
}

public fun DeleteUnicastIpAddressEntry(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "DeleteUnicastIpAddressEntry", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun DisableMediaSense(phandle: Long, poverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "DisableMediaSense", longArrayOf(phandle, poverlapped)).toUInt()
}

public fun EnableRouter(phandle: Long, poverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "EnableRouter", longArrayOf(phandle, poverlapped)).toUInt()
}

public fun FlushIpNetTable(dwifindex: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "FlushIpNetTable", longArrayOf(dwifindex.toLong())).toUInt()
}

public fun FlushIpNetTable2(family: Networking.WinSock.ADDRESS_FAMILY, interfaceindex: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "FlushIpNetTable2", longArrayOf(Win32DynamicFfi.objectSlot(family), interfaceindex.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun FlushIpPathTable(family: Networking.WinSock.ADDRESS_FAMILY): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "FlushIpPathTable", longArrayOf(Win32DynamicFfi.objectSlot(family)))
    return Foundation.WIN32_ERROR()
}

public fun FreeDnsSettings(settings: Long) {
    Win32DynamicFfi.invoke("iphlpapi.dll", "FreeDnsSettings", longArrayOf(settings))
}

public fun FreeInterfaceDnsSettings(settings: Long) {
    Win32DynamicFfi.invoke("iphlpapi.dll", "FreeInterfaceDnsSettings", longArrayOf(settings))
}

public fun FreeMibTable(memory: Long) {
    Win32DynamicFfi.invoke("iphlpapi.dll", "FreeMibTable", longArrayOf(memory))
}

public fun GetAdapterIndex(adaptername: PCWSTR, ifindex: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetAdapterIndex", longArrayOf(adaptername, ifindex)).toUInt()
}

public fun GetAdapterOrderMap(): Long {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetAdapterOrderMap", longArrayOf())
}

public fun GetAdaptersAddresses(family: UInt, flags: GET_ADAPTERS_ADDRESSES_FLAGS, reserved: Long, adapteraddresses: Long, sizepointer: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetAdaptersAddresses", longArrayOf(family.toLong(), flags.toLong(), reserved, adapteraddresses, sizepointer)).toUInt()
}

public fun GetAdaptersInfo(adapterinfo: Long, sizepointer: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetAdaptersInfo", longArrayOf(adapterinfo, sizepointer)).toUInt()
}

public fun GetAnycastIpAddressEntry(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetAnycastIpAddressEntry", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun GetAnycastIpAddressTable(family: Networking.WinSock.ADDRESS_FAMILY, table: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetAnycastIpAddressTable", longArrayOf(Win32DynamicFfi.objectSlot(family), table))
    return Foundation.WIN32_ERROR()
}

public fun GetBestInterface(dwdestaddr: UInt, pdwbestifindex: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetBestInterface", longArrayOf(dwdestaddr.toLong(), pdwbestifindex)).toUInt()
}

public fun GetBestInterfaceEx(pdestaddr: Long, pdwbestifindex: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetBestInterfaceEx", longArrayOf(pdestaddr, pdwbestifindex)).toUInt()
}

public fun GetBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetBestRoute", longArrayOf(dwdestaddr.toLong(), dwsourceaddr.toLong(), pbestroute)).toUInt()
}

public fun GetBestRoute2(interfaceluid: Long, interfaceindex: UInt, sourceaddress: Long, destinationaddress: Long, addresssortoptions: UInt, bestroute: Long, bestsourceaddress: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetBestRoute2", longArrayOf(interfaceluid, interfaceindex.toLong(), sourceaddress, destinationaddress, addresssortoptions.toLong(), bestroute, bestsourceaddress))
    return Foundation.WIN32_ERROR()
}

public fun GetCurrentThreadCompartmentId(): Ndis.NET_IF_COMPARTMENT_ID {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetCurrentThreadCompartmentId", longArrayOf())
    return Ndis.NET_IF_COMPARTMENT_ID()
}

public fun GetCurrentThreadCompartmentScope(compartmentscope: Long, compartmentid: Long) {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetCurrentThreadCompartmentScope", longArrayOf(compartmentscope, compartmentid))
}

public fun GetDefaultCompartmentId(): Ndis.NET_IF_COMPARTMENT_ID {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetDefaultCompartmentId", longArrayOf())
    return Ndis.NET_IF_COMPARTMENT_ID()
}

public fun GetDnsSettings(settings: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetDnsSettings", longArrayOf(settings))
    return Foundation.WIN32_ERROR()
}

public fun GetExtendedTcpTable(ptcptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: TCP_TABLE_CLASS, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetExtendedTcpTable", longArrayOf(ptcptable, pdwsize, border.toLong(), ulaf.toLong(), tableclass.toLong(), reserved.toLong())).toUInt()
}

public fun GetExtendedUdpTable(pudptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: UDP_TABLE_CLASS, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetExtendedUdpTable", longArrayOf(pudptable, pdwsize, border.toLong(), ulaf.toLong(), tableclass.toLong(), reserved.toLong())).toUInt()
}

public fun GetFriendlyIfIndex(ifindex: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetFriendlyIfIndex", longArrayOf(ifindex.toLong())).toUInt()
}

public fun GetIcmpStatistics(statistics: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetIcmpStatistics", longArrayOf(statistics)).toUInt()
}

public fun GetIcmpStatisticsEx(statistics: Long, family: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetIcmpStatisticsEx", longArrayOf(statistics, family.toLong())).toUInt()
}

public fun GetIfEntry(pifrow: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetIfEntry", longArrayOf(pifrow)).toUInt()
}

public fun GetIfEntry2(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIfEntry2", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun GetIfEntry2Ex(level: MIB_IF_ENTRY_LEVEL, row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIfEntry2Ex", longArrayOf(level.toLong(), row))
    return Foundation.WIN32_ERROR()
}

public fun GetIfStackTable(table: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIfStackTable", longArrayOf(table))
    return Foundation.WIN32_ERROR()
}

public fun GetIfTable(piftable: Long, pdwsize: Long, border: BOOL): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetIfTable", longArrayOf(piftable, pdwsize, border.toLong())).toUInt()
}

public fun GetIfTable2(table: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIfTable2", longArrayOf(table))
    return Foundation.WIN32_ERROR()
}

public fun GetIfTable2Ex(level: MIB_IF_TABLE_LEVEL, table: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIfTable2Ex", longArrayOf(level.toLong(), table))
    return Foundation.WIN32_ERROR()
}

public fun GetInterfaceActiveTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetInterfaceActiveTimestampCapabilities", longArrayOf(interfaceluid, timestampcapabilites)).toUInt()
}

public fun GetInterfaceCurrentTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetInterfaceCurrentTimestampCapabilities", longArrayOf(interfaceluid, timestampcapabilites)).toUInt()
}

public fun GetInterfaceDnsSettings(iface: GUID, settings: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetInterfaceDnsSettings", longArrayOf(Win32DynamicFfi.guidSlot(iface.data1, iface.data2, iface.data3, iface.data4), settings))
    return Foundation.WIN32_ERROR()
}

public fun GetInterfaceHardwareTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetInterfaceHardwareTimestampCapabilities", longArrayOf(interfaceluid, timestampcapabilites)).toUInt()
}

public fun GetInterfaceInfo(piftable: Long, dwoutbuflen: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetInterfaceInfo", longArrayOf(piftable, dwoutbuflen)).toUInt()
}

public fun GetInterfaceSupportedTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetInterfaceSupportedTimestampCapabilities", longArrayOf(interfaceluid, timestampcapabilites)).toUInt()
}

public fun GetInvertedIfStackTable(table: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetInvertedIfStackTable", longArrayOf(table))
    return Foundation.WIN32_ERROR()
}

public fun GetIpAddrTable(pipaddrtable: Long, pdwsize: Long, border: BOOL): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpAddrTable", longArrayOf(pipaddrtable, pdwsize, border.toLong())).toUInt()
}

public fun GetIpErrorString(errorcode: UInt, buffer: PWSTR, size: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpErrorString", longArrayOf(errorcode.toLong(), buffer, size)).toUInt()
}

public fun GetIpForwardEntry2(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpForwardEntry2", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun GetIpForwardTable(pipforwardtable: Long, pdwsize: Long, border: BOOL): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpForwardTable", longArrayOf(pipforwardtable, pdwsize, border.toLong())).toUInt()
}

public fun GetIpForwardTable2(family: Networking.WinSock.ADDRESS_FAMILY, table: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpForwardTable2", longArrayOf(Win32DynamicFfi.objectSlot(family), table))
    return Foundation.WIN32_ERROR()
}

public fun GetIpInterfaceEntry(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpInterfaceEntry", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun GetIpInterfaceTable(family: Networking.WinSock.ADDRESS_FAMILY, table: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpInterfaceTable", longArrayOf(Win32DynamicFfi.objectSlot(family), table))
    return Foundation.WIN32_ERROR()
}

public fun GetIpNetEntry2(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpNetEntry2", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun GetIpNetTable(ipnettable: Long, sizepointer: Long, order: BOOL): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpNetTable", longArrayOf(ipnettable, sizepointer, order.toLong())).toUInt()
}

public fun GetIpNetTable2(family: Networking.WinSock.ADDRESS_FAMILY, table: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpNetTable2", longArrayOf(Win32DynamicFfi.objectSlot(family), table))
    return Foundation.WIN32_ERROR()
}

public fun GetIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: Networking.WinSock.ADDRESS_FAMILY, bandwidthestimates: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpNetworkConnectionBandwidthEstimates", longArrayOf(interfaceindex.toLong(), Win32DynamicFfi.objectSlot(addressfamily), bandwidthestimates))
    return Foundation.WIN32_ERROR()
}

public fun GetIpPathEntry(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpPathEntry", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun GetIpPathTable(family: Networking.WinSock.ADDRESS_FAMILY, table: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpPathTable", longArrayOf(Win32DynamicFfi.objectSlot(family), table))
    return Foundation.WIN32_ERROR()
}

public fun GetIpStatistics(statistics: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpStatistics", longArrayOf(statistics)).toUInt()
}

public fun GetIpStatisticsEx(statistics: Long, family: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetIpStatisticsEx", longArrayOf(statistics, family.toLong())).toUInt()
}

public fun GetJobCompartmentId(jobhandle: Foundation.HANDLE): Ndis.NET_IF_COMPARTMENT_ID {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetJobCompartmentId", longArrayOf(Win32DynamicFfi.objectSlot(jobhandle)))
    return Ndis.NET_IF_COMPARTMENT_ID()
}

public fun GetMulticastIpAddressEntry(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetMulticastIpAddressEntry", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun GetMulticastIpAddressTable(family: Networking.WinSock.ADDRESS_FAMILY, table: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetMulticastIpAddressTable", longArrayOf(Win32DynamicFfi.objectSlot(family), table))
    return Foundation.WIN32_ERROR()
}

public fun GetNetworkConnectivityHint(connectivityhint: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetNetworkConnectivityHint", longArrayOf(connectivityhint))
    return Foundation.WIN32_ERROR()
}

public fun GetNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetNetworkConnectivityHintForInterface", longArrayOf(interfaceindex.toLong(), connectivityhint))
    return Foundation.WIN32_ERROR()
}

public fun GetNetworkInformation(networkguid: Long, compartmentid: Long, siteid: Long, networkname: PWSTR, length: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetNetworkInformation", longArrayOf(networkguid, compartmentid, siteid, networkname, length.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun GetNetworkParams(pfixedinfo: Long, poutbuflen: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetNetworkParams", longArrayOf(pfixedinfo, poutbuflen))
    return Foundation.WIN32_ERROR()
}

public fun GetNumberOfInterfaces(pdwnumif: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetNumberOfInterfaces", longArrayOf(pdwnumif)).toUInt()
}

public fun GetOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetOwnerModuleFromPidAndInfo", longArrayOf(ulpid.toLong(), pinfo, cls.toLong(), pbuffer, pdwsize)).toUInt()
}

public fun GetOwnerModuleFromTcp6Entry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetOwnerModuleFromTcp6Entry", longArrayOf(ptcpentry, cls.toLong(), pbuffer, pdwsize)).toUInt()
}

public fun GetOwnerModuleFromTcpEntry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetOwnerModuleFromTcpEntry", longArrayOf(ptcpentry, cls.toLong(), pbuffer, pdwsize)).toUInt()
}

public fun GetOwnerModuleFromUdp6Entry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetOwnerModuleFromUdp6Entry", longArrayOf(pudpentry, cls.toLong(), pbuffer, pdwsize)).toUInt()
}

public fun GetOwnerModuleFromUdpEntry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetOwnerModuleFromUdpEntry", longArrayOf(pudpentry, cls.toLong(), pbuffer, pdwsize)).toUInt()
}

public fun GetPerAdapterInfo(ifindex: UInt, pperadapterinfo: Long, poutbuflen: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetPerAdapterInfo", longArrayOf(ifindex.toLong(), pperadapterinfo, poutbuflen)).toUInt()
}

public fun GetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetPerTcp6ConnectionEStats", longArrayOf(row, estatstype.toLong(), rw, rwversion.toLong(), rwsize.toLong(), ros, rosversion.toLong(), rossize.toLong(), rod, rodversion.toLong(), rodsize.toLong())).toUInt()
}

public fun GetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetPerTcpConnectionEStats", longArrayOf(row, estatstype.toLong(), rw, rwversion.toLong(), rwsize.toLong(), ros, rosversion.toLong(), rossize.toLong(), rod, rodversion.toLong(), rodsize.toLong())).toUInt()
}

public fun GetRTTAndHopCount(destipaddress: UInt, hopcount: Long, maxhops: UInt, rtt: Long): BOOL {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetRTTAndHopCount", longArrayOf(destipaddress.toLong(), hopcount, maxhops.toLong(), rtt)).toInt()
}

public fun GetSessionCompartmentId(sessionid: UInt): Ndis.NET_IF_COMPARTMENT_ID {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetSessionCompartmentId", longArrayOf(sessionid.toLong()))
    return Ndis.NET_IF_COMPARTMENT_ID()
}

public fun GetTcp6Table(tcptable: Long, sizepointer: Long, order: BOOL): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetTcp6Table", longArrayOf(tcptable, sizepointer, order.toLong())).toUInt()
}

public fun GetTcp6Table2(tcptable: Long, sizepointer: Long, order: BOOL): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetTcp6Table2", longArrayOf(tcptable, sizepointer, order.toLong())).toUInt()
}

public fun GetTcpStatistics(statistics: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetTcpStatistics", longArrayOf(statistics)).toUInt()
}

public fun GetTcpStatisticsEx(statistics: Long, family: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetTcpStatisticsEx", longArrayOf(statistics, family.toLong())).toUInt()
}

public fun GetTcpStatisticsEx2(statistics: Long, family: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetTcpStatisticsEx2", longArrayOf(statistics, family.toLong())).toUInt()
}

public fun GetTcpTable(tcptable: Long, sizepointer: Long, order: BOOL): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetTcpTable", longArrayOf(tcptable, sizepointer, order.toLong())).toUInt()
}

public fun GetTcpTable2(tcptable: Long, sizepointer: Long, order: BOOL): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetTcpTable2", longArrayOf(tcptable, sizepointer, order.toLong())).toUInt()
}

public fun GetTeredoPort(port: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetTeredoPort", longArrayOf(port))
    return Foundation.WIN32_ERROR()
}

public fun GetUdp6Table(udp6table: Long, sizepointer: Long, order: BOOL): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetUdp6Table", longArrayOf(udp6table, sizepointer, order.toLong())).toUInt()
}

public fun GetUdpStatistics(stats: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetUdpStatistics", longArrayOf(stats)).toUInt()
}

public fun GetUdpStatisticsEx(statistics: Long, family: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetUdpStatisticsEx", longArrayOf(statistics, family.toLong())).toUInt()
}

public fun GetUdpStatisticsEx2(statistics: Long, family: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetUdpStatisticsEx2", longArrayOf(statistics, family.toLong())).toUInt()
}

public fun GetUdpTable(udptable: Long, sizepointer: Long, order: BOOL): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetUdpTable", longArrayOf(udptable, sizepointer, order.toLong())).toUInt()
}

public fun GetUniDirectionalAdapterInfo(pipifinfo: Long, dwoutbuflen: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "GetUniDirectionalAdapterInfo", longArrayOf(pipifinfo, dwoutbuflen)).toUInt()
}

public fun GetUnicastIpAddressEntry(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetUnicastIpAddressEntry", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun GetUnicastIpAddressTable(family: Networking.WinSock.ADDRESS_FAMILY, table: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "GetUnicastIpAddressTable", longArrayOf(Win32DynamicFfi.objectSlot(family), table))
    return Foundation.WIN32_ERROR()
}

public fun Icmp6CreateFile(): Foundation.HANDLE {
    Win32DynamicFfi.invoke("iphlpapi.dll", "Icmp6CreateFile", longArrayOf())
    return Foundation.HANDLE()
}

public fun Icmp6ParseReplies(replybuffer: Long, replysize: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "Icmp6ParseReplies", longArrayOf(replybuffer, replysize.toLong())).toUInt()
}

public fun Icmp6SendEcho2(icmphandle: Foundation.HANDLE, event: Foundation.HANDLE, apcroutine: System.IO.PIO_APC_ROUTINE, apccontext: Long, sourceaddress: Long, destinationaddress: Long, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "Icmp6SendEcho2", longArrayOf(Win32DynamicFfi.objectSlot(icmphandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, sourceaddress, destinationaddress, requestdata, requestsize.toLong(), requestoptions, replybuffer, replysize.toLong(), timeout.toLong())).toUInt()
}

public fun IcmpCloseHandle(icmphandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "IcmpCloseHandle", longArrayOf(Win32DynamicFfi.objectSlot(icmphandle))).toInt()
}

public fun IcmpCreateFile(): Foundation.HANDLE {
    Win32DynamicFfi.invoke("iphlpapi.dll", "IcmpCreateFile", longArrayOf())
    return Foundation.HANDLE()
}

public fun IcmpParseReplies(replybuffer: Long, replysize: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "IcmpParseReplies", longArrayOf(replybuffer, replysize.toLong())).toUInt()
}

public fun IcmpSendEcho(icmphandle: Foundation.HANDLE, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "IcmpSendEcho", longArrayOf(Win32DynamicFfi.objectSlot(icmphandle), destinationaddress.toLong(), requestdata, requestsize.toLong(), requestoptions, replybuffer, replysize.toLong(), timeout.toLong())).toUInt()
}

public fun IcmpSendEcho2(icmphandle: Foundation.HANDLE, event: Foundation.HANDLE, apcroutine: System.IO.PIO_APC_ROUTINE, apccontext: Long, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "IcmpSendEcho2", longArrayOf(Win32DynamicFfi.objectSlot(icmphandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, destinationaddress.toLong(), requestdata, requestsize.toLong(), requestoptions, replybuffer, replysize.toLong(), timeout.toLong())).toUInt()
}

public fun IcmpSendEcho2Ex(icmphandle: Foundation.HANDLE, event: Foundation.HANDLE, apcroutine: System.IO.PIO_APC_ROUTINE, apccontext: Long, sourceaddress: UInt, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "IcmpSendEcho2Ex", longArrayOf(Win32DynamicFfi.objectSlot(icmphandle), Win32DynamicFfi.objectSlot(event), Win32DynamicFfi.objectSlot(apcroutine), apccontext, sourceaddress.toLong(), destinationaddress.toLong(), requestdata, requestsize.toLong(), requestoptions, replybuffer, replysize.toLong(), timeout.toLong())).toUInt()
}

public fun InitializeIpForwardEntry(row: Long) {
    Win32DynamicFfi.invoke("iphlpapi.dll", "InitializeIpForwardEntry", longArrayOf(row))
}

public fun InitializeIpInterfaceEntry(row: Long) {
    Win32DynamicFfi.invoke("iphlpapi.dll", "InitializeIpInterfaceEntry", longArrayOf(row))
}

public fun InitializeUnicastIpAddressEntry(row: Long) {
    Win32DynamicFfi.invoke("iphlpapi.dll", "InitializeUnicastIpAddressEntry", longArrayOf(row))
}

public fun IpReleaseAddress(adapterinfo: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "IpReleaseAddress", longArrayOf(adapterinfo)).toUInt()
}

public fun IpRenewAddress(adapterinfo: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "IpRenewAddress", longArrayOf(adapterinfo)).toUInt()
}

public fun LookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "LookupPersistentTcpPortReservation", longArrayOf(startport.toLong(), numberofports.toLong(), token)).toUInt()
}

public fun LookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "LookupPersistentUdpPortReservation", longArrayOf(startport.toLong(), numberofports.toLong(), token)).toUInt()
}

public fun NhpAllocateAndGetInterfaceInfoFromStack(pptable: Long, pdwcount: Long, border: BOOL, hheap: Foundation.HANDLE, dwflags: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "NhpAllocateAndGetInterfaceInfoFromStack", longArrayOf(pptable, pdwcount, border.toLong(), Win32DynamicFfi.objectSlot(hheap), dwflags.toLong())).toUInt()
}

public fun NotifyAddrChange(handle: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "NotifyAddrChange", longArrayOf(handle, overlapped)).toUInt()
}

public fun NotifyIfTimestampConfigChange(callercontext: Long, callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, notificationhandle: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "NotifyIfTimestampConfigChange", longArrayOf(callercontext, Win32DynamicFfi.objectSlot(callback), notificationhandle)).toUInt()
}

public fun NotifyIpInterfaceChange(family: Networking.WinSock.ADDRESS_FAMILY, callback: PIPINTERFACE_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "NotifyIpInterfaceChange", longArrayOf(Win32DynamicFfi.objectSlot(family), Win32DynamicFfi.objectSlot(callback), callercontext, if (initialnotification) 1L else 0L, notificationhandle))
    return Foundation.WIN32_ERROR()
}

public fun NotifyNetworkConnectivityHintChange(callback: PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "NotifyNetworkConnectivityHintChange", longArrayOf(Win32DynamicFfi.objectSlot(callback), callercontext, if (initialnotification) 1L else 0L, notificationhandle))
    return Foundation.WIN32_ERROR()
}

public fun NotifyRouteChange(handle: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "NotifyRouteChange", longArrayOf(handle, overlapped)).toUInt()
}

public fun NotifyRouteChange2(addressfamily: Networking.WinSock.ADDRESS_FAMILY, callback: PIPFORWARD_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "NotifyRouteChange2", longArrayOf(Win32DynamicFfi.objectSlot(addressfamily), Win32DynamicFfi.objectSlot(callback), callercontext, if (initialnotification) 1L else 0L, notificationhandle))
    return Foundation.WIN32_ERROR()
}

public fun NotifyStableUnicastIpAddressTable(family: Networking.WinSock.ADDRESS_FAMILY, table: Long, callercallback: PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACK, callercontext: Long, notificationhandle: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "NotifyStableUnicastIpAddressTable", longArrayOf(Win32DynamicFfi.objectSlot(family), table, Win32DynamicFfi.objectSlot(callercallback), callercontext, notificationhandle))
    return Foundation.WIN32_ERROR()
}

public fun NotifyTeredoPortChange(callback: PTEREDO_PORT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "NotifyTeredoPortChange", longArrayOf(Win32DynamicFfi.objectSlot(callback), callercontext, if (initialnotification) 1L else 0L, notificationhandle))
    return Foundation.WIN32_ERROR()
}

public fun NotifyUnicastIpAddressChange(family: Networking.WinSock.ADDRESS_FAMILY, callback: PUNICAST_IPADDRESS_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "NotifyUnicastIpAddressChange", longArrayOf(Win32DynamicFfi.objectSlot(family), Win32DynamicFfi.objectSlot(callback), callercontext, if (initialnotification) 1L else 0L, notificationhandle))
    return Foundation.WIN32_ERROR()
}

public fun ParseNetworkString(networkstring: PCWSTR, types: UInt, addressinfo: Long, portnumber: Long, prefixlength: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "ParseNetworkString", longArrayOf(networkstring, types.toLong(), addressinfo, portnumber, prefixlength)).toUInt()
}

public fun PfAddFiltersToInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long, pfhandle: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfAddFiltersToInterface", longArrayOf(ih, cinfilters.toLong(), pfiltin, coutfilters.toLong(), pfiltout, pfhandle)).toUInt()
}

public fun PfAddGlobalFilterToInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfAddGlobalFilterToInterface", longArrayOf(pinterface, gffilter.toLong())).toUInt()
}

public fun PfBindInterfaceToIPAddress(pinterface: Long, pfattype: PFADDRESSTYPE, ipaddress: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfBindInterfaceToIPAddress", longArrayOf(pinterface, pfattype.toLong(), ipaddress)).toUInt()
}

public fun PfBindInterfaceToIndex(pinterface: Long, dwindex: UInt, pfatlinktype: PFADDRESSTYPE, linkipaddress: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfBindInterfaceToIndex", longArrayOf(pinterface, dwindex.toLong(), pfatlinktype.toLong(), linkipaddress)).toUInt()
}

public fun PfCreateInterface(dwname: UInt, inaction: PFFORWARD_ACTION, outaction: PFFORWARD_ACTION, buselog: BOOL, bmustbeunique: BOOL, ppinterface: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfCreateInterface", longArrayOf(dwname.toLong(), inaction.toLong(), outaction.toLong(), buselog.toLong(), bmustbeunique.toLong(), ppinterface)).toUInt()
}

public fun PfDeleteInterface(pinterface: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfDeleteInterface", longArrayOf(pinterface)).toUInt()
}

public fun PfDeleteLog(): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfDeleteLog", longArrayOf()).toUInt()
}

public fun PfGetInterfaceStatistics(pinterface: Long, ppfstats: Long, pdwbuffersize: Long, fresetcounters: BOOL): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfGetInterfaceStatistics", longArrayOf(pinterface, ppfstats, pdwbuffersize, fresetcounters.toLong())).toUInt()
}

public fun PfMakeLog(hevent: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfMakeLog", longArrayOf(Win32DynamicFfi.objectSlot(hevent))).toUInt()
}

public fun PfRebindFilters(pinterface: Long, platebindinfo: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfRebindFilters", longArrayOf(pinterface, platebindinfo)).toUInt()
}

public fun PfRemoveFilterHandles(pinterface: Long, cfilters: UInt, pvhandles: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfRemoveFilterHandles", longArrayOf(pinterface, cfilters.toLong(), pvhandles)).toUInt()
}

public fun PfRemoveFiltersFromInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfRemoveFiltersFromInterface", longArrayOf(ih, cinfilters.toLong(), pfiltin, coutfilters.toLong(), pfiltout)).toUInt()
}

public fun PfRemoveGlobalFilterFromInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfRemoveGlobalFilterFromInterface", longArrayOf(pinterface, gffilter.toLong())).toUInt()
}

public fun PfSetLogBuffer(pbbuffer: Long, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: Long, pdwlostentries: Long, pdwsizeused: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfSetLogBuffer", longArrayOf(pbbuffer, dwsize.toLong(), dwthreshold.toLong(), dwentries.toLong(), pdwloggedentries, pdwlostentries, pdwsizeused)).toUInt()
}

public fun PfTestPacket(pininterface: Long, poutinterface: Long, cbytes: UInt, pbpacket: Long, ppaction: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfTestPacket", longArrayOf(pininterface, poutinterface, cbytes.toLong(), pbpacket, ppaction)).toUInt()
}

public fun PfUnBindInterface(pinterface: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "PfUnBindInterface", longArrayOf(pinterface)).toUInt()
}

public fun RegisterInterfaceTimestampConfigChange(callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, callercontext: Long, notificationhandle: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "RegisterInterfaceTimestampConfigChange", longArrayOf(Win32DynamicFfi.objectSlot(callback), callercontext, notificationhandle)).toUInt()
}

public fun ResolveIpNetEntry2(row: Long, sourceaddress: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "ResolveIpNetEntry2", longArrayOf(row, sourceaddress))
    return Foundation.WIN32_ERROR()
}

public fun ResolveNeighbor(networkaddress: Long, physicaladdress: Long, physicaladdresslength: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "ResolveNeighbor", longArrayOf(networkaddress, physicaladdress, physicaladdresslength)).toUInt()
}

public fun RestoreMediaSense(poverlapped: Long, lpdwenablecount: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "RestoreMediaSense", longArrayOf(poverlapped, lpdwenablecount)).toUInt()
}

public fun SendARP(destip: UInt, srcip: UInt, pmacaddr: Long, phyaddrlen: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "SendARP", longArrayOf(destip.toLong(), srcip.toLong(), pmacaddr, phyaddrlen)).toUInt()
}

public fun SetCurrentThreadCompartmentId(compartmentid: Ndis.NET_IF_COMPARTMENT_ID): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "SetCurrentThreadCompartmentId", longArrayOf(Win32DynamicFfi.objectSlot(compartmentid)))
    return Foundation.WIN32_ERROR()
}

public fun SetCurrentThreadCompartmentScope(compartmentscope: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "SetCurrentThreadCompartmentScope", longArrayOf(compartmentscope.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun SetDnsSettings(settings: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "SetDnsSettings", longArrayOf(settings))
    return Foundation.WIN32_ERROR()
}

public fun SetIfEntry(pifrow: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "SetIfEntry", longArrayOf(pifrow)).toUInt()
}

public fun SetInterfaceDnsSettings(iface: GUID, settings: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "SetInterfaceDnsSettings", longArrayOf(Win32DynamicFfi.guidSlot(iface.data1, iface.data2, iface.data3, iface.data4), settings))
    return Foundation.WIN32_ERROR()
}

public fun SetIpForwardEntry(proute: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "SetIpForwardEntry", longArrayOf(proute)).toUInt()
}

public fun SetIpForwardEntry2(route: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "SetIpForwardEntry2", longArrayOf(route))
    return Foundation.WIN32_ERROR()
}

public fun SetIpInterfaceEntry(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "SetIpInterfaceEntry", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun SetIpNetEntry(parpentry: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "SetIpNetEntry", longArrayOf(parpentry)).toUInt()
}

public fun SetIpNetEntry2(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "SetIpNetEntry2", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun SetIpStatistics(pipstats: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "SetIpStatistics", longArrayOf(pipstats)).toUInt()
}

public fun SetIpStatisticsEx(statistics: Long, family: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "SetIpStatisticsEx", longArrayOf(statistics, family.toLong())).toUInt()
}

public fun SetIpTTL(nttl: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "SetIpTTL", longArrayOf(nttl.toLong())).toUInt()
}

public fun SetJobCompartmentId(jobhandle: Foundation.HANDLE, compartmentid: Ndis.NET_IF_COMPARTMENT_ID): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "SetJobCompartmentId", longArrayOf(Win32DynamicFfi.objectSlot(jobhandle), Win32DynamicFfi.objectSlot(compartmentid)))
    return Foundation.WIN32_ERROR()
}

public fun SetNetworkInformation(networkguid: Long, compartmentid: Ndis.NET_IF_COMPARTMENT_ID, networkname: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "SetNetworkInformation", longArrayOf(networkguid, Win32DynamicFfi.objectSlot(compartmentid), networkname))
    return Foundation.WIN32_ERROR()
}

public fun SetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "SetPerTcp6ConnectionEStats", longArrayOf(row, estatstype.toLong(), rw, rwversion.toLong(), rwsize.toLong(), offset.toLong())).toUInt()
}

public fun SetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "SetPerTcpConnectionEStats", longArrayOf(row, estatstype.toLong(), rw, rwversion.toLong(), rwsize.toLong(), offset.toLong())).toUInt()
}

public fun SetSessionCompartmentId(sessionid: UInt, compartmentid: Ndis.NET_IF_COMPARTMENT_ID): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "SetSessionCompartmentId", longArrayOf(sessionid.toLong(), Win32DynamicFfi.objectSlot(compartmentid)))
    return Foundation.WIN32_ERROR()
}

public fun SetTcpEntry(ptcprow: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "SetTcpEntry", longArrayOf(ptcprow)).toUInt()
}

public fun SetUnicastIpAddressEntry(row: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("iphlpapi.dll", "SetUnicastIpAddressEntry", longArrayOf(row))
    return Foundation.WIN32_ERROR()
}

public fun UnenableRouter(poverlapped: Long, lpdwenablecount: Long): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "UnenableRouter", longArrayOf(poverlapped, lpdwenablecount)).toUInt()
}

public fun UnregisterInterfaceTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE) {
    Win32DynamicFfi.invoke("iphlpapi.dll", "UnregisterInterfaceTimestampConfigChange", longArrayOf(notificationhandle))
}

public fun if_indextoname(interfaceindex: UInt, interfacename: PSTR): PSTR {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "if_indextoname", longArrayOf(interfaceindex.toLong(), interfacename))
}

public fun if_nametoindex(interfacename: PCSTR): UInt {
    return Win32DynamicFfi.invoke("iphlpapi.dll", "if_nametoindex", longArrayOf(interfacename)).toUInt()
}
