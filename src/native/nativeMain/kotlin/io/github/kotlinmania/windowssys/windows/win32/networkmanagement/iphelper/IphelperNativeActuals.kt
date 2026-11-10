@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: COpaquePointer?, nteinstance: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_addIPAddress(address, ipmask, ifindex, ntecontext?.value?.toCPointer<ByteVar>(), nteinstance?.value?.toCPointer<ByteVar>())

public actual fun cancelIPChangeNotify(notifyoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_cancelIPChangeNotify(notifyoverlapped?.value?.toCPointer<ByteVar>())

public actual fun cancelIfTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_cancelIfTimestampConfigChange(notificationhandle?.value?.toCPointer<ByteVar>())
}

public actual fun cancelMibChangeNotify2(notificationhandle: Handle): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_cancelMibChangeNotify2(notificationhandle?.value?.toCPointer<ByteVar>())

public actual fun captureInterfaceHardwareCrossTimestamp(interfaceluid: COpaquePointer?, crosstimestamp: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_captureInterfaceHardwareCrossTimestamp(interfaceluid?.value?.toCPointer<ByteVar>(), crosstimestamp?.value?.toCPointer<ByteVar>())

public actual fun convertCompartmentGuidToId(compartmentguid: COpaquePointer?, compartmentid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentGuidToId(compartmentguid?.value?.toCPointer<ByteVar>(), compartmentid?.value?.toCPointer<ByteVar>())

public actual fun convertCompartmentIdToGuid(compartmentid: NetIfCompartmentId, compartmentguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertCompartmentIdToGuid(compartmentid, compartmentguid?.value?.toCPointer<ByteVar>())

public actual fun convertInterfaceAliasToLuid(interfacealias: Pcwstr, interfaceluid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceAliasToLuid(interfacealias?.value?.toCPointer<ByteVar>(), interfaceluid?.value?.toCPointer<ByteVar>())

public actual fun convertInterfaceGuidToLuid(interfaceguid: COpaquePointer?, interfaceluid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceGuidToLuid(interfaceguid?.value?.toCPointer<ByteVar>(), interfaceluid?.value?.toCPointer<ByteVar>())

public actual fun convertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceIndexToLuid(interfaceindex, interfaceluid?.value?.toCPointer<ByteVar>())

public actual fun convertInterfaceLuidToAlias(interfaceluid: COpaquePointer?, interfacealias: Pwstr, length: ULong): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToAlias(interfaceluid?.value?.toCPointer<ByteVar>(), interfacealias?.value?.toCPointer<ByteVar>(), length)

public actual fun convertInterfaceLuidToGuid(interfaceluid: COpaquePointer?, interfaceguid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToGuid(interfaceluid?.value?.toCPointer<ByteVar>(), interfaceguid?.value?.toCPointer<ByteVar>())

public actual fun convertInterfaceLuidToIndex(interfaceluid: COpaquePointer?, interfaceindex: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToIndex(interfaceluid?.value?.toCPointer<ByteVar>(), interfaceindex?.value?.toCPointer<ByteVar>())

public actual fun convertInterfaceLuidToNameA(interfaceluid: COpaquePointer?, interfacename: Pstr, length: ULong): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameA(interfaceluid?.value?.toCPointer<ByteVar>(), interfacename?.value?.toCPointer<ByteVar>(), length)

public actual fun convertInterfaceLuidToNameW(interfaceluid: COpaquePointer?, interfacename: Pwstr, length: ULong): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceLuidToNameW(interfaceluid?.value?.toCPointer<ByteVar>(), interfacename?.value?.toCPointer<ByteVar>(), length)

public actual fun convertInterfaceNameToLuidA(interfacename: Pcstr, interfaceluid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidA(interfacename?.value?.toCPointer<ByteVar>(), interfaceluid?.value?.toCPointer<ByteVar>())

public actual fun convertInterfaceNameToLuidW(interfacename: Pcwstr, interfaceluid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertInterfaceNameToLuidW(interfacename?.value?.toCPointer<ByteVar>(), interfaceluid?.value?.toCPointer<ByteVar>())

public actual fun convertIpv4MaskToLength(mask: UInt, masklength: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertIpv4MaskToLength(mask, masklength?.value?.toCPointer<ByteVar>())

public actual fun convertLengthToIpv4Mask(masklength: UInt, mask: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_convertLengthToIpv4Mask(masklength, mask?.value?.toCPointer<ByteVar>())

public actual fun createAnycastIpAddressEntry(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_createAnycastIpAddressEntry(row?.value?.toCPointer<ByteVar>())

public actual fun createIpForwardEntry(proute: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry(proute?.value?.toCPointer<ByteVar>())

public actual fun createIpForwardEntry2(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_createIpForwardEntry2(row?.value?.toCPointer<ByteVar>())

public actual fun createIpNetEntry(parpentry: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry(parpentry?.value?.toCPointer<ByteVar>())

public actual fun createIpNetEntry2(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_createIpNetEntry2(row?.value?.toCPointer<ByteVar>())

public actual fun createPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_createPersistentTcpPortReservation(startport, numberofports, token?.value?.toCPointer<ByteVar>())

public actual fun createPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_createPersistentUdpPortReservation(startport, numberofports, token?.value?.toCPointer<ByteVar>())

public actual fun createProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_createProxyArpEntry(dwaddress, dwmask, dwifindex)

public actual fun createSortedAddressPairs(sourceaddresslist: COpaquePointer?, sourceaddresscount: UInt, destinationaddresslist: COpaquePointer?, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: COpaquePointer?, sortedaddresspaircount: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_createSortedAddressPairs(sourceaddresslist?.value?.toCPointer<ByteVar>(), sourceaddresscount, destinationaddresslist?.value?.toCPointer<ByteVar>(), destinationaddresscount, addresssortoptions, sortedaddresspairlist?.value?.toCPointer<ByteVar>(), sortedaddresspaircount?.value?.toCPointer<ByteVar>())

public actual fun createUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_createUnicastIpAddressEntry(row?.value?.toCPointer<ByteVar>())

public actual fun deleteAnycastIpAddressEntry(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_deleteAnycastIpAddressEntry(row?.value?.toCPointer<ByteVar>())

public actual fun deleteIPAddress(ntecontext: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_deleteIPAddress(ntecontext)

public actual fun deleteIpForwardEntry(proute: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry(proute?.value?.toCPointer<ByteVar>())

public actual fun deleteIpForwardEntry2(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_deleteIpForwardEntry2(row?.value?.toCPointer<ByteVar>())

public actual fun deleteIpNetEntry(parpentry: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry(parpentry?.value?.toCPointer<ByteVar>())

public actual fun deleteIpNetEntry2(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_deleteIpNetEntry2(row?.value?.toCPointer<ByteVar>())

public actual fun deletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_deletePersistentTcpPortReservation(startport, numberofports)

public actual fun deletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_deletePersistentUdpPortReservation(startport, numberofports)

public actual fun deleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_deleteProxyArpEntry(dwaddress, dwmask, dwifindex)

public actual fun deleteUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_deleteUnicastIpAddressEntry(row?.value?.toCPointer<ByteVar>())

public actual fun disableMediaSense(phandle: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_disableMediaSense(phandle?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun enableRouter(phandle: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_enableRouter(phandle?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun flushIpNetTable(dwifindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable(dwifindex)

public actual fun flushIpNetTable2(family: AddressFamily, interfaceindex: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_flushIpNetTable2(family, interfaceindex)

public actual fun flushIpPathTable(family: AddressFamily): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_flushIpPathTable(family)

public actual fun freeDnsSettings(settings: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_freeDnsSettings(settings?.value?.toCPointer<ByteVar>())
}

public actual fun freeInterfaceDnsSettings(settings: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_freeInterfaceDnsSettings(settings?.value?.toCPointer<ByteVar>())
}

public actual fun freeMibTable(memory: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_freeMibTable(memory?.value?.toCPointer<ByteVar>())
}

public actual fun getAdapterIndex(adaptername: Pcwstr, ifindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getAdapterIndex(adaptername?.value?.toCPointer<ByteVar>(), ifindex?.value?.toCPointer<ByteVar>())

public actual fun getAdapterOrderMap(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getAdapterOrderMap()?.let { COpaquePointer(it.toLong()) }

public actual fun getAdaptersAddresses(family: UInt, flags: GetAdaptersAddressesFlags, reserved: COpaquePointer?, adapteraddresses: COpaquePointer?, sizepointer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getAdaptersAddresses(family, flags, reserved?.value?.toCPointer<ByteVar>(), adapteraddresses?.value?.toCPointer<ByteVar>(), sizepointer?.value?.toCPointer<ByteVar>())

public actual fun getAdaptersInfo(adapterinfo: COpaquePointer?, sizepointer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getAdaptersInfo(adapterinfo?.value?.toCPointer<ByteVar>(), sizepointer?.value?.toCPointer<ByteVar>())

public actual fun getAnycastIpAddressEntry(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressEntry(row?.value?.toCPointer<ByteVar>())

public actual fun getAnycastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getAnycastIpAddressTable(family, table?.value?.toCPointer<ByteVar>())

public actual fun getBestInterface(dwdestaddr: UInt, pdwbestifindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getBestInterface(dwdestaddr, pdwbestifindex?.value?.toCPointer<ByteVar>())

public actual fun getBestInterfaceEx(pdestaddr: COpaquePointer?, pdwbestifindex: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getBestInterfaceEx(pdestaddr?.value?.toCPointer<ByteVar>(), pdwbestifindex?.value?.toCPointer<ByteVar>())

public actual fun getBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getBestRoute(dwdestaddr, dwsourceaddr, pbestroute?.value?.toCPointer<ByteVar>())

public actual fun getBestRoute2(interfaceluid: COpaquePointer?, interfaceindex: UInt, sourceaddress: COpaquePointer?, destinationaddress: COpaquePointer?, addresssortoptions: UInt, bestroute: COpaquePointer?, bestsourceaddress: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getBestRoute2(interfaceluid?.value?.toCPointer<ByteVar>(), interfaceindex, sourceaddress?.value?.toCPointer<ByteVar>(), destinationaddress?.value?.toCPointer<ByteVar>(), addresssortoptions, bestroute?.value?.toCPointer<ByteVar>(), bestsourceaddress?.value?.toCPointer<ByteVar>())

public actual fun getCurrentThreadCompartmentId(): NetIfCompartmentId =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentId()

public actual fun getCurrentThreadCompartmentScope(compartmentscope: COpaquePointer?, compartmentid: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getCurrentThreadCompartmentScope(compartmentscope?.value?.toCPointer<ByteVar>(), compartmentid?.value?.toCPointer<ByteVar>())
}

public actual fun getDefaultCompartmentId(): NetIfCompartmentId =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getDefaultCompartmentId()

public actual fun getDnsSettings(settings: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getDnsSettings(settings?.value?.toCPointer<ByteVar>())

public actual fun getExtendedTcpTable(ptcptable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool, ulaf: UInt, tableclass: TcpTableClass, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getExtendedTcpTable(ptcptable?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>(), border, ulaf, tableclass, reserved)

public actual fun getExtendedUdpTable(pudptable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool, ulaf: UInt, tableclass: UdpTableClass, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getExtendedUdpTable(pudptable?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>(), border, ulaf, tableclass, reserved)

public actual fun getFriendlyIfIndex(ifindex: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getFriendlyIfIndex(ifindex)

public actual fun getIcmpStatistics(statistics: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatistics(statistics?.value?.toCPointer<ByteVar>())

public actual fun getIcmpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIcmpStatisticsEx(statistics?.value?.toCPointer<ByteVar>(), family)

public actual fun getIfEntry(pifrow: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIfEntry(pifrow?.value?.toCPointer<ByteVar>())

public actual fun getIfEntry2(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2(row?.value?.toCPointer<ByteVar>())

public actual fun getIfEntry2Ex(level: MibIfEntryLevel, row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIfEntry2Ex(level, row?.value?.toCPointer<ByteVar>())

public actual fun getIfStackTable(table: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIfStackTable(table?.value?.toCPointer<ByteVar>())

public actual fun getIfTable(piftable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIfTable(piftable?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>(), border)

public actual fun getIfTable2(table: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIfTable2(table?.value?.toCPointer<ByteVar>())

public actual fun getIfTable2Ex(level: MibIfTableLevel, table: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIfTable2Ex(level, table?.value?.toCPointer<ByteVar>())

public actual fun getInterfaceActiveTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceActiveTimestampCapabilities(interfaceluid?.value?.toCPointer<ByteVar>(), timestampcapabilites?.value?.toCPointer<ByteVar>())

public actual fun getInterfaceCurrentTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceCurrentTimestampCapabilities(interfaceluid?.value?.toCPointer<ByteVar>(), timestampcapabilites?.value?.toCPointer<ByteVar>())

public actual fun getInterfaceDnsSettings(iface: Guid, settings: COpaquePointer?): Win32Error =
    0u

public actual fun getInterfaceHardwareTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceHardwareTimestampCapabilities(interfaceluid?.value?.toCPointer<ByteVar>(), timestampcapabilites?.value?.toCPointer<ByteVar>())

public actual fun getInterfaceInfo(piftable: COpaquePointer?, dwoutbuflen: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceInfo(piftable?.value?.toCPointer<ByteVar>(), dwoutbuflen?.value?.toCPointer<ByteVar>())

public actual fun getInterfaceSupportedTimestampCapabilities(interfaceluid: COpaquePointer?, timestampcapabilites: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getInterfaceSupportedTimestampCapabilities(interfaceluid?.value?.toCPointer<ByteVar>(), timestampcapabilites?.value?.toCPointer<ByteVar>())

public actual fun getInvertedIfStackTable(table: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getInvertedIfStackTable(table?.value?.toCPointer<ByteVar>())

public actual fun getIpAddrTable(pipaddrtable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpAddrTable(pipaddrtable?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>(), border)

public actual fun getIpErrorString(errorcode: UInt, buffer: Pwstr, size: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpErrorString(errorcode, buffer?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun getIpForwardEntry2(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpForwardEntry2(row?.value?.toCPointer<ByteVar>())

public actual fun getIpForwardTable(pipforwardtable: COpaquePointer?, pdwsize: COpaquePointer?, border: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable(pipforwardtable?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>(), border)

public actual fun getIpForwardTable2(family: AddressFamily, table: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpForwardTable2(family, table?.value?.toCPointer<ByteVar>())

public actual fun getIpInterfaceEntry(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceEntry(row?.value?.toCPointer<ByteVar>())

public actual fun getIpInterfaceTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpInterfaceTable(family, table?.value?.toCPointer<ByteVar>())

public actual fun getIpNetEntry2(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpNetEntry2(row?.value?.toCPointer<ByteVar>())

public actual fun getIpNetTable(ipnettable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable(ipnettable?.value?.toCPointer<ByteVar>(), sizepointer?.value?.toCPointer<ByteVar>(), order)

public actual fun getIpNetTable2(family: AddressFamily, table: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpNetTable2(family, table?.value?.toCPointer<ByteVar>())

public actual fun getIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: AddressFamily, bandwidthestimates: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpNetworkConnectionBandwidthEstimates(interfaceindex, addressfamily, bandwidthestimates?.value?.toCPointer<ByteVar>())

public actual fun getIpPathEntry(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpPathEntry(row?.value?.toCPointer<ByteVar>())

public actual fun getIpPathTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpPathTable(family, table?.value?.toCPointer<ByteVar>())

public actual fun getIpStatistics(statistics: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpStatistics(statistics?.value?.toCPointer<ByteVar>())

public actual fun getIpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getIpStatisticsEx(statistics?.value?.toCPointer<ByteVar>(), family)

public actual fun getJobCompartmentId(jobhandle: Handle): NetIfCompartmentId =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getJobCompartmentId(jobhandle?.value?.toCPointer<ByteVar>())

public actual fun getMulticastIpAddressEntry(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressEntry(row?.value?.toCPointer<ByteVar>())

public actual fun getMulticastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getMulticastIpAddressTable(family, table?.value?.toCPointer<ByteVar>())

public actual fun getNetworkConnectivityHint(connectivityhint: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHint(connectivityhint?.value?.toCPointer<ByteVar>())

public actual fun getNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getNetworkConnectivityHintForInterface(interfaceindex, connectivityhint?.value?.toCPointer<ByteVar>())

public actual fun getNetworkInformation(networkguid: COpaquePointer?, compartmentid: COpaquePointer?, siteid: COpaquePointer?, networkname: Pwstr, length: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getNetworkInformation(networkguid?.value?.toCPointer<ByteVar>(), compartmentid?.value?.toCPointer<ByteVar>(), siteid?.value?.toCPointer<ByteVar>(), networkname?.value?.toCPointer<ByteVar>(), length)

public actual fun getNetworkParams(pfixedinfo: COpaquePointer?, poutbuflen: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getNetworkParams(pfixedinfo?.value?.toCPointer<ByteVar>(), poutbuflen?.value?.toCPointer<ByteVar>())

public actual fun getNumberOfInterfaces(pdwnumif: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getNumberOfInterfaces(pdwnumif?.value?.toCPointer<ByteVar>())

public actual fun getOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromPidAndInfo(ulpid, pinfo?.value?.toCPointer<ByteVar>(), cls, pbuffer?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>())

public actual fun getOwnerModuleFromTcp6Entry(ptcpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcp6Entry(ptcpentry?.value?.toCPointer<ByteVar>(), cls, pbuffer?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>())

public actual fun getOwnerModuleFromTcpEntry(ptcpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromTcpEntry(ptcpentry?.value?.toCPointer<ByteVar>(), cls, pbuffer?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>())

public actual fun getOwnerModuleFromUdp6Entry(pudpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdp6Entry(pudpentry?.value?.toCPointer<ByteVar>(), cls, pbuffer?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>())

public actual fun getOwnerModuleFromUdpEntry(pudpentry: COpaquePointer?, cls: TcpipOwnerModuleInfoClass, pbuffer: COpaquePointer?, pdwsize: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getOwnerModuleFromUdpEntry(pudpentry?.value?.toCPointer<ByteVar>(), cls, pbuffer?.value?.toCPointer<ByteVar>(), pdwsize?.value?.toCPointer<ByteVar>())

public actual fun getPerAdapterInfo(ifindex: UInt, pperadapterinfo: COpaquePointer?, poutbuflen: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getPerAdapterInfo(ifindex, pperadapterinfo?.value?.toCPointer<ByteVar>(), poutbuflen?.value?.toCPointer<ByteVar>())

public actual fun getPerTcp6ConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, ros: COpaquePointer?, rosversion: UInt, rossize: UInt, rod: COpaquePointer?, rodversion: UInt, rodsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getPerTcp6ConnectionEStats(row?.value?.toCPointer<ByteVar>(), estatstype, rw?.value?.toCPointer<ByteVar>(), rwversion, rwsize, ros?.value?.toCPointer<ByteVar>(), rosversion, rossize, rod?.value?.toCPointer<ByteVar>(), rodversion, rodsize)

public actual fun getPerTcpConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, ros: COpaquePointer?, rosversion: UInt, rossize: UInt, rod: COpaquePointer?, rodversion: UInt, rodsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getPerTcpConnectionEStats(row?.value?.toCPointer<ByteVar>(), estatstype, rw?.value?.toCPointer<ByteVar>(), rwversion, rwsize, ros?.value?.toCPointer<ByteVar>(), rosversion, rossize, rod?.value?.toCPointer<ByteVar>(), rodversion, rodsize)

public actual fun getRTTAndHopCount(destipaddress: UInt, hopcount: COpaquePointer?, maxhops: UInt, rtt: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getRTTAndHopCount(destipaddress, hopcount?.value?.toCPointer<ByteVar>(), maxhops, rtt?.value?.toCPointer<ByteVar>())

public actual fun getSessionCompartmentId(sessionid: UInt): NetIfCompartmentId =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getSessionCompartmentId(sessionid)

public actual fun getTcp6Table(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table(tcptable?.value?.toCPointer<ByteVar>(), sizepointer?.value?.toCPointer<ByteVar>(), order)

public actual fun getTcp6Table2(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getTcp6Table2(tcptable?.value?.toCPointer<ByteVar>(), sizepointer?.value?.toCPointer<ByteVar>(), order)

public actual fun getTcpStatistics(statistics: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getTcpStatistics(statistics?.value?.toCPointer<ByteVar>())

public actual fun getTcpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx(statistics?.value?.toCPointer<ByteVar>(), family)

public actual fun getTcpStatisticsEx2(statistics: COpaquePointer?, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getTcpStatisticsEx2(statistics?.value?.toCPointer<ByteVar>(), family)

public actual fun getTcpTable(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getTcpTable(tcptable?.value?.toCPointer<ByteVar>(), sizepointer?.value?.toCPointer<ByteVar>(), order)

public actual fun getTcpTable2(tcptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getTcpTable2(tcptable?.value?.toCPointer<ByteVar>(), sizepointer?.value?.toCPointer<ByteVar>(), order)

public actual fun getTeredoPort(port: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getTeredoPort(port?.value?.toCPointer<ByteVar>())

public actual fun getUdp6Table(udp6table: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getUdp6Table(udp6table?.value?.toCPointer<ByteVar>(), sizepointer?.value?.toCPointer<ByteVar>(), order)

public actual fun getUdpStatistics(stats: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getUdpStatistics(stats?.value?.toCPointer<ByteVar>())

public actual fun getUdpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx(statistics?.value?.toCPointer<ByteVar>(), family)

public actual fun getUdpStatisticsEx2(statistics: COpaquePointer?, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getUdpStatisticsEx2(statistics?.value?.toCPointer<ByteVar>(), family)

public actual fun getUdpTable(udptable: COpaquePointer?, sizepointer: COpaquePointer?, order: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getUdpTable(udptable?.value?.toCPointer<ByteVar>(), sizepointer?.value?.toCPointer<ByteVar>(), order)

public actual fun getUniDirectionalAdapterInfo(pipifinfo: COpaquePointer?, dwoutbuflen: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getUniDirectionalAdapterInfo(pipifinfo?.value?.toCPointer<ByteVar>(), dwoutbuflen?.value?.toCPointer<ByteVar>())

public actual fun getUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressEntry(row?.value?.toCPointer<ByteVar>())

public actual fun getUnicastIpAddressTable(family: AddressFamily, table: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_getUnicastIpAddressTable(family, table?.value?.toCPointer<ByteVar>())

public actual fun icmp6CreateFile(): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_icmp6CreateFile()?.let { COpaquePointer(it.toLong()) }

public actual fun icmp6ParseReplies(replybuffer: COpaquePointer?, replysize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_icmp6ParseReplies(replybuffer?.value?.toCPointer<ByteVar>(), replysize)

public actual fun icmp6SendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, sourceaddress: COpaquePointer?, destinationaddress: COpaquePointer?, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_icmp6SendEcho2(icmphandle?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), apccontext?.value?.toCPointer<ByteVar>(), sourceaddress?.value?.toCPointer<ByteVar>(), destinationaddress?.value?.toCPointer<ByteVar>(), requestdata?.value?.toCPointer<ByteVar>(), requestsize, requestoptions?.value?.toCPointer<ByteVar>(), replybuffer?.value?.toCPointer<ByteVar>(), replysize, timeout)

public actual fun icmpCloseHandle(icmphandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_icmpCloseHandle(icmphandle?.value?.toCPointer<ByteVar>())

public actual fun icmpCreateFile(): Handle =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_icmpCreateFile()?.let { COpaquePointer(it.toLong()) }

public actual fun icmpParseReplies(replybuffer: COpaquePointer?, replysize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_icmpParseReplies(replybuffer?.value?.toCPointer<ByteVar>(), replysize)

public actual fun icmpSendEcho(icmphandle: Handle, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho(icmphandle?.value?.toCPointer<ByteVar>(), destinationaddress, requestdata?.value?.toCPointer<ByteVar>(), requestsize, requestoptions?.value?.toCPointer<ByteVar>(), replybuffer?.value?.toCPointer<ByteVar>(), replysize, timeout)

public actual fun icmpSendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2(icmphandle?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), apccontext?.value?.toCPointer<ByteVar>(), destinationaddress, requestdata?.value?.toCPointer<ByteVar>(), requestsize, requestoptions?.value?.toCPointer<ByteVar>(), replybuffer?.value?.toCPointer<ByteVar>(), replysize, timeout)

public actual fun icmpSendEcho2Ex(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, sourceaddress: UInt, destinationaddress: UInt, requestdata: COpaquePointer?, requestsize: UShort, requestoptions: COpaquePointer?, replybuffer: COpaquePointer?, replysize: UInt, timeout: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_icmpSendEcho2Ex(icmphandle?.value?.toCPointer<ByteVar>(), event?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), apccontext?.value?.toCPointer<ByteVar>(), sourceaddress, destinationaddress, requestdata?.value?.toCPointer<ByteVar>(), requestsize, requestoptions?.value?.toCPointer<ByteVar>(), replybuffer?.value?.toCPointer<ByteVar>(), replysize, timeout)

public actual fun initializeIpForwardEntry(row: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_initializeIpForwardEntry(row?.value?.toCPointer<ByteVar>())
}

public actual fun initializeIpInterfaceEntry(row: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_initializeIpInterfaceEntry(row?.value?.toCPointer<ByteVar>())
}

public actual fun initializeUnicastIpAddressEntry(row: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_initializeUnicastIpAddressEntry(row?.value?.toCPointer<ByteVar>())
}

public actual fun ipReleaseAddress(adapterinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ipReleaseAddress(adapterinfo?.value?.toCPointer<ByteVar>())

public actual fun ipRenewAddress(adapterinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ipRenewAddress(adapterinfo?.value?.toCPointer<ByteVar>())

public actual fun lookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentTcpPortReservation(startport, numberofports, token?.value?.toCPointer<ByteVar>())

public actual fun lookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_lookupPersistentUdpPortReservation(startport, numberofports, token?.value?.toCPointer<ByteVar>())

public actual fun nhpAllocateAndGetInterfaceInfoFromStack(pptable: COpaquePointer?, pdwcount: COpaquePointer?, border: Bool, hheap: Handle, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_nhpAllocateAndGetInterfaceInfoFromStack(pptable?.value?.toCPointer<ByteVar>(), pdwcount?.value?.toCPointer<ByteVar>(), border, hheap?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun notifyAddrChange(handle: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_notifyAddrChange(handle?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun notifyIfTimestampConfigChange(callercontext: COpaquePointer?, callback: PinterfaceTimestampConfigChangeCallback, notificationhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_notifyIfTimestampConfigChange(callercontext?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), notificationhandle?.value?.toCPointer<ByteVar>())

public actual fun notifyIpInterfaceChange(family: AddressFamily, callback: PipinterfaceChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_notifyIpInterfaceChange(family, 0L.toCPointer<ByteVar>(), callercontext?.value?.toCPointer<ByteVar>(), initialnotification, notificationhandle?.value?.toCPointer<ByteVar>())

public actual fun notifyNetworkConnectivityHintChange(callback: PnetworkConnectivityHintChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_notifyNetworkConnectivityHintChange(0L.toCPointer<ByteVar>(), callercontext?.value?.toCPointer<ByteVar>(), initialnotification, notificationhandle?.value?.toCPointer<ByteVar>())

public actual fun notifyRouteChange(handle: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange(handle?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun notifyRouteChange2(addressfamily: AddressFamily, callback: PipforwardChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_notifyRouteChange2(addressfamily, 0L.toCPointer<ByteVar>(), callercontext?.value?.toCPointer<ByteVar>(), initialnotification, notificationhandle?.value?.toCPointer<ByteVar>())

public actual fun notifyStableUnicastIpAddressTable(family: AddressFamily, table: COpaquePointer?, callercallback: PstableUnicastIpaddressTableCallback, callercontext: COpaquePointer?, notificationhandle: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_notifyStableUnicastIpAddressTable(family, table?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), callercontext?.value?.toCPointer<ByteVar>(), notificationhandle?.value?.toCPointer<ByteVar>())

public actual fun notifyTeredoPortChange(callback: PteredoPortChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_notifyTeredoPortChange(0L.toCPointer<ByteVar>(), callercontext?.value?.toCPointer<ByteVar>(), initialnotification, notificationhandle?.value?.toCPointer<ByteVar>())

public actual fun notifyUnicastIpAddressChange(family: AddressFamily, callback: PunicastIpaddressChangeCallback, callercontext: COpaquePointer?, initialnotification: Boolean, notificationhandle: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_notifyUnicastIpAddressChange(family, 0L.toCPointer<ByteVar>(), callercontext?.value?.toCPointer<ByteVar>(), initialnotification, notificationhandle?.value?.toCPointer<ByteVar>())

public actual fun parseNetworkString(networkstring: Pcwstr, types: UInt, addressinfo: COpaquePointer?, portnumber: COpaquePointer?, prefixlength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_parseNetworkString(networkstring?.value?.toCPointer<ByteVar>(), types, addressinfo?.value?.toCPointer<ByteVar>(), portnumber?.value?.toCPointer<ByteVar>(), prefixlength?.value?.toCPointer<ByteVar>())

public actual fun pfAddFiltersToInterface(ih: COpaquePointer?, cinfilters: UInt, pfiltin: COpaquePointer?, coutfilters: UInt, pfiltout: COpaquePointer?, pfhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfAddFiltersToInterface(ih?.value?.toCPointer<ByteVar>(), cinfilters, pfiltin?.value?.toCPointer<ByteVar>(), coutfilters, pfiltout?.value?.toCPointer<ByteVar>(), pfhandle?.value?.toCPointer<ByteVar>())

public actual fun pfAddGlobalFilterToInterface(pinterface: COpaquePointer?, gffilter: GlobalFilter): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfAddGlobalFilterToInterface(pinterface?.value?.toCPointer<ByteVar>(), gffilter)

public actual fun pfBindInterfaceToIPAddress(pinterface: COpaquePointer?, pfattype: Pfaddresstype, ipaddress: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIPAddress(pinterface?.value?.toCPointer<ByteVar>(), pfattype, ipaddress?.value?.toCPointer<ByteVar>())

public actual fun pfBindInterfaceToIndex(pinterface: COpaquePointer?, dwindex: UInt, pfatlinktype: Pfaddresstype, linkipaddress: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfBindInterfaceToIndex(pinterface?.value?.toCPointer<ByteVar>(), dwindex, pfatlinktype, linkipaddress?.value?.toCPointer<ByteVar>())

public actual fun pfCreateInterface(dwname: UInt, inaction: PfforwardAction, outaction: PfforwardAction, buselog: Bool, bmustbeunique: Bool, ppinterface: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfCreateInterface(dwname, inaction, outaction, buselog, bmustbeunique, ppinterface?.value?.toCPointer<ByteVar>())

public actual fun pfDeleteInterface(pinterface: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfDeleteInterface(pinterface?.value?.toCPointer<ByteVar>())

public actual fun pfDeleteLog(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfDeleteLog()

public actual fun pfGetInterfaceStatistics(pinterface: COpaquePointer?, ppfstats: COpaquePointer?, pdwbuffersize: COpaquePointer?, fresetcounters: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfGetInterfaceStatistics(pinterface?.value?.toCPointer<ByteVar>(), ppfstats?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>(), fresetcounters)

public actual fun pfMakeLog(hevent: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfMakeLog(hevent?.value?.toCPointer<ByteVar>())

public actual fun pfRebindFilters(pinterface: COpaquePointer?, platebindinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfRebindFilters(pinterface?.value?.toCPointer<ByteVar>(), platebindinfo?.value?.toCPointer<ByteVar>())

public actual fun pfRemoveFilterHandles(pinterface: COpaquePointer?, cfilters: UInt, pvhandles: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFilterHandles(pinterface?.value?.toCPointer<ByteVar>(), cfilters, pvhandles?.value?.toCPointer<ByteVar>())

public actual fun pfRemoveFiltersFromInterface(ih: COpaquePointer?, cinfilters: UInt, pfiltin: COpaquePointer?, coutfilters: UInt, pfiltout: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfRemoveFiltersFromInterface(ih?.value?.toCPointer<ByteVar>(), cinfilters, pfiltin?.value?.toCPointer<ByteVar>(), coutfilters, pfiltout?.value?.toCPointer<ByteVar>())

public actual fun pfRemoveGlobalFilterFromInterface(pinterface: COpaquePointer?, gffilter: GlobalFilter): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfRemoveGlobalFilterFromInterface(pinterface?.value?.toCPointer<ByteVar>(), gffilter)

public actual fun pfSetLogBuffer(pbbuffer: COpaquePointer?, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: COpaquePointer?, pdwlostentries: COpaquePointer?, pdwsizeused: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfSetLogBuffer(pbbuffer?.value?.toCPointer<ByteVar>(), dwsize, dwthreshold, dwentries, pdwloggedentries?.value?.toCPointer<ByteVar>(), pdwlostentries?.value?.toCPointer<ByteVar>(), pdwsizeused?.value?.toCPointer<ByteVar>())

public actual fun pfTestPacket(pininterface: COpaquePointer?, poutinterface: COpaquePointer?, cbytes: UInt, pbpacket: COpaquePointer?, ppaction: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfTestPacket(pininterface?.value?.toCPointer<ByteVar>(), poutinterface?.value?.toCPointer<ByteVar>(), cbytes, pbpacket?.value?.toCPointer<ByteVar>(), ppaction?.value?.toCPointer<ByteVar>())

public actual fun pfUnBindInterface(pinterface: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_pfUnBindInterface(pinterface?.value?.toCPointer<ByteVar>())

public actual fun registerInterfaceTimestampConfigChange(callback: PinterfaceTimestampConfigChangeCallback, callercontext: COpaquePointer?, notificationhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_registerInterfaceTimestampConfigChange(0L.toCPointer<ByteVar>(), callercontext?.value?.toCPointer<ByteVar>(), notificationhandle?.value?.toCPointer<ByteVar>())

public actual fun resolveIpNetEntry2(row: COpaquePointer?, sourceaddress: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_resolveIpNetEntry2(row?.value?.toCPointer<ByteVar>(), sourceaddress?.value?.toCPointer<ByteVar>())

public actual fun resolveNeighbor(networkaddress: COpaquePointer?, physicaladdress: COpaquePointer?, physicaladdresslength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_resolveNeighbor(networkaddress?.value?.toCPointer<ByteVar>(), physicaladdress?.value?.toCPointer<ByteVar>(), physicaladdresslength?.value?.toCPointer<ByteVar>())

public actual fun restoreMediaSense(poverlapped: COpaquePointer?, lpdwenablecount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_restoreMediaSense(poverlapped?.value?.toCPointer<ByteVar>(), lpdwenablecount?.value?.toCPointer<ByteVar>())

public actual fun sendARP(destip: UInt, srcip: UInt, pmacaddr: COpaquePointer?, phyaddrlen: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_sendARP(destip, srcip, pmacaddr?.value?.toCPointer<ByteVar>(), phyaddrlen?.value?.toCPointer<ByteVar>())

public actual fun setCurrentThreadCompartmentId(compartmentid: NetIfCompartmentId): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentId(compartmentid)

public actual fun setCurrentThreadCompartmentScope(compartmentscope: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setCurrentThreadCompartmentScope(compartmentscope)

public actual fun setDnsSettings(settings: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setDnsSettings(settings?.value?.toCPointer<ByteVar>())

public actual fun setIfEntry(pifrow: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setIfEntry(pifrow?.value?.toCPointer<ByteVar>())

public actual fun setInterfaceDnsSettings(iface: Guid, settings: COpaquePointer?): Win32Error =
    0u

public actual fun setIpForwardEntry(proute: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry(proute?.value?.toCPointer<ByteVar>())

public actual fun setIpForwardEntry2(route: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setIpForwardEntry2(route?.value?.toCPointer<ByteVar>())

public actual fun setIpInterfaceEntry(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setIpInterfaceEntry(row?.value?.toCPointer<ByteVar>())

public actual fun setIpNetEntry(parpentry: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry(parpentry?.value?.toCPointer<ByteVar>())

public actual fun setIpNetEntry2(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setIpNetEntry2(row?.value?.toCPointer<ByteVar>())

public actual fun setIpStatistics(pipstats: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setIpStatistics(pipstats?.value?.toCPointer<ByteVar>())

public actual fun setIpStatisticsEx(statistics: COpaquePointer?, family: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setIpStatisticsEx(statistics?.value?.toCPointer<ByteVar>(), family)

public actual fun setIpTTL(nttl: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setIpTTL(nttl)

public actual fun setJobCompartmentId(jobhandle: Handle, compartmentid: NetIfCompartmentId): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setJobCompartmentId(jobhandle?.value?.toCPointer<ByteVar>(), compartmentid)

public actual fun setNetworkInformation(networkguid: COpaquePointer?, compartmentid: NetIfCompartmentId, networkname: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setNetworkInformation(networkguid?.value?.toCPointer<ByteVar>(), compartmentid, networkname?.value?.toCPointer<ByteVar>())

public actual fun setPerTcp6ConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setPerTcp6ConnectionEStats(row?.value?.toCPointer<ByteVar>(), estatstype, rw?.value?.toCPointer<ByteVar>(), rwversion, rwsize, offset)

public actual fun setPerTcpConnectionEStats(row: COpaquePointer?, estatstype: TcpEstatsType, rw: COpaquePointer?, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setPerTcpConnectionEStats(row?.value?.toCPointer<ByteVar>(), estatstype, rw?.value?.toCPointer<ByteVar>(), rwversion, rwsize, offset)

public actual fun setSessionCompartmentId(sessionid: UInt, compartmentid: NetIfCompartmentId): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setSessionCompartmentId(sessionid, compartmentid)

public actual fun setTcpEntry(ptcprow: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setTcpEntry(ptcprow?.value?.toCPointer<ByteVar>())

public actual fun setUnicastIpAddressEntry(row: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_setUnicastIpAddressEntry(row?.value?.toCPointer<ByteVar>())

public actual fun unenableRouter(poverlapped: COpaquePointer?, lpdwenablecount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_unenableRouter(poverlapped?.value?.toCPointer<ByteVar>(), lpdwenablecount?.value?.toCPointer<ByteVar>())

public actual fun unregisterInterfaceTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_unregisterInterfaceTimestampConfigChange(notificationhandle?.value?.toCPointer<ByteVar>())
}

public actual fun ifIndextoname(interfaceindex: UInt, interfacename: Pstr): Pstr =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ifIndextoname(interfaceindex, interfacename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ifNametoindex(interfacename: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper.cinterop.windowssys_windows_win32_networkmanagement_iphelper_ifNametoindex(interfacename?.value?.toCPointer<ByteVar>())
