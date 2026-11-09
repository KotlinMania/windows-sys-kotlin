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

private val _windowsWin32NetworkmanagementIphelperNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AddIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: Long, nteinstance: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_AddIPAddress(address.toInt(), ipmask.toInt(), ifindex.toInt(), ntecontext.toString(), nteinstance.toString()) as Int).toUInt() else 0u

public actual fun CancelIPChangeNotify(notifyoverlapped: Long): BOOL =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CancelIPChangeNotify(notifyoverlapped.toString()) as Int) else 0

public actual fun CancelIfTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE) {
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        _windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CancelIfTimestampConfigChange(notificationhandle.toString())
    }
}

public actual fun CancelMibChangeNotify2(notificationhandle: HANDLE): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CancelMibChangeNotify2(notificationhandle.toString()) as Int).toUInt() else 0u

public actual fun CaptureInterfaceHardwareCrossTimestamp(interfaceluid: Long, crosstimestamp: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CaptureInterfaceHardwareCrossTimestamp(interfaceluid.toString(), crosstimestamp.toString()) as Int).toUInt() else 0u

public actual fun ConvertCompartmentGuidToId(compartmentguid: Long, compartmentid: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentGuidToId(compartmentguid.toString(), compartmentid.toString()) as Int).toUInt() else 0u

public actual fun ConvertCompartmentIdToGuid(compartmentid: NET_IF_COMPARTMENT_ID, compartmentguid: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertCompartmentIdToGuid(compartmentid.toInt(), compartmentguid.toString()) as Int).toUInt() else 0u

public actual fun ConvertInterfaceAliasToLuid(interfacealias: PCWSTR, interfaceluid: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceAliasToLuid(interfacealias.toString(), interfaceluid.toString()) as Int).toUInt() else 0u

public actual fun ConvertInterfaceGuidToLuid(interfaceguid: Long, interfaceluid: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceGuidToLuid(interfaceguid.toString(), interfaceluid.toString()) as Int).toUInt() else 0u

public actual fun ConvertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceIndexToLuid(interfaceindex.toInt(), interfaceluid.toString()) as Int).toUInt() else 0u

public actual fun ConvertInterfaceLuidToAlias(interfaceluid: Long, interfacealias: PWSTR, length: ULong): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToAlias(interfaceluid.toString(), interfacealias.toString(), length.toString()) as Int).toUInt() else 0u

public actual fun ConvertInterfaceLuidToGuid(interfaceluid: Long, interfaceguid: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToGuid(interfaceluid.toString(), interfaceguid.toString()) as Int).toUInt() else 0u

public actual fun ConvertInterfaceLuidToIndex(interfaceluid: Long, interfaceindex: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToIndex(interfaceluid.toString(), interfaceindex.toString()) as Int).toUInt() else 0u

public actual fun ConvertInterfaceLuidToNameA(interfaceluid: Long, interfacename: PSTR, length: ULong): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameA(interfaceluid.toString(), interfacename.toString(), length.toString()) as Int).toUInt() else 0u

public actual fun ConvertInterfaceLuidToNameW(interfaceluid: Long, interfacename: PWSTR, length: ULong): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceLuidToNameW(interfaceluid.toString(), interfacename.toString(), length.toString()) as Int).toUInt() else 0u

public actual fun ConvertInterfaceNameToLuidA(interfacename: PCSTR, interfaceluid: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidA(interfacename.toString(), interfaceluid.toString()) as Int).toUInt() else 0u

public actual fun ConvertInterfaceNameToLuidW(interfacename: PCWSTR, interfaceluid: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertInterfaceNameToLuidW(interfacename.toString(), interfaceluid.toString()) as Int).toUInt() else 0u

public actual fun ConvertIpv4MaskToLength(mask: UInt, masklength: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertIpv4MaskToLength(mask.toInt(), masklength.toString()) as Int).toUInt() else 0u

public actual fun ConvertLengthToIpv4Mask(masklength: UInt, mask: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ConvertLengthToIpv4Mask(masklength.toInt(), mask.toString()) as Int).toUInt() else 0u

public actual fun CreateAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CreateAnycastIpAddressEntry(row.toString()) as Int).toUInt() else 0u

public actual fun CreateIpForwardEntry(proute: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry(proute.toString()) as Int).toUInt() else 0u

public actual fun CreateIpForwardEntry2(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CreateIpForwardEntry2(row.toString()) as Int).toUInt() else 0u

public actual fun CreateIpNetEntry(parpentry: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry(parpentry.toString()) as Int).toUInt() else 0u

public actual fun CreateIpNetEntry2(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CreateIpNetEntry2(row.toString()) as Int).toUInt() else 0u

