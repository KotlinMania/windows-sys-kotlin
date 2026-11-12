@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: MutPtr<UInt>, nteinstance: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperAddIPAddress")

public actual fun cancelIPChangeNotify(notifyoverlapped: ConstPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCancelIPChangeNotify")

public actual fun cancelIfTimestampConfigChange(notificationhandle: Hiftimestampchange): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCancelIfTimestampConfigChange")

public actual fun cancelMibChangeNotify2(notificationhandle: Handle): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCancelMibChangeNotify2")

public actual fun captureInterfaceHardwareCrossTimestamp(interfaceluid: ConstPtr<NetLuidLh>, crosstimestamp: MutPtr<InterfaceHardwareCrosstimestamp>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCaptureInterfaceHardwareCrossTimestamp")

public actual fun convertCompartmentGuidToId(compartmentguid: ConstPtr<Guid>, compartmentid: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentGuidToId")

public actual fun convertCompartmentIdToGuid(compartmentid: NetIfCompartmentId, compartmentguid: MutPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentIdToGuid")

public actual fun convertInterfaceAliasToLuid(interfacealias: Pcwstr, interfaceluid: MutPtr<NetLuidLh>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceAliasToLuid")

public actual fun convertInterfaceGuidToLuid(interfaceguid: ConstPtr<Guid>, interfaceluid: MutPtr<NetLuidLh>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceGuidToLuid")

public actual fun convertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: MutPtr<NetLuidLh>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceIndexToLuid")

public actual fun convertInterfaceLuidToAlias(interfaceluid: ConstPtr<NetLuidLh>, interfacealias: Pwstr, length: ULong): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToAlias")

public actual fun convertInterfaceLuidToGuid(interfaceluid: ConstPtr<NetLuidLh>, interfaceguid: MutPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToGuid")

public actual fun convertInterfaceLuidToIndex(interfaceluid: ConstPtr<NetLuidLh>, interfaceindex: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToIndex")

public actual fun convertInterfaceLuidToNameA(interfaceluid: ConstPtr<NetLuidLh>, interfacename: Pstr, length: ULong): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameA")

public actual fun convertInterfaceLuidToNameW(interfaceluid: ConstPtr<NetLuidLh>, interfacename: Pwstr, length: ULong): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameW")

public actual fun convertInterfaceNameToLuidA(interfacename: Pcstr, interfaceluid: MutPtr<NetLuidLh>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidA")

public actual fun convertInterfaceNameToLuidW(interfacename: Pcwstr, interfaceluid: MutPtr<NetLuidLh>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidW")

public actual fun convertIpv4MaskToLength(mask: UInt, masklength: MutPtr<UByte>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertIpv4MaskToLength")

public actual fun convertLengthToIpv4Mask(masklength: UInt, mask: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperConvertLengthToIpv4Mask")

public actual fun createAnycastIpAddressEntry(row: ConstPtr<MibAnycastipaddressRow>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCreateAnycastIpAddressEntry")

public actual fun createIpForwardEntry(proute: ConstPtr<MibIpforwardrow>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry")

public actual fun createIpForwardEntry2(row: ConstPtr<MibIpforwardRow2>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry2")

public actual fun createIpNetEntry(parpentry: ConstPtr<MibIpnetrowLh>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry")

public actual fun createIpNetEntry2(row: ConstPtr<MibIpnetRow2>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry2")

public actual fun createPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentTcpPortReservation")

public actual fun createPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentUdpPortReservation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperCreateProxyArpEntry")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperCreateProxyArpEntry(dwaddress: Int, dwmask: Int, dwifindex: Int): Int

public actual fun createProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperCreateProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt()

public actual fun createSortedAddressPairs(sourceaddresslist: ConstPtr<SockaddrIn6>, sourceaddresscount: UInt, destinationaddresslist: ConstPtr<SockaddrIn6>, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: MutPtr<MutPtr<SockaddrIn6Pair>>, sortedaddresspaircount: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCreateSortedAddressPairs")

public actual fun createUnicastIpAddressEntry(row: ConstPtr<MibUnicastipaddressRow>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperCreateUnicastIpAddressEntry")

public actual fun deleteAnycastIpAddressEntry(row: ConstPtr<MibAnycastipaddressRow>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperDeleteAnycastIpAddressEntry")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperDeleteIPAddress")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperDeleteIPAddress(ntecontext: Int): Int

public actual fun deleteIPAddress(ntecontext: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperDeleteIPAddress(ntecontext.toInt()).toUInt()

public actual fun deleteIpForwardEntry(proute: ConstPtr<MibIpforwardrow>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry")

public actual fun deleteIpForwardEntry2(row: ConstPtr<MibIpforwardRow2>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry2")

public actual fun deleteIpNetEntry(parpentry: ConstPtr<MibIpnetrowLh>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry")

public actual fun deleteIpNetEntry2(row: ConstPtr<MibIpnetRow2>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentTcpPortReservation")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperDeletePersistentTcpPortReservation(startport: Int, numberofports: Int): Int

public actual fun deletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperDeletePersistentTcpPortReservation(startport.toInt(), numberofports.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentUdpPortReservation")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperDeletePersistentUdpPortReservation(startport: Int, numberofports: Int): Int

public actual fun deletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperDeletePersistentUdpPortReservation(startport.toInt(), numberofports.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperDeleteProxyArpEntry")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperDeleteProxyArpEntry(dwaddress: Int, dwmask: Int, dwifindex: Int): Int

public actual fun deleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperDeleteProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()).toUInt()

public actual fun deleteUnicastIpAddressEntry(row: ConstPtr<MibUnicastipaddressRow>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperDeleteUnicastIpAddressEntry")

public actual fun disableMediaSense(phandle: MutPtr<Handle>, poverlapped: ConstPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperDisableMediaSense")

public actual fun enableRouter(phandle: MutPtr<Handle>, poverlapped: MutPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperEnableRouter")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable(dwifindex: Int): Int

public actual fun flushIpNetTable(dwifindex: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable(dwifindex.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable2")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable2(family: Int, interfaceindex: Int): Int

public actual fun flushIpNetTable2(family: AddressFamily, interfaceindex: UInt): Win32Error =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable2(family.toInt(), interfaceindex.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperFlushIpPathTable")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperFlushIpPathTable(family: Int): Int

public actual fun flushIpPathTable(family: AddressFamily): Win32Error =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperFlushIpPathTable(family.toInt()).toUInt()

public actual fun freeDnsSettings(settings: MutPtr<DnsSettings>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperFreeDnsSettings")

public actual fun freeInterfaceDnsSettings(settings: MutPtr<DnsInterfaceSettings>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperFreeInterfaceDnsSettings")

public actual fun freeMibTable(memory: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperFreeMibTable")

public actual fun getAdapterIndex(adaptername: Pcwstr, ifindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetAdapterIndex")

public actual fun getAdapterOrderMap(): MutPtr<IpAdapterOrderMap> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetAdapterOrderMap")

public actual fun getAdaptersAddresses(family: UInt, flags: GetAdaptersAddressesFlags, reserved: ConstPtr<CVoid>, adapteraddresses: MutPtr<IpAdapterAddressesLh>, sizepointer: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersAddresses")

public actual fun getAdaptersInfo(adapterinfo: MutPtr<IpAdapterInfo>, sizepointer: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersInfo")

public actual fun getAnycastIpAddressEntry(row: MutPtr<MibAnycastipaddressRow>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressEntry")

public actual fun getAnycastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibAnycastipaddressTable>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressTable")

public actual fun getBestInterface(dwdestaddr: UInt, pdwbestifindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetBestInterface")

public actual fun getBestInterfaceEx(pdestaddr: ConstPtr<Sockaddr>, pdwbestifindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetBestInterfaceEx")

public actual fun getBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: MutPtr<MibIpforwardrow>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute")

public actual fun getBestRoute2(interfaceluid: ConstPtr<NetLuidLh>, interfaceindex: UInt, sourceaddress: ConstPtr<SockaddrInet>, destinationaddress: ConstPtr<SockaddrInet>, addresssortoptions: UInt, bestroute: MutPtr<MibIpforwardRow2>, bestsourceaddress: MutPtr<SockaddrInet>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentId")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentId(): Int

public actual fun getCurrentThreadCompartmentId(): NetIfCompartmentId =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentId().toUInt()

public actual fun getCurrentThreadCompartmentScope(compartmentscope: MutPtr<UInt>, compartmentid: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentScope")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperGetDefaultCompartmentId")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperGetDefaultCompartmentId(): Int

public actual fun getDefaultCompartmentId(): NetIfCompartmentId =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperGetDefaultCompartmentId().toUInt()

public actual fun getDnsSettings(settings: MutPtr<DnsSettings>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetDnsSettings")

public actual fun getExtendedTcpTable(ptcptable: MutPtr<CVoid>, pdwsize: MutPtr<UInt>, border: Bool, ulaf: UInt, tableclass: TcpTableClass, reserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetExtendedTcpTable")

public actual fun getExtendedUdpTable(pudptable: MutPtr<CVoid>, pdwsize: MutPtr<UInt>, border: Bool, ulaf: UInt, tableclass: UdpTableClass, reserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetExtendedUdpTable")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperGetFriendlyIfIndex")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperGetFriendlyIfIndex(ifindex: Int): Int

public actual fun getFriendlyIfIndex(ifindex: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperGetFriendlyIfIndex(ifindex.toInt()).toUInt()

public actual fun getIcmpStatistics(statistics: MutPtr<MibIcmp>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatistics")

public actual fun getIcmpStatisticsEx(statistics: MutPtr<MibIcmpExXpsp1>, family: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatisticsEx")

public actual fun getIfEntry(pifrow: MutPtr<MibIfrow>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry")

public actual fun getIfEntry2(row: MutPtr<MibIfRow2>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2")

public actual fun getIfEntry2Ex(level: MibIfEntryLevel, row: MutPtr<MibIfRow2>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2Ex")

public actual fun getIfStackTable(table: MutPtr<MutPtr<MibIfstackTable>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIfStackTable")

public actual fun getIfTable(piftable: MutPtr<MibIftable>, pdwsize: MutPtr<UInt>, border: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIfTable")

public actual fun getIfTable2(table: MutPtr<MutPtr<MibIfTable2>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2")

public actual fun getIfTable2Ex(level: MibIfTableLevel, table: MutPtr<MutPtr<MibIfTable2>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2Ex")

public actual fun getInterfaceActiveTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceActiveTimestampCapabilities")

public actual fun getInterfaceCurrentTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceCurrentTimestampCapabilities")

public actual fun getInterfaceDnsSettings(iface: Guid, settings: MutPtr<DnsInterfaceSettings>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceDnsSettings")

public actual fun getInterfaceHardwareTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceHardwareTimestampCapabilities")

public actual fun getInterfaceInfo(piftable: MutPtr<IpInterfaceInfo>, dwoutbuflen: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceInfo")

public actual fun getInterfaceSupportedTimestampCapabilities(interfaceluid: ConstPtr<NetLuidLh>, timestampcapabilites: MutPtr<InterfaceTimestampCapabilities>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceSupportedTimestampCapabilities")

public actual fun getInvertedIfStackTable(table: MutPtr<MutPtr<MibInvertedifstackTable>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetInvertedIfStackTable")

public actual fun getIpAddrTable(pipaddrtable: MutPtr<MibIpaddrtable>, pdwsize: MutPtr<UInt>, border: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpAddrTable")

public actual fun getIpErrorString(errorcode: UInt, buffer: Pwstr, size: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpErrorString")

public actual fun getIpForwardEntry2(row: MutPtr<MibIpforwardRow2>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardEntry2")

public actual fun getIpForwardTable(pipforwardtable: MutPtr<MibIpforwardtable>, pdwsize: MutPtr<UInt>, border: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable")

public actual fun getIpForwardTable2(family: AddressFamily, table: MutPtr<MutPtr<MibIpforwardTable2>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable2")

public actual fun getIpInterfaceEntry(row: MutPtr<MibIpinterfaceRow>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceEntry")

public actual fun getIpInterfaceTable(family: AddressFamily, table: MutPtr<MutPtr<MibIpinterfaceTable>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceTable")

public actual fun getIpNetEntry2(row: MutPtr<MibIpnetRow2>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpNetEntry2")

public actual fun getIpNetTable(ipnettable: MutPtr<MibIpnettable>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable")

public actual fun getIpNetTable2(family: AddressFamily, table: MutPtr<MutPtr<MibIpnetTable2>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable2")

public actual fun getIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: AddressFamily, bandwidthestimates: MutPtr<MibIpNetworkConnectionBandwidthEstimates>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpNetworkConnectionBandwidthEstimates")

public actual fun getIpPathEntry(row: MutPtr<MibIppathRow>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpPathEntry")

public actual fun getIpPathTable(family: AddressFamily, table: MutPtr<MutPtr<MibIppathTable>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpPathTable")

public actual fun getIpStatistics(statistics: MutPtr<MibIpstatsLh>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpStatistics")

public actual fun getIpStatisticsEx(statistics: MutPtr<MibIpstatsLh>, family: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetIpStatisticsEx")

public actual fun getJobCompartmentId(jobhandle: Handle): NetIfCompartmentId =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetJobCompartmentId")

public actual fun getMulticastIpAddressEntry(row: MutPtr<MibMulticastipaddressRow>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressEntry")

public actual fun getMulticastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibMulticastipaddressTable>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressTable")

public actual fun getNetworkConnectivityHint(connectivityhint: MutPtr<NlNetworkConnectivityHint>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHint")

public actual fun getNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: MutPtr<NlNetworkConnectivityHint>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHintForInterface")

public actual fun getNetworkInformation(networkguid: ConstPtr<Guid>, compartmentid: MutPtr<UInt>, siteid: MutPtr<UInt>, networkname: Pwstr, length: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetNetworkInformation")

public actual fun getNetworkParams(pfixedinfo: MutPtr<FixedInfoW2ksp1>, poutbuflen: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetNetworkParams")

public actual fun getNumberOfInterfaces(pdwnumif: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetNumberOfInterfaces")

public actual fun getOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: ConstPtr<ULong>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromPidAndInfo")

public actual fun getOwnerModuleFromTcp6Entry(ptcpentry: ConstPtr<MibTcp6rowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcp6Entry")

public actual fun getOwnerModuleFromTcpEntry(ptcpentry: ConstPtr<MibTcprowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcpEntry")

public actual fun getOwnerModuleFromUdp6Entry(pudpentry: ConstPtr<MibUdp6rowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdp6Entry")

public actual fun getOwnerModuleFromUdpEntry(pudpentry: ConstPtr<MibUdprowOwnerModule>, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr<CVoid>, pdwsize: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdpEntry")

public actual fun getPerAdapterInfo(ifindex: UInt, pperadapterinfo: MutPtr<IpPerAdapterInfoW2ksp1>, poutbuflen: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetPerAdapterInfo")

public actual fun getPerTcp6ConnectionEStats(row: ConstPtr<MibTcp6row>, estatstype: TcpEstatsType, rw: MutPtr<UByte>, rwversion: UInt, rwsize: UInt, ros: MutPtr<UByte>, rosversion: UInt, rossize: UInt, rod: MutPtr<UByte>, rodversion: UInt, rodsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetPerTcp6ConnectionEStats")

public actual fun getPerTcpConnectionEStats(row: ConstPtr<MibTcprowLh>, estatstype: TcpEstatsType, rw: MutPtr<UByte>, rwversion: UInt, rwsize: UInt, ros: MutPtr<UByte>, rosversion: UInt, rossize: UInt, rod: MutPtr<UByte>, rodversion: UInt, rodsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetPerTcpConnectionEStats")

public actual fun getRTTAndHopCount(destipaddress: UInt, hopcount: MutPtr<UInt>, maxhops: UInt, rtt: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetRTTAndHopCount")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperGetSessionCompartmentId")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperGetSessionCompartmentId(sessionid: Int): Int

public actual fun getSessionCompartmentId(sessionid: UInt): NetIfCompartmentId =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperGetSessionCompartmentId(sessionid.toInt()).toUInt()

public actual fun getTcp6Table(tcptable: MutPtr<MibTcp6table>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table")

public actual fun getTcp6Table2(tcptable: MutPtr<MibTcp6table2>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table2")

public actual fun getTcpStatistics(statistics: MutPtr<MibTcpstatsLh>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatistics")

public actual fun getTcpStatisticsEx(statistics: MutPtr<MibTcpstatsLh>, family: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx")

public actual fun getTcpStatisticsEx2(statistics: MutPtr<MibTcpstats2>, family: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx2")

public actual fun getTcpTable(tcptable: MutPtr<MibTcptable>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable")

public actual fun getTcpTable2(tcptable: MutPtr<MibTcptable2>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable2")

public actual fun getTeredoPort(port: MutPtr<UShort>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetTeredoPort")

public actual fun getUdp6Table(udp6table: MutPtr<MibUdp6table>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetUdp6Table")

public actual fun getUdpStatistics(stats: MutPtr<MibUdpstats>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatistics")

public actual fun getUdpStatisticsEx(statistics: MutPtr<MibUdpstats>, family: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx")

public actual fun getUdpStatisticsEx2(statistics: MutPtr<MibUdpstats2>, family: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx2")

public actual fun getUdpTable(udptable: MutPtr<MibUdptable>, sizepointer: MutPtr<UInt>, order: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetUdpTable")

public actual fun getUniDirectionalAdapterInfo(pipifinfo: MutPtr<IpUnidirectionalAdapterAddress>, dwoutbuflen: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetUniDirectionalAdapterInfo")

public actual fun getUnicastIpAddressEntry(row: MutPtr<MibUnicastipaddressRow>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressEntry")

public actual fun getUnicastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibUnicastipaddressTable>>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressTable")

public actual fun icmp6CreateFile(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIcmp6CreateFile")

public actual fun icmp6ParseReplies(replybuffer: MutPtr<CVoid>, replysize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIcmp6ParseReplies")

public actual fun icmp6SendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, sourceaddress: ConstPtr<SockaddrIn6>, destinationaddress: ConstPtr<SockaddrIn6>, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIcmp6SendEcho2")

public actual fun icmpCloseHandle(icmphandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIcmpCloseHandle")

public actual fun icmpCreateFile(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIcmpCreateFile")

public actual fun icmpParseReplies(replybuffer: MutPtr<CVoid>, replysize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIcmpParseReplies")

public actual fun icmpSendEcho(icmphandle: Handle, destinationaddress: UInt, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho")

public actual fun icmpSendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, destinationaddress: UInt, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2")

public actual fun icmpSendEcho2Ex(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, sourceaddress: UInt, destinationaddress: UInt, requestdata: ConstPtr<CVoid>, requestsize: UShort, requestoptions: ConstPtr<IpOptionInformation>, replybuffer: MutPtr<CVoid>, replysize: UInt, timeout: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2Ex")

public actual fun initializeIpForwardEntry(row: MutPtr<MibIpforwardRow2>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperInitializeIpForwardEntry")

public actual fun initializeIpInterfaceEntry(row: MutPtr<MibIpinterfaceRow>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperInitializeIpInterfaceEntry")

public actual fun initializeUnicastIpAddressEntry(row: MutPtr<MibUnicastipaddressRow>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperInitializeUnicastIpAddressEntry")

public actual fun ipReleaseAddress(adapterinfo: ConstPtr<IpAdapterIndexMap>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIpReleaseAddress")

public actual fun ipRenewAddress(adapterinfo: ConstPtr<IpAdapterIndexMap>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIpRenewAddress")

public actual fun lookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentTcpPortReservation")

public actual fun lookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr<ULong>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentUdpPortReservation")

public actual fun nhpAllocateAndGetInterfaceInfoFromStack(pptable: MutPtr<MutPtr<IpInterfaceNameInfoW2ksp1>>, pdwcount: MutPtr<UInt>, border: Bool, hheap: Handle, dwflags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperNhpAllocateAndGetInterfaceInfoFromStack")

public actual fun notifyAddrChange(handle: MutPtr<Handle>, overlapped: ConstPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperNotifyAddrChange")

public actual fun notifyIfTimestampConfigChange(callercontext: ConstPtr<CVoid>, callback: PinterfaceTimestampConfigChangeCallback, notificationhandle: MutPtr<Hiftimestampchange>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperNotifyIfTimestampConfigChange")

public actual fun notifyIpInterfaceChange(family: AddressFamily, callback: PipinterfaceChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperNotifyIpInterfaceChange")

public actual fun notifyNetworkConnectivityHintChange(callback: PnetworkConnectivityHintChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperNotifyNetworkConnectivityHintChange")

public actual fun notifyRouteChange(handle: MutPtr<Handle>, overlapped: ConstPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange")

public actual fun notifyRouteChange2(addressfamily: AddressFamily, callback: PipforwardChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange2")

public actual fun notifyStableUnicastIpAddressTable(family: AddressFamily, table: MutPtr<MutPtr<MibUnicastipaddressTable>>, callercallback: PstableUnicastIpaddressTableCallback, callercontext: ConstPtr<CVoid>, notificationhandle: MutPtr<Handle>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperNotifyStableUnicastIpAddressTable")

public actual fun notifyTeredoPortChange(callback: PteredoPortChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperNotifyTeredoPortChange")

public actual fun notifyUnicastIpAddressChange(family: AddressFamily, callback: PunicastIpaddressChangeCallback, callercontext: ConstPtr<CVoid>, initialnotification: Boolean, notificationhandle: MutPtr<Handle>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperNotifyUnicastIpAddressChange")

public actual fun parseNetworkString(networkstring: Pcwstr, types: UInt, addressinfo: MutPtr<NetAddressInfo>, portnumber: MutPtr<UShort>, prefixlength: MutPtr<UByte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperParseNetworkString")

public actual fun pfAddFiltersToInterface(ih: MutPtr<CVoid>, cinfilters: UInt, pfiltin: MutPtr<PfFilterDescriptor>, coutfilters: UInt, pfiltout: MutPtr<PfFilterDescriptor>, pfhandle: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfAddFiltersToInterface")

public actual fun pfAddGlobalFilterToInterface(pinterface: MutPtr<CVoid>, gffilter: GlobalFilter): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfAddGlobalFilterToInterface")

public actual fun pfBindInterfaceToIPAddress(pinterface: MutPtr<CVoid>, pfattype: Pfaddresstype, ipaddress: MutPtr<UByte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIPAddress")

public actual fun pfBindInterfaceToIndex(pinterface: MutPtr<CVoid>, dwindex: UInt, pfatlinktype: Pfaddresstype, linkipaddress: MutPtr<UByte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIndex")

public actual fun pfCreateInterface(dwname: UInt, inaction: PfforwardAction, outaction: PfforwardAction, buselog: Bool, bmustbeunique: Bool, ppinterface: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfCreateInterface")

public actual fun pfDeleteInterface(pinterface: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfDeleteInterface")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperPfDeleteLog")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperPfDeleteLog(): Int

public actual fun pfDeleteLog(): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperPfDeleteLog().toUInt()

public actual fun pfGetInterfaceStatistics(pinterface: MutPtr<CVoid>, ppfstats: MutPtr<PfInterfaceStats>, pdwbuffersize: MutPtr<UInt>, fresetcounters: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfGetInterfaceStatistics")

public actual fun pfMakeLog(hevent: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfMakeLog")

public actual fun pfRebindFilters(pinterface: MutPtr<CVoid>, platebindinfo: MutPtr<PfLatebindInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfRebindFilters")

public actual fun pfRemoveFilterHandles(pinterface: MutPtr<CVoid>, cfilters: UInt, pvhandles: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFilterHandles")

public actual fun pfRemoveFiltersFromInterface(ih: MutPtr<CVoid>, cinfilters: UInt, pfiltin: MutPtr<PfFilterDescriptor>, coutfilters: UInt, pfiltout: MutPtr<PfFilterDescriptor>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFiltersFromInterface")

public actual fun pfRemoveGlobalFilterFromInterface(pinterface: MutPtr<CVoid>, gffilter: GlobalFilter): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfRemoveGlobalFilterFromInterface")

public actual fun pfSetLogBuffer(pbbuffer: MutPtr<UByte>, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: MutPtr<UInt>, pdwlostentries: MutPtr<UInt>, pdwsizeused: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfSetLogBuffer")

public actual fun pfTestPacket(pininterface: MutPtr<CVoid>, poutinterface: MutPtr<CVoid>, cbytes: UInt, pbpacket: MutPtr<UByte>, ppaction: MutPtr<PfforwardAction>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfTestPacket")

public actual fun pfUnBindInterface(pinterface: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperPfUnBindInterface")

public actual fun registerInterfaceTimestampConfigChange(callback: PinterfaceTimestampConfigChangeCallback, callercontext: ConstPtr<CVoid>, notificationhandle: MutPtr<Hiftimestampchange>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperRegisterInterfaceTimestampConfigChange")

public actual fun resolveIpNetEntry2(row: MutPtr<MibIpnetRow2>, sourceaddress: ConstPtr<SockaddrInet>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperResolveIpNetEntry2")

public actual fun resolveNeighbor(networkaddress: ConstPtr<Sockaddr>, physicaladdress: MutPtr<CVoid>, physicaladdresslength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperResolveNeighbor")

public actual fun restoreMediaSense(poverlapped: ConstPtr<Overlapped>, lpdwenablecount: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperRestoreMediaSense")

public actual fun sendARP(destip: UInt, srcip: UInt, pmacaddr: MutPtr<CVoid>, phyaddrlen: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSendARP")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentId")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentId(compartmentid: Int): Int

public actual fun setCurrentThreadCompartmentId(compartmentid: NetIfCompartmentId): Win32Error =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentId(compartmentid.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentScope")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentScope(compartmentscope: Int): Int

public actual fun setCurrentThreadCompartmentScope(compartmentscope: UInt): Win32Error =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentScope(compartmentscope.toInt()).toUInt()

public actual fun setDnsSettings(settings: ConstPtr<DnsSettings>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetDnsSettings")

public actual fun setIfEntry(pifrow: ConstPtr<MibIfrow>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetIfEntry")

public actual fun setInterfaceDnsSettings(iface: Guid, settings: ConstPtr<DnsInterfaceSettings>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetInterfaceDnsSettings")

public actual fun setIpForwardEntry(proute: ConstPtr<MibIpforwardrow>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry")

public actual fun setIpForwardEntry2(route: ConstPtr<MibIpforwardRow2>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry2")

public actual fun setIpInterfaceEntry(row: MutPtr<MibIpinterfaceRow>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetIpInterfaceEntry")

public actual fun setIpNetEntry(parpentry: ConstPtr<MibIpnetrowLh>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry")

public actual fun setIpNetEntry2(row: ConstPtr<MibIpnetRow2>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry2")

public actual fun setIpStatistics(pipstats: ConstPtr<MibIpstatsLh>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetIpStatistics")

public actual fun setIpStatisticsEx(statistics: ConstPtr<MibIpstatsLh>, family: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetIpStatisticsEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperSetIpTTL")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperSetIpTTL(nttl: Int): Int

public actual fun setIpTTL(nttl: UInt): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperSetIpTTL(nttl.toInt()).toUInt()

public actual fun setJobCompartmentId(jobhandle: Handle, compartmentid: NetIfCompartmentId): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetJobCompartmentId")

public actual fun setNetworkInformation(networkguid: ConstPtr<Guid>, compartmentid: NetIfCompartmentId, networkname: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetNetworkInformation")

public actual fun setPerTcp6ConnectionEStats(row: ConstPtr<MibTcp6row>, estatstype: TcpEstatsType, rw: ConstPtr<UByte>, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetPerTcp6ConnectionEStats")

public actual fun setPerTcpConnectionEStats(row: ConstPtr<MibTcprowLh>, estatstype: TcpEstatsType, rw: ConstPtr<UByte>, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetPerTcpConnectionEStats")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementIphelperSetSessionCompartmentId")
private external fun wasiWindowssysWindowsWin32NetworkmanagementIphelperSetSessionCompartmentId(sessionid: Int, compartmentid: Int): Int

public actual fun setSessionCompartmentId(sessionid: UInt, compartmentid: NetIfCompartmentId): Win32Error =
    wasiWindowssysWindowsWin32NetworkmanagementIphelperSetSessionCompartmentId(sessionid.toInt(), compartmentid.toInt()).toUInt()

public actual fun setTcpEntry(ptcprow: ConstPtr<MibTcprowLh>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetTcpEntry")

public actual fun setUnicastIpAddressEntry(row: ConstPtr<MibUnicastipaddressRow>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperSetUnicastIpAddressEntry")

public actual fun unenableRouter(poverlapped: ConstPtr<Overlapped>, lpdwenablecount: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperUnenableRouter")

public actual fun unregisterInterfaceTimestampConfigChange(notificationhandle: Hiftimestampchange): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperUnregisterInterfaceTimestampConfigChange")

public actual fun ifIndextoname(interfaceindex: UInt, interfacename: Pstr): Pstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIfIndextoname")

public actual fun ifNametoindex(interfacename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementIphelperIfNametoindex")
