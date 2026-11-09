@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AddIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: Long, nteinstance: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_AddIPAddress(address, ipmask, ifindex, ntecontext.toCPointer<ByteVar>(), nteinstance.toCPointer<ByteVar>())

public actual fun CancelIPChangeNotify(notifyoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CancelIPChangeNotify(notifyoverlapped.toCPointer<ByteVar>())

public actual fun CancelIfTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CancelIfTimestampConfigChange(notificationhandle.toCPointer<ByteVar>())
}

public actual fun CancelMibChangeNotify2(notificationhandle: HANDLE): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CancelMibChangeNotify2(notificationhandle.toCPointer<ByteVar>())

public actual fun CaptureInterfaceHardwareCrossTimestamp(interfaceluid: Long, crosstimestamp: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CaptureInterfaceHardwareCrossTimestamp(interfaceluid.toCPointer<ByteVar>(), crosstimestamp.toCPointer<ByteVar>())

public actual fun ConvertCompartmentGuidToId(compartmentguid: Long, compartmentid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentGuidToId(compartmentguid.toCPointer<ByteVar>(), compartmentid.toCPointer<ByteVar>())

public actual fun ConvertCompartmentIdToGuid(compartmentid: NET_IF_COMPARTMENT_ID, compartmentguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentIdToGuid(compartmentid, compartmentguid.toCPointer<ByteVar>())

public actual fun ConvertInterfaceAliasToLuid(interfacealias: PCWSTR, interfaceluid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceAliasToLuid(interfacealias.toCPointer<ByteVar>(), interfaceluid.toCPointer<ByteVar>())

public actual fun ConvertInterfaceGuidToLuid(interfaceguid: Long, interfaceluid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceGuidToLuid(interfaceguid.toCPointer<ByteVar>(), interfaceluid.toCPointer<ByteVar>())

public actual fun ConvertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceIndexToLuid(interfaceindex, interfaceluid.toCPointer<ByteVar>())

public actual fun ConvertInterfaceLuidToAlias(interfaceluid: Long, interfacealias: PWSTR, length: ULong): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToAlias(interfaceluid.toCPointer<ByteVar>(), interfacealias.toCPointer<ByteVar>(), length)

public actual fun ConvertInterfaceLuidToGuid(interfaceluid: Long, interfaceguid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToGuid(interfaceluid.toCPointer<ByteVar>(), interfaceguid.toCPointer<ByteVar>())

public actual fun ConvertInterfaceLuidToIndex(interfaceluid: Long, interfaceindex: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToIndex(interfaceluid.toCPointer<ByteVar>(), interfaceindex.toCPointer<ByteVar>())

public actual fun ConvertInterfaceLuidToNameA(interfaceluid: Long, interfacename: PSTR, length: ULong): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameA(interfaceluid.toCPointer<ByteVar>(), interfacename.toCPointer<ByteVar>(), length)

public actual fun ConvertInterfaceLuidToNameW(interfaceluid: Long, interfacename: PWSTR, length: ULong): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameW(interfaceluid.toCPointer<ByteVar>(), interfacename.toCPointer<ByteVar>(), length)

public actual fun ConvertInterfaceNameToLuidA(interfacename: PCSTR, interfaceluid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidA(interfacename.toCPointer<ByteVar>(), interfaceluid.toCPointer<ByteVar>())

public actual fun ConvertInterfaceNameToLuidW(interfacename: PCWSTR, interfaceluid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidW(interfacename.toCPointer<ByteVar>(), interfaceluid.toCPointer<ByteVar>())

public actual fun ConvertIpv4MaskToLength(mask: UInt, masklength: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertIpv4MaskToLength(mask, masklength.toCPointer<ByteVar>())

public actual fun ConvertLengthToIpv4Mask(masklength: UInt, mask: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ConvertLengthToIpv4Mask(masklength, mask.toCPointer<ByteVar>())

public actual fun CreateAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CreateAnycastIpAddressEntry(row.toCPointer<ByteVar>())

public actual fun CreateIpForwardEntry(proute: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry(proute.toCPointer<ByteVar>())

public actual fun CreateIpForwardEntry2(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry2(row.toCPointer<ByteVar>())

public actual fun CreateIpNetEntry(parpentry: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry(parpentry.toCPointer<ByteVar>())

public actual fun CreateIpNetEntry2(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry2(row.toCPointer<ByteVar>())

public actual fun CreatePersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentTcpPortReservation(startport, numberofports, token.toCPointer<ByteVar>())

public actual fun CreatePersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentUdpPortReservation(startport, numberofports, token.toCPointer<ByteVar>())

public actual fun CreateProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CreateProxyArpEntry(dwaddress, dwmask, dwifindex)

public actual fun CreateSortedAddressPairs(sourceaddresslist: Long, sourceaddresscount: UInt, destinationaddresslist: Long, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: Long, sortedaddresspaircount: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CreateSortedAddressPairs(sourceaddresslist.toCPointer<ByteVar>(), sourceaddresscount, destinationaddresslist.toCPointer<ByteVar>(), destinationaddresscount, addresssortoptions, sortedaddresspairlist.toCPointer<ByteVar>(), sortedaddresspaircount.toCPointer<ByteVar>())

public actual fun CreateUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_CreateUnicastIpAddressEntry(row.toCPointer<ByteVar>())

public actual fun DeleteAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_DeleteAnycastIpAddressEntry(row.toCPointer<ByteVar>())

public actual fun DeleteIPAddress(ntecontext: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_DeleteIPAddress(ntecontext)

public actual fun DeleteIpForwardEntry(proute: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry(proute.toCPointer<ByteVar>())

public actual fun DeleteIpForwardEntry2(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry2(row.toCPointer<ByteVar>())

public actual fun DeleteIpNetEntry(parpentry: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry(parpentry.toCPointer<ByteVar>())

public actual fun DeleteIpNetEntry2(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry2(row.toCPointer<ByteVar>())

public actual fun DeletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentTcpPortReservation(startport, numberofports)

public actual fun DeletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentUdpPortReservation(startport, numberofports)

public actual fun DeleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_DeleteProxyArpEntry(dwaddress, dwmask, dwifindex)

public actual fun DeleteUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_DeleteUnicastIpAddressEntry(row.toCPointer<ByteVar>())

public actual fun DisableMediaSense(phandle: Long, poverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_DisableMediaSense(phandle.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun EnableRouter(phandle: Long, poverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_EnableRouter(phandle.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun FlushIpNetTable(dwifindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable(dwifindex)

public actual fun FlushIpNetTable2(family: ADDRESS_FAMILY, interfaceindex: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable2(family, interfaceindex)

public actual fun FlushIpPathTable(family: ADDRESS_FAMILY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_FlushIpPathTable(family)

public actual fun FreeDnsSettings(settings: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_FreeDnsSettings(settings.toCPointer<ByteVar>())
}

public actual fun FreeInterfaceDnsSettings(settings: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_FreeInterfaceDnsSettings(settings.toCPointer<ByteVar>())
}

public actual fun FreeMibTable(memory: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_FreeMibTable(memory.toCPointer<ByteVar>())
}

public actual fun GetAdapterIndex(adaptername: PCWSTR, ifindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetAdapterIndex(adaptername.toCPointer<ByteVar>(), ifindex.toCPointer<ByteVar>())

public actual fun GetAdapterOrderMap(): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetAdapterOrderMap()?.toLong() ?: 0L

public actual fun GetAdaptersAddresses(family: UInt, flags: GET_ADAPTERS_ADDRESSES_FLAGS, reserved: Long, adapteraddresses: Long, sizepointer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersAddresses(family, flags, reserved.toCPointer<ByteVar>(), adapteraddresses.toCPointer<ByteVar>(), sizepointer.toCPointer<ByteVar>())

public actual fun GetAdaptersInfo(adapterinfo: Long, sizepointer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersInfo(adapterinfo.toCPointer<ByteVar>(), sizepointer.toCPointer<ByteVar>())

public actual fun GetAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressEntry(row.toCPointer<ByteVar>())

public actual fun GetAnycastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressTable(family, table.toCPointer<ByteVar>())

public actual fun GetBestInterface(dwdestaddr: UInt, pdwbestifindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetBestInterface(dwdestaddr, pdwbestifindex.toCPointer<ByteVar>())

public actual fun GetBestInterfaceEx(pdestaddr: Long, pdwbestifindex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetBestInterfaceEx(pdestaddr.toCPointer<ByteVar>(), pdwbestifindex.toCPointer<ByteVar>())

public actual fun GetBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute(dwdestaddr, dwsourceaddr, pbestroute.toCPointer<ByteVar>())

public actual fun GetBestRoute2(interfaceluid: Long, interfaceindex: UInt, sourceaddress: Long, destinationaddress: Long, addresssortoptions: UInt, bestroute: Long, bestsourceaddress: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute2(interfaceluid.toCPointer<ByteVar>(), interfaceindex, sourceaddress.toCPointer<ByteVar>(), destinationaddress.toCPointer<ByteVar>(), addresssortoptions, bestroute.toCPointer<ByteVar>(), bestsourceaddress.toCPointer<ByteVar>())

public actual fun GetCurrentThreadCompartmentId(): NET_IF_COMPARTMENT_ID =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentId()

public actual fun GetCurrentThreadCompartmentScope(compartmentscope: Long, compartmentid: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentScope(compartmentscope.toCPointer<ByteVar>(), compartmentid.toCPointer<ByteVar>())
}

public actual fun GetDefaultCompartmentId(): NET_IF_COMPARTMENT_ID =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetDefaultCompartmentId()

public actual fun GetDnsSettings(settings: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetDnsSettings(settings.toCPointer<ByteVar>())

public actual fun GetExtendedTcpTable(ptcptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: TCP_TABLE_CLASS, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetExtendedTcpTable(ptcptable.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>(), border, ulaf, tableclass, reserved)

public actual fun GetExtendedUdpTable(pudptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: UDP_TABLE_CLASS, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetExtendedUdpTable(pudptable.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>(), border, ulaf, tableclass, reserved)

public actual fun GetFriendlyIfIndex(ifindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetFriendlyIfIndex(ifindex)

public actual fun GetIcmpStatistics(statistics: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatistics(statistics.toCPointer<ByteVar>())

public actual fun GetIcmpStatisticsEx(statistics: Long, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatisticsEx(statistics.toCPointer<ByteVar>(), family)

public actual fun GetIfEntry(pifrow: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry(pifrow.toCPointer<ByteVar>())

public actual fun GetIfEntry2(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2(row.toCPointer<ByteVar>())

public actual fun GetIfEntry2Ex(level: MIB_IF_ENTRY_LEVEL, row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2Ex(level, row.toCPointer<ByteVar>())

public actual fun GetIfStackTable(table: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIfStackTable(table.toCPointer<ByteVar>())

public actual fun GetIfTable(piftable: Long, pdwsize: Long, border: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIfTable(piftable.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>(), border)

public actual fun GetIfTable2(table: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2(table.toCPointer<ByteVar>())

public actual fun GetIfTable2Ex(level: MIB_IF_TABLE_LEVEL, table: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2Ex(level, table.toCPointer<ByteVar>())

public actual fun GetInterfaceActiveTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceActiveTimestampCapabilities(interfaceluid.toCPointer<ByteVar>(), timestampcapabilites.toCPointer<ByteVar>())

public actual fun GetInterfaceCurrentTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceCurrentTimestampCapabilities(interfaceluid.toCPointer<ByteVar>(), timestampcapabilites.toCPointer<ByteVar>())

public actual fun GetInterfaceDnsSettings(iface: GUID, settings: Long): WIN32_ERROR =
    0u

public actual fun GetInterfaceHardwareTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceHardwareTimestampCapabilities(interfaceluid.toCPointer<ByteVar>(), timestampcapabilites.toCPointer<ByteVar>())

public actual fun GetInterfaceInfo(piftable: Long, dwoutbuflen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceInfo(piftable.toCPointer<ByteVar>(), dwoutbuflen.toCPointer<ByteVar>())

public actual fun GetInterfaceSupportedTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceSupportedTimestampCapabilities(interfaceluid.toCPointer<ByteVar>(), timestampcapabilites.toCPointer<ByteVar>())

public actual fun GetInvertedIfStackTable(table: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetInvertedIfStackTable(table.toCPointer<ByteVar>())

public actual fun GetIpAddrTable(pipaddrtable: Long, pdwsize: Long, border: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpAddrTable(pipaddrtable.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>(), border)

public actual fun GetIpErrorString(errorcode: UInt, buffer: PWSTR, size: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpErrorString(errorcode, buffer.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun GetIpForwardEntry2(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardEntry2(row.toCPointer<ByteVar>())

public actual fun GetIpForwardTable(pipforwardtable: Long, pdwsize: Long, border: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable(pipforwardtable.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>(), border)

public actual fun GetIpForwardTable2(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable2(family, table.toCPointer<ByteVar>())

public actual fun GetIpInterfaceEntry(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceEntry(row.toCPointer<ByteVar>())

public actual fun GetIpInterfaceTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceTable(family, table.toCPointer<ByteVar>())

public actual fun GetIpNetEntry2(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetEntry2(row.toCPointer<ByteVar>())

public actual fun GetIpNetTable(ipnettable: Long, sizepointer: Long, order: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable(ipnettable.toCPointer<ByteVar>(), sizepointer.toCPointer<ByteVar>(), order)

public actual fun GetIpNetTable2(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable2(family, table.toCPointer<ByteVar>())

public actual fun GetIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: ADDRESS_FAMILY, bandwidthestimates: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetworkConnectionBandwidthEstimates(interfaceindex, addressfamily, bandwidthestimates.toCPointer<ByteVar>())

public actual fun GetIpPathEntry(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpPathEntry(row.toCPointer<ByteVar>())

public actual fun GetIpPathTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpPathTable(family, table.toCPointer<ByteVar>())

public actual fun GetIpStatistics(statistics: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpStatistics(statistics.toCPointer<ByteVar>())

public actual fun GetIpStatisticsEx(statistics: Long, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetIpStatisticsEx(statistics.toCPointer<ByteVar>(), family)

public actual fun GetJobCompartmentId(jobhandle: HANDLE): NET_IF_COMPARTMENT_ID =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetJobCompartmentId(jobhandle.toCPointer<ByteVar>())

public actual fun GetMulticastIpAddressEntry(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressEntry(row.toCPointer<ByteVar>())

public actual fun GetMulticastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressTable(family, table.toCPointer<ByteVar>())

public actual fun GetNetworkConnectivityHint(connectivityhint: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHint(connectivityhint.toCPointer<ByteVar>())

public actual fun GetNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHintForInterface(interfaceindex, connectivityhint.toCPointer<ByteVar>())

public actual fun GetNetworkInformation(networkguid: Long, compartmentid: Long, siteid: Long, networkname: PWSTR, length: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkInformation(networkguid.toCPointer<ByteVar>(), compartmentid.toCPointer<ByteVar>(), siteid.toCPointer<ByteVar>(), networkname.toCPointer<ByteVar>(), length)

public actual fun GetNetworkParams(pfixedinfo: Long, poutbuflen: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkParams(pfixedinfo.toCPointer<ByteVar>(), poutbuflen.toCPointer<ByteVar>())

public actual fun GetNumberOfInterfaces(pdwnumif: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetNumberOfInterfaces(pdwnumif.toCPointer<ByteVar>())

public actual fun GetOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromPidAndInfo(ulpid, pinfo.toCPointer<ByteVar>(), cls, pbuffer.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>())

public actual fun GetOwnerModuleFromTcp6Entry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcp6Entry(ptcpentry.toCPointer<ByteVar>(), cls, pbuffer.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>())

public actual fun GetOwnerModuleFromTcpEntry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcpEntry(ptcpentry.toCPointer<ByteVar>(), cls, pbuffer.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>())

public actual fun GetOwnerModuleFromUdp6Entry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdp6Entry(pudpentry.toCPointer<ByteVar>(), cls, pbuffer.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>())

public actual fun GetOwnerModuleFromUdpEntry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdpEntry(pudpentry.toCPointer<ByteVar>(), cls, pbuffer.toCPointer<ByteVar>(), pdwsize.toCPointer<ByteVar>())

public actual fun GetPerAdapterInfo(ifindex: UInt, pperadapterinfo: Long, poutbuflen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetPerAdapterInfo(ifindex, pperadapterinfo.toCPointer<ByteVar>(), poutbuflen.toCPointer<ByteVar>())

public actual fun GetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetPerTcp6ConnectionEStats(row.toCPointer<ByteVar>(), estatstype, rw.toCPointer<ByteVar>(), rwversion, rwsize, ros.toCPointer<ByteVar>(), rosversion, rossize, rod.toCPointer<ByteVar>(), rodversion, rodsize)

public actual fun GetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetPerTcpConnectionEStats(row.toCPointer<ByteVar>(), estatstype, rw.toCPointer<ByteVar>(), rwversion, rwsize, ros.toCPointer<ByteVar>(), rosversion, rossize, rod.toCPointer<ByteVar>(), rodversion, rodsize)

public actual fun GetRTTAndHopCount(destipaddress: UInt, hopcount: Long, maxhops: UInt, rtt: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetRTTAndHopCount(destipaddress, hopcount.toCPointer<ByteVar>(), maxhops, rtt.toCPointer<ByteVar>())

public actual fun GetSessionCompartmentId(sessionid: UInt): NET_IF_COMPARTMENT_ID =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetSessionCompartmentId(sessionid)

public actual fun GetTcp6Table(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table(tcptable.toCPointer<ByteVar>(), sizepointer.toCPointer<ByteVar>(), order)

public actual fun GetTcp6Table2(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table2(tcptable.toCPointer<ByteVar>(), sizepointer.toCPointer<ByteVar>(), order)

public actual fun GetTcpStatistics(statistics: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatistics(statistics.toCPointer<ByteVar>())

public actual fun GetTcpStatisticsEx(statistics: Long, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx(statistics.toCPointer<ByteVar>(), family)

public actual fun GetTcpStatisticsEx2(statistics: Long, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx2(statistics.toCPointer<ByteVar>(), family)

public actual fun GetTcpTable(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable(tcptable.toCPointer<ByteVar>(), sizepointer.toCPointer<ByteVar>(), order)

public actual fun GetTcpTable2(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable2(tcptable.toCPointer<ByteVar>(), sizepointer.toCPointer<ByteVar>(), order)

public actual fun GetTeredoPort(port: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetTeredoPort(port.toCPointer<ByteVar>())

public actual fun GetUdp6Table(udp6table: Long, sizepointer: Long, order: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetUdp6Table(udp6table.toCPointer<ByteVar>(), sizepointer.toCPointer<ByteVar>(), order)

public actual fun GetUdpStatistics(stats: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatistics(stats.toCPointer<ByteVar>())

public actual fun GetUdpStatisticsEx(statistics: Long, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx(statistics.toCPointer<ByteVar>(), family)

public actual fun GetUdpStatisticsEx2(statistics: Long, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx2(statistics.toCPointer<ByteVar>(), family)

public actual fun GetUdpTable(udptable: Long, sizepointer: Long, order: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetUdpTable(udptable.toCPointer<ByteVar>(), sizepointer.toCPointer<ByteVar>(), order)

public actual fun GetUniDirectionalAdapterInfo(pipifinfo: Long, dwoutbuflen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetUniDirectionalAdapterInfo(pipifinfo.toCPointer<ByteVar>(), dwoutbuflen.toCPointer<ByteVar>())

public actual fun GetUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressEntry(row.toCPointer<ByteVar>())

public actual fun GetUnicastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressTable(family, table.toCPointer<ByteVar>())

public actual fun Icmp6CreateFile(): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_Icmp6CreateFile()?.toLong() ?: 0L

public actual fun Icmp6ParseReplies(replybuffer: Long, replysize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_Icmp6ParseReplies(replybuffer.toCPointer<ByteVar>(), replysize)

public actual fun Icmp6SendEcho2(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, sourceaddress: Long, destinationaddress: Long, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun IcmpCloseHandle(icmphandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_IcmpCloseHandle(icmphandle.toCPointer<ByteVar>())

public actual fun IcmpCreateFile(): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_IcmpCreateFile()?.toLong() ?: 0L

public actual fun IcmpParseReplies(replybuffer: Long, replysize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_IcmpParseReplies(replybuffer.toCPointer<ByteVar>(), replysize)

public actual fun IcmpSendEcho(icmphandle: HANDLE, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_IcmpSendEcho(icmphandle.toCPointer<ByteVar>(), destinationaddress, requestdata.toCPointer<ByteVar>(), requestsize, requestoptions.toCPointer<ByteVar>(), replybuffer.toCPointer<ByteVar>(), replysize, timeout)

public actual fun IcmpSendEcho2(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun IcmpSendEcho2Ex(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, sourceaddress: UInt, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun InitializeIpForwardEntry(row: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_InitializeIpForwardEntry(row.toCPointer<ByteVar>())
}

public actual fun InitializeIpInterfaceEntry(row: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_InitializeIpInterfaceEntry(row.toCPointer<ByteVar>())
}

public actual fun InitializeUnicastIpAddressEntry(row: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_InitializeUnicastIpAddressEntry(row.toCPointer<ByteVar>())
}

public actual fun IpReleaseAddress(adapterinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_IpReleaseAddress(adapterinfo.toCPointer<ByteVar>())

public actual fun IpRenewAddress(adapterinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_IpRenewAddress(adapterinfo.toCPointer<ByteVar>())

public actual fun LookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentTcpPortReservation(startport, numberofports, token.toCPointer<ByteVar>())

public actual fun LookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentUdpPortReservation(startport, numberofports, token.toCPointer<ByteVar>())

public actual fun NhpAllocateAndGetInterfaceInfoFromStack(pptable: Long, pdwcount: Long, border: BOOL, hheap: HANDLE, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_NhpAllocateAndGetInterfaceInfoFromStack(pptable.toCPointer<ByteVar>(), pdwcount.toCPointer<ByteVar>(), border, hheap.toCPointer<ByteVar>(), dwflags)

public actual fun NotifyAddrChange(handle: Long, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_NotifyAddrChange(handle.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun NotifyIfTimestampConfigChange(callercontext: Long, callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, notificationhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_NotifyIfTimestampConfigChange(callercontext.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), notificationhandle.toCPointer<ByteVar>())

public actual fun NotifyIpInterfaceChange(family: ADDRESS_FAMILY, callback: PIPINTERFACE_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_NotifyIpInterfaceChange(family, callback.toLong().toCPointer<ByteVar>(), callercontext.toCPointer<ByteVar>(), initialnotification, notificationhandle.toCPointer<ByteVar>())

public actual fun NotifyNetworkConnectivityHintChange(callback: PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_NotifyNetworkConnectivityHintChange(callback.toLong().toCPointer<ByteVar>(), callercontext.toCPointer<ByteVar>(), initialnotification, notificationhandle.toCPointer<ByteVar>())

public actual fun NotifyRouteChange(handle: Long, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange(handle.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun NotifyRouteChange2(addressfamily: ADDRESS_FAMILY, callback: PIPFORWARD_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange2(addressfamily, callback.toLong().toCPointer<ByteVar>(), callercontext.toCPointer<ByteVar>(), initialnotification, notificationhandle.toCPointer<ByteVar>())

public actual fun NotifyStableUnicastIpAddressTable(family: ADDRESS_FAMILY, table: Long, callercallback: PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACK, callercontext: Long, notificationhandle: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_NotifyStableUnicastIpAddressTable(family, table.toCPointer<ByteVar>(), callercallback.toLong().toCPointer<ByteVar>(), callercontext.toCPointer<ByteVar>(), notificationhandle.toCPointer<ByteVar>())

public actual fun NotifyTeredoPortChange(callback: PTEREDO_PORT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_NotifyTeredoPortChange(callback.toLong().toCPointer<ByteVar>(), callercontext.toCPointer<ByteVar>(), initialnotification, notificationhandle.toCPointer<ByteVar>())

public actual fun NotifyUnicastIpAddressChange(family: ADDRESS_FAMILY, callback: PUNICAST_IPADDRESS_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_NotifyUnicastIpAddressChange(family, callback.toLong().toCPointer<ByteVar>(), callercontext.toCPointer<ByteVar>(), initialnotification, notificationhandle.toCPointer<ByteVar>())

public actual fun ParseNetworkString(networkstring: PCWSTR, types: UInt, addressinfo: Long, portnumber: Long, prefixlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ParseNetworkString(networkstring.toCPointer<ByteVar>(), types, addressinfo.toCPointer<ByteVar>(), portnumber.toCPointer<ByteVar>(), prefixlength.toCPointer<ByteVar>())

public actual fun PfAddFiltersToInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long, pfhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfAddFiltersToInterface(ih.toCPointer<ByteVar>(), cinfilters, pfiltin.toCPointer<ByteVar>(), coutfilters, pfiltout.toCPointer<ByteVar>(), pfhandle.toCPointer<ByteVar>())

public actual fun PfAddGlobalFilterToInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfAddGlobalFilterToInterface(pinterface.toCPointer<ByteVar>(), gffilter)

public actual fun PfBindInterfaceToIPAddress(pinterface: Long, pfattype: PFADDRESSTYPE, ipaddress: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIPAddress(pinterface.toCPointer<ByteVar>(), pfattype, ipaddress.toCPointer<ByteVar>())

public actual fun PfBindInterfaceToIndex(pinterface: Long, dwindex: UInt, pfatlinktype: PFADDRESSTYPE, linkipaddress: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIndex(pinterface.toCPointer<ByteVar>(), dwindex, pfatlinktype, linkipaddress.toCPointer<ByteVar>())

public actual fun PfCreateInterface(dwname: UInt, inaction: PFFORWARD_ACTION, outaction: PFFORWARD_ACTION, buselog: BOOL, bmustbeunique: BOOL, ppinterface: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfCreateInterface(dwname, inaction, outaction, buselog, bmustbeunique, ppinterface.toCPointer<ByteVar>())

public actual fun PfDeleteInterface(pinterface: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfDeleteInterface(pinterface.toCPointer<ByteVar>())

public actual fun PfDeleteLog(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfDeleteLog()

public actual fun PfGetInterfaceStatistics(pinterface: Long, ppfstats: Long, pdwbuffersize: Long, fresetcounters: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfGetInterfaceStatistics(pinterface.toCPointer<ByteVar>(), ppfstats.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>(), fresetcounters)

public actual fun PfMakeLog(hevent: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfMakeLog(hevent.toCPointer<ByteVar>())

public actual fun PfRebindFilters(pinterface: Long, platebindinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfRebindFilters(pinterface.toCPointer<ByteVar>(), platebindinfo.toCPointer<ByteVar>())

public actual fun PfRemoveFilterHandles(pinterface: Long, cfilters: UInt, pvhandles: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFilterHandles(pinterface.toCPointer<ByteVar>(), cfilters, pvhandles.toCPointer<ByteVar>())

public actual fun PfRemoveFiltersFromInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFiltersFromInterface(ih.toCPointer<ByteVar>(), cinfilters, pfiltin.toCPointer<ByteVar>(), coutfilters, pfiltout.toCPointer<ByteVar>())

public actual fun PfRemoveGlobalFilterFromInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfRemoveGlobalFilterFromInterface(pinterface.toCPointer<ByteVar>(), gffilter)

public actual fun PfSetLogBuffer(pbbuffer: Long, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: Long, pdwlostentries: Long, pdwsizeused: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfSetLogBuffer(pbbuffer.toCPointer<ByteVar>(), dwsize, dwthreshold, dwentries, pdwloggedentries.toCPointer<ByteVar>(), pdwlostentries.toCPointer<ByteVar>(), pdwsizeused.toCPointer<ByteVar>())

public actual fun PfTestPacket(pininterface: Long, poutinterface: Long, cbytes: UInt, pbpacket: Long, ppaction: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfTestPacket(pininterface.toCPointer<ByteVar>(), poutinterface.toCPointer<ByteVar>(), cbytes, pbpacket.toCPointer<ByteVar>(), ppaction.toCPointer<ByteVar>())

public actual fun PfUnBindInterface(pinterface: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_PfUnBindInterface(pinterface.toCPointer<ByteVar>())

public actual fun RegisterInterfaceTimestampConfigChange(callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, callercontext: Long, notificationhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_RegisterInterfaceTimestampConfigChange(callback.toLong().toCPointer<ByteVar>(), callercontext.toCPointer<ByteVar>(), notificationhandle.toCPointer<ByteVar>())

public actual fun ResolveIpNetEntry2(row: Long, sourceaddress: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ResolveIpNetEntry2(row.toCPointer<ByteVar>(), sourceaddress.toCPointer<ByteVar>())

public actual fun ResolveNeighbor(networkaddress: Long, physicaladdress: Long, physicaladdresslength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ResolveNeighbor(networkaddress.toCPointer<ByteVar>(), physicaladdress.toCPointer<ByteVar>(), physicaladdresslength.toCPointer<ByteVar>())

public actual fun RestoreMediaSense(poverlapped: Long, lpdwenablecount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_RestoreMediaSense(poverlapped.toCPointer<ByteVar>(), lpdwenablecount.toCPointer<ByteVar>())

public actual fun SendARP(destip: UInt, srcip: UInt, pmacaddr: Long, phyaddrlen: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SendARP(destip, srcip, pmacaddr.toCPointer<ByteVar>(), phyaddrlen.toCPointer<ByteVar>())

public actual fun SetCurrentThreadCompartmentId(compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentId(compartmentid)

public actual fun SetCurrentThreadCompartmentScope(compartmentscope: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentScope(compartmentscope)

public actual fun SetDnsSettings(settings: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetDnsSettings(settings.toCPointer<ByteVar>())

public actual fun SetIfEntry(pifrow: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetIfEntry(pifrow.toCPointer<ByteVar>())

public actual fun SetInterfaceDnsSettings(iface: GUID, settings: Long): WIN32_ERROR =
    0u

public actual fun SetIpForwardEntry(proute: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry(proute.toCPointer<ByteVar>())

public actual fun SetIpForwardEntry2(route: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry2(route.toCPointer<ByteVar>())

public actual fun SetIpInterfaceEntry(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetIpInterfaceEntry(row.toCPointer<ByteVar>())

public actual fun SetIpNetEntry(parpentry: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry(parpentry.toCPointer<ByteVar>())

public actual fun SetIpNetEntry2(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry2(row.toCPointer<ByteVar>())

public actual fun SetIpStatistics(pipstats: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetIpStatistics(pipstats.toCPointer<ByteVar>())

public actual fun SetIpStatisticsEx(statistics: Long, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetIpStatisticsEx(statistics.toCPointer<ByteVar>(), family)

public actual fun SetIpTTL(nttl: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetIpTTL(nttl)

public actual fun SetJobCompartmentId(jobhandle: HANDLE, compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetJobCompartmentId(jobhandle.toCPointer<ByteVar>(), compartmentid)

public actual fun SetNetworkInformation(networkguid: Long, compartmentid: NET_IF_COMPARTMENT_ID, networkname: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetNetworkInformation(networkguid.toCPointer<ByteVar>(), compartmentid, networkname.toCPointer<ByteVar>())

public actual fun SetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetPerTcp6ConnectionEStats(row.toCPointer<ByteVar>(), estatstype, rw.toCPointer<ByteVar>(), rwversion, rwsize, offset)

public actual fun SetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetPerTcpConnectionEStats(row.toCPointer<ByteVar>(), estatstype, rw.toCPointer<ByteVar>(), rwversion, rwsize, offset)

public actual fun SetSessionCompartmentId(sessionid: UInt, compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetSessionCompartmentId(sessionid, compartmentid)

public actual fun SetTcpEntry(ptcprow: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetTcpEntry(ptcprow.toCPointer<ByteVar>())

public actual fun SetUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_SetUnicastIpAddressEntry(row.toCPointer<ByteVar>())

public actual fun UnenableRouter(poverlapped: Long, lpdwenablecount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_UnenableRouter(poverlapped.toCPointer<ByteVar>(), lpdwenablecount.toCPointer<ByteVar>())

public actual fun UnregisterInterfaceTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_UnregisterInterfaceTimestampConfigChange(notificationhandle.toCPointer<ByteVar>())
}

public actual fun if_indextoname(interfaceindex: UInt, interfacename: PSTR): PSTR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_if_indextoname(interfaceindex, interfacename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun if_nametoindex(interfacename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_if_nametoindex(interfacename.toCPointer<ByteVar>())