public actual fun CreatePersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentTcpPortReservation(startport.toInt(), numberofports.toInt(), token.toString()) as Int).toUInt() else 0u

public actual fun CreatePersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CreatePersistentUdpPortReservation(startport.toInt(), numberofports.toInt(), token.toString()) as Int).toUInt() else 0u

public actual fun CreateProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CreateProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()) as Int).toUInt() else 0u

public actual fun CreateSortedAddressPairs(sourceaddresslist: Long, sourceaddresscount: UInt, destinationaddresslist: Long, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: Long, sortedaddresspaircount: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CreateSortedAddressPairs(sourceaddresslist.toString(), sourceaddresscount.toInt(), destinationaddresslist.toString(), destinationaddresscount.toInt(), addresssortoptions.toInt(), sortedaddresspairlist.toString(), sortedaddresspaircount.toString()) as Int).toUInt() else 0u

public actual fun CreateUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_CreateUnicastIpAddressEntry(row.toString()) as Int).toUInt() else 0u

public actual fun DeleteAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_DeleteAnycastIpAddressEntry(row.toString()) as Int).toUInt() else 0u

public actual fun DeleteIPAddress(ntecontext: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_DeleteIPAddress(ntecontext.toInt()) as Int).toUInt() else 0u

public actual fun DeleteIpForwardEntry(proute: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry(proute.toString()) as Int).toUInt() else 0u

public actual fun DeleteIpForwardEntry2(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpForwardEntry2(row.toString()) as Int).toUInt() else 0u

public actual fun DeleteIpNetEntry(parpentry: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry(parpentry.toString()) as Int).toUInt() else 0u

public actual fun DeleteIpNetEntry2(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_DeleteIpNetEntry2(row.toString()) as Int).toUInt() else 0u

public actual fun DeletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentTcpPortReservation(startport.toInt(), numberofports.toInt()) as Int).toUInt() else 0u

public actual fun DeletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_DeletePersistentUdpPortReservation(startport.toInt(), numberofports.toInt()) as Int).toUInt() else 0u

public actual fun DeleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_DeleteProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()) as Int).toUInt() else 0u

public actual fun DeleteUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_DeleteUnicastIpAddressEntry(row.toString()) as Int).toUInt() else 0u

public actual fun DisableMediaSense(phandle: Long, poverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_DisableMediaSense(phandle.toString(), poverlapped.toString()) as Int).toUInt() else 0u

public actual fun EnableRouter(phandle: Long, poverlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_EnableRouter(phandle.toString(), poverlapped.toString()) as Int).toUInt() else 0u

public actual fun FlushIpNetTable(dwifindex: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable(dwifindex.toInt()) as Int).toUInt() else 0u

public actual fun FlushIpNetTable2(family: ADDRESS_FAMILY, interfaceindex: UInt): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_FlushIpNetTable2(family.toInt(), interfaceindex.toInt()) as Int).toUInt() else 0u

public actual fun FlushIpPathTable(family: ADDRESS_FAMILY): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_FlushIpPathTable(family.toInt()) as Int).toUInt() else 0u

public actual fun FreeDnsSettings(settings: Long) {
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        _windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_FreeDnsSettings(settings.toString())
    }
}

public actual fun FreeInterfaceDnsSettings(settings: Long) {
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        _windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_FreeInterfaceDnsSettings(settings.toString())
    }
}

public actual fun FreeMibTable(memory: Long) {
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        _windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_FreeMibTable(memory.toString())
    }
}

public actual fun GetAdapterIndex(adaptername: PCWSTR, ifindex: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetAdapterIndex(adaptername.toString(), ifindex.toString()) as Int).toUInt() else 0u

public actual fun GetAdapterOrderMap(): Long =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetAdapterOrderMap() as String).toLong() else 0L

public actual fun GetAdaptersAddresses(family: UInt, flags: GET_ADAPTERS_ADDRESSES_FLAGS, reserved: Long, adapteraddresses: Long, sizepointer: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersAddresses(family.toInt(), flags.toInt(), reserved.toString(), adapteraddresses.toString(), sizepointer.toString()) as Int).toUInt() else 0u

public actual fun GetAdaptersInfo(adapterinfo: Long, sizepointer: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetAdaptersInfo(adapterinfo.toString(), sizepointer.toString()) as Int).toUInt() else 0u

public actual fun GetAnycastIpAddressEntry(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressEntry(row.toString()) as Int).toUInt() else 0u

public actual fun GetAnycastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetAnycastIpAddressTable(family.toInt(), table.toString()) as Int).toUInt() else 0u

public actual fun GetBestInterface(dwdestaddr: UInt, pdwbestifindex: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetBestInterface(dwdestaddr.toInt(), pdwbestifindex.toString()) as Int).toUInt() else 0u

public actual fun GetBestInterfaceEx(pdestaddr: Long, pdwbestifindex: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetBestInterfaceEx(pdestaddr.toString(), pdwbestifindex.toString()) as Int).toUInt() else 0u

public actual fun GetBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute(dwdestaddr.toInt(), dwsourceaddr.toInt(), pbestroute.toString()) as Int).toUInt() else 0u

public actual fun GetBestRoute2(interfaceluid: Long, interfaceindex: UInt, sourceaddress: Long, destinationaddress: Long, addresssortoptions: UInt, bestroute: Long, bestsourceaddress: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetBestRoute2(interfaceluid.toString(), interfaceindex.toInt(), sourceaddress.toString(), destinationaddress.toString(), addresssortoptions.toInt(), bestroute.toString(), bestsourceaddress.toString()) as Int).toUInt() else 0u

public actual fun GetCurrentThreadCompartmentId(): NET_IF_COMPARTMENT_ID =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentId() as Int).toUInt() else 0u

public actual fun GetCurrentThreadCompartmentScope(compartmentscope: Long, compartmentid: Long) {
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        _windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetCurrentThreadCompartmentScope(compartmentscope.toString(), compartmentid.toString())
    }
}

public actual fun GetDefaultCompartmentId(): NET_IF_COMPARTMENT_ID =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetDefaultCompartmentId() as Int).toUInt() else 0u

public actual fun GetDnsSettings(settings: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetDnsSettings(settings.toString()) as Int).toUInt() else 0u

public actual fun GetExtendedTcpTable(ptcptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: TCP_TABLE_CLASS, reserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetExtendedTcpTable(ptcptable.toString(), pdwsize.toString(), border, ulaf.toInt(), tableclass, reserved.toInt()) as Int).toUInt() else 0u

public actual fun GetExtendedUdpTable(pudptable: Long, pdwsize: Long, border: BOOL, ulaf: UInt, tableclass: UDP_TABLE_CLASS, reserved: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetExtendedUdpTable(pudptable.toString(), pdwsize.toString(), border, ulaf.toInt(), tableclass, reserved.toInt()) as Int).toUInt() else 0u

public actual fun GetFriendlyIfIndex(ifindex: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetFriendlyIfIndex(ifindex.toInt()) as Int).toUInt() else 0u

public actual fun GetIcmpStatistics(statistics: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatistics(statistics.toString()) as Int).toUInt() else 0u

public actual fun GetIcmpStatisticsEx(statistics: Long, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIcmpStatisticsEx(statistics.toString(), family.toInt()) as Int).toUInt() else 0u

public actual fun GetIfEntry(pifrow: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry(pifrow.toString()) as Int).toUInt() else 0u

public actual fun GetIfEntry2(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2(row.toString()) as Int).toUInt() else 0u

public actual fun GetIfEntry2Ex(level: MIB_IF_ENTRY_LEVEL, row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIfEntry2Ex(level, row.toString()) as Int).toUInt() else 0u

public actual fun GetIfStackTable(table: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIfStackTable(table.toString()) as Int).toUInt() else 0u

public actual fun GetIfTable(piftable: Long, pdwsize: Long, border: BOOL): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIfTable(piftable.toString(), pdwsize.toString(), border) as Int).toUInt() else 0u

public actual fun GetIfTable2(table: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2(table.toString()) as Int).toUInt() else 0u

public actual fun GetIfTable2Ex(level: MIB_IF_TABLE_LEVEL, table: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIfTable2Ex(level, table.toString()) as Int).toUInt() else 0u

public actual fun GetInterfaceActiveTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceActiveTimestampCapabilities(interfaceluid.toString(), timestampcapabilites.toString()) as Int).toUInt() else 0u

public actual fun GetInterfaceCurrentTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceCurrentTimestampCapabilities(interfaceluid.toString(), timestampcapabilites.toString()) as Int).toUInt() else 0u

public actual fun GetInterfaceDnsSettings(iface: GUID, settings: Long): WIN32_ERROR =
    0u

public actual fun GetInterfaceHardwareTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceHardwareTimestampCapabilities(interfaceluid.toString(), timestampcapabilites.toString()) as Int).toUInt() else 0u

public actual fun GetInterfaceInfo(piftable: Long, dwoutbuflen: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceInfo(piftable.toString(), dwoutbuflen.toString()) as Int).toUInt() else 0u

public actual fun GetInterfaceSupportedTimestampCapabilities(interfaceluid: Long, timestampcapabilites: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetInterfaceSupportedTimestampCapabilities(interfaceluid.toString(), timestampcapabilites.toString()) as Int).toUInt() else 0u

public actual fun GetInvertedIfStackTable(table: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetInvertedIfStackTable(table.toString()) as Int).toUInt() else 0u

public actual fun GetIpAddrTable(pipaddrtable: Long, pdwsize: Long, border: BOOL): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpAddrTable(pipaddrtable.toString(), pdwsize.toString(), border) as Int).toUInt() else 0u

public actual fun GetIpErrorString(errorcode: UInt, buffer: PWSTR, size: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpErrorString(errorcode.toInt(), buffer.toString(), size.toString()) as Int).toUInt() else 0u

public actual fun GetIpForwardEntry2(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardEntry2(row.toString()) as Int).toUInt() else 0u

public actual fun GetIpForwardTable(pipforwardtable: Long, pdwsize: Long, border: BOOL): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable(pipforwardtable.toString(), pdwsize.toString(), border) as Int).toUInt() else 0u

public actual fun GetIpForwardTable2(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpForwardTable2(family.toInt(), table.toString()) as Int).toUInt() else 0u

public actual fun GetIpInterfaceEntry(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceEntry(row.toString()) as Int).toUInt() else 0u

public actual fun GetIpInterfaceTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpInterfaceTable(family.toInt(), table.toString()) as Int).toUInt() else 0u

public actual fun GetIpNetEntry2(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetEntry2(row.toString()) as Int).toUInt() else 0u

public actual fun GetIpNetTable(ipnettable: Long, sizepointer: Long, order: BOOL): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable(ipnettable.toString(), sizepointer.toString(), order) as Int).toUInt() else 0u

public actual fun GetIpNetTable2(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetTable2(family.toInt(), table.toString()) as Int).toUInt() else 0u

public actual fun GetIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: ADDRESS_FAMILY, bandwidthestimates: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpNetworkConnectionBandwidthEstimates(interfaceindex.toInt(), addressfamily.toInt(), bandwidthestimates.toString()) as Int).toUInt() else 0u

public actual fun GetIpPathEntry(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpPathEntry(row.toString()) as Int).toUInt() else 0u

public actual fun GetIpPathTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpPathTable(family.toInt(), table.toString()) as Int).toUInt() else 0u

public actual fun GetIpStatistics(statistics: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpStatistics(statistics.toString()) as Int).toUInt() else 0u

public actual fun GetIpStatisticsEx(statistics: Long, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetIpStatisticsEx(statistics.toString(), family.toInt()) as Int).toUInt() else 0u

public actual fun GetJobCompartmentId(jobhandle: HANDLE): NET_IF_COMPARTMENT_ID =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetJobCompartmentId(jobhandle.toString()) as Int).toUInt() else 0u

public actual fun GetMulticastIpAddressEntry(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressEntry(row.toString()) as Int).toUInt() else 0u

public actual fun GetMulticastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetMulticastIpAddressTable(family.toInt(), table.toString()) as Int).toUInt() else 0u

public actual fun GetNetworkConnectivityHint(connectivityhint: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHint(connectivityhint.toString()) as Int).toUInt() else 0u

public actual fun GetNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkConnectivityHintForInterface(interfaceindex.toInt(), connectivityhint.toString()) as Int).toUInt() else 0u

public actual fun GetNetworkInformation(networkguid: Long, compartmentid: Long, siteid: Long, networkname: PWSTR, length: UInt): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkInformation(networkguid.toString(), compartmentid.toString(), siteid.toString(), networkname.toString(), length.toInt()) as Int).toUInt() else 0u

public actual fun GetNetworkParams(pfixedinfo: Long, poutbuflen: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetNetworkParams(pfixedinfo.toString(), poutbuflen.toString()) as Int).toUInt() else 0u

public actual fun GetNumberOfInterfaces(pdwnumif: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetNumberOfInterfaces(pdwnumif.toString()) as Int).toUInt() else 0u

public actual fun GetOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromPidAndInfo(ulpid.toInt(), pinfo.toString(), cls, pbuffer.toString(), pdwsize.toString()) as Int).toUInt() else 0u

public actual fun GetOwnerModuleFromTcp6Entry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcp6Entry(ptcpentry.toString(), cls, pbuffer.toString(), pdwsize.toString()) as Int).toUInt() else 0u

public actual fun GetOwnerModuleFromTcpEntry(ptcpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromTcpEntry(ptcpentry.toString(), cls, pbuffer.toString(), pdwsize.toString()) as Int).toUInt() else 0u

public actual fun GetOwnerModuleFromUdp6Entry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdp6Entry(pudpentry.toString(), cls, pbuffer.toString(), pdwsize.toString()) as Int).toUInt() else 0u

public actual fun GetOwnerModuleFromUdpEntry(pudpentry: Long, cls: TCPIP_OWNER_MODULE_INFO_CLASS, pbuffer: Long, pdwsize: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetOwnerModuleFromUdpEntry(pudpentry.toString(), cls, pbuffer.toString(), pdwsize.toString()) as Int).toUInt() else 0u

public actual fun GetPerAdapterInfo(ifindex: UInt, pperadapterinfo: Long, poutbuflen: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetPerAdapterInfo(ifindex.toInt(), pperadapterinfo.toString(), poutbuflen.toString()) as Int).toUInt() else 0u

public actual fun GetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetPerTcp6ConnectionEStats(row.toString(), estatstype, rw.toString(), rwversion.toInt(), rwsize.toInt(), ros.toString(), rosversion.toInt(), rossize.toInt(), rod.toString(), rodversion.toInt(), rodsize.toInt()) as Int).toUInt() else 0u

public actual fun GetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, ros: Long, rosversion: UInt, rossize: UInt, rod: Long, rodversion: UInt, rodsize: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetPerTcpConnectionEStats(row.toString(), estatstype, rw.toString(), rwversion.toInt(), rwsize.toInt(), ros.toString(), rosversion.toInt(), rossize.toInt(), rod.toString(), rodversion.toInt(), rodsize.toInt()) as Int).toUInt() else 0u

public actual fun GetRTTAndHopCount(destipaddress: UInt, hopcount: Long, maxhops: UInt, rtt: Long): BOOL =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetRTTAndHopCount(destipaddress.toInt(), hopcount.toString(), maxhops.toInt(), rtt.toString()) as Int) else 0

public actual fun GetSessionCompartmentId(sessionid: UInt): NET_IF_COMPARTMENT_ID =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetSessionCompartmentId(sessionid.toInt()) as Int).toUInt() else 0u

public actual fun GetTcp6Table(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table(tcptable.toString(), sizepointer.toString(), order) as Int).toUInt() else 0u

public actual fun GetTcp6Table2(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetTcp6Table2(tcptable.toString(), sizepointer.toString(), order) as Int).toUInt() else 0u

public actual fun GetTcpStatistics(statistics: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatistics(statistics.toString()) as Int).toUInt() else 0u

public actual fun GetTcpStatisticsEx(statistics: Long, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx(statistics.toString(), family.toInt()) as Int).toUInt() else 0u

public actual fun GetTcpStatisticsEx2(statistics: Long, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetTcpStatisticsEx2(statistics.toString(), family.toInt()) as Int).toUInt() else 0u

public actual fun GetTcpTable(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable(tcptable.toString(), sizepointer.toString(), order) as Int).toUInt() else 0u

public actual fun GetTcpTable2(tcptable: Long, sizepointer: Long, order: BOOL): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetTcpTable2(tcptable.toString(), sizepointer.toString(), order) as Int).toUInt() else 0u

public actual fun GetTeredoPort(port: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetTeredoPort(port.toString()) as Int).toUInt() else 0u

public actual fun GetUdp6Table(udp6table: Long, sizepointer: Long, order: BOOL): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetUdp6Table(udp6table.toString(), sizepointer.toString(), order) as Int).toUInt() else 0u

public actual fun GetUdpStatistics(stats: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatistics(stats.toString()) as Int).toUInt() else 0u

public actual fun GetUdpStatisticsEx(statistics: Long, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx(statistics.toString(), family.toInt()) as Int).toUInt() else 0u

public actual fun GetUdpStatisticsEx2(statistics: Long, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetUdpStatisticsEx2(statistics.toString(), family.toInt()) as Int).toUInt() else 0u

public actual fun GetUdpTable(udptable: Long, sizepointer: Long, order: BOOL): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetUdpTable(udptable.toString(), sizepointer.toString(), order) as Int).toUInt() else 0u

public actual fun GetUniDirectionalAdapterInfo(pipifinfo: Long, dwoutbuflen: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetUniDirectionalAdapterInfo(pipifinfo.toString(), dwoutbuflen.toString()) as Int).toUInt() else 0u

public actual fun GetUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressEntry(row.toString()) as Int).toUInt() else 0u

public actual fun GetUnicastIpAddressTable(family: ADDRESS_FAMILY, table: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_GetUnicastIpAddressTable(family.toInt(), table.toString()) as Int).toUInt() else 0u

public actual fun Icmp6CreateFile(): HANDLE =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_Icmp6CreateFile() as String).toLong() else 0L

public actual fun Icmp6ParseReplies(replybuffer: Long, replysize: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_Icmp6ParseReplies(replybuffer.toString(), replysize.toInt()) as Int).toUInt() else 0u

public actual fun Icmp6SendEcho2(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, sourceaddress: Long, destinationaddress: Long, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun IcmpCloseHandle(icmphandle: HANDLE): BOOL =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_IcmpCloseHandle(icmphandle.toString()) as Int) else 0

public actual fun IcmpCreateFile(): HANDLE =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_IcmpCreateFile() as String).toLong() else 0L

public actual fun IcmpParseReplies(replybuffer: Long, replysize: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_IcmpParseReplies(replybuffer.toString(), replysize.toInt()) as Int).toUInt() else 0u

public actual fun IcmpSendEcho(icmphandle: HANDLE, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_IcmpSendEcho(icmphandle.toString(), destinationaddress.toInt(), requestdata.toString(), requestsize.toInt(), requestoptions.toString(), replybuffer.toString(), replysize.toInt(), timeout.toInt()) as Int).toUInt() else 0u

public actual fun IcmpSendEcho2(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun IcmpSendEcho2Ex(icmphandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, sourceaddress: UInt, destinationaddress: UInt, requestdata: Long, requestsize: UShort, requestoptions: Long, replybuffer: Long, replysize: UInt, timeout: UInt): UInt =
    0u

public actual fun InitializeIpForwardEntry(row: Long) {
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        _windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_InitializeIpForwardEntry(row.toString())
    }
}

public actual fun InitializeIpInterfaceEntry(row: Long) {
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        _windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_InitializeIpInterfaceEntry(row.toString())
    }
}

public actual fun InitializeUnicastIpAddressEntry(row: Long) {
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        _windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_InitializeUnicastIpAddressEntry(row.toString())
    }
}

public actual fun IpReleaseAddress(adapterinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_IpReleaseAddress(adapterinfo.toString()) as Int).toUInt() else 0u

public actual fun IpRenewAddress(adapterinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_IpRenewAddress(adapterinfo.toString()) as Int).toUInt() else 0u

public actual fun LookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentTcpPortReservation(startport.toInt(), numberofports.toInt(), token.toString()) as Int).toUInt() else 0u

public actual fun LookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_LookupPersistentUdpPortReservation(startport.toInt(), numberofports.toInt(), token.toString()) as Int).toUInt() else 0u

public actual fun NhpAllocateAndGetInterfaceInfoFromStack(pptable: Long, pdwcount: Long, border: BOOL, hheap: HANDLE, dwflags: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_NhpAllocateAndGetInterfaceInfoFromStack(pptable.toString(), pdwcount.toString(), border, hheap.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun NotifyAddrChange(handle: Long, overlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_NotifyAddrChange(handle.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun NotifyIfTimestampConfigChange(callercontext: Long, callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, notificationhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_NotifyIfTimestampConfigChange(callercontext.toString(), callback.toLong().toString(), notificationhandle.toString()) as Int).toUInt() else 0u

public actual fun NotifyIpInterfaceChange(family: ADDRESS_FAMILY, callback: PIPINTERFACE_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_NotifyIpInterfaceChange(family.toInt(), callback.toLong().toString(), callercontext.toString(), initialnotification, notificationhandle.toString()) as Int).toUInt() else 0u

public actual fun NotifyNetworkConnectivityHintChange(callback: PNETWORK_CONNECTIVITY_HINT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_NotifyNetworkConnectivityHintChange(callback.toLong().toString(), callercontext.toString(), initialnotification, notificationhandle.toString()) as Int).toUInt() else 0u

public actual fun NotifyRouteChange(handle: Long, overlapped: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange(handle.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun NotifyRouteChange2(addressfamily: ADDRESS_FAMILY, callback: PIPFORWARD_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_NotifyRouteChange2(addressfamily.toInt(), callback.toLong().toString(), callercontext.toString(), initialnotification, notificationhandle.toString()) as Int).toUInt() else 0u

public actual fun NotifyStableUnicastIpAddressTable(family: ADDRESS_FAMILY, table: Long, callercallback: PSTABLE_UNICAST_IPADDRESS_TABLE_CALLBACK, callercontext: Long, notificationhandle: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_NotifyStableUnicastIpAddressTable(family.toInt(), table.toString(), callercallback.toLong().toString(), callercontext.toString(), notificationhandle.toString()) as Int).toUInt() else 0u

public actual fun NotifyTeredoPortChange(callback: PTEREDO_PORT_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_NotifyTeredoPortChange(callback.toLong().toString(), callercontext.toString(), initialnotification, notificationhandle.toString()) as Int).toUInt() else 0u

public actual fun NotifyUnicastIpAddressChange(family: ADDRESS_FAMILY, callback: PUNICAST_IPADDRESS_CHANGE_CALLBACK, callercontext: Long, initialnotification: Boolean, notificationhandle: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_NotifyUnicastIpAddressChange(family.toInt(), callback.toLong().toString(), callercontext.toString(), initialnotification, notificationhandle.toString()) as Int).toUInt() else 0u

public actual fun ParseNetworkString(networkstring: PCWSTR, types: UInt, addressinfo: Long, portnumber: Long, prefixlength: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ParseNetworkString(networkstring.toString(), types.toInt(), addressinfo.toString(), portnumber.toString(), prefixlength.toString()) as Int).toUInt() else 0u

public actual fun PfAddFiltersToInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long, pfhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfAddFiltersToInterface(ih.toString(), cinfilters.toInt(), pfiltin.toString(), coutfilters.toInt(), pfiltout.toString(), pfhandle.toString()) as Int).toUInt() else 0u

public actual fun PfAddGlobalFilterToInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfAddGlobalFilterToInterface(pinterface.toString(), gffilter) as Int).toUInt() else 0u

public actual fun PfBindInterfaceToIPAddress(pinterface: Long, pfattype: PFADDRESSTYPE, ipaddress: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIPAddress(pinterface.toString(), pfattype, ipaddress.toString()) as Int).toUInt() else 0u

public actual fun PfBindInterfaceToIndex(pinterface: Long, dwindex: UInt, pfatlinktype: PFADDRESSTYPE, linkipaddress: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfBindInterfaceToIndex(pinterface.toString(), dwindex.toInt(), pfatlinktype, linkipaddress.toString()) as Int).toUInt() else 0u

public actual fun PfCreateInterface(dwname: UInt, inaction: PFFORWARD_ACTION, outaction: PFFORWARD_ACTION, buselog: BOOL, bmustbeunique: BOOL, ppinterface: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfCreateInterface(dwname.toInt(), inaction, outaction, buselog, bmustbeunique, ppinterface.toString()) as Int).toUInt() else 0u

public actual fun PfDeleteInterface(pinterface: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfDeleteInterface(pinterface.toString()) as Int).toUInt() else 0u

public actual fun PfDeleteLog(): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfDeleteLog() as Int).toUInt() else 0u

public actual fun PfGetInterfaceStatistics(pinterface: Long, ppfstats: Long, pdwbuffersize: Long, fresetcounters: BOOL): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfGetInterfaceStatistics(pinterface.toString(), ppfstats.toString(), pdwbuffersize.toString(), fresetcounters) as Int).toUInt() else 0u

public actual fun PfMakeLog(hevent: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfMakeLog(hevent.toString()) as Int).toUInt() else 0u

public actual fun PfRebindFilters(pinterface: Long, platebindinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfRebindFilters(pinterface.toString(), platebindinfo.toString()) as Int).toUInt() else 0u

public actual fun PfRemoveFilterHandles(pinterface: Long, cfilters: UInt, pvhandles: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFilterHandles(pinterface.toString(), cfilters.toInt(), pvhandles.toString()) as Int).toUInt() else 0u

public actual fun PfRemoveFiltersFromInterface(ih: Long, cinfilters: UInt, pfiltin: Long, coutfilters: UInt, pfiltout: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfRemoveFiltersFromInterface(ih.toString(), cinfilters.toInt(), pfiltin.toString(), coutfilters.toInt(), pfiltout.toString()) as Int).toUInt() else 0u

public actual fun PfRemoveGlobalFilterFromInterface(pinterface: Long, gffilter: GLOBAL_FILTER): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfRemoveGlobalFilterFromInterface(pinterface.toString(), gffilter) as Int).toUInt() else 0u

public actual fun PfSetLogBuffer(pbbuffer: Long, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: Long, pdwlostentries: Long, pdwsizeused: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfSetLogBuffer(pbbuffer.toString(), dwsize.toInt(), dwthreshold.toInt(), dwentries.toInt(), pdwloggedentries.toString(), pdwlostentries.toString(), pdwsizeused.toString()) as Int).toUInt() else 0u

public actual fun PfTestPacket(pininterface: Long, poutinterface: Long, cbytes: UInt, pbpacket: Long, ppaction: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfTestPacket(pininterface.toString(), poutinterface.toString(), cbytes.toInt(), pbpacket.toString(), ppaction.toString()) as Int).toUInt() else 0u

public actual fun PfUnBindInterface(pinterface: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_PfUnBindInterface(pinterface.toString()) as Int).toUInt() else 0u

public actual fun RegisterInterfaceTimestampConfigChange(callback: PINTERFACE_TIMESTAMP_CONFIG_CHANGE_CALLBACK, callercontext: Long, notificationhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_RegisterInterfaceTimestampConfigChange(callback.toLong().toString(), callercontext.toString(), notificationhandle.toString()) as Int).toUInt() else 0u

public actual fun ResolveIpNetEntry2(row: Long, sourceaddress: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ResolveIpNetEntry2(row.toString(), sourceaddress.toString()) as Int).toUInt() else 0u

public actual fun ResolveNeighbor(networkaddress: Long, physicaladdress: Long, physicaladdresslength: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_ResolveNeighbor(networkaddress.toString(), physicaladdress.toString(), physicaladdresslength.toString()) as Int).toUInt() else 0u

public actual fun RestoreMediaSense(poverlapped: Long, lpdwenablecount: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_RestoreMediaSense(poverlapped.toString(), lpdwenablecount.toString()) as Int).toUInt() else 0u

public actual fun SendARP(destip: UInt, srcip: UInt, pmacaddr: Long, phyaddrlen: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SendARP(destip.toInt(), srcip.toInt(), pmacaddr.toString(), phyaddrlen.toString()) as Int).toUInt() else 0u

public actual fun SetCurrentThreadCompartmentId(compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentId(compartmentid.toInt()) as Int).toUInt() else 0u

public actual fun SetCurrentThreadCompartmentScope(compartmentscope: UInt): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetCurrentThreadCompartmentScope(compartmentscope.toInt()) as Int).toUInt() else 0u

public actual fun SetDnsSettings(settings: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetDnsSettings(settings.toString()) as Int).toUInt() else 0u

public actual fun SetIfEntry(pifrow: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetIfEntry(pifrow.toString()) as Int).toUInt() else 0u

public actual fun SetInterfaceDnsSettings(iface: GUID, settings: Long): WIN32_ERROR =
    0u

public actual fun SetIpForwardEntry(proute: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry(proute.toString()) as Int).toUInt() else 0u

public actual fun SetIpForwardEntry2(route: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetIpForwardEntry2(route.toString()) as Int).toUInt() else 0u

public actual fun SetIpInterfaceEntry(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetIpInterfaceEntry(row.toString()) as Int).toUInt() else 0u

public actual fun SetIpNetEntry(parpentry: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry(parpentry.toString()) as Int).toUInt() else 0u

public actual fun SetIpNetEntry2(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetIpNetEntry2(row.toString()) as Int).toUInt() else 0u

public actual fun SetIpStatistics(pipstats: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetIpStatistics(pipstats.toString()) as Int).toUInt() else 0u

public actual fun SetIpStatisticsEx(statistics: Long, family: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetIpStatisticsEx(statistics.toString(), family.toInt()) as Int).toUInt() else 0u

public actual fun SetIpTTL(nttl: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetIpTTL(nttl.toInt()) as Int).toUInt() else 0u

public actual fun SetJobCompartmentId(jobhandle: HANDLE, compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetJobCompartmentId(jobhandle.toString(), compartmentid.toInt()) as Int).toUInt() else 0u

public actual fun SetNetworkInformation(networkguid: Long, compartmentid: NET_IF_COMPARTMENT_ID, networkname: PCWSTR): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetNetworkInformation(networkguid.toString(), compartmentid.toInt(), networkname.toString()) as Int).toUInt() else 0u

public actual fun SetPerTcp6ConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetPerTcp6ConnectionEStats(row.toString(), estatstype, rw.toString(), rwversion.toInt(), rwsize.toInt(), offset.toInt()) as Int).toUInt() else 0u

public actual fun SetPerTcpConnectionEStats(row: Long, estatstype: TCP_ESTATS_TYPE, rw: Long, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetPerTcpConnectionEStats(row.toString(), estatstype, rw.toString(), rwversion.toInt(), rwsize.toInt(), offset.toInt()) as Int).toUInt() else 0u

public actual fun SetSessionCompartmentId(sessionid: UInt, compartmentid: NET_IF_COMPARTMENT_ID): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetSessionCompartmentId(sessionid.toInt(), compartmentid.toInt()) as Int).toUInt() else 0u

public actual fun SetTcpEntry(ptcprow: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetTcpEntry(ptcprow.toString()) as Int).toUInt() else 0u

public actual fun SetUnicastIpAddressEntry(row: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_SetUnicastIpAddressEntry(row.toString()) as Int).toUInt() else 0u

public actual fun UnenableRouter(poverlapped: Long, lpdwenablecount: Long): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_UnenableRouter(poverlapped.toString(), lpdwenablecount.toString()) as Int).toUInt() else 0u

public actual fun UnregisterInterfaceTimestampConfigChange(notificationhandle: HIFTIMESTAMPCHANGE) {
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        _windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_UnregisterInterfaceTimestampConfigChange(notificationhandle.toString())
    }
}

public actual fun if_indextoname(interfaceindex: UInt, interfacename: PSTR): PSTR =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_if_indextoname(interfaceindex.toInt(), interfacename.toString()) as String).toLong() else 0L

public actual fun if_nametoindex(interfacename: PCSTR): UInt =
    if (_windowsWin32NetworkmanagementIphelperNapiAddon != null) (_windowsWin32NetworkmanagementIphelperNapiAddon.windowssys_windows_win32_networkmanagement_iphelper_if_nametoindex(interfacename.toString()) as Int).toUInt() else 0u
